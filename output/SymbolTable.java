import java.util.HashMap;

public class SymbolTable {

    private HashMap<String, String> types = new HashMap<>();

    public String getType(String var) {
        return types.getOrDefault(var, "Node*");
    }

    public void declare(String var) {
        types.put(var, "Node*");
    }

    public Iterable<String> getAllVars() {
        return types.keySet();
    }
}
