parser grammar CustomParser;

options { tokenVocab=CustomLexer; }

compilationUnit
    : LBRACE fileContent? RBRACE
    ;

fileContent
    : importDeclaration* functionsDeclaration* mainDeclaration
    ;

importDeclaration
    : IMPORT qualifiedName ('.' '*')?
    ;

mainDeclaration
    : MAIN LPAREN RPAREN methodBody
    ;

functionsDeclaration
    : methodDeclaration
    ;

methodDeclaration
    : typeOrVoid IDENTIFIER formalParameters ('[' ']')* methodBody
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
    : variableDeclaratorId ':' type ('<-' variableInitializer)?
    | variableInitializer '->' variableDeclaratorId ':' type
    | type variableDeclarators
    ;

statement
    : blockLabel=block
    | IF parExpression statement (ELSE statement)?
    | FOREACH '(' foreachControl ')' statement
    | FOREACH '(' forControl ')' statement
    | WHILE parExpression statement
    | DO statement WHILE parExpression
    | TRY block (catchClause+ finallyBlock? | finallyBlock)
    | SWITCH parExpression '{' switchBlockStatementGroup* switchLabel* '}'
    | RETURN expression?
    | BREAK IDENTIFIER?
    | CONTINUE IDENTIFIER?
    | statementExpression=expression
    | identifierLabel=IDENTIFIER ':' statement
    ;

foreachControl
    : type IDENTIFIER* IN* IDENTIFIER*
    ;

forControl
    : enhancedForControl
    | forInit? ',' expression? ',' forUpdate=expressionList?
    ;

forInit
    : localVariableDeclaration
    | expressionList
    ;

enhancedForControl
    : type variableDeclaratorId ':' expression
    ;

switchBlockStatementGroup
    : switchLabel+ blockStatement+
    ;

switchLabel
    : CASE (constantExpression=expression | enumConstantName=IDENTIFIER) ':'
    | DEFAULT ':'
    ;

// VARIABLES

variableDeclarators
    : variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    : variableDeclaratorId ('<-' variableInitializer)?
    | (variableInitializer '->' ) variableDeclaratorId
    ;

variableDeclaratorId
    : IDENTIFIER ('[' ']')*
    ;

variableInitializer
    : arrayInitializer
    | expression
    ;

arrayInitializer
    : '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

// EXPRESSIONS

parExpression
    : '(' expression ')'
    ;

expressionList
    : expression (',' expression)*
    ;

expression
    : primary
    | expression bop='.'
      ( IDENTIFIER
      | methodCall
      )
    | expression '[' expression ']'
    | methodCall
    | '(' type')' expression
    | expression postfix=('++' | '--')
    | prefix=('+'|'-'|'++'|'--') expression
    | prefix=('~'|'!') expression
    | expression bop=('*'|'/'|'%') expression
    | expression bop=('+'|'-') expression
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    | expression bop=('<=' | '>=' | '>' | '<') expression
    | expression bop=('==' | '!=') expression
    | expression bop='&' expression
    | expression bop='^' expression
    | expression bop='|' expression
    | expression bop='&&' expression
    | expression bop='||' expression
    | expression bop='?' expression ':' expression
    | <assoc=right> expression
      bop=('<-' | '->' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=')
      expression
    ;

primary
    : '(' expression ')'
    | literal
    | IDENTIFIER
    ;

methodCall
    : IDENTIFIER '(' expressionList? ')'
    ;

// TYPES

typeOrVoid
    : type
    | VOID
    ;

type
    : (primitiveType) ('[' ']')*
    ;

primitiveType
    : BOOLEAN
    | INT
    | FLOAT
    | ANY
    ;

// PARAMETERS

formalParameters
    : '(' formalParameterList? ')'
    ;

formalParameterList
    : formalParameter (',' formalParameter)* (',' lastFormalParameter)?
    | lastFormalParameter
    ;

formalParameter
    : type variableDeclaratorId
    ;

lastFormalParameter
    : type '...' variableDeclaratorId
    ;

qualifiedName
    : IDENTIFIER ('.' IDENTIFIER)*
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






