import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.*;

public class Visitor implements MonVisiteur {

    @Override
    public void visit(CommonTree node) {

        System.out.println("Node type = " + node.getType() +
                           ", text = " + node.getText());

        if (node.getChildren() != null) {
            for (Object child : node.getChildren()) {
                visit((CommonTree) child);
            }
        }
    }
}