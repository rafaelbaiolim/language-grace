# :carousel_horse:  Trabalho ILP 2018 

Informática UEM 
================
Repositório destinado a Implementação do Trabalho de ILP 2018 
utilizando a ferramenta antrl4.

Doc Online Compilada.: https://din-ilp2018.readthedocs.io/en/latest

[Branch de Instalação do Antrl4](https://github.com/rafaelbaiolim/compilador2018/tree/starting)

InteliJ 
==============================

A build deste projeto assim como os testes unitários estão
sendo executados na IDE InteliJ Community 

Execução
==============================
No terminal da IDE 

```
$ gradle generateGrammarSource && gradle copyTokenFile
```

Antrl4
==============================
Os arquivos .g4 (src/main/antlr) podem executados/ testados 
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
1. [Download](https://drive.google.com/open?id=1xb9krsQnkukff2TdJAjoUP7A07t8Y4I6) -> The Definitive ANTLR4 Reference

2. [Download](https://drive.google.com/open?id=1U50fYxzygedAnlvL41KbZsmv522Q6czU) -> Language Implementation Patterns


Testes Unitários
==============================
* [x] Var

