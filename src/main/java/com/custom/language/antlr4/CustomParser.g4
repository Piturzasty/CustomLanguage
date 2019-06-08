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
    : variableDeclaratorId COLON type (ASSIGN_LEFT variableInitializer)?
    | variableDeclaratorId ASSIGN_LEFT variableInitializer
    | variableInitializer ASSIGN_RIGHT variableDeclaratorId COLON type
    | type variableDeclarators
    ;

statement
    : IF parExpression statement (ELSE elseStatement)? #ifElseStatement
    | FOREACH LPAREN localVariableDeclaration? COMMA expression? COMMA forUpdate=expressionList? RPAREN statement #forControl
    | WHILE parExpression statement #whileControl
    | DO statement WHILE parExpression #doWhileControl
    | SWITCH parExpression LBRACE switchBlockStatementGroup* switchLabel* RBRACE #switchControl
    | RETURN expression? #returnStatement
    | BREAK IDENTIFIER? #breakStatement
    | CONTINUE IDENTIFIER? #continueStatement
    | WRITE (expression | IDENTIFIER)* (expression | IDENTIFIER)+ #writeToStd
    | WRITELINE (expression | IDENTIFIER)* (expression | IDENTIFIER)+ #writeNewLineToStd
    | READ IDENTIFIER #readFromStd
    | SINGLE_COMMENT literal #comment
    ;

elseStatement
    : statement
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
    | variableDeclaratorId (COMMA variableDeclaratorId)* (ASSIGN_LEFT variableInitializer)?
    ;

variableDeclarator
    : variableDeclaratorId (ASSIGN_LEFT variableInitializer)?
    | (variableInitializer ASSIGN_RIGHT ) variableDeclaratorId
    ;

variableDeclaratorId
    : IDENTIFIER
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
    | methodCall #expressionMethodCall
    | LPAREN type RPAREN expression #expressionCast
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
    | expression bop=(ASSIGN_LEFT | ASSIGN_RIGHT | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | AND_ASSIGN | OR_ASSIGN | XOR_ASSIGN | RSHIFT_ASSIGN | URSHIFT_ASSIGN | LSHIFT_ASSIGN | MOD_ASSIGN ) expression #expressionAssign
    ;

primary
    : LPAREN expression RPAREN
    | literal
    | IDENTIFIER
    ;

methodCall
    : IDENTIFIER LPAREN expressionList? RPAREN
    ;

// TYPES

typeOrVoid
    : type
    | VOID
    ;

type
    : primitiveType
    ;

primitiveType
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
    : type variableDeclaratorId
    ;

// LITERALS

literal
    : integerLiteral
    | floatLiteral
    | STRING_LITERAL
    | BOOL_LITERAL
    | NULL_LITERAL
    ;

integerLiteral
    : DECIMAL_LITERAL
    | BINARY_LITERAL
    ;

floatLiteral
    : FLOAT_LITERAL
    ;
