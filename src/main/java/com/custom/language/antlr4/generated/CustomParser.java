// Generated from CustomParser.g4 by ANTLR 4.7.1
package com.custom.language.antlr4.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CustomParser extends Parser {
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
	public static final int
		RULE_compilationUnit = 0, RULE_fileContent = 1, RULE_mainDeclaration = 2, 
		RULE_functionsDeclaration = 3, RULE_methodDeclaration = 4, RULE_methodBody = 5, 
		RULE_block = 6, RULE_blockStatement = 7, RULE_localVariableDeclaration = 8, 
		RULE_statement = 9, RULE_forControl = 10, RULE_foreachControl = 11, RULE_forInit = 12, 
		RULE_switchBlockStatementGroup = 13, RULE_switchLabel = 14, RULE_writeToStd = 15, 
		RULE_readFromStd = 16, RULE_variableDeclarators = 17, RULE_variableDeclarator = 18, 
		RULE_variableDeclaratorId = 19, RULE_variableInitializer = 20, RULE_parExpression = 21, 
		RULE_expressionList = 22, RULE_expression = 23, RULE_primary = 24, RULE_methodCall = 25, 
		RULE_typeOrVoid = 26, RULE_type = 27, RULE_primitiveType = 28, RULE_formalParameters = 29, 
		RULE_formalParameterList = 30, RULE_formalParameter = 31, RULE_lastFormalParameter = 32, 
		RULE_literal = 33, RULE_integerLiteral = 34, RULE_floatLiteral = 35;
	public static final String[] ruleNames = {
		"compilationUnit", "fileContent", "mainDeclaration", "functionsDeclaration", 
		"methodDeclaration", "methodBody", "block", "blockStatement", "localVariableDeclaration", 
		"statement", "forControl", "foreachControl", "forInit", "switchBlockStatementGroup", 
		"switchLabel", "writeToStd", "readFromStd", "variableDeclarators", "variableDeclarator", 
		"variableDeclaratorId", "variableInitializer", "parExpression", "expressionList", 
		"expression", "primary", "methodCall", "typeOrVoid", "type", "primitiveType", 
		"formalParameters", "formalParameterList", "formalParameter", "lastFormalParameter", 
		"literal", "integerLiteral", "floatLiteral"
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

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(LBRACE);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIN) | (1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << BOOLEAN) | (1L << ANY))) != 0)) {
				{
				setState(73);
				fileContent();
				}
			}

			setState(76);
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

	public final FileContentContext fileContent() throws RecognitionException {
		FileContentContext _localctx = new FileContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fileContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << BOOLEAN) | (1L << ANY))) != 0)) {
				{
				{
				setState(78);
				functionsDeclaration();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(MAIN);
			setState(87);
			match(LPAREN);
			setState(88);
			match(RPAREN);
			setState(89);
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

	public final FunctionsDeclarationContext functionsDeclaration() throws RecognitionException {
		FunctionsDeclarationContext _localctx = new FunctionsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionsDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
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
		public List<TerminalNode> LBRACK() { return getTokens(CustomParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CustomParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CustomParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CustomParser.RBRACK, i);
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

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			typeOrVoid();
			setState(94);
			match(IDENTIFIER);
			setState(95);
			formalParameters();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(96);
				match(LBRACK);
				setState(97);
				match(RBRACK);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
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

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(LBRACE);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOREACH) | (1L << DO) | (1L << WHILE) | (1L << IF) | (1L << SWITCH) | (1L << CONTINUE) | (1L << BREAK) | (1L << WRITE) | (1L << READ) | (1L << RETURN) | (1L << FLOAT) | (1L << INT) | (1L << BOOLEAN) | (1L << ANY) | (1L << DECIMAL_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(108);
				blockStatement();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
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

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_blockStatement);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				statement();
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

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_localVariableDeclaration);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				variableDeclaratorId();
				setState(121);
				match(COLON);
				setState(122);
				type();
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_LEFT) {
					{
					setState(123);
					match(ASSIGN_LEFT);
					setState(124);
					variableInitializer();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				variableInitializer();
				setState(128);
				match(ASSIGN_RIGHT);
				setState(129);
				variableDeclaratorId();
				setState(130);
				match(COLON);
				setState(131);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				type();
				setState(134);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public Token identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(CustomParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CustomParser.ELSE, 0); }
		public TerminalNode FOREACH() { return getToken(CustomParser.FOREACH, 0); }
		public TerminalNode LPAREN() { return getToken(CustomParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CustomParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(CustomParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(CustomParser.DO, 0); }
		public TerminalNode SWITCH() { return getToken(CustomParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(CustomParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CustomParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(CustomParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(CustomParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CustomParser.IDENTIFIER, 0); }
		public TerminalNode CONTINUE() { return getToken(CustomParser.CONTINUE, 0); }
		public WriteToStdContext writeToStd() {
			return getRuleContext(WriteToStdContext.class,0);
		}
		public ReadFromStdContext readFromStd() {
			return getRuleContext(ReadFromStdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CustomParser.COLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(IF);
				setState(140);
				parExpression();
				setState(141);
				statement();
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(142);
					match(ELSE);
					setState(143);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(FOREACH);
				setState(147);
				match(LPAREN);
				setState(148);
				forControl();
				setState(149);
				match(RPAREN);
				setState(150);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(WHILE);
				setState(153);
				parExpression();
				setState(154);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				match(DO);
				setState(157);
				statement();
				setState(158);
				match(WHILE);
				setState(159);
				parExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				match(SWITCH);
				setState(162);
				parExpression();
				setState(163);
				match(LBRACE);
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(164);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(169);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(170);
					switchLabel();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(RBRACE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
				match(RETURN);
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(179);
					expression(0);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(182);
				match(BREAK);
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(183);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(186);
				match(CONTINUE);
				setState(188);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(187);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(190);
				writeToStd();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(191);
				readFromStd();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(192);
				((StatementContext)_localctx).statementExpression = expression(0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(193);
				((StatementContext)_localctx).identifierLabel = match(IDENTIFIER);
				setState(194);
				match(COLON);
				setState(195);
				statement();
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

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public ForeachControlContext foreachControl() {
			return getRuleContext(ForeachControlContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CustomParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CustomParser.COMMA, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forControl);
		int _la;
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				foreachControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (FLOAT - 17)) | (1L << (INT - 17)) | (1L << (BOOLEAN - 17)) | (1L << (ANY - 17)) | (1L << (DECIMAL_LITERAL - 17)) | (1L << (BINARY_LITERAL - 17)) | (1L << (FLOAT_LITERAL - 17)) | (1L << (BOOL_LITERAL - 17)) | (1L << (STRING_LITERAL - 17)) | (1L << (NULL_LITERAL - 17)) | (1L << (LPAREN - 17)) | (1L << (BANG - 17)) | (1L << (TILDE - 17)) | (1L << (INC - 17)) | (1L << (DEC - 17)) | (1L << (ADD - 17)) | (1L << (SUB - 17)) | (1L << (IDENTIFIER - 17)))) != 0)) {
					{
					setState(199);
					forInit();
					}
				}

				setState(202);
				match(COMMA);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (DECIMAL_LITERAL - 22)) | (1L << (BINARY_LITERAL - 22)) | (1L << (FLOAT_LITERAL - 22)) | (1L << (BOOL_LITERAL - 22)) | (1L << (STRING_LITERAL - 22)) | (1L << (NULL_LITERAL - 22)) | (1L << (LPAREN - 22)) | (1L << (BANG - 22)) | (1L << (TILDE - 22)) | (1L << (INC - 22)) | (1L << (DEC - 22)) | (1L << (ADD - 22)) | (1L << (SUB - 22)) | (1L << (IDENTIFIER - 22)))) != 0)) {
					{
					setState(203);
					expression(0);
					}
				}

				setState(206);
				match(COMMA);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (DECIMAL_LITERAL - 22)) | (1L << (BINARY_LITERAL - 22)) | (1L << (FLOAT_LITERAL - 22)) | (1L << (BOOL_LITERAL - 22)) | (1L << (STRING_LITERAL - 22)) | (1L << (NULL_LITERAL - 22)) | (1L << (LPAREN - 22)) | (1L << (BANG - 22)) | (1L << (TILDE - 22)) | (1L << (INC - 22)) | (1L << (DEC - 22)) | (1L << (ADD - 22)) | (1L << (SUB - 22)) | (1L << (IDENTIFIER - 22)))) != 0)) {
					{
					setState(207);
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

	public static class ForeachControlContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode IN() { return getToken(CustomParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForeachControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterForeachControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitForeachControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitForeachControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachControlContext foreachControl() throws RecognitionException {
		ForeachControlContext _localctx = new ForeachControlContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_foreachControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			type();
			setState(213);
			variableDeclaratorId();
			setState(214);
			match(IN);
			setState(215);
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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forInit);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				switchLabel();
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(227); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(226);
				blockStatement();
				}
				}
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOREACH) | (1L << DO) | (1L << WHILE) | (1L << IF) | (1L << SWITCH) | (1L << CONTINUE) | (1L << BREAK) | (1L << WRITE) | (1L << READ) | (1L << RETURN) | (1L << FLOAT) | (1L << INT) | (1L << BOOLEAN) | (1L << ANY) | (1L << DECIMAL_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==IDENTIFIER );
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
		public TerminalNode CASE() { return getToken(CustomParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(CustomParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CustomParser.IDENTIFIER, 0); }
		public TerminalNode DEFAULT() { return getToken(CustomParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_switchLabel);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(CASE);
				setState(234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(232);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(233);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(236);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(DEFAULT);
				setState(238);
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

	public static class WriteToStdContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(CustomParser.WRITE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CustomParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CustomParser.IDENTIFIER, i);
		}
		public WriteToStdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeToStd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterWriteToStd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitWriteToStd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitWriteToStd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteToStdContext writeToStd() throws RecognitionException {
		WriteToStdContext _localctx = new WriteToStdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_writeToStd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(WRITE);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(242);
						expression(0);
						}
						break;
					case 2:
						{
						setState(243);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(251); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(251);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(249);
						expression(0);
						}
						break;
					case 2:
						{
						setState(250);
						match(IDENTIFIER);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(253); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class ReadFromStdContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(CustomParser.READ, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CustomParser.IDENTIFIER, 0); }
		public ReadFromStdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readFromStd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterReadFromStd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitReadFromStd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitReadFromStd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadFromStdContext readFromStd() throws RecognitionException {
		ReadFromStdContext _localctx = new ReadFromStdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_readFromStd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(READ);
			setState(256);
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CustomParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CustomParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableDeclarators);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			variableDeclarator();
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(259);
					match(COMMA);
					setState(260);
					variableDeclarator();
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN_LEFT() { return getToken(CustomParser.ASSIGN_LEFT, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public TerminalNode ASSIGN_RIGHT() { return getToken(CustomParser.ASSIGN_RIGHT, 0); }
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variableDeclarator);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				variableDeclaratorId();
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_LEFT) {
					{
					setState(267);
					match(ASSIGN_LEFT);
					setState(268);
					variableInitializer();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(271);
				variableInitializer();
				setState(272);
				match(ASSIGN_RIGHT);
				}
				setState(274);
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CustomParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(CustomParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CustomParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CustomParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CustomParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(IDENTIFIER);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(279);
				match(LBRACK);
				setState(280);
				match(RBRACK);
				}
				}
				setState(285);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CustomParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CustomParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(LPAREN);
			setState(289);
			expression(0);
			setState(290);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CustomParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CustomParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			expression(0);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(293);
					match(COMMA);
					setState(294);
					expression(0);
					}
					} 
				}
				setState(299);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CustomParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CustomParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CustomParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CustomParser.SUB, 0); }
		public TerminalNode INC() { return getToken(CustomParser.INC, 0); }
		public TerminalNode DEC() { return getToken(CustomParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(CustomParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(CustomParser.BANG, 0); }
		public TerminalNode MUL() { return getToken(CustomParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CustomParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CustomParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(CustomParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CustomParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(CustomParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CustomParser.GT, i);
		}
		public TerminalNode LE() { return getToken(CustomParser.LE, 0); }
		public TerminalNode GE() { return getToken(CustomParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(CustomParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(CustomParser.NOTEQUAL, 0); }
		public TerminalNode BITAND() { return getToken(CustomParser.BITAND, 0); }
		public TerminalNode CARET() { return getToken(CustomParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(CustomParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(CustomParser.AND, 0); }
		public TerminalNode OR() { return getToken(CustomParser.OR, 0); }
		public TerminalNode COLON() { return getToken(CustomParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(CustomParser.QUESTION, 0); }
		public TerminalNode ASSIGN_LEFT() { return getToken(CustomParser.ASSIGN_LEFT, 0); }
		public TerminalNode ASSIGN_RIGHT() { return getToken(CustomParser.ASSIGN_RIGHT, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(CustomParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(CustomParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(CustomParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(CustomParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(CustomParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(CustomParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(CustomParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(CustomParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(CustomParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(CustomParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(CustomParser.MOD_ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(CustomParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CustomParser.IDENTIFIER, 0); }
		public TerminalNode LBRACK() { return getToken(CustomParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CustomParser.RBRACK, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(301);
				primary();
				}
				break;
			case 2:
				{
				setState(302);
				methodCall();
				}
				break;
			case 3:
				{
				setState(303);
				match(LPAREN);
				setState(304);
				type();
				setState(305);
				match(RPAREN);
				setState(306);
				expression(16);
				}
				break;
			case 4:
				{
				setState(308);
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
				setState(309);
				expression(14);
				}
				break;
			case 5:
				{
				setState(310);
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
				setState(311);
				expression(13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(374);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(314);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(315);
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
						setState(316);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(317);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(318);
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
						setState(319);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(320);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(328);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(321);
							match(LT);
							setState(322);
							match(LT);
							}
							break;
						case 2:
							{
							setState(323);
							match(GT);
							setState(324);
							match(GT);
							setState(325);
							match(GT);
							}
							break;
						case 3:
							{
							setState(326);
							match(GT);
							setState(327);
							match(GT);
							}
							break;
						}
						setState(330);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(331);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(332);
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
						setState(333);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(334);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(335);
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
						setState(336);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(337);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(338);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(339);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(340);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(341);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(342);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(343);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(344);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(345);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(346);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(347);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(348);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(349);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(350);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(351);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(352);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(353);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(354);
						expression(0);
						setState(355);
						match(COLON);
						setState(356);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(358);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(359);
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
						setState(360);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(361);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(362);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(365);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(363);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(364);
							methodCall();
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(367);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(368);
						match(LBRACK);
						setState(369);
						expression(0);
						setState(370);
						match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(372);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(373);
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
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CustomParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CustomParser.RPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CustomParser.IDENTIFIER, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_primary);
		try {
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(LPAREN);
				setState(380);
				expression(0);
				setState(381);
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
				setState(383);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CustomParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CustomParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CustomParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(IDENTIFIER);
			setState(388);
			match(LPAREN);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (DECIMAL_LITERAL - 22)) | (1L << (BINARY_LITERAL - 22)) | (1L << (FLOAT_LITERAL - 22)) | (1L << (BOOL_LITERAL - 22)) | (1L << (STRING_LITERAL - 22)) | (1L << (NULL_LITERAL - 22)) | (1L << (LPAREN - 22)) | (1L << (BANG - 22)) | (1L << (TILDE - 22)) | (1L << (INC - 22)) | (1L << (DEC - 22)) | (1L << (ADD - 22)) | (1L << (SUB - 22)) | (1L << (IDENTIFIER - 22)))) != 0)) {
				{
				setState(389);
				expressionList();
				}
			}

			setState(392);
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

	public static class TypeOrVoidContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CustomParser.VOID, 0); }
		public TypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeOrVoidContext typeOrVoid() throws RecognitionException {
		TypeOrVoidContext _localctx = new TypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeOrVoid);
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case BOOLEAN:
			case ANY:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(CustomParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CustomParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CustomParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CustomParser.RBRACK, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(398);
			primitiveType();
			}
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(399);
				match(LBRACK);
				setState(400);
				match(RBRACK);
				}
				}
				setState(405);
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
		public TerminalNode BOOLEAN() { return getToken(CustomParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(CustomParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CustomParser.FLOAT, 0); }
		public TerminalNode ANY() { return getToken(CustomParser.ANY, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CustomParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CustomParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(LPAREN);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << BOOLEAN) | (1L << ANY))) != 0)) {
				{
				setState(409);
				formalParameterList();
				}
			}

			setState(412);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CustomParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CustomParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				formalParameter();
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(415);
						match(COMMA);
						setState(416);
						formalParameter();
						}
						} 
					}
					setState(421);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(422);
					match(COMMA);
					setState(423);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				lastFormalParameter();
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			type();
			setState(430);
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

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(CustomParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lastFormalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			type();
			setState(433);
			match(ELLIPSIS);
			setState(434);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(CustomParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(CustomParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(CustomParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_literal);
		try {
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				floatLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(440);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(CustomParser.DECIMAL_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(CustomParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(CustomParser.FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 19);
		case 13:
			return precpred(_ctx, 18);
		case 14:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3L\u01c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\5\2M\n\2\3\2\3\2\3\3\7\3R\n\3\f"+
		"\3\16\3U\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\7\6e\n\6\f\6\16\6h\13\6\3\6\3\6\3\7\3\7\3\b\3\b\7\bp\n\b\f\b\16\bs\13"+
		"\b\3\b\3\b\3\t\3\t\5\ty\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u0080\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008b\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0093\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a8\n\13\f\13\16"+
		"\13\u00ab\13\13\3\13\7\13\u00ae\n\13\f\13\16\13\u00b1\13\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00b7\n\13\3\13\3\13\5\13\u00bb\n\13\3\13\3\13\5\13\u00bf"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c7\n\13\3\f\3\f\5\f\u00cb"+
		"\n\f\3\f\3\f\5\f\u00cf\n\f\3\f\3\f\5\f\u00d3\n\f\5\f\u00d5\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\5\16\u00de\n\16\3\17\6\17\u00e1\n\17\r\17\16\17"+
		"\u00e2\3\17\6\17\u00e6\n\17\r\17\16\17\u00e7\3\20\3\20\3\20\5\20\u00ed"+
		"\n\20\3\20\3\20\3\20\5\20\u00f2\n\20\3\21\3\21\3\21\7\21\u00f7\n\21\f"+
		"\21\16\21\u00fa\13\21\3\21\3\21\6\21\u00fe\n\21\r\21\16\21\u00ff\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\7\23\u0108\n\23\f\23\16\23\u010b\13\23\3\24"+
		"\3\24\3\24\5\24\u0110\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u0117\n\24\3"+
		"\25\3\25\3\25\7\25\u011c\n\25\f\25\16\25\u011f\13\25\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\7\30\u012a\n\30\f\30\16\30\u012d\13\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u013b"+
		"\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u014b\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0170\n\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0179\n\31\f\31\16\31\u017c\13"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0184\n\32\3\33\3\33\3\33\5\33"+
		"\u0189\n\33\3\33\3\33\3\34\3\34\5\34\u018f\n\34\3\35\3\35\3\35\7\35\u0194"+
		"\n\35\f\35\16\35\u0197\13\35\3\36\3\36\3\37\3\37\5\37\u019d\n\37\3\37"+
		"\3\37\3 \3 \3 \7 \u01a4\n \f \16 \u01a7\13 \3 \3 \5 \u01ab\n \3 \5 \u01ae"+
		"\n \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u01bc\n#\3$\3$\3%\3%\3"+
		"%\2\3\60&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFH\2\f\3\2\64\67\3\2*+\4\289==\3\2\66\67\4\2()/\60\4\2..\61\61"+
		"\4\2&\'>H\3\2\64\65\4\2\23\24\26\27\3\2\30\31\2\u01ec\2J\3\2\2\2\4S\3"+
		"\2\2\2\6X\3\2\2\2\b]\3\2\2\2\n_\3\2\2\2\fk\3\2\2\2\16m\3\2\2\2\20x\3\2"+
		"\2\2\22\u008a\3\2\2\2\24\u00c6\3\2\2\2\26\u00d4\3\2\2\2\30\u00d6\3\2\2"+
		"\2\32\u00dd\3\2\2\2\34\u00e0\3\2\2\2\36\u00f1\3\2\2\2 \u00f3\3\2\2\2\""+
		"\u0101\3\2\2\2$\u0104\3\2\2\2&\u0116\3\2\2\2(\u0118\3\2\2\2*\u0120\3\2"+
		"\2\2,\u0122\3\2\2\2.\u0126\3\2\2\2\60\u013a\3\2\2\2\62\u0183\3\2\2\2\64"+
		"\u0185\3\2\2\2\66\u018e\3\2\2\28\u0190\3\2\2\2:\u0198\3\2\2\2<\u019a\3"+
		"\2\2\2>\u01ad\3\2\2\2@\u01af\3\2\2\2B\u01b2\3\2\2\2D\u01bb\3\2\2\2F\u01bd"+
		"\3\2\2\2H\u01bf\3\2\2\2JL\7 \2\2KM\5\4\3\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2"+
		"\2NO\7!\2\2O\3\3\2\2\2PR\5\b\5\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2"+
		"\2TV\3\2\2\2US\3\2\2\2VW\5\6\4\2W\5\3\2\2\2XY\7\21\2\2YZ\7\36\2\2Z[\7"+
		"\37\2\2[\\\5\f\7\2\\\7\3\2\2\2]^\5\n\6\2^\t\3\2\2\2_`\5\66\34\2`a\7L\2"+
		"\2af\5<\37\2bc\7\"\2\2ce\7#\2\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2"+
		"\2gi\3\2\2\2hf\3\2\2\2ij\5\f\7\2j\13\3\2\2\2kl\5\16\b\2l\r\3\2\2\2mq\7"+
		" \2\2np\5\20\t\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3"+
		"\2\2\2tu\7!\2\2u\17\3\2\2\2vy\5\22\n\2wy\5\24\13\2xv\3\2\2\2xw\3\2\2\2"+
		"y\21\3\2\2\2z{\5(\25\2{|\7-\2\2|\177\58\35\2}~\7&\2\2~\u0080\5*\26\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\u008b\3\2\2\2\u0081\u0082\5*\26\2\u0082"+
		"\u0083\7\'\2\2\u0083\u0084\5(\25\2\u0084\u0085\7-\2\2\u0085\u0086\58\35"+
		"\2\u0086\u008b\3\2\2\2\u0087\u0088\58\35\2\u0088\u0089\5$\23\2\u0089\u008b"+
		"\3\2\2\2\u008az\3\2\2\2\u008a\u0081\3\2\2\2\u008a\u0087\3\2\2\2\u008b"+
		"\23\3\2\2\2\u008c\u00c7\5\16\b\2\u008d\u008e\7\b\2\2\u008e\u008f\5,\27"+
		"\2\u008f\u0092\5\24\13\2\u0090\u0091\7\t\2\2\u0091\u0093\5\24\13\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u00c7\3\2\2\2\u0094\u0095\7\4"+
		"\2\2\u0095\u0096\7\36\2\2\u0096\u0097\5\26\f\2\u0097\u0098\7\37\2\2\u0098"+
		"\u0099\5\24\13\2\u0099\u00c7\3\2\2\2\u009a\u009b\7\7\2\2\u009b\u009c\5"+
		",\27\2\u009c\u009d\5\24\13\2\u009d\u00c7\3\2\2\2\u009e\u009f\7\6\2\2\u009f"+
		"\u00a0\5\24\13\2\u00a0\u00a1\7\7\2\2\u00a1\u00a2\5,\27\2\u00a2\u00c7\3"+
		"\2\2\2\u00a3\u00a4\7\n\2\2\u00a4\u00a5\5,\27\2\u00a5\u00a9\7 \2\2\u00a6"+
		"\u00a8\5\34\17\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3"+
		"\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00af\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ae\5\36\20\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3"+
		"\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b3\7!\2\2\u00b3\u00c7\3\2\2\2\u00b4\u00b6\7\22\2\2\u00b5\u00b7\5\60"+
		"\31\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00c7\3\2\2\2\u00b8"+
		"\u00ba\7\r\2\2\u00b9\u00bb\7L\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00c7\3\2\2\2\u00bc\u00be\7\f\2\2\u00bd\u00bf\7L\2\2\u00be"+
		"\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c7\3\2\2\2\u00c0\u00c7\5 "+
		"\21\2\u00c1\u00c7\5\"\22\2\u00c2\u00c7\5\60\31\2\u00c3\u00c4\7L\2\2\u00c4"+
		"\u00c5\7-\2\2\u00c5\u00c7\5\24\13\2\u00c6\u008c\3\2\2\2\u00c6\u008d\3"+
		"\2\2\2\u00c6\u0094\3\2\2\2\u00c6\u009a\3\2\2\2\u00c6\u009e\3\2\2\2\u00c6"+
		"\u00a3\3\2\2\2\u00c6\u00b4\3\2\2\2\u00c6\u00b8\3\2\2\2\u00c6\u00bc\3\2"+
		"\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c6"+
		"\u00c3\3\2\2\2\u00c7\25\3\2\2\2\u00c8\u00d5\5\30\r\2\u00c9\u00cb\5\32"+
		"\16\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00ce\7$\2\2\u00cd\u00cf\5\60\31\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\7$\2\2\u00d1\u00d3\5.\30\2\u00d2"+
		"\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00c8\3\2"+
		"\2\2\u00d4\u00ca\3\2\2\2\u00d5\27\3\2\2\2\u00d6\u00d7\58\35\2\u00d7\u00d8"+
		"\5(\25\2\u00d8\u00d9\7\5\2\2\u00d9\u00da\5\60\31\2\u00da\31\3\2\2\2\u00db"+
		"\u00de\5\22\n\2\u00dc\u00de\5.\30\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3"+
		"\2\2\2\u00de\33\3\2\2\2\u00df\u00e1\5\36\20\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2"+
		"\2\2\u00e4\u00e6\5\20\t\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\35\3\2\2\2\u00e9\u00ec\7\13\2"+
		"\2\u00ea\u00ed\5\60\31\2\u00eb\u00ed\7L\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f2\7-\2\2\u00ef\u00f0\7\16"+
		"\2\2\u00f0\u00f2\7-\2\2\u00f1\u00e9\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\37\3\2\2\2\u00f3\u00f8\7\17\2\2\u00f4\u00f7\5\60\31\2\u00f5\u00f7\7L"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fd\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fe\5\60\31\2\u00fc\u00fe\7L\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100!\3\2\2\2\u0101\u0102\7\20\2\2\u0102\u0103\7L\2\2\u0103#\3\2"+
		"\2\2\u0104\u0109\5&\24\2\u0105\u0106\7$\2\2\u0106\u0108\5&\24\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a%\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010f\5(\25\2\u010d\u010e"+
		"\7&\2\2\u010e\u0110\5*\26\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0117\3\2\2\2\u0111\u0112\5*\26\2\u0112\u0113\7\'\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0115\5(\25\2\u0115\u0117\3\2\2\2\u0116\u010c\3\2\2\2\u0116"+
		"\u0111\3\2\2\2\u0117\'\3\2\2\2\u0118\u011d\7L\2\2\u0119\u011a\7\"\2\2"+
		"\u011a\u011c\7#\2\2\u011b\u0119\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e)\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0121\5\60\31\2\u0121+\3\2\2\2\u0122\u0123\7\36\2\2\u0123\u0124\5\60"+
		"\31\2\u0124\u0125\7\37\2\2\u0125-\3\2\2\2\u0126\u012b\5\60\31\2\u0127"+
		"\u0128\7$\2\2\u0128\u012a\5\60\31\2\u0129\u0127\3\2\2\2\u012a\u012d\3"+
		"\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c/\3\2\2\2\u012d\u012b"+
		"\3\2\2\2\u012e\u012f\b\31\1\2\u012f\u013b\5\62\32\2\u0130\u013b\5\64\33"+
		"\2\u0131\u0132\7\36\2\2\u0132\u0133\58\35\2\u0133\u0134\7\37\2\2\u0134"+
		"\u0135\5\60\31\22\u0135\u013b\3\2\2\2\u0136\u0137\t\2\2\2\u0137\u013b"+
		"\5\60\31\20\u0138\u0139\t\3\2\2\u0139\u013b\5\60\31\17\u013a\u012e\3\2"+
		"\2\2\u013a\u0130\3\2\2\2\u013a\u0131\3\2\2\2\u013a\u0136\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013b\u017a\3\2\2\2\u013c\u013d\f\16\2\2\u013d\u013e\t"+
		"\4\2\2\u013e\u0179\5\60\31\17\u013f\u0140\f\r\2\2\u0140\u0141\t\5\2\2"+
		"\u0141\u0179\5\60\31\16\u0142\u014a\f\f\2\2\u0143\u0144\7)\2\2\u0144\u014b"+
		"\7)\2\2\u0145\u0146\7(\2\2\u0146\u0147\7(\2\2\u0147\u014b\7(\2\2\u0148"+
		"\u0149\7(\2\2\u0149\u014b\7(\2\2\u014a\u0143\3\2\2\2\u014a\u0145\3\2\2"+
		"\2\u014a\u0148\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0179\5\60\31\r\u014d"+
		"\u014e\f\13\2\2\u014e\u014f\t\6\2\2\u014f\u0179\5\60\31\f\u0150\u0151"+
		"\f\n\2\2\u0151\u0152\t\7\2\2\u0152\u0179\5\60\31\13\u0153\u0154\f\t\2"+
		"\2\u0154\u0155\7:\2\2\u0155\u0179\5\60\31\n\u0156\u0157\f\b\2\2\u0157"+
		"\u0158\7<\2\2\u0158\u0179\5\60\31\t\u0159\u015a\f\7\2\2\u015a\u015b\7"+
		";\2\2\u015b\u0179\5\60\31\b\u015c\u015d\f\6\2\2\u015d\u015e\7\62\2\2\u015e"+
		"\u0179\5\60\31\7\u015f\u0160\f\5\2\2\u0160\u0161\7\63\2\2\u0161\u0179"+
		"\5\60\31\6\u0162\u0163\f\4\2\2\u0163\u0164\7,\2\2\u0164\u0165\5\60\31"+
		"\2\u0165\u0166\7-\2\2\u0166\u0167\5\60\31\5\u0167\u0179\3\2\2\2\u0168"+
		"\u0169\f\3\2\2\u0169\u016a\t\b\2\2\u016a\u0179\5\60\31\3\u016b\u016c\f"+
		"\25\2\2\u016c\u016f\7%\2\2\u016d\u0170\7L\2\2\u016e\u0170\5\64\33\2\u016f"+
		"\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\u0179\3\2\2\2\u0171\u0172\f\24"+
		"\2\2\u0172\u0173\7\"\2\2\u0173\u0174\5\60\31\2\u0174\u0175\7#\2\2\u0175"+
		"\u0179\3\2\2\2\u0176\u0177\f\21\2\2\u0177\u0179\t\t\2\2\u0178\u013c\3"+
		"\2\2\2\u0178\u013f\3\2\2\2\u0178\u0142\3\2\2\2\u0178\u014d\3\2\2\2\u0178"+
		"\u0150\3\2\2\2\u0178\u0153\3\2\2\2\u0178\u0156\3\2\2\2\u0178\u0159\3\2"+
		"\2\2\u0178\u015c\3\2\2\2\u0178\u015f\3\2\2\2\u0178\u0162\3\2\2\2\u0178"+
		"\u0168\3\2\2\2\u0178\u016b\3\2\2\2\u0178\u0171\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\61\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7\36\2\2\u017e\u017f\5\60"+
		"\31\2\u017f\u0180\7\37\2\2\u0180\u0184\3\2\2\2\u0181\u0184\5D#\2\u0182"+
		"\u0184\7L\2\2\u0183\u017d\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0182\3\2"+
		"\2\2\u0184\63\3\2\2\2\u0185\u0186\7L\2\2\u0186\u0188\7\36\2\2\u0187\u0189"+
		"\5.\30\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\7\37\2\2\u018b\65\3\2\2\2\u018c\u018f\58\35\2\u018d\u018f\7\25"+
		"\2\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f\67\3\2\2\2\u0190\u0195"+
		"\5:\36\2\u0191\u0192\7\"\2\2\u0192\u0194\7#\2\2\u0193\u0191\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u01969\3\2\2\2"+
		"\u0197\u0195\3\2\2\2\u0198\u0199\t\n\2\2\u0199;\3\2\2\2\u019a\u019c\7"+
		"\36\2\2\u019b\u019d\5> \2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u019f\7\37\2\2\u019f=\3\2\2\2\u01a0\u01a5\5@!\2\u01a1"+
		"\u01a2\7$\2\2\u01a2\u01a4\5@!\2\u01a3\u01a1\3\2\2\2\u01a4\u01a7\3\2\2"+
		"\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01aa\3\2\2\2\u01a7\u01a5"+
		"\3\2\2\2\u01a8\u01a9\7$\2\2\u01a9\u01ab\5B\"\2\u01aa\u01a8\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01ae\5B\"\2\u01ad\u01a0\3\2"+
		"\2\2\u01ad\u01ac\3\2\2\2\u01ae?\3\2\2\2\u01af\u01b0\58\35\2\u01b0\u01b1"+
		"\5(\25\2\u01b1A\3\2\2\2\u01b2\u01b3\58\35\2\u01b3\u01b4\7I\2\2\u01b4\u01b5"+
		"\5(\25\2\u01b5C\3\2\2\2\u01b6\u01bc\5F$\2\u01b7\u01bc\5H%\2\u01b8\u01bc"+
		"\7\34\2\2\u01b9\u01bc\7\33\2\2\u01ba\u01bc\7\35\2\2\u01bb\u01b6\3\2\2"+
		"\2\u01bb\u01b7\3\2\2\2\u01bb\u01b8\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba"+
		"\3\2\2\2\u01bcE\3\2\2\2\u01bd\u01be\t\13\2\2\u01beG\3\2\2\2\u01bf\u01c0"+
		"\7\32\2\2\u01c0I\3\2\2\2\60LSfqx\177\u008a\u0092\u00a9\u00af\u00b6\u00ba"+
		"\u00be\u00c6\u00ca\u00ce\u00d2\u00d4\u00dd\u00e2\u00e7\u00ec\u00f1\u00f6"+
		"\u00f8\u00fd\u00ff\u0109\u010f\u0116\u011d\u012b\u013a\u014a\u016f\u0178"+
		"\u017a\u0183\u0188\u018e\u0195\u019c\u01a5\u01aa\u01ad\u01bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}