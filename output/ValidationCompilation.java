import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.*;

// Fichier qui fait la validation du compilateur donc il utilise l'AST_decore
public class ValidationCompilation implements MonVisiteur {

    @Override
    public void visit(CommonTree node,ArrayList<String> tab) {
        NouvelArbre decoratedNode = (NouvelArbre) node;
        if("nom de fonction".equals(decoratedNode.getInformation())){
            System.out.println("nom de fonction = "+decoratedNode.getText());
            // Test si la fonction est définie plus d'une fois
            if (tab.contains(decoratedNode.getText()) && decoratedNode.getText()!="main") {
                System.out.println("Erreur la fonction " + decoratedNode.getText() + " est déjà définie");
                // Test si la fonction main est définie plus d'une fois
            } else if("main".equals(decoratedNode.getText()) && tab.contains("main")){
                System.out.println("Erreur il y a 2 fonctions main définies");
                // Test si il y a la fonction add
            }else {
                // Test du bon nombre de paramètres
                if("add".equals(decoratedNode.getText()) || "mul".equals(decoratedNode.getText()) || "sub".equals(decoratedNode.getText()) || "main".equals(decoratedNode.getText()) || "and".equals(decoratedNode.getText())){
                    //System.out.println(decoratedNode.getParent().getChild(1).getChild(0).getChild(0).getChild(1));
                    if(decoratedNode.getParent().getChild(1).getChild(0).getChild(0).getChild(0)==null || decoratedNode.getParent().getChild(1).getChild(0).getChild(0).getChild(1)==null){
                        System.out.println("Erreur il n'y a pas le bon nombre de paramètres pour la fonction "+decoratedNode.getText());
                    }
                }
                System.out.println("on ajoute au tableau :   "+decoratedNode.getText());
                tab.add(decoratedNode.getText());
            }
        }
        // Test de l'affectation multiple
        if("assignationVariableParent".equals(decoratedNode.getInformation())){
            if(decoratedNode.getChildren() != null) {
                if("assignationVariable".equals((((NouvelArbre) decoratedNode.getChild(0)).getInformation()))){
                    System.out.println("variable assignee = "+decoratedNode.getChild(0).getText());
                    if("assignationVariable".equals(((NouvelArbre) decoratedNode.getChild(1))) && "assignationVariable".equals((((NouvelArbre) decoratedNode.getChild(1)).getInformation()))){
                        System.out.println("Problème d'affectation multiple, trop de variables assignées");
                    }
                }
            //System.out.println("variable assignee = "+decoratedNode.getText());
            }
        }
        if("Sortie".equals(decoratedNode.getInformation())){
            if(decoratedNode.getChildren() != null) {
                if("ValeurSortie".equals((((NouvelArbre) decoratedNode.getChild(0)).getInformation()))){
                    System.out.println("la sortie est = "+decoratedNode.getChild(0).getText());
                    if(decoratedNode.getChild(1) != null && "ValeurSortie".equals((((NouvelArbre) decoratedNode.getChild(1)).getInformation()))){
                        System.out.println("la sortie est = "+decoratedNode.getChild(1).getText());
                    }
                }
            }
        }
            
        if("AppelFonctionDansFonction".equals(decoratedNode.getInformation())){
            if("add".equals(node.getText()) || "mul".equals(decoratedNode.getText()) || "sub".equals(decoratedNode.getText()) || "and".equals(decoratedNode.getText())){
                //System.out.println("le noeud enfant de la fonction appelee est " +node.getChild(0));
                System.out.println("le noeud enfant du parent de la fonction appelee est " +node.getParent().getChild(1).getChild(0).getChild(0));
                if(node.getParent().getChild(1).getChild(0).getChild(0)==null || node.getParent().getChild(1).getChild(0).getChild(1)==null){
                    System.out.println("Pas assez de paramètres pour la fonction "+node.getText()+" appelée dans une des fonctions");
                }
            }
        }

        
        if (node.getChildren() != null) {
            for (Object child : node.getChildren()) {
                visit((CommonTree) child,tab);
            }
        }
        
    }
}