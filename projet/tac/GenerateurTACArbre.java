package projet.tac;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;

import projet.symbol.Variable;
import projet.tac.Instruction3Addr.Op;

public class GenerateurTACArbre {

    private final Code3Addr code;
    private int labelCounter = 0;
    private int tempCounter  = 0;

    public GenerateurTACArbre(Code3Addr code) {
        this.code = code;
    }

    private String newLabel() {
        return "L" + (labelCounter++);
    }

    private String newTemp() {
        String t = "t" + (tempCounter++);
        code.getSymbols().define(new Variable(t, "temp"));
        return t;
    }

    // ========= ENTRY POINT =========
    public void generer(CommonTree root) {
        if (root == null) return;

        // D'abord, générer le TAC pour toutes les fonctions (sauf main)
        if (root.getChildren() != null) {
            for (Object child : root.getChildren()) {
                CommonTree childTree = (CommonTree) child;
                // Chercher les FUNCTION (pas main)
                if ("FUNCTION".equals(childTree.getText())) {
                    String funcName = childTree.getChild(0).getText();
                    if (!"main".equals(funcName)) {
                        genFunction(childTree);
                    }
                }
            }
        }

        // Puis générer le TAC pour le main
        CommonTree mainFunc = null;
        if (root.getChildren() != null) {
            for (Object child : root.getChildren()) {
                CommonTree childTree = (CommonTree) child;
                if ("FUNCTION".equals(childTree.getText())) {
                    String funcName = childTree.getChild(0).getText();
                    if ("main".equals(funcName)) {
                        mainFunc = childTree;
                        break;
                    }
                }
            }
        }

        if (mainFunc != null) {
            genFunction(mainFunc);
        } else {
            // Fallback : chercher COMMANDS directement
            CommonTree commands = findFirstByText(root, "COMMANDS");
            if (commands != null) {
                genCommands(commands);
            }
        }
    }

    private void genFunction(CommonTree funcNode) {
        // (FUNCTION name (DEFINITION (INPUT ...) (COMMANDS ...) (OUTPUT ...)))
        if (funcNode.getChildCount() < 2) return;

        String funcName = funcNode.getChild(0).getText();
        CommonTree defNode = (CommonTree) funcNode.getChild(1);
        if (defNode == null) return;

        // Ajouter label de début de fonction
        code.add(new Instruction3Addr(Instruction3Addr.Op.PLACE, "F_" + funcName, null, null));

        // Récupérer les paramètres (INPUT), commandes et sorties (OUTPUT)
        CommonTree inputNode = findFirstByText(defNode, "INPUT");
        CommonTree commandsNode = findFirstByText(defNode, "COMMANDS");
        CommonTree outputNode = findFirstByText(defNode, "OUTPUT");

        // Traiter les commandes de la fonction
        if (commandsNode != null) {
            genCommands(commandsNode);
        }

        // Ajouter RETURN (les sorties sont dans les registres nommés)
        if (outputNode != null && outputNode.getChildCount() > 0) {
            String retVar = outputNode.getChild(0).getText();
            code.add(new Instruction3Addr(Instruction3Addr.Op.RETURN, retVar, null, null));
        } else {
            code.add(new Instruction3Addr(Instruction3Addr.Op.RETURN, null, null, null));
        }
    }

    private CommonTree findFirstByText(CommonTree node, String text) {
        if (node == null) return null;
        if (text.equals(node.getText())) return node;

        if (node.getChildren() != null) {
            for (Object o : node.getChildren()) {
                CommonTree r = findFirstByText((CommonTree) o, text);
                if (r != null) return r;
            }
        }
        return null;
    }

    // ========= WALK / DISPATCH =========
    private void walk(CommonTree n) {
        if (n == null) return;

        if ("ASSIGN".equals(n.getText())) {
            genAssign(n);
            return;
        }

        if ("COMMAND".equals(n.getText())) {
            genCommand(n);
            return;
        }

        if (n.getChildren() != null) {
            for (Object c : n.getChildren()) {
                walk((CommonTree) c);
            }
        }
    }

    // ========= COMMANDS =========
    private void genCommands(CommonTree commandsNode) {
        if (commandsNode == null || commandsNode.getChildren() == null) return;

        for (Object c : commandsNode.getChildren()) {
            walk((CommonTree) c);
        }
    }

