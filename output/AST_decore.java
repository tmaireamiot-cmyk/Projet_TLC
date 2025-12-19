import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.*;

public class AST_decore implements MonVisiteur {

    @Override
    public void visit(CommonTree node,ArrayList<String> tab) {
        

        NouvelArbre decoratedNode = (NouvelArbre) node;
        System.out.println("noeud  "+node.getType()+node.getText());

        if (node.getType() == 12) {
            if (decoratedNode.getChild(0).getType() == 21) {
                NouvelArbre noeuf_enfant=(NouvelArbre) decoratedNode.getChild(0);
                noeuf_enfant.setInformation("nom de fonction" );
             
            }
        }

        if (node.getType() == 14) {
            if (node.getChildren() != null) {
                if (decoratedNode.getChild(0).getType() == 23) {
                    NouvelArbre noeuf_enfant=(NouvelArbre) decoratedNode.getChild(0);
                    noeuf_enfant.setInformation("parametre" );

                }
            }
        }

        if (node.getType() == 22 && node.getParent().getType() == 6) {
            if (node.getChildren() != null) {
                if (decoratedNode.getChild(0).getType() == 24) {
                    if (node.getChildren() != null) {
                        System.out.println(decoratedNode.getChild(0).getChild(0));
                        if (decoratedNode.getChild(0).getChild(0).getType() == 23) {
                            NouvelArbre noeuf_enfant=(NouvelArbre) decoratedNode.getChild(0).getChild(0);
                            noeuf_enfant.setInformation("assignationVariable" );
                            NouvelArbre noeuf_parent=(NouvelArbre) decoratedNode.getChild(0);
                            noeuf_parent.setInformation("assignationVariableParent");
                        }
                        if (decoratedNode.getChild(0).getChild(1)!=null && decoratedNode.getChild(0).getChild(1).getType() == 23) {
                            NouvelArbre noeuf_enfant=(NouvelArbre) decoratedNode.getChild(0).getChild(0);
                            noeuf_enfant.setInformation("assignationVariable");
                            NouvelArbre noeuf_parent=(NouvelArbre) decoratedNode.getChild(0);
                            noeuf_parent.setInformation("assignationVariableParent");
                        }
                    }
                }
            }
        }
        if (node.getType() == 18) {
            if (node.getChildren() != null) {
                if (decoratedNode.getChild(0).getType() == 18) {
                    if (node.getChildren() != null) {
                        System.out.println(decoratedNode.getChild(0).getChild(0));
                        if (decoratedNode.getChild(0).getChild(0).getType() == 23) {
                            NouvelArbre noeuf_enfant=(NouvelArbre) decoratedNode.getChild(0).getChild(0);
                            noeuf_enfant.setInformation("ValeurSortie");
                            NouvelArbre noeuf_parent=(NouvelArbre) decoratedNode.getChild(0);
                            noeuf_parent.setInformation("Sortie");
                        }
                        if (decoratedNode.getChild(0).getChild(1)!=null && decoratedNode.getChild(0).getChild(1).getType() == 23) {
                            NouvelArbre noeuf_enfant=(NouvelArbre) decoratedNode.getChild(0).getChild(1);
                            noeuf_enfant.setInformation("ValeurSortie");
                            NouvelArbre noeuf_parent=(NouvelArbre) decoratedNode.getChild(0);
                            noeuf_parent.setInformation("Sortie");
                        }
                    }
                }
            }
        }

        if (node.getType() == 10) {
            if (node.getChildren() != null) {
                if (decoratedNode.getChild(0).getType() == 9) {
                    if (node.getChildren() != null) {
                        System.out.println("ca rentre bien ici"+decoratedNode.getChild(0).getChild(0));
                        if (decoratedNode.getChild(0).getChild(0).getType() == 8) {
                            System.out.println("ca rentre bien ici  2"+decoratedNode.getChild(0).getChild(0));
                            if (node.getChildren() != null) {
                                if (decoratedNode.getChild(0).getChild(0).getChild(0).getType() == 8) {
                                    if (node.getChildren() != null) {
                                        if (decoratedNode.getChild(0).getChild(0).getChild(0).getChild(0).getType() == 21) {
                                            System.out.println("c une expr      :    "+decoratedNode.getChild(0).getChild(0).getChild(0).getChild(0));
                                            NouvelArbre noeuf_enfant=(NouvelArbre) decoratedNode.getChild(0).getChild(0).getChild(0).getChild(0);
                                            noeuf_enfant.setInformation("AppelFonctionDansFonction");
                                        }
                                    }
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
