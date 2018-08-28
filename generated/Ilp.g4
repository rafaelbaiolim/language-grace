grammar Ilp;
T_ELSE  : 'else' ;
T_FALSE  : 'false' ;
T_FALSE  : 'true' ;
T_BOOL  : T_TRUE | T_FALSE ;
T_FOR  : 'for' ;
T_IF  : 'if' ;
T_INT  : 'int' ;
T_READ  : 'read' ;
T_RETURN  : 'return' ;
T_SKIP  : 'skip' ;
T_STOP  : 'stop' ;
T_STRING  : 'string' ;
T_VAR  : 'var' ;
T_WHILE  : 'while' ;
T_WRITE  : 'write' ;
T_LEFT_PAREN  : '(' ;
T_RIGHT_PAREN  : ')' ;
T_LEFT_SQUARE  : '[' ;
T_RIGHT_SQUARE  : ']' ;
T_LEFT_CURLY_BRACE  : '{' ;
T_RIGHT_CURLY_BRACE  : '}' ;
T_COMMA  : ',' ;
T_SEMICOLON  : ';' ;
T_PLUS  : '+' ;
T_MINUS  : '-' ;
T_ASTERISK  : '*' ;
T_SLASH  : '/' ;
T_PERCENT  : '%' ;
T_EQUAL  : '==' ;
T_DIFFERENT  : '!=' ;
T_GREATER  : '>' ;
T_GREATER_OR_EQUAL  : '>=' ;
T_INCREMENT  : '+=' ;
T_DECREMENT  : '-=' ;
T_INC_MULT  : '*=' ;
T_INC_DIV  : '/=' ;
T_INC_MOD : '%=' ;
T_LOWER  : '<' ;
T_ID : [_]*[a-z][A-Za-z0-9_]* ;
T_NUMBER : [0-9]+;
T_COMENT : '//.*\n' | '//[^\n]*\n' ;
WS : [ \t\r\n]+ -> skip ;

expression
    : 'qualquercoisa'; 

command
    : cmdSimple 
    | block;


cmdSimple
    : cmdAtrib 
    | cmdIf;

cmdAtrib
    : atrib T_SEMICOLON;

atrib
    : T_ID (T_EQUAL | T_INCREMENT | T_DECREMENT | T_INC_MULT | T_INC_DIV | T_INC_MOD ) expression;

cmdIf
    : T_IF T_LEFT_PAREN expression T_RIGHT_PAREN command [ T_ELSE command ];

cmdWhile
    : T_WHILE T_LEFT_PAREN expression T_RIGHT_PAREN command;

forInit
    : cmdAtrib;

forItera
    : cmdAtrib;

cmdFor
    : T_FOR T_LEFT_PAREN forInit T_SEMICOLON expression T_SEMICOLON forItera T_RIGHT_PAREN command;

cmdStop
    : T_STOP T_SEMICOLON;

cmdSkip
    : T_SKIP T_SEMICOLON;

cmdReturn
    : T_RETURN [ expression ] T_SEMICOLON;

cmdCallProc
    : T_ID T_LEFT_PAREN [ expression {T_COMMA expression} ] T_RIGHT_PAREN T_SEMICOLON;

varDecl 
    : T_ID | T_ID T_LEFT_SQUARE expression T_RIGHT_SQUARE;

cmdRead
    : T_READ varDecl T_SEMICOLON; //var -> id ?

cmdWirite 
    : T_WRITE expression {T_COMMA expression } ;

opTern
    : 'opTern'; //não implementado 

block 
    : T_LEFT_CURLY_BRACE {cmdSimple} {command} T_RIGHT_CURLY_BRACE ;
