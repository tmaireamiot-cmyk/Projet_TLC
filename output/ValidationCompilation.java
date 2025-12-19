import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.*;

// Fichier qui fait la validation du compilateur donc il utilise l'AST_decore
public class ValidationCompilation implements MonVisiteur {

    @Override
    public void visit(CommonTree node,ArrayList<String> tab) {
        NouvelArbre noeud_decore = (NouvelArbre) node;
        if("nom de fonction".equals(noeud_decore.getInformation())){
            // Test si la fonction est définie plus d'une fois
            if (tab.contains(noeud_decore.getText()) && noeud_decore.getText()!="main") {
                System.out.println("Erreur la fonction " + noeud_decore.getText() + " est déjà définie");
                // Test si la fonction main est définie plus d'une fois
            } else if("main".equals(noeud_decore.getText()) && tab.contains("main")){
                System.out.println("Erreur il y a 2 fonctions main définies");
            }else {
                // Test du bon nombre de paramètres
                if("add".equals(noeud_decore.getText()) || "mul".equals(noeud_decore.getText()) || "sub".equals(noeud_decore.getText()) || "main".equals(noeud_decore.getText()) || "and".equals(noeud_decore.getText())){
                    if(noeud_decore.getParent().getChild(1).getChild(0).getChild(0)==null || noeud_decore.getParent().getChild(1).getChild(0).getChild(1)==null){
                        System.out.println("Erreur il n'y a pas le bon nombre de paramètres pour la fonction "+noeud_decore.getText());
                    }
                }
                tab.add(noeud_decore.getText());
            }
        }

        // Test de l'affectation multiple si il y a bien une variable a gauche de l'assignation
        if("assignationVariableParent".equals(noeud_decore.getInformation())){
            if(noeud_decore.getChildren() != null) {
                if("assignationVariable".equals((((NouvelArbre) noeud_decore.getChild(0)).getInformation()))){
                    // Si il y a une 2e assignation 
                    if(noeud_decore.getChild(1)!=null && noeud_decore.getChild(1).getText()!=null){
                        System.out.println("Problème d'affectation multiple, trop de variables assignées");
                    }
                }
            }
        }

        // Verifier le bon nombre de sorties d'une fonction
        if("Sortie".equals(noeud_decore.getInformation())){
            if(noeud_decore.getChildren() != null) {
                if("ValeurSortie".equals((((NouvelArbre) noeud_decore.getChild(0)).getInformation()))){
                    if(noeud_decore.getChild(1) != null && "ValeurSortie".equals((((NouvelArbre) noeud_decore.getChild(1)).getInformation()))){
                        System.out.println("Il y a trop de sorties en retour");
                    }
                }
            }
        }
        
        // Verifier que la fonction appelée a le bon nombre de paramètres
        if("AppelFonctionDansFonction".equals(noeud_decore.getInformation())){
            if("add".equals(node.getText()) || "mul".equals(noeud_decore.getText()) || "sub".equals(noeud_decore.getText()) || "and".equals(noeud_decore.getText())){
                if(noeud_decore.getParent()!=null){
                    int nb_enfants= noeud_decore.getParent().getChildCount();
                    if(nb_enfants<3){
                        System.out.println("Pas assez de paramètres pour la fonction "+node.getText()+" appelée dans une des fonctions");
                    }
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