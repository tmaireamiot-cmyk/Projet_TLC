import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class __Test2__ {

    public static void main(String[] args) {
        try {
            String inputString =
                "function and :\n" +
                "read Op1, Op %\n" +
                "if ( not Op1 ) then\n" +
                "Result := false\n" +
                "else\n" +
                "if ( not Op ) then\n" +
                "Result := false\n" +
                "else\n" +
                "Result := true\n" +
                "fi\n" +
                "fi %\n" +
                "write Result\n" +
                "function f1 :\n" +
                "read %\n" +
                "nop %\n" +
                "write x";

            ANTLRStringStream input = new ANTLRStringStream(inputString);

            whileLexer lex = new whileLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lex);
            
            System.out.println(tokens.toString());
            whileParser parser = new whileParser(tokens);

            System.out.println("Parsing...");
            whileParser.program_return result = parser.program();

            CommonTree tree = (CommonTree) result.getTree();

            System.out.println("CommonTree: " + tree.toStringTree());

        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}


