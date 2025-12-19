// $ANTLR 3.5.2 .\\while.g 2025-12-15 15:58:16

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class whileParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMA", "COMMAND", "COMMANDS", 
		"DEFINITION", "EXPRBASE", "EXPRESSION", "EXPRESSIONS", "EXPRS", "FUNCTION", 
		"IF", "INPUT", "INPUTSUB", "LEXPR", "NOP", "OUTPUT", "PERCENT", "PROGRAM", 
		"SYMBOL", "VAR", "VARIABLE", "VARIABLES", "VARS", "WS", "'('", "')'", 
		"':'", "':='", "';'", "'=?'", "'cons'", "'do'", "'else'", "'fi'", "'for'", 
		"'foreach'", "'function'", "'hd'", "'if'", "'in'", "'list'", "'nil'", 
		"'nop'", "'od'", "'read'", "'then'", "'tl'", "'while'", "'write'"
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
	public static final int WS=26;

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
	@Override public String getGrammarFileName() { return ".\\while.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// .\\while.g:41:1: program : ( function )+ -> ^( PROGRAM ( function )+ ) ;
	public final whileParser.program_return program() throws RecognitionException {
		whileParser.program_return retval = new whileParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function1 =null;

		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");

		try {
			// .\\while.g:41:9: ( ( function )+ -> ^( PROGRAM ( function )+ ) )
			// .\\while.g:42:5: ( function )+
			{
			// .\\while.g:42:5: ( function )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==39) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// .\\while.g:42:5: function
					{
					pushFollow(FOLLOW_function_in_program321);
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
			// 42:15: -> ^( PROGRAM ( function )+ )
			{
				// .\\while.g:42:18: ^( PROGRAM ( function )+ )
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
	// .\\while.g:45:1: function : 'function' s= SYMBOL ':' definition -> ^( FUNCTION $s definition ) ;
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
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// .\\while.g:45:10: ( 'function' s= SYMBOL ':' definition -> ^( FUNCTION $s definition ) )
			// .\\while.g:46:5: 'function' s= SYMBOL ':' definition
			{
			string_literal2=(Token)match(input,39,FOLLOW_39_in_function348);  
			stream_39.add(string_literal2);

			s=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_function352);  
			stream_SYMBOL.add(s);

			char_literal3=(Token)match(input,29,FOLLOW_29_in_function354);  
			stream_29.add(char_literal3);

			pushFollow(FOLLOW_definition_in_function356);
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
			// 47:9: -> ^( FUNCTION $s definition )
			{
				// .\\while.g:47:12: ^( FUNCTION $s definition )
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
	// .\\while.g:50:1: definition : 'read' (i= input )? PERCENT c= commands PERCENT 'write' o= output -> ^( DEFINITION ^( INPUT ( $i)? ) ^( OUTPUT $o) $c) ;
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
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_PERCENT=new RewriteRuleTokenStream(adaptor,"token PERCENT");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// .\\while.g:50:12: ( 'read' (i= input )? PERCENT c= commands PERCENT 'write' o= output -> ^( DEFINITION ^( INPUT ( $i)? ) ^( OUTPUT $o) $c) )
			// .\\while.g:51:7: 'read' (i= input )? PERCENT c= commands PERCENT 'write' o= output
			{
			string_literal5=(Token)match(input,47,FOLLOW_47_in_definition394);  
			stream_47.add(string_literal5);

			// .\\while.g:51:15: (i= input )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==VARIABLE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// .\\while.g:51:15: i= input
					{
					pushFollow(FOLLOW_input_in_definition398);
					i=input();
					state._fsp--;

					stream_input.add(i.getTree());
					}
					break;

			}

			PERCENT6=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_definition401);  
			stream_PERCENT.add(PERCENT6);

			pushFollow(FOLLOW_commands_in_definition405);
			c=commands();
			state._fsp--;

			stream_commands.add(c.getTree());
			PERCENT7=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_definition407);  
			stream_PERCENT.add(PERCENT7);

			string_literal8=(Token)match(input,51,FOLLOW_51_in_definition409);  
			stream_51.add(string_literal8);

			pushFollow(FOLLOW_output_in_definition413);
			o=output();
			state._fsp--;

			stream_output.add(o.getTree());
			// AST REWRITE
			// elements: o, c, i
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
			// 52:7: -> ^( DEFINITION ^( INPUT ( $i)? ) ^( OUTPUT $o) $c)
			{
				// .\\while.g:52:10: ^( DEFINITION ^( INPUT ( $i)? ) ^( OUTPUT $o) $c)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFINITION, "DEFINITION"), root_1);
				// .\\while.g:52:23: ^( INPUT ( $i)? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_2);
				// .\\while.g:52:32: ( $i)?
				if ( stream_i.hasNext() ) {
					adaptor.addChild(root_2, stream_i.nextTree());
				}
				stream_i.reset();

				adaptor.addChild(root_1, root_2);
				}

				// .\\while.g:52:36: ^( OUTPUT $o)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_2);
				adaptor.addChild(root_2, stream_o.nextTree());
				adaptor.addChild(root_1, root_2);
				}

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
	// .\\while.g:55:1: input : v= VARIABLE ( COMMA v2= VARIABLE )* -> ^( INPUT $v ( $v2)* ) ;
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
			// .\\while.g:55:7: (v= VARIABLE ( COMMA v2= VARIABLE )* -> ^( INPUT $v ( $v2)* ) )
			// .\\while.g:56:7: v= VARIABLE ( COMMA v2= VARIABLE )*
			{
			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_input464);  
			stream_VARIABLE.add(v);

			// .\\while.g:56:18: ( COMMA v2= VARIABLE )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==COMMA) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// .\\while.g:56:19: COMMA v2= VARIABLE
					{
					COMMA9=(Token)match(input,COMMA,FOLLOW_COMMA_in_input467);  
					stream_COMMA.add(COMMA9);

					v2=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_input471);  
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
			// 57:7: -> ^( INPUT $v ( $v2)* )
			{
				// .\\while.g:57:10: ^( INPUT $v ( $v2)* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);
				adaptor.addChild(root_1, stream_v.nextNode());
				// .\\while.g:57:22: ( $v2)*
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
	// .\\while.g:60:1: output : v= VARIABLE ( COMMA v= VARIABLE )* -> ^( OUTPUT ( $v)+ ) ;
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

		try {
			// .\\while.g:60:8: (v= VARIABLE ( COMMA v= VARIABLE )* -> ^( OUTPUT ( $v)+ ) )
			// .\\while.g:61:7: v= VARIABLE ( COMMA v= VARIABLE )*
			{
			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output513);  
			stream_VARIABLE.add(v);

			// .\\while.g:61:18: ( COMMA v= VARIABLE )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==COMMA) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// .\\while.g:61:19: COMMA v= VARIABLE
					{
					COMMA10=(Token)match(input,COMMA,FOLLOW_COMMA_in_output516);  
					stream_COMMA.add(COMMA10);

					v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output520);  
					stream_VARIABLE.add(v);

					}
					break;

				default :
					break loop4;
				}
			}

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
			// 62:7: -> ^( OUTPUT ( $v)+ )
			{
				// .\\while.g:62:10: ^( OUTPUT ( $v)+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);
				if ( !(stream_v.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_v.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "output"


	public static class vars_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// .\\while.g:65:1: vars : v= VARIABLE ( COMMA v= VARIABLE )* -> ^( VARIABLES ( $v)+ ) ;
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

		try {
			// .\\while.g:65:6: (v= VARIABLE ( COMMA v= VARIABLE )* -> ^( VARIABLES ( $v)+ ) )
			// .\\while.g:66:7: v= VARIABLE ( COMMA v= VARIABLE )*
			{
			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars559);  
			stream_VARIABLE.add(v);

			// .\\while.g:66:18: ( COMMA v= VARIABLE )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// .\\while.g:66:19: COMMA v= VARIABLE
					{
					COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_vars562);  
					stream_COMMA.add(COMMA11);

					v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars566);  
					stream_VARIABLE.add(v);

					}
					break;

				default :
					break loop5;
				}
			}

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
			// 67:7: -> ^( VARIABLES ( $v)+ )
			{
				// .\\while.g:67:10: ^( VARIABLES ( $v)+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_1);
				if ( !(stream_v.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_v.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "vars"


	public static class exprs_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprs"
	// .\\while.g:70:1: exprs : e= expression ( COMMA e= expression )* -> ^( EXPRESSIONS ( $e)+ ) ;
	public final whileParser.exprs_return exprs() throws RecognitionException {
		whileParser.exprs_return retval = new whileParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA12=null;
		ParserRuleReturnScope e =null;

		Object COMMA12_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// .\\while.g:70:7: (e= expression ( COMMA e= expression )* -> ^( EXPRESSIONS ( $e)+ ) )
			// .\\while.g:71:7: e= expression ( COMMA e= expression )*
			{
			pushFollow(FOLLOW_expression_in_exprs605);
			e=expression();
			state._fsp--;

			stream_expression.add(e.getTree());
			// .\\while.g:71:20: ( COMMA e= expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// .\\while.g:71:21: COMMA e= expression
					{
					COMMA12=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprs608);  
					stream_COMMA.add(COMMA12);

					pushFollow(FOLLOW_expression_in_exprs612);
					e=expression();
					state._fsp--;

					stream_expression.add(e.getTree());
					}
					break;

				default :
					break loop6;
				}
			}

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
			// 72:7: -> ^( EXPRESSIONS ( $e)+ )
			{
				// .\\while.g:72:10: ^( EXPRESSIONS ( $e)+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSIONS, "EXPRESSIONS"), root_1);
				if ( !(stream_e.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_e.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "exprs"


	public static class commands_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "commands"
	// .\\while.g:75:1: commands : c= command ( ';' c= command )* -> ^( COMMANDS ( $c)+ ) ;
	public final whileParser.commands_return commands() throws RecognitionException {
		whileParser.commands_return retval = new whileParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal13=null;
		ParserRuleReturnScope c =null;

		Object char_literal13_tree=null;
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");

		try {
			// .\\while.g:75:10: (c= command ( ';' c= command )* -> ^( COMMANDS ( $c)+ ) )
			// .\\while.g:76:7: c= command ( ';' c= command )*
			{
			pushFollow(FOLLOW_command_in_commands651);
			c=command();
			state._fsp--;

			stream_command.add(c.getTree());
			// .\\while.g:76:17: ( ';' c= command )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==31) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// .\\while.g:76:19: ';' c= command
					{
					char_literal13=(Token)match(input,31,FOLLOW_31_in_commands655);  
					stream_31.add(char_literal13);

					pushFollow(FOLLOW_command_in_commands659);
					c=command();
					state._fsp--;

					stream_command.add(c.getTree());
					}
					break;

				default :
					break loop7;
				}
			}

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
			// 77:7: -> ^( COMMANDS ( $c)+ )
			{
				// .\\while.g:77:10: ^( COMMANDS ( $c)+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_1);
				if ( !(stream_c.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_c.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "commands"


	public static class command_nop_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_nop"
	// .\\while.g:80:1: command_nop : 'nop' -> ^( NOP ) ;
	public final whileParser.command_nop_return command_nop() throws RecognitionException {
		whileParser.command_nop_return retval = new whileParser.command_nop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal14=null;

		Object string_literal14_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");

		try {
			// .\\while.g:80:13: ( 'nop' -> ^( NOP ) )
			// .\\while.g:81:7: 'nop'
			{
			string_literal14=(Token)match(input,45,FOLLOW_45_in_command_nop697);  
			stream_45.add(string_literal14);

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
			// 81:13: -> ^( NOP )
			{
				// .\\while.g:81:16: ^( NOP )
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
	// .\\while.g:84:1: command_var : vars ':=' exprs -> ^( VAR vars exprs ) ;
	public final whileParser.command_var_return command_var() throws RecognitionException {
		whileParser.command_var_return retval = new whileParser.command_var_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal16=null;
		ParserRuleReturnScope vars15 =null;
		ParserRuleReturnScope exprs17 =null;

		Object string_literal16_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// .\\while.g:84:13: ( vars ':=' exprs -> ^( VAR vars exprs ) )
			// .\\while.g:85:7: vars ':=' exprs
			{
			pushFollow(FOLLOW_vars_in_command_var722);
			vars15=vars();
			state._fsp--;

			stream_vars.add(vars15.getTree());
			string_literal16=(Token)match(input,30,FOLLOW_30_in_command_var724);  
			stream_30.add(string_literal16);

			pushFollow(FOLLOW_exprs_in_command_var726);
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
			// 85:23: -> ^( VAR vars exprs )
			{
				// .\\while.g:85:26: ^( VAR vars exprs )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
				adaptor.addChild(root_1, stream_vars.nextTree());
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
		return retval;
	}
	// $ANTLR end "command_var"


	public static class command_if_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_if"
	// .\\while.g:88:1: command_if : 'if' expression 'then' c1= commands ( 'else' c2= commands )? 'fi' -> ^( COMMAND 'if' expression $c1 ( $c2)? ) ;
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
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// .\\while.g:88:12: ( 'if' expression 'then' c1= commands ( 'else' c2= commands )? 'fi' -> ^( COMMAND 'if' expression $c1 ( $c2)? ) )
			// .\\while.g:89:5: 'if' expression 'then' c1= commands ( 'else' c2= commands )? 'fi'
			{
			string_literal18=(Token)match(input,41,FOLLOW_41_in_command_if753);  
			stream_41.add(string_literal18);

			pushFollow(FOLLOW_expression_in_command_if755);
			expression19=expression();
			state._fsp--;

			stream_expression.add(expression19.getTree());
			string_literal20=(Token)match(input,48,FOLLOW_48_in_command_if757);  
			stream_48.add(string_literal20);

			pushFollow(FOLLOW_commands_in_command_if761);
			c1=commands();
			state._fsp--;

			stream_commands.add(c1.getTree());
			// .\\while.g:89:40: ( 'else' c2= commands )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==35) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// .\\while.g:89:41: 'else' c2= commands
					{
					string_literal21=(Token)match(input,35,FOLLOW_35_in_command_if764);  
					stream_35.add(string_literal21);

					pushFollow(FOLLOW_commands_in_command_if768);
					c2=commands();
					state._fsp--;

					stream_commands.add(c2.getTree());
					}
					break;

			}

			string_literal22=(Token)match(input,36,FOLLOW_36_in_command_if772);  
			stream_36.add(string_literal22);

			// AST REWRITE
			// elements: expression, c2, 41, c1
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
			// 90:9: -> ^( COMMAND 'if' expression $c1 ( $c2)? )
			{
				// .\\while.g:90:12: ^( COMMAND 'if' expression $c1 ( $c2)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);
				adaptor.addChild(root_1, stream_41.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_c1.nextTree());
				// .\\while.g:90:42: ( $c2)?
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
	// .\\while.g:93:1: command_while : 'while' expression 'do' commands 'od' -> ^( COMMAND 'while' expression commands ) ;
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
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// .\\while.g:93:15: ( 'while' expression 'do' commands 'od' -> ^( COMMAND 'while' expression commands ) )
			// .\\while.g:94:7: 'while' expression 'do' commands 'od'
			{
			string_literal23=(Token)match(input,50,FOLLOW_50_in_command_while818);  
			stream_50.add(string_literal23);

			pushFollow(FOLLOW_expression_in_command_while820);
			expression24=expression();
			state._fsp--;

			stream_expression.add(expression24.getTree());
			string_literal25=(Token)match(input,34,FOLLOW_34_in_command_while822);  
			stream_34.add(string_literal25);

			pushFollow(FOLLOW_commands_in_command_while824);
			commands26=commands();
			state._fsp--;

			stream_commands.add(commands26.getTree());
			string_literal27=(Token)match(input,46,FOLLOW_46_in_command_while826);  
			stream_46.add(string_literal27);

			// AST REWRITE
			// elements: commands, expression, 50
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 95:7: -> ^( COMMAND 'while' expression commands )
			{
				// .\\while.g:95:10: ^( COMMAND 'while' expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);
				adaptor.addChild(root_1, stream_50.nextNode());
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
	// .\\while.g:98:1: command_for : 'for' expression 'do' commands 'od' -> ^( COMMAND 'for' expression commands ) ;
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
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// .\\while.g:98:13: ( 'for' expression 'do' commands 'od' -> ^( COMMAND 'for' expression commands ) )
			// .\\while.g:99:7: 'for' expression 'do' commands 'od'
			{
			string_literal28=(Token)match(input,37,FOLLOW_37_in_command_for863);  
			stream_37.add(string_literal28);

			pushFollow(FOLLOW_expression_in_command_for865);
			expression29=expression();
			state._fsp--;

			stream_expression.add(expression29.getTree());
			string_literal30=(Token)match(input,34,FOLLOW_34_in_command_for867);  
			stream_34.add(string_literal30);

			pushFollow(FOLLOW_commands_in_command_for869);
			commands31=commands();
			state._fsp--;

			stream_commands.add(commands31.getTree());
			string_literal32=(Token)match(input,46,FOLLOW_46_in_command_for871);  
			stream_46.add(string_literal32);

			// AST REWRITE
			// elements: expression, commands, 37
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 100:7: -> ^( COMMAND 'for' expression commands )
			{
				// .\\while.g:100:10: ^( COMMAND 'for' expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);
				adaptor.addChild(root_1, stream_37.nextNode());
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
	// .\\while.g:103:1: command_foreach : 'foreach' v= VARIABLE 'in' expression 'do' commands 'od' -> ^( COMMAND 'foreach' $v expression commands ) ;
	public final whileParser.command_foreach_return command_foreach() throws RecognitionException {
		whileParser.command_foreach_return retval = new whileParser.command_foreach_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v=null;
		Token string_literal33=null;
		Token string_literal34=null;
		Token string_literal36=null;
		Token string_literal38=null;
		ParserRuleReturnScope expression35 =null;
		ParserRuleReturnScope commands37 =null;

		Object v_tree=null;
		Object string_literal33_tree=null;
		Object string_literal34_tree=null;
		Object string_literal36_tree=null;
		Object string_literal38_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// .\\while.g:103:17: ( 'foreach' v= VARIABLE 'in' expression 'do' commands 'od' -> ^( COMMAND 'foreach' $v expression commands ) )
			// .\\while.g:104:7: 'foreach' v= VARIABLE 'in' expression 'do' commands 'od'
			{
			string_literal33=(Token)match(input,38,FOLLOW_38_in_command_foreach908);  
			stream_38.add(string_literal33);

			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_command_foreach912);  
			stream_VARIABLE.add(v);

			string_literal34=(Token)match(input,42,FOLLOW_42_in_command_foreach914);  
			stream_42.add(string_literal34);

			pushFollow(FOLLOW_expression_in_command_foreach916);
			expression35=expression();
			state._fsp--;

			stream_expression.add(expression35.getTree());
			string_literal36=(Token)match(input,34,FOLLOW_34_in_command_foreach918);  
			stream_34.add(string_literal36);

			pushFollow(FOLLOW_commands_in_command_foreach920);
			commands37=commands();
			state._fsp--;

			stream_commands.add(commands37.getTree());
			string_literal38=(Token)match(input,46,FOLLOW_46_in_command_foreach922);  
			stream_46.add(string_literal38);

			// AST REWRITE
			// elements: v, commands, 38, expression
			// token labels: v
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 105:7: -> ^( COMMAND 'foreach' $v expression commands )
			{
				// .\\while.g:105:10: ^( COMMAND 'foreach' $v expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND, "COMMAND"), root_1);
				adaptor.addChild(root_1, stream_38.nextNode());
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
	// .\\while.g:108:1: command : ( command_nop | command_var | command_if | command_while | command_for | command_foreach );
	public final whileParser.command_return command() throws RecognitionException {
		whileParser.command_return retval = new whileParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope command_nop39 =null;
		ParserRuleReturnScope command_var40 =null;
		ParserRuleReturnScope command_if41 =null;
		ParserRuleReturnScope command_while42 =null;
		ParserRuleReturnScope command_for43 =null;
		ParserRuleReturnScope command_foreach44 =null;


		try {
			// .\\while.g:108:9: ( command_nop | command_var | command_if | command_while | command_for | command_foreach )
			int alt9=6;
			switch ( input.LA(1) ) {
			case 45:
				{
				alt9=1;
				}
				break;
			case VARIABLE:
				{
				alt9=2;
				}
				break;
			case 41:
				{
				alt9=3;
				}
				break;
			case 50:
				{
				alt9=4;
				}
				break;
			case 37:
				{
				alt9=5;
				}
				break;
			case 38:
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
					// .\\while.g:109:7: command_nop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_nop_in_command962);
					command_nop39=command_nop();
					state._fsp--;

					adaptor.addChild(root_0, command_nop39.getTree());

					}
					break;
				case 2 :
					// .\\while.g:110:7: command_var
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_var_in_command970);
					command_var40=command_var();
					state._fsp--;

					adaptor.addChild(root_0, command_var40.getTree());

					}
					break;
				case 3 :
					// .\\while.g:111:7: command_if
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_if_in_command978);
					command_if41=command_if();
					state._fsp--;

					adaptor.addChild(root_0, command_if41.getTree());

					}
					break;
				case 4 :
					// .\\while.g:112:7: command_while
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_while_in_command986);
					command_while42=command_while();
					state._fsp--;

					adaptor.addChild(root_0, command_while42.getTree());

					}
					break;
				case 5 :
					// .\\while.g:113:7: command_for
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_for_in_command994);
					command_for43=command_for();
					state._fsp--;

					adaptor.addChild(root_0, command_for43.getTree());

					}
					break;
				case 6 :
					// .\\while.g:114:7: command_foreach
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_foreach_in_command1002);
					command_foreach44=command_foreach();
					state._fsp--;

					adaptor.addChild(root_0, command_foreach44.getTree());

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
	// .\\while.g:117:1: exprbase : ( 'nil' -> ^( EXPRBASE 'nil' ) |v= VARIABLE -> ^( EXPRBASE $v) |s= SYMBOL -> ^( EXPRBASE $s) | '(' exprbase_paren ')' -> ^( EXPRBASE exprbase_paren ) );
	public final whileParser.exprbase_return exprbase() throws RecognitionException {
		whileParser.exprbase_return retval = new whileParser.exprbase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v=null;
		Token s=null;
		Token string_literal45=null;
		Token char_literal46=null;
		Token char_literal48=null;
		ParserRuleReturnScope exprbase_paren47 =null;

		Object v_tree=null;
		Object s_tree=null;
		Object string_literal45_tree=null;
		Object char_literal46_tree=null;
		Object char_literal48_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleSubtreeStream stream_exprbase_paren=new RewriteRuleSubtreeStream(adaptor,"rule exprbase_paren");

		try {
			// .\\while.g:118:5: ( 'nil' -> ^( EXPRBASE 'nil' ) |v= VARIABLE -> ^( EXPRBASE $v) |s= SYMBOL -> ^( EXPRBASE $s) | '(' exprbase_paren ')' -> ^( EXPRBASE exprbase_paren ) )
			int alt10=4;
			switch ( input.LA(1) ) {
			case 44:
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
			case 27:
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
					// .\\while.g:118:7: 'nil'
					{
					string_literal45=(Token)match(input,44,FOLLOW_44_in_exprbase1019);  
					stream_44.add(string_literal45);

					// AST REWRITE
					// elements: 44
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 118:29: -> ^( EXPRBASE 'nil' )
					{
						// .\\while.g:118:32: ^( EXPRBASE 'nil' )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
						adaptor.addChild(root_1, stream_44.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// .\\while.g:119:7: v= VARIABLE
					{
					v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_exprbase1053);  
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
					// 119:31: -> ^( EXPRBASE $v)
					{
						// .\\while.g:119:34: ^( EXPRBASE $v)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// .\\while.g:120:7: s= SYMBOL
					{
					s=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase1085);  
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
					// 120:31: -> ^( EXPRBASE $s)
					{
						// .\\while.g:120:34: ^( EXPRBASE $s)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
						adaptor.addChild(root_1, stream_s.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// .\\while.g:121:7: '(' exprbase_paren ')'
					{
					char_literal46=(Token)match(input,27,FOLLOW_27_in_exprbase1117);  
					stream_27.add(char_literal46);

					pushFollow(FOLLOW_exprbase_paren_in_exprbase1119);
					exprbase_paren47=exprbase_paren();
					state._fsp--;

					stream_exprbase_paren.add(exprbase_paren47.getTree());
					char_literal48=(Token)match(input,28,FOLLOW_28_in_exprbase1121);  
					stream_28.add(char_literal48);

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
					// 121:30: -> ^( EXPRBASE exprbase_paren )
					{
						// .\\while.g:121:33: ^( EXPRBASE exprbase_paren )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
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
	// .\\while.g:124:1: exprbase_paren : ( 'list' lexpr -> ^( EXPRBASE 'list' lexpr ) | 'cons' lexpr -> ^( EXPRBASE 'cons' lexpr ) | 'hd' exprbase -> ^( EXPRBASE 'hd' exprbase ) | 'tl' exprbase -> ^( EXPRBASE 'tl' exprbase ) |s= SYMBOL lexpr -> ^( EXPRBASE $s lexpr ) );
	public final whileParser.exprbase_paren_return exprbase_paren() throws RecognitionException {
		whileParser.exprbase_paren_return retval = new whileParser.exprbase_paren_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token s=null;
		Token string_literal49=null;
		Token string_literal51=null;
		Token string_literal53=null;
		Token string_literal55=null;
		ParserRuleReturnScope lexpr50 =null;
		ParserRuleReturnScope lexpr52 =null;
		ParserRuleReturnScope exprbase54 =null;
		ParserRuleReturnScope exprbase56 =null;
		ParserRuleReturnScope lexpr57 =null;

		Object s_tree=null;
		Object string_literal49_tree=null;
		Object string_literal51_tree=null;
		Object string_literal53_tree=null;
		Object string_literal55_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// .\\while.g:125:5: ( 'list' lexpr -> ^( EXPRBASE 'list' lexpr ) | 'cons' lexpr -> ^( EXPRBASE 'cons' lexpr ) | 'hd' exprbase -> ^( EXPRBASE 'hd' exprbase ) | 'tl' exprbase -> ^( EXPRBASE 'tl' exprbase ) |s= SYMBOL lexpr -> ^( EXPRBASE $s lexpr ) )
			int alt11=5;
			switch ( input.LA(1) ) {
			case 43:
				{
				alt11=1;
				}
				break;
			case 33:
				{
				alt11=2;
				}
				break;
			case 40:
				{
				alt11=3;
				}
				break;
			case 49:
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
					// .\\while.g:125:7: 'list' lexpr
					{
					string_literal49=(Token)match(input,43,FOLLOW_43_in_exprbase_paren1146);  
					stream_43.add(string_literal49);

					pushFollow(FOLLOW_lexpr_in_exprbase_paren1148);
					lexpr50=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr50.getTree());
					// AST REWRITE
					// elements: 43, lexpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 125:29: -> ^( EXPRBASE 'list' lexpr )
					{
						// .\\while.g:125:32: ^( EXPRBASE 'list' lexpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
						adaptor.addChild(root_1, stream_43.nextNode());
						adaptor.addChild(root_1, stream_lexpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// .\\while.g:126:7: 'cons' lexpr
					{
					string_literal51=(Token)match(input,33,FOLLOW_33_in_exprbase_paren1175);  
					stream_33.add(string_literal51);

					pushFollow(FOLLOW_lexpr_in_exprbase_paren1177);
					lexpr52=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr52.getTree());
					// AST REWRITE
					// elements: lexpr, 33
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 126:29: -> ^( EXPRBASE 'cons' lexpr )
					{
						// .\\while.g:126:32: ^( EXPRBASE 'cons' lexpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
						adaptor.addChild(root_1, stream_33.nextNode());
						adaptor.addChild(root_1, stream_lexpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// .\\while.g:127:7: 'hd' exprbase
					{
					string_literal53=(Token)match(input,40,FOLLOW_40_in_exprbase_paren1204);  
					stream_40.add(string_literal53);

					pushFollow(FOLLOW_exprbase_in_exprbase_paren1206);
					exprbase54=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase54.getTree());
					// AST REWRITE
					// elements: 40, exprbase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 127:29: -> ^( EXPRBASE 'hd' exprbase )
					{
						// .\\while.g:127:32: ^( EXPRBASE 'hd' exprbase )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
						adaptor.addChild(root_1, stream_40.nextNode());
						adaptor.addChild(root_1, stream_exprbase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// .\\while.g:128:7: 'tl' exprbase
					{
					string_literal55=(Token)match(input,49,FOLLOW_49_in_exprbase_paren1232);  
					stream_49.add(string_literal55);

					pushFollow(FOLLOW_exprbase_in_exprbase_paren1234);
					exprbase56=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase56.getTree());
					// AST REWRITE
					// elements: exprbase, 49
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 128:29: -> ^( EXPRBASE 'tl' exprbase )
					{
						// .\\while.g:128:32: ^( EXPRBASE 'tl' exprbase )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
						adaptor.addChild(root_1, stream_49.nextNode());
						adaptor.addChild(root_1, stream_exprbase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// .\\while.g:129:7: s= SYMBOL lexpr
					{
					s=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase_paren1262);  
					stream_SYMBOL.add(s);

					pushFollow(FOLLOW_lexpr_in_exprbase_paren1264);
					lexpr57=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr57.getTree());
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
					// 129:31: -> ^( EXPRBASE $s lexpr )
					{
						// .\\while.g:129:34: ^( EXPRBASE $s lexpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
						adaptor.addChild(root_1, stream_s.nextNode());
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
		return retval;
	}
	// $ANTLR end "exprbase_paren"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// .\\while.g:132:1: expression : a= exprbase ( '=?' b= exprbase )? -> ^( EXPRESSION $a ( $b)? ) ;
	public final whileParser.expression_return expression() throws RecognitionException {
		whileParser.expression_return retval = new whileParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal58=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		Object string_literal58_tree=null;
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// .\\while.g:132:12: (a= exprbase ( '=?' b= exprbase )? -> ^( EXPRESSION $a ( $b)? ) )
			// .\\while.g:133:7: a= exprbase ( '=?' b= exprbase )?
			{
			pushFollow(FOLLOW_exprbase_in_expression1305);
			a=exprbase();
			state._fsp--;

			stream_exprbase.add(a.getTree());
			// .\\while.g:133:18: ( '=?' b= exprbase )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==32) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// .\\while.g:133:19: '=?' b= exprbase
					{
					string_literal58=(Token)match(input,32,FOLLOW_32_in_expression1308);  
					stream_32.add(string_literal58);

					pushFollow(FOLLOW_exprbase_in_expression1312);
					b=exprbase();
					state._fsp--;

					stream_exprbase.add(b.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: b, a
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
			// 134:7: -> ^( EXPRESSION $a ( $b)? )
			{
				// .\\while.g:134:10: ^( EXPRESSION $a ( $b)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSION, "EXPRESSION"), root_1);
				adaptor.addChild(root_1, stream_a.nextTree());
				// .\\while.g:134:26: ( $b)?
				if ( stream_b.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "expression"


	public static class lexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lexpr"
	// .\\while.g:137:1: lexpr : (e= exprbase )* -> ^( LEXPR ( $e)* ) ;
	public final whileParser.lexpr_return lexpr() throws RecognitionException {
		whileParser.lexpr_return retval = new whileParser.lexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope e =null;

		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// .\\while.g:137:7: ( (e= exprbase )* -> ^( LEXPR ( $e)* ) )
			// .\\while.g:138:7: (e= exprbase )*
			{
			// .\\while.g:138:8: (e= exprbase )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==SYMBOL||LA13_0==VARIABLE||LA13_0==27||LA13_0==44) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// .\\while.g:138:8: e= exprbase
					{
					pushFollow(FOLLOW_exprbase_in_lexpr1356);
					e=exprbase();
					state._fsp--;

					stream_exprbase.add(e.getTree());
					}
					break;

				default :
					break loop13;
				}
			}

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
			// 138:19: -> ^( LEXPR ( $e)* )
			{
				// .\\while.g:138:22: ^( LEXPR ( $e)* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LEXPR, "LEXPR"), root_1);
				// .\\while.g:138:31: ( $e)*
				while ( stream_e.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "lexpr"

	// Delegated rules



	public static final BitSet FOLLOW_function_in_program321 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_function348 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_SYMBOL_in_function352 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_function354 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_definition_in_function356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_definition394 = new BitSet(new long[]{0x0000000000880000L});
	public static final BitSet FOLLOW_input_in_definition398 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PERCENT_in_definition401 = new BitSet(new long[]{0x0004226000800000L});
	public static final BitSet FOLLOW_commands_in_definition405 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PERCENT_in_definition407 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_definition409 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_output_in_definition413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_input464 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_COMMA_in_input467 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VARIABLE_in_input471 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_VARIABLE_in_output513 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_COMMA_in_output516 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VARIABLE_in_output520 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_VARIABLE_in_vars559 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_COMMA_in_vars562 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VARIABLE_in_vars566 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_expression_in_exprs605 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_COMMA_in_exprs608 = new BitSet(new long[]{0x0000100008A00000L});
	public static final BitSet FOLLOW_expression_in_exprs612 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_command_in_commands651 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_commands655 = new BitSet(new long[]{0x0004226000800000L});
	public static final BitSet FOLLOW_command_in_commands659 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_45_in_command_nop697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command_var722 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_command_var724 = new BitSet(new long[]{0x0000100008A00000L});
	public static final BitSet FOLLOW_exprs_in_command_var726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_command_if753 = new BitSet(new long[]{0x0000100008A00000L});
	public static final BitSet FOLLOW_expression_in_command_if755 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_command_if757 = new BitSet(new long[]{0x0004226000800000L});
	public static final BitSet FOLLOW_commands_in_command_if761 = new BitSet(new long[]{0x0000001800000000L});
	public static final BitSet FOLLOW_35_in_command_if764 = new BitSet(new long[]{0x0004226000800000L});
	public static final BitSet FOLLOW_commands_in_command_if768 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_command_if772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_command_while818 = new BitSet(new long[]{0x0000100008A00000L});
	public static final BitSet FOLLOW_expression_in_command_while820 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_command_while822 = new BitSet(new long[]{0x0004226000800000L});
	public static final BitSet FOLLOW_commands_in_command_while824 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_command_while826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_command_for863 = new BitSet(new long[]{0x0000100008A00000L});
	public static final BitSet FOLLOW_expression_in_command_for865 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_command_for867 = new BitSet(new long[]{0x0004226000800000L});
	public static final BitSet FOLLOW_commands_in_command_for869 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_command_for871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_command_foreach908 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VARIABLE_in_command_foreach912 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_command_foreach914 = new BitSet(new long[]{0x0000100008A00000L});
	public static final BitSet FOLLOW_expression_in_command_foreach916 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_command_foreach918 = new BitSet(new long[]{0x0004226000800000L});
	public static final BitSet FOLLOW_commands_in_command_foreach920 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_command_foreach922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_nop_in_command962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_var_in_command970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_if_in_command978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_while_in_command986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_for_in_command994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_foreach_in_command1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_exprbase1019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_exprbase1053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase1085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_exprbase1117 = new BitSet(new long[]{0x0002090200200000L});
	public static final BitSet FOLLOW_exprbase_paren_in_exprbase1119 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_exprbase1121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_exprbase_paren1146 = new BitSet(new long[]{0x0000100008A00000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase_paren1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_exprbase_paren1175 = new BitSet(new long[]{0x0000100008A00000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase_paren1177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_exprbase_paren1204 = new BitSet(new long[]{0x0000100008A00000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase_paren1206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_exprbase_paren1232 = new BitSet(new long[]{0x0000100008A00000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase_paren1234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase_paren1262 = new BitSet(new long[]{0x0000100008A00000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase_paren1264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_expression1305 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_expression1308 = new BitSet(new long[]{0x0000100008A00000L});
	public static final BitSet FOLLOW_exprbase_in_expression1312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_lexpr1356 = new BitSet(new long[]{0x0000100008A00002L});
}
