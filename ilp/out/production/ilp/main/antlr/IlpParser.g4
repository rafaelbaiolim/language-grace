parser grammar IlpParser;
options { tokenVocab=IlpLex; }

command
    : cmdSimple;


cmdSimple
    : cmdAtrib
    | cmdIf
    ;

cmdAtrib
    : atrib ';'
    ;


atrib
    : ID (T_EQUAL | T_INCREMENT | T_DECREMENT | T_INC_MULT | T_INC_DIV | T_INC_MOD ) expr
    ;

blocK
    : '{' declVar '}'
    | '{' command '}'
    ;

expr
    : left=expr operator='?' right=expr operator=':' right=expr
    | expr operator=('||' | '&&' | '==' | '!=' | '<' | '<=' | '>' | '>=' ) expr
    | expr operator=( '+'| '-' | '/' | '*' | '%') expr
    | ( '+' | '-' | '++' | '--' ) expr
    | '-' expr
    | '!' expr
    | '(' expr ')'
    | ID
    | NUMBER_LITERAL
    | STRING_LITERAL
    ;


cmdIf
    : T_IF '(' expr ')' command
    | T_ELSE command
    ;

cmdWhile
    : T_WHILE '(' expr ')' command
    ;

forInit
    : cmdAtrib;

forItera
    : cmdAtrib;

cmdFor
    : T_FOR '(' forInit ';' expr ';' forItera ')' command
    ;

cmdStop
    : T_STOP ';'
    ;

cmdSkip
    : T_SKIP ';'
    ;

cmdReturn
    : T_RETURN  expr ';'
    ;

cmdCallProc
    : ID '(' expr {',' expr} ')' ';';

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
    : NUMBER_LITERAL
    | STRING_LITERAL
    | T_FALSE
    | T_TRUE
    ;

specVarSimple
    : ID
    | ID T_EQUAL literal
    ;

specVarSimpleIni
    : specVarSimple lstOP specVarSimple
    ;

specVarArr
    : specVarSimple '[' NUMBER_LITERAL ']'
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