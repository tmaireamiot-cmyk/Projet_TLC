package projet.symbol;

import org.antlr.runtime.tree.*;
import projet.ast.whileParser;
import projet.ast.NouvelArbre;
import java.util.ArrayList;
import java.util.List;

public class Visitor_SymbolTable {

    private final SymbolTable symbolTable = new SymbolTable();
    private boolean valid = true;

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public boolean visit(Object node) {
        if (node == null) {
            System.err.println("Erreur : AST non généré.");
            return false;
        }

        CommonTree tree = (CommonTree) node;
        String token = tree.toString();
        //System.out.println("Visite du nœud: " + token + ", type: " + tree.getType());

        switch (token) {
            case "FUNC":
                //System.out.println("Traitement d'une fonction...");
                String funcName = tree.getChild(0).toString(); // Nom de la fonction
                CommonTree defNode = (CommonTree) tree.getChild(1); // Nœud DEF
                CommonTree paramNode = getFirstChildByType(defNode, whileParser.INPUT);
                if (paramNode == null) paramNode = getFirstChildByType(defNode, whileParser.INPUTSUB);
                CommonTree commandsNode = getFirstChildByType(defNode, whileParser.COMMANDS);
                CommonTree outputNode   = getFirstChildByType(defNode, whileParser.OUTPUT);

                if (paramNode == null) {
                    System.err.println("Erreur : Paramètres non définis pour la fonction " + funcName);
                    valid = false;
                }
                if (outputNode == null) {
                    System.err.println("Erreur : Sortie non définie pour la fonction " + funcName);
                    valid = false;
                }

                //vérification des doublons dans les paramètres
                List<Variable> params = new ArrayList<>();
                List<String> paramNames = new ArrayList<>(); 
                boolean duplicateFound = false;

                if (paramNode != null) {
                    for (int i = 0; i < paramNode.getChildCount(); i++) {
                        String paramName = paramNode.getChild(i).toString();

                        if (paramNames.contains(paramName)) {
                            System.err.println("Erreur : Paramètre '" + paramName + "' est défini plusieurs fois dans la fonction '" + funcName + "'.");
                            valid = false;
                            duplicateFound = true;
                        } else {
                            paramNames.add(paramName); // Ajouter le nom pour le suivi
                            params.add(new Variable(paramName, "unknown")); // Ajouter la variable
                        }
                    }
                }

                if (duplicateFound) {
                    break;
                }
                List<Variable> outputs = outputNode != null ? collectVariables(outputNode) : new ArrayList<>();
                
                // Ajouter la fonction  à la table des symboles
                Function definedFunc = new Function(funcName, params, outputs);
                symbolTable.define(definedFunc);
                // Annoter le nœud AST avec le symbole de fonction
                if (tree instanceof NouvelArbre) {
                    ((NouvelArbre) tree).setSymbol(definedFunc);
                }
                
                // Entrer dans le scope de la fonction
                enterScope();

                // Définir et annoter les paramètres dans le scope de la fonction
                if (paramNode != null) {
                        for (int i = 0; i < paramNode.getChildCount(); i++) {
                            CommonTree child = (CommonTree) paramNode.getChild(i);
                            // collect variable names under this child
                            List<Variable> foundVars = collectVariables(child);
                            for (Variable paramVar : foundVars) {
                                // declared line if available
                                CommonTree varNode = findVariableNode(child, paramVar.getName());
                                if (varNode != null && varNode.getToken() != null) paramVar.setDeclaredLine(varNode.getToken().getLine());
                                if (varNode instanceof NouvelArbre) {
                                    ((NouvelArbre) varNode).setSymbol(paramVar);
                                }
                                if (symbolTable.lookup(paramVar.getName()) == null) {
                                    symbolTable.define(paramVar);
                                }
                            }
                        }
                }
                
                if (commandsNode != null) {
                    visit(commandsNode);
                }

                // Quitter le scope
                exitScope();
            	break;
            case "ASSIGN":
                //System.out.println("Traitement d'une assignation...");
                CommonTree left = (	CommonTree) tree.getChild(0); // Variables à gauche
                CommonTree right = (CommonTree) tree.getChild(1); // Expressions à droite

                if (left == null || right == null) {
                    System.err.println("Erreur : Assignation invalide, un côté est null.");
                    valid = false;
                    break;
                }
                // collect all variable declarations under the left-hand side
                List<Variable> varsFound = collectVariables(left);
                for (Variable newVar : varsFound) {
                    CommonTree varNode = findVariableNode(left, newVar.getName());
                    if (varNode != null && varNode.getToken() != null) newVar.setDeclaredLine(varNode.getToken().getLine());
                    if (varNode instanceof NouvelArbre) {
                        ((NouvelArbre) varNode).setSymbol(newVar);
                    }
                    if (symbolTable.lookup(newVar.getName()) == null) {
                        symbolTable.define(newVar);
                    }
                }
                checkAssignment(tree);
                visit(right);
                break;
            case "EXPRESSION":
                CommonTree exprNode = (CommonTree) tree.getChild(0); 
                String exprType = visitAndGetType(exprNode); 
                System.out.println("Le type de l'expression est : " + exprType);
                break;
            case "VARIABLE":
            	String varName = tree.getChild(0).toString();
                Symbol found = symbolTable.lookup(varName);
                if (found == null) {
                    System.out.println("Erreur : variable utilisée sans être définie : " + varName);
                    valid = false;
                } else {
                    if (found instanceof Variable) {
                        ((Variable) found).setUsed(true);
                    }
                    if (tree instanceof NouvelArbre) {
                        ((NouvelArbre) tree).setSymbol(found);
                    }
                }
                break;

            case "CALL":
                String calledFuncName = tree.getChild(0).toString();
                Function func = (Function) symbolTable.lookup(calledFuncName);
                if (func == null) {
                    System.out.println("Erreur : fonction appelée non définie : " + calledFuncName);
                    valid = false;
                } else {
                    int expectedParams = func.getParameters().size();
                    int actualParams = tree.getChildCount() - 1; // Exclure le nom de la fonction
                    if (expectedParams != actualParams) {
                        System.out.println("Erreur : mauvais nombre de paramètres pour " + calledFuncName);
                        valid = false;
                    }
                    for (int i = 1; i < tree.getChildCount(); i++) { // À partir du 1er enfant (les arguments)
                        CommonTree paramNode1 = (CommonTree) tree.getChild(i);
                        String argType = visitAndGetType(paramNode1); // Récupère le type de l'argument
                        Variable expectedParam = func.getParameters().get(i - 1);
                        if (!argType.equals(expectedParam.getType())) {
                            System.out.println("Erreur : type incompatible pour l'argument " + (i) + " de la fonction " + calledFuncName);
                            valid = false;
                        }
                    }
                }
                break;
            case "CALL_SYM":
                String symbolName = tree.getChild(0).toString();
                if (symbolName.equals("true") || symbolName.equals("false")) {
                    // Ne pas traiter true/false comme des fonctions, c'est un littéral booléen
                    break;
                }
                Symbol symbol = symbolTable.lookup(symbolName);
                if (symbol == null) {
                    System.out.println("Erreur : fonction appelée non définie : " + symbolName);
                    valid = false;
                } else if (!(symbol instanceof Function)) {
                    System.out.println("Erreur : '" + symbolName + "' n'est pas une fonction.");
                    valid = false;
                } else {
                    Function func1 = (Function) symbol;
                    int expectedParams = func1.getParameters().size();
                    int actualParams = tree.getChildCount() - 1; // Exclure le nom de la fonction
                    if (expectedParams != actualParams) {
                        System.out.println("Erreur : mauvais nombre de paramètres pour " + symbolName);
                        valid = false;
                    }
                }
                break;
            case "SYMBOL":
                String symbolName1 = tree.getChild(0).toString();
                if (symbolTable.lookup(symbolName1) == null) {
                    System.out.println("Erreur : symbole non défini : " + symbolName1);
                    valid = false;
                }
                break;
            case "CONS":
            case "LIST":
            case "HD":
            case "TL":
                break;
            case "IF":
                visit(tree.getChild(0)); // if
                visit(tree.getChild(1)); // then
                if (tree.getChildCount() > 2) {
                    visit(tree.getChild(2)); // else ? 
                }
                break;
            case "WHILE":
            case "FOR":
                visit(tree.getChild(0)); // Condition 
                visit(tree.getChild(1)); // Commande(s)
                break;
            case "FOREACH":
                visit(tree.getChild(0)); // Variable de la boucle
                visit(tree.getChild(1)); // Expression de l'itération
                visit(tree.getChild(2)); // Commande(s)
                break;
            default:
                if (tree.getChildCount() == 0) {
                    System.out.println("Nœud sans enfants détecté : " + token);
                } else {
                    //System.out.println("Visite d'un nœud générique : " + token);
                    for (int i = 0; i < tree.getChildCount(); i++) {
                        visit(tree.getChild(i));
                    }
                }
                break;
        }

        return valid;
    }

