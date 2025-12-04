// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g 2025-12-04 17:55:57
 package antlr; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class whileParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "FUNCTION", "DEFINITION", "INPUT", "INPUTSUB", "OUTPUT", "COMMANDS", "COMMAND", "VARS", "EXPRS", "EXPRESSION", "EXPRBASE", "LEXPR", "NOP", "VARIABLES", "EXPRESSIONS", "VAR", "IF", "MAJ", "MIN", "DEC", "VARIABLE", "SYMBOL", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'if'", "'then'", "'else'", "'fi'", "'while'", "'do'", "'od'", "'for'", "'foreach'", "'in'", "'nil'", "'('", "'list'", "')'", "'cons'", "'hd'", "'tl'", "'=?'"
    };
    public static final int EOF=-1;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int PROGRAM=4;
    public static final int FUNCTION=5;
    public static final int DEFINITION=6;
    public static final int INPUT=7;
    public static final int INPUTSUB=8;
    public static final int OUTPUT=9;
    public static final int COMMANDS=10;
    public static final int COMMAND=11;
    public static final int VARS=12;
    public static final int EXPRS=13;
    public static final int EXPRESSION=14;
    public static final int EXPRBASE=15;
    public static final int LEXPR=16;
    public static final int NOP=17;
    public static final int VARIABLES=18;
    public static final int EXPRESSIONS=19;
    public static final int VAR=20;
    public static final int IF=21;
    public static final int MAJ=22;
    public static final int MIN=23;
    public static final int DEC=24;
    public static final int VARIABLE=25;
    public static final int SYMBOL=26;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "synpred8_while", "lexpr", "synpred15_while", "definition", 
        "exprbase_symbol", "exprbase_variable", "synpred7_while", "command", 
        "input", "output", "synpred9_while", "exprbase_hd", "synpred17_while", 
        "exprbase_list", "exprbase_cons", "expression", "command_for", "synpred16_while", 
        "inputsub", "exprbase_symbol2", "synpred22_while", "exprbase_compare", 
        "command_nop", "exprbase_nil", "command_var", "command_foreach", 
        "synpred1_while", "command_while", "synpred2_while", "vars", "program", 
        "synpred4_while", "function", "exprs", "synpred6_while", "synpred11_while", 
        "synpred18_while", "synpred19_while", "synpred12_while", "exprbase", 
        "synpred10_while", "command_if", "synpred20_while", "synpred5_while", 
        "commands", "synpred3_while", "synpred13_while", "synpred21_while", 
        "exprbase_tl", "synpred14_while"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false, false, false, false, false, false, false, false, false, 
            false, true, false
    };

     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public whileParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public whileParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public whileParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return whileParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:45:1: program : ( function )+ -> ^( PROGRAM ( function )+ ) ;
    public final whileParser.program_return program() throws RecognitionException {
        whileParser.program_return retval = new whileParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        whileParser.function_return function1 = null;


        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(45, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:45:9: ( ( function )+ -> ^( PROGRAM ( function )+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:45:11: ( function )+
            {
            dbg.location(45,11);
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:45:11: ( function )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==27) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:0:0: function
            	    {
            	    dbg.location(45,11);
            	    pushFollow(FOLLOW_function_in_program203);
            	    function1=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function.add(function1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}



            // AST REWRITE
            // elements: function
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 45:21: -> ^( PROGRAM ( function )+ )
            {
                dbg.location(45,24);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:45:24: ^( PROGRAM ( function )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(45,26);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                dbg.location(45,34);
                if ( !(stream_function.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_function.hasNext() ) {
                    dbg.location(45,34);
                    adaptor.addChild(root_1, stream_function.nextTree());

                }
                stream_function.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(46, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "program"

    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:47:1: function : 'function' s= SYMBOL ':' definition -> ^( FUNCTION $s definition ) ;
    public final whileParser.function_return function() throws RecognitionException {
        whileParser.function_return retval = new whileParser.function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token s=null;
        Token string_literal2=null;
        Token char_literal3=null;
        whileParser.definition_return definition4 = null;


        Object s_tree=null;
        Object string_literal2_tree=null;
        Object char_literal3_tree=null;
        RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
        try { dbg.enterRule(getGrammarFileName(), "function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(47, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:47:9: ( 'function' s= SYMBOL ':' definition -> ^( FUNCTION $s definition ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:47:11: 'function' s= SYMBOL ':' definition
            {
            dbg.location(47,11);
            string_literal2=(Token)match(input,27,FOLLOW_27_in_function221); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(string_literal2);

            dbg.location(47,23);
            s=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_function225); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SYMBOL.add(s);

            dbg.location(47,30);
            char_literal3=(Token)match(input,28,FOLLOW_28_in_function226); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_28.add(char_literal3);

            dbg.location(47,34);
            pushFollow(FOLLOW_definition_in_function228);
            definition4=definition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_definition.add(definition4.getTree());


            // AST REWRITE
            // elements: definition, s
            // token labels: s
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 47:45: -> ^( FUNCTION $s definition )
            {
                dbg.location(47,48);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:47:48: ^( FUNCTION $s definition )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(47,50);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                dbg.location(47,59);
                adaptor.addChild(root_1, stream_s.nextNode());
                dbg.location(47,62);
                adaptor.addChild(root_1, stream_definition.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(48, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "function"

    public static class definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:49:1: definition : 'read' i= input '%' c= commands '%' 'write' o= output -> ^( DEFINITION ^( INPUT $i) ^( OUTPUT $o) $c) ;
    public final whileParser.definition_return definition() throws RecognitionException {
        whileParser.definition_return retval = new whileParser.definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal5=null;
        Token char_literal6=null;
        Token char_literal7=null;
        Token string_literal8=null;
        whileParser.input_return i = null;

        whileParser.commands_return c = null;

        whileParser.output_return o = null;


        Object string_literal5_tree=null;
        Object char_literal6_tree=null;
        Object char_literal7_tree=null;
        Object string_literal8_tree=null;
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
        RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try { dbg.enterRule(getGrammarFileName(), "definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:50:2: ( 'read' i= input '%' c= commands '%' 'write' o= output -> ^( DEFINITION ^( INPUT $i) ^( OUTPUT $o) $c) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:50:4: 'read' i= input '%' c= commands '%' 'write' o= output
            {
            dbg.location(50,4);
            string_literal5=(Token)match(input,29,FOLLOW_29_in_definition248); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(string_literal5);

            dbg.location(50,12);
            pushFollow(FOLLOW_input_in_definition252);
            i=input();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_input.add(i.getTree());
            dbg.location(50,19);
            char_literal6=(Token)match(input,30,FOLLOW_30_in_definition254); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(char_literal6);

            dbg.location(50,24);
            pushFollow(FOLLOW_commands_in_definition258);
            c=commands();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_commands.add(c.getTree());
            dbg.location(50,34);
            char_literal7=(Token)match(input,30,FOLLOW_30_in_definition260); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(char_literal7);

            dbg.location(50,38);
            string_literal8=(Token)match(input,31,FOLLOW_31_in_definition262); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_31.add(string_literal8);

            dbg.location(50,47);
            pushFollow(FOLLOW_output_in_definition266);
            o=output();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_output.add(o.getTree());


            // AST REWRITE
            // elements: c, o, i
            // token labels: 
            // rule labels: c, i, retval, o
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
            RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"rule i",i!=null?i.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            root_0 = (Object)adaptor.nil();
            // 50:55: -> ^( DEFINITION ^( INPUT $i) ^( OUTPUT $o) $c)
            {
                dbg.location(50,58);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:50:58: ^( DEFINITION ^( INPUT $i) ^( OUTPUT $o) $c)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(50,60);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFINITION, "DEFINITION"), root_1);

                dbg.location(50,71);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:50:71: ^( INPUT $i)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(50,73);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_2);

                dbg.location(50,79);
                adaptor.addChild(root_2, stream_i.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(50,83);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:50:83: ^( OUTPUT $o)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(50,85);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_2);

                dbg.location(50,92);
                adaptor.addChild(root_2, stream_o.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(50,96);
                adaptor.addChild(root_1, stream_c.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(51, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "definition"

    public static class input_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "input"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:52:1: input : (ip= inputsub )? -> ^( INPUT ( $ip)? ) ;
    public final whileParser.input_return input() throws RecognitionException {
        whileParser.input_return retval = new whileParser.input_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        whileParser.inputsub_return ip = null;


        RewriteRuleSubtreeStream stream_inputsub=new RewriteRuleSubtreeStream(adaptor,"rule inputsub");
        try { dbg.enterRule(getGrammarFileName(), "input");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:52:7: ( (ip= inputsub )? -> ^( INPUT ( $ip)? ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:52:9: (ip= inputsub )?
            {
            dbg.location(52,11);
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:52:11: (ip= inputsub )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==VARIABLE) ) {
                alt2=1;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:0:0: ip= inputsub
                    {
                    dbg.location(52,11);
                    pushFollow(FOLLOW_inputsub_in_input299);
                    ip=inputsub();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inputsub.add(ip.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}



            // AST REWRITE
            // elements: ip
            // token labels: 
            // rule labels: ip, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_ip=new RewriteRuleSubtreeStream(adaptor,"rule ip",ip!=null?ip.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 52:22: -> ^( INPUT ( $ip)? )
            {
                dbg.location(52,25);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:52:25: ^( INPUT ( $ip)? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(52,27);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);

                dbg.location(52,33);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:52:33: ( $ip)?
                if ( stream_ip.hasNext() ) {
                    dbg.location(52,34);
                    adaptor.addChild(root_1, stream_ip.nextTree());

                }
                stream_ip.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(53, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "input");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "input"

    public static class inputsub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inputsub"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:54:1: inputsub : v= VARIABLE ( ',' v= VARIABLE )* -> ( $v)+ ;
    public final whileParser.inputsub_return inputsub() throws RecognitionException {
        whileParser.inputsub_return retval = new whileParser.inputsub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;
        Token char_literal9=null;

        Object v_tree=null;
        Object char_literal9_tree=null;
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");

        try { dbg.enterRule(getGrammarFileName(), "inputsub");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(54, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:54:9: (v= VARIABLE ( ',' v= VARIABLE )* -> ( $v)+ )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:54:11: v= VARIABLE ( ',' v= VARIABLE )*
            {
            dbg.location(54,12);
            v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_inputsub321); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VARIABLE.add(v);

            dbg.location(54,22);
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:54:22: ( ',' v= VARIABLE )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==32) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:54:23: ',' v= VARIABLE
            	    {
            	    dbg.location(54,23);
            	    char_literal9=(Token)match(input,32,FOLLOW_32_in_inputsub324); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_32.add(char_literal9);

            	    dbg.location(54,28);
            	    v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_inputsub328); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_VARIABLE.add(v);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}



            // AST REWRITE
            // elements: v
            // token labels: v
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 54:40: -> ( $v)+
            {
                dbg.location(54,43);
                if ( !(stream_v.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_v.hasNext() ) {
                    dbg.location(54,43);
                    adaptor.addChild(root_0, stream_v.nextNode());

                }
                stream_v.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(55, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inputsub");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inputsub"

    public static class output_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "output"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:56:1: output : v= VARIABLE ( ',' v= VARIABLE )* -> ^( OUTPUT ( $v)+ ) ;
    public final whileParser.output_return output() throws RecognitionException {
        whileParser.output_return retval = new whileParser.output_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;
        Token char_literal10=null;

        Object v_tree=null;
        Object char_literal10_tree=null;
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");

        try { dbg.enterRule(getGrammarFileName(), "output");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:56:8: (v= VARIABLE ( ',' v= VARIABLE )* -> ^( OUTPUT ( $v)+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:56:10: v= VARIABLE ( ',' v= VARIABLE )*
            {
            dbg.location(56,11);
            v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output346); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VARIABLE.add(v);

            dbg.location(56,21);
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:56:21: ( ',' v= VARIABLE )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==32) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:56:22: ',' v= VARIABLE
            	    {
            	    dbg.location(56,22);
            	    char_literal10=(Token)match(input,32,FOLLOW_32_in_output349); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_32.add(char_literal10);

            	    dbg.location(56,27);
            	    v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output353); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_VARIABLE.add(v);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}



            // AST REWRITE
            // elements: v
            // token labels: v
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 56:39: -> ^( OUTPUT ( $v)+ )
            {
                dbg.location(56,42);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:56:42: ^( OUTPUT ( $v)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(56,44);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);

                dbg.location(56,51);
                if ( !(stream_v.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_v.hasNext() ) {
                    dbg.location(56,51);
                    adaptor.addChild(root_1, stream_v.nextNode());

                }
                stream_v.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(57, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "output");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "output"

    public static class vars_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vars"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:58:1: vars : v= VARIABLE ( ',' v= VARIABLE )* -> ^( VARIABLES ( $v)+ ) ;
    public final whileParser.vars_return vars() throws RecognitionException {
        whileParser.vars_return retval = new whileParser.vars_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;
        Token char_literal11=null;

        Object v_tree=null;
        Object char_literal11_tree=null;
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");

        try { dbg.enterRule(getGrammarFileName(), "vars");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(58, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:58:6: (v= VARIABLE ( ',' v= VARIABLE )* -> ^( VARIABLES ( $v)+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:58:8: v= VARIABLE ( ',' v= VARIABLE )*
            {
            dbg.location(58,9);
            v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars375); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VARIABLE.add(v);

            dbg.location(58,19);
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:58:19: ( ',' v= VARIABLE )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==32) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:58:20: ',' v= VARIABLE
            	    {
            	    dbg.location(58,20);
            	    char_literal11=(Token)match(input,32,FOLLOW_32_in_vars378); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_32.add(char_literal11);

            	    dbg.location(58,25);
            	    v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars382); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_VARIABLE.add(v);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}



            // AST REWRITE
            // elements: v
            // token labels: v
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 58:37: -> ^( VARIABLES ( $v)+ )
            {
                dbg.location(58,40);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:58:40: ^( VARIABLES ( $v)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(58,42);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_1);

                dbg.location(58,52);
                if ( !(stream_v.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_v.hasNext() ) {
                    dbg.location(58,52);
                    adaptor.addChild(root_1, stream_v.nextNode());

                }
                stream_v.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(59, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vars");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vars"

    public static class exprs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprs"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:60:1: exprs : e= expression ( ',' e= expression )* -> ^( EXPRESSIONS ( $e)+ ) ;
    public final whileParser.exprs_return exprs() throws RecognitionException {
        whileParser.exprs_return retval = new whileParser.exprs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal12=null;
        whileParser.expression_return e = null;


        Object char_literal12_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try { dbg.enterRule(getGrammarFileName(), "exprs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:60:8: (e= expression ( ',' e= expression )* -> ^( EXPRESSIONS ( $e)+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:60:10: e= expression ( ',' e= expression )*
            {
            dbg.location(60,11);
            pushFollow(FOLLOW_expression_in_exprs405);
            e=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(e.getTree());
            dbg.location(60,23);
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:60:23: ( ',' e= expression )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==32) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:60:24: ',' e= expression
            	    {
            	    dbg.location(60,24);
            	    char_literal12=(Token)match(input,32,FOLLOW_32_in_exprs408); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_32.add(char_literal12);

            	    dbg.location(60,29);
            	    pushFollow(FOLLOW_expression_in_exprs412);
            	    e=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(e.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}



            // AST REWRITE
            // elements: e
            // token labels: 
            // rule labels: e, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 60:43: -> ^( EXPRESSIONS ( $e)+ )
            {
                dbg.location(60,46);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:60:46: ^( EXPRESSIONS ( $e)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(60,48);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSIONS, "EXPRESSIONS"), root_1);

                dbg.location(60,60);
                if ( !(stream_e.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_e.hasNext() ) {
                    dbg.location(60,60);
                    adaptor.addChild(root_1, stream_e.nextTree());

                }
                stream_e.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(61, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprs"

    public static class commands_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commands"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:62:1: commands : c= command ( ';' c= command )* -> ^( COMMANDS ( $c)+ ) ;
    public final whileParser.commands_return commands() throws RecognitionException {
        whileParser.commands_return retval = new whileParser.commands_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal13=null;
        whileParser.command_return c = null;


        Object char_literal13_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        try { dbg.enterRule(getGrammarFileName(), "commands");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(62, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:62:9: (c= command ( ';' c= command )* -> ^( COMMANDS ( $c)+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:62:11: c= command ( ';' c= command )*
            {
            dbg.location(62,12);
            pushFollow(FOLLOW_command_in_commands433);
            c=command();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_command.add(c.getTree());
            dbg.location(62,21);
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:62:21: ( ';' c= command )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:62:22: ';' c= command
            	    {
            	    dbg.location(62,22);
            	    char_literal13=(Token)match(input,33,FOLLOW_33_in_commands436); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_33.add(char_literal13);

            	    dbg.location(62,27);
            	    pushFollow(FOLLOW_command_in_commands440);
            	    c=command();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_command.add(c.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}



            // AST REWRITE
            // elements: c
            // token labels: 
            // rule labels: c, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 62:38: -> ^( COMMANDS ( $c)+ )
            {
                dbg.location(62,41);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:62:41: ^( COMMANDS ( $c)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(62,43);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_1);

                dbg.location(62,52);
                if ( !(stream_c.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_c.hasNext() ) {
                    dbg.location(62,52);
                    adaptor.addChild(root_1, stream_c.nextTree());

                }
                stream_c.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(63, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "commands");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "commands"

    public static class command_nop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command_nop"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:64:1: command_nop : 'nop' -> ^( 'nop' ) ;
    public final whileParser.command_nop_return command_nop() throws RecognitionException {
        whileParser.command_nop_return retval = new whileParser.command_nop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal14=null;

        Object string_literal14_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");

        try { dbg.enterRule(getGrammarFileName(), "command_nop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(64, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:64:13: ( 'nop' -> ^( 'nop' ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:64:15: 'nop'
            {
            dbg.location(64,15);
            string_literal14=(Token)match(input,34,FOLLOW_34_in_command_nop460); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_34.add(string_literal14);



            // AST REWRITE
            // elements: 34
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 64:21: -> ^( 'nop' )
            {
                dbg.location(64,24);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:64:24: ^( 'nop' )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(64,26);
                root_1 = (Object)adaptor.becomeRoot(stream_34.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(65, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "command_nop");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "command_nop"

    public static class command_var_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command_var"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:66:1: command_var : vars ':=' exprs -> ^( VAR vars exprs ) ;
    public final whileParser.command_var_return command_var() throws RecognitionException {
        whileParser.command_var_return retval = new whileParser.command_var_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal16=null;
        whileParser.vars_return vars15 = null;

        whileParser.exprs_return exprs17 = null;


        Object string_literal16_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
        RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
        try { dbg.enterRule(getGrammarFileName(), "command_var");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(66, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:67:2: ( vars ':=' exprs -> ^( VAR vars exprs ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:67:4: vars ':=' exprs
            {
            dbg.location(67,4);
            pushFollow(FOLLOW_vars_in_command_var475);
            vars15=vars();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_vars.add(vars15.getTree());
            dbg.location(67,9);
            string_literal16=(Token)match(input,35,FOLLOW_35_in_command_var477); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_35.add(string_literal16);

            dbg.location(67,14);
            pushFollow(FOLLOW_exprs_in_command_var479);
            exprs17=exprs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprs.add(exprs17.getTree());


            // AST REWRITE
            // elements: exprs, vars
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 67:20: -> ^( VAR vars exprs )
            {
                dbg.location(67,23);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:67:23: ^( VAR vars exprs )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(67,25);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);

                dbg.location(67,29);
                adaptor.addChild(root_1, stream_vars.nextTree());
                dbg.location(67,34);
                adaptor.addChild(root_1, stream_exprs.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(68, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "command_var");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "command_var"

    public static class command_if_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command_if"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:69:1: command_if : 'if' expression 'then' c1= commands ( 'else' c2= commands )? 'fi' -> ^( COMMAND 'if' expression $c1 ( $c2)? ) ;
    public final whileParser.command_if_return command_if() throws RecognitionException {
        whileParser.command_if_return retval = new whileParser.command_if_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal18=null;
        Token string_literal20=null;
        Token string_literal21=null;
        Token string_literal22=null;
        whileParser.commands_return c1 = null;

        whileParser.commands_return c2 = null;

        whileParser.expression_return expression19 = null;


        Object string_literal18_tree=null;
        Object string_literal20_tree=null;
        Object string_literal21_tree=null;
        Object string_literal22_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try { dbg.enterRule(getGrammarFileName(), "command_if");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(69, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:70:2: ( 'if' expression 'then' c1= commands ( 'else' c2= commands )? 'fi' -> ^( COMMAND 'if' expression $c1 ( $c2)? ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:70:4: 'if' expression 'then' c1= commands ( 'else' c2= commands )? 'fi'
            {
            dbg.location(70,4);
            string_literal18=(Token)match(input,36,FOLLOW_36_in_command_if498); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_36.add(string_literal18);

            dbg.location(70,9);
            pushFollow(FOLLOW_expression_in_command_if500);
            expression19=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression19.getTree());
            dbg.location(70,20);
            string_literal20=(Token)match(input,37,FOLLOW_37_in_command_if502); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_37.add(string_literal20);

            dbg.location(70,29);
            pushFollow(FOLLOW_commands_in_command_if506);
            c1=commands();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_commands.add(c1.getTree());
            dbg.location(70,39);
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:70:39: ( 'else' c2= commands )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
                alt8=1;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:70:40: 'else' c2= commands
                    {
                    dbg.location(70,40);
                    string_literal21=(Token)match(input,38,FOLLOW_38_in_command_if509); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(string_literal21);

                    dbg.location(70,49);
                    pushFollow(FOLLOW_commands_in_command_if513);
                    c2=commands();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_commands.add(c2.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(70,61);
            string_literal22=(Token)match(input,39,FOLLOW_39_in_command_if517); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_39.add(string_literal22);



            // AST REWRITE
            // elements: c2, 36, expression, c1
            // token labels: 
            // rule labels: c1, retval, c2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 70:66: -> ^( COMMAND 'if' expression $c1 ( $c2)? )
            {
                dbg.location(70,69);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:70:69: ^( COMMAND 'if' expression $c1 ( $c2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(70,71);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);

                dbg.location(70,79);
                adaptor.addChild(root_1, stream_36.nextNode());
                dbg.location(70,84);
                adaptor.addChild(root_1, stream_expression.nextTree());
                dbg.location(70,95);
                adaptor.addChild(root_1, stream_c1.nextTree());
                dbg.location(70,99);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:70:99: ( $c2)?
                if ( stream_c2.hasNext() ) {
                    dbg.location(70,100);
                    adaptor.addChild(root_1, stream_c2.nextTree());

                }
                stream_c2.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(71, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "command_if");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "command_if"

    public static class command_while_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command_while"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:72:1: command_while : 'while' expression 'do' commands 'od' -> ^( COMMAND 'while' expression commands ) ;
    public final whileParser.command_while_return command_while() throws RecognitionException {
        whileParser.command_while_return retval = new whileParser.command_while_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal23=null;
        Token string_literal25=null;
        Token string_literal27=null;
        whileParser.expression_return expression24 = null;

        whileParser.commands_return commands26 = null;


        Object string_literal23_tree=null;
        Object string_literal25_tree=null;
        Object string_literal27_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try { dbg.enterRule(getGrammarFileName(), "command_while");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(72, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:73:2: ( 'while' expression 'do' commands 'od' -> ^( COMMAND 'while' expression commands ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:73:4: 'while' expression 'do' commands 'od'
            {
            dbg.location(73,4);
            string_literal23=(Token)match(input,40,FOLLOW_40_in_command_while545); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_40.add(string_literal23);

            dbg.location(73,12);
            pushFollow(FOLLOW_expression_in_command_while547);
            expression24=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression24.getTree());
            dbg.location(73,23);
            string_literal25=(Token)match(input,41,FOLLOW_41_in_command_while549); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(string_literal25);

            dbg.location(73,28);
            pushFollow(FOLLOW_commands_in_command_while551);
            commands26=commands();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_commands.add(commands26.getTree());
            dbg.location(73,37);
            string_literal27=(Token)match(input,42,FOLLOW_42_in_command_while553); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(string_literal27);



            // AST REWRITE
            // elements: expression, 40, commands
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 73:41: -> ^( COMMAND 'while' expression commands )
            {
                dbg.location(73,44);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:73:44: ^( COMMAND 'while' expression commands )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(73,46);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);

                dbg.location(73,54);
                adaptor.addChild(root_1, stream_40.nextNode());
                dbg.location(73,62);
                adaptor.addChild(root_1, stream_expression.nextTree());
                dbg.location(73,73);
                adaptor.addChild(root_1, stream_commands.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(74, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "command_while");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "command_while"

    public static class command_for_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command_for"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:75:1: command_for : 'for' expression 'do' commands 'od' -> ^( COMMAND 'for' expression commands ) ;
    public final whileParser.command_for_return command_for() throws RecognitionException {
        whileParser.command_for_return retval = new whileParser.command_for_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal28=null;
        Token string_literal30=null;
        Token string_literal32=null;
        whileParser.expression_return expression29 = null;

        whileParser.commands_return commands31 = null;


        Object string_literal28_tree=null;
        Object string_literal30_tree=null;
        Object string_literal32_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try { dbg.enterRule(getGrammarFileName(), "command_for");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:76:2: ( 'for' expression 'do' commands 'od' -> ^( COMMAND 'for' expression commands ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:76:4: 'for' expression 'do' commands 'od'
            {
            dbg.location(76,4);
            string_literal28=(Token)match(input,43,FOLLOW_43_in_command_for573); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_43.add(string_literal28);

            dbg.location(76,10);
            pushFollow(FOLLOW_expression_in_command_for575);
            expression29=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression29.getTree());
            dbg.location(76,21);
            string_literal30=(Token)match(input,41,FOLLOW_41_in_command_for577); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(string_literal30);

            dbg.location(76,26);
            pushFollow(FOLLOW_commands_in_command_for579);
            commands31=commands();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_commands.add(commands31.getTree());
            dbg.location(76,35);
            string_literal32=(Token)match(input,42,FOLLOW_42_in_command_for581); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(string_literal32);



            // AST REWRITE
            // elements: 43, commands, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 76:39: -> ^( COMMAND 'for' expression commands )
            {
                dbg.location(76,42);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:76:42: ^( COMMAND 'for' expression commands )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(76,44);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);

                dbg.location(76,52);
                adaptor.addChild(root_1, stream_43.nextNode());
                dbg.location(76,58);
                adaptor.addChild(root_1, stream_expression.nextTree());
                dbg.location(76,69);
                adaptor.addChild(root_1, stream_commands.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(77, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "command_for");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "command_for"

    public static class command_foreach_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command_foreach"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:78:1: command_foreach : 'foreach' VARIABLE 'in' expression 'do' commands 'od' -> ^( COMMAND 'foreach' VARIABLE expression commands ) ;
    public final whileParser.command_foreach_return command_foreach() throws RecognitionException {
        whileParser.command_foreach_return retval = new whileParser.command_foreach_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal33=null;
        Token VARIABLE34=null;
        Token string_literal35=null;
        Token string_literal37=null;
        Token string_literal39=null;
        whileParser.expression_return expression36 = null;

        whileParser.commands_return commands38 = null;


        Object string_literal33_tree=null;
        Object VARIABLE34_tree=null;
        Object string_literal35_tree=null;
        Object string_literal37_tree=null;
        Object string_literal39_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try { dbg.enterRule(getGrammarFileName(), "command_foreach");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(78, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:79:2: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' -> ^( COMMAND 'foreach' VARIABLE expression commands ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:79:4: 'foreach' VARIABLE 'in' expression 'do' commands 'od'
            {
            dbg.location(79,4);
            string_literal33=(Token)match(input,44,FOLLOW_44_in_command_foreach601); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_44.add(string_literal33);

            dbg.location(79,14);
            VARIABLE34=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_command_foreach603); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE34);

            dbg.location(79,23);
            string_literal35=(Token)match(input,45,FOLLOW_45_in_command_foreach605); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_45.add(string_literal35);

            dbg.location(79,28);
            pushFollow(FOLLOW_expression_in_command_foreach607);
            expression36=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression36.getTree());
            dbg.location(79,39);
            string_literal37=(Token)match(input,41,FOLLOW_41_in_command_foreach609); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(string_literal37);

            dbg.location(79,44);
            pushFollow(FOLLOW_commands_in_command_foreach611);
            commands38=commands();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_commands.add(commands38.getTree());
            dbg.location(79,53);
            string_literal39=(Token)match(input,42,FOLLOW_42_in_command_foreach613); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(string_literal39);



            // AST REWRITE
            // elements: VARIABLE, commands, 44, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 79:57: -> ^( COMMAND 'foreach' VARIABLE expression commands )
            {
                dbg.location(79,60);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:79:60: ^( COMMAND 'foreach' VARIABLE expression commands )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(79,62);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);

                dbg.location(79,70);
                adaptor.addChild(root_1, stream_44.nextNode());
                dbg.location(79,80);
                adaptor.addChild(root_1, stream_VARIABLE.nextNode());
                dbg.location(79,89);
                adaptor.addChild(root_1, stream_expression.nextTree());
                dbg.location(79,100);
                adaptor.addChild(root_1, stream_commands.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(80, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "command_foreach");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "command_foreach"

    public static class command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:81:1: command : ( command_nop | command_var | command_if | command_while | command_for | command_foreach );
    public final whileParser.command_return command() throws RecognitionException {
        whileParser.command_return retval = new whileParser.command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        whileParser.command_nop_return command_nop40 = null;

        whileParser.command_var_return command_var41 = null;

        whileParser.command_if_return command_if42 = null;

        whileParser.command_while_return command_while43 = null;

        whileParser.command_for_return command_for44 = null;

        whileParser.command_foreach_return command_foreach45 = null;



        try { dbg.enterRule(getGrammarFileName(), "command");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(81, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:82:5: ( command_nop | command_var | command_if | command_while | command_for | command_foreach )
            int alt9=6;
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            switch ( input.LA(1) ) {
            case 34:
                {
                alt9=1;
                }
                break;
            case VARIABLE:
                {
                alt9=2;
                }
                break;
            case 36:
                {
                alt9=3;
                }
                break;
            case 40:
                {
                alt9=4;
                }
                break;
            case 43:
                {
                alt9=5;
                }
                break;
            case 44:
                {
                alt9=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:82:7: command_nop
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(82,7);
                    pushFollow(FOLLOW_command_nop_in_command638);
                    command_nop40=command_nop();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, command_nop40.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:83:7: command_var
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(83,7);
                    pushFollow(FOLLOW_command_var_in_command646);
                    command_var41=command_var();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, command_var41.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:84:7: command_if
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(84,7);
                    pushFollow(FOLLOW_command_if_in_command654);
                    command_if42=command_if();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, command_if42.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:85:7: command_while
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(85,7);
                    pushFollow(FOLLOW_command_while_in_command662);
                    command_while43=command_while();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, command_while43.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:86:7: command_for
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(86,7);
                    pushFollow(FOLLOW_command_for_in_command670);
                    command_for44=command_for();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, command_for44.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:87:7: command_foreach
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(87,7);
                    pushFollow(FOLLOW_command_foreach_in_command678);
                    command_foreach45=command_foreach();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, command_foreach45.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(88, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "command");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "command"

    public static class exprbase_symbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprbase_symbol"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:89:1: exprbase_symbol : s= SYMBOL -> ^( EXPRBASE $s) ;
    public final whileParser.exprbase_symbol_return exprbase_symbol() throws RecognitionException {
        whileParser.exprbase_symbol_return retval = new whileParser.exprbase_symbol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token s=null;

        Object s_tree=null;
        RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");

        try { dbg.enterRule(getGrammarFileName(), "exprbase_symbol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:89:16: (s= SYMBOL -> ^( EXPRBASE $s) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:89:18: s= SYMBOL
            {
            dbg.location(89,19);
            s=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase_symbol687); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SYMBOL.add(s);



            // AST REWRITE
            // elements: s
            // token labels: s
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 89:27: -> ^( EXPRBASE $s)
            {
                dbg.location(89,30);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:89:30: ^( EXPRBASE $s)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(89,32);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);

                dbg.location(89,41);
                adaptor.addChild(root_1, stream_s.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(90, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprbase_symbol");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprbase_symbol"

    public static class exprbase_variable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprbase_variable"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:92:1: exprbase_variable : v= VARIABLE -> ^( EXPRBASE $v) ;
    public final whileParser.exprbase_variable_return exprbase_variable() throws RecognitionException {
        whileParser.exprbase_variable_return retval = new whileParser.exprbase_variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;

        Object v_tree=null;
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");

        try { dbg.enterRule(getGrammarFileName(), "exprbase_variable");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(92, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:92:18: (v= VARIABLE -> ^( EXPRBASE $v) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:92:20: v= VARIABLE
            {
            dbg.location(92,21);
            v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_exprbase_variable706); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VARIABLE.add(v);



            // AST REWRITE
            // elements: v
            // token labels: v
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 92:30: -> ^( EXPRBASE $v)
            {
                dbg.location(92,33);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:92:33: ^( EXPRBASE $v)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(92,35);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);

                dbg.location(92,44);
                adaptor.addChild(root_1, stream_v.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(93, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprbase_variable");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprbase_variable"

    public static class exprbase_nil_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprbase_nil"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:95:1: exprbase_nil : 'nil' -> ^( EXPRBASE 'nil' ) ;
    public final whileParser.exprbase_nil_return exprbase_nil() throws RecognitionException {
        whileParser.exprbase_nil_return retval = new whileParser.exprbase_nil_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal46=null;

        Object string_literal46_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");

        try { dbg.enterRule(getGrammarFileName(), "exprbase_nil");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(95, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:95:13: ( 'nil' -> ^( EXPRBASE 'nil' ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:95:15: 'nil'
            {
            dbg.location(95,15);
            string_literal46=(Token)match(input,46,FOLLOW_46_in_exprbase_nil722); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(string_literal46);



            // AST REWRITE
            // elements: 46
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 95:20: -> ^( EXPRBASE 'nil' )
            {
                dbg.location(95,23);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:95:23: ^( EXPRBASE 'nil' )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(95,25);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);

                dbg.location(95,34);
                adaptor.addChild(root_1, stream_46.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(96, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprbase_nil");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprbase_nil"

    public static class exprbase_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprbase_list"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:98:1: exprbase_list : '(' 'list' lexpr ')' -> ^( EXPRBASE 'list' lexpr ) ;
    public final whileParser.exprbase_list_return exprbase_list() throws RecognitionException {
        whileParser.exprbase_list_return retval = new whileParser.exprbase_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal47=null;
        Token string_literal48=null;
        Token char_literal50=null;
        whileParser.lexpr_return lexpr49 = null;


        Object char_literal47_tree=null;
        Object string_literal48_tree=null;
        Object char_literal50_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
        try { dbg.enterRule(getGrammarFileName(), "exprbase_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:98:14: ( '(' 'list' lexpr ')' -> ^( EXPRBASE 'list' lexpr ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:98:16: '(' 'list' lexpr ')'
            {
            dbg.location(98,16);
            char_literal47=(Token)match(input,47,FOLLOW_47_in_exprbase_list737); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(char_literal47);

            dbg.location(98,20);
            string_literal48=(Token)match(input,48,FOLLOW_48_in_exprbase_list739); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_48.add(string_literal48);

            dbg.location(98,27);
            pushFollow(FOLLOW_lexpr_in_exprbase_list741);
            lexpr49=lexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lexpr.add(lexpr49.getTree());
            dbg.location(98,33);
            char_literal50=(Token)match(input,49,FOLLOW_49_in_exprbase_list743); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal50);



            // AST REWRITE
            // elements: 48, lexpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 98:37: -> ^( EXPRBASE 'list' lexpr )
            {
                dbg.location(98,40);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:98:40: ^( EXPRBASE 'list' lexpr )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(98,42);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);

                dbg.location(98,51);
                adaptor.addChild(root_1, stream_48.nextNode());
                dbg.location(98,58);
                adaptor.addChild(root_1, stream_lexpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(99, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprbase_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprbase_list"

    public static class exprbase_cons_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprbase_cons"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:101:1: exprbase_cons : '(' 'cons' lexpr ')' -> ^( EXPRBASE 'cons' lexpr ) ;
    public final whileParser.exprbase_cons_return exprbase_cons() throws RecognitionException {
        whileParser.exprbase_cons_return retval = new whileParser.exprbase_cons_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal51=null;
        Token string_literal52=null;
        Token char_literal54=null;
        whileParser.lexpr_return lexpr53 = null;


        Object char_literal51_tree=null;
        Object string_literal52_tree=null;
        Object char_literal54_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
        try { dbg.enterRule(getGrammarFileName(), "exprbase_cons");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(101, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:101:14: ( '(' 'cons' lexpr ')' -> ^( EXPRBASE 'cons' lexpr ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:101:16: '(' 'cons' lexpr ')'
            {
            dbg.location(101,16);
            char_literal51=(Token)match(input,47,FOLLOW_47_in_exprbase_cons761); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(char_literal51);

            dbg.location(101,20);
            string_literal52=(Token)match(input,50,FOLLOW_50_in_exprbase_cons763); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(string_literal52);

            dbg.location(101,27);
            pushFollow(FOLLOW_lexpr_in_exprbase_cons765);
            lexpr53=lexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lexpr.add(lexpr53.getTree());
            dbg.location(101,33);
            char_literal54=(Token)match(input,49,FOLLOW_49_in_exprbase_cons767); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal54);



            // AST REWRITE
            // elements: 50, lexpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 101:36: -> ^( EXPRBASE 'cons' lexpr )
            {
                dbg.location(101,39);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:101:39: ^( EXPRBASE 'cons' lexpr )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(101,41);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);

                dbg.location(101,50);
                adaptor.addChild(root_1, stream_50.nextNode());
                dbg.location(101,57);
                adaptor.addChild(root_1, stream_lexpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(102, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprbase_cons");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprbase_cons"

    public static class exprbase_hd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprbase_hd"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:104:1: exprbase_hd : '(' 'hd' exprbase ')' -> ^( EXPRBASE 'hd' exprbase ) ;
    public final whileParser.exprbase_hd_return exprbase_hd() throws RecognitionException {
        whileParser.exprbase_hd_return retval = new whileParser.exprbase_hd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal55=null;
        Token string_literal56=null;
        Token char_literal58=null;
        whileParser.exprbase_return exprbase57 = null;


        Object char_literal55_tree=null;
        Object string_literal56_tree=null;
        Object char_literal58_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");
        try { dbg.enterRule(getGrammarFileName(), "exprbase_hd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:104:12: ( '(' 'hd' exprbase ')' -> ^( EXPRBASE 'hd' exprbase ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:104:14: '(' 'hd' exprbase ')'
            {
            dbg.location(104,14);
            char_literal55=(Token)match(input,47,FOLLOW_47_in_exprbase_hd785); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(char_literal55);

            dbg.location(104,18);
            string_literal56=(Token)match(input,51,FOLLOW_51_in_exprbase_hd787); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(string_literal56);

            dbg.location(104,23);
            pushFollow(FOLLOW_exprbase_in_exprbase_hd789);
            exprbase57=exprbase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprbase.add(exprbase57.getTree());
            dbg.location(104,32);
            char_literal58=(Token)match(input,49,FOLLOW_49_in_exprbase_hd791); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal58);



            // AST REWRITE
            // elements: 51, exprbase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 104:36: -> ^( EXPRBASE 'hd' exprbase )
            {
                dbg.location(104,39);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:104:39: ^( EXPRBASE 'hd' exprbase )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(104,41);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);

                dbg.location(104,50);
                adaptor.addChild(root_1, stream_51.nextNode());
                dbg.location(104,55);
                adaptor.addChild(root_1, stream_exprbase.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(105, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprbase_hd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprbase_hd"

    public static class exprbase_tl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprbase_tl"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:107:1: exprbase_tl : '(' 'tl' exprbase ')' -> ^( EXPRBASE 'tl' exprbase ) ;
    public final whileParser.exprbase_tl_return exprbase_tl() throws RecognitionException {
        whileParser.exprbase_tl_return retval = new whileParser.exprbase_tl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal59=null;
        Token string_literal60=null;
        Token char_literal62=null;
        whileParser.exprbase_return exprbase61 = null;


        Object char_literal59_tree=null;
        Object string_literal60_tree=null;
        Object char_literal62_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");
        try { dbg.enterRule(getGrammarFileName(), "exprbase_tl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:107:12: ( '(' 'tl' exprbase ')' -> ^( EXPRBASE 'tl' exprbase ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:107:14: '(' 'tl' exprbase ')'
            {
            dbg.location(107,14);
            char_literal59=(Token)match(input,47,FOLLOW_47_in_exprbase_tl809); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(char_literal59);

            dbg.location(107,18);
            string_literal60=(Token)match(input,52,FOLLOW_52_in_exprbase_tl811); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_52.add(string_literal60);

            dbg.location(107,23);
            pushFollow(FOLLOW_exprbase_in_exprbase_tl813);
            exprbase61=exprbase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprbase.add(exprbase61.getTree());
            dbg.location(107,32);
            char_literal62=(Token)match(input,49,FOLLOW_49_in_exprbase_tl815); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal62);



            // AST REWRITE
            // elements: exprbase, 52
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 107:35: -> ^( EXPRBASE 'tl' exprbase )
            {
                dbg.location(107,38);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:107:38: ^( EXPRBASE 'tl' exprbase )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(107,40);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);

                dbg.location(107,49);
                adaptor.addChild(root_1, stream_52.nextNode());
                dbg.location(107,54);
                adaptor.addChild(root_1, stream_exprbase.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(108, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprbase_tl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprbase_tl"

    public static class exprbase_symbol2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprbase_symbol2"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:110:1: exprbase_symbol2 : '(' a= SYMBOL lexpr ')' -> ^( EXPRBASE $a lexpr ) ;
    public final whileParser.exprbase_symbol2_return exprbase_symbol2() throws RecognitionException {
        whileParser.exprbase_symbol2_return retval = new whileParser.exprbase_symbol2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token a=null;
        Token char_literal63=null;
        Token char_literal65=null;
        whileParser.lexpr_return lexpr64 = null;


        Object a_tree=null;
        Object char_literal63_tree=null;
        Object char_literal65_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
        try { dbg.enterRule(getGrammarFileName(), "exprbase_symbol2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:110:17: ( '(' a= SYMBOL lexpr ')' -> ^( EXPRBASE $a lexpr ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:110:19: '(' a= SYMBOL lexpr ')'
            {
            dbg.location(110,19);
            char_literal63=(Token)match(input,47,FOLLOW_47_in_exprbase_symbol2832); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(char_literal63);

            dbg.location(110,24);
            a=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase_symbol2836); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SYMBOL.add(a);

            dbg.location(110,32);
            pushFollow(FOLLOW_lexpr_in_exprbase_symbol2838);
            lexpr64=lexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lexpr.add(lexpr64.getTree());
            dbg.location(110,38);
            char_literal65=(Token)match(input,49,FOLLOW_49_in_exprbase_symbol2840); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal65);



            // AST REWRITE
            // elements: a, lexpr
            // token labels: a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 110:41: -> ^( EXPRBASE $a lexpr )
            {
                dbg.location(110,44);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:110:44: ^( EXPRBASE $a lexpr )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(110,46);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);

                dbg.location(110,55);
                adaptor.addChild(root_1, stream_a.nextNode());
                dbg.location(110,58);
                adaptor.addChild(root_1, stream_lexpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(111, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprbase_symbol2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprbase_symbol2"

    public static class exprbase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprbase"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:113:1: exprbase : ( exprbase_nil | exprbase_variable | exprbase_list | exprbase_cons | exprbase_hd | exprbase_tl | exprbase_symbol2 | exprbase_symbol );
    public final whileParser.exprbase_return exprbase() throws RecognitionException {
        whileParser.exprbase_return retval = new whileParser.exprbase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        whileParser.exprbase_nil_return exprbase_nil66 = null;

        whileParser.exprbase_variable_return exprbase_variable67 = null;

        whileParser.exprbase_list_return exprbase_list68 = null;

        whileParser.exprbase_cons_return exprbase_cons69 = null;

        whileParser.exprbase_hd_return exprbase_hd70 = null;

        whileParser.exprbase_tl_return exprbase_tl71 = null;

        whileParser.exprbase_symbol2_return exprbase_symbol272 = null;

        whileParser.exprbase_symbol_return exprbase_symbol73 = null;



        try { dbg.enterRule(getGrammarFileName(), "exprbase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:113:10: ( exprbase_nil | exprbase_variable | exprbase_list | exprbase_cons | exprbase_hd | exprbase_tl | exprbase_symbol2 | exprbase_symbol )
            int alt10=8;
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            try {
                isCyclicDecision = true;
                alt10 = dfa10.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:113:12: exprbase_nil
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(113,12);
                    pushFollow(FOLLOW_exprbase_nil_in_exprbase859);
                    exprbase_nil66=exprbase_nil();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprbase_nil66.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:113:27: exprbase_variable
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(113,27);
                    pushFollow(FOLLOW_exprbase_variable_in_exprbase863);
                    exprbase_variable67=exprbase_variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprbase_variable67.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:113:47: exprbase_list
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(113,47);
                    pushFollow(FOLLOW_exprbase_list_in_exprbase867);
                    exprbase_list68=exprbase_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprbase_list68.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:113:63: exprbase_cons
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(113,63);
                    pushFollow(FOLLOW_exprbase_cons_in_exprbase871);
                    exprbase_cons69=exprbase_cons();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprbase_cons69.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:113:79: exprbase_hd
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(113,79);
                    pushFollow(FOLLOW_exprbase_hd_in_exprbase875);
                    exprbase_hd70=exprbase_hd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprbase_hd70.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:113:94: exprbase_tl
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(113,94);
                    pushFollow(FOLLOW_exprbase_tl_in_exprbase880);
                    exprbase_tl71=exprbase_tl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprbase_tl71.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:113:109: exprbase_symbol2
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(113,109);
                    pushFollow(FOLLOW_exprbase_symbol2_in_exprbase885);
                    exprbase_symbol272=exprbase_symbol2();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprbase_symbol272.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:113:128: exprbase_symbol
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(113,128);
                    pushFollow(FOLLOW_exprbase_symbol_in_exprbase889);
                    exprbase_symbol73=exprbase_symbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprbase_symbol73.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(114, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprbase");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprbase"

    public static class exprbase_compare_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprbase_compare"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:116:1: exprbase_compare : c= exprbase '=?' d= exprbase -> ^( EXPRESSION $c $d) ;
    public final whileParser.exprbase_compare_return exprbase_compare() throws RecognitionException {
        whileParser.exprbase_compare_return retval = new whileParser.exprbase_compare_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal74=null;
        whileParser.exprbase_return c = null;

        whileParser.exprbase_return d = null;


        Object string_literal74_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");
        try { dbg.enterRule(getGrammarFileName(), "exprbase_compare");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:116:17: (c= exprbase '=?' d= exprbase -> ^( EXPRESSION $c $d) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:116:19: c= exprbase '=?' d= exprbase
            {
            dbg.location(116,20);
            pushFollow(FOLLOW_exprbase_in_exprbase_compare899);
            c=exprbase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprbase.add(c.getTree());
            dbg.location(116,30);
            string_literal74=(Token)match(input,53,FOLLOW_53_in_exprbase_compare901); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(string_literal74);

            dbg.location(116,36);
            pushFollow(FOLLOW_exprbase_in_exprbase_compare905);
            d=exprbase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprbase.add(d.getTree());


            // AST REWRITE
            // elements: c, d
            // token labels: 
            // rule labels: c, d, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
            RewriteRuleSubtreeStream stream_d=new RewriteRuleSubtreeStream(adaptor,"rule d",d!=null?d.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 116:46: -> ^( EXPRESSION $c $d)
            {
                dbg.location(116,49);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:116:49: ^( EXPRESSION $c $d)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(116,51);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSION, "EXPRESSION"), root_1);

                dbg.location(116,62);
                adaptor.addChild(root_1, stream_c.nextTree());
                dbg.location(116,65);
                adaptor.addChild(root_1, stream_d.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(117, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprbase_compare");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprbase_compare"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:119:1: expression : ( exprbase_compare | exprbase );
    public final whileParser.expression_return expression() throws RecognitionException {
        whileParser.expression_return retval = new whileParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        whileParser.exprbase_compare_return exprbase_compare75 = null;

        whileParser.exprbase_return exprbase76 = null;



        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(119, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:119:11: ( exprbase_compare | exprbase )
            int alt11=2;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            switch ( input.LA(1) ) {
            case 46:
                {
                int LA11_1 = input.LA(2);

                if ( (synpred21_while()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case VARIABLE:
                {
                int LA11_2 = input.LA(2);

                if ( (synpred21_while()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA11_3 = input.LA(2);

                if ( (synpred21_while()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case SYMBOL:
                {
                int LA11_4 = input.LA(2);

                if ( (synpred21_while()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:119:13: exprbase_compare
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(119,13);
                    pushFollow(FOLLOW_exprbase_compare_in_expression925);
                    exprbase_compare75=exprbase_compare();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprbase_compare75.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:119:32: exprbase
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(119,32);
                    pushFollow(FOLLOW_exprbase_in_expression929);
                    exprbase76=exprbase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprbase76.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(120, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression"

    public static class lexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lexpr"
    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:122:1: lexpr : (e+= exprbase )* -> ^( LEXPR ( $e)* ) ;
    public final whileParser.lexpr_return lexpr() throws RecognitionException {
        whileParser.lexpr_return retval = new whileParser.lexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        List list_e=null;
        RuleReturnScope e = null;
        RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");
        try { dbg.enterRule(getGrammarFileName(), "lexpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(122, 1);

        try {
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:122:6: ( (e+= exprbase )* -> ^( LEXPR ( $e)* ) )
            dbg.enterAlt(1);

            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:122:8: (e+= exprbase )*
            {
            dbg.location(122,9);
            // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:122:9: (e+= exprbase )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=VARIABLE && LA12_0<=SYMBOL)||(LA12_0>=46 && LA12_0<=47)) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:0:0: e+= exprbase
            	    {
            	    dbg.location(122,9);
            	    pushFollow(FOLLOW_exprbase_in_lexpr939);
            	    e=exprbase();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprbase.add(e.getTree());
            	    if (list_e==null) list_e=new ArrayList();
            	    list_e.add(e.getTree());


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}



            // AST REWRITE
            // elements: e
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: e
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"token e",list_e);
            root_0 = (Object)adaptor.nil();
            // 122:21: -> ^( LEXPR ( $e)* )
            {
                dbg.location(122,24);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:122:24: ^( LEXPR ( $e)* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(122,26);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LEXPR, "LEXPR"), root_1);

                dbg.location(122,32);
                // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:122:32: ( $e)*
                while ( stream_e.hasNext() ) {
                    dbg.location(122,32);
                    adaptor.addChild(root_1, stream_e.nextTree());

                }
                stream_e.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(122, 36);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "lexpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "lexpr"

    // $ANTLR start synpred21_while
    public final void synpred21_while_fragment() throws RecognitionException {   
        // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:119:13: ( exprbase_compare )
        dbg.enterAlt(1);

        // C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:119:13: exprbase_compare
        {
        dbg.location(119,13);
        pushFollow(FOLLOW_exprbase_compare_in_synpred21_while925);
        exprbase_compare();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_while

    // Delegated rules

    public final boolean synpred21_while() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred21_while_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\12\uffff";
    static final String DFA10_eofS =
        "\12\uffff";
    static final String DFA10_minS =
        "\1\31\2\uffff\1\32\6\uffff";
    static final String DFA10_maxS =
        "\1\57\2\uffff\1\64\6\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\10\1\3\1\4\1\5\1\6\1\7";
    static final String DFA10_specialS =
        "\12\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\4\23\uffff\1\1\1\3",
            "",
            "",
            "\1\11\25\uffff\1\5\1\uffff\1\6\1\7\1\10",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "113:1: exprbase : ( exprbase_nil | exprbase_variable | exprbase_list | exprbase_cons | exprbase_hd | exprbase_tl | exprbase_symbol2 | exprbase_symbol );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_function_in_program203 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_function221 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SYMBOL_in_function225 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_function226 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_definition_in_function228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_definition248 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_input_in_definition252 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_definition254 = new BitSet(new long[]{0x0000191402000000L});
    public static final BitSet FOLLOW_commands_in_definition258 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_definition260 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_definition262 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_output_in_definition266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputsub_in_input299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_inputsub321 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_inputsub324 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VARIABLE_in_inputsub328 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_VARIABLE_in_output346 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_output349 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VARIABLE_in_output353 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_VARIABLE_in_vars375 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_vars378 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VARIABLE_in_vars382 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_expression_in_exprs405 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_exprs408 = new BitSet(new long[]{0x0000C00006000000L});
    public static final BitSet FOLLOW_expression_in_exprs412 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_command_in_commands433 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_commands436 = new BitSet(new long[]{0x0000191402000000L});
    public static final BitSet FOLLOW_command_in_commands440 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_34_in_command_nop460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vars_in_command_var475 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_command_var477 = new BitSet(new long[]{0x0000C00006000000L});
    public static final BitSet FOLLOW_exprs_in_command_var479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_command_if498 = new BitSet(new long[]{0x0000C00006000000L});
    public static final BitSet FOLLOW_expression_in_command_if500 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_command_if502 = new BitSet(new long[]{0x0000191402000000L});
    public static final BitSet FOLLOW_commands_in_command_if506 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38_in_command_if509 = new BitSet(new long[]{0x0000191402000000L});
    public static final BitSet FOLLOW_commands_in_command_if513 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_command_if517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_command_while545 = new BitSet(new long[]{0x0000C00006000000L});
    public static final BitSet FOLLOW_expression_in_command_while547 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_command_while549 = new BitSet(new long[]{0x0000191402000000L});
    public static final BitSet FOLLOW_commands_in_command_while551 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_command_while553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_command_for573 = new BitSet(new long[]{0x0000C00006000000L});
    public static final BitSet FOLLOW_expression_in_command_for575 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_command_for577 = new BitSet(new long[]{0x0000191402000000L});
    public static final BitSet FOLLOW_commands_in_command_for579 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_command_for581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_command_foreach601 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VARIABLE_in_command_foreach603 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_command_foreach605 = new BitSet(new long[]{0x0000C00006000000L});
    public static final BitSet FOLLOW_expression_in_command_foreach607 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_command_foreach609 = new BitSet(new long[]{0x0000191402000000L});
    public static final BitSet FOLLOW_commands_in_command_foreach611 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_command_foreach613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_nop_in_command638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_var_in_command646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_if_in_command654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_while_in_command662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_for_in_command670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_foreach_in_command678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_exprbase_symbol687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_exprbase_variable706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_exprbase_nil722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_exprbase_list737 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_exprbase_list739 = new BitSet(new long[]{0x0002C00006000000L});
    public static final BitSet FOLLOW_lexpr_in_exprbase_list741 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_exprbase_list743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_exprbase_cons761 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_exprbase_cons763 = new BitSet(new long[]{0x0002C00006000000L});
    public static final BitSet FOLLOW_lexpr_in_exprbase_cons765 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_exprbase_cons767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_exprbase_hd785 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_exprbase_hd787 = new BitSet(new long[]{0x0000C00006000000L});
    public static final BitSet FOLLOW_exprbase_in_exprbase_hd789 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_exprbase_hd791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_exprbase_tl809 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_exprbase_tl811 = new BitSet(new long[]{0x0000C00006000000L});
    public static final BitSet FOLLOW_exprbase_in_exprbase_tl813 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_exprbase_tl815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_exprbase_symbol2832 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SYMBOL_in_exprbase_symbol2836 = new BitSet(new long[]{0x0002C00006000000L});
    public static final BitSet FOLLOW_lexpr_in_exprbase_symbol2838 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_exprbase_symbol2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprbase_nil_in_exprbase859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprbase_variable_in_exprbase863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprbase_list_in_exprbase867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprbase_cons_in_exprbase871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprbase_hd_in_exprbase875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprbase_tl_in_exprbase880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprbase_symbol2_in_exprbase885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprbase_symbol_in_exprbase889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprbase_in_exprbase_compare899 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_exprbase_compare901 = new BitSet(new long[]{0x0000C00006000000L});
    public static final BitSet FOLLOW_exprbase_in_exprbase_compare905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprbase_compare_in_expression925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprbase_in_expression929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprbase_in_lexpr939 = new BitSet(new long[]{0x0000C00006000002L});
    public static final BitSet FOLLOW_exprbase_compare_in_synpred21_while925 = new BitSet(new long[]{0x0000000000000002L});

}