    private void genCommand(CommonTree commandNode) {
        String kw = commandNode.getChild(0).getText();

        switch (kw) {
            case "if":
                genIf(commandNode);
                break;
            case "for":
                genFor(commandNode);
                break;
            case "while":
                genWhile(commandNode);
                break;
            default:
                throw new RuntimeException("Commande non supportée: " + commandNode.toStringTree());
        }
    }

    // ========= ASSIGN =========
    private void genAssign(CommonTree assignNode) {
        // (ASSIGN (VARIABLES Y) (EXPRESSIONS NIL))
        String varName = assignNode.getChild(0).getChild(0).getText();
        CommonTree exprs = (CommonTree) assignNode.getChild(1);

        String t = genAnyExpr(exprs);

        if (code.getSymbols().lookup(varName) == null) {
            code.getSymbols().define(new Variable(varName, "unknown"));
        }
        code.add(new Instruction3Addr(Instruction3Addr.Op.COPY, varName, t, null));
    }

    // ========= IF =========
    private void genIf(CommonTree cmd) {
        CommonTree exprNode = (CommonTree) cmd.getChild(1);
        CommonTree thenNode = (CommonTree) cmd.getChild(2);
        CommonTree elseNode = (cmd.getChildCount() >= 4) ? (CommonTree) cmd.getChild(3) : null;

        String cond = genAnyExpr(exprNode);

        String Lthen = newLabel();
        String Lelse = newLabel();
        String Lend  = newLabel();

        code.add(new Instruction3Addr(Instruction3Addr.Op.IF, cond, null, null));
        code.add(new Instruction3Addr(Instruction3Addr.Op.GOTO, Lthen, null, null));
        code.add(new Instruction3Addr(Instruction3Addr.Op.GOTO, Lelse, null, null));

        code.add(new Instruction3Addr(Instruction3Addr.Op.PLACE, Lthen, null, null));
        genCommands(thenNode);
        code.add(new Instruction3Addr(Instruction3Addr.Op.GOTO, Lend, null, null));

        code.add(new Instruction3Addr(Instruction3Addr.Op.PLACE, Lelse, null, null));
        if (elseNode != null) genCommands(elseNode);

        code.add(new Instruction3Addr(Instruction3Addr.Op.PLACE, Lend, null, null));
    }

    // ========= WHILE =========
    private void genWhile(CommonTree cmd) {
        CommonTree exprNode = (CommonTree) cmd.getChild(1);
        CommonTree bodyNode = (CommonTree) cmd.getChild(2);

        String Ltest = newLabel();
        String Lbody = newLabel();
        String Lend  = newLabel();

        code.add(new Instruction3Addr(Instruction3Addr.Op.PLACE, Ltest, null, null));
        String cond = genAnyExpr(exprNode);


        code.add(new Instruction3Addr(Instruction3Addr.Op.IF, cond, null, null));
        code.add(new Instruction3Addr(Instruction3Addr.Op.GOTO, Lbody, null, null));
        code.add(new Instruction3Addr(Instruction3Addr.Op.GOTO, Lend, null, null));

        code.add(new Instruction3Addr(Instruction3Addr.Op.PLACE, Lbody, null, null));
        genCommands(bodyNode);
        code.add(new Instruction3Addr(Instruction3Addr.Op.GOTO, Ltest, null, null));

        code.add(new Instruction3Addr(Instruction3Addr.Op.PLACE, Lend, null, null));
    }

    // ========= FOR =========
    private void genFor(CommonTree cmd) {
        CommonTree exprNode = (CommonTree) cmd.getChild(1);
        CommonTree bodyNode = (CommonTree) cmd.getChild(2);

        String tlist = newTemp();
        String e = genAnyExpr(exprNode);
        code.add(new Instruction3Addr(Instruction3Addr.Op.COPY, tlist, e, null));

        String Ltest = newLabel();
        String Lbody = newLabel();
        String Lend  = newLabel();

        code.add(new Instruction3Addr(Instruction3Addr.Op.PLACE, Ltest, null, null));
        code.add(new Instruction3Addr(Instruction3Addr.Op.IF, tlist, null, null));
        code.add(new Instruction3Addr(Instruction3Addr.Op.GOTO, Lbody, null, null));
        code.add(new Instruction3Addr(Instruction3Addr.Op.GOTO, Lend, null, null));

        code.add(new Instruction3Addr(Instruction3Addr.Op.PLACE, Lbody, null, null));
        genCommands(bodyNode);

        code.add(new Instruction3Addr(Instruction3Addr.Op.TL, tlist, tlist, null));
        code.add(new Instruction3Addr(Instruction3Addr.Op.GOTO, Ltest, null, null));

        code.add(new Instruction3Addr(Instruction3Addr.Op.PLACE, Lend, null, null));
    }

