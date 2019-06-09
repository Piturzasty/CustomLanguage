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
	 * Visit a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(CustomParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forControl}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(CustomParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileControl}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileControl(CustomParser.WhileControlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhileControl}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileControl(CustomParser.DoWhileControlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchControl}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchControl(CustomParser.SwitchControlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(CustomParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeToStd}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteToStd(CustomParser.WriteToStdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeNewLineToStd}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteNewLineToStd(CustomParser.WriteNewLineToStdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readFromStd}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadFromStd(CustomParser.ReadFromStdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comment}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(CustomParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(CustomParser.ElseStatementContext ctx);
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
	 * Visit a parse tree produced by the {@code expressionCompare}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionCompare(CustomParser.ExpressionCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionNegate}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNegate(CustomParser.ExpressionNegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionTernaryConditional}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionTernaryConditional(CustomParser.ExpressionTernaryConditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAssign}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAssign(CustomParser.ExpressionAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionMulDivModExpression}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMulDivModExpression(CustomParser.ExpressionMulDivModExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionEqual}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionEqual(CustomParser.ExpressionEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionPrimary}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionPrimary(CustomParser.ExpressionPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAddSubExpression}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAddSubExpression(CustomParser.ExpressionAddSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAnd}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAnd(CustomParser.ExpressionAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionOr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOr(CustomParser.ExpressionOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionIncDec}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionIncDec(CustomParser.ExpressionIncDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionMethodCall}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMethodCall(CustomParser.ExpressionMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionCarret}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionCarret(CustomParser.ExpressionCarretContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(CustomParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code otherTypes}
	 * labeled alternative in {@link CustomParser#typeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherTypes(CustomParser.OtherTypesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidType}
	 * labeled alternative in {@link CustomParser#typeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(CustomParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link CustomParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(CustomParser.BoolTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link CustomParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(CustomParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatType}
	 * labeled alternative in {@link CustomParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatType(CustomParser.FloatTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anyType}
	 * labeled alternative in {@link CustomParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyType(CustomParser.AnyTypeContext ctx);
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
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(CustomParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryLiteral}
	 * labeled alternative in {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLiteral(CustomParser.BinaryLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(CustomParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(CustomParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolLiteral}
	 * labeled alternative in {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(CustomParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(CustomParser.NullLiteralContext ctx);
}