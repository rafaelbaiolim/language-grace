parser grammar IlpParser;
options { tokenVocab=IlpLex; }

expression
    : T_FALSE
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
    : ID (T_EQUAL | T_INCREMENT | T_DECREMENT | T_INC_MULT | T_INC_DIV | T_INC_MOD ) expression
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
//    : ID '{' [ expression {',' expression} ] '}' ';';

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