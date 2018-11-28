package uem.visitors;

import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.Expression;
import uem.ast.stmt.WhileStmt;

import static org.bytedeco.javacpp.LLVM.*;

public class WhileVisitor extends GraceParserBaseVisitor<WhileStmt> {

    public WhileStmt visitCmdWhile(GraceParser.CmdWhileContext ctx) {
        WhileStmt whileStmt = new WhileStmt();

        LLVMPresets llvmp = LLVMPresets.getInstance();
        LLVMEmitter llve = LLVMEmitter.getInstance();

        LLVM.LLVMBasicBlockRef bCond = llvmp.buildBlock("while.cond");
        LLVM.LLVMBasicBlockRef bBody = llvmp.buildBlock("while.body");
        LLVM.LLVMBasicBlockRef bEnd = llvmp.buildBlock("while.end");

        Expression exprCond = new ExpressionVisitor().visit(ctx.expression());
        LLVMBuildBr(llve.builder, bCond);
        LLVMPositionBuilderAtEnd(llve.builder, bCond);

        LLVMBuildCondBr(
                LLVMEmitter.getInstance().builder,
                exprCond.getLLVMValue(),
                bBody,
                bEnd);


        whileStmt.setCond(exprCond);
        String nodeCtxStr = ctx.command().getClass().getSimpleName().toLowerCase();

        //Visitor de block
        LLVMPositionBuilderAtEnd(llve.builder, bBody);
        whileStmt.setStatment(new CommandVisitor().visit(ctx.command()));
        LLVMBuildBr(llve.builder, bCond);

        LLVMPositionBuilderAtEnd(llve.builder, bEnd);
        return whileStmt;
    }

}