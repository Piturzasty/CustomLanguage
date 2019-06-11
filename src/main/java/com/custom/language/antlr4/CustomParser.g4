parser grammar CustomParser;

options { tokenVocab=CustomLexer; }

compilationUnit
    : LBRACE fileContent? RBRACE
    ;

fileContent
    : methodDeclaration* mainDeclaration
    ;

mainDeclaration
    : MAIN LPAREN RPAREN methodBody
    ;

methodDeclaration
    : typeOrVoid IDENTIFIER formalParameters methodBody
    ;

methodBody
    : block
    ;

// STATEMENTS / BLOCKS

block
    : LBRACE blockStatement* RBRACE
    ;

blockStatement
    : localVariableDeclaration
    | statement
    ;

localVariableDeclaration
    : IDENTIFIER COLON type (ASSIGN_LEFT variableInitializer)?
    | IDENTIFIER ASSIGN_LEFT variableInitializer
    | variableInitializer ASSIGN_RIGHT IDENTIFIER COLON type
    | type variableDeclarators
    ;

statement
    : IF parExpression block (ELSE block)? #ifElseStatement
    | FOREACH LPAREN localVariableDeclaration? COMMA expression COMMA expression RPAREN block #forControl
    | WHILE LPAREN parExpression RPAREN block #whileControl
    | DO block WHILE LPAREN parExpression RPAREN #doWhileControl
    | SWITCH parExpression LBRACE switchBlockStatementGroup* switchLabel* RBRACE #switchControl
    | RETURN expression? #returnStatement
    | WRITE expression #writeToStd
    | WRITELINE expression #writeNewLineToStd
    | READ IDENTIFIER #readFromStd
    | IDENTIFIER LPAREN expressionList? RPAREN #methodCall
    ;

switchBlockStatementGroup
    : switchLabel+ blockStatement+
    ;

switchLabel
    : CASE (constantExpression=expression | enumConstantName=IDENTIFIER) COLON
    | DEFAULT COLON
    ;

// VARIABLES

variableDeclarators
    : variableDeclarator
    | IDENTIFIER (COMMA IDENTIFIER)* (ASSIGN_LEFT variableInitializer)?
    ;

variableDeclarator
    : IDENTIFIER (ASSIGN_LEFT variableInitializer)?
    | (variableInitializer ASSIGN_RIGHT ) IDENTIFIER
    ;

variableInitializer
    : expression
    ;

// EXPRESSIONS

parExpression
    : LPAREN expression RPAREN
    ;

expressionList
    : expression (COMMA expression)*
    ;

expression
    : primary #expressionPrimary
    | IDENTIFIER LPAREN expressionList? RPAREN #expressionMethodCall
    | expression postfix=(INC | DEC) #expressionIncDec
    | prefix=(TILDE | BANG) expression #expressionNegate
    | expression bop=(MUL | DIV | MOD) expression #expressionMulDivModExpression
    | expression bop=(ADD | SUB) expression #expressionAddSubExpression
    | expression bop=(LE | GE | GT | LT) expression #expressionCompare
    | expression bop=(EQUAL | NOTEQUAL ) expression #expressionEqual
    | expression bop=CARET expression #expressionCarret
    | expression bop=AND expression #expressionAnd
    | expression bop=OR expression #expressionOr
    | expression bop=QUESTION expression COLON expression #expressionTernaryConditional
    | expression bop=(ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | AND_ASSIGN | OR_ASSIGN | XOR_ASSIGN | MOD_ASSIGN ) expression #expressionAssign
    ;

primary
    : LPAREN expression RPAREN
    | literal
    | IDENTIFIER
    ;

// TYPES

typeOrVoid
    : type
    | VOID
    ;

type
    : BOOLEAN
    | INT
    | FLOAT
    | ANY
    ;

// PARAMETERS

formalParameters
    : LPAREN formalParameterList? RPAREN
    ;

formalParameterList
    : formalParameter (COMMA formalParameter)*
    ;

formalParameter
    : type IDENTIFIER
    ;

// LITERALS

literal
    : DECIMAL_LITERAL #decimalLiteral
    | BINARY_LITERAL #binaryLiteral
    | FLOAT_LITERAL #floatLiteral
    | STRING_LITERAL #stringLiteral
    | BOOL_LITERAL #boolLiteral
    | NULL_LITERAL #nullLiteral
    ;