    // ========= EXPRESSIONS =========

    private String genAnyExpr(CommonTree node) {
        if (node == null) throw new RuntimeException("Expression null");
    
        String txt = node.getText();
    
        // Wrapper: (EXPRESSIONS e)
        if ("EXPRESSIONS".equals(txt)) {
            if (node.getChildCount() != 1) {
                throw new RuntimeException("EXPRESSIONS multiples non gérées: " + node.toStringTree());
            }
            return genAnyExpr((CommonTree) node.getChild(0));
        }
    
        // Wrapper: (EXPR_PARENT e)
        if ("EXPR_PARENT".equals(txt)) {
            if (node.getChildCount() != 1) {
                throw new RuntimeException("EXPR_PARENT mal formé: " + node.toStringTree());
            }
            return genAnyExpr((CommonTree) node.getChild(0));
        }
    
        // nil (ton AST réel met NIL)
        if ("NIL".equals(txt) || "nil".equals(txt)) {
            String t = newTemp();
            code.add(new Instruction3Addr(Instruction3Addr.Op.NIL, t, null, null));
            return t;
        }
    
        // Référence variable: (VAR X)
        if ("VAR".equals(txt) && node.getChildCount() == 1) {
            String name = node.getChild(0).getText();
            if (code.getSymbols().lookup(name) == null) {
                code.getSymbols().define(new Variable(name, "unknown"));
            }
            return name;
        }
    
        // CONS: (CONS a b)
        if ("CONS".equals(txt)) {
            if (node.getChildCount() != 2) {
                throw new RuntimeException("CONS attend 2 args: " + node.toStringTree());
            }
            String a = genAnyExpr((CommonTree) node.getChild(0));
            String b = genAnyExpr((CommonTree) node.getChild(1));
            String t = newTemp();
            code.add(new Instruction3Addr(Instruction3Addr.Op.CONS, t, a, b));
            return t;
        }
    
        // HD: (HD a)
        if ("HD".equals(txt)) {
            if (node.getChildCount() != 1) {
                throw new RuntimeException("HD attend 1 arg: " + node.toStringTree());
            }
            String a = genAnyExpr((CommonTree) node.getChild(0));
            String t = newTemp();
            code.add(new Instruction3Addr(Instruction3Addr.Op.HD, t, a, null));
            return t;
        }
    
        // TL: (TL a)
        if ("TL".equals(txt)) {
            if (node.getChildCount() != 1) {
                throw new RuntimeException("TL attend 1 arg: " + node.toStringTree());
            }
            String a = genAnyExpr((CommonTree) node.getChild(0));
            String t = newTemp();
            code.add(new Instruction3Addr(Instruction3Addr.Op.TL, t, a, null));
            return t;
        }

        if ("FUNC".equals(txt)) {
            if (node.getChildCount() < 1) {
                throw new RuntimeException("FUNC mal formé: " + node.toStringTree());
            }

            String funcName = node.getChild(0).getText();
            List<String> argsTemps = new ArrayList<>();
            for (int i = 1; i < node.getChildCount(); i++) {
                argsTemps.add(genAnyExpr((CommonTree) node.getChild(i)));
            }

            String t = newTemp();
            code.add(new Instruction3Addr(Instruction3Addr.Op.CALL, t, funcName, String.join(",", argsTemps)));
            return t;
        }
    
        // Feuille : si jamais une variable arrive sans wrapper
        if (node.getChildCount() == 0) {
            if (code.getSymbols().lookup(txt) == null) {
                code.getSymbols().define(new Variable(txt, "unknown"));
            }
            return txt;
        }
    
        throw new RuntimeException("Expression non supportée: " + node.toStringTree());
    }
    
}
   