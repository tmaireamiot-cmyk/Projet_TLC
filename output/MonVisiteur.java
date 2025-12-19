import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.*;
import java.util.ArrayList;
import java.util.List;

interface MonVisiteur {
   void visit(CommonTree node,ArrayList<String> tab);
}