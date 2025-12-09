// $ANTLR 3.5.1 C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g 2025-12-09 09:33:24

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
		"CONS", "DEFINITION", "DO", "ELSE", "EXPRBASE", "EXPRESSION", "EXPRESSIONS", 
		"EXPRS", "FI", "FOR", "FOREACH", "FUNCTION", "HD", "IF", "IN", "INPUT", 
		"INPUTSUB", "LEXPR", "LIST", "NIL", "NOP", "OD", "OUTPUT", "PERCENT", 
		"PROGRAM", "READ", "SYMBOL", "THEN", "TL", "VAR", "VARIABLE", "VARIABLES", 
		"VARS", "WHILE", "WRITE", "WS", "'('", "')'", "':'", "':='", "';'", "'=?'"
	};
	public static final int EOF=-1;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int COMMA=4;
	public static final int COMMAND=5;
	public static final int COMMANDS=6;
	public static final int CONS=7;
	public static final int DEFINITION=8;
	public static final int DO=9;
	public static final int ELSE=10;
	public static final int EXPRBASE=11;
	public static final int EXPRESSION=12;
	public static final int EXPRESSIONS=13;
	public static final int EXPRS=14;
	public static final int FI=15;
	public static final int FOR=16;
	public static final int FOREACH=17;
	public static final int FUNCTION=18;
	public static final int HD=19;
	public static final int IF=20;
	public static final int IN=21;
	public static final int INPUT=22;
	public static final int INPUTSUB=23;
	public static final int LEXPR=24;
	public static final int LIST=25;
	public static final int NIL=26;
	public static final int NOP=27;
	public static final int OD=28;
	public static final int OUTPUT=29;
	public static final int PERCENT=30;
	public static final int PROGRAM=31;
	public static final int READ=32;
	public static final int SYMBOL=33;
	public static final int THEN=34;
	public static final int TL=35;
	public static final int VAR=36;
	public static final int VARIABLE=37;
	public static final int VARIABLES=38;
	public static final int VARS=39;
	public static final int WHILE=40;
	public static final int WRITE=41;
	public static final int WS=42;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "command", "vars", "expression", "exprs", "command_nop", 
		"definition", "command_for", "function", "input", "command_if", "output", 
		"program", "command_var", "lexpr", "commands", "command_while", "command_foreach", 
		"exprbase", "exprbase_paren"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false
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
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:55:1: program : ( function )+ -> ^( PROGRAM ( function )+ ) ;
	public final whileParser.program_return program() throws RecognitionException {
		whileParser.program_return retval = new whileParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function1 =null;

		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(55, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:55:9: ( ( function )+ -> ^( PROGRAM ( function )+ ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:56:5: ( function )+
			{
			dbg.location(56,5);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:56:5: ( function )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==FUNCTION) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:56:5: function
					{
					dbg.location(56,5);
					pushFollow(FOLLOW_function_in_program498);
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
			// 56:15: -> ^( PROGRAM ( function )+ )
			{
				dbg.location(56,18);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:56:18: ^( PROGRAM ( function )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(56,20);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				dbg.location(56,28);
				if ( !(stream_function.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_function.hasNext() ) {
					dbg.location(56,28);
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
		dbg.location(57, 4);

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
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:59:1: function : FUNCTION s= SYMBOL ':' definition -> ^( FUNCTION $s definition ) ;
	public final whileParser.function_return function() throws RecognitionException {
		whileParser.function_return retval = new whileParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token s=null;
		Token FUNCTION2=null;
		Token char_literal3=null;
		ParserRuleReturnScope definition4 =null;

		Object s_tree=null;
		Object FUNCTION2_tree=null;
		Object char_literal3_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(59, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:59:10: ( FUNCTION s= SYMBOL ':' definition -> ^( FUNCTION $s definition ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:60:5: FUNCTION s= SYMBOL ':' definition
			{
			dbg.location(60,5);
			FUNCTION2=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function525);  
			stream_FUNCTION.add(FUNCTION2);
			dbg.location(60,15);
			s=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_function529);  
			stream_SYMBOL.add(s);
			dbg.location(60,23);
			char_literal3=(Token)match(input,45,FOLLOW_45_in_function531);  
			stream_45.add(char_literal3);
			dbg.location(60,27);
			pushFollow(FOLLOW_definition_in_function533);
			definition4=definition();
			state._fsp--;

			stream_definition.add(definition4.getTree());
			// AST REWRITE
			// elements: s, FUNCTION, definition
			// token labels: s
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 61:9: -> ^( FUNCTION $s definition )
			{
				dbg.location(61,12);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:61:12: ^( FUNCTION $s definition )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(61,14);
				root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);
				dbg.location(61,24);
				adaptor.addChild(root_1, stream_s.nextNode());dbg.location(61,26);
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
		dbg.location(62, 4);

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
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:64:1: definition : READ (i= input )? PERCENT c= commands PERCENT WRITE o= output -> ^( DEFINITION ^( INPUT ( $i)? ) ^( OUTPUT $o) $c) ;
	public final whileParser.definition_return definition() throws RecognitionException {
		whileParser.definition_return retval = new whileParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ5=null;
		Token PERCENT6=null;
		Token PERCENT7=null;
		Token WRITE8=null;
		ParserRuleReturnScope i =null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope o =null;

		Object READ5_tree=null;
		Object PERCENT6_tree=null;
		Object PERCENT7_tree=null;
		Object WRITE8_tree=null;
		RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");
		RewriteRuleTokenStream stream_PERCENT=new RewriteRuleTokenStream(adaptor,"token PERCENT");
		RewriteRuleTokenStream stream_WRITE=new RewriteRuleTokenStream(adaptor,"token WRITE");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(64, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:64:12: ( READ (i= input )? PERCENT c= commands PERCENT WRITE o= output -> ^( DEFINITION ^( INPUT ( $i)? ) ^( OUTPUT $o) $c) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:65:7: READ (i= input )? PERCENT c= commands PERCENT WRITE o= output
			{
			dbg.location(65,7);
			READ5=(Token)match(input,READ,FOLLOW_READ_in_definition571);  
			stream_READ.add(READ5);
			dbg.location(65,13);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:65:13: (i= input )?
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

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:65:13: i= input
					{
					dbg.location(65,13);
					pushFollow(FOLLOW_input_in_definition575);
					i=input();
					state._fsp--;

					stream_input.add(i.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(65,21);
			PERCENT6=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_definition578);  
			stream_PERCENT.add(PERCENT6);
			dbg.location(65,30);
			pushFollow(FOLLOW_commands_in_definition582);
			c=commands();
			state._fsp--;

			stream_commands.add(c.getTree());dbg.location(65,40);
			PERCENT7=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_definition584);  
			stream_PERCENT.add(PERCENT7);
			dbg.location(65,48);
			WRITE8=(Token)match(input,WRITE,FOLLOW_WRITE_in_definition586);  
			stream_WRITE.add(WRITE8);
			dbg.location(65,55);
			pushFollow(FOLLOW_output_in_definition590);
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
			// 66:7: -> ^( DEFINITION ^( INPUT ( $i)? ) ^( OUTPUT $o) $c)
			{
				dbg.location(66,10);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:66:10: ^( DEFINITION ^( INPUT ( $i)? ) ^( OUTPUT $o) $c)
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(66,12);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFINITION, "DEFINITION"), root_1);
				dbg.location(66,23);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:66:23: ^( INPUT ( $i)? )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(66,25);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_2);
				dbg.location(66,32);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:66:32: ( $i)?
				if ( stream_i.hasNext() ) {
					dbg.location(66,32);
					adaptor.addChild(root_2, stream_i.nextTree());
				}
				stream_i.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(66,36);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:66:36: ^( OUTPUT $o)
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(66,38);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_2);
				dbg.location(66,46);
				adaptor.addChild(root_2, stream_o.nextTree());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(66,50);
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
		dbg.location(67, 4);

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
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:69:1: input : v= VARIABLE ( COMMA v= VARIABLE )* -> ^( INPUT ( $v)+ ) ;
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
		dbg.location(69, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:69:7: (v= VARIABLE ( COMMA v= VARIABLE )* -> ^( INPUT ( $v)+ ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:70:7: v= VARIABLE ( COMMA v= VARIABLE )*
			{
			dbg.location(70,8);
			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_input641);  
			stream_VARIABLE.add(v);
			dbg.location(70,18);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:70:18: ( COMMA v= VARIABLE )*
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

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:70:19: COMMA v= VARIABLE
					{
					dbg.location(70,19);
					COMMA9=(Token)match(input,COMMA,FOLLOW_COMMA_in_input644);  
					stream_COMMA.add(COMMA9);
					dbg.location(70,26);
					v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_input648);  
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
			// 71:7: -> ^( INPUT ( $v)+ )
			{
				dbg.location(71,10);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:71:10: ^( INPUT ( $v)+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(71,12);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);
				dbg.location(71,19);
				if ( !(stream_v.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_v.hasNext() ) {
					dbg.location(71,19);
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
		dbg.location(72, 4);

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
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:74:1: output : v= VARIABLE ( COMMA v= VARIABLE )* -> ^( OUTPUT ( $v)+ ) ;
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
		dbg.location(74, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:74:8: (v= VARIABLE ( COMMA v= VARIABLE )* -> ^( OUTPUT ( $v)+ ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:75:7: v= VARIABLE ( COMMA v= VARIABLE )*
			{
			dbg.location(75,8);
			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output687);  
			stream_VARIABLE.add(v);
			dbg.location(75,18);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:75:18: ( COMMA v= VARIABLE )*
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

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:75:19: COMMA v= VARIABLE
					{
					dbg.location(75,19);
					COMMA10=(Token)match(input,COMMA,FOLLOW_COMMA_in_output690);  
					stream_COMMA.add(COMMA10);
					dbg.location(75,26);
					v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output694);  
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
			// 76:7: -> ^( OUTPUT ( $v)+ )
			{
				dbg.location(76,10);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:76:10: ^( OUTPUT ( $v)+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(76,12);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);
				dbg.location(76,20);
				if ( !(stream_v.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_v.hasNext() ) {
					dbg.location(76,20);
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
		dbg.location(77, 4);

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
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:79:1: vars : v= VARIABLE ( COMMA v= VARIABLE )* -> ^( VARIABLES ( $v)+ ) ;
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
		dbg.location(79, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:79:6: (v= VARIABLE ( COMMA v= VARIABLE )* -> ^( VARIABLES ( $v)+ ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:80:7: v= VARIABLE ( COMMA v= VARIABLE )*
			{
			dbg.location(80,8);
			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars733);  
			stream_VARIABLE.add(v);
			dbg.location(80,18);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:80:18: ( COMMA v= VARIABLE )*
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

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:80:19: COMMA v= VARIABLE
					{
					dbg.location(80,19);
					COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_vars736);  
					stream_COMMA.add(COMMA11);
					dbg.location(80,26);
					v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars740);  
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
			// 81:7: -> ^( VARIABLES ( $v)+ )
			{
				dbg.location(81,10);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:81:10: ^( VARIABLES ( $v)+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(81,12);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_1);
				dbg.location(81,23);
				if ( !(stream_v.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_v.hasNext() ) {
					dbg.location(81,23);
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
		dbg.location(82, 4);

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
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:84:1: exprs : e= expression ( COMMA e= expression )* -> ^( EXPRESSIONS ( $e)+ ) ;
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
		dbg.location(84, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:84:7: (e= expression ( COMMA e= expression )* -> ^( EXPRESSIONS ( $e)+ ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:85:7: e= expression ( COMMA e= expression )*
			{
			dbg.location(85,8);
			pushFollow(FOLLOW_expression_in_exprs779);
			e=expression();
			state._fsp--;

			stream_expression.add(e.getTree());dbg.location(85,20);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:85:20: ( COMMA e= expression )*
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

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:85:21: COMMA e= expression
					{
					dbg.location(85,21);
					COMMA12=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprs782);  
					stream_COMMA.add(COMMA12);
					dbg.location(85,28);
					pushFollow(FOLLOW_expression_in_exprs786);
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
			// 86:7: -> ^( EXPRESSIONS ( $e)+ )
			{
				dbg.location(86,10);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:86:10: ^( EXPRESSIONS ( $e)+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(86,12);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSIONS, "EXPRESSIONS"), root_1);
				dbg.location(86,25);
				if ( !(stream_e.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_e.hasNext() ) {
					dbg.location(86,25);
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
		dbg.location(87, 4);

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
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:89:1: commands : c= command ( ';' c= command )* -> ^( COMMANDS ( $c)+ ) ;
	public final whileParser.commands_return commands() throws RecognitionException {
		whileParser.commands_return retval = new whileParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal13=null;
		ParserRuleReturnScope c =null;

		Object char_literal13_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");

		try { dbg.enterRule(getGrammarFileName(), "commands");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(89, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:89:10: (c= command ( ';' c= command )* -> ^( COMMANDS ( $c)+ ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:90:7: c= command ( ';' c= command )*
			{
			dbg.location(90,8);
			pushFollow(FOLLOW_command_in_commands825);
			c=command();
			state._fsp--;

			stream_command.add(c.getTree());dbg.location(90,17);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:90:17: ( ';' c= command )*
			try { dbg.enterSubRule(7);

			loop7:
			while (true) {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==47) ) {
					alt7=1;
				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:90:19: ';' c= command
					{
					dbg.location(90,19);
					char_literal13=(Token)match(input,47,FOLLOW_47_in_commands829);  
					stream_47.add(char_literal13);
					dbg.location(90,24);
					pushFollow(FOLLOW_command_in_commands833);
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
			// 91:7: -> ^( COMMANDS ( $c)+ )
			{
				dbg.location(91,10);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:91:10: ^( COMMANDS ( $c)+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(91,12);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_1);
				dbg.location(91,22);
				if ( !(stream_c.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_c.hasNext() ) {
					dbg.location(91,22);
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
		dbg.location(92, 4);

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
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:94:1: command_nop : 'nop' -> ^( NOP ) ;
	public final whileParser.command_nop_return command_nop() throws RecognitionException {
		whileParser.command_nop_return retval = new whileParser.command_nop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal14=null;

		Object string_literal14_tree=null;
		RewriteRuleTokenStream stream_NOP=new RewriteRuleTokenStream(adaptor,"token NOP");

		try { dbg.enterRule(getGrammarFileName(), "command_nop");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(94, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:94:13: ( 'nop' -> ^( NOP ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:95:7: 'nop'
			{
			dbg.location(95,7);
			string_literal14=(Token)match(input,NOP,FOLLOW_NOP_in_command_nop871);  
			stream_NOP.add(string_literal14);

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
			// 95:13: -> ^( NOP )
			{
				dbg.location(95,16);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:95:16: ^( NOP )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(95,18);
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
		dbg.location(96, 4);

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
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:98:1: command_var : vars ':=' exprs -> ^( VAR vars exprs ) ;
	public final whileParser.command_var_return command_var() throws RecognitionException {
		whileParser.command_var_return retval = new whileParser.command_var_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal16=null;
		ParserRuleReturnScope vars15 =null;
		ParserRuleReturnScope exprs17 =null;

		Object string_literal16_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try { dbg.enterRule(getGrammarFileName(), "command_var");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(98, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:98:13: ( vars ':=' exprs -> ^( VAR vars exprs ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:99:7: vars ':=' exprs
			{
			dbg.location(99,7);
			pushFollow(FOLLOW_vars_in_command_var896);
			vars15=vars();
			state._fsp--;

			stream_vars.add(vars15.getTree());dbg.location(99,12);
			string_literal16=(Token)match(input,46,FOLLOW_46_in_command_var898);  
			stream_46.add(string_literal16);
			dbg.location(99,17);
			pushFollow(FOLLOW_exprs_in_command_var900);
			exprs17=exprs();
			state._fsp--;

			stream_exprs.add(exprs17.getTree());
			// AST REWRITE
			// elements: vars, exprs
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 99:23: -> ^( VAR vars exprs )
			{
				dbg.location(99,26);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:99:26: ^( VAR vars exprs )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(99,28);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
				dbg.location(99,32);
				adaptor.addChild(root_1, stream_vars.nextTree());dbg.location(99,37);
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
		dbg.location(100, 4);

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
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:102:1: command_if : 'if' expression 'then' c1= commands ( 'else' c2= commands )? 'fi' -> ^( COMMAND 'if' expression $c1 ( $c2)? ) ;
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
		RewriteRuleTokenStream stream_FI=new RewriteRuleTokenStream(adaptor,"token FI");
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "command_if");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(102, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:102:12: ( 'if' expression 'then' c1= commands ( 'else' c2= commands )? 'fi' -> ^( COMMAND 'if' expression $c1 ( $c2)? ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:103:5: 'if' expression 'then' c1= commands ( 'else' c2= commands )? 'fi'
			{
			dbg.location(103,5);
			string_literal18=(Token)match(input,IF,FOLLOW_IF_in_command_if927);  
			stream_IF.add(string_literal18);
			dbg.location(103,10);
			pushFollow(FOLLOW_expression_in_command_if929);
			expression19=expression();
			state._fsp--;

			stream_expression.add(expression19.getTree());dbg.location(103,21);
			string_literal20=(Token)match(input,THEN,FOLLOW_THEN_in_command_if931);  
			stream_THEN.add(string_literal20);
			dbg.location(103,30);
			pushFollow(FOLLOW_commands_in_command_if935);
			c1=commands();
			state._fsp--;

			stream_commands.add(c1.getTree());dbg.location(103,40);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:103:40: ( 'else' c2= commands )?
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==ELSE) ) {
				alt8=1;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:103:41: 'else' c2= commands
					{
					dbg.location(103,41);
					string_literal21=(Token)match(input,ELSE,FOLLOW_ELSE_in_command_if938);  
					stream_ELSE.add(string_literal21);
					dbg.location(103,50);
					pushFollow(FOLLOW_commands_in_command_if942);
					c2=commands();
					state._fsp--;

					stream_commands.add(c2.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(8);}
			dbg.location(103,62);
			string_literal22=(Token)match(input,FI,FOLLOW_FI_in_command_if946);  
			stream_FI.add(string_literal22);

			// AST REWRITE
			// elements: c2, expression, c1, IF
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
			// 104:9: -> ^( COMMAND 'if' expression $c1 ( $c2)? )
			{
				dbg.location(104,12);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:104:12: ^( COMMAND 'if' expression $c1 ( $c2)? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(104,14);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);
				dbg.location(104,22);
				adaptor.addChild(root_1, stream_IF.nextNode());dbg.location(104,27);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(104,39);
				adaptor.addChild(root_1, stream_c1.nextTree());dbg.location(104,42);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:104:42: ( $c2)?
				if ( stream_c2.hasNext() ) {
					dbg.location(104,44);
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
		dbg.location(105, 4);

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
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:107:1: command_while : 'while' expression 'do' commands 'od' -> ^( COMMAND 'while' expression commands ) ;
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
		RewriteRuleTokenStream stream_OD=new RewriteRuleTokenStream(adaptor,"token OD");
		RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
		RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "command_while");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(107, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:107:15: ( 'while' expression 'do' commands 'od' -> ^( COMMAND 'while' expression commands ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:108:7: 'while' expression 'do' commands 'od'
			{
			dbg.location(108,7);
			string_literal23=(Token)match(input,WHILE,FOLLOW_WHILE_in_command_while992);  
			stream_WHILE.add(string_literal23);
			dbg.location(108,15);
			pushFollow(FOLLOW_expression_in_command_while994);
			expression24=expression();
			state._fsp--;

			stream_expression.add(expression24.getTree());dbg.location(108,26);
			string_literal25=(Token)match(input,DO,FOLLOW_DO_in_command_while996);  
			stream_DO.add(string_literal25);
			dbg.location(108,31);
			pushFollow(FOLLOW_commands_in_command_while998);
			commands26=commands();
			state._fsp--;

			stream_commands.add(commands26.getTree());dbg.location(108,40);
			string_literal27=(Token)match(input,OD,FOLLOW_OD_in_command_while1000);  
			stream_OD.add(string_literal27);

			// AST REWRITE
			// elements: expression, WHILE, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 109:7: -> ^( COMMAND 'while' expression commands )
			{
				dbg.location(109,10);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:109:10: ^( COMMAND 'while' expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(109,12);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);
				dbg.location(109,20);
				adaptor.addChild(root_1, stream_WHILE.nextNode());dbg.location(109,28);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(109,39);
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
		dbg.location(110, 4);

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
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:112:1: command_for : 'for' expression 'do' commands 'od' -> ^( COMMAND 'for' expression commands ) ;
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
		RewriteRuleTokenStream stream_OD=new RewriteRuleTokenStream(adaptor,"token OD");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "command_for");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(112, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:112:13: ( 'for' expression 'do' commands 'od' -> ^( COMMAND 'for' expression commands ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:113:7: 'for' expression 'do' commands 'od'
			{
			dbg.location(113,7);
			string_literal28=(Token)match(input,FOR,FOLLOW_FOR_in_command_for1037);  
			stream_FOR.add(string_literal28);
			dbg.location(113,13);
			pushFollow(FOLLOW_expression_in_command_for1039);
			expression29=expression();
			state._fsp--;

			stream_expression.add(expression29.getTree());dbg.location(113,24);
			string_literal30=(Token)match(input,DO,FOLLOW_DO_in_command_for1041);  
			stream_DO.add(string_literal30);
			dbg.location(113,29);
			pushFollow(FOLLOW_commands_in_command_for1043);
			commands31=commands();
			state._fsp--;

			stream_commands.add(commands31.getTree());dbg.location(113,38);
			string_literal32=(Token)match(input,OD,FOLLOW_OD_in_command_for1045);  
			stream_OD.add(string_literal32);

			// AST REWRITE
			// elements: commands, FOR, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 114:7: -> ^( COMMAND 'for' expression commands )
			{
				dbg.location(114,10);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:114:10: ^( COMMAND 'for' expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(114,12);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);
				dbg.location(114,20);
				adaptor.addChild(root_1, stream_FOR.nextNode());dbg.location(114,26);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(114,37);
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
		dbg.location(115, 4);

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
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:117:1: command_foreach : 'foreach' VARIABLE 'in' expression 'do' commands 'od' -> ^( COMMAND 'foreach' VARIABLE expression commands ) ;
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
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_OD=new RewriteRuleTokenStream(adaptor,"token OD");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
		RewriteRuleTokenStream stream_FOREACH=new RewriteRuleTokenStream(adaptor,"token FOREACH");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "command_foreach");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(117, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:117:17: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' -> ^( COMMAND 'foreach' VARIABLE expression commands ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:118:7: 'foreach' VARIABLE 'in' expression 'do' commands 'od'
			{
			dbg.location(118,7);
			string_literal33=(Token)match(input,FOREACH,FOLLOW_FOREACH_in_command_foreach1082);  
			stream_FOREACH.add(string_literal33);
			dbg.location(118,17);
			VARIABLE34=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_command_foreach1084);  
			stream_VARIABLE.add(VARIABLE34);
			dbg.location(118,26);
			string_literal35=(Token)match(input,IN,FOLLOW_IN_in_command_foreach1086);  
			stream_IN.add(string_literal35);
			dbg.location(118,31);
			pushFollow(FOLLOW_expression_in_command_foreach1088);
			expression36=expression();
			state._fsp--;

			stream_expression.add(expression36.getTree());dbg.location(118,42);
			string_literal37=(Token)match(input,DO,FOLLOW_DO_in_command_foreach1090);  
			stream_DO.add(string_literal37);
			dbg.location(118,47);
			pushFollow(FOLLOW_commands_in_command_foreach1092);
			commands38=commands();
			state._fsp--;

			stream_commands.add(commands38.getTree());dbg.location(118,56);
			string_literal39=(Token)match(input,OD,FOLLOW_OD_in_command_foreach1094);  
			stream_OD.add(string_literal39);

			// AST REWRITE
			// elements: FOREACH, expression, VARIABLE, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 119:7: -> ^( COMMAND 'foreach' VARIABLE expression commands )
			{
				dbg.location(119,10);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:119:10: ^( COMMAND 'foreach' VARIABLE expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(119,12);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);
				dbg.location(119,20);
				adaptor.addChild(root_1, stream_FOREACH.nextNode());dbg.location(119,30);
				adaptor.addChild(root_1, stream_VARIABLE.nextNode());dbg.location(119,39);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(119,50);
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
		dbg.location(120, 4);

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
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:122:1: command : ( command_nop | command_var | command_if | command_while | command_for | command_foreach );
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
		dbg.location(122, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:122:9: ( command_nop | command_var | command_if | command_while | command_for | command_foreach )
			int alt9=6;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			switch ( input.LA(1) ) {
			case NOP:
				{
				alt9=1;
				}
				break;
			case VARIABLE:
				{
				alt9=2;
				}
				break;
			case IF:
				{
				alt9=3;
				}
				break;
			case WHILE:
				{
				alt9=4;
				}
				break;
			case FOR:
				{
				alt9=5;
				}
				break;
			case FOREACH:
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

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:123:7: command_nop
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(123,7);
					pushFollow(FOLLOW_command_nop_in_command1133);
					command_nop40=command_nop();
					state._fsp--;

					adaptor.addChild(root_0, command_nop40.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:124:7: command_var
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(124,7);
					pushFollow(FOLLOW_command_var_in_command1141);
					command_var41=command_var();
					state._fsp--;

					adaptor.addChild(root_0, command_var41.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:125:7: command_if
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(125,7);
					pushFollow(FOLLOW_command_if_in_command1149);
					command_if42=command_if();
					state._fsp--;

					adaptor.addChild(root_0, command_if42.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:126:7: command_while
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(126,7);
					pushFollow(FOLLOW_command_while_in_command1157);
					command_while43=command_while();
					state._fsp--;

					adaptor.addChild(root_0, command_while43.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:127:7: command_for
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(127,7);
					pushFollow(FOLLOW_command_for_in_command1165);
					command_for44=command_for();
					state._fsp--;

					adaptor.addChild(root_0, command_for44.getTree());

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:128:7: command_foreach
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(128,7);
					pushFollow(FOLLOW_command_foreach_in_command1173);
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
		dbg.location(129, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "command");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "command"


	public static class exprbase_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:131:1: exprbase : ( 'nil' -> ^( EXPRBASE 'nil' ) | VARIABLE -> ^( EXPRBASE VARIABLE ) | SYMBOL -> ^( EXPRBASE SYMBOL ) | '(' exprbase_paren ')' -> ^( EXPRBASE exprbase_paren ) );
	public final whileParser.exprbase_return exprbase() throws RecognitionException {
		whileParser.exprbase_return retval = new whileParser.exprbase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal46=null;
		Token VARIABLE47=null;
		Token SYMBOL48=null;
		Token char_literal49=null;
		Token char_literal51=null;
		ParserRuleReturnScope exprbase_paren50 =null;

		Object string_literal46_tree=null;
		Object VARIABLE47_tree=null;
		Object SYMBOL48_tree=null;
		Object char_literal49_tree=null;
		Object char_literal51_tree=null;
		RewriteRuleTokenStream stream_NIL=new RewriteRuleTokenStream(adaptor,"token NIL");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_exprbase_paren=new RewriteRuleSubtreeStream(adaptor,"rule exprbase_paren");

		try { dbg.enterRule(getGrammarFileName(), "exprbase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(131, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:132:5: ( 'nil' -> ^( EXPRBASE 'nil' ) | VARIABLE -> ^( EXPRBASE VARIABLE ) | SYMBOL -> ^( EXPRBASE SYMBOL ) | '(' exprbase_paren ')' -> ^( EXPRBASE exprbase_paren ) )
			int alt10=4;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			switch ( input.LA(1) ) {
			case NIL:
				{
				alt10=1;
				}
				break;
			case VARIABLE:
				{
				alt10=2;
				}
				break;
			case SYMBOL:
				{
				alt10=3;
				}
				break;
			case 43:
				{
				alt10=4;
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

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:132:7: 'nil'
					{
					dbg.location(132,7);
					string_literal46=(Token)match(input,NIL,FOLLOW_NIL_in_exprbase1190);  
					stream_NIL.add(string_literal46);

					// AST REWRITE
					// elements: NIL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 132:29: -> ^( EXPRBASE 'nil' )
					{
						dbg.location(132,32);
						// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:132:32: ^( EXPRBASE 'nil' )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(132,34);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
						dbg.location(132,43);
						adaptor.addChild(root_1, stream_NIL.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:133:7: VARIABLE
					{
					dbg.location(133,7);
					VARIABLE47=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_exprbase1222);  
					stream_VARIABLE.add(VARIABLE47);

					// AST REWRITE
					// elements: VARIABLE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 133:29: -> ^( EXPRBASE VARIABLE )
					{
						dbg.location(133,32);
						// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:133:32: ^( EXPRBASE VARIABLE )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(133,34);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
						dbg.location(133,43);
						adaptor.addChild(root_1, stream_VARIABLE.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:134:7: SYMBOL
					{
					dbg.location(134,7);
					SYMBOL48=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase1251);  
					stream_SYMBOL.add(SYMBOL48);

					// AST REWRITE
					// elements: SYMBOL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 134:29: -> ^( EXPRBASE SYMBOL )
					{
						dbg.location(134,32);
						// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:134:32: ^( EXPRBASE SYMBOL )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(134,34);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
						dbg.location(134,43);
						adaptor.addChild(root_1, stream_SYMBOL.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:135:7: '(' exprbase_paren ')'
					{
					dbg.location(135,7);
					char_literal49=(Token)match(input,43,FOLLOW_43_in_exprbase1282);  
					stream_43.add(char_literal49);
					dbg.location(135,11);
					pushFollow(FOLLOW_exprbase_paren_in_exprbase1284);
					exprbase_paren50=exprbase_paren();
					state._fsp--;

					stream_exprbase_paren.add(exprbase_paren50.getTree());dbg.location(135,26);
					char_literal51=(Token)match(input,44,FOLLOW_44_in_exprbase1286);  
					stream_44.add(char_literal51);

					// AST REWRITE
					// elements: exprbase_paren
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 135:30: -> ^( EXPRBASE exprbase_paren )
					{
						dbg.location(135,33);
						// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:135:33: ^( EXPRBASE exprbase_paren )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(135,35);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
						dbg.location(135,44);
						adaptor.addChild(root_1, stream_exprbase_paren.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

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
		dbg.location(136, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprbase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exprbase"


	public static class exprbase_paren_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase_paren"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:138:1: exprbase_paren : ( 'list' lexpr -> ^( EXPRBASE 'list' lexpr ) | 'cons' lexpr -> ^( EXPRBASE 'cons' lexpr ) | 'hd' exprbase -> ^( EXPRBASE 'hd' exprbase ) | 'tl' exprbase -> ^( EXPRBASE 'tl' exprbase ) | SYMBOL lexpr -> ^( EXPRBASE SYMBOL lexpr ) );
	public final whileParser.exprbase_paren_return exprbase_paren() throws RecognitionException {
		whileParser.exprbase_paren_return retval = new whileParser.exprbase_paren_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal52=null;
		Token string_literal54=null;
		Token string_literal56=null;
		Token string_literal58=null;
		Token SYMBOL60=null;
		ParserRuleReturnScope lexpr53 =null;
		ParserRuleReturnScope lexpr55 =null;
		ParserRuleReturnScope exprbase57 =null;
		ParserRuleReturnScope exprbase59 =null;
		ParserRuleReturnScope lexpr61 =null;

		Object string_literal52_tree=null;
		Object string_literal54_tree=null;
		Object string_literal56_tree=null;
		Object string_literal58_tree=null;
		Object SYMBOL60_tree=null;
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_TL=new RewriteRuleTokenStream(adaptor,"token TL");
		RewriteRuleTokenStream stream_HD=new RewriteRuleTokenStream(adaptor,"token HD");
		RewriteRuleTokenStream stream_LIST=new RewriteRuleTokenStream(adaptor,"token LIST");
		RewriteRuleTokenStream stream_CONS=new RewriteRuleTokenStream(adaptor,"token CONS");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try { dbg.enterRule(getGrammarFileName(), "exprbase_paren");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(138, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:139:5: ( 'list' lexpr -> ^( EXPRBASE 'list' lexpr ) | 'cons' lexpr -> ^( EXPRBASE 'cons' lexpr ) | 'hd' exprbase -> ^( EXPRBASE 'hd' exprbase ) | 'tl' exprbase -> ^( EXPRBASE 'tl' exprbase ) | SYMBOL lexpr -> ^( EXPRBASE SYMBOL lexpr ) )
			int alt11=5;
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			switch ( input.LA(1) ) {
			case LIST:
				{
				alt11=1;
				}
				break;
			case CONS:
				{
				alt11=2;
				}
				break;
			case HD:
				{
				alt11=3;
				}
				break;
			case TL:
				{
				alt11=4;
				}
				break;
			case SYMBOL:
				{
				alt11=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:139:7: 'list' lexpr
					{
					dbg.location(139,7);
					string_literal52=(Token)match(input,LIST,FOLLOW_LIST_in_exprbase_paren1311);  
					stream_LIST.add(string_literal52);
					dbg.location(139,14);
					pushFollow(FOLLOW_lexpr_in_exprbase_paren1313);
					lexpr53=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr53.getTree());
					// AST REWRITE
					// elements: lexpr, LIST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 139:29: -> ^( EXPRBASE 'list' lexpr )
					{
						dbg.location(139,32);
						// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:139:32: ^( EXPRBASE 'list' lexpr )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(139,34);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
						dbg.location(139,43);
						adaptor.addChild(root_1, stream_LIST.nextNode());dbg.location(139,50);
						adaptor.addChild(root_1, stream_lexpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:140:7: 'cons' lexpr
					{
					dbg.location(140,7);
					string_literal54=(Token)match(input,CONS,FOLLOW_CONS_in_exprbase_paren1340);  
					stream_CONS.add(string_literal54);
					dbg.location(140,14);
					pushFollow(FOLLOW_lexpr_in_exprbase_paren1342);
					lexpr55=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr55.getTree());
					// AST REWRITE
					// elements: lexpr, CONS
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 140:29: -> ^( EXPRBASE 'cons' lexpr )
					{
						dbg.location(140,32);
						// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:140:32: ^( EXPRBASE 'cons' lexpr )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(140,34);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
						dbg.location(140,43);
						adaptor.addChild(root_1, stream_CONS.nextNode());dbg.location(140,50);
						adaptor.addChild(root_1, stream_lexpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:141:7: 'hd' exprbase
					{
					dbg.location(141,7);
					string_literal56=(Token)match(input,HD,FOLLOW_HD_in_exprbase_paren1369);  
					stream_HD.add(string_literal56);
					dbg.location(141,12);
					pushFollow(FOLLOW_exprbase_in_exprbase_paren1371);
					exprbase57=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase57.getTree());
					// AST REWRITE
					// elements: HD, exprbase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 141:29: -> ^( EXPRBASE 'hd' exprbase )
					{
						dbg.location(141,32);
						// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:141:32: ^( EXPRBASE 'hd' exprbase )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(141,34);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
						dbg.location(141,43);
						adaptor.addChild(root_1, stream_HD.nextNode());dbg.location(141,48);
						adaptor.addChild(root_1, stream_exprbase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:142:7: 'tl' exprbase
					{
					dbg.location(142,7);
					string_literal58=(Token)match(input,TL,FOLLOW_TL_in_exprbase_paren1397);  
					stream_TL.add(string_literal58);
					dbg.location(142,12);
					pushFollow(FOLLOW_exprbase_in_exprbase_paren1399);
					exprbase59=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase59.getTree());
					// AST REWRITE
					// elements: TL, exprbase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 142:29: -> ^( EXPRBASE 'tl' exprbase )
					{
						dbg.location(142,32);
						// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:142:32: ^( EXPRBASE 'tl' exprbase )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(142,34);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
						dbg.location(142,43);
						adaptor.addChild(root_1, stream_TL.nextNode());dbg.location(142,48);
						adaptor.addChild(root_1, stream_exprbase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:143:7: SYMBOL lexpr
					{
					dbg.location(143,7);
					SYMBOL60=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase_paren1425);  
					stream_SYMBOL.add(SYMBOL60);
					dbg.location(143,14);
					pushFollow(FOLLOW_lexpr_in_exprbase_paren1427);
					lexpr61=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr61.getTree());
					// AST REWRITE
					// elements: lexpr, SYMBOL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 143:29: -> ^( EXPRBASE SYMBOL lexpr )
					{
						dbg.location(143,32);
						// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:143:32: ^( EXPRBASE SYMBOL lexpr )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(143,34);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
						dbg.location(143,43);
						adaptor.addChild(root_1, stream_SYMBOL.nextNode());dbg.location(143,50);
						adaptor.addChild(root_1, stream_lexpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

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
		dbg.location(144, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprbase_paren");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exprbase_paren"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:146:1: expression : a= exprbase ( '=?' b= exprbase )? -> ^( EXPRESSION $a ( $b)? ) ;
	public final whileParser.expression_return expression() throws RecognitionException {
		whileParser.expression_return retval = new whileParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal62=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		Object string_literal62_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(146, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:146:12: (a= exprbase ( '=?' b= exprbase )? -> ^( EXPRESSION $a ( $b)? ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:147:7: a= exprbase ( '=?' b= exprbase )?
			{
			dbg.location(147,8);
			pushFollow(FOLLOW_exprbase_in_expression1467);
			a=exprbase();
			state._fsp--;

			stream_exprbase.add(a.getTree());dbg.location(147,18);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:147:18: ( '=?' b= exprbase )?
			int alt12=2;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			int LA12_0 = input.LA(1);
			if ( (LA12_0==48) ) {
				alt12=1;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:147:19: '=?' b= exprbase
					{
					dbg.location(147,19);
					string_literal62=(Token)match(input,48,FOLLOW_48_in_expression1470);  
					stream_48.add(string_literal62);
					dbg.location(147,25);
					pushFollow(FOLLOW_exprbase_in_expression1474);
					b=exprbase();
					state._fsp--;

					stream_exprbase.add(b.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(12);}

			// AST REWRITE
			// elements: a, b
			// token labels: 
			// rule labels: a, b, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 148:7: -> ^( EXPRESSION $a ( $b)? )
			{
				dbg.location(148,10);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:148:10: ^( EXPRESSION $a ( $b)? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(148,12);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSION, "EXPRESSION"), root_1);
				dbg.location(148,24);
				adaptor.addChild(root_1, stream_a.nextTree());dbg.location(148,26);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:148:26: ( $b)?
				if ( stream_b.hasNext() ) {
					dbg.location(148,28);
					adaptor.addChild(root_1, stream_b.nextTree());
				}
				stream_b.reset();

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
		dbg.location(149, 4);

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
	// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:151:1: lexpr : (e= exprbase )* -> ^( LEXPR ( $e)* ) ;
	public final whileParser.lexpr_return lexpr() throws RecognitionException {
		whileParser.lexpr_return retval = new whileParser.lexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope e =null;

		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try { dbg.enterRule(getGrammarFileName(), "lexpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(151, 0);

		try {
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:151:7: ( (e= exprbase )* -> ^( LEXPR ( $e)* ) )
			dbg.enterAlt(1);

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:152:7: (e= exprbase )*
			{
			dbg.location(152,8);
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:152:8: (e= exprbase )*
			try { dbg.enterSubRule(13);

			loop13:
			while (true) {
				int alt13=2;
				try { dbg.enterDecision(13, decisionCanBacktrack[13]);

				int LA13_0 = input.LA(1);
				if ( (LA13_0==NIL||LA13_0==SYMBOL||LA13_0==VARIABLE||LA13_0==43) ) {
					alt13=1;
				}

				} finally {dbg.exitDecision(13);}

				switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:152:8: e= exprbase
					{
					dbg.location(152,8);
					pushFollow(FOLLOW_exprbase_in_lexpr1518);
					e=exprbase();
					state._fsp--;

					stream_exprbase.add(e.getTree());
					}
					break;

				default :
					break loop13;
				}
			}
			} finally {dbg.exitSubRule(13);}

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
			// 152:19: -> ^( LEXPR ( $e)* )
			{
				dbg.location(152,22);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:152:22: ^( LEXPR ( $e)* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(152,24);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LEXPR, "LEXPR"), root_1);
				dbg.location(152,31);
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:152:31: ( $e)*
				while ( stream_e.hasNext() ) {
					dbg.location(152,31);
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
		dbg.location(153, 4);

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



	public static final BitSet FOLLOW_function_in_program498 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_FUNCTION_in_function525 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_SYMBOL_in_function529 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_function531 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_definition_in_function533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_definition571 = new BitSet(new long[]{0x0000002040000000L});
	public static final BitSet FOLLOW_input_in_definition575 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_PERCENT_in_definition578 = new BitSet(new long[]{0x0000012008130000L});
	public static final BitSet FOLLOW_commands_in_definition582 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_PERCENT_in_definition584 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_WRITE_in_definition586 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_output_in_definition590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_input641 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_COMMA_in_input644 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_VARIABLE_in_input648 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_VARIABLE_in_output687 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_COMMA_in_output690 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_VARIABLE_in_output694 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_VARIABLE_in_vars733 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_COMMA_in_vars736 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_VARIABLE_in_vars740 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_expression_in_exprs779 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_COMMA_in_exprs782 = new BitSet(new long[]{0x0000082204000000L});
	public static final BitSet FOLLOW_expression_in_exprs786 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_command_in_commands825 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_commands829 = new BitSet(new long[]{0x0000012008130000L});
	public static final BitSet FOLLOW_command_in_commands833 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_NOP_in_command_nop871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command_var896 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_command_var898 = new BitSet(new long[]{0x0000082204000000L});
	public static final BitSet FOLLOW_exprs_in_command_var900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_command_if927 = new BitSet(new long[]{0x0000082204000000L});
	public static final BitSet FOLLOW_expression_in_command_if929 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_THEN_in_command_if931 = new BitSet(new long[]{0x0000012008130000L});
	public static final BitSet FOLLOW_commands_in_command_if935 = new BitSet(new long[]{0x0000000000008400L});
	public static final BitSet FOLLOW_ELSE_in_command_if938 = new BitSet(new long[]{0x0000012008130000L});
	public static final BitSet FOLLOW_commands_in_command_if942 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_FI_in_command_if946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_command_while992 = new BitSet(new long[]{0x0000082204000000L});
	public static final BitSet FOLLOW_expression_in_command_while994 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DO_in_command_while996 = new BitSet(new long[]{0x0000012008130000L});
	public static final BitSet FOLLOW_commands_in_command_while998 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_OD_in_command_while1000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_command_for1037 = new BitSet(new long[]{0x0000082204000000L});
	public static final BitSet FOLLOW_expression_in_command_for1039 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DO_in_command_for1041 = new BitSet(new long[]{0x0000012008130000L});
	public static final BitSet FOLLOW_commands_in_command_for1043 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_OD_in_command_for1045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOREACH_in_command_foreach1082 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_VARIABLE_in_command_foreach1084 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IN_in_command_foreach1086 = new BitSet(new long[]{0x0000082204000000L});
	public static final BitSet FOLLOW_expression_in_command_foreach1088 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DO_in_command_foreach1090 = new BitSet(new long[]{0x0000012008130000L});
	public static final BitSet FOLLOW_commands_in_command_foreach1092 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_OD_in_command_foreach1094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_nop_in_command1133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_var_in_command1141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_if_in_command1149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_while_in_command1157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_for_in_command1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_foreach_in_command1173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NIL_in_exprbase1190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_exprbase1222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase1251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_exprbase1282 = new BitSet(new long[]{0x0000000A02080080L});
	public static final BitSet FOLLOW_exprbase_paren_in_exprbase1284 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_exprbase1286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_exprbase_paren1311 = new BitSet(new long[]{0x0000082204000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase_paren1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONS_in_exprbase_paren1340 = new BitSet(new long[]{0x0000082204000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase_paren1342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HD_in_exprbase_paren1369 = new BitSet(new long[]{0x0000082204000000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase_paren1371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TL_in_exprbase_paren1397 = new BitSet(new long[]{0x0000082204000000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase_paren1399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase_paren1425 = new BitSet(new long[]{0x0000082204000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase_paren1427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_expression1467 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_expression1470 = new BitSet(new long[]{0x0000082204000000L});
	public static final BitSet FOLLOW_exprbase_in_expression1474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_lexpr1518 = new BitSet(new long[]{0x0000082204000002L});
}
