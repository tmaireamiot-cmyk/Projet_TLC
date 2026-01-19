package projet.tac;

import java.util.HashSet;
import java.util.Set;
import projet.tac.Code3Addr;
import projet.tac.Instruction3Addr;

public class TraducteurC_new {

    public static String genererCodeC(Code3Addr code) {

        StringBuilder c = new StringBuilder();

        // --- EN-TÊTE C ---
        c.append("#include <stdio.h>\n");
        c.append("#include <stdlib.h>\n\n");

        c.append("typedef struct Node {\n");
        c.append("    int value;\n");
        c.append("    struct Node* left;\n");
        c.append("    struct Node* right;\n");
        c.append("} Node;\n\n");

        c.append("Node* nil() {\n");
        c.append("    return NULL;\n");
        c.append("}\n\n");

        c.append("Node* cons(Node* left, Node* right) {\n");
        c.append("    Node* n = malloc(sizeof(Node));\n");
        c.append("    n->left = left;\n");
        c.append("    n->right = right;\n");
        c.append("    return n;\n");
        c.append("}\n\n");

        c.append("Node* hd(Node* x) {\n");
        c.append("    return x ? x->left : NULL;\n");
        c.append("}\n\n");

        c.append("Node* tl(Node* x) {\n");
        c.append("    return x ? x->right : NULL;\n");
        c.append("}\n\n");

        // --- DÉCLARATIONS DES FONCTIONS (forward declarations) ---
        Set<String> functionNames = extractFunctionNames(code);
        for (String funcName : functionNames) {
            if (!"main".equals(funcName)) {
                c.append("Node* ").append(funcName).append("(Node* param);\n");
            }
        }
        c.append("\n");

        // --- DÉFINITIONS DES FONCTIONS (sauf main) ---
        for (String funcName : functionNames) {
            if (!"main".equals(funcName)) {
                c.append(generateFunctionCode(code, funcName));
            }
        }

        // --- DÉBUT DU MAIN ---
        c.append("int main() {\n");
        c.append(generateFunctionBody(code, "main"));
        c.append("    return 0;\n");
        c.append("}\n"); 
        return c.toString();
    }

    private static Set<String> extractFunctionNames(Code3Addr code) {
        Set<String> names = new HashSet<>();
        for (Instruction3Addr instr : code.getInstructions()) {
            if (instr.getOp() == Instruction3Addr.Op.PLACE) {
                String label = instr.getArg1();
                if (label != null && label.startsWith("F_")) {
                    names.add(label.substring(2)); // Enlever "F_"
                }
            }
        }
        return names;
    }

    private static String generateFunctionCode(Code3Addr code, String funcName) {
        StringBuilder func = new StringBuilder();
        func.append("Node* ").append(funcName).append("(Node* param) {\n");
        func.append(generateFunctionBody(code, funcName));
        func.append("}\n\n");
        return func.toString();
    }

    private static String generateFunctionBody(Code3Addr code, String funcName) {
        StringBuilder body = new StringBuilder();

        boolean inFunction = false;
        boolean varsDeclarationsAdded = false;

        for (int i = 0; i < code.getInstructions().size(); i++) {
            Instruction3Addr instr = code.getInstructions().get(i);

            // Vérifier si on entre dans la fonction
            if (instr.getOp() == Instruction3Addr.Op.PLACE && 
                ("F_" + funcName).equals(instr.getArg1())) {
                inFunction = true;
                // Ajouter déclaration de param et variables locales
                body.append("    Node* param = NULL;\n");
                body.append("    Node* Result = NULL;\n");
                // Autres variables communes
                body.append("    Node* temp = NULL;\n");
                varsDeclarationsAdded = true;
                continue;
            }

            // Si on est dans une autre fonction, arrêter
            if (inFunction && instr.getOp() == Instruction3Addr.Op.PLACE && 
                instr.getArg1() != null && instr.getArg1().startsWith("F_") &&
                !("F_" + funcName).equals(instr.getArg1())) {
                break;
            }

            // Si on est dans la fonction, traduire les instructions
            if (inFunction) {
                if (instr.getOp() == Instruction3Addr.Op.RETURN) {
                    String retVar = instr.getArg1();
                    if (retVar != null) {
                        body.append("    return ").append(retVar).append(";\n");
                    } else {
                        body.append("    return NULL;\n");
                    }
                    break; // Fin de la fonction
                }

                translateInstruction(instr, body, "    ");
            }
        }

        return body.toString();
    }

    private static void translateInstruction(Instruction3Addr instr, StringBuilder c, String indent) {
        switch (instr.getOp()) {
            case PLACE:
                if (instr.getArg1() != null && !instr.getArg1().startsWith("F_")) {
                    c.append(instr.getArg1()).append(":\n");
                }
                break;

            case GOTO:
                c.append(indent).append("goto ").append(instr.getArg1()).append(";\n");
                break;

            case COPY:
                c.append(indent).append(instr.getArg1())
                 .append(" = ").append(instr.getArg2()).append(";\n");
                break;

            case NIL:
                c.append(indent).append(instr.getArg1()).append(" = nil();\n");
                break;

            case CONS:
                c.append(indent).append(instr.getArg1())
                 .append(" = cons(").append(instr.getArg2())
                 .append(", ").append(instr.getArg3()).append(");\n");
                break;

            case HD:
                c.append(indent).append(instr.getArg1())
                 .append(" = hd(").append(instr.getArg2()).append(");\n");
                break;

            case TL:
                c.append(indent).append(instr.getArg1())
                 .append(" = tl(").append(instr.getArg2()).append(");\n");
                break;

            case CALL:
                // arg1 = variable de destination
                // arg2 = nom de la fonction
                // argsList = arguments
                c.append(indent).append(instr.getArg1())
                 .append(" = ").append(instr.getArg2()).append("(");
                if (instr.getArgsList() != null && !instr.getArgsList().isEmpty()) {
                    c.append(instr.getArgsList().get(0));
                }
                c.append(");\n");
                break;

            case RETURN:
                break; // Géré dans generateFunctionBody

            case IF:
                // IF est généralement suivi de deux GOTO
                break;
        }
    }
}
