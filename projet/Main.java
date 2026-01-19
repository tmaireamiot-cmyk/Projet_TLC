package projet;

import java.util.ArrayList;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;

import projet.ast.*;
import projet.symbol.*;
import projet.tac.*;


public class Main {
    public static void main(String args[]) throws Exception {
        if (args.length == 0) {
            System.err.println("Usage: java Main <file.while>");
            return;
        }
        whileLexer lex = new whileLexer(new ANTLRFileStream(args[0], "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        whileParser g = new whileParser(tokens);
        CommonTreeAdaptor adaptor = new CommonTreeAdaptor() {
            @Override
            public Object create(Token payload) {
                return new NouvelArbre(payload); 
            }
        };
        g.setTreeAdaptor(adaptor);
        try {
            whileParser.program_return  r = g.program();
            CommonTree tree = (CommonTree) r.getTree();
            System.out.println(tree.toStringTree());
            //System.out.println("arbre :" + tree.toStringTree());
            ArrayList<String> tab = new ArrayList<String>();
            MonVisiteur visitor = new AST_decore();
            visitor.visit(tree,tab);
            //MonVisiteur validation = new ValidationCompilation();
            //validation.visit(tree,tab);

            projet.symbol.Visitor_SymbolTable symVisitor = new projet.symbol.Visitor_SymbolTable();
            boolean ok = symVisitor.visit(tree);
            if (!ok) {
                System.err.println("Erreurs sémantiques détectées — arrêt de la compilation.");
                return;
            }
            // récupérer la SymbolTable remplie
            projet.symbol.SymbolTable symbols = symVisitor.getSymbolTable();

            // (optionnel) lancer un TypeChecker / ValidationCompilation qui lit l'AST décoré
            // ValidationCompilation val = new ValidationCompilation();
            // if (!val.visit(tree)) { System.err.println("Validation failed"); return; }

            Code3Addr tac = new Code3Addr(symbols);

            GenerateurTACArbre gen = new GenerateurTACArbre(tac);
            gen.generer(tree);   

            System.out.println("=== TAC généré ===");
            tac.print();

            String codeC = TraducteurC.genererCodeC(tac);
            System.out.println("=== CODE C ===");
            System.out.println(codeC);
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}