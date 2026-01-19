package projet.symbol;

/*
 * Test pour la fonction suivante en while 
 * 
 * function main :
	read x, y %
  	z := (cons x y);
  	w := (hd z);
	%
	write w

 */

public class Main_ST {
    public static void main(String[] args) {
        // Création de la table des symboles
        SymbolTable symbolTable = new SymbolTable();

        // Définir la fonction "main"
        Function mainFunction = new Function("main");
        symbolTable.define(mainFunction);

        // Ajout des paramètres à la fonction "main"
        Variable param1 = new Variable("x", "binary_tree");
        Variable param2 = new Variable("y", "binary_tree");
        mainFunction.addParameter(param1);
        mainFunction.addParameter(param2);

        // Ajouter une valeur de retour à la fonction "main"
        Variable returnValue = new Variable("w", "binary_tree");
        mainFunction.addReturnValue(returnValue);

        // Entrer dans la portée locale de "main"
        symbolTable.enterScope();

        // Ajouter des variables locales
        Variable localVar1 = new Variable("z", "binary_tree");
        symbolTable.define(localVar1);
        mainFunction.addLocalVariable(localVar1);

        // Chercher des variables et fonctions
        System.out.println("Recherche de la fonction 'main' : " + symbolTable.lookup("main"));
        System.out.println("Recherche de la variable 'z' : " + symbolTable.lookup("z"));
        System.out.println("Recherche d'une variable non déclarée 'a' : " + symbolTable.lookup("a"));

        System.out.println(symbolTable);
        
        // Sortir de la portée locale
        System.out.println("-----Sorti du local scope-----");
        symbolTable.exitScope();
        
        System.out.println(symbolTable);

        // Vérifier que les variables locales ne sont plus accessibles
        System.out.println("Recherche de la variable locale 'z' après sortie : " + symbolTable.lookup("z"));
    }
}
