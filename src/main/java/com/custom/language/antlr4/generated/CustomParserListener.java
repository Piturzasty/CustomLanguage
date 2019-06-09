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
	 * Enter a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(CustomParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(CustomParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forControl}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForControl(CustomParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forControl}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForControl(CustomParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileControl}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileControl(CustomParser.WhileControlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileControl}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileControl(CustomParser.WhileControlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doWhileControl}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileControl(CustomParser.DoWhileControlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doWhileControl}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileControl(CustomParser.DoWhileControlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchControl}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchControl(CustomParser.SwitchControlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchControl}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchControl(CustomParser.SwitchControlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(CustomParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(CustomParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeToStd}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWriteToStd(CustomParser.WriteToStdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeToStd}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWriteToStd(CustomParser.WriteToStdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeNewLineToStd}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWriteNewLineToStd(CustomParser.WriteNewLineToStdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeNewLineToStd}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWriteNewLineToStd(CustomParser.WriteNewLineToStdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readFromStd}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReadFromStd(CustomParser.ReadFromStdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readFromStd}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReadFromStd(CustomParser.ReadFromStdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comment}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterComment(CustomParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comment}
	 * labeled alternative in {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitComment(CustomParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(CustomParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(CustomParser.ElseStatementContext ctx);
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
	 * Enter a parse tree produced by the {@code expressionCompare}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionCompare(CustomParser.ExpressionCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionCompare}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionCompare(CustomParser.ExpressionCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionNegate}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNegate(CustomParser.ExpressionNegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionNegate}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNegate(CustomParser.ExpressionNegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionTernaryConditional}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionTernaryConditional(CustomParser.ExpressionTernaryConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionTernaryConditional}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionTernaryConditional(CustomParser.ExpressionTernaryConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAssign}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAssign(CustomParser.ExpressionAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAssign}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAssign(CustomParser.ExpressionAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionMulDivModExpression}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMulDivModExpression(CustomParser.ExpressionMulDivModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionMulDivModExpression}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMulDivModExpression(CustomParser.ExpressionMulDivModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionEqual}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionEqual(CustomParser.ExpressionEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionEqual}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionEqual(CustomParser.ExpressionEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionPrimary}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPrimary(CustomParser.ExpressionPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionPrimary}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPrimary(CustomParser.ExpressionPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAddSubExpression}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAddSubExpression(CustomParser.ExpressionAddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAddSubExpression}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAddSubExpression(CustomParser.ExpressionAddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAnd}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAnd(CustomParser.ExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAnd}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAnd(CustomParser.ExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionOr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOr(CustomParser.ExpressionOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionOr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOr(CustomParser.ExpressionOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionIncDec}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionIncDec(CustomParser.ExpressionIncDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionIncDec}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionIncDec(CustomParser.ExpressionIncDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionMethodCall}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMethodCall(CustomParser.ExpressionMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionMethodCall}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMethodCall(CustomParser.ExpressionMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionCarret}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionCarret(CustomParser.ExpressionCarretContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionCarret}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionCarret(CustomParser.ExpressionCarretContext ctx);
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
	 * Enter a parse tree produced by the {@code otherTypes}
	 * labeled alternative in {@link CustomParser#typeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterOtherTypes(CustomParser.OtherTypesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code otherTypes}
	 * labeled alternative in {@link CustomParser#typeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitOtherTypes(CustomParser.OtherTypesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidType}
	 * labeled alternative in {@link CustomParser#typeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(CustomParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidType}
	 * labeled alternative in {@link CustomParser#typeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(CustomParser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link CustomParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(CustomParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link CustomParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(CustomParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link CustomParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(CustomParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link CustomParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(CustomParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatType}
	 * labeled alternative in {@link CustomParser#type}.
	 * @param ctx the parse tree
	 */
	void enterFloatType(CustomParser.FloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatType}
	 * labeled alternative in {@link CustomParser#type}.
	 * @param ctx the parse tree
	 */
	void exitFloatType(CustomParser.FloatTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyType}
	 * labeled alternative in {@link CustomParser#type}.
	 * @param ctx the parse tree
	 */
	void enterAnyType(CustomParser.AnyTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyType}
	 * labeled alternative in {@link CustomParser#type}.
	 * @param ctx the parse tree
	 */
	void exitAnyType(CustomParser.AnyTypeContext ctx);
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
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(CustomParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(CustomParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryLiteral}
	 * labeled alternative in {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLiteral(CustomParser.BinaryLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryLiteral}
	 * labeled alternative in {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLiteral(CustomParser.BinaryLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(CustomParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(CustomParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(CustomParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(CustomParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolLiteral}
	 * labeled alternative in {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(CustomParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolLiteral}
	 * labeled alternative in {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(CustomParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(CustomParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(CustomParser.NullLiteralContext ctx);
}