    private List<Variable> collectVariables(CommonTree tree) {
        List<Variable> variables = new ArrayList<>();
        collectVarsRec(tree, variables);
        return variables;
    }

    // Recursively find VARIABLE or VAR nodes and collect variable objects
    private void collectVarsRec(CommonTree node, List<Variable> variables) {
        if (node == null) return;
        int t = node.getType();
        if (t == whileParser.VARIABLE) {
            // child 0 is the identifier token
            if (node.getChildCount() > 0 && node.getChild(0) != null) {
                String varName = node.getChild(0).toString();
                variables.add(new Variable(varName, "unknown"));
            }
            return;
        }
        if (t == whileParser.VAR) {
            variables.add(new Variable(node.toString(), "unknown"));
            return;
        }
        if (node.getChildCount() == 0) return;
        for (int i = 0; i < node.getChildCount(); i++) {
            Object childObj = node.getChild(i);
            if (childObj == null) continue;
            if (!(childObj instanceof CommonTree)) continue;
            collectVarsRec((CommonTree) childObj, variables);
        }
    }

    // Find VARIABLE node for a given name inside a subtree (for annotation)
    private CommonTree findVariableNode(CommonTree node, String name) {
        if (node == null) return null;
        int t = node.getType();
        if (t == whileParser.VARIABLE) {
            String varName = node.getChild(0).toString();
            if (varName.equals(name)) return node;
            return null;
        }
        if (t == whileParser.VAR) {
            if (node.toString().equals(name)) return node;
            return null;
        }
        for (int i = 0; i < node.getChildCount(); i++) {
            CommonTree found = findVariableNode((CommonTree) node.getChild(i), name);
            if (found != null) return found;
        }
        return null;
    }
    

