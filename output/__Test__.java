import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;
import org.antlr.runtime.tree.*;
import java.util.ArrayList;
import java.util.List;


public class __Test__ {
    public static void main(String args[]) throws Exception {
        whileLexer lex = new whileLexer(new ANTLRFileStream("/home/luna/github-classroom/test/Projet_TLC/output/__Test___input.txt", "UTF8"));
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
            NouvelArbre tree = (NouvelArbre) r.getTree();
            //System.out.println("arbre :" + tree.toStringTree());
            ArrayList<String> tab = new ArrayList<String>();
            MonVisiteur visitor = new AST_decore();
            visitor.visit(tree,tab);
            MonVisiteur validation = new ValidationCompilation();
            validation.visit(tree,tab);
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}