
public class TraducteurC {

    public static String genererCodeC(Code3Addr code) {

        StringBuilder c = new StringBuilder();

        //EN-TÊTE C
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

        // --- DÉBUT DU MAIN ---
        c.append("int main() {\n");

        // Déclarations des variables
        SymbolTable symbols = code.getSymbols();
        for (String var : symbols.getAllVars()) {
            c.append("    Node* ").append(var).append(" = NULL;\n");
        }
        c.append("\n");
        boolean hasReturn = false;

        // --- Trad TAC vers C ---
        for (int i = 0; i < code.getInstructions().size(); i++) {
            Instruction3Addr instr = code.getInstructions().get(i);
        
            switch (instr.getOp()) {

                case PLACE:
                    c.append(instr.getArg1()).append(":\n");
                    break;

                case GOTO:
                    c.append("    goto ").append(instr.getArg1()).append(";\n");
                    break;

                case IF:
                    Instruction3Addr gotoTrue = code.getInstructions().get(i + 1);
                    
                    Instruction3Addr gotoFalse = code.getInstructions().get(i + 2);
                    
                    String cond = instr.getArg1();
                    String Ltrue = gotoTrue.getArg1();
                    String Lfalse = gotoFalse.getArg1();
                    
                    c.append("    if (").append(cond).append(") goto ")
                    .append(Ltrue).append("; else goto ").append(Lfalse).append(";\n");
                    
                    i += 2;
                    break;

                case COPY:
                    c.append("    ").append(instr.getArg1())
                     .append(" = ").append(instr.getArg2()).append(";\n");
                    break;

                case NIL:
                    c.append("    ").append(instr.getArg1()).append(" = nil();\n");
                    break;

                case CONS:
                    c.append("    ").append(instr.getArg1())
                     .append(" = cons(").append(instr.getArg2())
                     .append(", ").append(instr.getArg3()).append(");\n");
                    break;

                case HD:
                    c.append("    ").append(instr.getArg1())
                     .append(" = hd(").append(instr.getArg2()).append(");\n");
                    break;

                case TL:
                    c.append("    ").append(instr.getArg1())
                     .append(" = tl(").append(instr.getArg2()).append(");\n");
                    break;

                case RETURN:
                    c.append("    return 0;\n");
                    hasReturn = true;
                    break;
            }
        }
        if (!hasReturn) {
            c.append("    return 0;\n");
        }
        c.append("}\n"); 
        return c.toString();
    }
}
