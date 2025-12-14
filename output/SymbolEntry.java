import java.util.HashMap;
import java.util.Stack;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.Token;

class SymbolEntry {
    public final String name;
    public final String type;
    public final int scopeLevel;

    public SymbolEntry(String name, String type, int scopeLevel) {
        this.name = name;
        this.type = type;
        this.scopeLevel = scopeLevel;
    }

    @Override
    public String toString() {
        return "Symbole{" + name + ", Type=" + type + ", Scope=" + scopeLevel + "}";
    }
}

class SymbolTable {
    private Stack<HashMap<String, SymbolEntry>> scopeStack = new Stack<>();

    public SymbolTable() {
        enterScope();
    }

    public void enterScope() {
        scopeStack.push(new HashMap<>());
    }

    public void exitScope() {
        if (scopeStack.size() > 1) { 
            scopeStack.pop();
        } else {
            System.err.println("Erreur: Tentative de sortir de la portée globale.");
        }
    }

    public boolean insert(String name, String type) {
        HashMap<String, SymbolEntry> currentScope = scopeStack.peek();
        if (currentScope.containsKey(name)) {
            return false; 
        }
        SymbolEntry entry = new SymbolEntry(name, type, scopeStack.size() - 1);
        currentScope.put(name, entry);
        return true;
    }

    public SymbolEntry lookup(String name) {
        for (int i = scopeStack.size() - 1; i >= 0; i--) {
            if (scopeStack.get(i).containsKey(name)) {
                return scopeStack.get(i).get(name);
            }
        }
        return null;
    }

    public void printTable() {
        System.out.println("\n--- Contenu de la Table des Symboles ---");
        for (int i = 0; i < scopeStack.size(); i++) {
            System.out.println("Portée Niveau " + i + ":");
            for (SymbolEntry entry : scopeStack.get(i).values()) {
                System.out.println("  " + entry);
            }
        }
        System.out.println("----------------------------------------");
    }
}