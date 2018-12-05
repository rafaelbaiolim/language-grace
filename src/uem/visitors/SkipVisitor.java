package uem.visitors;

import org.antlr.symtab.LocalScope;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;
import uem.ast.type.SkipType;
import uem.listners.FrontEnd;
import uem.semantic.CheckSymbols;

import static org.bytedeco.javacpp.LLVM.LLVMBuildBr;

public class SkipVisitor extends GraceParserBaseVisitor<Statement> {
    public Statement visitCmSkip(GraceParser.CmSkipContext ctx) {
        LocalScope enclosing = FrontEnd.isWithinLoopScope();
        if (enclosing == null) {
            CheckSymbols.error(ctx.start, "error: skip statement not within loop.");
        } else {
            try (LLVM.LLVMBasicBlockRef endBlock = enclosing.getBlock("cond")) {
                LLVMBuildBr(LLVMEmitter.getInstance().builder, endBlock);
            }
        }
        return new SkipType();
    }
}
