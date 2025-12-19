import java.util.HashMap;
import java.util.Stack;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.Token; // Pour récupérer le type du nœud
// import vos.packages.whileParser; // Assurez-vous d'importer la classe du Parser ANTLR
// import vos.packages.MonVisiteur; // L'interface que vous avez définie

/**
 * Représente une entrée dans la Table des Symboles.
 */
class SymbolEntry {
    public final String name;
    public final String type; // Ex: "int", "list", "function"
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

/**
 * Gère les portées (scopes) en utilisant une pile de HashMaps.
 */
class SymbolTable {
    private Stack<HashMap<String, SymbolEntry>> scopeStack = new Stack<>();

    public SymbolTable() {
        // Initialiser la portée globale
        enterScope();
    }

    public void enterScope() {
        scopeStack.push(new HashMap<>());
    }

    public void exitScope() {
        // Vérification de sécurité pour ne pas retirer la portée globale
        if (scopeStack.size() > 1) { 
            scopeStack.pop();
        } else {
            System.err.println("Erreur: Tentative de sortir de la portée globale.");
        }
    }

    /**
     * Insère un symbole dans la portée actuelle.
     * @return true si l'insertion est réussie, false si double déclaration.
     */
    public boolean insert(String name, String type) {
        HashMap<String, SymbolEntry> currentScope = scopeStack.peek();
        if (currentScope.containsKey(name)) {
            return false; // Symbole déjà défini dans cette portée
        }
        SymbolEntry entry = new SymbolEntry(name, type, scopeStack.size() - 1);
        currentScope.put(name, entry);
        return true;
    }

    /**
     * Recherche un symbole en remontant les portées.
     * @return L'entrée du symbole trouvée ou null si non trouvée.
     */
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
        // Imprimer toutes les portées pour le débogage
        for (int i = 0; i < scopeStack.size(); i++) {
            System.out.println("Portée Niveau " + i + ":");
            for (SymbolEntry entry : scopeStack.get(i).values()) {
                System.out.println("  " + entry);
            }
        }
        System.out.println("----------------------------------------");
    }
}