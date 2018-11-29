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

public class Main {
    //TODO: 1.Não Esquecer de documentar o modo optimization do assembly
    public static void main(String[] args) throws IOException {
        String inputFile = null;
        boolean optimization = false;

        if (args[0] != null) inputFile = args[0];
        if (args[1] != null) optimization = Boolean.parseBoolean(args[1]);
        compile(inputFile, true, optimization);
    }

    public static void compile(String inputFile,
                               boolean dumpAssembly,
                               boolean optimization) throws IOException {

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

        LLVM.LLVMModuleRef mod = LLVMModuleCreateWithName("GraceLLVM");
        LLVM.LLVMContextRef context = LLVMContextCreate();
        LLVM.LLVMBuilderRef builder = LLVMCreateBuilder();
        LLVMEmitter.setInstance(
                context,
                mod,
                builder
        );
        LLVMEmitter.getInstance().Bootstrap();
        LLVMEmitter.getInstance().setOptimization(optimization);
        LLVMEmitter.getInstance().setDumpAssembly(dumpAssembly);
        Ast ast = new Ast();
        FrontEnd frontEnd = new FrontEnd(ast);
        walker.walk(frontEnd, tree);
        LLVMEmitter.getInstance().Finalize();
    }


}
