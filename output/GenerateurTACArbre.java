import org.antlr.runtime.tree.CommonTree;

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
        code.getSymbols().declare(t);
        return t;
    }

    // ========= ENTRY POINT =========
    public void generer(CommonTree root) {
        if (root == null) return;

        CommonTree commands = findFirstByText(root, "COMMANDS");
        if (commands == null) {
            walk(root);
            return;
        }
        genCommands(commands);
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
            case "foreach":
                genForEach(commandNode);
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

        code.getSymbols().declare(varName);
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

    // ========= FOREACH =========
    private void genForEach(CommonTree cmd) {

        String X = cmd.getChild(1).getText();          // variable foreach
        CommonTree exprNode = (CommonTree) cmd.getChild(2); // expression après "in"
        CommonTree bodyNode = (CommonTree) cmd.getChild(3); // corps

    
        String v = newTemp();
        String e = genAnyExpr(exprNode);
        code.add(new Instruction3Addr(Instruction3Addr.Op.COPY, v, e, null));

        String Ltest = newLabel();
        String Lbody = newLabel();
        String Lend  = newLabel();

        // Ltest:
        code.add(new Instruction3Addr(Instruction3Addr.Op.PLACE, Ltest, null, null));

        // if v goto Lbody else goto Lend
        code.add(new Instruction3Addr(Instruction3Addr.Op.IF, v, null, null));
        code.add(new Instruction3Addr(Instruction3Addr.Op.GOTO, Lbody, null, null));
        code.add(new Instruction3Addr(Instruction3Addr.Op.GOTO, Lend, null, null));

        // Lbody:
        code.add(new Instruction3Addr(Instruction3Addr.Op.PLACE, Lbody, null, null));

        // X = hd(v)
        String head = newTemp();
        code.add(new Instruction3Addr(Instruction3Addr.Op.HD, head, v, null));

        code.getSymbols().declare(X);
        code.add(new Instruction3Addr(Instruction3Addr.Op.COPY, X, head, null));

        // corps
        genCommands(bodyNode);

        // v = tl(v)
        code.add(new Instruction3Addr(Instruction3Addr.Op.TL, v, v, null));

        // goto Ltest
        code.add(new Instruction3Addr(Instruction3Addr.Op.GOTO, Ltest, null, null));

        // Lend:
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
            code.getSymbols().declare(name);
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
    
        // Feuille : si jamais une variable arrive sans wrapper
        if (node.getChildCount() == 0) {
            code.getSymbols().declare(txt);
            return txt;
        }
    
        throw new RuntimeException("Expression non supportée: " + node.toStringTree());
    }
    
}
   