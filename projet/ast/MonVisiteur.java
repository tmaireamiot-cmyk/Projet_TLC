package projet.ast;
import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

public interface MonVisiteur {
   void visit(CommonTree node, ArrayList<String> tab);
}