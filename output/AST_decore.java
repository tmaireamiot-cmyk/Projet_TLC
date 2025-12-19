import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.*;

public class AST_decore implements MonVisiteur {

    @Override
    public void visit(CommonTree node,ArrayList<String> tab) {
        

        NouvelArbre noeud_decore = (NouvelArbre) node;

        if (node.getType() == 16) {
            if (noeud_decore.getChild(0).getType() == 29) {
                NouvelArbre noeuf_enfant=(NouvelArbre) noeud_decore.getChild(0);
                noeuf_enfant.setInformation("nom de fonction" );
             
            }
        }

        if (node.getType() == 19) {
            if (node.getChildren() != null) {
                if (noeud_decore.getChild(0).getType() == 32) {
                    NouvelArbre noeuf_enfant=(NouvelArbre) noeud_decore.getChild(0);
                    noeuf_enfant.setInformation("parametre" );

                }
            }
        }

        if (node.getType() == 4 && node.getParent().getType() == 7) {
            if (node.getChildren() != null) {
                if (noeud_decore.getChild(0).getType() == 33) {
                    if (node.getChildren() != null) {
                        if (noeud_decore.getChild(0).getChild(0).getType() == 32) {
                            NouvelArbre noeuf_enfant=(NouvelArbre) noeud_decore.getChild(0).getChild(0);
                            noeuf_enfant.setInformation("assignationVariable" );
                            NouvelArbre noeuf_parent=(NouvelArbre) noeud_decore.getChild(0);
                            noeuf_parent.setInformation("assignationVariableParent");
                        }
                        if (noeud_decore.getChild(0).getChild(1)!=null && noeud_decore.getChild(0).getChild(1).getType() == 32) {
                            NouvelArbre noeuf_enfant=(NouvelArbre) noeud_decore.getChild(0).getChild(1);
                            noeuf_enfant.setInformation("assignationVariable");
                            NouvelArbre noeuf_parent=(NouvelArbre) noeud_decore.getChild(0);
                            noeuf_parent.setInformation("assignationVariableParent");
                        }
                    }
                }
            }
        }
        if (node.getType() == 25) {
            if (node.getChildren() != null) {
                if (noeud_decore.getChild(0).getType() == 32) {
                    NouvelArbre noeuf_enfant=(NouvelArbre) noeud_decore.getChild(0);
                    noeuf_enfant.setInformation("ValeurSortie");
                    NouvelArbre noeuf_parent=(NouvelArbre) noeud_decore;
                    noeuf_parent.setInformation("Sortie");
                }
                if (noeud_decore.getChild(1)!=null && noeud_decore.getChild(1).getType() == 32) {
                    NouvelArbre noeuf_enfant=(NouvelArbre) noeud_decore.getChild(1);
                    noeuf_enfant.setInformation("ValeurSortie");
                    NouvelArbre noeuf_parent=(NouvelArbre) noeud_decore;
                    noeuf_parent.setInformation("Sortie");
                }
            }
                
        }

        if (node.getType() == 12) {
            if (node.getChildren() != null) {
                if (noeud_decore.getChild(0).getType()==14) {
                    if (node.getChildren() != null) {
                        if (noeud_decore.getChild(0).getChild(0).getType() == 15) {
                            if (node.getChildren() != null) {
                                if (noeud_decore.getChild(0).getChild(0).getChild(0).getType() == 29) {
                                    NouvelArbre noeuf_enfant=(NouvelArbre) noeud_decore.getChild(0).getChild(0).getChild(0);
                                    noeuf_enfant.setInformation("AppelFonctionDansFonction");
                                }
                            }
                        }
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
