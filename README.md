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
* [x] Var

