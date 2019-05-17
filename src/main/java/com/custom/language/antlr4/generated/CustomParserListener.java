// Generated from CustomParser.g4 by ANTLR 4.7.1
package com.custom.language.antlr4.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CustomParser}.
 */
public interface CustomParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CustomParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(CustomParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(CustomParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#fileContent}.
	 * @param ctx the parse tree
	 */
	void enterFileContent(CustomParser.FileContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#fileContent}.
	 * @param ctx the parse tree
	 */
	void exitFileContent(CustomParser.FileContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(CustomParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(CustomParser.MainDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#functionsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionsDeclaration(CustomParser.FunctionsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#functionsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionsDeclaration(CustomParser.FunctionsDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(CustomParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(CustomParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(CustomParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(CustomParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CustomParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CustomParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(CustomParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(CustomParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(CustomParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(CustomParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CustomParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CustomParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(CustomParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(CustomParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#foreachControl}.
	 * @param ctx the parse tree
	 */
	void enterForeachControl(CustomParser.ForeachControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#foreachControl}.
	 * @param ctx the parse tree
	 */
	void exitForeachControl(CustomParser.ForeachControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(CustomParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(CustomParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(CustomParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(CustomParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(CustomParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(CustomParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#writeToStd}.
	 * @param ctx the parse tree
	 */
	void enterWriteToStd(CustomParser.WriteToStdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#writeToStd}.
	 * @param ctx the parse tree
	 */
	void exitWriteToStd(CustomParser.WriteToStdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#readFromStd}.
	 * @param ctx the parse tree
	 */
	void enterReadFromStd(CustomParser.ReadFromStdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#readFromStd}.
	 * @param ctx the parse tree
	 */
	void exitReadFromStd(CustomParser.ReadFromStdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(CustomParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(CustomParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(CustomParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(CustomParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(CustomParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(CustomParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(CustomParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(CustomParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(CustomParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(CustomParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(CustomParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(CustomParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CustomParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CustomParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(CustomParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(CustomParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(CustomParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(CustomParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#typeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeOrVoid(CustomParser.TypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#typeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeOrVoid(CustomParser.TypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CustomParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CustomParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(CustomParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(CustomParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(CustomParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(CustomParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(CustomParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(CustomParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(CustomParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(CustomParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(CustomParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(CustomParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CustomParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CustomParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(CustomParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(CustomParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(CustomParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(CustomParser.FloatLiteralContext ctx);
}