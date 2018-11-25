parser grammar GraceParser;
options { tokenVocab=GraceLexer; }
/**
    https://din-ilp2018.readthedocs.io/en/latest/espec_sintatica.html
    Docs » Especificação Sintática 0.6
    Verificar se o programa sempre iniciar com proc / func
**/

@header {
    import org.antlr.symtab.*;
}

graceFile returns [Scope scope]:
    (statement)+ ;

statement
    : declVar #declVarStatement
    | decSub  #decSubStatement
    | command #cmd
    ;

expression
    : left=expression operator='?' right=expression operator=':' right=expression                       #ternaryOperation
    | left=expression operator=('||' | '&&' | '==' | '!=' | '<' | '<=' | '>' | '>=' ) right=expression  #compareOperation
    | left=expression operator=( '+'| '-' | '/' | '*' | '%') right=expression                           #binaryOperation
    | left=expression ( '+' | '-' | '++' | '--' )                                                       #incrementOperation
    | '-' expression                                                                                    #minusExpression
    | '!' expression                                                                                    #differenceExpression
    | '(' expression ')'                                                                                #parenExpression
    | ID '(' expression ')'                                                                             #subReference
    | ID '[' expression ']'                                                                             #arrReference
    | ID                                                                                                #varReference
    | literal                                                                                           #literalReference
    ;

// Variáveis

declVar returns [Scope scope]
    : 'var' listSpecVars ':' lstType ';'
    ;

listSpecVars
    : specVar (',' specVar)*
    ;

specVar
    : specVarSimple      #directSpecVar
    | specVarSimpleIni   #directSpecVarSimpleIni
    | specVarArr         #directSpecVarArr
    | specVarArrIni      #directSpecVarArrIni
    ;

specVarSimple
    : ID
    ;

specVarSimpleIni
    : ID '=' expression
    ;

specVarArr
    : ID '[' NUMBERLITERAL+ ']' //posição sempre alocada como uma constante de inteiro
    ;

specVarArrIni
    : specVarArr '=' '{' literal (',' literal)* '}'
    ;

// Declaração de Subprogramas

decSub
    : decProc #procedure
    | decFunc #function
    ;

// Declaração de Procedimentos

decProc returns [Scope scope]
    : 'def' ID '(' lstParam? ')' block
    ;

decFunc returns [Scope scope]
    : 'def' ID '(' lstParam? ')' ':' lstType block
    ;

// Lista de Parâmetros

lstParam
    : specParam (';' specParam)*
    ;

specParam
    : param (',' param)* ':' lstType
    ;

param
    : ID         #idParam
    | ID '[' ']' #arrParam
    ;

// Comandos

command
    : cmdSimple #cmsimple
    | block     #cmblock
    ;


// A seguir são especificados os comandos simples:

cmdSimple
    : cmdAtrib    #cmAtrib
    | cmdIf       #cmIf
    | cmdWhile    #cmWhile
    | cmdFor      #cmFor
    | cmdStop     #cmStop
    | cmdSkip     #cmSkip
    | cmdReturn   #cmReturn
    | cmdCallProc #cmProc
    | cmdRead     #cmRead
    | cmdWrite    #cmWrite
    ;

// Atribuição

cmdAtrib
    : atrib ';'     #atribVar
    | arrAtrib ';'  #atribArr
    ;

arrAtrib
    : ID '[' expression ']' ('='|'+='|'-='|'*='|'/='|'%=') expression
    ;

atrib
    : ID ('='|'+='|'-='|'*='|'/='|'%=') expression
    ;

// Condicional If

cmdIf
    : 'if' '(' expression ')' command ('else' command)*
    ;

// Laço While

cmdWhile
    : 'while' '(' expression ')' command
    ;

// Laço For

cmdFor
    : 'for' '(' forInit ';' expression ';' forItera ')' command
    ;

forInit
    : atrib // #ask:só entra number aqui ??
    ;

forItera
    : atrib // #ask:=forInit
    ;

// Interrupção de Laço

cmdStop
    : 'stop' ';'
    ;

// Salto de iteração do laço

cmdSkip
    : 'skip' ';'
    ;

// Retorno de subprograma

cmdReturn
    : 'return' (expression)* ';'
    ;

// Chamada de procedimento

cmdCallProc
    : ID '(' (expression* (',' expression)? ) ')' ';'
    ;

// Entrada Read

cmdRead
    : 'read' variable ';'
    ;

// Saída Write

cmdWrite
    : 'write' expression (',' expression)* ';'
    ;

// Bloco de Comandos

block returns [Scope scope]
    : '{' statement* '}'
    ;
// Operador Ternário (opTern -> exp:ternaryOperation)

// Uso de Variável

variable
    : ID                      #simpleVar
    | ID '[' expression+ ']'  #arrVar  //#ask: Tratar boleanos ? i[] < não casa com a regra de variable então?
    ;


// Listas de Tipos

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
    | stringLit   # string
    | T_BOOL      # bool
    ;

stringLit
    : 'string'                          # initLit
    | 'string' '[' NUMBERLITERAL+ ']'   # initArrAloc
    ;


literal
    : NUMBERLITERAL  # intLiteral
    | STRINGLITERAL  # stringLiteral
    | T_FALSE        # trueLiteral
    | T_TRUE         # falseLiteral
    ;
