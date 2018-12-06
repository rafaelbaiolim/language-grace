# :carousel_horse:  Trabalho ILP 2018 

Informática UEM 
================
Repositório destinado a Implementação do Trabalho de ILP 2018 
utilizando a ferramenta antrl4.

Doc Online Compilada.: https://din-ilp2018.readthedocs.io/en/latest

[Branch de Instalação do Antrl4](https://github.com/rafaelbaiolim/compilador2018/tree/starting)


Execução
==============================

Terminal
------
1. ANTLR4 Lex e Parser (executar somente se o pacote uem.antlr estiver vazio)
```
$ gradle generateGrammarSource && gradle copyTokenFile
```

InteliJ
------
A build deste projeto assim como os testes unitários estão
sendo executados na IDE InteliJ Community.


1. Configurar como argumento de execução o arquivo de teste (colocar os arquivos de teste em unit/assets/(parser|lex))
2. F6 para executar e gerar o assembly da linguagem 
3. No terminal, pode ser da própria IDE, execute: ``$lli unit/assets/llvm/out.bc`` 

Antrl4
==============================
Os arquivos .g4 (src/main/antlr) podem ser executados/ testados 
com a ferramenta antrl4 separadamente.

```
$ antlr4 *.g4
$ javac *.java
$ grun Ilp command -tree 
```
Caso o nome da linguagem seja alterado manter os arquivos no formato
['NomeLP']Lexer.g4 e ['NomeLP']Parser.g4

Livros 
==============================

| Link          | Nome          |
| ------------- | ------------- |
| [Download](https://drive.google.com/open?id=1xb9krsQnkukff2TdJAjoUP7A07t8Y4I6)  | The Definitive ANTLR4 Reference  |
| [Download](https://drive.google.com/open?id=1U50fYxzygedAnlvL41KbZsmv522Q6czU)  | Language Implementation Patterns |

Testes Unitários
==============================
1. Setar a pasta de `tests` como `test resource` na IDE.
2. Como a LLVM possui a maior parte dos métodos e builders estáticos, 
é necessário escrever cada teste em um XML separado.
3. Insira uma nova entrada no [array de arquivos de testes](https://github.com/rafaelbaiolim/compilador2018/blob/1b96d887462019dc72f0044f1fd282c2553cbbbd/tests/unit/CompillerTest.java#L29) e 
em seguida [insira a linha que referencia a entrada criada](https://github.com/rafaelbaiolim/compilador2018/blob/1b96d887462019dc72f0044f1fd282c2553cbbbd/tests/unit/CompillerTest.java#L57) .

Abaixo é mostrado um exemplo de teste unitário do trabalho

| Tag          | Descrição          |
| ------------- | ------------- |
| wanted | Valor esperado do output  |
| type | EQUALS ou NOT_EQUALS |
| optimize | Utilizar Otimizações ( true / false) |
| file | Caminho absoluto do arquivo de teste XML |

```xml
<tests>
    <test>
        <wanted>0 1 1 2 3</wanted>
        <type>EQUALS</type>
        <optimize>true</optimize>
        <file>CAMINHO_ABSOLUTO/test-fib.grc</file>
    </test>
</tests>
```
