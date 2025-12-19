import java.util.HashMap;
import java.util.Stack;
import org.antlr.runtime.tree.CommonTree;
// Importez votre interface si elle est nécessaire :
// import vos.packages.MonVisiteur; 
// Importez votre Parser pour accéder aux constantes de nœuds (remplacez par le nom réel) :
// import vos.packages.whileParser; 

// --- (Définitions de SymbolEntry et SymbolTable ici, non répétées pour la concision) ---

public class SymbolTableBuilder { // Implémente MonVisiteur

    private final SymbolTable symbolTable = new SymbolTable();
    private boolean hasErrors = false;
    
    // Définitions de types de nœuds (À AJUSTER SELON VOTRE GRAMMAIRE ANTLR !)
    // J'utilise ici des entiers, vous devez les remplacer par les constantes whileParser.XYZ
    private static final int FUNCTION_DEF = 100; // Type du nœud racine de la définition de fonction
    private static final int ID = 101;           // Type du jeton identifiant
    private static final int READ_STMT = 102;    // Type du nœud de la commande 'read'
    private static final int WRITE_STMT = 103;   // Type du nœud de la commande 'write'
    private static final int ASSIGN_STMT = 104;  // Type du nœud de l'affectation ':= '
    private static final int TRUE_FALSE = 105;   // Type des littéraux 'true'/'false' pour la vérif de type

    // --- CONSTRUCTEUR ET ACCESSEURS ---
    public SymbolTableBuilder(int funcType, int idType, int readType, int writeType, int assignType, int boolLiteralType) {
        // Initialisation des types avec les constantes réelles de whileParser
        // Ces champs sont définis en haut du fichier pour la clarté.
        // NOTE : J'utilise ici des variables pour simuler l'accès aux constantes de whileParser
        // Dans votre code, vous devriez utiliser directement whileParser.FUNCTION, etc.
    }
    
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
    
    public boolean hasErrors() {
        return hasErrors;
    }

    // --- MÉTHODE DE VISITE ---
    
    // NOTE : Si vous implémentez l'interface MonVisiteur, assurez-vous de correspondre à sa signature.
    public void visit(CommonTree node) {
        if (node == null) return;

        int nodeType = node.getType();
        String nodeText = node.getText();
        
        // --- 1. LOGIQUE DE GESTION DE PORTÉE (FUNCTION_DEF) ---
        if (nodeType == FUNCTION_DEF) { // whileParser.FUNCTION_DEF ou le type de votre nœud de fonction
            // Le premier enfant est généralement l'ID de la fonction
            CommonTree funcIdNode = (CommonTree) node.getChild(0);
            String functionName = funcIdNode.getText();
            
            // 1.1 Enregistrer la fonction dans la portée GLOBALE (avant d'entrer dans la portée de la fonction)
            if (!symbolTable.insert(functionName, "FUNCTION")) {
                 System.err.println("ERREUR SÉMANTIQUE : Fonction '" + functionName + "' déjà définie.");
                 hasErrors = true;
            }
            
            // 1.2 Créer une nouvelle portée pour le corps de la fonction
            symbolTable.enterScope();
            System.out.println("-> Entrée de la portée : " + functionName);
        }

        // --- 2. LOGIQUE D'ENREGISTREMENT ET DE VÉRIFICATION ---
        
        // 2.1 Déclarations implicites via READ
        if (nodeType == READ_STMT) { // whileParser.READ_STMT
            // 'read' peut lire plusieurs variables (Op1, Op2 dans votre exemple)
            if (node.getChildren() != null) {
                for (Object child : node.getChildren()) {
                    CommonTree idNode = (CommonTree) child;
                    String varName = idNode.getText();
                    
                    // Dans While, les variables lues sont souvent traitées comme BOOLEAN ou LIST
                    // Ici, nous supposons qu'elles sont booléennes pour le contexte 'main'
                    if (!symbolTable.insert(varName, "BOOLEAN")) { // Type à ajuster selon les spécifications de While
                        System.err.println("ERREUR SÉMANTIQUE : Variable '" + varName + "' déjà définie dans cette portée.");
                        hasErrors = true;
                    } else {
                        System.out.println("-> Symbole enregistré (READ) : " + varName);
                    }
                }
            }
        }
        
        // 2.2 Déclarations/Utilisations via ASSIGNMENT
        if (nodeType == ASSIGN_STMT) { // whileParser.ASSIGN_STMT
            CommonTree targetIdNode = (CommonTree) node.getChild(0);
            String varName = targetIdNode.getText();
            
            // Vérification/Insertion de la variable cible
            if (symbolTable.lookup(varName) == null) {
                // Si la variable n'est pas trouvée, c'est une déclaration implicite
                // Dans 'main', 'Result' est déclaré ici
                symbolTable.insert(varName, "BOOLEAN"); // Type déduit du littéral (false/true)
                System.out.println("-> Symbole enregistré (ASSIGN) : " + varName);
            }
            
            // NOTE: L'ANALYSE DE TYPAGE (vérifier que l'expression à droite correspond au type de la variable)
            // se fait ici également, mais n'est pas implémentée dans ce code simple.
        }

        // 2.3 Utilisation via WRITE (Vérification de l'existence)
        if (nodeType == WRITE_STMT) { // whileParser.WRITE_STMT
            if (node.getChildren() != null) {
                for (Object child : node.getChildren()) {
                    CommonTree idNode = (CommonTree) child;
                    String varName = idNode.getText();
                    
                    // La variable X de f1 sera détectée ici comme non définie
                    if (symbolTable.lookup(varName) == null) {
                        System.err.println("ERREUR SÉMANTIQUE : Symbole '" + varName + "' non défini (WRITE).");
                        hasErrors = true;
                    } else {
                        System.out.println("-> Symbole utilisé (WRITE) : " + varName);
                    }
                }
            }
        }
        
        // 2.4 Utilisation d'identifiants dans les expressions (comme dans les conditions 'if')
        if (nodeType == ID && node.getParent() != null && 
            node.getParent().getType() != FUNCTION_DEF && // N'est pas la définition de la fonction elle-même
            node.getParent().getType() != READ_STMT &&    // N'est pas dans un 'read' (déclaration)
            node.getParent().getType() != ASSIGN_STMT) {  // N'est pas la cible d'une affectation (déclaration)
            
            // Cet ID est une utilisation pure (ex: 'if (not Op1)')
            String idName = nodeText;
            if (symbolTable.lookup(idName) == null) {
                System.err.println("ERREUR SÉMANTIQUE : Symbole '" + idName + "' non défini (USAGE).");
                hasErrors = true;
            }
        }
        
        // --- 3. PARCOURS RÉCURSIF (visite des enfants) ---
        if (node.getChildren() != null) {
            for (Object child : node.getChildren()) {
                visit((CommonTree) child);
            }
        }
        
        // --- 4. LOGIQUE DE SORTIE DE PORTÉE (FUNCTION_DEF) ---
        if (nodeType == FUNCTION_DEF) { // whileParser.FUNCTION_DEF
            symbolTable.exitScope();
            System.out.println("<- Sortie de la portée de la fonction.");
        }
    }
}