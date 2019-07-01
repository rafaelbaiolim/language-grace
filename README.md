# Grace Language

Grace is a language with an academic purpose, elaborated on course of Compilers (Computer Science) from State University of Maringa. The version of this repository was developed using [Antlr4](https://www.antlr.org/), [Java 9](https://www.oracle.com/java/java9.html), [Gradle](https://gradle.org/), [LLVM 8.0](https://llvm.org/) and [JavaCPP](https://github.com/bytedeco/javacpp-presets) for generate the intermediate code.

The grammar of the language as well lexical, semantic and syntactic specifications can be consulted in:

https://din-ilp2018.readthedocs.io/en/latest

Execution
==============================

Parameters 
----------

| Arg          | Description      |
| ------------- | ------------- |
| 0 | Absolute path of .grc file |
| -o | Enable LLVM optimizations |
| -a | Abort IR generation for modules with warnings/errors |
| -nd | Do not show the IR dump on terminal |

> `The IR output file is generated on: tests/assets/llvm/out.bc`


Console
------
> `Only execute this step if package uem.antlr was empty.This repository already have one compiled version of this step`

1. Execute ANTLR4 with Gradle as follow, for generate lex and parser files 
```
$ gradle generateGrammarSource && gradle copyTokenFile
```

InteliJ
------
The build of this project as well as the unit tests were
running on the InteliJ Community IDE. This is how execute:

1. Create a test `.grc` file on `tests/assets/parser/`, 
and use this file as first argument on IDE execution. 

2. F6 key, for execute and generate the assembly of language 

3. On terminal (you could use IDE terminal), execute: ``$lli unit/assets/llvm/out.bc``
(This should output the result of your code)

Antrl4
==============================
The .G4 files `src/main/antlr` can be executed or tested
with the antrl4 tool:
```
$ antlr4 *.g4
$ javac *.java
$ grun Grace command -tree 
```
I strongly recommend you to install [ANTLR4 plugin for InteliJ](https://plugins.jetbrains.com/plugin/7358-antlr-v4-grammar-plugin). 
This way you can debug and validate your grammar much faster. 

Unit Tests
==============================
All tests was written in XML structure, if you want create one you could do as follow:

1. Set the `tests` folder as `test resource` on `project structure` of your IDE.
2. Because JavaCPP has the most methods and builders on static way, you must write each test in a separated XML.
3. Add a new entry [ with XML name on array of tests files](https://github.com/rafaelbaiolim/compilador2018/blob/1b96d887462019dc72f0044f1fd282c2553cbbbd/tests/unit/CompillerTest.java#L29) and [create a new static final String of the line that references this entry on CompillerTest.java](https://github.com/rafaelbaiolim/compilador2018/blob/1b96d887462019dc72f0044f1fd282c2553cbbbd/tests/unit/CompillerTest.java#L57) .

This is how your XML test should like:
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

| Tag          | Description          |
| ------------- | ------------- |
| wanted | Expected value of llvm output |
| type | EQUALS or NOT_EQUALS |
| optimize | Use llvm optimizations ( true or false) |
| file | Absoule path of your `.grc` code |

> I really hope this implementation helps someone who needs help with compiler development.
