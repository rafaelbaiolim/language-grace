parser grammar IlpParser;
options { tokenVocab=IlpLexer; }

ilpFile : lines=line+ ;
line : command (WS | EOF);

command
    : cmdSimple
    | block
    ;

cmdSimple
    : cmdAtrib
    | cmdIf
    | cmdWhile
    | cmdFor
    | cmdStop
    | cmdSkip
    | cmdReturn
    | cmdCallProc
    | cmdRead
    | cmdWrite
    ;

cmdAtrib
    : atrib ';'
    ;

atrib
    : ID (T_EQUAL | T_INCREMENT | T_DECREMENT | T_INC_MULT | T_INC_DIV | T_INC_MOD ) expression
    ;

block
    : '{' declVar '}'
    | '{' command '}'
    ;

expression
    : left=expression operator='?' right=expression operator=':' right=expression
    | expression operator=('||' | '&&' | '==' | '!=' | '<' | '<=' | '>' | '>=' ) expression
    | expression operator=( '+'| '-' | '/' | '*' | '%') expression
    | ( '+' | '-' | '++' | '--' ) expression
    | '-' expression
    | '!' expression
    | '(' expression ')'
    | ID
    | NUMBER_LITERAL
    | STRING_LITERAL
    ;


cmdIf
    : T_IF '(' expression ')' command
    | T_ELSE command
    ;

cmdWhile
    : T_WHILE '(' expression ')' command
    ;

forInit
    : cmdAtrib
    ;

forItera
    : cmdAtrib
    ;

cmdFor
    : T_FOR '(' forInit ';' expression ';' forItera ')' command
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

cmdCallProc
    : ID '(' expression ')' ';';

lstOP
    : T_EQUAL
    | T_PLUS
    | T_MINUS
    | T_ASTERISK
    | T_PERCENT
    | T_SLASH
    ;

lstType
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
    : T_VAR listSpecVars ':' lstType ';'
    ;

cmdRead
    : T_READ (ID | STRING_LITERAL | NUMBER_LITERAL ) ';' //verificar se literais entram
    ;

cmdWrite
    : T_WRITE expression ';'
    | ',' expression
    ;

variable
    : ID
    | ID '[' expression ']'
    ;