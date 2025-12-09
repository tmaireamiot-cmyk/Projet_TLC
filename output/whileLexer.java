// $ANTLR 3.5.1 C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g 2025-12-09 09:33:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class whileLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g"; }

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:2:7: ( '(' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:2:9: '('
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
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:3:7: ( ')' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:3:9: ')'
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
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:4:7: ( ':' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:4:9: ':'
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
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:5:7: ( ':=' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:5:9: ':='
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
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:6:7: ( ';' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:6:9: ';'
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
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:7:7: ( '=?' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:7:9: '=?'
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
	// $ANTLR end "T__48"

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:28:10: ( 'function' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:28:12: 'function'
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
	// $ANTLR end "FUNCTION"

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:29:10: ( 'read' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:29:12: 'read'
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
	// $ANTLR end "READ"

	// $ANTLR start "WRITE"
	public final void mWRITE() throws RecognitionException {
		try {
			int _type = WRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:30:10: ( 'write' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:30:12: 'write'
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
	// $ANTLR end "WRITE"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:31:10: ( 'if' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:31:12: 'if'
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
	// $ANTLR end "IF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:32:10: ( 'then' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:32:12: 'then'
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
	// $ANTLR end "THEN"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:33:10: ( 'else' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:33:12: 'else'
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
	// $ANTLR end "ELSE"

	// $ANTLR start "FI"
	public final void mFI() throws RecognitionException {
		try {
			int _type = FI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:34:10: ( 'fi' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:34:12: 'fi'
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
	// $ANTLR end "FI"

	// $ANTLR start "NOP"
	public final void mNOP() throws RecognitionException {
		try {
			int _type = NOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:35:10: ( 'nop' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:35:12: 'nop'
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
	// $ANTLR end "NOP"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:36:10: ( 'while' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:36:12: 'while'
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
	// $ANTLR end "WHILE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:37:10: ( 'for' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:37:12: 'for'
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
	// $ANTLR end "FOR"

	// $ANTLR start "FOREACH"
	public final void mFOREACH() throws RecognitionException {
		try {
			int _type = FOREACH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:38:10: ( 'foreach' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:38:12: 'foreach'
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
	// $ANTLR end "FOREACH"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:39:10: ( 'in' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:39:12: 'in'
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
	// $ANTLR end "IN"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:40:10: ( 'do' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:40:12: 'do'
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
	// $ANTLR end "DO"

	// $ANTLR start "OD"
	public final void mOD() throws RecognitionException {
		try {
			int _type = OD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:41:10: ( 'od' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:41:12: 'od'
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
	// $ANTLR end "OD"

	// $ANTLR start "LIST"
	public final void mLIST() throws RecognitionException {
		try {
			int _type = LIST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:42:10: ( 'list' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:42:12: 'list'
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
	// $ANTLR end "LIST"

	// $ANTLR start "CONS"
	public final void mCONS() throws RecognitionException {
		try {
			int _type = CONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:43:10: ( 'cons' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:43:12: 'cons'
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
	// $ANTLR end "CONS"

	// $ANTLR start "HD"
	public final void mHD() throws RecognitionException {
		try {
			int _type = HD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:44:10: ( 'hd' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:44:12: 'hd'
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
	// $ANTLR end "HD"

	// $ANTLR start "TL"
	public final void mTL() throws RecognitionException {
		try {
			int _type = TL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:45:10: ( 'tl' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:45:12: 'tl'
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
	// $ANTLR end "TL"

	// $ANTLR start "NIL"
	public final void mNIL() throws RecognitionException {
		try {
			int _type = NIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:46:10: ( 'nil' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:46:12: 'nil'
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
	// $ANTLR end "NIL"

	// $ANTLR start "VARIABLE"
	public final void mVARIABLE() throws RecognitionException {
		try {
			int _type = VARIABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:47:9: ( ( 'A' .. 'Z' ) ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) | ( '0' .. '1' ) )* ( '!' | '?' )? )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:47:11: ( 'A' .. 'Z' ) ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) | ( '0' .. '1' ) )* ( '!' | '?' )?
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:47:22: ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) | ( '0' .. '1' ) )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '1')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:47:58: ( '!' | '?' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='!'||LA2_0=='?') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:
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
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:48:7: ( ( 'a' .. 'z' ) ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) | ( '0' .. '1' ) )* ( '!' | '?' )? )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:48:11: ( 'a' .. 'z' ) ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) | ( '0' .. '1' ) )* ( '!' | '?' )?
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:48:22: ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) | ( '0' .. '1' ) )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '1')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:48:58: ( '!' | '?' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='!'||LA4_0=='?') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:
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
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:50:7: ( ',' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:50:9: ','
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
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:51:9: ( '%' )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:51:11: '%'
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
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:52:4: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:52:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:52:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			skip();
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
		// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:8: ( T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | FUNCTION | READ | WRITE | IF | THEN | ELSE | FI | NOP | WHILE | FOR | FOREACH | IN | DO | OD | LIST | CONS | HD | TL | NIL | VARIABLE | SYMBOL | COMMA | PERCENT | WS )
		int alt6=30;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:10: T__43
				{
				mT__43(); 

				}
				break;
			case 2 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:16: T__44
				{
				mT__44(); 

				}
				break;
			case 3 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:22: T__45
				{
				mT__45(); 

				}
				break;
			case 4 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:28: T__46
				{
				mT__46(); 

				}
				break;
			case 5 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:34: T__47
				{
				mT__47(); 

				}
				break;
			case 6 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:40: T__48
				{
				mT__48(); 

				}
				break;
			case 7 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:46: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 8 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:55: READ
				{
				mREAD(); 

				}
				break;
			case 9 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:60: WRITE
				{
				mWRITE(); 

				}
				break;
			case 10 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:66: IF
				{
				mIF(); 

				}
				break;
			case 11 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:69: THEN
				{
				mTHEN(); 

				}
				break;
			case 12 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:74: ELSE
				{
				mELSE(); 

				}
				break;
			case 13 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:79: FI
				{
				mFI(); 

				}
				break;
			case 14 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:82: NOP
				{
				mNOP(); 

				}
				break;
			case 15 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:86: WHILE
				{
				mWHILE(); 

				}
				break;
			case 16 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:92: FOR
				{
				mFOR(); 

				}
				break;
			case 17 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:96: FOREACH
				{
				mFOREACH(); 

				}
				break;
			case 18 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:104: IN
				{
				mIN(); 

				}
				break;
			case 19 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:107: DO
				{
				mDO(); 

				}
				break;
			case 20 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:110: OD
				{
				mOD(); 

				}
				break;
			case 21 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:113: LIST
				{
				mLIST(); 

				}
				break;
			case 22 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:118: CONS
				{
				mCONS(); 

				}
				break;
			case 23 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:123: HD
				{
				mHD(); 

				}
				break;
			case 24 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:126: TL
				{
				mTL(); 

				}
				break;
			case 25 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:129: NIL
				{
				mNIL(); 

				}
				break;
			case 26 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:133: VARIABLE
				{
				mVARIABLE(); 

				}
				break;
			case 27 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:142: SYMBOL
				{
				mSYMBOL(); 

				}
				break;
			case 28 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:149: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 29 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:155: PERCENT
				{
				mPERCENT(); 

				}
				break;
			case 30 :
				// C:\\Users\\tmami\\github-classroom\\Projet_TLC\\while.g:1:163: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\3\uffff\1\30\2\uffff\14\23\7\uffff\1\23\1\54\4\23\1\61\1\62\1\23\1\64"+
		"\3\23\1\70\1\71\2\23\1\74\1\23\1\uffff\1\77\3\23\2\uffff\1\23\1\uffff"+
		"\1\23\1\105\1\106\2\uffff\2\23\1\uffff\2\23\1\uffff\1\113\2\23\1\116\1"+
		"\117\2\uffff\1\120\1\121\2\23\1\uffff\1\124\1\125\4\uffff\2\23\2\uffff"+
		"\1\23\1\131\1\132\2\uffff";
	static final String DFA6_eofS =
		"\133\uffff";
	static final String DFA6_minS =
		"\1\11\2\uffff\1\75\2\uffff\1\151\1\145\1\150\1\146\1\150\1\154\1\151\1"+
		"\157\1\144\1\151\1\157\1\144\7\uffff\1\156\1\41\1\162\1\141\2\151\2\41"+
		"\1\145\1\41\1\163\1\160\1\154\2\41\1\163\1\156\1\41\1\143\1\uffff\1\41"+
		"\1\144\1\164\1\154\2\uffff\1\156\1\uffff\1\145\2\41\2\uffff\1\164\1\163"+
		"\1\uffff\1\164\1\141\1\uffff\1\41\2\145\2\41\2\uffff\2\41\1\151\1\143"+
		"\1\uffff\2\41\4\uffff\1\157\1\150\2\uffff\1\156\2\41\2\uffff";
	static final String DFA6_maxS =
		"\1\172\2\uffff\1\75\2\uffff\1\165\1\145\1\162\1\156\2\154\2\157\1\144"+
		"\1\151\1\157\1\144\7\uffff\1\156\1\172\1\162\1\141\2\151\2\172\1\145\1"+
		"\172\1\163\1\160\1\154\2\172\1\163\1\156\1\172\1\143\1\uffff\1\172\1\144"+
		"\1\164\1\154\2\uffff\1\156\1\uffff\1\145\2\172\2\uffff\1\164\1\163\1\uffff"+
		"\1\164\1\141\1\uffff\1\172\2\145\2\172\2\uffff\2\172\1\151\1\143\1\uffff"+
		"\2\172\4\uffff\1\157\1\150\2\uffff\1\156\2\172\2\uffff";
	static final String DFA6_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\5\1\6\14\uffff\1\32\1\33\1\34\1\35\1\36\1\4"+
		"\1\3\23\uffff\1\15\4\uffff\1\12\1\22\1\uffff\1\30\3\uffff\1\23\1\24\2"+
		"\uffff\1\27\2\uffff\1\20\5\uffff\1\16\1\31\4\uffff\1\10\2\uffff\1\13\1"+
		"\14\1\25\1\26\2\uffff\1\11\1\17\3\uffff\1\21\1\7";
	static final String DFA6_specialS =
		"\133\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\26\2\uffff\1\26\22\uffff\1\26\4\uffff\1\25\2\uffff\1\1\1\2\2\uffff"+
			"\1\24\15\uffff\1\3\1\4\1\uffff\1\5\3\uffff\32\22\6\uffff\2\23\1\20\1"+
			"\15\1\13\1\6\1\23\1\21\1\11\2\23\1\17\1\23\1\14\1\16\2\23\1\7\1\23\1"+
			"\12\2\23\1\10\3\23",
			"",
			"",
			"\1\27",
			"",
			"",
			"\1\32\5\uffff\1\33\5\uffff\1\31",
			"\1\34",
			"\1\36\11\uffff\1\35",
			"\1\37\7\uffff\1\40",
			"\1\41\3\uffff\1\42",
			"\1\43",
			"\1\45\5\uffff\1\44",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\53",
			"\1\23\16\uffff\2\23\15\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\23\16\uffff\2\23\15\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\23\16\uffff\2\23\15\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\63",
			"\1\23\16\uffff\2\23\15\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\23\16\uffff\2\23\15\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\23\16\uffff\2\23\15\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\72",
			"\1\73",
			"\1\23\16\uffff\2\23\15\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\75",
			"",
			"\1\23\16\uffff\2\23\15\uffff\1\23\1\uffff\32\23\6\uffff\4\23\1\76\25"+
			"\23",
			"\1\100",
			"\1\101",
			"\1\102",
			"",
			"",
			"\1\103",
			"",
			"\1\104",
			"\1\23\16\uffff\2\23\15\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\23\16\uffff\2\23\15\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"",
			"",
			"\1\107",
			"\1\110",
			"",
			"\1\111",
			"\1\112",
			"",
			"\1\23\16\uffff\2\23\15\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\114",
			"\1\115",
			"\1\23\16\uffff\2\23\15\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\23\16\uffff\2\23\15\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"",
			"",
			"\1\23\16\uffff\2\23\15\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\23\16\uffff\2\23\15\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\122",
			"\1\123",
			"",
			"\1\23\16\uffff\2\23\15\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\23\16\uffff\2\23\15\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"",
			"",
			"",
			"",
			"\1\126",
			"\1\127",
			"",
			"",
			"\1\130",
			"\1\23\16\uffff\2\23\15\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"\1\23\16\uffff\2\23\15\uffff\1\23\1\uffff\32\23\6\uffff\32\23",
			"",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | FUNCTION | READ | WRITE | IF | THEN | ELSE | FI | NOP | WHILE | FOR | FOREACH | IN | DO | OD | LIST | CONS | HD | TL | NIL | VARIABLE | SYMBOL | COMMA | PERCENT | WS );";
		}
	}

}
