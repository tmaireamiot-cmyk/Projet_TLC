import java.util.HashMap;
import java.util.Stack;
import org.antlr.runtime.tree.CommonTree;
public class SymbolTableBuilder {

    private final SymbolTable symbolTable = new SymbolTable();
 
    private final int FUNCTION; 
    private final int VAR; 
    private HashMap<String, String> table;

  
    public SymbolTableBuilder(int function, int variable) {
        this.table = new HashMap<>();
        this.FUNCTION = function;
        this.VAR = variable;
        
    }
    
    public void visit(CommonTree node) {
        if (node == null) return;

        int nodeType = node.getType();
        String nodeText = node.getText();
        
        if (nodeType == FUNCTION) {
            
        } else if (nodeType == VAR) {
        }
        
        
        
        
        if (node.getChildren() != null) {
            for (Object child : node.getChildren()) {
                visit((CommonTree) child);
            }
        }
    }
    public void chercher_function(){

    }
}