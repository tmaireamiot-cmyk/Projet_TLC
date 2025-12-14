import org.antlr.runtime.tree.CommonTree;

public class SimpleVisitor {

    public void visit(CommonTree node) {

        if (node == null) return;

        // Action du visiteur
        System.out.println("Noeud : " + node.getText());

        // Visiter les enfants
        for (int i = 0; i < node.getChildCount(); i++) {
            CommonTree child = (CommonTree) node.getChild(i);
            visit(child);
        }
    }
}