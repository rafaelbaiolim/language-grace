package uem.visitors;

import org.antlr.symtab.LocalScope;
import org.antlr.symtab.Scope;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;
import uem.ast.type.StopType;
import uem.ast.type.Type;
import uem.listners.FrontEnd;
import uem.semantic.CheckSymbols;

import static org.bytedeco.javacpp.LLVM.LLVMBuildBr;

public class StopVisitor extends GraceParserBaseVisitor<Statement> {
    public Statement visitCmStop(GraceParser.CmStopContext ctx) {
        LocalScope enclosing = FrontEnd.isWithinLoopScope();
        if (enclosing == null) {
            CheckSymbols.error(ctx.start, "error: stop statement not within loop.");
        }

        try (LLVM.LLVMBasicBlockRef endBlock = enclosing.getBlock("end")) {

            LLVMBuildBr(LLVMEmitter.getInstance().builder, endBlock);
        }

        return new StopType();
    }
}
