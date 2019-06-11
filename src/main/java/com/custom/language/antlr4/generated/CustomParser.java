// Generated from CustomParser.g4 by ANTLR 4.7.2
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
	public static final int
		RULE_compilationUnit = 0, RULE_fileContent = 1, RULE_mainDeclaration = 2, 
		RULE_methodDeclaration = 3, RULE_methodBody = 4, RULE_block = 5, RULE_blockStatement = 6, 
		RULE_localVariableDeclaration = 7, RULE_statement = 8, RULE_switchBlockStatementGroup = 9, 
		RULE_switchLabel = 10, RULE_variableDeclarators = 11, RULE_variableDeclarator = 12, 
		RULE_variableInitializer = 13, RULE_parExpression = 14, RULE_expressionList = 15, 
		RULE_expression = 16, RULE_primary = 17, RULE_typeOrVoid = 18, RULE_type = 19, 
		RULE_formalParameters = 20, RULE_formalParameterList = 21, RULE_formalParameter = 22, 
		RULE_literal = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "fileContent", "mainDeclaration", "methodDeclaration", 
			"methodBody", "block", "blockStatement", "localVariableDeclaration", 
			"statement", "switchBlockStatementGroup", "switchLabel", "variableDeclarators", 
			"variableDeclarator", "variableInitializer", "parExpression", "expressionList", 
			"expression", "primary", "typeOrVoid", "type", "formalParameters", "formalParameterList", 
			"formalParameter", "literal"
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
			"'...'", null, null, "'//'"
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
			setState(48);
			match(LBRACE);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIN) | (1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << BOOLEAN) | (1L << ANY))) != 0)) {
				{
				setState(49);
				fileContent();
				}
			}

			setState(52);
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
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << BOOLEAN) | (1L << ANY))) != 0)) {
				{
				{
				setState(54);
				methodDeclaration();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
			setState(62);
			match(MAIN);
			setState(63);
			match(LPAREN);
			setState(64);
			match(RPAREN);
			setState(65);
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

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			typeOrVoid();
			setState(68);
			match(IDENTIFIER);
			setState(69);
			formalParameters();
			setState(70);
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
		enterRule(_localctx, 8, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
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
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(LBRACE);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOREACH) | (1L << DO) | (1L << WHILE) | (1L << IF) | (1L << SWITCH) | (1L << WRITE) | (1L << WRITELINE) | (1L << READ) | (1L << RETURN) | (1L << FLOAT) | (1L << INT) | (1L << BOOLEAN) | (1L << ANY) | (1L << DECIMAL_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE))) != 0) || _la==SINGLE_COMMENT || _la==IDENTIFIER) {
				{
				{
				setState(75);
				blockStatement();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
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
		enterRule(_localctx, 12, RULE_blockStatement);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
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
		public TerminalNode IDENTIFIER() { return getToken(CustomParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 14, RULE_localVariableDeclaration);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(IDENTIFIER);
				setState(88);
				match(COLON);
				setState(89);
				type();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_LEFT) {
					{
					setState(90);
					match(ASSIGN_LEFT);
					setState(91);
					variableInitializer();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(IDENTIFIER);
				setState(95);
				match(ASSIGN_LEFT);
				setState(96);
				variableInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				variableInitializer();
				setState(98);
				match(ASSIGN_RIGHT);
				setState(99);
				match(IDENTIFIER);
				setState(100);
				match(COLON);
				setState(101);
				type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				type();
				setState(104);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForControlContext extends StatementContext {
		public TerminalNode FOREACH() { return getToken(CustomParser.FOREACH, 0); }
		public TerminalNode LPAREN() { return getToken(CustomParser.LPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CustomParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CustomParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CustomParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForControlContext(StatementContext ctx) { copyFrom(ctx); }
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
	public static class WriteToStdContext extends StatementContext {
		public TerminalNode WRITE() { return getToken(CustomParser.WRITE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WriteToStdContext(StatementContext ctx) { copyFrom(ctx); }
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
	public static class ReadFromStdContext extends StatementContext {
		public TerminalNode READ() { return getToken(CustomParser.READ, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CustomParser.IDENTIFIER, 0); }
		public ReadFromStdContext(StatementContext ctx) { copyFrom(ctx); }
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
	public static class IfElseStatementContext extends StatementContext {
		public TerminalNode IF() { return getToken(CustomParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(CustomParser.LPAREN, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CustomParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CustomParser.ELSE, 0); }
		public IfElseStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitIfElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileControlContext extends StatementContext {
		public TerminalNode DO() { return getToken(CustomParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CustomParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(CustomParser.LPAREN, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CustomParser.RPAREN, 0); }
		public DoWhileControlContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterDoWhileControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitDoWhileControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitDoWhileControl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentContext extends StatementContext {
		public TerminalNode SINGLE_COMMENT() { return getToken(CustomParser.SINGLE_COMMENT, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CommentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(CustomParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchControlContext extends StatementContext {
		public TerminalNode SWITCH() { return getToken(CustomParser.SWITCH, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
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
		public SwitchControlContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterSwitchControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitSwitchControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitSwitchControl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteNewLineToStdContext extends StatementContext {
		public TerminalNode WRITELINE() { return getToken(CustomParser.WRITELINE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WriteNewLineToStdContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterWriteNewLineToStd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitWriteNewLineToStd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitWriteNewLineToStd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileControlContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(CustomParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(CustomParser.LPAREN, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CustomParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileControlContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterWhileControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitWhileControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitWhileControl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallContext extends StatementContext {
		public TerminalNode IDENTIFIER() { return getToken(CustomParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CustomParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CustomParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MethodCallContext(StatementContext ctx) { copyFrom(ctx); }
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

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(IF);
				setState(109);
				match(LPAREN);
				setState(110);
				parExpression();
				setState(111);
				match(RPAREN);
				setState(112);
				statement();
				setState(115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(113);
					match(ELSE);
					setState(114);
					statement();
					}
					break;
				}
				}
				break;
			case FOREACH:
				_localctx = new ForControlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(FOREACH);
				setState(118);
				match(LPAREN);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (FLOAT - 18)) | (1L << (INT - 18)) | (1L << (BOOLEAN - 18)) | (1L << (ANY - 18)) | (1L << (DECIMAL_LITERAL - 18)) | (1L << (BINARY_LITERAL - 18)) | (1L << (FLOAT_LITERAL - 18)) | (1L << (BOOL_LITERAL - 18)) | (1L << (STRING_LITERAL - 18)) | (1L << (NULL_LITERAL - 18)) | (1L << (LPAREN - 18)) | (1L << (BANG - 18)) | (1L << (TILDE - 18)) | (1L << (IDENTIFIER - 18)))) != 0)) {
					{
					setState(119);
					localVariableDeclaration();
					}
				}

				setState(122);
				match(COMMA);
				setState(123);
				expression(0);
				setState(124);
				match(COMMA);
				setState(125);
				expression(0);
				setState(126);
				match(RPAREN);
				setState(127);
				block();
				}
				break;
			case WHILE:
				_localctx = new WhileControlContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(WHILE);
				setState(130);
				match(LPAREN);
				setState(131);
				parExpression();
				setState(132);
				match(RPAREN);
				setState(133);
				block();
				}
				break;
			case DO:
				_localctx = new DoWhileControlContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(DO);
				setState(136);
				block();
				setState(137);
				match(WHILE);
				setState(138);
				match(LPAREN);
				setState(139);
				parExpression();
				setState(140);
				match(RPAREN);
				}
				break;
			case SWITCH:
				_localctx = new SwitchControlContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				match(SWITCH);
				setState(143);
				parExpression();
				setState(144);
				match(LBRACE);
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(145);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(150);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(151);
					switchLabel();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(RBRACE);
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				match(RETURN);
				setState(161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(160);
					expression(0);
					}
					break;
				}
				}
				break;
			case WRITE:
				_localctx = new WriteToStdContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(163);
				match(WRITE);
				setState(164);
				expression(0);
				}
				break;
			case WRITELINE:
				_localctx = new WriteNewLineToStdContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(165);
				match(WRITELINE);
				setState(166);
				expression(0);
				}
				break;
			case READ:
				_localctx = new ReadFromStdContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(167);
				match(READ);
				setState(168);
				match(IDENTIFIER);
				}
				break;
			case SINGLE_COMMENT:
				_localctx = new CommentContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(169);
				match(SINGLE_COMMENT);
				setState(170);
				literal();
				}
				break;
			case IDENTIFIER:
				_localctx = new MethodCallContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(171);
				match(IDENTIFIER);
				setState(172);
				match(LPAREN);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (DECIMAL_LITERAL - 23)) | (1L << (BINARY_LITERAL - 23)) | (1L << (FLOAT_LITERAL - 23)) | (1L << (BOOL_LITERAL - 23)) | (1L << (STRING_LITERAL - 23)) | (1L << (NULL_LITERAL - 23)) | (1L << (LPAREN - 23)) | (1L << (BANG - 23)) | (1L << (TILDE - 23)) | (1L << (IDENTIFIER - 23)))) != 0)) {
					{
					setState(173);
					expressionList();
					}
				}

				setState(176);
				match(RPAREN);
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
		enterRule(_localctx, 18, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(179);
				switchLabel();
				}
				}
				setState(182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				blockStatement();
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOREACH) | (1L << DO) | (1L << WHILE) | (1L << IF) | (1L << SWITCH) | (1L << WRITE) | (1L << WRITELINE) | (1L << READ) | (1L << RETURN) | (1L << FLOAT) | (1L << INT) | (1L << BOOLEAN) | (1L << ANY) | (1L << DECIMAL_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE))) != 0) || _la==SINGLE_COMMENT || _la==IDENTIFIER );
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
		enterRule(_localctx, 20, RULE_switchLabel);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(CASE);
				setState(192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(190);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(191);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(194);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(DEFAULT);
				setState(196);
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CustomParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CustomParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CustomParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CustomParser.COMMA, i);
		}
		public TerminalNode ASSIGN_LEFT() { return getToken(CustomParser.ASSIGN_LEFT, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
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
		enterRule(_localctx, 22, RULE_variableDeclarators);
		int _la;
		try {
			int _alt;
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				variableDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(IDENTIFIER);
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(201);
						match(COMMA);
						setState(202);
						match(IDENTIFIER);
						}
						} 
					}
					setState(207);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_LEFT) {
					{
					setState(208);
					match(ASSIGN_LEFT);
					setState(209);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CustomParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 24, RULE_variableDeclarator);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(IDENTIFIER);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_LEFT) {
					{
					setState(215);
					match(ASSIGN_LEFT);
					setState(216);
					variableInitializer();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(219);
				variableInitializer();
				setState(220);
				match(ASSIGN_RIGHT);
				}
				setState(222);
				match(IDENTIFIER);
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
		enterRule(_localctx, 26, RULE_variableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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
		enterRule(_localctx, 28, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(LPAREN);
			setState(229);
			expression(0);
			setState(230);
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
		enterRule(_localctx, 30, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			expression(0);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(233);
				match(COMMA);
				setState(234);
				expression(0);
				}
				}
				setState(239);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionCompareContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LE() { return getToken(CustomParser.LE, 0); }
		public TerminalNode GE() { return getToken(CustomParser.GE, 0); }
		public TerminalNode GT() { return getToken(CustomParser.GT, 0); }
		public TerminalNode LT() { return getToken(CustomParser.LT, 0); }
		public ExpressionCompareContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterExpressionCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitExpressionCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitExpressionCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionNegateContext extends ExpressionContext {
		public Token prefix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(CustomParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(CustomParser.BANG, 0); }
		public ExpressionNegateContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterExpressionNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitExpressionNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitExpressionNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionTernaryConditionalContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(CustomParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(CustomParser.QUESTION, 0); }
		public ExpressionTernaryConditionalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterExpressionTernaryConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitExpressionTernaryConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitExpressionTernaryConditional(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionAssignContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD_ASSIGN() { return getToken(CustomParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(CustomParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(CustomParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(CustomParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(CustomParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(CustomParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(CustomParser.XOR_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(CustomParser.MOD_ASSIGN, 0); }
		public ExpressionAssignContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterExpressionAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitExpressionAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitExpressionAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionMulDivModExpressionContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CustomParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CustomParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CustomParser.MOD, 0); }
		public ExpressionMulDivModExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterExpressionMulDivModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitExpressionMulDivModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitExpressionMulDivModExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionEqualContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(CustomParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(CustomParser.NOTEQUAL, 0); }
		public ExpressionEqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterExpressionEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitExpressionEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitExpressionEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionPrimaryContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionPrimaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterExpressionPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitExpressionPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitExpressionPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionAddSubExpressionContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CustomParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CustomParser.SUB, 0); }
		public ExpressionAddSubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterExpressionAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitExpressionAddSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitExpressionAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionAndContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(CustomParser.AND, 0); }
		public ExpressionAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitExpressionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitExpressionAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionOrContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(CustomParser.OR, 0); }
		public ExpressionOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitExpressionOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitExpressionOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionIncDecContext extends ExpressionContext {
		public Token postfix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(CustomParser.INC, 0); }
		public TerminalNode DEC() { return getToken(CustomParser.DEC, 0); }
		public ExpressionIncDecContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterExpressionIncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitExpressionIncDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitExpressionIncDec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionMethodCallContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(CustomParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CustomParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CustomParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionMethodCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterExpressionMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitExpressionMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitExpressionMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionCarretContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CARET() { return getToken(CustomParser.CARET, 0); }
		public ExpressionCarretContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterExpressionCarret(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitExpressionCarret(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitExpressionCarret(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionPrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(241);
				primary();
				}
				break;
			case 2:
				{
				_localctx = new ExpressionMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				match(IDENTIFIER);
				setState(243);
				match(LPAREN);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (DECIMAL_LITERAL - 23)) | (1L << (BINARY_LITERAL - 23)) | (1L << (FLOAT_LITERAL - 23)) | (1L << (BOOL_LITERAL - 23)) | (1L << (STRING_LITERAL - 23)) | (1L << (NULL_LITERAL - 23)) | (1L << (LPAREN - 23)) | (1L << (BANG - 23)) | (1L << (TILDE - 23)) | (1L << (IDENTIFIER - 23)))) != 0)) {
					{
					setState(244);
					expressionList();
					}
				}

				setState(247);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new ExpressionNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				((ExpressionNegateContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionNegateContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(249);
				expression(10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(284);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionMulDivModExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(252);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(253);
						((ExpressionMulDivModExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExpressionMulDivModExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(254);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionAddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(255);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(256);
						((ExpressionAddSubExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionAddSubExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(257);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionCompareContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(258);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(259);
						((ExpressionCompareContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
							((ExpressionCompareContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(260);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionEqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(261);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(262);
						((ExpressionEqualContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionEqualContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(263);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionCarretContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(264);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(265);
						((ExpressionCarretContext)_localctx).bop = match(CARET);
						setState(266);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(267);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(268);
						((ExpressionAndContext)_localctx).bop = match(AND);
						setState(269);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(270);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(271);
						((ExpressionOrContext)_localctx).bop = match(OR);
						setState(272);
						expression(4);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionTernaryConditionalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(274);
						((ExpressionTernaryConditionalContext)_localctx).bop = match(QUESTION);
						setState(275);
						expression(0);
						setState(276);
						match(COLON);
						setState(277);
						expression(3);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionAssignContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(279);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(280);
						((ExpressionAssignContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (ADD_ASSIGN - 61)) | (1L << (SUB_ASSIGN - 61)) | (1L << (MUL_ASSIGN - 61)) | (1L << (DIV_ASSIGN - 61)) | (1L << (AND_ASSIGN - 61)) | (1L << (OR_ASSIGN - 61)) | (1L << (XOR_ASSIGN - 61)) | (1L << (MOD_ASSIGN - 61)))) != 0)) ) {
							((ExpressionAssignContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(281);
						expression(2);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionIncDecContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(282);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(283);
						((ExpressionIncDecContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionIncDecContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
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
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 34, RULE_primary);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(LPAREN);
				setState(290);
				expression(0);
				setState(291);
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
				setState(293);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
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
		enterRule(_localctx, 36, RULE_typeOrVoid);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case BOOLEAN:
			case ANY:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
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
		public TerminalNode BOOLEAN() { return getToken(CustomParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(CustomParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CustomParser.FLOAT, 0); }
		public TerminalNode ANY() { return getToken(CustomParser.ANY, 0); }
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
		enterRule(_localctx, 38, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
		enterRule(_localctx, 40, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(LPAREN);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << BOOLEAN) | (1L << ANY))) != 0)) {
				{
				setState(304);
				formalParameterList();
				}
			}

			setState(307);
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
		enterRule(_localctx, 42, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			formalParameter();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(310);
				match(COMMA);
				setState(311);
				formalParameter();
				}
				}
				setState(316);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CustomParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 44, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			type();
			setState(318);
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryLiteralContext extends LiteralContext {
		public TerminalNode BINARY_LITERAL() { return getToken(CustomParser.BINARY_LITERAL, 0); }
		public BinaryLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterBinaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitBinaryLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitBinaryLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecimalLiteralContext extends LiteralContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(CustomParser.DECIMAL_LITERAL, 0); }
		public DecimalLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralContext extends LiteralContext {
		public TerminalNode NULL_LITERAL() { return getToken(CustomParser.NULL_LITERAL, 0); }
		public NullLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode STRING_LITERAL() { return getToken(CustomParser.STRING_LITERAL, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends LiteralContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(CustomParser.FLOAT_LITERAL, 0); }
		public FloatLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
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
	public static class BoolLiteralContext extends LiteralContext {
		public TerminalNode BOOL_LITERAL() { return getToken(CustomParser.BOOL_LITERAL, 0); }
		public BoolLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomParserListener ) ((CustomParserListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomParserVisitor ) return ((CustomParserVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_literal);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(DECIMAL_LITERAL);
				}
				break;
			case BINARY_LITERAL:
				_localctx = new BinaryLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(BINARY_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				match(FLOAT_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				_localctx = new BoolLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(324);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(325);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
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
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u014b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\5\2\65\n\2\3\2\3\2\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\7\7O\n\7\f\7\16\7R"+
		"\13\7\3\7\3\7\3\b\3\b\5\bX\n\b\3\t\3\t\3\t\3\t\3\t\5\t_\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tm\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\nv\n\n\3\n\3\n\3\n\5\n{\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0095"+
		"\n\n\f\n\16\n\u0098\13\n\3\n\7\n\u009b\n\n\f\n\16\n\u009e\13\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00a4\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00b1\n\n\3\n\5\n\u00b4\n\n\3\13\6\13\u00b7\n\13\r\13\16\13\u00b8\3\13"+
		"\6\13\u00bc\n\13\r\13\16\13\u00bd\3\f\3\f\3\f\5\f\u00c3\n\f\3\f\3\f\3"+
		"\f\5\f\u00c8\n\f\3\r\3\r\3\r\3\r\7\r\u00ce\n\r\f\r\16\r\u00d1\13\r\3\r"+
		"\3\r\5\r\u00d5\n\r\5\r\u00d7\n\r\3\16\3\16\3\16\5\16\u00dc\n\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00e3\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\7\21\u00ee\n\21\f\21\16\21\u00f1\13\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00f8\n\22\3\22\3\22\3\22\5\22\u00fd\n\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\7\22\u011f\n\22\f\22\16\22\u0122\13\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\5\23\u012a\n\23\3\24\3\24\5\24\u012e\n\24\3\25\3\25\3\26\3\26\5\26"+
		"\u0134\n\26\3\26\3\26\3\27\3\27\3\27\7\27\u013b\n\27\f\27\16\27\u013e"+
		"\13\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0149\n\31\3"+
		"\31\2\3\"\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\n\3"+
		"\2+,\4\29:>>\3\2\678\4\2)*\60\61\4\2//\62\62\3\2?F\3\2\65\66\4\2\24\25"+
		"\27\30\2\u016b\2\62\3\2\2\2\4;\3\2\2\2\6@\3\2\2\2\bE\3\2\2\2\nJ\3\2\2"+
		"\2\fL\3\2\2\2\16W\3\2\2\2\20l\3\2\2\2\22\u00b3\3\2\2\2\24\u00b6\3\2\2"+
		"\2\26\u00c7\3\2\2\2\30\u00d6\3\2\2\2\32\u00e2\3\2\2\2\34\u00e4\3\2\2\2"+
		"\36\u00e6\3\2\2\2 \u00ea\3\2\2\2\"\u00fc\3\2\2\2$\u0129\3\2\2\2&\u012d"+
		"\3\2\2\2(\u012f\3\2\2\2*\u0131\3\2\2\2,\u0137\3\2\2\2.\u013f\3\2\2\2\60"+
		"\u0148\3\2\2\2\62\64\7!\2\2\63\65\5\4\3\2\64\63\3\2\2\2\64\65\3\2\2\2"+
		"\65\66\3\2\2\2\66\67\7\"\2\2\67\3\3\2\2\28:\5\b\5\298\3\2\2\2:=\3\2\2"+
		"\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\5\6\4\2?\5\3\2\2\2@A\7\22"+
		"\2\2AB\7\37\2\2BC\7 \2\2CD\5\n\6\2D\7\3\2\2\2EF\5&\24\2FG\7K\2\2GH\5*"+
		"\26\2HI\5\n\6\2I\t\3\2\2\2JK\5\f\7\2K\13\3\2\2\2LP\7!\2\2MO\5\16\b\2N"+
		"M\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\"\2\2"+
		"T\r\3\2\2\2UX\5\20\t\2VX\5\22\n\2WU\3\2\2\2WV\3\2\2\2X\17\3\2\2\2YZ\7"+
		"K\2\2Z[\7.\2\2[^\5(\25\2\\]\7\'\2\2]_\5\34\17\2^\\\3\2\2\2^_\3\2\2\2_"+
		"m\3\2\2\2`a\7K\2\2ab\7\'\2\2bm\5\34\17\2cd\5\34\17\2de\7(\2\2ef\7K\2\2"+
		"fg\7.\2\2gh\5(\25\2hm\3\2\2\2ij\5(\25\2jk\5\30\r\2km\3\2\2\2lY\3\2\2\2"+
		"l`\3\2\2\2lc\3\2\2\2li\3\2\2\2m\21\3\2\2\2no\7\b\2\2op\7\37\2\2pq\5\36"+
		"\20\2qr\7 \2\2ru\5\22\n\2st\7\t\2\2tv\5\22\n\2us\3\2\2\2uv\3\2\2\2v\u00b4"+
		"\3\2\2\2wx\7\4\2\2xz\7\37\2\2y{\5\20\t\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2"+
		"|}\7%\2\2}~\5\"\22\2~\177\7%\2\2\177\u0080\5\"\22\2\u0080\u0081\7 \2\2"+
		"\u0081\u0082\5\f\7\2\u0082\u00b4\3\2\2\2\u0083\u0084\7\7\2\2\u0084\u0085"+
		"\7\37\2\2\u0085\u0086\5\36\20\2\u0086\u0087\7 \2\2\u0087\u0088\5\f\7\2"+
		"\u0088\u00b4\3\2\2\2\u0089\u008a\7\6\2\2\u008a\u008b\5\f\7\2\u008b\u008c"+
		"\7\7\2\2\u008c\u008d\7\37\2\2\u008d\u008e\5\36\20\2\u008e\u008f\7 \2\2"+
		"\u008f\u00b4\3\2\2\2\u0090\u0091\7\n\2\2\u0091\u0092\5\36\20\2\u0092\u0096"+
		"\7!\2\2\u0093\u0095\5\24\13\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2"+
		"\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009c\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0099\u009b\5\26\f\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2"+
		"\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009f\u00a0\7\"\2\2\u00a0\u00b4\3\2\2\2\u00a1\u00a3\7\23\2\2"+
		"\u00a2\u00a4\5\"\22\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00b4"+
		"\3\2\2\2\u00a5\u00a6\7\17\2\2\u00a6\u00b4\5\"\22\2\u00a7\u00a8\7\20\2"+
		"\2\u00a8\u00b4\5\"\22\2\u00a9\u00aa\7\21\2\2\u00aa\u00b4\7K\2\2\u00ab"+
		"\u00ac\7J\2\2\u00ac\u00b4\5\60\31\2\u00ad\u00ae\7K\2\2\u00ae\u00b0\7\37"+
		"\2\2\u00af\u00b1\5 \21\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b4\7 \2\2\u00b3n\3\2\2\2\u00b3w\3\2\2\2\u00b3"+
		"\u0083\3\2\2\2\u00b3\u0089\3\2\2\2\u00b3\u0090\3\2\2\2\u00b3\u00a1\3\2"+
		"\2\2\u00b3\u00a5\3\2\2\2\u00b3\u00a7\3\2\2\2\u00b3\u00a9\3\2\2\2\u00b3"+
		"\u00ab\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b4\23\3\2\2\2\u00b5\u00b7\5\26\f"+
		"\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00bc\5\16\b\2\u00bb\u00ba\3\2\2\2"+
		"\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\25"+
		"\3\2\2\2\u00bf\u00c2\7\13\2\2\u00c0\u00c3\5\"\22\2\u00c1\u00c3\7K\2\2"+
		"\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c8"+
		"\7.\2\2\u00c5\u00c6\7\16\2\2\u00c6\u00c8\7.\2\2\u00c7\u00bf\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\27\3\2\2\2\u00c9\u00d7\5\32\16\2\u00ca\u00cf\7K\2"+
		"\2\u00cb\u00cc\7%\2\2\u00cc\u00ce\7K\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d4\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d3\7\'\2\2\u00d3\u00d5\5\34\17\2\u00d4\u00d2\3"+
		"\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00c9\3\2\2\2\u00d6"+
		"\u00ca\3\2\2\2\u00d7\31\3\2\2\2\u00d8\u00db\7K\2\2\u00d9\u00da\7\'\2\2"+
		"\u00da\u00dc\5\34\17\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e3"+
		"\3\2\2\2\u00dd\u00de\5\34\17\2\u00de\u00df\7(\2\2\u00df\u00e0\3\2\2\2"+
		"\u00e0\u00e1\7K\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00d8\3\2\2\2\u00e2\u00dd"+
		"\3\2\2\2\u00e3\33\3\2\2\2\u00e4\u00e5\5\"\22\2\u00e5\35\3\2\2\2\u00e6"+
		"\u00e7\7\37\2\2\u00e7\u00e8\5\"\22\2\u00e8\u00e9\7 \2\2\u00e9\37\3\2\2"+
		"\2\u00ea\u00ef\5\"\22\2\u00eb\u00ec\7%\2\2\u00ec\u00ee\5\"\22\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0!\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\b\22\1\2\u00f3\u00fd"+
		"\5$\23\2\u00f4\u00f5\7K\2\2\u00f5\u00f7\7\37\2\2\u00f6\u00f8\5 \21\2\u00f7"+
		"\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fd\7 "+
		"\2\2\u00fa\u00fb\t\2\2\2\u00fb\u00fd\5\"\22\f\u00fc\u00f2\3\2\2\2\u00fc"+
		"\u00f4\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0120\3\2\2\2\u00fe\u00ff\f\13"+
		"\2\2\u00ff\u0100\t\3\2\2\u0100\u011f\5\"\22\f\u0101\u0102\f\n\2\2\u0102"+
		"\u0103\t\4\2\2\u0103\u011f\5\"\22\13\u0104\u0105\f\t\2\2\u0105\u0106\t"+
		"\5\2\2\u0106\u011f\5\"\22\n\u0107\u0108\f\b\2\2\u0108\u0109\t\6\2\2\u0109"+
		"\u011f\5\"\22\t\u010a\u010b\f\7\2\2\u010b\u010c\7=\2\2\u010c\u011f\5\""+
		"\22\b\u010d\u010e\f\6\2\2\u010e\u010f\7\63\2\2\u010f\u011f\5\"\22\7\u0110"+
		"\u0111\f\5\2\2\u0111\u0112\7\64\2\2\u0112\u011f\5\"\22\6\u0113\u0114\f"+
		"\4\2\2\u0114\u0115\7-\2\2\u0115\u0116\5\"\22\2\u0116\u0117\7.\2\2\u0117"+
		"\u0118\5\"\22\5\u0118\u011f\3\2\2\2\u0119\u011a\f\3\2\2\u011a\u011b\t"+
		"\7\2\2\u011b\u011f\5\"\22\4\u011c\u011d\f\r\2\2\u011d\u011f\t\b\2\2\u011e"+
		"\u00fe\3\2\2\2\u011e\u0101\3\2\2\2\u011e\u0104\3\2\2\2\u011e\u0107\3\2"+
		"\2\2\u011e\u010a\3\2\2\2\u011e\u010d\3\2\2\2\u011e\u0110\3\2\2\2\u011e"+
		"\u0113\3\2\2\2\u011e\u0119\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121#\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0123\u0124\7\37\2\2\u0124\u0125\5\"\22\2\u0125\u0126\7 \2\2"+
		"\u0126\u012a\3\2\2\2\u0127\u012a\5\60\31\2\u0128\u012a\7K\2\2\u0129\u0123"+
		"\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a%\3\2\2\2\u012b"+
		"\u012e\5(\25\2\u012c\u012e\7\26\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3"+
		"\2\2\2\u012e\'\3\2\2\2\u012f\u0130\t\t\2\2\u0130)\3\2\2\2\u0131\u0133"+
		"\7\37\2\2\u0132\u0134\5,\27\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2"+
		"\u0134\u0135\3\2\2\2\u0135\u0136\7 \2\2\u0136+\3\2\2\2\u0137\u013c\5."+
		"\30\2\u0138\u0139\7%\2\2\u0139\u013b\5.\30\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d-\3\2\2\2"+
		"\u013e\u013c\3\2\2\2\u013f\u0140\5(\25\2\u0140\u0141\7K\2\2\u0141/\3\2"+
		"\2\2\u0142\u0149\7\31\2\2\u0143\u0149\7\32\2\2\u0144\u0149\7\33\2\2\u0145"+
		"\u0149\7\35\2\2\u0146\u0149\7\34\2\2\u0147\u0149\7\36\2\2\u0148\u0142"+
		"\3\2\2\2\u0148\u0143\3\2\2\2\u0148\u0144\3\2\2\2\u0148\u0145\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149\61\3\2\2\2\"\64;PW^luz\u0096"+
		"\u009c\u00a3\u00b0\u00b3\u00b8\u00bd\u00c2\u00c7\u00cf\u00d4\u00d6\u00db"+
		"\u00e2\u00ef\u00f7\u00fc\u011e\u0120\u0129\u012d\u0133\u013c\u0148";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}