package uem;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.antlr.GraceLexer;
import uem.antlr.GraceParser;
import uem.ast.Ast;
import uem.listners.FrontEnd;
import uem.semantic.ErrorReport;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.bytedeco.javacpp.LLVM.*;

class Main {

    public static void main(String[] args) throws IOException {
        LLVM.LLVMModuleRef mod = LLVMModuleCreateWithName("GraceLLVM");
        LLVM.LLVMContextRef context = LLVMContextCreate();
        LLVM.LLVMBuilderRef builder = LLVMCreateBuilder();
        LLVMEmitter Emmiter = new LLVMEmitter(
                context,
                mod,
                builder
        );
        Emmiter.Bootstrap().Finalize();
        System.exit(0);


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

        parser.setErrorHandler(new ErrorReport());

        ParseTree tree = parser.graceFile();
        ParseTreeWalker walker = new ParseTreeWalker();

        Ast ast = new Ast();
        FrontEnd frontEnd = new FrontEnd(ast);
        walker.walk(frontEnd, tree);


    }
}
