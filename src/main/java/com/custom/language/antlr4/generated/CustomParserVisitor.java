// Generated from CustomParser.g4 by ANTLR 4.7.1
package com.custom.language.antlr4.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CustomParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CustomParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CustomParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(CustomParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#fileContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileContent(CustomParser.FileContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#mainDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainDeclaration(CustomParser.MainDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#functionsDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionsDeclaration(CustomParser.FunctionsDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(CustomParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(CustomParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CustomParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(CustomParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(CustomParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CustomParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(CustomParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#foreachControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachControl(CustomParser.ForeachControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(CustomParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(CustomParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(CustomParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#writeToStd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteToStd(CustomParser.WriteToStdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#readFromStd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadFromStd(CustomParser.ReadFromStdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(CustomParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(CustomParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(CustomParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(CustomParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(CustomParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(CustomParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CustomParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(CustomParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(CustomParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#typeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOrVoid(CustomParser.TypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CustomParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(CustomParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(CustomParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(CustomParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(CustomParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(CustomParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CustomParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(CustomParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(CustomParser.FloatLiteralContext ctx);
}