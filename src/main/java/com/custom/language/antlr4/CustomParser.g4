parser grammar CustomParser;

options { tokenVocab=CustomLexer; }

compilationUnit
    : LBRACE fileContent? RBRACE
    ;

fileContent
    : functionsDeclaration* mainDeclaration
    ;

mainDeclaration
    : MAIN LPAREN RPAREN methodBody
    ;

functionsDeclaration
    : methodDeclaration
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
    : blockLabel=block
    | IF parExpression statement (ELSE elseStatement)?
    | FOREACH LPAREN forControl RPAREN statement
    | WHILE parExpression statement
    | DO statement WHILE parExpression
    | SWITCH parExpression LBRACE switchBlockStatementGroup* switchLabel* RBRACE
    | RETURN expression?
    | BREAK IDENTIFIER?
    | CONTINUE IDENTIFIER?
    | writeToStd
    | readFromStd
    | statementExpression=expression
    | identifierLabel=IDENTIFIER COLON statement
    | comment
    ;

elseStatement
    : statement
    ;

comment
    : SINGLE_COMMENT literal
    ;

forControl
    : foreachControl
    | forInit? COMMA expression? COMMA forUpdate=expressionList?
    ;

foreachControl
    : type variableDeclaratorId IN expression
    ;

forInit
    : localVariableDeclaration
    | expressionList
    ;

switchBlockStatementGroup
    : switchLabel+ blockStatement+
    ;

switchLabel
    : CASE (constantExpression=expression | enumConstantName=IDENTIFIER) COLON
    | DEFAULT COLON
    ;

writeToStd
    : WRITE (expression | IDENTIFIER)* (expression | IDENTIFIER)+
    ;

readFromStd
    : READ IDENTIFIER
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
    : primary
    | expression LBRACK expression RBRACK
    | methodCall
    | LPAREN type RPAREN expression
    | expression postfix=(INC | DEC)
    | prefix=(ADD | SUB | INC | DEC) expression
    | prefix=(TILDE | BANG) expression
    | expression bop=(MUL |DIV|MOD) expression
    | expression bop=(ADD|SUB) expression
    | expression (LT LT | GT GT GT | GT GT) expression
    | expression bop=(LE | GE | GT | LT) expression
    | expression bop=(EQUAL | NOTEQUAL ) expression
    | expression bop=CARET expression
    | expression bop=AND expression
    | expression bop=OR expression
    | expression bop=QUESTION expression COLON expression
      bop=(ASSIGN_LEFT | ASSIGN_RIGHT | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | AND_ASSIGN | OR_ASSIGN | XOR_ASSIGN | RSHIFT_ASSIGN | URSHIFT_ASSIGN | LSHIFT_ASSIGN | MOD_ASSIGN)
      expression
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
    : (primitiveType)
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
