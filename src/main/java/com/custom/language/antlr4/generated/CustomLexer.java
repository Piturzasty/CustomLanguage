// Generated from CustomLexer.g4 by ANTLR 4.7.2
package com.custom.language.antlr4.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CustomLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, FOREACH=2, IN=3, DO=4, WHILE=5, IF=6, ELSE=7, SWITCH=8, CASE=9, 
		CONTINUE=10, BREAK=11, DEFAULT=12, WRITE=13, WRITELINE=14, READ=15, MAIN=16, 
		RETURN=17, FLOAT=18, INT=19, VOID=20, BOOLEAN=21, ANY=22, DECIMAL_LITERAL=23, 
		BINARY_LITERAL=24, FLOAT_LITERAL=25, BOOL_LITERAL=26, STRING_LITERAL=27, 
		NULL_LITERAL=28, LPAREN=29, RPAREN=30, LBRACE=31, RBRACE=32, LBRACK=33, 
		RBRACK=34, COMMA=35, DOT=36, ASSIGN_LEFT=37, ASSIGN_RIGHT=38, GT=39, LT=40, 
		BANG=41, TILDE=42, QUESTION=43, COLON=44, EQUAL=45, LE=46, GE=47, NOTEQUAL=48, 
		AND=49, OR=50, INC=51, DEC=52, ADD=53, SUB=54, MUL=55, DIV=56, BITAND=57, 
		BITOR=58, CARET=59, MOD=60, ADD_ASSIGN=61, SUB_ASSIGN=62, MUL_ASSIGN=63, 
		DIV_ASSIGN=64, AND_ASSIGN=65, OR_ASSIGN=66, XOR_ASSIGN=67, MOD_ASSIGN=68, 
		ELLIPSIS=69, WS=70, COMMENT=71, SINGLE_COMMENT=72, IDENTIFIER=73;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "FOREACH", "IN", "DO", "WHILE", "IF", "ELSE", "SWITCH", "CASE", 
			"CONTINUE", "BREAK", "DEFAULT", "WRITE", "WRITELINE", "READ", "MAIN", 
			"RETURN", "FLOAT", "INT", "VOID", "BOOLEAN", "ANY", "DECIMAL_LITERAL", 
			"BINARY_LITERAL", "FLOAT_LITERAL", "BOOL_LITERAL", "STRING_LITERAL", 
			"NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"COMMA", "DOT", "ASSIGN_LEFT", "ASSIGN_RIGHT", "GT", "LT", "BANG", "TILDE", 
			"QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", 
			"DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "ELLIPSIS", "WS", "COMMENT", 
			"SINGLE_COMMENT", "IDENTIFIER", "ExponentPart", "EscapeSequence", "Digits", 
			"LetterOrDigit", "Letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'foreach'", "'in'", "'do'", "'while'", "'if'", "'else'", 
			"'switch'", "'case'", "'continue'", "'break'", "'default'", "'write'", 
			"'writeln'", "'read'", "'main'", "'return'", "'float'", "'int'", "'void'", 
			"'bool'", "'any'", null, null, null, null, null, "'null'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "','", "'.'", "'<-'", "'->'", "'>'", "'<'", 
			"'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'and'", 
			"'or'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
			"'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
			"'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "FOREACH", "IN", "DO", "WHILE", "IF", "ELSE", "SWITCH", 
			"CASE", "CONTINUE", "BREAK", "DEFAULT", "WRITE", "WRITELINE", "READ", 
			"MAIN", "RETURN", "FLOAT", "INT", "VOID", "BOOLEAN", "ANY", "DECIMAL_LITERAL", 
			"BINARY_LITERAL", "FLOAT_LITERAL", "BOOL_LITERAL", "STRING_LITERAL", 
			"NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"COMMA", "DOT", "ASSIGN_LEFT", "ASSIGN_RIGHT", "GT", "LT", "BANG", "TILDE", 
			"QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", 
			"DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "ELLIPSIS", "WS", "COMMENT", 
			"SINGLE_COMMENT", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CustomLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CustomLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2K\u0224\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u0120"+
		"\n\30\3\30\6\30\u0123\n\30\r\30\16\30\u0124\3\30\5\30\u0128\n\30\5\30"+
		"\u012a\n\30\3\30\5\30\u012d\n\30\3\31\3\31\3\31\3\31\7\31\u0133\n\31\f"+
		"\31\16\31\u0136\13\31\3\31\5\31\u0139\n\31\3\31\5\31\u013c\n\31\3\32\3"+
		"\32\3\32\5\32\u0141\n\32\3\32\3\32\5\32\u0145\n\32\3\32\5\32\u0148\n\32"+
		"\3\32\5\32\u014b\n\32\3\32\3\32\3\32\5\32\u0150\n\32\3\32\5\32\u0153\n"+
		"\32\5\32\u0155\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0160\n\33\3\34\3\34\3\34\7\34\u0165\n\34\f\34\16\34\u0168\13\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,"+
		"\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A"+
		"\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3F\3G\6G\u01d9\nG\rG"+
		"\16G\u01da\3G\3G\3H\3H\3H\3H\7H\u01e3\nH\fH\16H\u01e6\13H\3H\3H\3H\3H"+
		"\3H\3I\3I\3I\3I\7I\u01f1\nI\fI\16I\u01f4\13I\3I\3I\3J\3J\7J\u01fa\nJ\f"+
		"J\16J\u01fd\13J\3K\3K\5K\u0201\nK\3K\3K\3L\3L\3L\3L\5L\u0209\nL\3L\5L"+
		"\u020c\nL\3L\5L\u020f\nL\3M\3M\7M\u0213\nM\fM\16M\u0216\13M\3M\5M\u0219"+
		"\nM\3N\3N\5N\u021d\nN\3O\3O\3O\3O\5O\u0223\nO\3\u01e4\2P\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\3\2\26\3\2\63;\4\2NN"+
		"nn\4\2DDdd\3\2\62\63\4\2\62\63aa\6\2FFHHffhh\6\2\f\f\17\17$$^^\5\2\13"+
		"\f\16\17\"\"\4\2\f\f\17\17\4\2GGgg\4\2--//\n\2$$))^^ddhhppttvv\3\2\62"+
		"\65\3\2\629\3\2\62;\4\2\62;aa\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2"+
		"\ud802\udc01\3\2\udc02\ue001\2\u023d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\3\u009f\3\2\2\2\5\u00a6\3\2\2\2\7\u00ae\3\2\2\2\t\u00b1"+
		"\3\2\2\2\13\u00b4\3\2\2\2\r\u00ba\3\2\2\2\17\u00bd\3\2\2\2\21\u00c2\3"+
		"\2\2\2\23\u00c9\3\2\2\2\25\u00ce\3\2\2\2\27\u00d7\3\2\2\2\31\u00dd\3\2"+
		"\2\2\33\u00e5\3\2\2\2\35\u00eb\3\2\2\2\37\u00f3\3\2\2\2!\u00f8\3\2\2\2"+
		"#\u00fd\3\2\2\2%\u0104\3\2\2\2\'\u010a\3\2\2\2)\u010e\3\2\2\2+\u0113\3"+
		"\2\2\2-\u0118\3\2\2\2/\u0129\3\2\2\2\61\u012e\3\2\2\2\63\u0154\3\2\2\2"+
		"\65\u015f\3\2\2\2\67\u0161\3\2\2\29\u016b\3\2\2\2;\u0170\3\2\2\2=\u0172"+
		"\3\2\2\2?\u0174\3\2\2\2A\u0176\3\2\2\2C\u0178\3\2\2\2E\u017a\3\2\2\2G"+
		"\u017c\3\2\2\2I\u017e\3\2\2\2K\u0180\3\2\2\2M\u0183\3\2\2\2O\u0186\3\2"+
		"\2\2Q\u0188\3\2\2\2S\u018a\3\2\2\2U\u018c\3\2\2\2W\u018e\3\2\2\2Y\u0190"+
		"\3\2\2\2[\u0192\3\2\2\2]\u0195\3\2\2\2_\u0198\3\2\2\2a\u019b\3\2\2\2c"+
		"\u019e\3\2\2\2e\u01a2\3\2\2\2g\u01a5\3\2\2\2i\u01a8\3\2\2\2k\u01ab\3\2"+
		"\2\2m\u01ad\3\2\2\2o\u01af\3\2\2\2q\u01b1\3\2\2\2s\u01b3\3\2\2\2u\u01b5"+
		"\3\2\2\2w\u01b7\3\2\2\2y\u01b9\3\2\2\2{\u01bb\3\2\2\2}\u01be\3\2\2\2\177"+
		"\u01c1\3\2\2\2\u0081\u01c4\3\2\2\2\u0083\u01c7\3\2\2\2\u0085\u01ca\3\2"+
		"\2\2\u0087\u01cd\3\2\2\2\u0089\u01d0\3\2\2\2\u008b\u01d3\3\2\2\2\u008d"+
		"\u01d8\3\2\2\2\u008f\u01de\3\2\2\2\u0091\u01ec\3\2\2\2\u0093\u01f7\3\2"+
		"\2\2\u0095\u01fe\3\2\2\2\u0097\u020e\3\2\2\2\u0099\u0210\3\2\2\2\u009b"+
		"\u021c\3\2\2\2\u009d\u0222\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7o\2"+
		"\2\u00a1\u00a2\7r\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5"+
		"\7v\2\2\u00a5\4\3\2\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9"+
		"\7t\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7e\2\2\u00ac"+
		"\u00ad\7j\2\2\u00ad\6\3\2\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7p\2\2\u00b0"+
		"\b\3\2\2\2\u00b1\u00b2\7f\2\2\u00b2\u00b3\7q\2\2\u00b3\n\3\2\2\2\u00b4"+
		"\u00b5\7y\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7n\2\2"+
		"\u00b8\u00b9\7g\2\2\u00b9\f\3\2\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7h"+
		"\2\2\u00bc\16\3\2\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0"+
		"\7u\2\2\u00c0\u00c1\7g\2\2\u00c1\20\3\2\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4"+
		"\7y\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7e\2\2\u00c7"+
		"\u00c8\7j\2\2\u00c8\22\3\2\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7c\2\2\u00cb"+
		"\u00cc\7u\2\2\u00cc\u00cd\7g\2\2\u00cd\24\3\2\2\2\u00ce\u00cf\7e\2\2\u00cf"+
		"\u00d0\7q\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7k\2\2"+
		"\u00d3\u00d4\7p\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7g\2\2\u00d6\26\3\2"+
		"\2\2\u00d7\u00d8\7d\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7g\2\2\u00da\u00db"+
		"\7c\2\2\u00db\u00dc\7m\2\2\u00dc\30\3\2\2\2\u00dd\u00de\7f\2\2\u00de\u00df"+
		"\7g\2\2\u00df\u00e0\7h\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7w\2\2\u00e2"+
		"\u00e3\7n\2\2\u00e3\u00e4\7v\2\2\u00e4\32\3\2\2\2\u00e5\u00e6\7y\2\2\u00e6"+
		"\u00e7\7t\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7g\2\2"+
		"\u00ea\34\3\2\2\2\u00eb\u00ec\7y\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7"+
		"k\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2"+
		"\7p\2\2\u00f2\36\3\2\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6"+
		"\7c\2\2\u00f6\u00f7\7f\2\2\u00f7 \3\2\2\2\u00f8\u00f9\7o\2\2\u00f9\u00fa"+
		"\7c\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7p\2\2\u00fc\"\3\2\2\2\u00fd\u00fe"+
		"\7t\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7w\2\2\u0101"+
		"\u0102\7t\2\2\u0102\u0103\7p\2\2\u0103$\3\2\2\2\u0104\u0105\7h\2\2\u0105"+
		"\u0106\7n\2\2\u0106\u0107\7q\2\2\u0107\u0108\7c\2\2\u0108\u0109\7v\2\2"+
		"\u0109&\3\2\2\2\u010a\u010b\7k\2\2\u010b\u010c\7p\2\2\u010c\u010d\7v\2"+
		"\2\u010d(\3\2\2\2\u010e\u010f\7x\2\2\u010f\u0110\7q\2\2\u0110\u0111\7"+
		"k\2\2\u0111\u0112\7f\2\2\u0112*\3\2\2\2\u0113\u0114\7d\2\2\u0114\u0115"+
		"\7q\2\2\u0115\u0116\7q\2\2\u0116\u0117\7n\2\2\u0117,\3\2\2\2\u0118\u0119"+
		"\7c\2\2\u0119\u011a\7p\2\2\u011a\u011b\7{\2\2\u011b.\3\2\2\2\u011c\u012a"+
		"\7\62\2\2\u011d\u0127\t\2\2\2\u011e\u0120\5\u0099M\2\u011f\u011e\3\2\2"+
		"\2\u011f\u0120\3\2\2\2\u0120\u0128\3\2\2\2\u0121\u0123\7a\2\2\u0122\u0121"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0128\5\u0099M\2\u0127\u011f\3\2\2\2\u0127\u0122"+
		"\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u011c\3\2\2\2\u0129\u011d\3\2\2\2\u012a"+
		"\u012c\3\2\2\2\u012b\u012d\t\3\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\60\3\2\2\2\u012e\u012f\7\62\2\2\u012f\u0130\t\4\2\2\u0130\u0138"+
		"\t\5\2\2\u0131\u0133\t\6\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u0139\t\5\2\2\u0138\u0134\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013b\3\2\2\2\u013a\u013c\t\3\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\62\3\2\2\2\u013d\u013e\5\u0099M\2\u013e\u0140\7\60\2\2\u013f"+
		"\u0141\5\u0099M\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0145"+
		"\3\2\2\2\u0142\u0143\7\60\2\2\u0143\u0145\5\u0099M\2\u0144\u013d\3\2\2"+
		"\2\u0144\u0142\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0148\5\u0095K\2\u0147"+
		"\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u014b\t\7"+
		"\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0155\3\2\2\2\u014c"+
		"\u0152\5\u0099M\2\u014d\u014f\5\u0095K\2\u014e\u0150\t\7\2\2\u014f\u014e"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u0153\t\7\2\2\u0152"+
		"\u014d\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0144\3\2"+
		"\2\2\u0154\u014c\3\2\2\2\u0155\64\3\2\2\2\u0156\u0157\7v\2\2\u0157\u0158"+
		"\7t\2\2\u0158\u0159\7w\2\2\u0159\u0160\7g\2\2\u015a\u015b\7h\2\2\u015b"+
		"\u015c\7c\2\2\u015c\u015d\7n\2\2\u015d\u015e\7u\2\2\u015e\u0160\7g\2\2"+
		"\u015f\u0156\3\2\2\2\u015f\u015a\3\2\2\2\u0160\66\3\2\2\2\u0161\u0166"+
		"\7$\2\2\u0162\u0165\n\b\2\2\u0163\u0165\5\u0097L\2\u0164\u0162\3\2\2\2"+
		"\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\7$\2\2\u016a"+
		"8\3\2\2\2\u016b\u016c\7p\2\2\u016c\u016d\7w\2\2\u016d\u016e\7n\2\2\u016e"+
		"\u016f\7n\2\2\u016f:\3\2\2\2\u0170\u0171\7*\2\2\u0171<\3\2\2\2\u0172\u0173"+
		"\7+\2\2\u0173>\3\2\2\2\u0174\u0175\7}\2\2\u0175@\3\2\2\2\u0176\u0177\7"+
		"\177\2\2\u0177B\3\2\2\2\u0178\u0179\7]\2\2\u0179D\3\2\2\2\u017a\u017b"+
		"\7_\2\2\u017bF\3\2\2\2\u017c\u017d\7.\2\2\u017dH\3\2\2\2\u017e\u017f\7"+
		"\60\2\2\u017fJ\3\2\2\2\u0180\u0181\7>\2\2\u0181\u0182\7/\2\2\u0182L\3"+
		"\2\2\2\u0183\u0184\7/\2\2\u0184\u0185\7@\2\2\u0185N\3\2\2\2\u0186\u0187"+
		"\7@\2\2\u0187P\3\2\2\2\u0188\u0189\7>\2\2\u0189R\3\2\2\2\u018a\u018b\7"+
		"#\2\2\u018bT\3\2\2\2\u018c\u018d\7\u0080\2\2\u018dV\3\2\2\2\u018e\u018f"+
		"\7A\2\2\u018fX\3\2\2\2\u0190\u0191\7<\2\2\u0191Z\3\2\2\2\u0192\u0193\7"+
		"?\2\2\u0193\u0194\7?\2\2\u0194\\\3\2\2\2\u0195\u0196\7>\2\2\u0196\u0197"+
		"\7?\2\2\u0197^\3\2\2\2\u0198\u0199\7@\2\2\u0199\u019a\7?\2\2\u019a`\3"+
		"\2\2\2\u019b\u019c\7#\2\2\u019c\u019d\7?\2\2\u019db\3\2\2\2\u019e\u019f"+
		"\7c\2\2\u019f\u01a0\7p\2\2\u01a0\u01a1\7f\2\2\u01a1d\3\2\2\2\u01a2\u01a3"+
		"\7q\2\2\u01a3\u01a4\7t\2\2\u01a4f\3\2\2\2\u01a5\u01a6\7-\2\2\u01a6\u01a7"+
		"\7-\2\2\u01a7h\3\2\2\2\u01a8\u01a9\7/\2\2\u01a9\u01aa\7/\2\2\u01aaj\3"+
		"\2\2\2\u01ab\u01ac\7-\2\2\u01acl\3\2\2\2\u01ad\u01ae\7/\2\2\u01aen\3\2"+
		"\2\2\u01af\u01b0\7,\2\2\u01b0p\3\2\2\2\u01b1\u01b2\7\61\2\2\u01b2r\3\2"+
		"\2\2\u01b3\u01b4\7(\2\2\u01b4t\3\2\2\2\u01b5\u01b6\7~\2\2\u01b6v\3\2\2"+
		"\2\u01b7\u01b8\7`\2\2\u01b8x\3\2\2\2\u01b9\u01ba\7\'\2\2\u01baz\3\2\2"+
		"\2\u01bb\u01bc\7-\2\2\u01bc\u01bd\7?\2\2\u01bd|\3\2\2\2\u01be\u01bf\7"+
		"/\2\2\u01bf\u01c0\7?\2\2\u01c0~\3\2\2\2\u01c1\u01c2\7,\2\2\u01c2\u01c3"+
		"\7?\2\2\u01c3\u0080\3\2\2\2\u01c4\u01c5\7\61\2\2\u01c5\u01c6\7?\2\2\u01c6"+
		"\u0082\3\2\2\2\u01c7\u01c8\7(\2\2\u01c8\u01c9\7?\2\2\u01c9\u0084\3\2\2"+
		"\2\u01ca\u01cb\7~\2\2\u01cb\u01cc\7?\2\2\u01cc\u0086\3\2\2\2\u01cd\u01ce"+
		"\7`\2\2\u01ce\u01cf\7?\2\2\u01cf\u0088\3\2\2\2\u01d0\u01d1\7\'\2\2\u01d1"+
		"\u01d2\7?\2\2\u01d2\u008a\3\2\2\2\u01d3\u01d4\7\60\2\2\u01d4\u01d5\7\60"+
		"\2\2\u01d5\u01d6\7\60\2\2\u01d6\u008c\3\2\2\2\u01d7\u01d9\t\t\2\2\u01d8"+
		"\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2"+
		"\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\bG\2\2\u01dd\u008e\3\2\2\2\u01de"+
		"\u01df\7\61\2\2\u01df\u01e0\7,\2\2\u01e0\u01e4\3\2\2\2\u01e1\u01e3\13"+
		"\2\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\7,"+
		"\2\2\u01e8\u01e9\7\61\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\bH\2\2\u01eb"+
		"\u0090\3\2\2\2\u01ec\u01ed\7\61\2\2\u01ed\u01ee\7\61\2\2\u01ee\u01f2\3"+
		"\2\2\2\u01ef\u01f1\n\n\2\2\u01f0\u01ef\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2"+
		"\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f2\3\2"+
		"\2\2\u01f5\u01f6\bI\3\2\u01f6\u0092\3\2\2\2\u01f7\u01fb\5\u009dO\2\u01f8"+
		"\u01fa\5\u009bN\2\u01f9\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9"+
		"\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0094\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe"+
		"\u0200\t\13\2\2\u01ff\u0201\t\f\2\2\u0200\u01ff\3\2\2\2\u0200\u0201\3"+
		"\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\5\u0099M\2\u0203\u0096\3\2\2\2"+
		"\u0204\u0205\7^\2\2\u0205\u020f\t\r\2\2\u0206\u020b\7^\2\2\u0207\u0209"+
		"\t\16\2\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2"+
		"\u020a\u020c\t\17\2\2\u020b\u0208\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d"+
		"\3\2\2\2\u020d\u020f\t\17\2\2\u020e\u0204\3\2\2\2\u020e\u0206\3\2\2\2"+
		"\u020f\u0098\3\2\2\2\u0210\u0218\t\20\2\2\u0211\u0213\t\21\2\2\u0212\u0211"+
		"\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u0217\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0219\t\20\2\2\u0218\u0214\3"+
		"\2\2\2\u0218\u0219\3\2\2\2\u0219\u009a\3\2\2\2\u021a\u021d\5\u009dO\2"+
		"\u021b\u021d\t\20\2\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021d\u009c"+
		"\3\2\2\2\u021e\u0223\t\22\2\2\u021f\u0223\n\23\2\2\u0220\u0221\t\24\2"+
		"\2\u0221\u0223\t\25\2\2\u0222\u021e\3\2\2\2\u0222\u021f\3\2\2\2\u0222"+
		"\u0220\3\2\2\2\u0223\u009e\3\2\2\2!\2\u011f\u0124\u0127\u0129\u012c\u0134"+
		"\u0138\u013b\u0140\u0144\u0147\u014a\u014f\u0152\u0154\u015f\u0164\u0166"+
		"\u01da\u01e4\u01f2\u01fb\u0200\u0208\u020b\u020e\u0214\u0218\u021c\u0222"+
		"\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}