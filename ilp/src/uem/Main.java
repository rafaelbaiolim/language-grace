package uem;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import uem.antlr.GraceLexer;
import uem.antlr.GraceParser;
import uem.parser.TreeToAst;
import uem.visitors.GraceFileVisitor;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class Main {

    public static void main(String[] args) throws IOException {

        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream inputFileStream = System.in;
        if (inputFile != null) {
            inputFileStream = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(inputFileStream);
        GraceLexer lexer = new GraceLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GraceParser parser = new GraceParser(tokens);
        /**
         * @todo: retornar a validação de blocos depois de implementar visitors
         */
        ParseTree tree = parser.graceFile();

        GraceFileVisitor loader = new GraceFileVisitor();
        loader.visit(tree);

    }
}
