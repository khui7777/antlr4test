grammar Custom;

//lexer rule start here...
//Break down raw text into meaningful tokens
//Tell ANTLR how to recognize things like identifiers, numbers, symbols, and keywords.

//Numbers
fragment DIGIT : [0-9] ;
INT    : DIGIT+ ;
FLOAT  : DIGIT+ '.' DIGIT+ ;

//Literals & Operators
PLUS     : '+' ;
MINUS    : '-' ;
MUL      : '*' ;
DIV      : '/' ;
ASSIGN   : '=' ;
EQ       : '==' ;
NEQ      : '!=' ;
LT       : '<' ;
GT       : '>' ;
LE       : '<=' ;
GE       : '>=' ;

//Identifiers
ID      : [a-zA-Z_][a-zA-Z0-9_]* ;

//Keywords
IF      : 'if' ;
ELSE    : 'else' ;
WHILE   : 'while' ;
FOR     : 'for' ;
RETURN  : 'return' ;

//Strings & Characters
STRING   : '"' (~["\\] | '\\' .)* '"' ;
CHAR     : '\'' . '\'' ;

//Hexadecimal Numbers
fragment HEX : [0-9a-fA-F] ;
HEX_LITERAL : '0x' HEX+ ;

//Whitespace & Comments
WS       : [ \t\r\n]+ -> skip ;                         // Skip whitespace
LINE_COMMENT : '//' ~[\r\n]* -> skip ;                  // Skip single-line comments
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;                 // Skip multi-line comments
//lexer rule end here...

////////////////////////////////////////////////////////////////////////////////////////////

//parser rule start here...
//ruleName : expression1 expression2 ... ;
// Parser rules

program         : statement* EOF ;

statement
    : variableDeclaration
    | assignment
    | ifStatement
    | whileStatement
    | returnStatement
    | expression ';'
    ;

variableDeclaration
    : ID ASSIGN expression ';'
    ;

assignment
    : ID ASSIGN expression ';'
    ;

ifStatement
    : IF '(' expression ')' statement (ELSE statement)?
    ;

whileStatement
    : WHILE '(' expression ')' statement
    ;

returnStatement
    : RETURN expression? ';'
    ;

expression
    : expression operator=('*' | '/' | '%') expression       # MulDivExpr
    | expression operator=('+' | '-') expression             # AddSubExpr
    | expression operator=('<' | '<=' | '>' | '>=') expression  # RelationalExpr
    | expression operator=('==' | '!=') expression           # EqualityExpr
    | '(' expression ')'                                     # ParenExpr
    | ID                                                    # IdExpr
    | INT                                                   # IntExpr
    | FLOAT                                                 # FloatExpr
    | HEX_LITERAL                                           # HexExpr
    | STRING                                                # StringExpr
    | CHAR                                                  # CharExpr
    ;
//parser rule end here...