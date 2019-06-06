// Generated from CustomLexer.g4 by ANTLR 4.7.1
package com.custom.language.antlr4.generated;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

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
            URSHIFT_ASSIGN = 70, ELLIPSIS = 71, WS = 72, COMMENT = 73, SINGLE_COMMENT = 74,
            IDENTIFIER = 75;
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
            "COMMENT", "SINGLE_COMMENT", "IDENTIFIER", "ExponentPart", "EscapeSequence",
            "Digits", "LetterOrDigit", "Letter"
    };
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2M\u0224\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                    "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\3\2\3" +
                    "\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6" +
                    "\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3" +
                    "\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13" +
                    "\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16" +
                    "\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20" +
                    "\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23" +
                    "\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26" +
                    "\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u011c\n\27\3\27\6\27\u011f\n\27\r" +
                    "\27\16\27\u0120\3\27\5\27\u0124\n\27\5\27\u0126\n\27\3\27\5\27\u0129\n" +
                    "\27\3\30\3\30\3\30\3\30\7\30\u012f\n\30\f\30\16\30\u0132\13\30\3\30\5" +
                    "\30\u0135\n\30\3\30\5\30\u0138\n\30\3\31\3\31\3\31\5\31\u013d\n\31\3\31" +
                    "\3\31\5\31\u0141\n\31\3\31\5\31\u0144\n\31\3\31\5\31\u0147\n\31\3\31\3" +
                    "\31\3\31\5\31\u014c\n\31\3\31\5\31\u014f\n\31\5\31\u0151\n\31\3\32\3\32" +
                    "\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u015c\n\32\3\33\3\33\3\33\7\33" +
                    "\u0161\n\33\f\33\16\33\u0164\13\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34" +
                    "\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3" +
                    "%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/" +
                    "\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64" +
                    "\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3" +
                    "<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3" +
                    "D\3D\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3I\6I\u01e1\n" +
                    "I\rI\16I\u01e2\3I\3I\3J\3J\3J\3J\7J\u01eb\nJ\fJ\16J\u01ee\13J\3J\3J\3" +
                    "J\3J\3J\3K\3K\3K\3L\3L\7L\u01fa\nL\fL\16L\u01fd\13L\3M\3M\5M\u0201\nM" +
                    "\3M\3M\3N\3N\3N\3N\5N\u0209\nN\3N\5N\u020c\nN\3N\5N\u020f\nN\3O\3O\7O" +
                    "\u0213\nO\fO\16O\u0216\13O\3O\5O\u0219\nO\3P\3P\5P\u021d\nP\3Q\3Q\3Q\3" +
                    "Q\5Q\u0223\nQ\3\u01ec\2R\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f" +
                    "\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63" +
                    "\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62" +
                    "c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087" +
                    "E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099\2\u009b" +
                    "\2\u009d\2\u009f\2\u00a1\2\3\2\25\3\2\63;\4\2NNnn\4\2DDdd\3\2\62\63\4" +
                    "\2\62\63aa\6\2FFHHffhh\6\2\f\f\17\17$$^^\5\2\13\f\16\17\"\"\4\2GGgg\4" +
                    "\2--//\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\3\2\62;\4\2\62;aa\6\2&&C" +
                    "\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\2\u023c" +
                    "\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2" +
                    "\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2" +
                    "\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2" +
                    "\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2" +
                    "\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3" +
                    "\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2" +
                    "\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2" +
                    "U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3" +
                    "\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2" +
                    "\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2" +
                    "{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085" +
                    "\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2" +
                    "\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097" +
                    "\3\2\2\2\3\u00a3\3\2\2\2\5\u00aa\3\2\2\2\7\u00b2\3\2\2\2\t\u00b5\3\2\2" +
                    "\2\13\u00b8\3\2\2\2\r\u00be\3\2\2\2\17\u00c1\3\2\2\2\21\u00c6\3\2\2\2" +
                    "\23\u00cd\3\2\2\2\25\u00d2\3\2\2\2\27\u00db\3\2\2\2\31\u00e1\3\2\2\2\33" +
                    "\u00e9\3\2\2\2\35\u00ef\3\2\2\2\37\u00f4\3\2\2\2!\u00f9\3\2\2\2#\u0100" +
                    "\3\2\2\2%\u0106\3\2\2\2\'\u010a\3\2\2\2)\u010f\3\2\2\2+\u0114\3\2\2\2" +
                    "-\u0125\3\2\2\2/\u012a\3\2\2\2\61\u0150\3\2\2\2\63\u015b\3\2\2\2\65\u015d" +
                    "\3\2\2\2\67\u0167\3\2\2\29\u016c\3\2\2\2;\u016e\3\2\2\2=\u0170\3\2\2\2" +
                    "?\u0172\3\2\2\2A\u0174\3\2\2\2C\u0176\3\2\2\2E\u0178\3\2\2\2G\u017a\3" +
                    "\2\2\2I\u017c\3\2\2\2K\u017f\3\2\2\2M\u0182\3\2\2\2O\u0184\3\2\2\2Q\u0186" +
                    "\3\2\2\2S\u0188\3\2\2\2U\u018a\3\2\2\2W\u018c\3\2\2\2Y\u018e\3\2\2\2[" +
                    "\u0191\3\2\2\2]\u0194\3\2\2\2_\u0197\3\2\2\2a\u019a\3\2\2\2c\u019d\3\2" +
                    "\2\2e\u01a0\3\2\2\2g\u01a3\3\2\2\2i\u01a6\3\2\2\2k\u01a8\3\2\2\2m\u01aa" +
                    "\3\2\2\2o\u01ac\3\2\2\2q\u01ae\3\2\2\2s\u01b0\3\2\2\2u\u01b2\3\2\2\2w" +
                    "\u01b4\3\2\2\2y\u01b6\3\2\2\2{\u01b9\3\2\2\2}\u01bc\3\2\2\2\177\u01bf" +
                    "\3\2\2\2\u0081\u01c2\3\2\2\2\u0083\u01c5\3\2\2\2\u0085\u01c8\3\2\2\2\u0087" +
                    "\u01cb\3\2\2\2\u0089\u01ce\3\2\2\2\u008b\u01d2\3\2\2\2\u008d\u01d6\3\2" +
                    "\2\2\u008f\u01db\3\2\2\2\u0091\u01e0\3\2\2\2\u0093\u01e6\3\2\2\2\u0095" +
                    "\u01f4\3\2\2\2\u0097\u01f7\3\2\2\2\u0099\u01fe\3\2\2\2\u009b\u020e\3\2" +
                    "\2\2\u009d\u0210\3\2\2\2\u009f\u021c\3\2\2\2\u00a1\u0222\3\2\2\2\u00a3" +
                    "\u00a4\7k\2\2\u00a4\u00a5\7o\2\2\u00a5\u00a6\7r\2\2\u00a6\u00a7\7q\2\2" +
                    "\u00a7\u00a8\7t\2\2\u00a8\u00a9\7v\2\2\u00a9\4\3\2\2\2\u00aa\u00ab\7h" +
                    "\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af" +
                    "\7c\2\2\u00af\u00b0\7e\2\2\u00b0\u00b1\7j\2\2\u00b1\6\3\2\2\2\u00b2\u00b3" +
                    "\7k\2\2\u00b3\u00b4\7p\2\2\u00b4\b\3\2\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7" +
                    "\7q\2\2\u00b7\n\3\2\2\2\u00b8\u00b9\7y\2\2\u00b9\u00ba\7j\2\2\u00ba\u00bb" +
                    "\7k\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7g\2\2\u00bd\f\3\2\2\2\u00be\u00bf" +
                    "\7k\2\2\u00bf\u00c0\7h\2\2\u00c0\16\3\2\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3" +
                    "\7n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7g\2\2\u00c5\20\3\2\2\2\u00c6\u00c7" +
                    "\7u\2\2\u00c7\u00c8\7y\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7v\2\2\u00ca" +
                    "\u00cb\7e\2\2\u00cb\u00cc\7j\2\2\u00cc\22\3\2\2\2\u00cd\u00ce\7e\2\2\u00ce" +
                    "\u00cf\7c\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7g\2\2\u00d1\24\3\2\2\2\u00d2" +
                    "\u00d3\7e\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7v\2\2" +
                    "\u00d6\u00d7\7k\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da" +
                    "\7g\2\2\u00da\26\3\2\2\2\u00db\u00dc\7d\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de" +
                    "\7g\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7m\2\2\u00e0\30\3\2\2\2\u00e1\u00e2" +
                    "\7f\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5\7c\2\2\u00e5" +
                    "\u00e6\7w\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7v\2\2\u00e8\32\3\2\2\2\u00e9" +
                    "\u00ea\7y\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7v\2\2" +
                    "\u00ed\u00ee\7g\2\2\u00ee\34\3\2\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7" +
                    "g\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7f\2\2\u00f3\36\3\2\2\2\u00f4\u00f5" +
                    "\7o\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7p\2\2\u00f8" +
                    " \3\2\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7v\2\2\u00fc" +
                    "\u00fd\7w\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7p\2\2\u00ff\"\3\2\2\2\u0100" +
                    "\u0101\7h\2\2\u0101\u0102\7n\2\2\u0102\u0103\7q\2\2\u0103\u0104\7c\2\2" +
                    "\u0104\u0105\7v\2\2\u0105$\3\2\2\2\u0106\u0107\7k\2\2\u0107\u0108\7p\2" +
                    "\2\u0108\u0109\7v\2\2\u0109&\3\2\2\2\u010a\u010b\7x\2\2\u010b\u010c\7" +
                    "q\2\2\u010c\u010d\7k\2\2\u010d\u010e\7f\2\2\u010e(\3\2\2\2\u010f\u0110" +
                    "\7d\2\2\u0110\u0111\7q\2\2\u0111\u0112\7q\2\2\u0112\u0113\7n\2\2\u0113" +
                    "*\3\2\2\2\u0114\u0115\7c\2\2\u0115\u0116\7p\2\2\u0116\u0117\7{\2\2\u0117" +
                    ",\3\2\2\2\u0118\u0126\7\62\2\2\u0119\u0123\t\2\2\2\u011a\u011c\5\u009d" +
                    "O\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0124\3\2\2\2\u011d" +
                    "\u011f\7a\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2" +
                    "\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\5\u009dO\2\u0123" +
                    "\u011b\3\2\2\2\u0123\u011e\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0118\3\2" +
                    "\2\2\u0125\u0119\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0129\t\3\2\2\u0128" +
                    "\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129.\3\2\2\2\u012a\u012b\7\62\2\2" +
                    "\u012b\u012c\t\4\2\2\u012c\u0134\t\5\2\2\u012d\u012f\t\6\2\2\u012e\u012d" +
                    "\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131" +
                    "\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0135\t\5\2\2\u0134\u0130\3\2" +
                    "\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0138\t\3\2\2\u0137" +
                    "\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\60\3\2\2\2\u0139\u013a\5\u009d" +
                    "O\2\u013a\u013c\7\60\2\2\u013b\u013d\5\u009dO\2\u013c\u013b\3\2\2\2\u013c" +
                    "\u013d\3\2\2\2\u013d\u0141\3\2\2\2\u013e\u013f\7\60\2\2\u013f\u0141\5" +
                    "\u009dO\2\u0140\u0139\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\3\2\2\2" +
                    "\u0142\u0144\5\u0099M\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144" +
                    "\u0146\3\2\2\2\u0145\u0147\t\7\2\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2" +
                    "\2\2\u0147\u0151\3\2\2\2\u0148\u014e\5\u009dO\2\u0149\u014b\5\u0099M\2" +
                    "\u014a\u014c\t\7\2\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014f" +
                    "\3\2\2\2\u014d\u014f\t\7\2\2\u014e\u0149\3\2\2\2\u014e\u014d\3\2\2\2\u014f" +
                    "\u0151\3\2\2\2\u0150\u0140\3\2\2\2\u0150\u0148\3\2\2\2\u0151\62\3\2\2" +
                    "\2\u0152\u0153\7v\2\2\u0153\u0154\7t\2\2\u0154\u0155\7w\2\2\u0155\u015c" +
                    "\7g\2\2\u0156\u0157\7h\2\2\u0157\u0158\7c\2\2\u0158\u0159\7n\2\2\u0159" +
                    "\u015a\7u\2\2\u015a\u015c\7g\2\2\u015b\u0152\3\2\2\2\u015b\u0156\3\2\2" +
                    "\2\u015c\64\3\2\2\2\u015d\u0162\7$\2\2\u015e\u0161\n\b\2\2\u015f\u0161" +
                    "\5\u009bN\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2" +
                    "\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162" +
                    "\3\2\2\2\u0165\u0166\7$\2\2\u0166\66\3\2\2\2\u0167\u0168\7p\2\2\u0168" +
                    "\u0169\7w\2\2\u0169\u016a\7n\2\2\u016a\u016b\7n\2\2\u016b8\3\2\2\2\u016c" +
                    "\u016d\7*\2\2\u016d:\3\2\2\2\u016e\u016f\7+\2\2\u016f<\3\2\2\2\u0170\u0171" +
                    "\7}\2\2\u0171>\3\2\2\2\u0172\u0173\7\177\2\2\u0173@\3\2\2\2\u0174\u0175" +
                    "\7]\2\2\u0175B\3\2\2\2\u0176\u0177\7_\2\2\u0177D\3\2\2\2\u0178\u0179\7" +
                    ".\2\2\u0179F\3\2\2\2\u017a\u017b\7\60\2\2\u017bH\3\2\2\2\u017c\u017d\7" +
                    ">\2\2\u017d\u017e\7/\2\2\u017eJ\3\2\2\2\u017f\u0180\7/\2\2\u0180\u0181" +
                    "\7@\2\2\u0181L\3\2\2\2\u0182\u0183\7@\2\2\u0183N\3\2\2\2\u0184\u0185\7" +
                    ">\2\2\u0185P\3\2\2\2\u0186\u0187\7#\2\2\u0187R\3\2\2\2\u0188\u0189\7\u0080" +
                    "\2\2\u0189T\3\2\2\2\u018a\u018b\7A\2\2\u018bV\3\2\2\2\u018c\u018d\7<\2" +
                    "\2\u018dX\3\2\2\2\u018e\u018f\7?\2\2\u018f\u0190\7?\2\2\u0190Z\3\2\2\2" +
                    "\u0191\u0192\7>\2\2\u0192\u0193\7?\2\2\u0193\\\3\2\2\2\u0194\u0195\7@" +
                    "\2\2\u0195\u0196\7?\2\2\u0196^\3\2\2\2\u0197\u0198\7#\2\2\u0198\u0199" +
                    "\7?\2\2\u0199`\3\2\2\2\u019a\u019b\7(\2\2\u019b\u019c\7(\2\2\u019cb\3" +
                    "\2\2\2\u019d\u019e\7~\2\2\u019e\u019f\7~\2\2\u019fd\3\2\2\2\u01a0\u01a1" +
                    "\7-\2\2\u01a1\u01a2\7-\2\2\u01a2f\3\2\2\2\u01a3\u01a4\7/\2\2\u01a4\u01a5" +
                    "\7/\2\2\u01a5h\3\2\2\2\u01a6\u01a7\7-\2\2\u01a7j\3\2\2\2\u01a8\u01a9\7" +
                    "/\2\2\u01a9l\3\2\2\2\u01aa\u01ab\7,\2\2\u01abn\3\2\2\2\u01ac\u01ad\7\61" +
                    "\2\2\u01adp\3\2\2\2\u01ae\u01af\7(\2\2\u01afr\3\2\2\2\u01b0\u01b1\7~\2" +
                    "\2\u01b1t\3\2\2\2\u01b2\u01b3\7`\2\2\u01b3v\3\2\2\2\u01b4\u01b5\7\'\2" +
                    "\2\u01b5x\3\2\2\2\u01b6\u01b7\7-\2\2\u01b7\u01b8\7?\2\2\u01b8z\3\2\2\2" +
                    "\u01b9\u01ba\7/\2\2\u01ba\u01bb\7?\2\2\u01bb|\3\2\2\2\u01bc\u01bd\7,\2" +
                    "\2\u01bd\u01be\7?\2\2\u01be~\3\2\2\2\u01bf\u01c0\7\61\2\2\u01c0\u01c1" +
                    "\7?\2\2\u01c1\u0080\3\2\2\2\u01c2\u01c3\7(\2\2\u01c3\u01c4\7?\2\2\u01c4" +
                    "\u0082\3\2\2\2\u01c5\u01c6\7~\2\2\u01c6\u01c7\7?\2\2\u01c7\u0084\3\2\2" +
                    "\2\u01c8\u01c9\7`\2\2\u01c9\u01ca\7?\2\2\u01ca\u0086\3\2\2\2\u01cb\u01cc" +
                    "\7\'\2\2\u01cc\u01cd\7?\2\2\u01cd\u0088\3\2\2\2\u01ce\u01cf\7>\2\2\u01cf" +
                    "\u01d0\7>\2\2\u01d0\u01d1\7?\2\2\u01d1\u008a\3\2\2\2\u01d2\u01d3\7@\2" +
                    "\2\u01d3\u01d4\7@\2\2\u01d4\u01d5\7?\2\2\u01d5\u008c\3\2\2\2\u01d6\u01d7" +
                    "\7@\2\2\u01d7\u01d8\7@\2\2\u01d8\u01d9\7@\2\2\u01d9\u01da\7?\2\2\u01da" +
                    "\u008e\3\2\2\2\u01db\u01dc\7\60\2\2\u01dc\u01dd\7\60\2\2\u01dd\u01de\7" +
                    "\60\2\2\u01de\u0090\3\2\2\2\u01df\u01e1\t\t\2\2\u01e0\u01df\3\2\2\2\u01e1" +
                    "\u01e2\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2" +
                    "\2\2\u01e4\u01e5\bI\2\2\u01e5\u0092\3\2\2\2\u01e6\u01e7\7\61\2\2\u01e7" +
                    "\u01e8\7,\2\2\u01e8\u01ec\3\2\2\2\u01e9\u01eb\13\2\2\2\u01ea\u01e9\3\2" +
                    "\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed" +
                    "\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f0\7,\2\2\u01f0\u01f1\7\61" +
                    "\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\bJ\2\2\u01f3\u0094\3\2\2\2\u01f4" +
                    "\u01f5\7\61\2\2\u01f5\u01f6\7\61\2\2\u01f6\u0096\3\2\2\2\u01f7\u01fb\5" +
                    "\u00a1Q\2\u01f8\u01fa\5\u009fP\2\u01f9\u01f8\3\2\2\2\u01fa\u01fd\3\2\2" +
                    "\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0098\3\2\2\2\u01fd\u01fb" +
                    "\3\2\2\2\u01fe\u0200\t\n\2\2\u01ff\u0201\t\13\2\2\u0200\u01ff\3\2\2\2" +
                    "\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\5\u009dO\2\u0203" +
                    "\u009a\3\2\2\2\u0204\u0205\7^\2\2\u0205\u020f\t\f\2\2\u0206\u020b\7^\2" +
                    "\2\u0207\u0209\t\r\2\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a" +
                    "\3\2\2\2\u020a\u020c\t\16\2\2\u020b\u0208\3\2\2\2\u020b\u020c\3\2\2\2" +
                    "\u020c\u020d\3\2\2\2\u020d\u020f\t\16\2\2\u020e\u0204\3\2\2\2\u020e\u0206" +
                    "\3\2\2\2\u020f\u009c\3\2\2\2\u0210\u0218\t\17\2\2\u0211\u0213\t\20\2\2" +
                    "\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215" +
                    "\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0219\t\17\2\2" +
                    "\u0218\u0214\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u009e\3\2\2\2\u021a\u021d" +
                    "\5\u00a1Q\2\u021b\u021d\t\17\2\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2" +
                    "\2\u021d\u00a0\3\2\2\2\u021e\u0223\t\21\2\2\u021f\u0223\n\22\2\2\u0220" +
                    "\u0221\t\23\2\2\u0221\u0223\t\24\2\2\u0222\u021e\3\2\2\2\u0222\u021f\3" +
                    "\2\2\2\u0222\u0220\3\2\2\2\u0223\u00a2\3\2\2\2 \2\u011b\u0120\u0123\u0125" +
                    "\u0128\u0130\u0134\u0137\u013c\u0140\u0143\u0146\u014b\u014e\u0150\u015b" +
                    "\u0160\u0162\u01e2\u01ec\u01fb\u0200\u0208\u020b\u020e\u0214\u0218\u021c" +
                    "\u0222\3\2\3\2";
	private static final String[] _LITERAL_NAMES = {
            null, "'import'", "'foreach'", "'in'", "'do'", "'while'", "'if'", "'else'",
            "'switch'", "'case'", "'continue'", "'break'", "'default'", "'write'",
            "'read'", "'main'", "'return'", "'float'", "'int'", "'void'", "'bool'",
            "'any'", null, null, null, null, null, "'null'", "'('", "')'", "'{'",
            "'}'", "'['", "']'", "','", "'.'", "'<-'", "'->'", "'>'", "'<'", "'!'",
            "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'",
            "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='",
            "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='",
            "'>>>='", "'...'", null, null, "'//'"
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
            "COMMENT", "SINGLE_COMMENT", "IDENTIFIER"
    };
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}