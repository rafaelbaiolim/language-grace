package uem;

import org.antlr.v4.runtime.CommonTokenStream;
import uem.antlr.IlpParser;
import uem.parser.ParseTree;

import java.io.IOException;

class Main {

    public static void main(String[] args) throws IOException {
        uem.Lexer lex = new uem.Lexer();
        CommonTokenStream cm = new CommonTokenStream(lex.lexFromCode("var a :int;"));
        ParseTree pt = new ParseTree();
        System.out.println(pt.getParseTree(new IlpParser(cm).declVar()).identationMultLines());
    }
}
