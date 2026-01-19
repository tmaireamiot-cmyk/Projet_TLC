package projet.symbol;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SymbolTable {
    private final Map<String, Symbol> globalScope; // Portée globale
    private final Deque<Map<String, Symbol>> localScopes; // Pile pour les portées locales

    public SymbolTable() {
        this.globalScope = new HashMap<>();
        this.localScopes = new ArrayDeque<>();
    }

    //nouveau scope local
    public void enterScope() {
        localScopes.push(new HashMap<>());
    }
    //suppression du dernier scope local
    public void exitScope() {
        if (!localScopes.isEmpty()) {
            localScopes.pop();
        } else {
            throw new IllegalStateException("No local scope to exit.");
        }
    }

    //Ajouter un symbole dans un scope
    public void define(Symbol symbol) {
        if (!localScopes.isEmpty()) {
            localScopes.peek().put(symbol.getName(), symbol);
        } else {
            globalScope.put(symbol.getName(), symbol);
        }
    }

    //Chercher un symbole dans un scope
    public Symbol lookup(String name) {
        // Rechercher d'abord dans les portées locales
        for (Map<String, Symbol> scope : localScopes) {
            if (scope.containsKey(name)) {
                return scope.get(name);
            }
        }
        // Rechercher dans la portée globale
        return globalScope.get(name);
    }

    @Override
    public String toString() {
        return "Global Scope: " + globalScope + "\nLocal Scopes: " + localScopes;
    }

    public Set<String> getAllVars() {
        return globalScope.keySet();
    }
}
