parser grammar CustomParser;

options { tokenVocab=CustomLexer; }

compilationUnit
    : LBRACE fileContent? RBRACE
    ;

fileContent
    : importDeclaration* functionsDeclaration* mainDeclaration
    ;

importDeclaration
    : IMPORT qualifiedName (DOT MUL)?
    ;

mainDeclaration
    : MAIN LPAREN RPAREN methodBody
    ;

functionsDeclaration
    : methodDeclaration
    ;

methodDeclaration
    : typeOrVoid IDENTIFIER formalParameters (LBRACK RBRACK)* methodBody
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
    | variableInitializer ASSIGN_RIGHT variableDeclaratorId COLON type
    | type variableDeclarators
    ;

statement
    : blockLabel=block
    | IF parExpression statement (ELSE statement)?
    | FOREACH LPAREN foreachControl RPAREN statement
    | FOREACH LPAREN forControl RPAREN statement
    | WHILE parExpression statement
    | DO statement WHILE parExpression
    | SWITCH parExpression LBRACE switchBlockStatementGroup* switchLabel* RBRACE
    | RETURN expression?
    | BREAK IDENTIFIER?
    | CONTINUE IDENTIFIER?
    | statementExpression=expression
    | identifierLabel=IDENTIFIER COLON statement
    ;

foreachControl
    : type IDENTIFIER* IN* IDENTIFIER*
    ;

forControl
    : enhancedForControl
    | forInit? COMMA expression? COMMA forUpdate=expressionList?
    ;

forInit
    : localVariableDeclaration
    | expressionList
    ;

enhancedForControl
    : type variableDeclaratorId COLON expression
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
    : variableDeclarator (COMMA variableDeclarator)*
    ;

variableDeclarator
    : variableDeclaratorId (ASSIGN_LEFT variableInitializer)?
    | (variableInitializer ASSIGN_RIGHT ) variableDeclaratorId
    ;

variableDeclaratorId
    : IDENTIFIER (LBRACK RBRACK)*
    ;

variableInitializer
    : arrayInitializer
    | expression
    ;

arrayInitializer
    : LBRACE (variableInitializer (COMMA variableInitializer)* (COMMA)? )? RBRACE
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
    | expression bop=DOT
      ( IDENTIFIER
      | methodCall
      )
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
    | expression bop=BITAND expression
    | expression bop=CARET expression
    | expression bop=BITOR expression
    | expression bop=AND expression
    | expression bop=OR expression
    | expression bop=QUESTION expression COLON expression
    | <assoc=right> expression
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
    : (primitiveType) (LBRACK RBRACK)*
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
    : formalParameter (COMMA formalParameter)* (COMMA lastFormalParameter)?
    | lastFormalParameter
    ;

formalParameter
    : type variableDeclaratorId
    ;

lastFormalParameter
    : type ELLIPSIS variableDeclaratorId
    ;

qualifiedName
    : IDENTIFIER (DOT IDENTIFIER)*
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






