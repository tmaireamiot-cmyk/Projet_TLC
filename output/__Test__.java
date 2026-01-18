import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;
import org.antlr.runtime.tree.*;
import java.util.ArrayList;
import java.util.List;


public class __Test__ {
    public static void main(String args[]) throws Exception {
        if (args.length == 0) {
            System.err.println("Usage: java __Test__ <file.while>");
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

            SymbolTable symbols = new SymbolTable();
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