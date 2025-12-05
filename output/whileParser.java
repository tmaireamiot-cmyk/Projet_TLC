// $ANTLR 3.5.1 C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g 2025-12-05 09:30:18

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class whileParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMA", "COMMAND", "COMMANDS", 
		"DEFINITION", "EXPRBASE", "EXPRESSION", "EXPRESSIONS", "EXPRS", "FUNCTION", 
		"IF", "INPUT", "INPUTSUB", "LEXPR", "NOP", "OUTPUT", "PERCENT", "PROGRAM", 
		"SYMBOL", "VAR", "VARIABLE", "VARIABLES", "VARS", "'('", "')'", "':'", 
		"':='", "';'", "'=?'", "'cons'", "'do'", "'else'", "'fi'", "'for'", "'foreach'", 
		"'function'", "'hd'", "'if'", "'in'", "'list'", "'nil'", "'nop'", "'od'", 
		"'read'", "'then'", "'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
	public static final int T__26=26;
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
	public static final int COMMA=4;
	public static final int COMMAND=5;
	public static final int COMMANDS=6;
	public static final int DEFINITION=7;
	public static final int EXPRBASE=8;
	public static final int EXPRESSION=9;
	public static final int EXPRESSIONS=10;
	public static final int EXPRS=11;
	public static final int FUNCTION=12;
	public static final int IF=13;
	public static final int INPUT=14;
	public static final int INPUTSUB=15;
	public static final int LEXPR=16;
	public static final int NOP=17;
	public static final int OUTPUT=18;
	public static final int PERCENT=19;
	public static final int PROGRAM=20;
	public static final int SYMBOL=21;
	public static final int VAR=22;
	public static final int VARIABLE=23;
	public static final int VARIABLES=24;
	public static final int VARS=25;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "output", "command_var", "lexpr", "command_nop", "exprbase_cons", 
		"exprbase_variable", "exprbase", "exprbase_symbol", "exprbase_hd", "exprbase_symbol2", 
		"exprs", "input", "program", "definition", "command_if", "command_while", 
		"command_foreach", "command", "expression", "exprbase_list", "commands", 
		"vars", "command_for", "function", "exprbase_nil", "exprbase_tl"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false
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
	@Override public String[] getTokenNames() { return whileParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:35:1: program : ( function )+ -> ^( PROGRAM ( function )+ ) ;
	public final whileParser.program_return program() throws RecognitionException {
		whileParser.program_return retval = new whileParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function1 =null;

		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(35, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:35:9: ( ( function )+ -> ^( PROGRAM ( function )+ ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:35:11: ( function )+
			{
			dbg.location(35,11);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:35:11: ( function )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==38) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:35:11: function
					{
					dbg.location(35,11);
					pushFollow(FOLLOW_function_in_program248);
					function1=function();
					state._fsp--;

					stream_function.add(function1.getTree());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
			}
			} finally {dbg.exitSubRule(1);}

			// AST REWRITE
			// elements: function
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 35:21: -> ^( PROGRAM ( function )+ )
			{
				dbg.location(35,24);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:35:24: ^( PROGRAM ( function )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(35,26);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				dbg.location(35,34);
				if ( !(stream_function.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_function.hasNext() ) {
					dbg.location(35,34);
					adaptor.addChild(root_1, stream_function.nextTree());
				}
				stream_function.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(35, 43);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:37:1: function : 'function' s= SYMBOL ':' definition -> ^( FUNCTION $s definition ) ;
	public final whileParser.function_return function() throws RecognitionException {
		whileParser.function_return retval = new whileParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token s=null;
		Token string_literal2=null;
		Token char_literal3=null;
		ParserRuleReturnScope definition4 =null;

		Object s_tree=null;
		Object string_literal2_tree=null;
		Object char_literal3_tree=null;
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:37:10: ( 'function' s= SYMBOL ':' definition -> ^( FUNCTION $s definition ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:37:12: 'function' s= SYMBOL ':' definition
			{
			dbg.location(37,12);
			string_literal2=(Token)match(input,38,FOLLOW_38_in_function266);  
			stream_38.add(string_literal2);
			dbg.location(37,24);
			s=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_function270);  
			stream_SYMBOL.add(s);
			dbg.location(37,32);
			char_literal3=(Token)match(input,28,FOLLOW_28_in_function272);  
			stream_28.add(char_literal3);
			dbg.location(37,36);
			pushFollow(FOLLOW_definition_in_function274);
			definition4=definition();
			state._fsp--;

			stream_definition.add(definition4.getTree());
			// AST REWRITE
			// elements: s, definition
			// token labels: s
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 37:47: -> ^( FUNCTION $s definition )
			{
				dbg.location(37,50);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:37:50: ^( FUNCTION $s definition )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(37,52);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				dbg.location(37,62);
				adaptor.addChild(root_1, stream_s.nextNode());dbg.location(37,64);
				adaptor.addChild(root_1, stream_definition.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(37, 74);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:39:1: definition : 'read' (i= input )? PERCENT c= commands PERCENT 'write' o= output -> ^( DEFINITION ^( INPUT ( $i)? ) ^( OUTPUT $o) $c) ;
	public final whileParser.definition_return definition() throws RecognitionException {
		whileParser.definition_return retval = new whileParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal5=null;
		Token PERCENT6=null;
		Token PERCENT7=null;
		Token string_literal8=null;
		ParserRuleReturnScope i =null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope o =null;

		Object string_literal5_tree=null;
		Object PERCENT6_tree=null;
		Object PERCENT7_tree=null;
		Object string_literal8_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_PERCENT=new RewriteRuleTokenStream(adaptor,"token PERCENT");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(39, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:40:5: ( 'read' (i= input )? PERCENT c= commands PERCENT 'write' o= output -> ^( DEFINITION ^( INPUT ( $i)? ) ^( OUTPUT $o) $c) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:40:7: 'read' (i= input )? PERCENT c= commands PERCENT 'write' o= output
			{
			dbg.location(40,7);
			string_literal5=(Token)match(input,46,FOLLOW_46_in_definition297);  
			stream_46.add(string_literal5);
			dbg.location(40,15);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:40:15: (i= input )?
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

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:40:15: i= input
					{
					dbg.location(40,15);
					pushFollow(FOLLOW_input_in_definition301);
					i=input();
					state._fsp--;

					stream_input.add(i.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(40,23);
			PERCENT6=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_definition304);  
			stream_PERCENT.add(PERCENT6);
			dbg.location(40,32);
			pushFollow(FOLLOW_commands_in_definition308);
			c=commands();
			state._fsp--;

			stream_commands.add(c.getTree());dbg.location(40,42);
			PERCENT7=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_definition310);  
			stream_PERCENT.add(PERCENT7);
			dbg.location(40,50);
			string_literal8=(Token)match(input,50,FOLLOW_50_in_definition312);  
			stream_50.add(string_literal8);
			dbg.location(40,59);
			pushFollow(FOLLOW_output_in_definition316);
			o=output();
			state._fsp--;

			stream_output.add(o.getTree());
			// AST REWRITE
			// elements: i, o, c
			// token labels: 
			// rule labels: c, i, retval, o
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"rule i",i!=null?i.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 40:67: -> ^( DEFINITION ^( INPUT ( $i)? ) ^( OUTPUT $o) $c)
			{
				dbg.location(40,70);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:40:70: ^( DEFINITION ^( INPUT ( $i)? ) ^( OUTPUT $o) $c)
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(40,72);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFINITION, "DEFINITION"), root_1);
				dbg.location(40,83);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:40:83: ^( INPUT ( $i)? )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(40,85);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_2);
				dbg.location(40,92);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:40:92: ( $i)?
				if ( stream_i.hasNext() ) {
					dbg.location(40,92);
					adaptor.addChild(root_2, stream_i.nextTree());
				}
				stream_i.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(40,96);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:40:96: ^( OUTPUT $o)
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(40,98);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_2);
				dbg.location(40,106);
				adaptor.addChild(root_2, stream_o.nextTree());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(40,110);
				adaptor.addChild(root_1, stream_c.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(41, 4);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:42:1: input : v= VARIABLE ( COMMA v= VARIABLE )* -> ^( INPUT ( $v)+ ) ;
	public final whileParser.input_return input() throws RecognitionException {
		whileParser.input_return retval = new whileParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v=null;
		Token COMMA9=null;

		Object v_tree=null;
		Object COMMA9_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");

		try { dbg.enterRule(getGrammarFileName(), "input");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(42, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:42:8: (v= VARIABLE ( COMMA v= VARIABLE )* -> ^( INPUT ( $v)+ ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:42:10: v= VARIABLE ( COMMA v= VARIABLE )*
			{
			dbg.location(42,11);
			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_input355);  
			stream_VARIABLE.add(v);
			dbg.location(42,21);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:42:21: ( COMMA v= VARIABLE )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==COMMA) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:42:22: COMMA v= VARIABLE
					{
					dbg.location(42,22);
					COMMA9=(Token)match(input,COMMA,FOLLOW_COMMA_in_input358);  
					stream_COMMA.add(COMMA9);
					dbg.location(42,29);
					v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_input362);  
					stream_VARIABLE.add(v);

					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}

			// AST REWRITE
			// elements: v
			// token labels: v
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 42:41: -> ^( INPUT ( $v)+ )
			{
				dbg.location(42,44);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:42:44: ^( INPUT ( $v)+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(42,46);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);
				dbg.location(42,53);
				if ( !(stream_v.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_v.hasNext() ) {
					dbg.location(42,53);
					adaptor.addChild(root_1, stream_v.nextNode());
				}
				stream_v.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(42, 55);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "input");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "input"


	public static class output_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "output"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:44:1: output : v= VARIABLE ( COMMA v= VARIABLE )* -> ^( OUTPUT ( $v)+ ) ;
	public final whileParser.output_return output() throws RecognitionException {
		whileParser.output_return retval = new whileParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v=null;
		Token COMMA10=null;

		Object v_tree=null;
		Object COMMA10_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");

		try { dbg.enterRule(getGrammarFileName(), "output");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(44, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:44:8: (v= VARIABLE ( COMMA v= VARIABLE )* -> ^( OUTPUT ( $v)+ ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:44:10: v= VARIABLE ( COMMA v= VARIABLE )*
			{
			dbg.location(44,11);
			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output384);  
			stream_VARIABLE.add(v);
			dbg.location(44,21);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:44:21: ( COMMA v= VARIABLE )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==COMMA) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:44:22: COMMA v= VARIABLE
					{
					dbg.location(44,22);
					COMMA10=(Token)match(input,COMMA,FOLLOW_COMMA_in_output387);  
					stream_COMMA.add(COMMA10);
					dbg.location(44,29);
					v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output391);  
					stream_VARIABLE.add(v);

					}
					break;

				default :
					break loop4;
				}
			}
			} finally {dbg.exitSubRule(4);}

			// AST REWRITE
			// elements: v
			// token labels: v
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 44:41: -> ^( OUTPUT ( $v)+ )
			{
				dbg.location(44,44);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:44:44: ^( OUTPUT ( $v)+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(44,46);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);
				dbg.location(44,54);
				if ( !(stream_v.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_v.hasNext() ) {
					dbg.location(44,54);
					adaptor.addChild(root_1, stream_v.nextNode());
				}
				stream_v.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(44, 56);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:46:1: vars : v= VARIABLE ( COMMA v= VARIABLE )* -> ^( VARIABLES ( $v)+ ) ;
	public final whileParser.vars_return vars() throws RecognitionException {
		whileParser.vars_return retval = new whileParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v=null;
		Token COMMA11=null;

		Object v_tree=null;
		Object COMMA11_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");

		try { dbg.enterRule(getGrammarFileName(), "vars");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(46, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:46:6: (v= VARIABLE ( COMMA v= VARIABLE )* -> ^( VARIABLES ( $v)+ ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:46:8: v= VARIABLE ( COMMA v= VARIABLE )*
			{
			dbg.location(46,9);
			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars413);  
			stream_VARIABLE.add(v);
			dbg.location(46,19);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:46:19: ( COMMA v= VARIABLE )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:46:20: COMMA v= VARIABLE
					{
					dbg.location(46,20);
					COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_vars416);  
					stream_COMMA.add(COMMA11);
					dbg.location(46,27);
					v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars420);  
					stream_VARIABLE.add(v);

					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}

			// AST REWRITE
			// elements: v
			// token labels: v
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 46:39: -> ^( VARIABLES ( $v)+ )
			{
				dbg.location(46,42);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:46:42: ^( VARIABLES ( $v)+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(46,44);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_1);
				dbg.location(46,55);
				if ( !(stream_v.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_v.hasNext() ) {
					dbg.location(46,55);
					adaptor.addChild(root_1, stream_v.nextNode());
				}
				stream_v.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(46, 57);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprs"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:48:1: exprs : e= expression ( COMMA e= expression )* -> ^( EXPRESSIONS ( $e)+ ) ;
	public final whileParser.exprs_return exprs() throws RecognitionException {
		whileParser.exprs_return retval = new whileParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA12=null;
		ParserRuleReturnScope e =null;

		Object COMMA12_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try { dbg.enterRule(getGrammarFileName(), "exprs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(48, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:48:7: (e= expression ( COMMA e= expression )* -> ^( EXPRESSIONS ( $e)+ ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:48:9: e= expression ( COMMA e= expression )*
			{
			dbg.location(48,10);
			pushFollow(FOLLOW_expression_in_exprs442);
			e=expression();
			state._fsp--;

			stream_expression.add(e.getTree());dbg.location(48,22);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:48:22: ( COMMA e= expression )*
			try { dbg.enterSubRule(6);

			loop6:
			while (true) {
				int alt6=2;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:48:23: COMMA e= expression
					{
					dbg.location(48,23);
					COMMA12=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprs445);  
					stream_COMMA.add(COMMA12);
					dbg.location(48,30);
					pushFollow(FOLLOW_expression_in_exprs449);
					e=expression();
					state._fsp--;

					stream_expression.add(e.getTree());
					}
					break;

				default :
					break loop6;
				}
			}
			} finally {dbg.exitSubRule(6);}

			// AST REWRITE
			// elements: e
			// token labels: 
			// rule labels: e, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 48:44: -> ^( EXPRESSIONS ( $e)+ )
			{
				dbg.location(48,47);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:48:47: ^( EXPRESSIONS ( $e)+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(48,49);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSIONS, "EXPRESSIONS"), root_1);
				dbg.location(48,62);
				if ( !(stream_e.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_e.hasNext() ) {
					dbg.location(48,62);
					adaptor.addChild(root_1, stream_e.nextTree());
				}
				stream_e.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(48, 64);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "commands"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:50:1: commands : c= command ( ';' c= command )* -> ^( COMMANDS ( $c)+ ) ;
	public final whileParser.commands_return commands() throws RecognitionException {
		whileParser.commands_return retval = new whileParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal13=null;
		ParserRuleReturnScope c =null;

		Object char_literal13_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");

		try { dbg.enterRule(getGrammarFileName(), "commands");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(50, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:50:10: (c= command ( ';' c= command )* -> ^( COMMANDS ( $c)+ ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:50:12: c= command ( ';' c= command )*
			{
			dbg.location(50,13);
			pushFollow(FOLLOW_command_in_commands471);
			c=command();
			state._fsp--;

			stream_command.add(c.getTree());dbg.location(50,22);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:50:22: ( ';' c= command )*
			try { dbg.enterSubRule(7);

			loop7:
			while (true) {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==30) ) {
					alt7=1;
				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:50:24: ';' c= command
					{
					dbg.location(50,24);
					char_literal13=(Token)match(input,30,FOLLOW_30_in_commands475);  
					stream_30.add(char_literal13);
					dbg.location(50,29);
					pushFollow(FOLLOW_command_in_commands479);
					c=command();
					state._fsp--;

					stream_command.add(c.getTree());
					}
					break;

				default :
					break loop7;
				}
			}
			} finally {dbg.exitSubRule(7);}

			// AST REWRITE
			// elements: c
			// token labels: 
			// rule labels: c, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 50:41: -> ^( COMMANDS ( $c)+ )
			{
				dbg.location(50,44);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:50:44: ^( COMMANDS ( $c)+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(50,46);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_1);
				dbg.location(50,56);
				if ( !(stream_c.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_c.hasNext() ) {
					dbg.location(50,56);
					adaptor.addChild(root_1, stream_c.nextTree());
				}
				stream_c.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(50, 58);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_nop"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:52:1: command_nop : 'nop' -> ^( NOP ) ;
	public final whileParser.command_nop_return command_nop() throws RecognitionException {
		whileParser.command_nop_return retval = new whileParser.command_nop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal14=null;

		Object string_literal14_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");

		try { dbg.enterRule(getGrammarFileName(), "command_nop");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(52, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:52:13: ( 'nop' -> ^( NOP ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:52:15: 'nop'
			{
			dbg.location(52,15);
			string_literal14=(Token)match(input,44,FOLLOW_44_in_command_nop500);  
			stream_44.add(string_literal14);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 52:21: -> ^( NOP )
			{
				dbg.location(52,24);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:52:24: ^( NOP )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(52,26);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOP, "NOP"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(52, 29);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_var"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:54:1: command_var : vars ':=' exprs -> ^( VAR vars exprs ) ;
	public final whileParser.command_var_return command_var() throws RecognitionException {
		whileParser.command_var_return retval = new whileParser.command_var_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal16=null;
		ParserRuleReturnScope vars15 =null;
		ParserRuleReturnScope exprs17 =null;

		Object string_literal16_tree=null;
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try { dbg.enterRule(getGrammarFileName(), "command_var");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:54:13: ( vars ':=' exprs -> ^( VAR vars exprs ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:54:15: vars ':=' exprs
			{
			dbg.location(54,15);
			pushFollow(FOLLOW_vars_in_command_var514);
			vars15=vars();
			state._fsp--;

			stream_vars.add(vars15.getTree());dbg.location(54,20);
			string_literal16=(Token)match(input,29,FOLLOW_29_in_command_var516);  
			stream_29.add(string_literal16);
			dbg.location(54,25);
			pushFollow(FOLLOW_exprs_in_command_var518);
			exprs17=exprs();
			state._fsp--;

			stream_exprs.add(exprs17.getTree());
			// AST REWRITE
			// elements: exprs, vars
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 54:31: -> ^( VAR vars exprs )
			{
				dbg.location(54,34);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:54:34: ^( VAR vars exprs )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(54,36);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
				dbg.location(54,40);
				adaptor.addChild(root_1, stream_vars.nextTree());dbg.location(54,45);
				adaptor.addChild(root_1, stream_exprs.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(54, 50);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_if"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:56:1: command_if : 'if' expression 'then' c1= commands ( 'else' c2= commands )? 'fi' -> ^( COMMAND 'if' expression $c1 ( $c2)? ) ;
	public final whileParser.command_if_return command_if() throws RecognitionException {
		whileParser.command_if_return retval = new whileParser.command_if_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal18=null;
		Token string_literal20=null;
		Token string_literal21=null;
		Token string_literal22=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope expression19 =null;

		Object string_literal18_tree=null;
		Object string_literal20_tree=null;
		Object string_literal21_tree=null;
		Object string_literal22_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "command_if");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(56, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:57:5: ( 'if' expression 'then' c1= commands ( 'else' c2= commands )? 'fi' -> ^( COMMAND 'if' expression $c1 ( $c2)? ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:57:7: 'if' expression 'then' c1= commands ( 'else' c2= commands )? 'fi'
			{
			dbg.location(57,7);
			string_literal18=(Token)match(input,40,FOLLOW_40_in_command_if540);  
			stream_40.add(string_literal18);
			dbg.location(57,12);
			pushFollow(FOLLOW_expression_in_command_if542);
			expression19=expression();
			state._fsp--;

			stream_expression.add(expression19.getTree());dbg.location(57,23);
			string_literal20=(Token)match(input,47,FOLLOW_47_in_command_if544);  
			stream_47.add(string_literal20);
			dbg.location(57,32);
			pushFollow(FOLLOW_commands_in_command_if548);
			c1=commands();
			state._fsp--;

			stream_commands.add(c1.getTree());dbg.location(57,42);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:57:42: ( 'else' c2= commands )?
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==34) ) {
				alt8=1;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:57:43: 'else' c2= commands
					{
					dbg.location(57,43);
					string_literal21=(Token)match(input,34,FOLLOW_34_in_command_if551);  
					stream_34.add(string_literal21);
					dbg.location(57,52);
					pushFollow(FOLLOW_commands_in_command_if555);
					c2=commands();
					state._fsp--;

					stream_commands.add(c2.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(8);}
			dbg.location(57,64);
			string_literal22=(Token)match(input,35,FOLLOW_35_in_command_if559);  
			stream_35.add(string_literal22);

			// AST REWRITE
			// elements: expression, c1, c2, 40
			// token labels: 
			// rule labels: c1, retval, c2
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 58:7: -> ^( COMMAND 'if' expression $c1 ( $c2)? )
			{
				dbg.location(58,10);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:58:10: ^( COMMAND 'if' expression $c1 ( $c2)? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(58,12);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);
				dbg.location(58,20);
				adaptor.addChild(root_1, stream_40.nextNode());dbg.location(58,25);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(58,37);
				adaptor.addChild(root_1, stream_c1.nextTree());dbg.location(58,40);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:58:40: ( $c2)?
				if ( stream_c2.hasNext() ) {
					dbg.location(58,42);
					adaptor.addChild(root_1, stream_c2.nextTree());
				}
				stream_c2.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(59, 4);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_while"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:61:1: command_while : 'while' expression 'do' commands 'od' -> ^( COMMAND 'while' expression commands ) ;
	public final whileParser.command_while_return command_while() throws RecognitionException {
		whileParser.command_while_return retval = new whileParser.command_while_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal23=null;
		Token string_literal25=null;
		Token string_literal27=null;
		ParserRuleReturnScope expression24 =null;
		ParserRuleReturnScope commands26 =null;

		Object string_literal23_tree=null;
		Object string_literal25_tree=null;
		Object string_literal27_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "command_while");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(61, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:61:15: ( 'while' expression 'do' commands 'od' -> ^( COMMAND 'while' expression commands ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:61:17: 'while' expression 'do' commands 'od'
			{
			dbg.location(61,17);
			string_literal23=(Token)match(input,49,FOLLOW_49_in_command_while597);  
			stream_49.add(string_literal23);
			dbg.location(61,25);
			pushFollow(FOLLOW_expression_in_command_while599);
			expression24=expression();
			state._fsp--;

			stream_expression.add(expression24.getTree());dbg.location(61,36);
			string_literal25=(Token)match(input,33,FOLLOW_33_in_command_while601);  
			stream_33.add(string_literal25);
			dbg.location(61,41);
			pushFollow(FOLLOW_commands_in_command_while603);
			commands26=commands();
			state._fsp--;

			stream_commands.add(commands26.getTree());dbg.location(61,50);
			string_literal27=(Token)match(input,45,FOLLOW_45_in_command_while605);  
			stream_45.add(string_literal27);

			// AST REWRITE
			// elements: 49, expression, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 61:55: -> ^( COMMAND 'while' expression commands )
			{
				dbg.location(61,58);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:61:58: ^( COMMAND 'while' expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(61,60);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);
				dbg.location(61,68);
				adaptor.addChild(root_1, stream_49.nextNode());dbg.location(61,76);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(61,87);
				adaptor.addChild(root_1, stream_commands.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(61, 95);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_for"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:63:1: command_for : 'for' expression 'do' commands 'od' -> ^( COMMAND 'for' expression commands ) ;
	public final whileParser.command_for_return command_for() throws RecognitionException {
		whileParser.command_for_return retval = new whileParser.command_for_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal28=null;
		Token string_literal30=null;
		Token string_literal32=null;
		ParserRuleReturnScope expression29 =null;
		ParserRuleReturnScope commands31 =null;

		Object string_literal28_tree=null;
		Object string_literal30_tree=null;
		Object string_literal32_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "command_for");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(63, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:63:13: ( 'for' expression 'do' commands 'od' -> ^( COMMAND 'for' expression commands ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:63:15: 'for' expression 'do' commands 'od'
			{
			dbg.location(63,15);
			string_literal28=(Token)match(input,36,FOLLOW_36_in_command_for625);  
			stream_36.add(string_literal28);
			dbg.location(63,21);
			pushFollow(FOLLOW_expression_in_command_for627);
			expression29=expression();
			state._fsp--;

			stream_expression.add(expression29.getTree());dbg.location(63,32);
			string_literal30=(Token)match(input,33,FOLLOW_33_in_command_for629);  
			stream_33.add(string_literal30);
			dbg.location(63,37);
			pushFollow(FOLLOW_commands_in_command_for631);
			commands31=commands();
			state._fsp--;

			stream_commands.add(commands31.getTree());dbg.location(63,46);
			string_literal32=(Token)match(input,45,FOLLOW_45_in_command_for633);  
			stream_45.add(string_literal32);

			// AST REWRITE
			// elements: expression, 36, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 63:51: -> ^( COMMAND 'for' expression commands )
			{
				dbg.location(63,54);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:63:54: ^( COMMAND 'for' expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(63,56);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);
				dbg.location(63,64);
				adaptor.addChild(root_1, stream_36.nextNode());dbg.location(63,70);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(63,81);
				adaptor.addChild(root_1, stream_commands.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(63, 89);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_foreach"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:65:1: command_foreach : 'foreach' VARIABLE 'in' expression 'do' commands 'od' -> ^( COMMAND 'foreach' VARIABLE expression commands ) ;
	public final whileParser.command_foreach_return command_foreach() throws RecognitionException {
		whileParser.command_foreach_return retval = new whileParser.command_foreach_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal33=null;
		Token VARIABLE34=null;
		Token string_literal35=null;
		Token string_literal37=null;
		Token string_literal39=null;
		ParserRuleReturnScope expression36 =null;
		ParserRuleReturnScope commands38 =null;

		Object string_literal33_tree=null;
		Object VARIABLE34_tree=null;
		Object string_literal35_tree=null;
		Object string_literal37_tree=null;
		Object string_literal39_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "command_foreach");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(65, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:65:17: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' -> ^( COMMAND 'foreach' VARIABLE expression commands ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:65:19: 'foreach' VARIABLE 'in' expression 'do' commands 'od'
			{
			dbg.location(65,19);
			string_literal33=(Token)match(input,37,FOLLOW_37_in_command_foreach653);  
			stream_37.add(string_literal33);
			dbg.location(65,29);
			VARIABLE34=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_command_foreach655);  
			stream_VARIABLE.add(VARIABLE34);
			dbg.location(65,38);
			string_literal35=(Token)match(input,41,FOLLOW_41_in_command_foreach657);  
			stream_41.add(string_literal35);
			dbg.location(65,43);
			pushFollow(FOLLOW_expression_in_command_foreach659);
			expression36=expression();
			state._fsp--;

			stream_expression.add(expression36.getTree());dbg.location(65,54);
			string_literal37=(Token)match(input,33,FOLLOW_33_in_command_foreach661);  
			stream_33.add(string_literal37);
			dbg.location(65,59);
			pushFollow(FOLLOW_commands_in_command_foreach663);
			commands38=commands();
			state._fsp--;

			stream_commands.add(commands38.getTree());dbg.location(65,68);
			string_literal39=(Token)match(input,45,FOLLOW_45_in_command_foreach665);  
			stream_45.add(string_literal39);

			// AST REWRITE
			// elements: commands, expression, 37, VARIABLE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 66:5: -> ^( COMMAND 'foreach' VARIABLE expression commands )
			{
				dbg.location(66,8);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:66:8: ^( COMMAND 'foreach' VARIABLE expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(66,10);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);
				dbg.location(66,18);
				adaptor.addChild(root_1, stream_37.nextNode());dbg.location(66,28);
				adaptor.addChild(root_1, stream_VARIABLE.nextNode());dbg.location(66,37);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(66,48);
				adaptor.addChild(root_1, stream_commands.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(66, 56);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:68:1: command : ( command_nop | command_var | command_if | command_while | command_for | command_foreach );
	public final whileParser.command_return command() throws RecognitionException {
		whileParser.command_return retval = new whileParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope command_nop40 =null;
		ParserRuleReturnScope command_var41 =null;
		ParserRuleReturnScope command_if42 =null;
		ParserRuleReturnScope command_while43 =null;
		ParserRuleReturnScope command_for44 =null;
		ParserRuleReturnScope command_foreach45 =null;


		try { dbg.enterRule(getGrammarFileName(), "command");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(68, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:69:5: ( command_nop | command_var | command_if | command_while | command_for | command_foreach )
			int alt9=6;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			switch ( input.LA(1) ) {
			case 44:
				{
				alt9=1;
				}
				break;
			case VARIABLE:
				{
				alt9=2;
				}
				break;
			case 40:
				{
				alt9=3;
				}
				break;
			case 49:
				{
				alt9=4;
				}
				break;
			case 36:
				{
				alt9=5;
				}
				break;
			case 37:
				{
				alt9=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:69:7: command_nop
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(69,7);
					pushFollow(FOLLOW_command_nop_in_command695);
					command_nop40=command_nop();
					state._fsp--;

					adaptor.addChild(root_0, command_nop40.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:70:7: command_var
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(70,7);
					pushFollow(FOLLOW_command_var_in_command703);
					command_var41=command_var();
					state._fsp--;

					adaptor.addChild(root_0, command_var41.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:71:7: command_if
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(71,7);
					pushFollow(FOLLOW_command_if_in_command711);
					command_if42=command_if();
					state._fsp--;

					adaptor.addChild(root_0, command_if42.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:72:7: command_while
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(72,7);
					pushFollow(FOLLOW_command_while_in_command719);
					command_while43=command_while();
					state._fsp--;

					adaptor.addChild(root_0, command_while43.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:73:7: command_for
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(73,7);
					pushFollow(FOLLOW_command_for_in_command727);
					command_for44=command_for();
					state._fsp--;

					adaptor.addChild(root_0, command_for44.getTree());

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:74:7: command_foreach
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(74,7);
					pushFollow(FOLLOW_command_foreach_in_command735);
					command_foreach45=command_foreach();
					state._fsp--;

					adaptor.addChild(root_0, command_foreach45.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(75, 4);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase_symbol"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:77:1: exprbase_symbol : s= SYMBOL -> ^( EXPRBASE $s) ;
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
		dbg.location(77, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:77:16: (s= SYMBOL -> ^( EXPRBASE $s) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:77:18: s= SYMBOL
			{
			dbg.location(77,19);
			s=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase_symbol749);  
			stream_SYMBOL.add(s);

			// AST REWRITE
			// elements: s
			// token labels: s
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 77:27: -> ^( EXPRBASE $s)
			{
				dbg.location(77,30);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:77:30: ^( EXPRBASE $s)
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(77,32);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
				dbg.location(77,42);
				adaptor.addChild(root_1, stream_s.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(77, 43);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase_variable"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:78:1: exprbase_variable : v= VARIABLE -> ^( EXPRBASE $v) ;
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
		dbg.location(78, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:78:18: (v= VARIABLE -> ^( EXPRBASE $v) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:78:20: v= VARIABLE
			{
			dbg.location(78,21);
			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_exprbase_variable766);  
			stream_VARIABLE.add(v);

			// AST REWRITE
			// elements: v
			// token labels: v
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 78:31: -> ^( EXPRBASE $v)
			{
				dbg.location(78,34);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:78:34: ^( EXPRBASE $v)
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(78,36);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
				dbg.location(78,46);
				adaptor.addChild(root_1, stream_v.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(78, 47);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase_nil"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:79:1: exprbase_nil : 'nil' -> ^( EXPRBASE 'nil' ) ;
	public final whileParser.exprbase_nil_return exprbase_nil() throws RecognitionException {
		whileParser.exprbase_nil_return retval = new whileParser.exprbase_nil_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal46=null;

		Object string_literal46_tree=null;
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");

		try { dbg.enterRule(getGrammarFileName(), "exprbase_nil");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(79, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:79:13: ( 'nil' -> ^( EXPRBASE 'nil' ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:79:15: 'nil'
			{
			dbg.location(79,15);
			string_literal46=(Token)match(input,43,FOLLOW_43_in_exprbase_nil781);  
			stream_43.add(string_literal46);

			// AST REWRITE
			// elements: 43
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 79:21: -> ^( EXPRBASE 'nil' )
			{
				dbg.location(79,24);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:79:24: ^( EXPRBASE 'nil' )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(79,26);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
				dbg.location(79,35);
				adaptor.addChild(root_1, stream_43.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(79, 40);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase_list"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:80:1: exprbase_list : '(' 'list' lexpr ')' -> ^( EXPRBASE 'list' lexpr ) ;
	public final whileParser.exprbase_list_return exprbase_list() throws RecognitionException {
		whileParser.exprbase_list_return retval = new whileParser.exprbase_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal47=null;
		Token string_literal48=null;
		Token char_literal50=null;
		ParserRuleReturnScope lexpr49 =null;

		Object char_literal47_tree=null;
		Object string_literal48_tree=null;
		Object char_literal50_tree=null;
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");

		try { dbg.enterRule(getGrammarFileName(), "exprbase_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(80, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:80:14: ( '(' 'list' lexpr ')' -> ^( EXPRBASE 'list' lexpr ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:80:16: '(' 'list' lexpr ')'
			{
			dbg.location(80,16);
			char_literal47=(Token)match(input,26,FOLLOW_26_in_exprbase_list795);  
			stream_26.add(char_literal47);
			dbg.location(80,20);
			string_literal48=(Token)match(input,42,FOLLOW_42_in_exprbase_list797);  
			stream_42.add(string_literal48);
			dbg.location(80,27);
			pushFollow(FOLLOW_lexpr_in_exprbase_list799);
			lexpr49=lexpr();
			state._fsp--;

			stream_lexpr.add(lexpr49.getTree());dbg.location(80,33);
			char_literal50=(Token)match(input,27,FOLLOW_27_in_exprbase_list801);  
			stream_27.add(char_literal50);

			// AST REWRITE
			// elements: 42, lexpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 80:37: -> ^( EXPRBASE 'list' lexpr )
			{
				dbg.location(80,40);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:80:40: ^( EXPRBASE 'list' lexpr )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(80,42);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
				dbg.location(80,51);
				adaptor.addChild(root_1, stream_42.nextNode());dbg.location(80,58);
				adaptor.addChild(root_1, stream_lexpr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(80, 63);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase_cons"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:81:1: exprbase_cons : '(' 'cons' lexpr ')' -> ^( EXPRBASE 'cons' lexpr ) ;
	public final whileParser.exprbase_cons_return exprbase_cons() throws RecognitionException {
		whileParser.exprbase_cons_return retval = new whileParser.exprbase_cons_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal51=null;
		Token string_literal52=null;
		Token char_literal54=null;
		ParserRuleReturnScope lexpr53 =null;

		Object char_literal51_tree=null;
		Object string_literal52_tree=null;
		Object char_literal54_tree=null;
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");

		try { dbg.enterRule(getGrammarFileName(), "exprbase_cons");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(81, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:81:14: ( '(' 'cons' lexpr ')' -> ^( EXPRBASE 'cons' lexpr ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:81:16: '(' 'cons' lexpr ')'
			{
			dbg.location(81,16);
			char_literal51=(Token)match(input,26,FOLLOW_26_in_exprbase_cons817);  
			stream_26.add(char_literal51);
			dbg.location(81,20);
			string_literal52=(Token)match(input,32,FOLLOW_32_in_exprbase_cons819);  
			stream_32.add(string_literal52);
			dbg.location(81,27);
			pushFollow(FOLLOW_lexpr_in_exprbase_cons821);
			lexpr53=lexpr();
			state._fsp--;

			stream_lexpr.add(lexpr53.getTree());dbg.location(81,33);
			char_literal54=(Token)match(input,27,FOLLOW_27_in_exprbase_cons823);  
			stream_27.add(char_literal54);

			// AST REWRITE
			// elements: lexpr, 32
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 81:37: -> ^( EXPRBASE 'cons' lexpr )
			{
				dbg.location(81,40);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:81:40: ^( EXPRBASE 'cons' lexpr )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(81,42);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
				dbg.location(81,51);
				adaptor.addChild(root_1, stream_32.nextNode());dbg.location(81,58);
				adaptor.addChild(root_1, stream_lexpr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(81, 63);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase_hd"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:82:1: exprbase_hd : '(' 'hd' exprbase ')' -> ^( EXPRBASE 'hd' exprbase ) ;
	public final whileParser.exprbase_hd_return exprbase_hd() throws RecognitionException {
		whileParser.exprbase_hd_return retval = new whileParser.exprbase_hd_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal55=null;
		Token string_literal56=null;
		Token char_literal58=null;
		ParserRuleReturnScope exprbase57 =null;

		Object char_literal55_tree=null;
		Object string_literal56_tree=null;
		Object char_literal58_tree=null;
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try { dbg.enterRule(getGrammarFileName(), "exprbase_hd");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(82, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:82:12: ( '(' 'hd' exprbase ')' -> ^( EXPRBASE 'hd' exprbase ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:82:14: '(' 'hd' exprbase ')'
			{
			dbg.location(82,14);
			char_literal55=(Token)match(input,26,FOLLOW_26_in_exprbase_hd839);  
			stream_26.add(char_literal55);
			dbg.location(82,18);
			string_literal56=(Token)match(input,39,FOLLOW_39_in_exprbase_hd841);  
			stream_39.add(string_literal56);
			dbg.location(82,23);
			pushFollow(FOLLOW_exprbase_in_exprbase_hd843);
			exprbase57=exprbase();
			state._fsp--;

			stream_exprbase.add(exprbase57.getTree());dbg.location(82,32);
			char_literal58=(Token)match(input,27,FOLLOW_27_in_exprbase_hd845);  
			stream_27.add(char_literal58);

			// AST REWRITE
			// elements: 39, exprbase
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 82:36: -> ^( EXPRBASE 'hd' exprbase )
			{
				dbg.location(82,39);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:82:39: ^( EXPRBASE 'hd' exprbase )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(82,41);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
				dbg.location(82,50);
				adaptor.addChild(root_1, stream_39.nextNode());dbg.location(82,55);
				adaptor.addChild(root_1, stream_exprbase.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(82, 63);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase_tl"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:83:1: exprbase_tl : '(' 'tl' exprbase ')' -> ^( EXPRBASE 'tl' exprbase ) ;
	public final whileParser.exprbase_tl_return exprbase_tl() throws RecognitionException {
		whileParser.exprbase_tl_return retval = new whileParser.exprbase_tl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal59=null;
		Token string_literal60=null;
		Token char_literal62=null;
		ParserRuleReturnScope exprbase61 =null;

		Object char_literal59_tree=null;
		Object string_literal60_tree=null;
		Object char_literal62_tree=null;
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try { dbg.enterRule(getGrammarFileName(), "exprbase_tl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(83, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:83:12: ( '(' 'tl' exprbase ')' -> ^( EXPRBASE 'tl' exprbase ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:83:14: '(' 'tl' exprbase ')'
			{
			dbg.location(83,14);
			char_literal59=(Token)match(input,26,FOLLOW_26_in_exprbase_tl861);  
			stream_26.add(char_literal59);
			dbg.location(83,18);
			string_literal60=(Token)match(input,48,FOLLOW_48_in_exprbase_tl863);  
			stream_48.add(string_literal60);
			dbg.location(83,23);
			pushFollow(FOLLOW_exprbase_in_exprbase_tl865);
			exprbase61=exprbase();
			state._fsp--;

			stream_exprbase.add(exprbase61.getTree());dbg.location(83,32);
			char_literal62=(Token)match(input,27,FOLLOW_27_in_exprbase_tl867);  
			stream_27.add(char_literal62);

			// AST REWRITE
			// elements: exprbase, 48
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 83:36: -> ^( EXPRBASE 'tl' exprbase )
			{
				dbg.location(83,39);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:83:39: ^( EXPRBASE 'tl' exprbase )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(83,41);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
				dbg.location(83,50);
				adaptor.addChild(root_1, stream_48.nextNode());dbg.location(83,55);
				adaptor.addChild(root_1, stream_exprbase.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(83, 63);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase_symbol2"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:84:1: exprbase_symbol2 : '(' a= SYMBOL lexpr ')' -> ^( EXPRBASE $a lexpr ) ;
	public final whileParser.exprbase_symbol2_return exprbase_symbol2() throws RecognitionException {
		whileParser.exprbase_symbol2_return retval = new whileParser.exprbase_symbol2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token a=null;
		Token char_literal63=null;
		Token char_literal65=null;
		ParserRuleReturnScope lexpr64 =null;

		Object a_tree=null;
		Object char_literal63_tree=null;
		Object char_literal65_tree=null;
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");

		try { dbg.enterRule(getGrammarFileName(), "exprbase_symbol2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(84, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:84:17: ( '(' a= SYMBOL lexpr ')' -> ^( EXPRBASE $a lexpr ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:84:19: '(' a= SYMBOL lexpr ')'
			{
			dbg.location(84,19);
			char_literal63=(Token)match(input,26,FOLLOW_26_in_exprbase_symbol2883);  
			stream_26.add(char_literal63);
			dbg.location(84,24);
			a=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase_symbol2887);  
			stream_SYMBOL.add(a);
			dbg.location(84,32);
			pushFollow(FOLLOW_lexpr_in_exprbase_symbol2889);
			lexpr64=lexpr();
			state._fsp--;

			stream_lexpr.add(lexpr64.getTree());dbg.location(84,38);
			char_literal65=(Token)match(input,27,FOLLOW_27_in_exprbase_symbol2891);  
			stream_27.add(char_literal65);

			// AST REWRITE
			// elements: a, lexpr
			// token labels: a
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 84:42: -> ^( EXPRBASE $a lexpr )
			{
				dbg.location(84,45);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:84:45: ^( EXPRBASE $a lexpr )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(84,47);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
				dbg.location(84,57);
				adaptor.addChild(root_1, stream_a.nextNode());dbg.location(84,59);
				adaptor.addChild(root_1, stream_lexpr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(84, 64);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:86:1: exprbase : ( exprbase_nil | exprbase_variable | exprbase_list | exprbase_cons | exprbase_hd | exprbase_tl | exprbase_symbol2 | exprbase_symbol );
	public final whileParser.exprbase_return exprbase() throws RecognitionException {
		whileParser.exprbase_return retval = new whileParser.exprbase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprbase_nil66 =null;
		ParserRuleReturnScope exprbase_variable67 =null;
		ParserRuleReturnScope exprbase_list68 =null;
		ParserRuleReturnScope exprbase_cons69 =null;
		ParserRuleReturnScope exprbase_hd70 =null;
		ParserRuleReturnScope exprbase_tl71 =null;
		ParserRuleReturnScope exprbase_symbol272 =null;
		ParserRuleReturnScope exprbase_symbol73 =null;


		try { dbg.enterRule(getGrammarFileName(), "exprbase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(86, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:87:5: ( exprbase_nil | exprbase_variable | exprbase_list | exprbase_cons | exprbase_hd | exprbase_tl | exprbase_symbol2 | exprbase_symbol )
			int alt10=8;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			switch ( input.LA(1) ) {
			case 43:
				{
				alt10=1;
				}
				break;
			case VARIABLE:
				{
				alt10=2;
				}
				break;
			case 26:
				{
				switch ( input.LA(2) ) {
				case 42:
					{
					alt10=3;
					}
					break;
				case 32:
					{
					alt10=4;
					}
					break;
				case 39:
					{
					alt10=5;
					}
					break;
				case 48:
					{
					alt10=6;
					}
					break;
				case SYMBOL:
					{
					alt10=7;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 3, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case SYMBOL:
				{
				alt10=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:87:7: exprbase_nil
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(87,7);
					pushFollow(FOLLOW_exprbase_nil_in_exprbase914);
					exprbase_nil66=exprbase_nil();
					state._fsp--;

					adaptor.addChild(root_0, exprbase_nil66.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:88:7: exprbase_variable
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(88,7);
					pushFollow(FOLLOW_exprbase_variable_in_exprbase922);
					exprbase_variable67=exprbase_variable();
					state._fsp--;

					adaptor.addChild(root_0, exprbase_variable67.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:89:7: exprbase_list
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(89,7);
					pushFollow(FOLLOW_exprbase_list_in_exprbase930);
					exprbase_list68=exprbase_list();
					state._fsp--;

					adaptor.addChild(root_0, exprbase_list68.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:90:7: exprbase_cons
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(90,7);
					pushFollow(FOLLOW_exprbase_cons_in_exprbase938);
					exprbase_cons69=exprbase_cons();
					state._fsp--;

					adaptor.addChild(root_0, exprbase_cons69.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:91:7: exprbase_hd
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(91,7);
					pushFollow(FOLLOW_exprbase_hd_in_exprbase946);
					exprbase_hd70=exprbase_hd();
					state._fsp--;

					adaptor.addChild(root_0, exprbase_hd70.getTree());

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:92:7: exprbase_tl
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(92,7);
					pushFollow(FOLLOW_exprbase_tl_in_exprbase954);
					exprbase_tl71=exprbase_tl();
					state._fsp--;

					adaptor.addChild(root_0, exprbase_tl71.getTree());

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:93:7: exprbase_symbol2
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(93,7);
					pushFollow(FOLLOW_exprbase_symbol2_in_exprbase962);
					exprbase_symbol272=exprbase_symbol2();
					state._fsp--;

					adaptor.addChild(root_0, exprbase_symbol272.getTree());

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:94:7: exprbase_symbol
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(94,7);
					pushFollow(FOLLOW_exprbase_symbol_in_exprbase970);
					exprbase_symbol73=exprbase_symbol();
					state._fsp--;

					adaptor.addChild(root_0, exprbase_symbol73.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(95, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprbase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exprbase"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:97:1: expression : c= exprbase ( '=?' d= exprbase )? -> ^( EXPRESSION $c ( $d)? ) ;
	public final whileParser.expression_return expression() throws RecognitionException {
		whileParser.expression_return retval = new whileParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal74=null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope d =null;

		Object string_literal74_tree=null;
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(97, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:97:12: (c= exprbase ( '=?' d= exprbase )? -> ^( EXPRESSION $c ( $d)? ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:97:14: c= exprbase ( '=?' d= exprbase )?
			{
			dbg.location(97,15);
			pushFollow(FOLLOW_exprbase_in_expression985);
			c=exprbase();
			state._fsp--;

			stream_exprbase.add(c.getTree());dbg.location(97,25);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:97:25: ( '=?' d= exprbase )?
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==31) ) {
				alt11=1;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:97:26: '=?' d= exprbase
					{
					dbg.location(97,26);
					string_literal74=(Token)match(input,31,FOLLOW_31_in_expression988);  
					stream_31.add(string_literal74);
					dbg.location(97,32);
					pushFollow(FOLLOW_exprbase_in_expression992);
					d=exprbase();
					state._fsp--;

					stream_exprbase.add(d.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(11);}

			// AST REWRITE
			// elements: c, d
			// token labels: 
			// rule labels: c, d, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_d=new RewriteRuleSubtreeStream(adaptor,"rule d",d!=null?d.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 97:44: -> ^( EXPRESSION $c ( $d)? )
			{
				dbg.location(97,47);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:97:47: ^( EXPRESSION $c ( $d)? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(97,49);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSION, "EXPRESSION"), root_1);
				dbg.location(97,61);
				adaptor.addChild(root_1, stream_c.nextTree());dbg.location(97,63);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:97:63: ( $d)?
				if ( stream_d.hasNext() ) {
					dbg.location(97,65);
					adaptor.addChild(root_1, stream_d.nextTree());
				}
				stream_d.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(97, 68);

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
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lexpr"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:99:1: lexpr : (e= exprbase )* -> ^( LEXPR ( $e)* ) ;
	public final whileParser.lexpr_return lexpr() throws RecognitionException {
		whileParser.lexpr_return retval = new whileParser.lexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope e =null;

		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try { dbg.enterRule(getGrammarFileName(), "lexpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(99, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:99:7: ( (e= exprbase )* -> ^( LEXPR ( $e)* ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:99:9: (e= exprbase )*
			{
			dbg.location(99,10);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:99:10: (e= exprbase )*
			try { dbg.enterSubRule(12);

			loop12:
			while (true) {
				int alt12=2;
				try { dbg.enterDecision(12, decisionCanBacktrack[12]);

				int LA12_0 = input.LA(1);
				if ( (LA12_0==SYMBOL||LA12_0==VARIABLE||LA12_0==26||LA12_0==43) ) {
					alt12=1;
				}

				} finally {dbg.exitDecision(12);}

				switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:99:10: e= exprbase
					{
					dbg.location(99,10);
					pushFollow(FOLLOW_exprbase_in_lexpr1019);
					e=exprbase();
					state._fsp--;

					stream_exprbase.add(e.getTree());
					}
					break;

				default :
					break loop12;
				}
			}
			} finally {dbg.exitSubRule(12);}

			// AST REWRITE
			// elements: e
			// token labels: 
			// rule labels: e, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 99:21: -> ^( LEXPR ( $e)* )
			{
				dbg.location(99,24);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:99:24: ^( LEXPR ( $e)* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(99,26);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LEXPR, "LEXPR"), root_1);
				dbg.location(99,33);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:99:33: ( $e)*
				while ( stream_e.hasNext() ) {
					dbg.location(99,33);
					adaptor.addChild(root_1, stream_e.nextTree());
				}
				stream_e.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(99, 35);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lexpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "lexpr"

	// Delegated rules



	public static final BitSet FOLLOW_function_in_program248 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_function266 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_SYMBOL_in_function270 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_function272 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_definition_in_function274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_definition297 = new BitSet(new long[]{0x0000000000880000L});
	public static final BitSet FOLLOW_input_in_definition301 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PERCENT_in_definition304 = new BitSet(new long[]{0x0002113000800000L});
	public static final BitSet FOLLOW_commands_in_definition308 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PERCENT_in_definition310 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_definition312 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_output_in_definition316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_input355 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_COMMA_in_input358 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VARIABLE_in_input362 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_VARIABLE_in_output384 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_COMMA_in_output387 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VARIABLE_in_output391 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_VARIABLE_in_vars413 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_COMMA_in_vars416 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VARIABLE_in_vars420 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_expression_in_exprs442 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_COMMA_in_exprs445 = new BitSet(new long[]{0x0000080004A00000L});
	public static final BitSet FOLLOW_expression_in_exprs449 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_command_in_commands471 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_commands475 = new BitSet(new long[]{0x0002113000800000L});
	public static final BitSet FOLLOW_command_in_commands479 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_44_in_command_nop500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command_var514 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_command_var516 = new BitSet(new long[]{0x0000080004A00000L});
	public static final BitSet FOLLOW_exprs_in_command_var518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_command_if540 = new BitSet(new long[]{0x0000080004A00000L});
	public static final BitSet FOLLOW_expression_in_command_if542 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_command_if544 = new BitSet(new long[]{0x0002113000800000L});
	public static final BitSet FOLLOW_commands_in_command_if548 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_34_in_command_if551 = new BitSet(new long[]{0x0002113000800000L});
	public static final BitSet FOLLOW_commands_in_command_if555 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_command_if559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_command_while597 = new BitSet(new long[]{0x0000080004A00000L});
	public static final BitSet FOLLOW_expression_in_command_while599 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_command_while601 = new BitSet(new long[]{0x0002113000800000L});
	public static final BitSet FOLLOW_commands_in_command_while603 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_command_while605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_command_for625 = new BitSet(new long[]{0x0000080004A00000L});
	public static final BitSet FOLLOW_expression_in_command_for627 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_command_for629 = new BitSet(new long[]{0x0002113000800000L});
	public static final BitSet FOLLOW_commands_in_command_for631 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_command_for633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_command_foreach653 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VARIABLE_in_command_foreach655 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_command_foreach657 = new BitSet(new long[]{0x0000080004A00000L});
	public static final BitSet FOLLOW_expression_in_command_foreach659 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_command_foreach661 = new BitSet(new long[]{0x0002113000800000L});
	public static final BitSet FOLLOW_commands_in_command_foreach663 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_command_foreach665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_nop_in_command695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_var_in_command703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_if_in_command711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_while_in_command719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_for_in_command727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_foreach_in_command735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase_symbol749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_exprbase_variable766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_exprbase_nil781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_exprbase_list795 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_exprbase_list797 = new BitSet(new long[]{0x000008000CA00000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase_list799 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_exprbase_list801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_exprbase_cons817 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_exprbase_cons819 = new BitSet(new long[]{0x000008000CA00000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase_cons821 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_exprbase_cons823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_exprbase_hd839 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_exprbase_hd841 = new BitSet(new long[]{0x0000080004A00000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase_hd843 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_exprbase_hd845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_exprbase_tl861 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_exprbase_tl863 = new BitSet(new long[]{0x0000080004A00000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase_tl865 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_exprbase_tl867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_exprbase_symbol2883 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase_symbol2887 = new BitSet(new long[]{0x000008000CA00000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase_symbol2889 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_exprbase_symbol2891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_nil_in_exprbase914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_variable_in_exprbase922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_list_in_exprbase930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_cons_in_exprbase938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_hd_in_exprbase946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_tl_in_exprbase954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_symbol2_in_exprbase962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_symbol_in_exprbase970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_expression985 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_expression988 = new BitSet(new long[]{0x0000080004A00000L});
	public static final BitSet FOLLOW_exprbase_in_expression992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_lexpr1019 = new BitSet(new long[]{0x0000080004A00002L});
}
