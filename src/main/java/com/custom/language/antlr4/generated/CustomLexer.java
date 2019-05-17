// Generated from CustomLexer.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, FOREACH=2, IN=3, DO=4, WHILE=5, IF=6, ELSE=7, SWITCH=8, CASE=9, 
		CONTINUE=10, BREAK=11, DEFAULT=12, WRITE=13, READ=14, MAIN=15, RETURN=16, 
		FLOAT=17, INT=18, VOID=19, BOOLEAN=20, ANY=21, DECIMAL_LITERAL=22, BINARY_LITERAL=23, 
		FLOAT_LITERAL=24, BOOL_LITERAL=25, STRING_LITERAL=26, NULL_LITERAL=27, 
		LPAREN=28, RPAREN=29, LBRACE=30, RBRACE=31, LBRACK=32, RBRACK=33, COMMA=34, 
		DOT=35, ASSIGN_LEFT=36, ASSIGN_RIGHT=37, GT=38, LT=39, BANG=40, TILDE=41, 
		QUESTION=42, COLON=43, EQUAL=44, LE=45, GE=46, NOTEQUAL=47, AND=48, OR=49, 
		INC=50, DEC=51, ADD=52, SUB=53, MUL=54, DIV=55, BITAND=56, BITOR=57, CARET=58, 
		MOD=59, ADD_ASSIGN=60, SUB_ASSIGN=61, MUL_ASSIGN=62, DIV_ASSIGN=63, AND_ASSIGN=64, 
		OR_ASSIGN=65, XOR_ASSIGN=66, MOD_ASSIGN=67, LSHIFT_ASSIGN=68, RSHIFT_ASSIGN=69, 
		URSHIFT_ASSIGN=70, ELLIPSIS=71, WS=72, COMMENT=73, IDENTIFIER=74;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IMPORT", "FOREACH", "IN", "DO", "WHILE", "IF", "ELSE", "SWITCH", "CASE", 
		"CONTINUE", "BREAK", "DEFAULT", "WRITE", "READ", "MAIN", "RETURN", "FLOAT", 
		"INT", "VOID", "BOOLEAN", "ANY", "DECIMAL_LITERAL", "BINARY_LITERAL", 
		"FLOAT_LITERAL", "BOOL_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "COMMA", "DOT", "ASSIGN_LEFT", 
		"ASSIGN_RIGHT", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
		"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ELLIPSIS", "WS", 
		"COMMENT", "IDENTIFIER", "ExponentPart", "EscapeSequence", "Digits", "LetterOrDigit", 
		"Letter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import'", "'foreach'", "'in'", "'do'", "'while'", "'if'", "'else'", 
		"'switch'", "'case'", "'continue'", "'break'", "'default'", "'write'", 
		"'read'", "'main'", "'return'", "'float'", "'int'", "'void'", "'bool'", 
		"'any'", null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "','", "'.'", "'<-'", "'->'", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", 
		"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
		"'>>>='", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IMPORT", "FOREACH", "IN", "DO", "WHILE", "IF", "ELSE", "SWITCH", 
		"CASE", "CONTINUE", "BREAK", "DEFAULT", "WRITE", "READ", "MAIN", "RETURN", 
		"FLOAT", "INT", "VOID", "BOOLEAN", "ANY", "DECIMAL_LITERAL", "BINARY_LITERAL", 
		"FLOAT_LITERAL", "BOOL_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "COMMA", "DOT", "ASSIGN_LEFT", 
		"ASSIGN_RIGHT", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
		"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ELLIPSIS", "WS", 
		"COMMENT", "IDENTIFIER"
	};
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2L\u021f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\5\27\u011a\n\27\3\27\6\27\u011d\n\27\r\27\16"+
		"\27\u011e\3\27\5\27\u0122\n\27\5\27\u0124\n\27\3\27\5\27\u0127\n\27\3"+
		"\30\3\30\3\30\3\30\7\30\u012d\n\30\f\30\16\30\u0130\13\30\3\30\5\30\u0133"+
		"\n\30\3\30\5\30\u0136\n\30\3\31\3\31\3\31\5\31\u013b\n\31\3\31\3\31\5"+
		"\31\u013f\n\31\3\31\5\31\u0142\n\31\3\31\5\31\u0145\n\31\3\31\3\31\3\31"+
		"\5\31\u014a\n\31\3\31\5\31\u014d\n\31\5\31\u014f\n\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u015a\n\32\3\33\3\33\3\33\7\33\u015f"+
		"\n\33\f\33\16\33\u0162\13\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3"+
		"=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3"+
		"E\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3I\6I\u01df\nI\rI\16"+
		"I\u01e0\3I\3I\3J\3J\3J\3J\7J\u01e9\nJ\fJ\16J\u01ec\13J\3J\3J\3J\3J\3J"+
		"\3K\3K\7K\u01f5\nK\fK\16K\u01f8\13K\3L\3L\5L\u01fc\nL\3L\3L\3M\3M\3M\3"+
		"M\5M\u0204\nM\3M\5M\u0207\nM\3M\5M\u020a\nM\3N\3N\7N\u020e\nN\fN\16N\u0211"+
		"\13N\3N\5N\u0214\nN\3O\3O\5O\u0218\nO\3P\3P\3P\3P\5P\u021e\nP\3\u01ea"+
		"\2Q\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d"+
		"H\u008fI\u0091J\u0093K\u0095L\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2"+
		"\3\2\25\3\2\63;\4\2NNnn\4\2DDdd\3\2\62\63\4\2\62\63aa\6\2FFHHffhh\6\2"+
		"\f\f\17\17$$^^\5\2\13\f\16\17\"\"\4\2GGgg\4\2--//\n\2$$))^^ddhhppttvv"+
		"\3\2\62\65\3\2\629\3\2\62;\4\2\62;aa\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01"+
		"\3\2\ud802\udc01\3\2\udc02\ue001\2\u0237\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2"+
		"\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\3\u00a1\3\2\2\2\5\u00a8\3\2\2"+
		"\2\7\u00b0\3\2\2\2\t\u00b3\3\2\2\2\13\u00b6\3\2\2\2\r\u00bc\3\2\2\2\17"+
		"\u00bf\3\2\2\2\21\u00c4\3\2\2\2\23\u00cb\3\2\2\2\25\u00d0\3\2\2\2\27\u00d9"+
		"\3\2\2\2\31\u00df\3\2\2\2\33\u00e7\3\2\2\2\35\u00ed\3\2\2\2\37\u00f2\3"+
		"\2\2\2!\u00f7\3\2\2\2#\u00fe\3\2\2\2%\u0104\3\2\2\2\'\u0108\3\2\2\2)\u010d"+
		"\3\2\2\2+\u0112\3\2\2\2-\u0123\3\2\2\2/\u0128\3\2\2\2\61\u014e\3\2\2\2"+
		"\63\u0159\3\2\2\2\65\u015b\3\2\2\2\67\u0165\3\2\2\29\u016a\3\2\2\2;\u016c"+
		"\3\2\2\2=\u016e\3\2\2\2?\u0170\3\2\2\2A\u0172\3\2\2\2C\u0174\3\2\2\2E"+
		"\u0176\3\2\2\2G\u0178\3\2\2\2I\u017a\3\2\2\2K\u017d\3\2\2\2M\u0180\3\2"+
		"\2\2O\u0182\3\2\2\2Q\u0184\3\2\2\2S\u0186\3\2\2\2U\u0188\3\2\2\2W\u018a"+
		"\3\2\2\2Y\u018c\3\2\2\2[\u018f\3\2\2\2]\u0192\3\2\2\2_\u0195\3\2\2\2a"+
		"\u0198\3\2\2\2c\u019b\3\2\2\2e\u019e\3\2\2\2g\u01a1\3\2\2\2i\u01a4\3\2"+
		"\2\2k\u01a6\3\2\2\2m\u01a8\3\2\2\2o\u01aa\3\2\2\2q\u01ac\3\2\2\2s\u01ae"+
		"\3\2\2\2u\u01b0\3\2\2\2w\u01b2\3\2\2\2y\u01b4\3\2\2\2{\u01b7\3\2\2\2}"+
		"\u01ba\3\2\2\2\177\u01bd\3\2\2\2\u0081\u01c0\3\2\2\2\u0083\u01c3\3\2\2"+
		"\2\u0085\u01c6\3\2\2\2\u0087\u01c9\3\2\2\2\u0089\u01cc\3\2\2\2\u008b\u01d0"+
		"\3\2\2\2\u008d\u01d4\3\2\2\2\u008f\u01d9\3\2\2\2\u0091\u01de\3\2\2\2\u0093"+
		"\u01e4\3\2\2\2\u0095\u01f2\3\2\2\2\u0097\u01f9\3\2\2\2\u0099\u0209\3\2"+
		"\2\2\u009b\u020b\3\2\2\2\u009d\u0217\3\2\2\2\u009f\u021d\3\2\2\2\u00a1"+
		"\u00a2\7k\2\2\u00a2\u00a3\7o\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7q\2\2"+
		"\u00a5\u00a6\7t\2\2\u00a6\u00a7\7v\2\2\u00a7\4\3\2\2\2\u00a8\u00a9\7h"+
		"\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad"+
		"\7c\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7j\2\2\u00af\6\3\2\2\2\u00b0\u00b1"+
		"\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\b\3\2\2\2\u00b3\u00b4\7f\2\2\u00b4\u00b5"+
		"\7q\2\2\u00b5\n\3\2\2\2\u00b6\u00b7\7y\2\2\u00b7\u00b8\7j\2\2\u00b8\u00b9"+
		"\7k\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7g\2\2\u00bb\f\3\2\2\2\u00bc\u00bd"+
		"\7k\2\2\u00bd\u00be\7h\2\2\u00be\16\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1"+
		"\7n\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7g\2\2\u00c3\20\3\2\2\2\u00c4\u00c5"+
		"\7u\2\2\u00c5\u00c6\7y\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7v\2\2\u00c8"+
		"\u00c9\7e\2\2\u00c9\u00ca\7j\2\2\u00ca\22\3\2\2\2\u00cb\u00cc\7e\2\2\u00cc"+
		"\u00cd\7c\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7g\2\2\u00cf\24\3\2\2\2\u00d0"+
		"\u00d1\7e\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7v\2\2"+
		"\u00d4\u00d5\7k\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8"+
		"\7g\2\2\u00d8\26\3\2\2\2\u00d9\u00da\7d\2\2\u00da\u00db\7t\2\2\u00db\u00dc"+
		"\7g\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7m\2\2\u00de\30\3\2\2\2\u00df\u00e0"+
		"\7f\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3\7c\2\2\u00e3"+
		"\u00e4\7w\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7v\2\2\u00e6\32\3\2\2\2\u00e7"+
		"\u00e8\7y\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7v\2\2"+
		"\u00eb\u00ec\7g\2\2\u00ec\34\3\2\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7"+
		"g\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7f\2\2\u00f1\36\3\2\2\2\u00f2\u00f3"+
		"\7o\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7p\2\2\u00f6"+
		" \3\2\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7v\2\2\u00fa"+
		"\u00fb\7w\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7p\2\2\u00fd\"\3\2\2\2\u00fe"+
		"\u00ff\7h\2\2\u00ff\u0100\7n\2\2\u0100\u0101\7q\2\2\u0101\u0102\7c\2\2"+
		"\u0102\u0103\7v\2\2\u0103$\3\2\2\2\u0104\u0105\7k\2\2\u0105\u0106\7p\2"+
		"\2\u0106\u0107\7v\2\2\u0107&\3\2\2\2\u0108\u0109\7x\2\2\u0109\u010a\7"+
		"q\2\2\u010a\u010b\7k\2\2\u010b\u010c\7f\2\2\u010c(\3\2\2\2\u010d\u010e"+
		"\7d\2\2\u010e\u010f\7q\2\2\u010f\u0110\7q\2\2\u0110\u0111\7n\2\2\u0111"+
		"*\3\2\2\2\u0112\u0113\7c\2\2\u0113\u0114\7p\2\2\u0114\u0115\7{\2\2\u0115"+
		",\3\2\2\2\u0116\u0124\7\62\2\2\u0117\u0121\t\2\2\2\u0118\u011a\5\u009b"+
		"N\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0122\3\2\2\2\u011b"+
		"\u011d\7a\2\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\5\u009bN\2\u0121"+
		"\u0119\3\2\2\2\u0121\u011c\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0116\3\2"+
		"\2\2\u0123\u0117\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0127\t\3\2\2\u0126"+
		"\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127.\3\2\2\2\u0128\u0129\7\62\2\2"+
		"\u0129\u012a\t\4\2\2\u012a\u0132\t\5\2\2\u012b\u012d\t\6\2\2\u012c\u012b"+
		"\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0133\t\5\2\2\u0132\u012e\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0136\t\3\2\2\u0135"+
		"\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\60\3\2\2\2\u0137\u0138\5\u009b"+
		"N\2\u0138\u013a\7\60\2\2\u0139\u013b\5\u009bN\2\u013a\u0139\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013f\3\2\2\2\u013c\u013d\7\60\2\2\u013d\u013f\5"+
		"\u009bN\2\u013e\u0137\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0141\3\2\2\2"+
		"\u0140\u0142\5\u0097L\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0144\3\2\2\2\u0143\u0145\t\7\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u014f\3\2\2\2\u0146\u014c\5\u009bN\2\u0147\u0149\5\u0097L\2"+
		"\u0148\u014a\t\7\2\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014d"+
		"\3\2\2\2\u014b\u014d\t\7\2\2\u014c\u0147\3\2\2\2\u014c\u014b\3\2\2\2\u014d"+
		"\u014f\3\2\2\2\u014e\u013e\3\2\2\2\u014e\u0146\3\2\2\2\u014f\62\3\2\2"+
		"\2\u0150\u0151\7v\2\2\u0151\u0152\7t\2\2\u0152\u0153\7w\2\2\u0153\u015a"+
		"\7g\2\2\u0154\u0155\7h\2\2\u0155\u0156\7c\2\2\u0156\u0157\7n\2\2\u0157"+
		"\u0158\7u\2\2\u0158\u015a\7g\2\2\u0159\u0150\3\2\2\2\u0159\u0154\3\2\2"+
		"\2\u015a\64\3\2\2\2\u015b\u0160\7$\2\2\u015c\u015f\n\b\2\2\u015d\u015f"+
		"\5\u0099M\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2"+
		"\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160"+
		"\3\2\2\2\u0163\u0164\7$\2\2\u0164\66\3\2\2\2\u0165\u0166\7p\2\2\u0166"+
		"\u0167\7w\2\2\u0167\u0168\7n\2\2\u0168\u0169\7n\2\2\u01698\3\2\2\2\u016a"+
		"\u016b\7*\2\2\u016b:\3\2\2\2\u016c\u016d\7+\2\2\u016d<\3\2\2\2\u016e\u016f"+
		"\7}\2\2\u016f>\3\2\2\2\u0170\u0171\7\177\2\2\u0171@\3\2\2\2\u0172\u0173"+
		"\7]\2\2\u0173B\3\2\2\2\u0174\u0175\7_\2\2\u0175D\3\2\2\2\u0176\u0177\7"+
		".\2\2\u0177F\3\2\2\2\u0178\u0179\7\60\2\2\u0179H\3\2\2\2\u017a\u017b\7"+
		">\2\2\u017b\u017c\7/\2\2\u017cJ\3\2\2\2\u017d\u017e\7/\2\2\u017e\u017f"+
		"\7@\2\2\u017fL\3\2\2\2\u0180\u0181\7@\2\2\u0181N\3\2\2\2\u0182\u0183\7"+
		">\2\2\u0183P\3\2\2\2\u0184\u0185\7#\2\2\u0185R\3\2\2\2\u0186\u0187\7\u0080"+
		"\2\2\u0187T\3\2\2\2\u0188\u0189\7A\2\2\u0189V\3\2\2\2\u018a\u018b\7<\2"+
		"\2\u018bX\3\2\2\2\u018c\u018d\7?\2\2\u018d\u018e\7?\2\2\u018eZ\3\2\2\2"+
		"\u018f\u0190\7>\2\2\u0190\u0191\7?\2\2\u0191\\\3\2\2\2\u0192\u0193\7@"+
		"\2\2\u0193\u0194\7?\2\2\u0194^\3\2\2\2\u0195\u0196\7#\2\2\u0196\u0197"+
		"\7?\2\2\u0197`\3\2\2\2\u0198\u0199\7(\2\2\u0199\u019a\7(\2\2\u019ab\3"+
		"\2\2\2\u019b\u019c\7~\2\2\u019c\u019d\7~\2\2\u019dd\3\2\2\2\u019e\u019f"+
		"\7-\2\2\u019f\u01a0\7-\2\2\u01a0f\3\2\2\2\u01a1\u01a2\7/\2\2\u01a2\u01a3"+
		"\7/\2\2\u01a3h\3\2\2\2\u01a4\u01a5\7-\2\2\u01a5j\3\2\2\2\u01a6\u01a7\7"+
		"/\2\2\u01a7l\3\2\2\2\u01a8\u01a9\7,\2\2\u01a9n\3\2\2\2\u01aa\u01ab\7\61"+
		"\2\2\u01abp\3\2\2\2\u01ac\u01ad\7(\2\2\u01adr\3\2\2\2\u01ae\u01af\7~\2"+
		"\2\u01aft\3\2\2\2\u01b0\u01b1\7`\2\2\u01b1v\3\2\2\2\u01b2\u01b3\7\'\2"+
		"\2\u01b3x\3\2\2\2\u01b4\u01b5\7-\2\2\u01b5\u01b6\7?\2\2\u01b6z\3\2\2\2"+
		"\u01b7\u01b8\7/\2\2\u01b8\u01b9\7?\2\2\u01b9|\3\2\2\2\u01ba\u01bb\7,\2"+
		"\2\u01bb\u01bc\7?\2\2\u01bc~\3\2\2\2\u01bd\u01be\7\61\2\2\u01be\u01bf"+
		"\7?\2\2\u01bf\u0080\3\2\2\2\u01c0\u01c1\7(\2\2\u01c1\u01c2\7?\2\2\u01c2"+
		"\u0082\3\2\2\2\u01c3\u01c4\7~\2\2\u01c4\u01c5\7?\2\2\u01c5\u0084\3\2\2"+
		"\2\u01c6\u01c7\7`\2\2\u01c7\u01c8\7?\2\2\u01c8\u0086\3\2\2\2\u01c9\u01ca"+
		"\7\'\2\2\u01ca\u01cb\7?\2\2\u01cb\u0088\3\2\2\2\u01cc\u01cd\7>\2\2\u01cd"+
		"\u01ce\7>\2\2\u01ce\u01cf\7?\2\2\u01cf\u008a\3\2\2\2\u01d0\u01d1\7@\2"+
		"\2\u01d1\u01d2\7@\2\2\u01d2\u01d3\7?\2\2\u01d3\u008c\3\2\2\2\u01d4\u01d5"+
		"\7@\2\2\u01d5\u01d6\7@\2\2\u01d6\u01d7\7@\2\2\u01d7\u01d8\7?\2\2\u01d8"+
		"\u008e\3\2\2\2\u01d9\u01da\7\60\2\2\u01da\u01db\7\60\2\2\u01db\u01dc\7"+
		"\60\2\2\u01dc\u0090\3\2\2\2\u01dd\u01df\t\t\2\2\u01de\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2"+
		"\2\2\u01e2\u01e3\bI\2\2\u01e3\u0092\3\2\2\2\u01e4\u01e5\7\61\2\2\u01e5"+
		"\u01e6\7,\2\2\u01e6\u01ea\3\2\2\2\u01e7\u01e9\13\2\2\2\u01e8\u01e7\3\2"+
		"\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ee\7,\2\2\u01ee\u01ef\7\61"+
		"\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\bJ\2\2\u01f1\u0094\3\2\2\2\u01f2"+
		"\u01f6\5\u009fP\2\u01f3\u01f5\5\u009dO\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8"+
		"\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u0096\3\2\2\2\u01f8"+
		"\u01f6\3\2\2\2\u01f9\u01fb\t\n\2\2\u01fa\u01fc\t\13\2\2\u01fb\u01fa\3"+
		"\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\5\u009bN\2"+
		"\u01fe\u0098\3\2\2\2\u01ff\u0200\7^\2\2\u0200\u020a\t\f\2\2\u0201\u0206"+
		"\7^\2\2\u0202\u0204\t\r\2\2\u0203\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0207\t\16\2\2\u0206\u0203\3\2\2\2\u0206\u0207\3"+
		"\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\t\16\2\2\u0209\u01ff\3\2\2\2\u0209"+
		"\u0201\3\2\2\2\u020a\u009a\3\2\2\2\u020b\u0213\t\17\2\2\u020c\u020e\t"+
		"\20\2\2\u020d\u020c\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0214\t\17"+
		"\2\2\u0213\u020f\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u009c\3\2\2\2\u0215"+
		"\u0218\5\u009fP\2\u0216\u0218\t\17\2\2\u0217\u0215\3\2\2\2\u0217\u0216"+
		"\3\2\2\2\u0218\u009e\3\2\2\2\u0219\u021e\t\21\2\2\u021a\u021e\n\22\2\2"+
		"\u021b\u021c\t\23\2\2\u021c\u021e\t\24\2\2\u021d\u0219\3\2\2\2\u021d\u021a"+
		"\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u00a0\3\2\2\2 \2\u0119\u011e\u0121"+
		"\u0123\u0126\u012e\u0132\u0135\u013a\u013e\u0141\u0144\u0149\u014c\u014e"+
		"\u0159\u015e\u0160\u01e0\u01ea\u01f6\u01fb\u0203\u0206\u0209\u020f\u0213"+
		"\u0217\u021d\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}