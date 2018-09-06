parser grammar IlpParser;
options { tokenVocab=IlpLexer; }

ilpFile : lines=line+ ;
line : statement;

command
    : cmdSimple
    | block
    ;

statement
    : declVar # assignmentStatement
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
    : left=expression operator='?' right=expression operator=':' right=expression  # binaryOperation
    | expression operator=('||' | '&&' | '==' | '!=' | '<' | '<=' | '>' | '>=' ) expression  # binaryOperation
    | expression operator=( '+'| '-' | '/' | '*' | '%') expression # binaryOperation
    | expression ( '+' | '-' | '++' | '--' ) # binaryOperation
    | '-' expression        # minusExpression
    | '!' expression        # differenceExpression
    | '(' expression ')'    # parenExpression
    | ID                    # varReference
    | literal               # literalReference
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
    : T_INT       # integer
    | T_STRING    # string
    | T_BOOL      # bool
    ;

literal
    : NUMBERLITERAL  # intLiteral
    | STRINGLITERAL  # stringLiteral
    | T_FALSE        # trueLiteral
    | T_TRUE         # falseLiteral
    ;

specVarSimple
    : ID
    | ID '=' literal
    ;

specVarSimpleIni
    : specVarSimple lstOP specVarSimple
    ;

specVarArr
    : specVarSimple '[' NUMBERLITERAL ']'
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
    : specVar                       # directSpecVar
    | specVar ',' listSpecVars      # indirectSpecVar
    ;

declVar
    : T_VAR listSpecVars ':' lstType ';'
    ;

cmdRead
    : T_READ (ID | STRINGLITERAL | NUMBERLITERAL ) ';' //verificar se literais entram
    ;

cmdWrite
    : T_WRITE expression ';'
    | ',' expression
    ;

variable
    : ID
    | ID '[' expression ']'
    ;