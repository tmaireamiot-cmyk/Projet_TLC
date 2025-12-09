import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;
import org.antlr.runtime.tree.*;


public class __Test__ {
    public static void main(String args[]) throws Exception {
        whileLexer lex = new whileLexer(new ANTLRFileStream("C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        whileParser g = new whileParser(tokens);
        try {
            whileParser.program_return  r = g.program();

            CommonTree tree = (CommonTree) r.getTree();
            System.out.println("arbre :" + tree.toStringTree());
            /**MonVisiteur visitor = new Visitor();
            visitor.visit(tree);**/
            System.out.println("Arbre de syntaxe abstraite (AST) :\n" + tree.toStringTree());
            
            int FUNC_TYPE = whileParser.FUNCTION;     // 12 : Définition de fonction
            int READ_TYPE = whileParser.COMMAND;      // 5 : Type général pour les commandes. 
                                                      // C'est un pari, car l'AST peut utiliser COMMANDS ou un autre nœud.
                                                      // Si vous avez un nœud spécifique pour la lecture, utilisez-le.
            int WRITE_TYPE = whileParser.COMMAND;     // 5 : Type général pour les commandes.
            int ASSIGN_TYPE = whileParser.T__31;      // 31 : Le jeton ':=' (si c'est le nœud racine de l'affectation)
                                                      // OU si vous avez une règle 'ASSIGNMENT' dans votre grammaire, utilisez son ID.
            
            // Jeton (Lexer Rule)
            int ID_TYPE = whileParser.SYMBOL;         // 21 : Identifiant (variable ou nom de fonction)
            
            // Nous n'avons pas besoin de BOOL_LITERAL si nous ne faisons que la Table des Symboles
            // (nous passons une constante factice pour respecter le nombre d'arguments).
            int DUMMY_LITERAL = whileParser.EXPRESSION; // 9 : Type d'expression pour le placeholder

            // 2. Instancier le constructeur de la table en passant les arguments requis
            SymbolTableBuilder symbolBuilder = new SymbolTableBuilder(
                FUNC_TYPE, ID_TYPE, READ_TYPE, WRITE_TYPE, ASSIGN_TYPE, DUMMY_LITERAL
            );
            symbolBuilder.visit(tree); 

            symbolBuilder.getSymbolTable().printTable();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}