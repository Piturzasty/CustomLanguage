// Generated from CustomParser.g4 by ANTLR 4.7.1
package com.custom.language.antlr4.generated;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CustomParser extends Parser {
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
	public static final int
	RULE_compilationUnit = 0, RULE_fileContent = 1, RULE_mainDeclaration = 2,
	RULE_functionsDeclaration = 3, RULE_methodDeclaration = 4, RULE_methodBody = 5,
	RULE_block = 6, RULE_blockStatement = 7, RULE_localVariableDeclaration = 8,
	RULE_statement = 9, RULE_elseStatement = 10, RULE_comment = 11, RULE_forControl = 12,
	RULE_foreachControl = 13, RULE_forInit = 14, RULE_switchBlockStatementGroup = 15,
	RULE_switchLabel = 16, RULE_writeToStd = 17, RULE_readFromStd = 18, RULE_variableDeclarators = 19,
	RULE_variableDeclarator = 20, RULE_variableDeclaratorId = 21, RULE_variableInitializer = 22,
	RULE_parExpression = 23, RULE_expressionList = 24, RULE_expression = 25,
	RULE_primary = 26, RULE_methodCall = 27, RULE_typeOrVoid = 28, RULE_type = 29,
	RULE_primitiveType = 30, RULE_formalParameters = 31, RULE_formalParameterList = 32,
	RULE_formalParameter = 33, RULE_literal = 34, RULE_integerLiteral = 35,
	RULE_floatLiteral = 36;
	public static final String[] ruleNames = {
		"compilationUnit", "fileContent", "mainDeclaration", "functionsDeclaration", 
		"methodDeclaration", "methodBody", "block", "blockStatement", "localVariableDeclaration",
            "statement", "elseStatement", "comment", "forControl", "foreachControl",
            "forInit", "switchBlockStatementGroup", "switchLabel", "writeToStd", "readFromStd",
            "variableDeclarators", "variableDeclarator", "variableDeclaratorId", "variableInitializer",
            "parExpression", "expressionList", "expression", "primary", "methodCall",
            "typeOrVoid", "type", "primitiveType", "formalParameters", "formalParameterList",
            "formalParameter", "literal", "integerLiteral", "floatLiteral"
    };
	public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3M\u01aa\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\5\2O\n\2\3\2\3\2\3\3\7\3T" +
                    "\n\3\f\3\16\3W\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3" +
                    "\6\3\6\3\7\3\7\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\b\3\b\3\t\3\t\5\tt\n" +
                    "\t\3\n\3\n\3\n\3\n\3\n\5\n{\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3" +
                    "\n\3\n\3\n\3\n\5\n\u008a\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0092" +
                    "\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13" +
                    "\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a7\n\13\f\13\16\13\u00aa\13\13" +
                    "\3\13\7\13\u00ad\n\13\f\13\16\13\u00b0\13\13\3\13\3\13\3\13\3\13\5\13" +
                    "\u00b6\n\13\3\13\3\13\5\13\u00ba\n\13\3\13\3\13\5\13\u00be\n\13\3\13\3" +
                    "\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c7\n\13\3\f\3\f\3\r\3\r\3\r\3\16" +
                    "\3\16\5\16\u00d0\n\16\3\16\3\16\5\16\u00d4\n\16\3\16\3\16\5\16\u00d8\n" +
                    "\16\5\16\u00da\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\5\20\u00e3\n\20" +
                    "\3\21\6\21\u00e6\n\21\r\21\16\21\u00e7\3\21\6\21\u00eb\n\21\r\21\16\21" +
                    "\u00ec\3\22\3\22\3\22\5\22\u00f2\n\22\3\22\3\22\3\22\5\22\u00f7\n\22\3" +
                    "\23\3\23\3\23\7\23\u00fc\n\23\f\23\16\23\u00ff\13\23\3\23\3\23\6\23\u0103" +
                    "\n\23\r\23\16\23\u0104\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u010e\n" +
                    "\25\f\25\16\25\u0111\13\25\3\25\3\25\5\25\u0115\n\25\5\25\u0117\n\25\3" +
                    "\26\3\26\3\26\5\26\u011c\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u0123\n\26" +
                    "\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\7\32\u0130\n\32" +
                    "\f\32\16\32\u0133\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3" +
                    "\33\3\33\3\33\5\33\u0141\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33" +
                    "\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0151\n\33\3\33\3\33\3\33\3\33\3\33" +
                    "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33" +
                    "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0172" +
                    "\n\33\f\33\16\33\u0175\13\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u017d" +
                    "\n\34\3\35\3\35\3\35\5\35\u0182\n\35\3\35\3\35\3\36\3\36\5\36\u0188\n" +
                    "\36\3\37\3\37\3 \3 \3!\3!\5!\u0190\n!\3!\3!\3\"\3\"\3\"\7\"\u0197\n\"" +
                    "\f\"\16\"\u019a\13\"\3#\3#\3#\3$\3$\3$\3$\3$\5$\u01a4\n$\3%\3%\3&\3&\3" +
                    "&\2\3\64\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66" +
                    "8:<>@BDFHJ\2\f\3\2\64\67\3\2*+\4\289==\3\2\66\67\4\2()/\60\4\2..\61\61" +
                    "\4\2&\'>H\3\2\64\65\4\2\23\24\26\27\3\2\30\31\2\u01cd\2L\3\2\2\2\4U\3" +
                    "\2\2\2\6Z\3\2\2\2\b_\3\2\2\2\na\3\2\2\2\ff\3\2\2\2\16h\3\2\2\2\20s\3\2" +
                    "\2\2\22\u0089\3\2\2\2\24\u00c6\3\2\2\2\26\u00c8\3\2\2\2\30\u00ca\3\2\2" +
                    "\2\32\u00d9\3\2\2\2\34\u00db\3\2\2\2\36\u00e2\3\2\2\2 \u00e5\3\2\2\2\"" +
                    "\u00f6\3\2\2\2$\u00f8\3\2\2\2&\u0106\3\2\2\2(\u0116\3\2\2\2*\u0122\3\2" +
                    "\2\2,\u0124\3\2\2\2.\u0126\3\2\2\2\60\u0128\3\2\2\2\62\u012c\3\2\2\2\64" +
                    "\u0140\3\2\2\2\66\u017c\3\2\2\28\u017e\3\2\2\2:\u0187\3\2\2\2<\u0189\3" +
                    "\2\2\2>\u018b\3\2\2\2@\u018d\3\2\2\2B\u0193\3\2\2\2D\u019b\3\2\2\2F\u01a3" +
                    "\3\2\2\2H\u01a5\3\2\2\2J\u01a7\3\2\2\2LN\7 \2\2MO\5\4\3\2NM\3\2\2\2NO" +
                    "\3\2\2\2OP\3\2\2\2PQ\7!\2\2Q\3\3\2\2\2RT\5\b\5\2SR\3\2\2\2TW\3\2\2\2U" +
                    "S\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\5\6\4\2Y\5\3\2\2\2Z[\7\21\2" +
                    "\2[\\\7\36\2\2\\]\7\37\2\2]^\5\f\7\2^\7\3\2\2\2_`\5\n\6\2`\t\3\2\2\2a" +
                    "b\5:\36\2bc\7M\2\2cd\5@!\2de\5\f\7\2e\13\3\2\2\2fg\5\16\b\2g\r\3\2\2\2" +
                    "hl\7 \2\2ik\5\20\t\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2" +
                    "nl\3\2\2\2op\7!\2\2p\17\3\2\2\2qt\5\22\n\2rt\5\24\13\2sq\3\2\2\2sr\3\2" +
                    "\2\2t\21\3\2\2\2uv\5,\27\2vw\7-\2\2wz\5<\37\2xy\7&\2\2y{\5.\30\2zx\3\2" +
                    "\2\2z{\3\2\2\2{\u008a\3\2\2\2|}\5,\27\2}~\7&\2\2~\177\5.\30\2\177\u008a" +
                    "\3\2\2\2\u0080\u0081\5.\30\2\u0081\u0082\7\'\2\2\u0082\u0083\5,\27\2\u0083" +
                    "\u0084\7-\2\2\u0084\u0085\5<\37\2\u0085\u008a\3\2\2\2\u0086\u0087\5<\37" +
                    "\2\u0087\u0088\5(\25\2\u0088\u008a\3\2\2\2\u0089u\3\2\2\2\u0089|\3\2\2" +
                    "\2\u0089\u0080\3\2\2\2\u0089\u0086\3\2\2\2\u008a\23\3\2\2\2\u008b\u00c7" +
                    "\5\16\b\2\u008c\u008d\7\b\2\2\u008d\u008e\5\60\31\2\u008e\u0091\5\24\13" +
                    "\2\u008f\u0090\7\t\2\2\u0090\u0092\5\26\f\2\u0091\u008f\3\2\2\2\u0091" +
                    "\u0092\3\2\2\2\u0092\u00c7\3\2\2\2\u0093\u0094\7\4\2\2\u0094\u0095\7\36" +
                    "\2\2\u0095\u0096\5\32\16\2\u0096\u0097\7\37\2\2\u0097\u0098\5\24\13\2" +
                    "\u0098\u00c7\3\2\2\2\u0099\u009a\7\7\2\2\u009a\u009b\5\60\31\2\u009b\u009c" +
                    "\5\24\13\2\u009c\u00c7\3\2\2\2\u009d\u009e\7\6\2\2\u009e\u009f\5\24\13" +
                    "\2\u009f\u00a0\7\7\2\2\u00a0\u00a1\5\60\31\2\u00a1\u00c7\3\2\2\2\u00a2" +
                    "\u00a3\7\n\2\2\u00a3\u00a4\5\60\31\2\u00a4\u00a8\7 \2\2\u00a5\u00a7\5" +
                    " \21\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8" +
                    "\u00a9\3\2\2\2\u00a9\u00ae\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\5\"" +
                    "\22\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae" +
                    "\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7!" +
                    "\2\2\u00b2\u00c7\3\2\2\2\u00b3\u00b5\7\22\2\2\u00b4\u00b6\5\64\33\2\u00b5" +
                    "\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00c7\3\2\2\2\u00b7\u00b9\7\r" +
                    "\2\2\u00b8\u00ba\7M\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba" +
                    "\u00c7\3\2\2\2\u00bb\u00bd\7\f\2\2\u00bc\u00be\7M\2\2\u00bd\u00bc\3\2" +
                    "\2\2\u00bd\u00be\3\2\2\2\u00be\u00c7\3\2\2\2\u00bf\u00c7\5$\23\2\u00c0" +
                    "\u00c7\5&\24\2\u00c1\u00c7\5\64\33\2\u00c2\u00c3\7M\2\2\u00c3\u00c4\7" +
                    "-\2\2\u00c4\u00c7\5\24\13\2\u00c5\u00c7\5\30\r\2\u00c6\u008b\3\2\2\2\u00c6" +
                    "\u008c\3\2\2\2\u00c6\u0093\3\2\2\2\u00c6\u0099\3\2\2\2\u00c6\u009d\3\2" +
                    "\2\2\u00c6\u00a2\3\2\2\2\u00c6\u00b3\3\2\2\2\u00c6\u00b7\3\2\2\2\u00c6" +
                    "\u00bb\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c1\3\2" +
                    "\2\2\u00c6\u00c2\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\25\3\2\2\2\u00c8\u00c9" +
                    "\5\24\13\2\u00c9\27\3\2\2\2\u00ca\u00cb\7L\2\2\u00cb\u00cc\5F$\2\u00cc" +
                    "\31\3\2\2\2\u00cd\u00da\5\34\17\2\u00ce\u00d0\5\36\20\2\u00cf\u00ce\3" +
                    "\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\7$\2\2\u00d2" +
                    "\u00d4\5\64\33\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3" +
                    "\2\2\2\u00d5\u00d7\7$\2\2\u00d6\u00d8\5\62\32\2\u00d7\u00d6\3\2\2\2\u00d7" +
                    "\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00cd\3\2\2\2\u00d9\u00cf\3\2" +
                    "\2\2\u00da\33\3\2\2\2\u00db\u00dc\5<\37\2\u00dc\u00dd\5,\27\2\u00dd\u00de" +
                    "\7\5\2\2\u00de\u00df\5\64\33\2\u00df\35\3\2\2\2\u00e0\u00e3\5\22\n\2\u00e1" +
                    "\u00e3\5\62\32\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\37\3\2" +
                    "\2\2\u00e4\u00e6\5\"\22\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7" +
                    "\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00eb\5\20" +
                    "\t\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec" +
                    "\u00ed\3\2\2\2\u00ed!\3\2\2\2\u00ee\u00f1\7\13\2\2\u00ef\u00f2\5\64\33" +
                    "\2\u00f0\u00f2\7M\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3" +
                    "\3\2\2\2\u00f3\u00f7\7-\2\2\u00f4\u00f5\7\16\2\2\u00f5\u00f7\7-\2\2\u00f6" +
                    "\u00ee\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7#\3\2\2\2\u00f8\u00fd\7\17\2\2" +
                    "\u00f9\u00fc\5\64\33\2\u00fa\u00fc\7M\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa" +
                    "\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe" +
                    "\u0102\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0103\5\64\33\2\u0101\u0103\7" +
                    "M\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104" +
                    "\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105%\3\2\2\2\u0106\u0107\7\20\2\2" +
                    "\u0107\u0108\7M\2\2\u0108\'\3\2\2\2\u0109\u0117\5*\26\2\u010a\u010f\5" +
                    ",\27\2\u010b\u010c\7$\2\2\u010c\u010e\5,\27\2\u010d\u010b\3\2\2\2\u010e" +
                    "\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0114\3\2" +
                    "\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7&\2\2\u0113\u0115\5.\30\2\u0114" +
                    "\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0109\3\2" +
                    "\2\2\u0116\u010a\3\2\2\2\u0117)\3\2\2\2\u0118\u011b\5,\27\2\u0119\u011a" +
                    "\7&\2\2\u011a\u011c\5.\30\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c" +
                    "\u0123\3\2\2\2\u011d\u011e\5.\30\2\u011e\u011f\7\'\2\2\u011f\u0120\3\2" +
                    "\2\2\u0120\u0121\5,\27\2\u0121\u0123\3\2\2\2\u0122\u0118\3\2\2\2\u0122" +
                    "\u011d\3\2\2\2\u0123+\3\2\2\2\u0124\u0125\7M\2\2\u0125-\3\2\2\2\u0126" +
                    "\u0127\5\64\33\2\u0127/\3\2\2\2\u0128\u0129\7\36\2\2\u0129\u012a\5\64" +
                    "\33\2\u012a\u012b\7\37\2\2\u012b\61\3\2\2\2\u012c\u0131\5\64\33\2\u012d" +
                    "\u012e\7$\2\2\u012e\u0130\5\64\33\2\u012f\u012d\3\2\2\2\u0130\u0133\3" +
                    "\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\63\3\2\2\2\u0133" +
                    "\u0131\3\2\2\2\u0134\u0135\b\33\1\2\u0135\u0141\5\66\34\2\u0136\u0141" +
                    "\58\35\2\u0137\u0138\7\36\2\2\u0138\u0139\5<\37\2\u0139\u013a\7\37\2\2" +
                    "\u013a\u013b\5\64\33\17\u013b\u0141\3\2\2\2\u013c\u013d\t\2\2\2\u013d" +
                    "\u0141\5\64\33\r\u013e\u013f\t\3\2\2\u013f\u0141\5\64\33\f\u0140\u0134" +
                    "\3\2\2\2\u0140\u0136\3\2\2\2\u0140\u0137\3\2\2\2\u0140\u013c\3\2\2\2\u0140" +
                    "\u013e\3\2\2\2\u0141\u0173\3\2\2\2\u0142\u0143\f\13\2\2\u0143\u0144\t" +
                    "\4\2\2\u0144\u0172\5\64\33\f\u0145\u0146\f\n\2\2\u0146\u0147\t\5\2\2\u0147" +
                    "\u0172\5\64\33\13\u0148\u0150\f\t\2\2\u0149\u014a\7)\2\2\u014a\u0151\7" +
                    ")\2\2\u014b\u014c\7(\2\2\u014c\u014d\7(\2\2\u014d\u0151\7(\2\2\u014e\u014f" +
                    "\7(\2\2\u014f\u0151\7(\2\2\u0150\u0149\3\2\2\2\u0150\u014b\3\2\2\2\u0150" +
                    "\u014e\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0172\5\64\33\n\u0153\u0154\f" +
                    "\b\2\2\u0154\u0155\t\6\2\2\u0155\u0172\5\64\33\t\u0156\u0157\f\7\2\2\u0157" +
                    "\u0158\t\7\2\2\u0158\u0172\5\64\33\b\u0159\u015a\f\6\2\2\u015a\u015b\7" +
                    "<\2\2\u015b\u0172\5\64\33\7\u015c\u015d\f\5\2\2\u015d\u015e\7\62\2\2\u015e" +
                    "\u0172\5\64\33\6\u015f\u0160\f\4\2\2\u0160\u0161\7\63\2\2\u0161\u0172" +
                    "\5\64\33\5\u0162\u0163\f\3\2\2\u0163\u0164\7,\2\2\u0164\u0165\5\64\33" +
                    "\2\u0165\u0166\7-\2\2\u0166\u0167\5\64\33\2\u0167\u0168\t\b\2\2\u0168" +
                    "\u0169\5\64\33\4\u0169\u0172\3\2\2\2\u016a\u016b\f\21\2\2\u016b\u016c" +
                    "\7\"\2\2\u016c\u016d\5\64\33\2\u016d\u016e\7#\2\2\u016e\u0172\3\2\2\2" +
                    "\u016f\u0170\f\16\2\2\u0170\u0172\t\t\2\2\u0171\u0142\3\2\2\2\u0171\u0145" +
                    "\3\2\2\2\u0171\u0148\3\2\2\2\u0171\u0153\3\2\2\2\u0171\u0156\3\2\2\2\u0171" +
                    "\u0159\3\2\2\2\u0171\u015c\3\2\2\2\u0171\u015f\3\2\2\2\u0171\u0162\3\2" +
                    "\2\2\u0171\u016a\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0175\3\2\2\2\u0173" +
                    "\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\65\3\2\2\2\u0175\u0173\3\2\2" +
                    "\2\u0176\u0177\7\36\2\2\u0177\u0178\5\64\33\2\u0178\u0179\7\37\2\2\u0179" +
                    "\u017d\3\2\2\2\u017a\u017d\5F$\2\u017b\u017d\7M\2\2\u017c\u0176\3\2\2" +
                    "\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017d\67\3\2\2\2\u017e\u017f" +
                    "\7M\2\2\u017f\u0181\7\36\2\2\u0180\u0182\5\62\32\2\u0181\u0180\3\2\2\2" +
                    "\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\7\37\2\2\u01849\3" +
                    "\2\2\2\u0185\u0188\5<\37\2\u0186\u0188\7\25\2\2\u0187\u0185\3\2\2\2\u0187" +
                    "\u0186\3\2\2\2\u0188;\3\2\2\2\u0189\u018a\5> \2\u018a=\3\2\2\2\u018b\u018c" +
                    "\t\n\2\2\u018c?\3\2\2\2\u018d\u018f\7\36\2\2\u018e\u0190\5B\"\2\u018f" +
                    "\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\7\37" +
                    "\2\2\u0192A\3\2\2\2\u0193\u0198\5D#\2\u0194\u0195\7$\2\2\u0195\u0197\5" +
                    "D#\2\u0196\u0194\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198" +
                    "\u0199\3\2\2\2\u0199C\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\5<\37\2" +
                    "\u019c\u019d\5,\27\2\u019dE\3\2\2\2\u019e\u01a4\5H%\2\u019f\u01a4\5J&" +
                    "\2\u01a0\u01a4\7\34\2\2\u01a1\u01a4\7\33\2\2\u01a2\u01a4\7\35\2\2\u01a3" +
                    "\u019e\3\2\2\2\u01a3\u019f\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a3\u01a1\3\2" +
                    "\2\2\u01a3\u01a2\3\2\2\2\u01a4G\3\2\2\2\u01a5\u01a6\t\13\2\2\u01a6I\3" +
                    "\2\2\2\u01a7\u01a8\7\32\2\2\u01a8K\3\2\2\2,NUlsz\u0089\u0091\u00a8\u00ae" +
                    "\u00b5\u00b9\u00bd\u00c6\u00cf\u00d3\u00d7\u00d9\u00e2\u00e7\u00ec\u00f1" +
                    "\u00f6\u00fb\u00fd\u0102\u0104\u010f\u0114\u0116\u011b\u0122\u0131\u0140" +
                    "\u0150\u0171\u0173\u017c\u0181\u0187\u018f\u0198\u01a3";
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

	@Override
	public String getGrammarFileName() { return "CustomParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }
	public CustomParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CustomParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CustomParser.RBRACE, 0); }
		public FileContentContext fileContent() {
			return getRuleContext(FileContentContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}

	}

	public static class FileContentContext extends ParserRuleContext {
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
		}
		public List<FunctionsDeclarationContext> functionsDeclaration() {
			return getRuleContexts(FunctionsDeclarationContext.class);
		}
		public FunctionsDeclarationContext functionsDeclaration(int i) {
			return getRuleContext(FunctionsDeclarationContext.class,i);
		}
		public FileContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterFileContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitFileContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitFileContent(this);
			else return visitor.visitChildren(this);
		}
	}

    public final CompilationUnitContext compilationUnit() throws RecognitionException {
        CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(74);
                match(LBRACE);
                setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIN) | (1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << BOOLEAN) | (1L << ANY))) != 0)) {
				{
                    setState(75);
                    fileContent();
                }
                }

                setState(78);
                match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainDeclarationContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(CustomParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(CustomParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CustomParser.RPAREN, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MainDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitMainDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitMainDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

    public final FileContentContext fileContent() throws RecognitionException {
        FileContentContext _localctx = new FileContentContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_fileContent);
        int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(83);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << BOOLEAN) | (1L << ANY))) != 0)) {
                    {
                        {
                            setState(80);
                            functionsDeclaration();
                        }
                    }
                    setState(85);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
			setState(86);
                mainDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionsDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FunctionsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterFunctionsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitFunctionsDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitFunctionsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

    public final MainDeclarationContext mainDeclaration() throws RecognitionException {
        MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_mainDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(88);
                match(MAIN);
                setState(89);
                match(LPAREN);
                setState(90);
                match(RPAREN);
			setState(91);
                methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeOrVoidContext typeOrVoid() {
			return getRuleContext(TypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CustomParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

    public final FunctionsDeclarationContext functionsDeclaration() throws RecognitionException {
        FunctionsDeclarationContext _localctx = new FunctionsDeclarationContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_functionsDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
                methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

    public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
        MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(95);
                typeOrVoid();
                setState(96);
                match(IDENTIFIER);
                setState(97);
                formalParameters();
                setState(98);
                methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CustomParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CustomParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

    public final MethodBodyContext methodBody() throws RecognitionException {
        MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(100);
                block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_block);
        int _la;
		try {
            enterOuterAlt(_localctx, 1);
            {
                setState(102);
                match(LBRACE);
                setState(106);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOREACH) | (1L << DO) | (1L << WHILE) | (1L << IF) | (1L << SWITCH) | (1L << CONTINUE) | (1L << BREAK) | (1L << WRITE) | (1L << READ) | (1L << RETURN) | (1L << FLOAT) | (1L << INT) | (1L << BOOLEAN) | (1L << ANY) | (1L << DECIMAL_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la == SINGLE_COMMENT || _la == IDENTIFIER) {
                    {
                        {
                            setState(103);
                            blockStatement();
                        }
                    }
                    setState(108);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(109);
                match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CustomParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN_LEFT() { return getToken(CustomParser.ASSIGN_LEFT, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public TerminalNode ASSIGN_RIGHT() { return getToken(CustomParser.ASSIGN_RIGHT, 0); }
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

    public final BlockStatementContext blockStatement() throws RecognitionException {
        BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_blockStatement);
        try {
            setState(113);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(111);
                    localVariableDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(112);
                    statement();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_localVariableDeclaration);
		int _la;
		try {
            setState(135);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(115);
				variableDeclaratorId();
                    setState(116);
				match(COLON);
                    setState(117);
				type();
                    setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_LEFT) {
					{
                        setState(118);
					match(ASSIGN_LEFT);
                        setState(119);
					variableInitializer();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(122);
                variableDeclaratorId();
                setState(123);
                match(ASSIGN_LEFT);
                setState(124);
                variableInitializer();
            }
            break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(126);
                    variableInitializer();
                    setState(127);
                    match(ASSIGN_RIGHT);
                    setState(128);
                    variableDeclaratorId();
                    setState(129);
                    match(COLON);
                    setState(130);
                    type();
                }
				break;
                case 4:
                    enterOuterAlt(_localctx, 4);
				{
                    setState(132);
				type();
                    setState(133);
				variableDeclarators();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(196);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(137);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(138);
				match(IF);
                    setState(139);
				parExpression();
                    setState(140);
				statement();
                    setState(143);
				_errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
				case 1:
					{
                        setState(141);
					match(ELSE);
                        setState(142);
                        elseStatement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
                    setState(145);
                    match(FOREACH);
				setState(146);
                    match(LPAREN);
				setState(147);
				forControl();
                    setState(148);
                    match(RPAREN);
				setState(149);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
                    setState(151);
				match(WHILE);
                    setState(152);
				parExpression();
                    setState(153);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
                    setState(155);
				match(DO);
                    setState(156);
				statement();
                    setState(157);
				match(WHILE);
                    setState(158);
				parExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
                    setState(160);
                    match(SWITCH);
				setState(161);
                    parExpression();
				setState(162);
				match(LBRACE);
                    setState(166);
				_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
                            setState(163);
						switchBlockStatementGroup();
						}
						} 
					}
                    setState(168);
					_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
				}
                    setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
                        setState(169);
					switchLabel();
					}
					}
                    setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
                    setState(175);
				match(RBRACE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
                    setState(177);
				match(RETURN);
                    setState(179);
				_errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
				case 1:
					{
                        setState(178);
					expression(0);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
                    setState(181);
				match(BREAK);
                    setState(183);
				_errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
				case 1:
					{
                        setState(182);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
                    setState(185);
				match(CONTINUE);
                    setState(187);
				_errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
				case 1:
					{
                        setState(186);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
                    setState(189);
				writeToStd();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
                    setState(190);
				readFromStd();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
                    setState(191);
				((StatementContext)_localctx).statementExpression = expression(0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
                    setState(192);
                    ((StatementContext) _localctx).identifierLabel = match(IDENTIFIER);
				setState(193);
				match(COLON);
                    setState(194);
				statement();
				}
            break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(195);
                    comment();
                }
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public final ElseStatementContext elseStatement() throws RecognitionException {
        ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_elseStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(198);
                statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final CommentContext comment() throws RecognitionException {
        CommentContext _localctx = new CommentContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_comment);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(200);
                match(SINGLE_COMMENT);
                setState(201);
                literal();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_forControl);
		int _la;
		try {
            setState(215);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(203);
				foreachControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (FLOAT - 17)) | (1L << (INT - 17)) | (1L << (BOOLEAN - 17)) | (1L << (ANY - 17)) | (1L << (DECIMAL_LITERAL - 17)) | (1L << (BINARY_LITERAL - 17)) | (1L << (FLOAT_LITERAL - 17)) | (1L << (BOOL_LITERAL - 17)) | (1L << (STRING_LITERAL - 17)) | (1L << (NULL_LITERAL - 17)) | (1L << (LPAREN - 17)) | (1L << (BANG - 17)) | (1L << (TILDE - 17)) | (1L << (INC - 17)) | (1L << (DEC - 17)) | (1L << (ADD - 17)) | (1L << (SUB - 17)) | (1L << (IDENTIFIER - 17)))) != 0)) {
					{
                        setState(204);
					forInit();
					}
				}

                    setState(207);
				match(COMMA);
                    setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (DECIMAL_LITERAL - 22)) | (1L << (BINARY_LITERAL - 22)) | (1L << (FLOAT_LITERAL - 22)) | (1L << (BOOL_LITERAL - 22)) | (1L << (STRING_LITERAL - 22)) | (1L << (NULL_LITERAL - 22)) | (1L << (LPAREN - 22)) | (1L << (BANG - 22)) | (1L << (TILDE - 22)) | (1L << (INC - 22)) | (1L << (DEC - 22)) | (1L << (ADD - 22)) | (1L << (SUB - 22)) | (1L << (IDENTIFIER - 22)))) != 0)) {
					{
                        setState(208);
					expression(0);
					}
				}

                    setState(211);
				match(COMMA);
                    setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (DECIMAL_LITERAL - 22)) | (1L << (BINARY_LITERAL - 22)) | (1L << (FLOAT_LITERAL - 22)) | (1L << (BOOL_LITERAL - 22)) | (1L << (STRING_LITERAL - 22)) | (1L << (NULL_LITERAL - 22)) | (1L << (LPAREN - 22)) | (1L << (BANG - 22)) | (1L << (TILDE - 22)) | (1L << (INC - 22)) | (1L << (DEC - 22)) | (1L << (ADD - 22)) | (1L << (SUB - 22)) | (1L << (IDENTIFIER - 22)))) != 0)) {
					{
                        setState(212);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final ForeachControlContext foreachControl() throws RecognitionException {
		ForeachControlContext _localctx = new ForeachControlContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_foreachControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(217);
			type();
                setState(218);
			variableDeclaratorId();
                setState(219);
			match(IN);
                setState(220);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class ForControlContext extends ParserRuleContext {
        public ExpressionListContext forUpdate;

        public ForeachControlContext foreachControl() {
            return getRuleContext(ForeachControlContext.class, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(CustomParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(CustomParser.COMMA, i);
        }

        public ForInitContext forInit() {
            return getRuleContext(ForInitContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}

        public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_forControl;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_forInit);
		try {
            setState(224);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(222);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(223);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class ForeachControlContext extends ParserRuleContext {
        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public VariableDeclaratorIdContext variableDeclaratorId() {
            return getRuleContext(VariableDeclaratorIdContext.class, 0);
        }

        public TerminalNode IN() {
            return getToken(CustomParser.IN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ForeachControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_foreachControl;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterForeachControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitForeachControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitForeachControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
                    setState(226);
				switchLabel();
				}
				}
                setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
                setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
                    setState(231);
				blockStatement();
				}
				}
                setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
            } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOREACH) | (1L << DO) | (1L << WHILE) | (1L << IF) | (1L << SWITCH) | (1L << CONTINUE) | (1L << BREAK) | (1L << WRITE) | (1L << READ) | (1L << RETURN) | (1L << FLOAT) | (1L << INT) | (1L << BOOLEAN) | (1L << ANY) | (1L << DECIMAL_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la == SINGLE_COMMENT || _la == IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class ForInitContext extends ParserRuleContext {
        public LocalVariableDeclarationContext localVariableDeclaration() {
            return getRuleContext(LocalVariableDeclarationContext.class, 0);
        }

        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class, 0);
        }

        public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_forInit;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_switchLabel);
		try {
            setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
                    setState(236);
				match(CASE);
                    setState(239);
				_errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
				case 1:
					{
                        setState(237);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
                        setState(238);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
                    setState(241);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
                    setState(242);
				match(DEFAULT);
                    setState(243);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
        public List<SwitchLabelContext> switchLabel() {
            return getRuleContexts(SwitchLabelContext.class);
        }

        public SwitchLabelContext switchLabel(int i) {
            return getRuleContext(SwitchLabelContext.class, i);
        }

        public List<BlockStatementContext> blockStatement() {
            return getRuleContexts(BlockStatementContext.class);
        }

        public BlockStatementContext blockStatement(int i) {
            return getRuleContext(BlockStatementContext.class, i);
        }

        public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_switchBlockStatementGroup;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener)
                ((CustomParserListener) listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener)
                ((CustomParserListener) listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteToStdContext writeToStd() throws RecognitionException {
		WriteToStdContext _localctx = new WriteToStdContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_writeToStd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(246);
			match(WRITE);
                setState(251);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        setState(249);
					_errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
					case 1:
						{
                            setState(247);
						expression(0);
						}
						break;
					case 2:
						{
                            setState(248);
						match(IDENTIFIER);
						}
						break;
					}
                    }
				}
                setState(253);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
			}
                setState(256);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
                        setState(256);
					_errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 24, _ctx)) {
					case 1:
						{
                            setState(254);
						expression(0);
						}
						break;
					case 2:
						{
                            setState(255);
						match(IDENTIFIER);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
                setState(258);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 25, _ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class SwitchLabelContext extends ParserRuleContext {
        public ExpressionContext constantExpression;
        public Token enumConstantName;

        public TerminalNode CASE() {
            return getToken(CustomParser.CASE, 0);
        }

        public TerminalNode COLON() {
            return getToken(CustomParser.COLON, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }
		public TerminalNode IDENTIFIER() { return getToken(CustomParser.IDENTIFIER, 0); }

        public TerminalNode DEFAULT() {
            return getToken(CustomParser.DEFAULT, 0);
        }

        public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_switchLabel;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadFromStdContext readFromStd() throws RecognitionException {
		ReadFromStdContext _localctx = new ReadFromStdContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_readFromStd);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(260);
			match(READ);
                setState(261);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class WriteToStdContext extends ParserRuleContext {
        public TerminalNode WRITE() {
            return getToken(CustomParser.WRITE, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminalNode> IDENTIFIER() {
            return getTokens(CustomParser.IDENTIFIER);
        }

        public TerminalNode IDENTIFIER(int i) {
            return getToken(CustomParser.IDENTIFIER, i);
        }

        public WriteToStdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_writeToStd;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterWriteToStd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitWriteToStd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitWriteToStd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_variableDeclarators);
        int _la;
		try {
			int _alt;
            setState(276);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 28, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(263);
                    variableDeclarator();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(264);
                    variableDeclaratorId();
                    setState(269);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(265);
                                    match(COMMA);
                                    setState(266);
                                    variableDeclaratorId();
                                }
                            }
                        }
                        setState(271);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
                    }
                    setState(274);
				_errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == ASSIGN_LEFT) {
                        {
                            setState(272);
                            match(ASSIGN_LEFT);
                            setState(273);
                            variableInitializer();
                        }
                    }

                }
                break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class ReadFromStdContext extends ParserRuleContext {
        public TerminalNode READ() {
            return getToken(CustomParser.READ, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(CustomParser.IDENTIFIER, 0);
        }

        public ReadFromStdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_readFromStd;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterReadFromStd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitReadFromStd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitReadFromStd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_variableDeclarator);
		int _la;
		try {
            setState(288);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 30, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(278);
				variableDeclaratorId();
                    setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_LEFT) {
					{
                        setState(279);
					match(ASSIGN_LEFT);
                        setState(280);
					variableInitializer();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
                    setState(283);
				variableInitializer();
                    setState(284);
				match(ASSIGN_RIGHT);
				}
                    setState(286);
				variableDeclaratorId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_variableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(290);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_variableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(292);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class VariableDeclaratorContext extends ParserRuleContext {
        public VariableDeclaratorIdContext variableDeclaratorId() {
            return getRuleContext(VariableDeclaratorIdContext.class, 0);
        }

        public TerminalNode ASSIGN_LEFT() {
            return getToken(CustomParser.ASSIGN_LEFT, 0);
        }

        public VariableInitializerContext variableInitializer() {
            return getRuleContext(VariableInitializerContext.class, 0);
        }

        public TerminalNode ASSIGN_RIGHT() {
            return getToken(CustomParser.ASSIGN_RIGHT, 0);
        }

        public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_variableDeclarator;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener)
                ((CustomParserListener) listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener)
                ((CustomParserListener) listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(294);
			match(LPAREN);
                setState(295);
			expression(0);
                setState(296);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class VariableDeclaratorIdContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(CustomParser.IDENTIFIER, 0);
        }

        public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_variableDeclaratorId;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener)
                ((CustomParserListener) listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener)
                ((CustomParserListener) listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(298);
			expression(0);
                setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
                        setState(299);
					match(COMMA);
                        setState(300);
					expression(0);
					}
                    }
				}
                setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class VariableInitializerContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_variableInitializer;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener)
                ((CustomParserListener) listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener)
                ((CustomParserListener) listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
        int _startState = 50;
        enterRecursionRule(_localctx, 50, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
                    setState(307);
				primary();
				}
				break;
			case 2:
				{
                    setState(308);
				methodCall();
				}
				break;
			case 3:
				{
                    setState(309);
				match(LPAREN);
                    setState(310);
				type();
                    setState(311);
				match(RPAREN);
                    setState(312);
                    expression(13);
				}
				break;
			case 4:
				{
                    setState(314);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
                    setState(315);
                    expression(11);
				}
				break;
			case 5:
				{
                    setState(316);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
                    setState(317);
                    expression(10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
                setState(369);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 35, _ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
                        setState(367);
					_errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 34, _ctx)) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
                            setState(320);
                            if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                            setState(321);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
                            setState(322);
                            expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
                            setState(323);
                            if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                            setState(324);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
                            setState(325);
                            expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
                            setState(326);
                            if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                            setState(334);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
                                setState(327);
							match(LT);
                                setState(328);
							match(LT);
							}
							break;
						case 2:
							{
                                setState(329);
							match(GT);
                                setState(330);
							match(GT);
                                setState(331);
							match(GT);
							}
							break;
						case 3:
							{
                                setState(332);
							match(GT);
                                setState(333);
							match(GT);
							}
							break;
						}
                            setState(336);
                            expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
                            setState(337);
                            if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                            setState(338);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
                            setState(339);
                            expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
                            setState(340);
                            if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                            setState(341);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
                            setState(342);
                            expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(343);
                            if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(344);
                            ((ExpressionContext) _localctx).bop = match(CARET);
						setState(345);
                            expression(5);
						}
						break;
                            case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(346);
                            if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(347);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(348);
                            expression(4);
						}
						break;
                            case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(349);
                            if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(350);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(351);
                            expression(3);
						}
						break;
                            case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(352);
                            if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(353);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(354);
						expression(0);
						setState(355);
						match(COLON);
						setState(356);
                            expression(0);
                            setState(357);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ASSIGN_LEFT - 36)) | (1L << (ASSIGN_RIGHT - 36)) | (1L << (ADD_ASSIGN - 36)) | (1L << (SUB_ASSIGN - 36)) | (1L << (MUL_ASSIGN - 36)) | (1L << (DIV_ASSIGN - 36)) | (1L << (AND_ASSIGN - 36)) | (1L << (OR_ASSIGN - 36)) | (1L << (XOR_ASSIGN - 36)) | (1L << (MOD_ASSIGN - 36)) | (1L << (LSHIFT_ASSIGN - 36)) | (1L << (RSHIFT_ASSIGN - 36)) | (1L << (URSHIFT_ASSIGN - 36)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
                            setState(358);
                            expression(2);
						}
						break;
                            case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
                            setState(360);
                            if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(361);
                            match(LBRACK);
						setState(362);
                            expression(0);
                            setState(363);
						match(RBRACK);
						}
						break;
                            case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
                            setState(365);
                            if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                            setState(366);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
                    }
				}
                setState(371);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 35, _ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

    public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CustomParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CustomParser.RPAREN, 0); }

        public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_parExpression;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_primary);
		try {
            setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
                    setState(372);
				match(LPAREN);
                    setState(373);
				expression(0);
                    setState(374);
				match(RPAREN);
				}
				break;
			case DECIMAL_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
                    setState(376);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
                    setState(377);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class ExpressionListContext extends ParserRuleContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(CustomParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(CustomParser.COMMA, i);
        }

        public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_expressionList;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(380);
			match(IDENTIFIER);
                setState(381);
			match(LPAREN);
                setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (DECIMAL_LITERAL - 22)) | (1L << (BINARY_LITERAL - 22)) | (1L << (FLOAT_LITERAL - 22)) | (1L << (BOOL_LITERAL - 22)) | (1L << (STRING_LITERAL - 22)) | (1L << (NULL_LITERAL - 22)) | (1L << (LPAREN - 22)) | (1L << (BANG - 22)) | (1L << (TILDE - 22)) | (1L << (INC - 22)) | (1L << (DEC - 22)) | (1L << (ADD - 22)) | (1L << (SUB - 22)) | (1L << (IDENTIFIER - 22)))) != 0)) {
				{
                    setState(382);
				expressionList();
				}
			}

                setState(385);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class ExpressionContext extends ParserRuleContext {
        public Token prefix;
        public Token bop;
        public Token postfix;

        public PrimaryContext primary() {
            return getRuleContext(PrimaryContext.class, 0);
        }

        public MethodCallContext methodCall() {
            return getRuleContext(MethodCallContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(CustomParser.LPAREN, 0);
        }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}

        public TerminalNode RPAREN() {
            return getToken(CustomParser.RPAREN, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode ADD() {
            return getToken(CustomParser.ADD, 0);
        }

        public TerminalNode SUB() {
            return getToken(CustomParser.SUB, 0);
        }

        public TerminalNode INC() {
            return getToken(CustomParser.INC, 0);
        }

        public TerminalNode DEC() {
            return getToken(CustomParser.DEC, 0);
        }

        public TerminalNode TILDE() {
            return getToken(CustomParser.TILDE, 0);
        }

        public TerminalNode BANG() {
            return getToken(CustomParser.BANG, 0);
        }

        public TerminalNode MUL() {
            return getToken(CustomParser.MUL, 0);
        }

        public TerminalNode DIV() {
            return getToken(CustomParser.DIV, 0);
        }

        public TerminalNode MOD() {
            return getToken(CustomParser.MOD, 0);
        }

        public List<TerminalNode> LT() {
            return getTokens(CustomParser.LT);
        }

        public TerminalNode LT(int i) {
            return getToken(CustomParser.LT, i);
        }

        public List<TerminalNode> GT() {
            return getTokens(CustomParser.GT);
        }

        public TerminalNode GT(int i) {
            return getToken(CustomParser.GT, i);
        }

        public TerminalNode LE() {
            return getToken(CustomParser.LE, 0);
        }

        public TerminalNode GE() {
            return getToken(CustomParser.GE, 0);
        }

        public TerminalNode EQUAL() {
            return getToken(CustomParser.EQUAL, 0);
        }

        public TerminalNode NOTEQUAL() {
            return getToken(CustomParser.NOTEQUAL, 0);
        }

        public TerminalNode CARET() {
            return getToken(CustomParser.CARET, 0);
        }

        public TerminalNode AND() {
            return getToken(CustomParser.AND, 0);
        }

        public TerminalNode OR() {
            return getToken(CustomParser.OR, 0);
        }

        public TerminalNode COLON() {
            return getToken(CustomParser.COLON, 0);
        }

        public TerminalNode QUESTION() {
            return getToken(CustomParser.QUESTION, 0);
        }

        public TerminalNode ASSIGN_LEFT() {
            return getToken(CustomParser.ASSIGN_LEFT, 0);
        }

        public TerminalNode ASSIGN_RIGHT() {
            return getToken(CustomParser.ASSIGN_RIGHT, 0);
        }

        public TerminalNode ADD_ASSIGN() {
            return getToken(CustomParser.ADD_ASSIGN, 0);
        }

        public TerminalNode SUB_ASSIGN() {
            return getToken(CustomParser.SUB_ASSIGN, 0);
        }

        public TerminalNode MUL_ASSIGN() {
            return getToken(CustomParser.MUL_ASSIGN, 0);
        }

        public TerminalNode DIV_ASSIGN() {
            return getToken(CustomParser.DIV_ASSIGN, 0);
        }

        public TerminalNode AND_ASSIGN() {
            return getToken(CustomParser.AND_ASSIGN, 0);
        }

        public TerminalNode OR_ASSIGN() {
            return getToken(CustomParser.OR_ASSIGN, 0);
        }

        public TerminalNode XOR_ASSIGN() {
            return getToken(CustomParser.XOR_ASSIGN, 0);
        }

        public TerminalNode RSHIFT_ASSIGN() {
            return getToken(CustomParser.RSHIFT_ASSIGN, 0);
        }

        public TerminalNode URSHIFT_ASSIGN() {
            return getToken(CustomParser.URSHIFT_ASSIGN, 0);
        }

        public TerminalNode LSHIFT_ASSIGN() {
            return getToken(CustomParser.LSHIFT_ASSIGN, 0);
        }

        public TerminalNode MOD_ASSIGN() {
            return getToken(CustomParser.MOD_ASSIGN, 0);
        }

        public TerminalNode LBRACK() {
            return getToken(CustomParser.LBRACK, 0);
        }

        public TerminalNode RBRACK() {
            return getToken(CustomParser.RBRACK, 0);
        }

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

    public final ExpressionContext expression() throws RecognitionException {
        return expression(0);
    }

	public final TypeOrVoidContext typeOrVoid() throws RecognitionException {
		TypeOrVoidContext _localctx = new TypeOrVoidContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_typeOrVoid);
		try {
            setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case BOOLEAN:
			case ANY:
				enterOuterAlt(_localctx, 1);
				{
                    setState(387);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
                    setState(388);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class PrimaryContext extends ParserRuleContext {
        public TerminalNode LPAREN() {
            return getToken(CustomParser.LPAREN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(CustomParser.RPAREN, 0);
        }

        public LiteralContext literal() {
            return getRuleContext(LiteralContext.class, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(CustomParser.IDENTIFIER, 0);
        }

        public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_primary;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
                setState(391);
			primitiveType();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class MethodCallContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return getToken(CustomParser.IDENTIFIER, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(CustomParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(CustomParser.RPAREN, 0);
        }

        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class, 0);
        }

        public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_methodCall;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(393);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << BOOLEAN) | (1L << ANY))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class TypeOrVoidContext extends ParserRuleContext {
        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode VOID() {
            return getToken(CustomParser.VOID, 0);
        }

        public TypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_typeOrVoid;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(395);
			match(LPAREN);
                setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << BOOLEAN) | (1L << ANY))) != 0)) {
				{
                    setState(396);
				formalParameterList();
				}
			}

                setState(399);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class TypeContext extends ParserRuleContext {
        public PrimitiveTypeContext primitiveType() {
            return getRuleContext(PrimitiveTypeContext.class, 0);
        }

        public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_type;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_formalParameterList);
		int _la;
		try {
            enterOuterAlt(_localctx, 1);
            {
                setState(401);
                formalParameter();
                setState(406);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(402);
                            match(COMMA);
                            setState(403);
                            formalParameter();
                        }
                    }
                    setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
                }
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class PrimitiveTypeContext extends ParserRuleContext {
        public TerminalNode BOOLEAN() {
            return getToken(CustomParser.BOOLEAN, 0);
        }

        public TerminalNode INT() {
            return getToken(CustomParser.INT, 0);
        }

        public TerminalNode FLOAT() {
            return getToken(CustomParser.FLOAT, 0);
        }

        public TerminalNode ANY() {
            return getToken(CustomParser.ANY, 0);
        }

        public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_primitiveType;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(409);
			type();
                setState(410);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class FormalParametersContext extends ParserRuleContext {
        public TerminalNode LPAREN() {
            return getToken(CustomParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(CustomParser.RPAREN, 0);
        }

        public FormalParameterListContext formalParameterList() {
            return getRuleContext(FormalParameterListContext.class, 0);
        }

        public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_formalParameters;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_literal);
		try {
            setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
                    setState(412);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
                    setState(413);
				floatLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
                    setState(414);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
                    setState(415);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
                    setState(416);
				match(NULL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class FormalParameterListContext extends ParserRuleContext {
        public List<FormalParameterContext> formalParameter() {
            return getRuleContexts(FormalParameterContext.class);
        }

        public FormalParameterContext formalParameter(int i) {
            return getRuleContext(FormalParameterContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(CustomParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(CustomParser.COMMA, i);
        }

        public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_formalParameterList;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener)
                ((CustomParserListener) listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener)
                ((CustomParserListener) listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(419);
			_la = _input.LA(1);
			if ( !(_la==DECIMAL_LITERAL || _la==BINARY_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class FormalParameterContext extends ParserRuleContext {
        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public VariableDeclaratorIdContext variableDeclaratorId() {
            return getRuleContext(VariableDeclaratorIdContext.class, 0);
        }

        public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

        @Override
        public int getRuleIndex() {
            return RULE_formalParameter;
        }
		@Override
		public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(421);
			match(FLOAT_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public static class LiteralContext extends ParserRuleContext {
        public IntegerLiteralContext integerLiteral() {
            return getRuleContext(IntegerLiteralContext.class, 0);
        }

        public FloatLiteralContext floatLiteral() {
            return getRuleContext(FloatLiteralContext.class, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(CustomParser.STRING_LITERAL, 0);
        }

        public TerminalNode BOOL_LITERAL() {
            return getToken(CustomParser.BOOL_LITERAL, 0);
        }

        public TerminalNode NULL_LITERAL() {
            return getToken(CustomParser.NULL_LITERAL, 0);
        }

        public LiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_literal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
            case 25:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}

    public static class IntegerLiteralContext extends ParserRuleContext {
        public TerminalNode DECIMAL_LITERAL() {
            return getToken(CustomParser.DECIMAL_LITERAL, 0);
        }

        public TerminalNode BINARY_LITERAL() {
            return getToken(CustomParser.BINARY_LITERAL, 0);
        }

        public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_integerLiteral;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterIntegerLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitIntegerLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitIntegerLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
            return precpred(_ctx, 9);
		case 1:
            return precpred(_ctx, 8);
		case 2:
            return precpred(_ctx, 7);
		case 3:
            return precpred(_ctx, 6);
		case 4:
            return precpred(_ctx, 5);
		case 5:
            return precpred(_ctx, 4);
		case 6:
            return precpred(_ctx, 3);
		case 7:
            return precpred(_ctx, 2);
		case 8:
            return precpred(_ctx, 1);
		case 9:
            return precpred(_ctx, 15);
		case 10:
            return precpred(_ctx, 12);
		}
		return true;
	}

    public static class FloatLiteralContext extends ParserRuleContext {
        public TerminalNode FLOAT_LITERAL() {
            return getToken(CustomParser.FLOAT_LITERAL, 0);
        }

        public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_floatLiteral;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterFloatLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitFloatLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitFloatLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StatementContext extends ParserRuleContext {
        public BlockContext blockLabel;
        public ExpressionContext statementExpression;
        public Token identifierLabel;

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode IF() {
            return getToken(CustomParser.IF, 0);
        }

        public ParExpressionContext parExpression() {
            return getRuleContext(ParExpressionContext.class, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public TerminalNode ELSE() {
            return getToken(CustomParser.ELSE, 0);
        }

        public ElseStatementContext elseStatement() {
            return getRuleContext(ElseStatementContext.class, 0);
        }

        public TerminalNode FOREACH() {
            return getToken(CustomParser.FOREACH, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(CustomParser.LPAREN, 0);
        }

        public ForControlContext forControl() {
            return getRuleContext(ForControlContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(CustomParser.RPAREN, 0);
        }

        public TerminalNode WHILE() {
            return getToken(CustomParser.WHILE, 0);
        }

        public TerminalNode DO() {
            return getToken(CustomParser.DO, 0);
        }

        public TerminalNode SWITCH() {
            return getToken(CustomParser.SWITCH, 0);
        }

        public TerminalNode LBRACE() {
            return getToken(CustomParser.LBRACE, 0);
        }

        public TerminalNode RBRACE() {
            return getToken(CustomParser.RBRACE, 0);
        }

        public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
            return getRuleContexts(SwitchBlockStatementGroupContext.class);
        }

        public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
            return getRuleContext(SwitchBlockStatementGroupContext.class, i);
        }

        public List<SwitchLabelContext> switchLabel() {
            return getRuleContexts(SwitchLabelContext.class);
        }

        public SwitchLabelContext switchLabel(int i) {
            return getRuleContext(SwitchLabelContext.class, i);
        }

        public TerminalNode RETURN() {
            return getToken(CustomParser.RETURN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode BREAK() {
            return getToken(CustomParser.BREAK, 0);
        }

        public TerminalNode IDENTIFIER() {
            return getToken(CustomParser.IDENTIFIER, 0);
        }

        public TerminalNode CONTINUE() {
            return getToken(CustomParser.CONTINUE, 0);
        }

        public WriteToStdContext writeToStd() {
            return getRuleContext(WriteToStdContext.class, 0);
        }

        public ReadFromStdContext readFromStd() {
            return getRuleContext(ReadFromStdContext.class, 0);
        }

        public TerminalNode COLON() {
            return getToken(CustomParser.COLON, 0);
        }

        public CommentContext comment() {
            return getRuleContext(CommentContext.class, 0);
        }

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ElseStatementContext extends ParserRuleContext {
        public ElseStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elseStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterElseStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitElseStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitElseStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CommentContext extends ParserRuleContext {
        public CommentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode SINGLE_COMMENT() {
            return getToken(CustomParser.SINGLE_COMMENT, 0);
        }

        public LiteralContext literal() {
            return getRuleContext(LiteralContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_comment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).enterComment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener) ((CustomParserListener) listener).exitComment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitComment(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VariableDeclaratorsContext extends ParserRuleContext {
        public VariableDeclaratorContext variableDeclarator() {
            return getRuleContext(VariableDeclaratorContext.class, 0);
        }

        public List<VariableDeclaratorIdContext> variableDeclaratorId() {
            return getRuleContexts(VariableDeclaratorIdContext.class);
        }

        public VariableDeclaratorIdContext variableDeclaratorId(int i) {
            return getRuleContext(VariableDeclaratorIdContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(CustomParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(CustomParser.COMMA, i);
        }

        public TerminalNode ASSIGN_LEFT() {
            return getToken(CustomParser.ASSIGN_LEFT, 0);
        }

        public VariableInitializerContext variableInitializer() {
            return getRuleContext(VariableInitializerContext.class, 0);
        }

        public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDeclarators;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener)
                ((CustomParserListener) listener).enterVariableDeclarators(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CustomParserListener)
                ((CustomParserListener) listener).exitVariableDeclarators(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CustomParserVisitor)
                return ((CustomParserVisitor<? extends T>) visitor).visitVariableDeclarators(this);
            else return visitor.visitChildren(this);
        }
    }
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}