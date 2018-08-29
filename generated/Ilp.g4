grammar Ilp;

T_ELSE  : 'else' ;
T_FALSE  : 'false' ;
T_TRUE  : 'true' ;
T_BOOL  : 'bool' ;
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
T_COLON  : ':' ;
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
T_DOT : '.';

T_ID : [_]*[a-z][A-Za-z0-9_]* ;
T_NUMBER : [0-9]+;

T_COMENT : '//' ~ [\r\n]* -> skip;
WS : [ \t\r\n]+ -> skip ;

expression
    : 'qualquercoisa'
    ; 

command
    : cmdSimple; //| block;


cmdSimple
    : cmdAtrib 
    | cmdIf
    ;

cmdAtrib
    : atrib ';'
    ;

atrib
    : T_ID (T_EQUAL | T_INCREMENT | T_DECREMENT | T_INC_MULT | T_INC_DIV | T_INC_MOD ) expression
    ;

cmdIf
    : T_IF '{' expression '}' command  
    | T_ELSE command 
    ;

cmdWhile
    : T_WHILE '{' expression '}' command
    ;

forInit
    : cmdAtrib;

forItera
    : cmdAtrib;

cmdFor
    : T_FOR '{' forInit ';' expression ';' forItera '}' command
    ;

cmdStop
    : T_STOP ';'
    ;

cmdSkip
    : T_SKIP ';'
    ;

cmdReturn
    : T_RETURN  expression ';'
    ;

//cmdCallProc
//    : T_ID '{' [ expression {',' expression} ] '}' ';';

lstOP
    : T_EQUAL
    | T_PLUS
    | T_MINUS
    | T_ASTERISK
    | T_PERCENT
    | T_SLASH
    ;

lstTipo 
    : T_INT 
    | T_STRING
    | T_BOOL
    ;

literal
    : T_NUMBER
    | StringLiteral
    | T_FALSE
    | T_TRUE
    ;

specVarSimple
    : T_ID 
    | T_ID '=' literal
    ;

specVarSimpleIni
    : specVarSimple lstOP specVarSimple
    ;

specVarArr
    : specVarSimple '[' T_NUMBER ']'
    ;

lstArrIni
    : literal
    | literal ',' literal
    ;

specVarArrIni
    : specVarArr '=' '{' lstArrIni '}'
    ;


specVar
    : specVarSimple
    | specVarSimpleIni
    | specVarArr
    | specVarArrIni
    ;


listSpecVars
    : specVar
    | specVar ',' listSpecVars
    ;

declVar 
    : T_VAR listSpecVars ':' lstTipo ';'
    ;

cmdRead
    : T_READ declVar ';'
    ; //var -> id ?

//cmdWirite 
//    : T_WRITE expression {',' expression } ;

opTern
    : 'opTern'; //não implementado 

//block 
//    : '{' {cmdSimple} {command} '}' ;



StringLiteral
    :   EncodingPrefix? '"' SCharSequence? '"'
    ;


fragment
EncodingPrefix
    :   'u8'
    |   'u'
    |   'U'
    |   'L';

fragment
SCharSequence
    :   SChar+
    ;

fragment
SChar
    :   ~["\\\r\n]
    |   EscapeSequence
    |   '\\\n'   
    |   '\\\r\n'
    ;

fragment
EscapeSequence
    :   '\\' ['"?abfnrtv\\']
    ;
