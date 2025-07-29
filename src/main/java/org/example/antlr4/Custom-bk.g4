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
// Entry point
compilationUnit
    : packageDeclaration? importDeclaration* typeDeclaration* EOF
    ;

// Package and imports
packageDeclaration
    : 'package' qualifiedName ';'
    ;

importDeclaration
    : 'import' ('static')? qualifiedName ('.' '*')? ';'
    ;

typeParameters
    : '<' typeParameter (',' typeParameter)* '>'
    ;

typeParameter
    : Identifier ('extends' typeBound)?
    ;

typeBound
    : type ('&' type)*
    ;

interfaceDeclaration
    : modifiers? 'interface' Identifier typeParameters? ('extends' typeList)? interfaceBody
    ;

interfaceBody
    : '{' interfaceMemberDeclaration* '}'
    ;

interfaceMemberDeclaration
    : modifiers? interfaceMethodDeclaration
    | ';'
    ;

interfaceMethodDeclaration
    : type Identifier formalParameters ('throws' qualifiedNameList)? ';'
    ;

annotations
    : annotation+
    ;

annotation
    : '@' qualifiedName ('(' elementValue? ')')?
    ;


// Expressions
expression
    : expression op=('*' | '/' | '%') expression           # MulDivExpr
    | expression op=('+' | '-') expression                 # AddSubExpr
    | expression op=('<' | '<=' | '>' | '>=') expression   # CompareExpr
    | expression op=('==' | '!=') expression               # EqualityExpr
    | expression op=('&&' | '||') expression               # LogicalExpr
    | '(' expression ')'                                   # ParenExpr
    | methodCall                                           # MethodCallExpr
    | primary                                              # PrimaryExpr
    ;

elementValue
    : expression
    | annotation
    | elementValueArrayInitializer
    ;

elementValueArrayInitializer
    : '{' (elementValue (',' elementValue)* ','?)? '}'
    ;

arguments
    : '(' argumentList? ')'
    ;

argumentList
    : expression (',' expression)*
    ;

enumDeclaration
    : modifiers? 'enum' Identifier ('implements' typeList)? enumBody
    ;

enumBody
    : '{' enumConstants? ','? enumBodyDeclarations? '}'
    ;

enumConstants
    : enumConstant (',' enumConstant)*
    ;

enumConstant
    : annotations? Identifier arguments? classBody?
    ;

enumBodyDeclarations
    : ';' classBodyDeclaration*
    ;

annotationTypeDeclaration
    : modifiers? '@' 'interface' Identifier annotationTypeBody
    ;

annotationTypeBody
    : '{' annotationTypeElementDeclaration* '}'
    ;

annotationTypeElementDeclaration
    : modifiers? type Identifier '(' ')' ('default' elementValue)? ';'
    ;

// Types
typeDeclaration
    : classDeclaration
    | interfaceDeclaration
    | enumDeclaration
    | annotationTypeDeclaration
    ;

// Class
classDeclaration
    : modifiers? 'class' Identifier typeParameters? ('extends' type)? ('implements' typeList)? classBody
    ;

classBody
    : '{' classBodyDeclaration* '}'
    ;

classBodyDeclaration
    : ';'
    | modifiers? memberDeclaration
    ;

memberDeclaration
    : methodDeclaration
    | fieldDeclaration
    | constructorDeclaration
    | classDeclaration
    ;

// Method
methodDeclaration
    : modifiers? type Identifier formalParameters ('throws' qualifiedNameList)? methodBody
    ;

methodBody
    : block
    | ';'
    ;

// Constructor
constructorDeclaration
    : modifiers? Identifier formalParameters ('throws' qualifiedNameList)? block
    ;

// Field
fieldDeclaration
    : type variableDeclarators ';'
    ;

variableDeclarators
    : variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    : Identifier ('=' variableInitializer)?
    ;

variableInitializer
    : expression
    | arrayInitializer
    ;

arrayInitializer
    : '{' (variableInitializer (',' variableInitializer)* ','?)? '}'
    ;

// Parameters
formalParameters
    : '(' formalParameterList? ')'
    ;

formalParameterList
    : formalParameter (',' formalParameter)*
    ;

formalParameter
    : type Identifier
    ;

// Block
block
    : '{' blockStatement* '}'
    ;

blockStatement
    : localVariableDeclarationStatement
    | statement
    ;

localVariableDeclarationStatement
    : type variableDeclarators ';'
    ;

// Statements
statement
    : block
    | 'if' '(' expression ')' statement ('else' statement)?
    | 'while' '(' expression ')' statement
    | 'for' '(' forControl ')' statement
    | 'return' expression? ';'
    | 'break' ';'
    | 'continue' ';'
    | expressionStatement
    ;

expressionStatement
    : expression ';'
    ;

forControl
    : forInit? ';' expression? ';' forUpdate?
    ;

forInit
    : localVariableDeclarationStatement
    | expressionList
    ;

forUpdate
    : expressionList
    ;

expressionList
    : expression (',' expression)*
    ;

methodCall
    : Identifier '(' argumentList? ')'
    ;

primary
    : literal
    | Identifier
    ;

literal
    : IntegerLiteral
    | FloatingPointLiteral
    | BooleanLiteral
    | CharacterLiteral
    | StringLiteral
    | 'null'
    ;

// Types
type
    : primitiveType
    | qualifiedName
    ;

primitiveType
    : 'int' | 'float' | 'boolean' | 'char' | 'double' | 'long' | 'short' | 'byte'
    ;

qualifiedName
    : Identifier ('.' Identifier)*
    ;

typeList
    : type (',' type)*
    ;

qualifiedNameList
    : qualifiedName (',' qualifiedName)*
    ;

// Modifiers
modifiers
    : modifier+
    ;

modifier
    : 'public' | 'private' | 'protected' | 'static' | 'final' | 'abstract'
    ;

prog: expression EOF;
//parser rule end here...