// $ANTLR 3.5.1 C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g 2025-12-19 09:59:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class whileLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public whileLexer() {} 
	public whileLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public whileLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g"; }

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:2:7: ( '(' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:2:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:3:7: ( ')' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:4:7: ( ':' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:4:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:5:7: ( ':=' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:5:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:6:7: ( ';' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:6:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:7:7: ( '=?' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:7:9: '=?'
			{
			match("=?"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:8:7: ( 'cons' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:8:9: 'cons'
			{
			match("cons"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:9:7: ( 'do' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:9:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:10:7: ( 'else' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:10:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:11:7: ( 'fi' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:11:9: 'fi'
			{
			match("fi"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:12:7: ( 'for' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:12:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:13:7: ( 'foreach' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:13:9: 'foreach'
			{
			match("foreach"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:14:7: ( 'function' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:14:9: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:15:7: ( 'hd' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:15:9: 'hd'
			{
			match("hd"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:16:7: ( 'if' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:16:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:17:7: ( 'in' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:17:9: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:18:7: ( 'list' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:18:9: 'list'
			{
			match("list"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:19:7: ( 'nil' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:19:9: 'nil'
			{
			match("nil"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:20:7: ( 'nop' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:20:9: 'nop'
			{
			match("nop"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:21:7: ( 'od' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:21:9: 'od'
			{
			match("od"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:22:7: ( 'read' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:22:9: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:23:7: ( 'then' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:23:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:24:7: ( 'tl' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:24:9: 'tl'
			{
			match("tl"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:25:7: ( 'while' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:25:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:26:7: ( 'write' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:26:9: 'write'
			{
			match("write"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "VARIABLE"
	public final void mVARIABLE() throws RecognitionException {
		try {
			int _type = VARIABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:37:9: ( ( 'A' .. 'Z' ) ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) | ( '0' .. '9' ) )* ( '!' | '?' )? )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:37:11: ( 'A' .. 'Z' ) ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) | ( '0' .. '9' ) )* ( '!' | '?' )?
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:37:22: ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) | ( '0' .. '9' ) )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:37:58: ( '!' | '?' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='!'||LA2_0=='?') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:
					{
					if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARIABLE"

	// $ANTLR start "SYMBOL"
	public final void mSYMBOL() throws RecognitionException {
		try {
			int _type = SYMBOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:38:7: ( ( 'a' .. 'z' ) ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) | ( '0' .. '9' ) )* ( '!' | '?' )? )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:38:11: ( 'a' .. 'z' ) ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) | ( '0' .. '9' ) )* ( '!' | '?' )?
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:38:22: ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) | ( '0' .. '9' ) )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:38:58: ( '!' | '?' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='!'||LA4_0=='?') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:
					{
					if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYMBOL"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:40:7: ( ',' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:40:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "PERCENT"
	public final void mPERCENT() throws RecognitionException {
		try {
			int _type = PERCENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:41:9: ( '%' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:41:11: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERCENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:42:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:42:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:8: ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | VARIABLE | SYMBOL | COMMA | PERCENT | WS )
		int alt5=30;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:10: T__36
				{
				mT__36(); 

				}
				break;
			case 2 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:16: T__37
				{
				mT__37(); 

				}
				break;
			case 3 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:22: T__38
				{
				mT__38(); 

				}
				break;
			case 4 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:28: T__39
				{
				mT__39(); 

				}
				break;
			case 5 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:34: T__40
				{
				mT__40(); 

				}
				break;
			case 6 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:40: T__41
				{
				mT__41(); 

				}
				break;
			case 7 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:46: T__42
				{
				mT__42(); 

				}
				break;
			case 8 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:52: T__43
				{
				mT__43(); 

				}
				break;
			case 9 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:58: T__44
				{
				mT__44(); 

				}
				break;
			case 10 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:64: T__45
				{
				mT__45(); 

				}
				break;
			case 11 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:70: T__46
				{
				mT__46(); 

				}
				break;
			case 12 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:76: T__47
				{
				mT__47(); 

				}
				break;
			case 13 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:82: T__48
				{
				mT__48(); 

				}
				break;
			case 14 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:88: T__49
				{
				mT__49(); 

				}
				break;
			case 15 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:94: T__50
				{
				mT__50(); 

				}
				break;
			case 16 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:100: T__51
				{
				mT__51(); 

				}
				break;
			case 17 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:106: T__52
				{
				mT__52(); 

				}
				break;
			case 18 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:112: T__53
				{
				mT__53(); 

				}
				break;
			case 19 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:118: T__54
				{
				mT__54(); 

				}
				break;
			case 20 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:124: T__55
				{
				mT__55(); 

				}
				break;
			case 21 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:130: T__56
				{
				mT__56(); 

				}
				break;
			case 22 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:136: T__57
				{
				mT__57(); 

				}
				break;
			case 23 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:142: T__58
				{
				mT__58(); 

				}
				break;
			case 24 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:148: T__59
				{
				mT__59(); 

				}
				break;
			case 25 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:154: T__60
				{
				mT__60(); 

				}
				break;
			case 26 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:160: VARIABLE
				{
				mVARIABLE(); 

				}
				break;
			case 27 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:169: SYMBOL
				{
				mSYMBOL(); 

				}
				break;
			case 28 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:176: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 29 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:182: PERCENT
				{
				mPERCENT(); 

				}
				break;
			case 30 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\output\\while.g:1:190: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\3\uffff\1\30\2\uffff\14\23\7\uffff\1\23\1\54\1\23\1\56\2\23\1\61\1\62"+
		"\1\63\3\23\1\67\2\23\1\72\3\23\1\uffff\1\23\1\uffff\1\100\1\23\3\uffff"+
		"\1\23\1\103\1\104\1\uffff\2\23\1\uffff\2\23\1\111\1\112\1\23\1\uffff\1"+
		"\23\1\115\2\uffff\1\116\1\117\2\23\2\uffff\2\23\3\uffff\1\124\1\125\2"+
		"\23\2\uffff\1\130\1\23\1\uffff\1\132\1\uffff";
	static final String DFA5_eofS =
		"\133\uffff";
	static final String DFA5_minS =
		"\1\11\2\uffff\1\75\2\uffff\2\157\1\154\1\151\1\144\1\146\2\151\1\144\1"+
		"\145\2\150\7\uffff\1\156\1\41\1\163\1\41\1\162\1\156\3\41\1\163\1\154"+
		"\1\160\1\41\1\141\1\145\1\41\2\151\1\163\1\uffff\1\145\1\uffff\1\41\1"+
		"\143\3\uffff\1\164\2\41\1\uffff\1\144\1\156\1\uffff\1\154\1\164\2\41\1"+
		"\141\1\uffff\1\164\1\41\2\uffff\2\41\2\145\2\uffff\1\143\1\151\3\uffff"+
		"\2\41\1\150\1\157\2\uffff\1\41\1\156\1\uffff\1\41\1\uffff";
	static final String DFA5_maxS =
		"\1\172\2\uffff\1\75\2\uffff\2\157\1\154\1\165\1\144\1\156\1\151\1\157"+
		"\1\144\1\145\1\154\1\162\7\uffff\1\156\1\172\1\163\1\172\1\162\1\156\3"+
		"\172\1\163\1\154\1\160\1\172\1\141\1\145\1\172\2\151\1\163\1\uffff\1\145"+
		"\1\uffff\1\172\1\143\3\uffff\1\164\2\172\1\uffff\1\144\1\156\1\uffff\1"+
		"\154\1\164\2\172\1\141\1\uffff\1\164\1\172\2\uffff\2\172\2\145\2\uffff"+
		"\1\143\1\151\3\uffff\2\172\1\150\1\157\2\uffff\1\172\1\156\1\uffff\1\172"+
		"\1\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\5\1\6\14\uffff\1\32\1\33\1\34\1\35\1\36\1\4"+
		"\1\3\23\uffff\1\10\1\uffff\1\12\2\uffff\1\16\1\17\1\20\3\uffff\1\24\2"+
		"\uffff\1\27\5\uffff\1\13\2\uffff\1\22\1\23\4\uffff\1\7\1\11\2\uffff\1"+
		"\21\1\25\1\26\4\uffff\1\30\1\31\2\uffff\1\14\1\uffff\1\15";
	static final String DFA5_specialS =
		"\133\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\26\2\uffff\1\26\22\uffff\1\26\4\uffff\1\25\2\uffff\1\1\1\2\2\uffff"+
			"\1\24\15\uffff\1\3\1\4\1\uffff\1\5\3\uffff\32\22\6\uffff\2\23\1\6\1\7"+
			"\1\10\1\11\1\23\1\12\1\13\2\23\1\14\1\23\1\15\1\16\2\23\1\17\1\23\1\20"+
			"\2\23\1\21\3\23",
			"",
			"",
			"\1\27",
			"",
			"",
			"\1\31",
			"\1\32",
			"\1\33",
			"\1\34\5\uffff\1\35\5\uffff\1\36",
			"\1\37",
			"\1\40\7\uffff\1\41",
			"\1\42",
			"\1\43\5\uffff\1\44",
			"\1\45",
			"\1\46",
			"\1\47\3\uffff\1\50",
			"\1\51\11\uffff\1\52",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\53",
			"\1\23\16\uffff\12\23\5\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\55",
			"\1\23\16\uffff\12\23\5\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\57",
			"\1\60",
			"\1\23\16\uffff\12\23\5\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\23\16\uffff\12\23\5\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\23\16\uffff\12\23\5\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\23\16\uffff\12\23\5\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\70",
			"\1\71",
			"\1\23\16\uffff\12\23\5\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\73",
			"\1\74",
			"\1\75",
			"",
			"\1\76",
			"",
			"\1\23\16\uffff\12\23\5\uffff\1\23\1\uffff\32\23\6\uffff\4\23\1\77\25"+
			"\23",
			"\1\101",
			"",
			"",
			"",
			"\1\102",
			"\1\23\16\uffff\12\23\5\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\23\16\uffff\12\23\5\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"",
			"\1\105",
			"\1\106",
			"",
			"\1\107",
			"\1\110",
			"\1\23\16\uffff\12\23\5\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\23\16\uffff\12\23\5\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\113",
			"",
			"\1\114",
			"\1\23\16\uffff\12\23\5\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"",
			"",
			"\1\23\16\uffff\12\23\5\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\23\16\uffff\12\23\5\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\120",
			"\1\121",
			"",
			"",
			"\1\122",
			"\1\123",
			"",
			"",
			"",
			"\1\23\16\uffff\12\23\5\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\23\16\uffff\12\23\5\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\126",
			"\1\127",
			"",
			"",
			"\1\23\16\uffff\12\23\5\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\131",
			"",
			"\1\23\16\uffff\12\23\5\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | VARIABLE | SYMBOL | COMMA | PERCENT | WS );";
		}
	}

}