    private void enterScope() {
        symbolTable.enterScope();
    }

    private void exitScope() {
        symbolTable.exitScope();
    }

    public void checkAssignment(CommonTree assignmentNode) {
        // Collecter les variables sur la partie gauche
        CommonTree lhs = (CommonTree) assignmentNode.getChild(0);
        List<Variable> lhsVars = collectVariables(lhs);
        if (lhsVars.isEmpty()) {
            System.err.println("Erreur : Assignation sans variable valide.");
            valid = false;
            return;
        }
        // Pour l'instant, vérifier la première variable (on peut étendre pour toutes)
        Variable var = (Variable) symbolTable.lookup(lhsVars.get(0).getName());
        if (var == null) {
            System.err.println("Erreur : Variable " + lhsVars.get(0).getName() + " non définie.");
            valid = false;
            return;
        }

        CommonTree exprNode = (CommonTree) assignmentNode.getChild(1);
        String exprType = visitAndGetType(exprNode);

        if (!exprType.equals("unknown")) {
            if (var.getType().equals("unknown")) {
                var.setType(exprType); // Assigner le type de l'expression à la variable
            } else if (!var.getType().equals(exprType)) {
                // Si les types sont incompatibles
                System.out.println("Erreur : Assignation d'un " + exprType + " à une variable de type " + var.getType());
                valid = false;
            }
        }
    }

    private String visitAndGetType(CommonTree exprNode) {
        if (exprNode == null) return "unknown";
        int t = exprNode.getType();
        switch (t) {
            case whileParser.CONS:
                return "Tree";  // Cons crée un arbre
            case whileParser.VARIABLE:
                if (exprNode.getChildCount() > 0 && exprNode.getChild(0) != null) {
                    String varName = exprNode.getChild(0).toString();
                    Variable var = (Variable) symbolTable.lookup(varName);
                    if (var != null) {
                        return var.getType();
                    } else {
                        System.err.println("Erreur : variable non définie : " + varName);
                        valid = false;
                        return "unknown";
                    }
                }
                return "unknown";
            case whileParser.EXPRS:
            case whileParser.EXPR_PARENT:
                if (exprNode.getChildCount() > 0 && exprNode.getChild(0) != null)
                    return visitAndGetType((CommonTree) exprNode.getChild(0));
                return "unknown";
            default:
                return "unknown";
        }
    }

    private CommonTree getFirstChildByText(CommonTree node, String text) {
        if (node == null || node.getChildren() == null) return null;
        for (Object o : node.getChildren()) {
            CommonTree c = (CommonTree) o;
            if (text.equals(c.getText())) return c;
        }
        return null;
    }

    private CommonTree getFirstChildByType(CommonTree node, int type) {
        if (node == null || node.getChildren() == null) return null;
        for (Object o : node.getChildren()) {
            if (!(o instanceof CommonTree)) continue;
            CommonTree c = (CommonTree) o;
            if (c.getType() == type) return c;
        }
        return null;
    }

}
