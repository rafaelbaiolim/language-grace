parser grammar GraceParser;
options { tokenVocab=GraceLexer; }
/**
    https://din-ilp2018.readthedocs.io/en/latest/espec_sintatica.html
    Docs » Especificação Sintática 0.6
    Verificar se o programa sempre iniciar com proc / func
**/


/*
#ask o livro diz que ANTLR4 consegue lidar com recursões diretas a esquerda
associado o operador na ordem esquerd -> direita,
trata a Grace para remover e nunca ter a esquerda? ou segue o baile ?
*/

graceFile : lines=line+ ;
line : statement; //#ask: É obrigatório ter uma 'main' ? programa ::= dec {dec}

statement
    : declVar #declVarStatement
    | atrib   #assignmentStatement
    | decSub  #decSubStatement
    ;

expression
    : left=expression operator='?' right=expression operator=':' right=expression                       #ternaryOperation
    | left=expression operator=('||' | '&&' | '==' | '!=' | '<' | '<=' | '>' | '>=' ) right=expression  #compareOperation
    | left=expression operator=( '+'| '-' | '/' | '*' | '%') right=expression                           #binaryOperation
    | left=expression ( '+' | '-' | '++' | '--' )                                                       #incrementOperation
    | '-' expression                                                                                    #minusExpression
    | '!' expression                                                                                    #differenceExpression
    | '(' expression ')'                                                                                #parenExpression
    | ID                                                                                                #varReference
    | literal                                                                                           #literalReference
    ;

// Variáveis

declVar
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
    //{$block::symbols.add($ID.text);}
    ;

specVarSimpleIni
    : ID '=' expression
    //{$block::symbols.add($ID.text);}
    ;


specVarArr
    : specVarSimple '[' NUMBERLITERAL+ ']'
    ;

specVarArrIni
    : specVarArr '=' '{' literal (',' literal)* '}'
    ;

// Declaração de Subprogramas

decSub
    : decProc | decFunc
    ;

// Declaração de Procedimentos

decProc
    : 'def' ID '(' lstParam ')' block
    ;

 decFunc
    : 'def' ID '(' lstParam ')' ':' lstType block // #TODO.: Colocar regrade de scope aqui
    ;


// Lista de Parâmetros

lstParam
    : specParam (',' specParam)*  //#ask: listParam não pode ser vazia ? vide gramática
    ;

specParam
    : param (',' param)* ':' lstType
    ;

param
    : ID
    | ID '[' ']'
    ;

// Comandos

command
    : cmdSimple
    | block
    ;


// A seguir são especificados os comandos simples:

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

// Atribuição

cmdAtrib
    : atrib ';'
    ;

atrib
    : ID ('='|'+='|'-='|'*='|'/='|'%=') expression
        {
            if( !$block::symbols.contains($ID.text) ){
                System.err.println( "Undefined var: " + $ID.text );
            }
        }
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
    : atrib  // #ask:só entra number aqui ??
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

block
locals [ List<String> symbols = new ArrayList<>() ]
    : '{' declVar* command* '}'
    {System.out.println("symbols=" + $symbols);}
    ;

// Operador Ternário (opTern -> exp:ternaryOperation)

// Uso de Variável

variable
    : ID
    | ID '[' expression+ ']' //#ask: Tratar boleanos ? i[] < não casa com a regra de variable então?
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
    | T_STRING    # string
    | T_BOOL      # bool
    ;

literal
    : NUMBERLITERAL  # intLiteral
    | STRINGLITERAL  # stringLiteral
    | T_FALSE        # trueLiteral
    | T_TRUE         # falseLiteral
    ;
