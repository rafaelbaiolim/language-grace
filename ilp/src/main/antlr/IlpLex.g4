lexer grammar IlpLex;

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
T_COMP  : '==' ;
T_EQUAL  : '=' ;
T_DIFFERENT  : '!=' ;
T_GREATER  : '>' ;
T_GREATER_OR_EQUAL  : '>=' ;
T_INCREMENT  : '+=' ;
T_DECREMENT  : '-=' ;
T_INC_MULT  : '*=' ;
T_INC_DIV  : '/=' ;
T_INC_MOD : '%=' ;
T_LOWER  : '<' ;
T_LOWER_OR_EQUAL  : '<=' ;
T_DOT : '.';
T_TERN : '?';

NEG_UN : '!';
OR : '||';
AND : '&&';

PLUS_INC  : '++' ;
MINUS_DEC : '--';


ID : [_]*[a-z][A-Za-z0-9_]* ;
COMMENT : '//' ~ [\r\n]* -> skip;

WS : [ \t\r\n]+ -> skip ;

NUMBER_LITERAL : [0-9]+;
STRING_LITERAL
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

