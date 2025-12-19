// $ANTLR 3.5.2 while.g 2025-12-19 11:01:39

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class whileParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "COMMA", "COMMAND", 
		"COMMANDS", "CONS", "DEFINITION", "EXPRBASE", "EXPRESSION", "EXPRESSIONS", 
		"EXPRS", "EXPR_PARENT", "FUNC", "FUNCTION", "HD", "IF", "INPUT", "INPUTSUB", 
		"LEXPR", "LIST", "NIL", "NOP", "OUTPUT", "PERCENT", "PROGRAM", "SYM", 
		"SYMBOL", "TL", "VAR", "VARIABLE", "VARIABLES", "VARS", "WS", "'('", "')'", 
		"':'", "':='", "';'", "'=?'", "'cons'", "'do'", "'else'", "'fi'", "'for'", 
		"'foreach'", "'function'", "'hd'", "'if'", "'in'", "'list'", "'nil'", 
		"'nop'", "'od'", "'read'", "'then'", "'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
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
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int ASSIGN=4;
	public static final int COMMA=5;
	public static final int COMMAND=6;
	public static final int COMMANDS=7;
	public static final int CONS=8;
	public static final int DEFINITION=9;
	public static final int EXPRBASE=10;
	public static final int EXPRESSION=11;
	public static final int EXPRESSIONS=12;
	public static final int EXPRS=13;
	public static final int EXPR_PARENT=14;
	public static final int FUNC=15;
	public static final int FUNCTION=16;
	public static final int HD=17;
	public static final int IF=18;
	public static final int INPUT=19;
	public static final int INPUTSUB=20;
	public static final int LEXPR=21;
	public static final int LIST=22;
	public static final int NIL=23;
	public static final int NOP=24;
	public static final int OUTPUT=25;
	public static final int PERCENT=26;
	public static final int PROGRAM=27;
	public static final int SYM=28;
	public static final int SYMBOL=29;
	public static final int TL=30;
	public static final int VAR=31;
	public static final int VARIABLE=32;
	public static final int VARIABLES=33;
	public static final int VARS=34;
	public static final int WS=35;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public whileParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public whileParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return whileParser.tokenNames; }
	@Override public String getGrammarFileName() { return "while.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// while.g:50:1: program : ( function )+ -> ^( PROGRAM ( function )+ ) ;
	public final whileParser.program_return program() throws RecognitionException {
		whileParser.program_return retval = new whileParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function1 =null;

		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");

		try {
			// while.g:50:9: ( ( function )+ -> ^( PROGRAM ( function )+ ) )
			// while.g:51:5: ( function )+
			{
			// while.g:51:5: ( function )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==48) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// while.g:51:5: function
					{
					pushFollow(FOLLOW_function_in_program384);
					function1=function();
					state._fsp--;

					stream_function.add(function1.getTree());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

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
			// 51:15: -> ^( PROGRAM ( function )+ )
			{
				// while.g:51:18: ^( PROGRAM ( function )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				if ( !(stream_function.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_function.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "program"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// while.g:54:1: function : 'function' s= SYMBOL ':' definition -> ^( FUNCTION $s definition ) ;
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
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// while.g:54:10: ( 'function' s= SYMBOL ':' definition -> ^( FUNCTION $s definition ) )
			// while.g:55:5: 'function' s= SYMBOL ':' definition
			{
			string_literal2=(Token)match(input,48,FOLLOW_48_in_function411);  
			stream_48.add(string_literal2);

			s=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_function415);  
			stream_SYMBOL.add(s);

			char_literal3=(Token)match(input,38,FOLLOW_38_in_function417);  
			stream_38.add(char_literal3);

			pushFollow(FOLLOW_definition_in_function419);
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
			// 56:9: -> ^( FUNCTION $s definition )
			{
				// while.g:56:12: ^( FUNCTION $s definition )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_s.nextNode());
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
		return retval;
	}
	// $ANTLR end "function"


	public static class definition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// while.g:59:1: definition : 'read' (i= input )? PERCENT c= commands PERCENT 'write' o= output -> ^( DEFINITION ( $i)? $o $c) ;
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
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_PERCENT=new RewriteRuleTokenStream(adaptor,"token PERCENT");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// while.g:59:12: ( 'read' (i= input )? PERCENT c= commands PERCENT 'write' o= output -> ^( DEFINITION ( $i)? $o $c) )
			// while.g:60:7: 'read' (i= input )? PERCENT c= commands PERCENT 'write' o= output
			{
			string_literal5=(Token)match(input,56,FOLLOW_56_in_definition457);  
			stream_56.add(string_literal5);

			// while.g:60:15: (i= input )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==VARIABLE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// while.g:60:15: i= input
					{
					pushFollow(FOLLOW_input_in_definition461);
					i=input();
					state._fsp--;

					stream_input.add(i.getTree());
					}
					break;

			}

			PERCENT6=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_definition464);  
			stream_PERCENT.add(PERCENT6);

			pushFollow(FOLLOW_commands_in_definition468);
			c=commands();
			state._fsp--;

			stream_commands.add(c.getTree());
			PERCENT7=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_definition470);  
			stream_PERCENT.add(PERCENT7);

			string_literal8=(Token)match(input,60,FOLLOW_60_in_definition472);  
			stream_60.add(string_literal8);

			pushFollow(FOLLOW_output_in_definition476);
			o=output();
			state._fsp--;

			stream_output.add(o.getTree());
			// AST REWRITE
			// elements: i, c, o
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
			// 61:7: -> ^( DEFINITION ( $i)? $o $c)
			{
				// while.g:61:10: ^( DEFINITION ( $i)? $o $c)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFINITION, "DEFINITION"), root_1);
				// while.g:61:24: ( $i)?
				if ( stream_i.hasNext() ) {
					adaptor.addChild(root_1, stream_i.nextTree());
				}
				stream_i.reset();

				adaptor.addChild(root_1, stream_o.nextTree());
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
		return retval;
	}
	// $ANTLR end "definition"


	public static class input_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input"
	// while.g:64:1: input : v= VARIABLE ( COMMA v2= VARIABLE )* -> ^( INPUT $v ( $v2)* ) ;
	public final whileParser.input_return input() throws RecognitionException {
		whileParser.input_return retval = new whileParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v=null;
		Token v2=null;
		Token COMMA9=null;

		Object v_tree=null;
		Object v2_tree=null;
		Object COMMA9_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");

		try {
			// while.g:64:7: (v= VARIABLE ( COMMA v2= VARIABLE )* -> ^( INPUT $v ( $v2)* ) )
			// while.g:65:7: v= VARIABLE ( COMMA v2= VARIABLE )*
			{
			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_input519);  
			stream_VARIABLE.add(v);

			// while.g:65:18: ( COMMA v2= VARIABLE )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==COMMA) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// while.g:65:19: COMMA v2= VARIABLE
					{
					COMMA9=(Token)match(input,COMMA,FOLLOW_COMMA_in_input522);  
					stream_COMMA.add(COMMA9);

					v2=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_input526);  
					stream_VARIABLE.add(v2);

					}
					break;

				default :
					break loop3;
				}
			}

			// AST REWRITE
			// elements: v, v2
			// token labels: v, v2
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleTokenStream stream_v2=new RewriteRuleTokenStream(adaptor,"token v2",v2);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 66:7: -> ^( INPUT $v ( $v2)* )
			{
				// while.g:66:10: ^( INPUT $v ( $v2)* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);
				adaptor.addChild(root_1, stream_v.nextNode());
				// while.g:66:22: ( $v2)*
				while ( stream_v2.hasNext() ) {
					adaptor.addChild(root_1, stream_v2.nextNode());
				}
				stream_v2.reset();

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
		return retval;
	}
	// $ANTLR end "input"


	public static class output_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "output"
	// while.g:69:1: output : v= VARIABLE ( COMMA v2= VARIABLE )* -> ^( OUTPUT $v ( $v2)* ) ;
	public final whileParser.output_return output() throws RecognitionException {
		whileParser.output_return retval = new whileParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v=null;
		Token v2=null;
		Token COMMA10=null;

		Object v_tree=null;
		Object v2_tree=null;
		Object COMMA10_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");

		try {
			// while.g:69:8: (v= VARIABLE ( COMMA v2= VARIABLE )* -> ^( OUTPUT $v ( $v2)* ) )
			// while.g:70:7: v= VARIABLE ( COMMA v2= VARIABLE )*
			{
			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output568);  
			stream_VARIABLE.add(v);

			// while.g:70:18: ( COMMA v2= VARIABLE )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==COMMA) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// while.g:70:19: COMMA v2= VARIABLE
					{
					COMMA10=(Token)match(input,COMMA,FOLLOW_COMMA_in_output571);  
					stream_COMMA.add(COMMA10);

					v2=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output575);  
					stream_VARIABLE.add(v2);

					}
					break;

				default :
					break loop4;
				}
			}

			// AST REWRITE
			// elements: v2, v
			// token labels: v, v2
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleTokenStream stream_v2=new RewriteRuleTokenStream(adaptor,"token v2",v2);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 71:7: -> ^( OUTPUT $v ( $v2)* )
			{
				// while.g:71:10: ^( OUTPUT $v ( $v2)* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);
				adaptor.addChild(root_1, stream_v.nextNode());
				// while.g:71:23: ( $v2)*
				while ( stream_v2.hasNext() ) {
					adaptor.addChild(root_1, stream_v2.nextNode());
				}
				stream_v2.reset();

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
		return retval;
	}
	// $ANTLR end "output"


	public static class vars_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// while.g:74:1: vars : v= VARIABLE ( COMMA v2= VARIABLE )* -> ^( VARIABLES $v ( $v2)* ) ;
	public final whileParser.vars_return vars() throws RecognitionException {
		whileParser.vars_return retval = new whileParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v=null;
		Token v2=null;
		Token COMMA11=null;

		Object v_tree=null;
		Object v2_tree=null;
		Object COMMA11_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");

		try {
			// while.g:74:6: (v= VARIABLE ( COMMA v2= VARIABLE )* -> ^( VARIABLES $v ( $v2)* ) )
			// while.g:75:7: v= VARIABLE ( COMMA v2= VARIABLE )*
			{
			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars617);  
			stream_VARIABLE.add(v);

			// while.g:75:18: ( COMMA v2= VARIABLE )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// while.g:75:19: COMMA v2= VARIABLE
					{
					COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_vars620);  
					stream_COMMA.add(COMMA11);

					v2=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars624);  
					stream_VARIABLE.add(v2);

					}
					break;

				default :
					break loop5;
				}
			}

			// AST REWRITE
			// elements: v, v2
			// token labels: v, v2
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleTokenStream stream_v2=new RewriteRuleTokenStream(adaptor,"token v2",v2);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 76:7: -> ^( VARIABLES $v ( $v2)* )
			{
				// while.g:76:10: ^( VARIABLES $v ( $v2)* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_1);
				adaptor.addChild(root_1, stream_v.nextNode());
				// while.g:76:26: ( $v2)*
				while ( stream_v2.hasNext() ) {
					adaptor.addChild(root_1, stream_v2.nextNode());
				}
				stream_v2.reset();

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
		return retval;
	}
	// $ANTLR end "vars"


	public static class exprs_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprs"
	// while.g:79:1: exprs : e= expression ( COMMA e2= expression )* -> ^( EXPRESSIONS $e ( $e2)* ) ;
	public final whileParser.exprs_return exprs() throws RecognitionException {
		whileParser.exprs_return retval = new whileParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA12=null;
		ParserRuleReturnScope e =null;
		ParserRuleReturnScope e2 =null;

		Object COMMA12_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// while.g:79:7: (e= expression ( COMMA e2= expression )* -> ^( EXPRESSIONS $e ( $e2)* ) )
			// while.g:80:7: e= expression ( COMMA e2= expression )*
			{
			pushFollow(FOLLOW_expression_in_exprs666);
			e=expression();
			state._fsp--;

			stream_expression.add(e.getTree());
			// while.g:80:20: ( COMMA e2= expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// while.g:80:21: COMMA e2= expression
					{
					COMMA12=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprs669);  
					stream_COMMA.add(COMMA12);

					pushFollow(FOLLOW_expression_in_exprs673);
					e2=expression();
					state._fsp--;

					stream_expression.add(e2.getTree());
					}
					break;

				default :
					break loop6;
				}
			}

			// AST REWRITE
			// elements: e, e2
			// token labels: 
			// rule labels: e, e2, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);
			RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 81:7: -> ^( EXPRESSIONS $e ( $e2)* )
			{
				// while.g:81:10: ^( EXPRESSIONS $e ( $e2)* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSIONS, "EXPRESSIONS"), root_1);
				adaptor.addChild(root_1, stream_e.nextTree());
				// while.g:81:28: ( $e2)*
				while ( stream_e2.hasNext() ) {
					adaptor.addChild(root_1, stream_e2.nextTree());
				}
				stream_e2.reset();

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
		return retval;
	}
	// $ANTLR end "exprs"


	public static class commands_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "commands"
	// while.g:84:1: commands : c= command ( ';' c2= command )* -> ^( COMMANDS $c ( $c2)* ) ;
	public final whileParser.commands_return commands() throws RecognitionException {
		whileParser.commands_return retval = new whileParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal13=null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope c2 =null;

		Object char_literal13_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");

		try {
			// while.g:84:10: (c= command ( ';' c2= command )* -> ^( COMMANDS $c ( $c2)* ) )
			// while.g:85:7: c= command ( ';' c2= command )*
			{
			pushFollow(FOLLOW_command_in_commands715);
			c=command();
			state._fsp--;

			stream_command.add(c.getTree());
			// while.g:85:17: ( ';' c2= command )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==40) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// while.g:85:19: ';' c2= command
					{
					char_literal13=(Token)match(input,40,FOLLOW_40_in_commands719);  
					stream_40.add(char_literal13);

					pushFollow(FOLLOW_command_in_commands723);
					c2=command();
					state._fsp--;

					stream_command.add(c2.getTree());
					}
					break;

				default :
					break loop7;
				}
			}

			// AST REWRITE
			// elements: c2, c
			// token labels: 
			// rule labels: c, retval, c2
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 86:7: -> ^( COMMANDS $c ( $c2)* )
			{
				// while.g:86:10: ^( COMMANDS $c ( $c2)* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_1);
				adaptor.addChild(root_1, stream_c.nextTree());
				// while.g:86:25: ( $c2)*
				while ( stream_c2.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "commands"


	public static class command_nop_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_nop"
	// while.g:89:1: command_nop : 'nop' -> ^( NOP ) ;
	public final whileParser.command_nop_return command_nop() throws RecognitionException {
		whileParser.command_nop_return retval = new whileParser.command_nop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal14=null;

		Object string_literal14_tree=null;
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");

		try {
			// while.g:89:13: ( 'nop' -> ^( NOP ) )
			// while.g:90:7: 'nop'
			{
			string_literal14=(Token)match(input,54,FOLLOW_54_in_command_nop764);  
			stream_54.add(string_literal14);

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
			// 90:13: -> ^( NOP )
			{
				// while.g:90:16: ^( NOP )
				{
				Object root_1 = (Object)adaptor.nil();
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
		return retval;
	}
	// $ANTLR end "command_nop"


	public static class command_var_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_var"
	// while.g:93:1: command_var : v= vars ':=' e= exprs -> ^( ASSIGN $v $e) ;
	public final whileParser.command_var_return command_var() throws RecognitionException {
		whileParser.command_var_return retval = new whileParser.command_var_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal15=null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope e =null;

		Object string_literal15_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// while.g:93:13: (v= vars ':=' e= exprs -> ^( ASSIGN $v $e) )
			// while.g:94:7: v= vars ':=' e= exprs
			{
			pushFollow(FOLLOW_vars_in_command_var791);
			v=vars();
			state._fsp--;

			stream_vars.add(v.getTree());
			string_literal15=(Token)match(input,39,FOLLOW_39_in_command_var793);  
			stream_39.add(string_literal15);

			pushFollow(FOLLOW_exprs_in_command_var797);
			e=exprs();
			state._fsp--;

			stream_exprs.add(e.getTree());
			// AST REWRITE
			// elements: v, e
			// token labels: 
			// rule labels: e, v, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);
			RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 94:27: -> ^( ASSIGN $v $e)
			{
				// while.g:94:30: ^( ASSIGN $v $e)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN, "ASSIGN"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_1, stream_e.nextTree());
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
		return retval;
	}
	// $ANTLR end "command_var"


	public static class command_if_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_if"
	// while.g:97:1: command_if : 'if' expression 'then' c1= commands ( 'else' c2= commands )? 'fi' -> ^( COMMAND 'if' expression $c1 ( $c2)? ) ;
	public final whileParser.command_if_return command_if() throws RecognitionException {
		whileParser.command_if_return retval = new whileParser.command_if_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal16=null;
		Token string_literal18=null;
		Token string_literal19=null;
		Token string_literal20=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope expression17 =null;

		Object string_literal16_tree=null;
		Object string_literal18_tree=null;
		Object string_literal19_tree=null;
		Object string_literal20_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// while.g:97:12: ( 'if' expression 'then' c1= commands ( 'else' c2= commands )? 'fi' -> ^( COMMAND 'if' expression $c1 ( $c2)? ) )
			// while.g:98:5: 'if' expression 'then' c1= commands ( 'else' c2= commands )? 'fi'
			{
			string_literal16=(Token)match(input,50,FOLLOW_50_in_command_if826);  
			stream_50.add(string_literal16);

			pushFollow(FOLLOW_expression_in_command_if828);
			expression17=expression();
			state._fsp--;

			stream_expression.add(expression17.getTree());
			string_literal18=(Token)match(input,57,FOLLOW_57_in_command_if830);  
			stream_57.add(string_literal18);

			pushFollow(FOLLOW_commands_in_command_if834);
			c1=commands();
			state._fsp--;

			stream_commands.add(c1.getTree());
			// while.g:98:40: ( 'else' c2= commands )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==44) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// while.g:98:41: 'else' c2= commands
					{
					string_literal19=(Token)match(input,44,FOLLOW_44_in_command_if837);  
					stream_44.add(string_literal19);

					pushFollow(FOLLOW_commands_in_command_if841);
					c2=commands();
					state._fsp--;

					stream_commands.add(c2.getTree());
					}
					break;

			}

			string_literal20=(Token)match(input,45,FOLLOW_45_in_command_if845);  
			stream_45.add(string_literal20);

			// AST REWRITE
			// elements: c1, expression, 50, c2
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
			// 99:9: -> ^( COMMAND 'if' expression $c1 ( $c2)? )
			{
				// while.g:99:12: ^( COMMAND 'if' expression $c1 ( $c2)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);
				adaptor.addChild(root_1, stream_50.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_c1.nextTree());
				// while.g:99:42: ( $c2)?
				if ( stream_c2.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "command_if"


	public static class command_while_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_while"
	// while.g:102:1: command_while : 'while' expression 'do' commands 'od' -> ^( COMMAND 'while' expression commands ) ;
	public final whileParser.command_while_return command_while() throws RecognitionException {
		whileParser.command_while_return retval = new whileParser.command_while_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal21=null;
		Token string_literal23=null;
		Token string_literal25=null;
		ParserRuleReturnScope expression22 =null;
		ParserRuleReturnScope commands24 =null;

		Object string_literal21_tree=null;
		Object string_literal23_tree=null;
		Object string_literal25_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// while.g:102:15: ( 'while' expression 'do' commands 'od' -> ^( COMMAND 'while' expression commands ) )
			// while.g:103:7: 'while' expression 'do' commands 'od'
			{
			string_literal21=(Token)match(input,59,FOLLOW_59_in_command_while891);  
			stream_59.add(string_literal21);

			pushFollow(FOLLOW_expression_in_command_while893);
			expression22=expression();
			state._fsp--;

			stream_expression.add(expression22.getTree());
			string_literal23=(Token)match(input,43,FOLLOW_43_in_command_while895);  
			stream_43.add(string_literal23);

			pushFollow(FOLLOW_commands_in_command_while897);
			commands24=commands();
			state._fsp--;

			stream_commands.add(commands24.getTree());
			string_literal25=(Token)match(input,55,FOLLOW_55_in_command_while899);  
			stream_55.add(string_literal25);

			// AST REWRITE
			// elements: 59, expression, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 104:7: -> ^( COMMAND 'while' expression commands )
			{
				// while.g:104:10: ^( COMMAND 'while' expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);
				adaptor.addChild(root_1, stream_59.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
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
		return retval;
	}
	// $ANTLR end "command_while"


	public static class command_for_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_for"
	// while.g:107:1: command_for : 'for' expression 'do' commands 'od' -> ^( COMMAND 'for' expression commands ) ;
	public final whileParser.command_for_return command_for() throws RecognitionException {
		whileParser.command_for_return retval = new whileParser.command_for_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal26=null;
		Token string_literal28=null;
		Token string_literal30=null;
		ParserRuleReturnScope expression27 =null;
		ParserRuleReturnScope commands29 =null;

		Object string_literal26_tree=null;
		Object string_literal28_tree=null;
		Object string_literal30_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// while.g:107:13: ( 'for' expression 'do' commands 'od' -> ^( COMMAND 'for' expression commands ) )
			// while.g:108:7: 'for' expression 'do' commands 'od'
			{
			string_literal26=(Token)match(input,46,FOLLOW_46_in_command_for936);  
			stream_46.add(string_literal26);

			pushFollow(FOLLOW_expression_in_command_for938);
			expression27=expression();
			state._fsp--;

			stream_expression.add(expression27.getTree());
			string_literal28=(Token)match(input,43,FOLLOW_43_in_command_for940);  
			stream_43.add(string_literal28);

			pushFollow(FOLLOW_commands_in_command_for942);
			commands29=commands();
			state._fsp--;

			stream_commands.add(commands29.getTree());
			string_literal30=(Token)match(input,55,FOLLOW_55_in_command_for944);  
			stream_55.add(string_literal30);

			// AST REWRITE
			// elements: expression, 46, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 109:7: -> ^( COMMAND 'for' expression commands )
			{
				// while.g:109:10: ^( COMMAND 'for' expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);
				adaptor.addChild(root_1, stream_46.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
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
		return retval;
	}
	// $ANTLR end "command_for"


	public static class command_foreach_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_foreach"
	// while.g:112:1: command_foreach : 'foreach' v= VARIABLE 'in' expression 'do' commands 'od' -> ^( COMMAND 'foreach' $v expression commands ) ;
	public final whileParser.command_foreach_return command_foreach() throws RecognitionException {
		whileParser.command_foreach_return retval = new whileParser.command_foreach_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v=null;
		Token string_literal31=null;
		Token string_literal32=null;
		Token string_literal34=null;
		Token string_literal36=null;
		ParserRuleReturnScope expression33 =null;
		ParserRuleReturnScope commands35 =null;

		Object v_tree=null;
		Object string_literal31_tree=null;
		Object string_literal32_tree=null;
		Object string_literal34_tree=null;
		Object string_literal36_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// while.g:112:17: ( 'foreach' v= VARIABLE 'in' expression 'do' commands 'od' -> ^( COMMAND 'foreach' $v expression commands ) )
			// while.g:113:7: 'foreach' v= VARIABLE 'in' expression 'do' commands 'od'
			{
			string_literal31=(Token)match(input,47,FOLLOW_47_in_command_foreach981);  
			stream_47.add(string_literal31);

			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_command_foreach985);  
			stream_VARIABLE.add(v);

			string_literal32=(Token)match(input,51,FOLLOW_51_in_command_foreach987);  
			stream_51.add(string_literal32);

			pushFollow(FOLLOW_expression_in_command_foreach989);
			expression33=expression();
			state._fsp--;

			stream_expression.add(expression33.getTree());
			string_literal34=(Token)match(input,43,FOLLOW_43_in_command_foreach991);  
			stream_43.add(string_literal34);

			pushFollow(FOLLOW_commands_in_command_foreach993);
			commands35=commands();
			state._fsp--;

			stream_commands.add(commands35.getTree());
			string_literal36=(Token)match(input,55,FOLLOW_55_in_command_foreach995);  
			stream_55.add(string_literal36);

			// AST REWRITE
			// elements: commands, v, expression, 47
			// token labels: v
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 114:7: -> ^( COMMAND 'foreach' $v expression commands )
			{
				// while.g:114:10: ^( COMMAND 'foreach' $v expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);
				adaptor.addChild(root_1, stream_47.nextNode());
				adaptor.addChild(root_1, stream_v.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
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
		return retval;
	}
	// $ANTLR end "command_foreach"


	public static class command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command"
	// while.g:117:1: command : ( command_nop | command_var | command_if | command_while | command_for | command_foreach );
	public final whileParser.command_return command() throws RecognitionException {
		whileParser.command_return retval = new whileParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope command_nop37 =null;
		ParserRuleReturnScope command_var38 =null;
		ParserRuleReturnScope command_if39 =null;
		ParserRuleReturnScope command_while40 =null;
		ParserRuleReturnScope command_for41 =null;
		ParserRuleReturnScope command_foreach42 =null;


		try {
			// while.g:117:9: ( command_nop | command_var | command_if | command_while | command_for | command_foreach )
			int alt9=6;
			switch ( input.LA(1) ) {
			case 54:
				{
				alt9=1;
				}
				break;
			case VARIABLE:
				{
				alt9=2;
				}
				break;
			case 50:
				{
				alt9=3;
				}
				break;
			case 59:
				{
				alt9=4;
				}
				break;
			case 46:
				{
				alt9=5;
				}
				break;
			case 47:
				{
				alt9=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// while.g:118:7: command_nop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_nop_in_command1035);
					command_nop37=command_nop();
					state._fsp--;

					adaptor.addChild(root_0, command_nop37.getTree());

					}
					break;
				case 2 :
					// while.g:119:7: command_var
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_var_in_command1043);
					command_var38=command_var();
					state._fsp--;

					adaptor.addChild(root_0, command_var38.getTree());

					}
					break;
				case 3 :
					// while.g:120:7: command_if
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_if_in_command1051);
					command_if39=command_if();
					state._fsp--;

					adaptor.addChild(root_0, command_if39.getTree());

					}
					break;
				case 4 :
					// while.g:121:7: command_while
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_while_in_command1059);
					command_while40=command_while();
					state._fsp--;

					adaptor.addChild(root_0, command_while40.getTree());

					}
					break;
				case 5 :
					// while.g:122:7: command_for
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_for_in_command1067);
					command_for41=command_for();
					state._fsp--;

					adaptor.addChild(root_0, command_for41.getTree());

					}
					break;
				case 6 :
					// while.g:123:7: command_foreach
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_foreach_in_command1075);
					command_foreach42=command_foreach();
					state._fsp--;

					adaptor.addChild(root_0, command_foreach42.getTree());

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
		return retval;
	}
	// $ANTLR end "command"


	public static class exprbase_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase"
	// while.g:126:1: exprbase : ( 'nil' -> NIL |v= VARIABLE -> ^( VAR $v) |s= SYMBOL -> ^( SYM $s) | '(' exprbase_paren ')' -> ^( EXPR_PARENT exprbase_paren ) );
	public final whileParser.exprbase_return exprbase() throws RecognitionException {
		whileParser.exprbase_return retval = new whileParser.exprbase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v=null;
		Token s=null;
		Token string_literal43=null;
		Token char_literal44=null;
		Token char_literal46=null;
		ParserRuleReturnScope exprbase_paren45 =null;

		Object v_tree=null;
		Object s_tree=null;
		Object string_literal43_tree=null;
		Object char_literal44_tree=null;
		Object char_literal46_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_exprbase_paren=new RewriteRuleSubtreeStream(adaptor,"rule exprbase_paren");

		try {
			// while.g:127:5: ( 'nil' -> NIL |v= VARIABLE -> ^( VAR $v) |s= SYMBOL -> ^( SYM $s) | '(' exprbase_paren ')' -> ^( EXPR_PARENT exprbase_paren ) )
			int alt10=4;
			switch ( input.LA(1) ) {
			case 53:
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
			case 36:
				{
				alt10=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// while.g:127:7: 'nil'
					{
					string_literal43=(Token)match(input,53,FOLLOW_53_in_exprbase1092);  
					stream_53.add(string_literal43);

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
					// 127:29: -> NIL
					{
						adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// while.g:128:7: v= VARIABLE
					{
					v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_exprbase1122);  
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
					// 128:31: -> ^( VAR $v)
					{
						// while.g:128:34: ^( VAR $v)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// while.g:129:7: s= SYMBOL
					{
					s=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase1154);  
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
					// 129:31: -> ^( SYM $s)
					{
						// while.g:129:34: ^( SYM $s)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SYM, "SYM"), root_1);
						adaptor.addChild(root_1, stream_s.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// while.g:130:7: '(' exprbase_paren ')'
					{
					char_literal44=(Token)match(input,36,FOLLOW_36_in_exprbase1186);  
					stream_36.add(char_literal44);

					pushFollow(FOLLOW_exprbase_paren_in_exprbase1188);
					exprbase_paren45=exprbase_paren();
					state._fsp--;

					stream_exprbase_paren.add(exprbase_paren45.getTree());
					char_literal46=(Token)match(input,37,FOLLOW_37_in_exprbase1190);  
					stream_37.add(char_literal46);

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
					// 130:30: -> ^( EXPR_PARENT exprbase_paren )
					{
						// while.g:130:33: ^( EXPR_PARENT exprbase_paren )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR_PARENT, "EXPR_PARENT"), root_1);
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
		return retval;
	}
	// $ANTLR end "exprbase"


	public static class exprbase_paren_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase_paren"
	// while.g:133:1: exprbase_paren : ( 'list' lexpr -> ^( LIST lexpr ) | 'cons' lexpr -> ^( CONS lexpr ) | 'hd' exprbase -> ^( HD exprbase ) | 'tl' exprbase -> ^( TL exprbase ) |s= SYMBOL lexpr -> ^( FUNC $s ( lexpr )? ) );
	public final whileParser.exprbase_paren_return exprbase_paren() throws RecognitionException {
		whileParser.exprbase_paren_return retval = new whileParser.exprbase_paren_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token s=null;
		Token string_literal47=null;
		Token string_literal49=null;
		Token string_literal51=null;
		Token string_literal53=null;
		ParserRuleReturnScope lexpr48 =null;
		ParserRuleReturnScope lexpr50 =null;
		ParserRuleReturnScope exprbase52 =null;
		ParserRuleReturnScope exprbase54 =null;
		ParserRuleReturnScope lexpr55 =null;

		Object s_tree=null;
		Object string_literal47_tree=null;
		Object string_literal49_tree=null;
		Object string_literal51_tree=null;
		Object string_literal53_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// while.g:134:5: ( 'list' lexpr -> ^( LIST lexpr ) | 'cons' lexpr -> ^( CONS lexpr ) | 'hd' exprbase -> ^( HD exprbase ) | 'tl' exprbase -> ^( TL exprbase ) |s= SYMBOL lexpr -> ^( FUNC $s ( lexpr )? ) )
			int alt11=5;
			switch ( input.LA(1) ) {
			case 52:
				{
				alt11=1;
				}
				break;
			case 42:
				{
				alt11=2;
				}
				break;
			case 49:
				{
				alt11=3;
				}
				break;
			case 58:
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
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// while.g:134:7: 'list' lexpr
					{
					string_literal47=(Token)match(input,52,FOLLOW_52_in_exprbase_paren1215);  
					stream_52.add(string_literal47);

					pushFollow(FOLLOW_lexpr_in_exprbase_paren1217);
					lexpr48=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr48.getTree());
					// AST REWRITE
					// elements: lexpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 134:29: -> ^( LIST lexpr )
					{
						// while.g:134:32: ^( LIST lexpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
						adaptor.addChild(root_1, stream_lexpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// while.g:135:7: 'cons' lexpr
					{
					string_literal49=(Token)match(input,42,FOLLOW_42_in_exprbase_paren1242);  
					stream_42.add(string_literal49);

					pushFollow(FOLLOW_lexpr_in_exprbase_paren1244);
					lexpr50=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr50.getTree());
					// AST REWRITE
					// elements: lexpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 135:29: -> ^( CONS lexpr )
					{
						// while.g:135:32: ^( CONS lexpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONS, "CONS"), root_1);
						adaptor.addChild(root_1, stream_lexpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// while.g:136:7: 'hd' exprbase
					{
					string_literal51=(Token)match(input,49,FOLLOW_49_in_exprbase_paren1269);  
					stream_49.add(string_literal51);

					pushFollow(FOLLOW_exprbase_in_exprbase_paren1271);
					exprbase52=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase52.getTree());
					// AST REWRITE
					// elements: exprbase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 136:29: -> ^( HD exprbase )
					{
						// while.g:136:32: ^( HD exprbase )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HD, "HD"), root_1);
						adaptor.addChild(root_1, stream_exprbase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// while.g:137:7: 'tl' exprbase
					{
					string_literal53=(Token)match(input,58,FOLLOW_58_in_exprbase_paren1295);  
					stream_58.add(string_literal53);

					pushFollow(FOLLOW_exprbase_in_exprbase_paren1297);
					exprbase54=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase54.getTree());
					// AST REWRITE
					// elements: exprbase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 137:29: -> ^( TL exprbase )
					{
						// while.g:137:32: ^( TL exprbase )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TL, "TL"), root_1);
						adaptor.addChild(root_1, stream_exprbase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// while.g:138:7: s= SYMBOL lexpr
					{
					s=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase_paren1323);  
					stream_SYMBOL.add(s);

					pushFollow(FOLLOW_lexpr_in_exprbase_paren1325);
					lexpr55=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr55.getTree());
					// AST REWRITE
					// elements: s, lexpr
					// token labels: s
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 138:31: -> ^( FUNC $s ( lexpr )? )
					{
						// while.g:138:34: ^( FUNC $s ( lexpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC, "FUNC"), root_1);
						adaptor.addChild(root_1, stream_s.nextNode());
						// while.g:138:44: ( lexpr )?
						if ( stream_lexpr.hasNext() ) {
							adaptor.addChild(root_1, stream_lexpr.nextTree());
						}
						stream_lexpr.reset();

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
		return retval;
	}
	// $ANTLR end "exprbase_paren"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// while.g:141:1: expression : a= exprbase ( '=?' b= exprbase )? -> $a ( $b)? ;
	public final whileParser.expression_return expression() throws RecognitionException {
		whileParser.expression_return retval = new whileParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal56=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		Object string_literal56_tree=null;
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// while.g:141:12: (a= exprbase ( '=?' b= exprbase )? -> $a ( $b)? )
			// while.g:142:7: a= exprbase ( '=?' b= exprbase )?
			{
			pushFollow(FOLLOW_exprbase_in_expression1367);
			a=exprbase();
			state._fsp--;

			stream_exprbase.add(a.getTree());
			// while.g:142:18: ( '=?' b= exprbase )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==41) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// while.g:142:19: '=?' b= exprbase
					{
					string_literal56=(Token)match(input,41,FOLLOW_41_in_expression1370);  
					stream_41.add(string_literal56);

					pushFollow(FOLLOW_exprbase_in_expression1374);
					b=exprbase();
					state._fsp--;

					stream_exprbase.add(b.getTree());
					}
					break;

			}

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
			// 143:7: -> $a ( $b)?
			{
				adaptor.addChild(root_0, stream_a.nextTree());
				// while.g:143:13: ( $b)?
				if ( stream_b.hasNext() ) {
					adaptor.addChild(root_0, stream_b.nextTree());
				}
				stream_b.reset();

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
		return retval;
	}
	// $ANTLR end "expression"


	public static class lexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lexpr"
	// while.g:146:1: lexpr : ( exprbase )* -> ( exprbase )* ;
	public final whileParser.lexpr_return lexpr() throws RecognitionException {
		whileParser.lexpr_return retval = new whileParser.lexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprbase57 =null;

		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// while.g:146:7: ( ( exprbase )* -> ( exprbase )* )
			// while.g:147:7: ( exprbase )*
			{
			// while.g:147:7: ( exprbase )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==SYMBOL||LA13_0==VARIABLE||LA13_0==36||LA13_0==53) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// while.g:147:7: exprbase
					{
					pushFollow(FOLLOW_exprbase_in_lexpr1412);
					exprbase57=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase57.getTree());
					}
					break;

				default :
					break loop13;
				}
			}

			// AST REWRITE
			// elements: exprbase
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 147:17: -> ( exprbase )*
			{
				// while.g:147:20: ( exprbase )*
				while ( stream_exprbase.hasNext() ) {
					adaptor.addChild(root_0, stream_exprbase.nextTree());
				}
				stream_exprbase.reset();

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
		return retval;
	}
	// $ANTLR end "lexpr"

	// Delegated rules



	public static final BitSet FOLLOW_function_in_program384 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_function411 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SYMBOL_in_function415 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_function417 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_definition_in_function419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_definition457 = new BitSet(new long[]{0x0000000104000000L});
	public static final BitSet FOLLOW_input_in_definition461 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_PERCENT_in_definition464 = new BitSet(new long[]{0x0844C00100000000L});
	public static final BitSet FOLLOW_commands_in_definition468 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_PERCENT_in_definition470 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_definition472 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_output_in_definition476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_input519 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_input522 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_VARIABLE_in_input526 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_VARIABLE_in_output568 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_output571 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_VARIABLE_in_output575 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_VARIABLE_in_vars617 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_vars620 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_VARIABLE_in_vars624 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_expression_in_exprs666 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_exprs669 = new BitSet(new long[]{0x0020001120000000L});
	public static final BitSet FOLLOW_expression_in_exprs673 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_command_in_commands715 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_commands719 = new BitSet(new long[]{0x0844C00100000000L});
	public static final BitSet FOLLOW_command_in_commands723 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_54_in_command_nop764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command_var791 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_command_var793 = new BitSet(new long[]{0x0020001120000000L});
	public static final BitSet FOLLOW_exprs_in_command_var797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_command_if826 = new BitSet(new long[]{0x0020001120000000L});
	public static final BitSet FOLLOW_expression_in_command_if828 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_command_if830 = new BitSet(new long[]{0x0844C00100000000L});
	public static final BitSet FOLLOW_commands_in_command_if834 = new BitSet(new long[]{0x0000300000000000L});
	public static final BitSet FOLLOW_44_in_command_if837 = new BitSet(new long[]{0x0844C00100000000L});
	public static final BitSet FOLLOW_commands_in_command_if841 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_command_if845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_command_while891 = new BitSet(new long[]{0x0020001120000000L});
	public static final BitSet FOLLOW_expression_in_command_while893 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_command_while895 = new BitSet(new long[]{0x0844C00100000000L});
	public static final BitSet FOLLOW_commands_in_command_while897 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_command_while899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_command_for936 = new BitSet(new long[]{0x0020001120000000L});
	public static final BitSet FOLLOW_expression_in_command_for938 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_command_for940 = new BitSet(new long[]{0x0844C00100000000L});
	public static final BitSet FOLLOW_commands_in_command_for942 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_command_for944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_command_foreach981 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_VARIABLE_in_command_foreach985 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_command_foreach987 = new BitSet(new long[]{0x0020001120000000L});
	public static final BitSet FOLLOW_expression_in_command_foreach989 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_command_foreach991 = new BitSet(new long[]{0x0844C00100000000L});
	public static final BitSet FOLLOW_commands_in_command_foreach993 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_command_foreach995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_nop_in_command1035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_var_in_command1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_if_in_command1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_while_in_command1059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_for_in_command1067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_foreach_in_command1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_exprbase1092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_exprbase1122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase1154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_exprbase1186 = new BitSet(new long[]{0x0412040020000000L});
	public static final BitSet FOLLOW_exprbase_paren_in_exprbase1188 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_exprbase1190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_exprbase_paren1215 = new BitSet(new long[]{0x0020001120000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase_paren1217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_exprbase_paren1242 = new BitSet(new long[]{0x0020001120000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase_paren1244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_exprbase_paren1269 = new BitSet(new long[]{0x0020001120000000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase_paren1271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_exprbase_paren1295 = new BitSet(new long[]{0x0020001120000000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase_paren1297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase_paren1323 = new BitSet(new long[]{0x0020001120000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase_paren1325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_expression1367 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_41_in_expression1370 = new BitSet(new long[]{0x0020001120000000L});
	public static final BitSet FOLLOW_exprbase_in_expression1374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_lexpr1412 = new BitSet(new long[]{0x0020001120000002L});
}
