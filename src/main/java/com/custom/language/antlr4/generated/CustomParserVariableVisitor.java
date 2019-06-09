package com.custom.language.antlr4.generated;

import com.custom.language.Variable;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CustomParserVariableVisitor extends CustomParserBaseVisitor<Variable> {
    private static final double SMALL_VALUE = 0.00000000001;
    private Map<String, Variable> variables = new HashMap<>();
    private Map<String, Variable> localVariables = new HashMap<>();
    private Map<String, CustomParser.MethodBodyContext> methods = new HashMap<String, CustomParser.MethodBodyContext>();

    @Override
    public Variable visitDecimalLiteral(CustomParser.DecimalLiteralContext ctx) {
        return new Variable(Integer.valueOf(ctx.getText()));
    }

    @Override
    public Variable visitBinaryLiteral(CustomParser.BinaryLiteralContext ctx) {
        return new Variable(Integer.valueOf(ctx.getText()));
    }

    @Override
    public Variable visitFloatLiteral(CustomParser.FloatLiteralContext ctx) {
        return new Variable(Float.valueOf(ctx.getText()));
    }

    @Override
    public Variable visitStringLiteral(CustomParser.StringLiteralContext ctx) {
        String str = ctx.getText();
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Variable(str);
    }

    @Override
    public Variable visitBoolLiteral(CustomParser.BoolLiteralContext ctx) {
        return new Variable(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public Variable visitNullLiteral(CustomParser.NullLiteralContext ctx) {
        return new Variable(null);
    }

    @Override
    public Variable visitExpressionCompare(CustomParser.ExpressionCompareContext ctx) {
        Variable left = getVariableIfSavedOrCreateNew(ctx.expression(0));
        Variable right = getVariableIfSavedOrCreateNew(ctx.expression(1));

        switch (ctx.bop.getType()) {
            case CustomParser.LT:
                return new Variable(left.asDouble() < right.asDouble());
            case CustomParser.LE:
                return new Variable(left.asDouble() <= right.asDouble());
            case CustomParser.GT:
                return new Variable(left.asDouble() > right.asDouble());
            case CustomParser.GE:
                return new Variable(left.asDouble() >= right.asDouble());
            default:
                throw new RuntimeException("Unknown compare operator: " + CustomParser.tokenNames[ctx.bop.getType()]);
        }
    }

    @Override
    public Variable visitParExpression(CustomParser.ParExpressionContext ctx) {
        return this.visit(ctx.expression());
    }

    @Override
    public Variable visitExpressionNegate(CustomParser.ExpressionNegateContext ctx) {
        Variable value = getVariableIfSavedOrCreateNew(ctx.expression());
        return new Variable(!value.asBoolean());
    }

    @Override
    public Variable visitExpressionTernaryConditional(CustomParser.ExpressionTernaryConditionalContext ctx) {
        Variable expression = this.visit(ctx.expression(0));
        Variable ifTrue = this.visit(ctx.expression(1));
        Variable ifFalse = this.visit(ctx.expression(2));

        return new Variable(expression.asBoolean() ? ifTrue : ifFalse);
    }

    @Override
    public Variable visitExpressionAssign(CustomParser.ExpressionAssignContext ctx) {
        Variable left = null;
        if (variables.containsKey(ctx.expression(0).getText())) {
            left = variables.get(ctx.expression(0).getText());
        }
        Variable right = getVariableIfSavedOrCreateNew(ctx.expression(1));
        Variable value = null;
        switch (ctx.bop.getType()) {
            case CustomParser.ASSIGN_LEFT:
                value = new Variable(right);
            case CustomParser.ADD_ASSIGN:
                value = new Variable(left != null ? left.asDouble() + right.asDouble() : right.asDouble());
            case CustomParser.SUB_ASSIGN:
                value = new Variable(left != null ? left.asDouble() - right.asDouble() : -right.asDouble());
            case CustomParser.MUL_ASSIGN:
                value = new Variable(left != null ? left.asDouble() * right.asDouble() : right.asDouble());
            case CustomParser.DIV_ASSIGN:
                value = new Variable(left != null ? left.asDouble() / right.asDouble() : 1 / right.asDouble());
            case CustomParser.AND_ASSIGN:
                value = new Variable(left != null ? left.asBoolean() && right.asBoolean() : right.asBoolean());
            case CustomParser.OR_ASSIGN:
                value = new Variable(left != null ? left.asBoolean() || right.asBoolean() : right.asBoolean());
            case CustomParser.XOR_ASSIGN:
                value = new Variable(left != null ? left.asBoolean() ^ right.asBoolean() : right.asBoolean());
            case CustomParser.MOD_ASSIGN:
                value = new Variable(left != null ? left.asDouble() % right.asDouble() : right.asDouble());
        }
        variables.put(ctx.expression(0).getText(), value);
        return value;

    }

    @Override
    public Variable visitExpressionMulDivModExpression(CustomParser.ExpressionMulDivModExpressionContext ctx) {
        Variable left = getVariableIfSavedOrCreateNew(ctx.expression(0));
        Variable right = getVariableIfSavedOrCreateNew(ctx.expression(1));

        switch (ctx.bop.getType()) {
            case CustomParser.MUL:
                return new Variable(left.asDouble() * right.asDouble());
            case CustomParser.DIV:
                return new Variable(left.asDouble() / right.asDouble());
            case CustomParser.MOD:
                return new Variable(left.asDouble() % right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + CustomParser.tokenNames[ctx.bop.getType()]);
        }
    }

    @Override
    public Variable visitExpressionEqual(CustomParser.ExpressionEqualContext ctx) {
        Variable left = getVariableIfSavedOrCreateNew(ctx.expression(0));
        Variable right = getVariableIfSavedOrCreateNew(ctx.expression(1));

        switch (ctx.bop.getType()) {
            case CustomParser.EQUAL:
                return left.isDouble() && right.isDouble() ?
                        new Variable(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE) :
                        new Variable(left.equals(right));
            case CustomParser.NOTEQUAL:
                return left.isDouble() && right.isDouble() ?
                        new Variable(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE) :
                        new Variable(!left.equals(right));
            default:
                throw new RuntimeException("unknown operator: " + CustomParser.tokenNames[ctx.bop.getType()]);
        }
    }


    @Override
    public Variable visitExpressionPrimary(CustomParser.ExpressionPrimaryContext ctx) {
        return new Variable(this.visit(ctx.primary()));
    }

    @Override
    public Variable visitExpressionAddSubExpression(CustomParser.ExpressionAddSubExpressionContext ctx) {
        Variable left = getVariableIfSavedOrCreateNew(ctx.expression(0));
        Variable right = getVariableIfSavedOrCreateNew(ctx.expression(1));

        switch (ctx.bop.getType()) {
            case CustomParser.ADD:
                return new Variable(left.asDouble() + right.asDouble());
            case CustomParser.SUB:
                return new Variable(left.asDouble() - right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + CustomParser.tokenNames[ctx.bop.getType()]);
        }
    }

    private Variable getVariableIfSavedOrCreateNew(CustomParser.ExpressionContext expression) {
        if (variables.containsKey(expression.getText())) {
            return variables.get(expression.getText());
        } else {
            return this.visit(expression);
        }
    }

    @Override
    public Variable visitExpressionAnd(CustomParser.ExpressionAndContext ctx) {
        Variable left = getVariableIfSavedOrCreateNew(ctx.expression(0));
        Variable right = getVariableIfSavedOrCreateNew(ctx.expression(1));
        return new Variable(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Variable visitExpressionOr(CustomParser.ExpressionOrContext ctx) {
        Variable left = getVariableIfSavedOrCreateNew(ctx.expression(0));
        Variable right = getVariableIfSavedOrCreateNew(ctx.expression(1));
        return new Variable(left.asBoolean() || right.asBoolean());
    }

    @Override
    public Variable visitExpressionIncDec(CustomParser.ExpressionIncDecContext ctx) {
        Variable value = getVariableIfSavedOrCreateNew(ctx.expression());

        switch (ctx.postfix.getType()) {
            case CustomParser.INC:
                value = new Variable(value.asDouble() + 1);
                variables.put(ctx.expression().getText(), value);
                return value;
            case CustomParser.DEC:
                value = new Variable(value.asDouble() - 1);
                variables.put(ctx.expression().getText(), value);
                return value;
            default:
                throw new RuntimeException("unknown operator: " + CustomParser.tokenNames[ctx.postfix.getType()]);
        }
    }

    @Override
    public Variable visitExpressionMethodCall(CustomParser.ExpressionMethodCallContext ctx) {
        return this.visit(methods.get(ctx.IDENTIFIER().getText()));
    }

    @Override
    public Variable visitExpressionCarret(CustomParser.ExpressionCarretContext ctx) {
        Variable left = getVariableIfSavedOrCreateNew(ctx.expression(0));
        Variable right = getVariableIfSavedOrCreateNew(ctx.expression(1));
        return new Variable(left.asBoolean() ^ right.asBoolean());
    }

    @Override
    public Variable visitFormalParameters(CustomParser.FormalParametersContext ctx) {
        return super.visitFormalParameters(ctx);
    }

    @Override
    public Variable visitFormalParameterList(CustomParser.FormalParameterListContext ctx) {
        return super.visitFormalParameterList(ctx);
    }

    @Override
    public Variable visitFormalParameter(CustomParser.FormalParameterContext ctx) {
        localVariables.put(ctx.IDENTIFIER().getText(), variables.get(ctx.IDENTIFIER().getText()));
        return super.visitFormalParameter(ctx);
    }

    @Override
    public Variable visitVariableDeclarators(CustomParser.VariableDeclaratorsContext ctx) {
        if (ctx.variableDeclarator() != null) {
            return this.visit(ctx.variableDeclarator());
        } else {
            Variable variable = this.visit(ctx.variableInitializer());
            for (TerminalNode identifier : ctx.IDENTIFIER()) {
                variables.put(identifier.getText(), variable);
            }
            return variable;
        }
    }

    @Override
    public Variable visitVariableDeclarator(CustomParser.VariableDeclaratorContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Variable variable = this.visit(ctx.variableInitializer());
        variables.put(id, variable);
        return variable;
    }

    @Override
    public Variable visitVariableInitializer(CustomParser.VariableInitializerContext ctx) {
        return this.visit(ctx.expression());
    }

    @Override
    public Variable visitWriteToStd(CustomParser.WriteToStdContext ctx) {
        Variable var = new Variable(this.visit(ctx.expression()));
        if (localVariables.containsKey(ctx.expression().getText()) || variables.containsKey(ctx.expression().getText())) {
            if (localVariables.containsKey(ctx.expression().getText())) {
                System.out.print(localVariables.get(ctx.expression().getText()));
            } else {
                System.out.print(variables.get(ctx.expression().getText()));
            }
        } else {
            if (var.toString() != null) {
                System.out.print(var.toString());
            }
        }
        return Variable.VOID;
    }

    @Override
    public Variable visitWriteNewLineToStd(CustomParser.WriteNewLineToStdContext ctx) {
        Variable var = new Variable(this.visit(ctx.expression()));
        if (localVariables.containsKey(ctx.expression().getText()) || variables.containsKey(ctx.expression().getText())) {
            if (localVariables.containsKey(ctx.expression().getText())) {
                System.out.println(localVariables.get(ctx.expression().getText()));
            } else {
                System.out.println(variables.get(ctx.expression().getText()));
            }
        } else {
            if (var.toString() != null) {
                System.out.println(var.toString());
            }
        }
        return Variable.VOID;
    }

    @Override
    public Variable visitReadFromStd(CustomParser.ReadFromStdContext ctx) {
        try {
            variables.put(ctx.IDENTIFIER().getText(), new Variable(System.in.read()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return visitChildren(ctx);
    }

    @Override
    public Variable visitComment(CustomParser.CommentContext ctx) {
        return Variable.VOID;
    }

    @Override
    public Variable visitReturnStatement(CustomParser.ReturnStatementContext ctx) {
        if (ctx.expression() != null) {
            return this.visit(ctx.expression());
        } else {
            return Variable.VOID;
        }
    }

    @Override
    public Variable visitLocalVariableDeclaration(CustomParser.LocalVariableDeclarationContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            String id = ctx.IDENTIFIER().getText();
            Variable variable = this.visit(ctx.variableInitializer());
            variables.put(id, variable);
            return variable;
        } else {
            return Variable.VOID;
        }
    }

    @Override
    public Variable visitIfElseStatement(CustomParser.IfElseStatementContext ctx) {
        if (new Variable(ctx.parExpression()).asBoolean()) {
            this.visit(ctx.statement(0));
        } else {
            this.visit(ctx.statement(1));
        }
        return Variable.VOID;
    }

    @Override
    public Variable visitForControl(CustomParser.ForControlContext ctx) {
        this.visit(ctx.localVariableDeclaration());
        for (; new Variable(this.visit(ctx.expression(0))).asBoolean(); this.visit(ctx.expression(1))) {
            visit(ctx.block());
        }
        return Variable.VOID;
    }

    @Override
    public Variable visitWhileControl(CustomParser.WhileControlContext ctx) {
        Variable value = this.visit(ctx.parExpression());
        while (value.asBoolean()) {
            this.visit(ctx.block());
            value = this.visit(ctx.parExpression());
        }
        return Variable.VOID;
    }

    @Override
    public Variable visitDoWhileControl(CustomParser.DoWhileControlContext ctx) {
        this.visit(ctx.block());
        Variable value = this.visit(ctx.parExpression());
        while (value.asBoolean()) {
            this.visit(ctx.block());
            value = this.visit(ctx.parExpression());
        }
        return Variable.VOID;
    }

    @Override
    public Variable visitMethodDeclaration(CustomParser.MethodDeclarationContext ctx) {
        methods.put(ctx.IDENTIFIER().getText(), ctx.methodBody());
        return Variable.VOID;
    }

    @Override
    public Variable visitMethodBody(CustomParser.MethodBodyContext ctx) {
        return super.visitMethodBody(ctx);
    }
}
