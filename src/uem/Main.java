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

/**
 * Rafael Baiolim  .:83021
 * Thiago Alberto  .:82703
 * Ricardo Andrade .:61653
 */
public class Main {

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        boolean optimization = false;
        boolean dumpAssembly = true;
        boolean abortModLLVMOnFail = false;

        if (args.length > 0) {
            inputFile = args[0];
        }else{
            throw new Exception("First argument require a .grc file.");
        }

        if (args.length > 1) {
            for (String arg : args) {
                if (arg.toLowerCase().equals("-a")) {
                    abortModLLVMOnFail = true;
                }
                if (arg.toLowerCase().equals("-o")) {
                    optimization = true;
                }
                if (arg.toLowerCase().equals("-nd")) { //no dump
                    dumpAssembly = false;
                }
            }
        }
        compile(inputFile, dumpAssembly, optimization, abortModLLVMOnFail);
    }

    public static void compile(String inputFile,
                               boolean dumpAssembly,
                               boolean optimization,
                               boolean abortOnFail)
            throws IOException {

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
        //flags dinâmicas de inicialização
        LLVMEmitter.getInstance().setOptimization(optimization);
        LLVMEmitter.getInstance().setDumpAssembly(dumpAssembly);
        LLVMEmitter.getInstance().setAbortOnLLVMFail(abortOnFail);

        Ast ast = new Ast();
        FrontEnd frontEnd = new FrontEnd(ast);
        walker.walk(frontEnd, tree);
        LLVMEmitter.getInstance().Finalize();
    }


}
