package uem.visitors;

import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.Expression;
import uem.ast.stmt.WhileStmt;

import static org.bytedeco.javacpp.LLVM.LLVMBuildCondBr;
import static org.bytedeco.javacpp.LLVM.LLVMPositionBuilderAtEnd;
import static org.bytedeco.javacpp.LLVM.LLVMPositionBuilderBefore;

public class WhileVisitor extends GraceParserBaseVisitor<WhileStmt> {

    public WhileStmt visitCmdWhile(GraceParser.CmdWhileContext ctx) {
        WhileStmt whileStmt = new WhileStmt();

        LLVMPresets llvmp = LLVMPresets.getInstance();
        LLVMEmitter llve = LLVMEmitter.getInstance();

        LLVM.LLVMBasicBlockRef bCond = llvmp.buildBlock("whilecond");
        LLVM.LLVMBasicBlockRef bBody = llvmp.buildBlock("whilebody");
        LLVM.LLVMBasicBlockRef bEnd = llvmp.buildBlock("whileend");

        Expression exprCond = new ExpressionVisitor().visit(ctx.expression());
//        LLVMPositionBuilderAtEnd(llve.builder,bEnd);
//        LLVMBuildCondBr(
//                LLVMEmitter.getInstance().builder,
//                exprCond.getLLVMValue(),
//                bBody,
//                bEnd);

//        LLVMPositionBuilderAtEnd(llve.builder, bCond);
//        LLVMBuildBr(llve.builder, bCond);

        whileStmt.setCond(exprCond);


        String nodeCtxStr = ctx.command().getClass().getSimpleName().toLowerCase();

        //Visitor de block
        whileStmt.setStatment(new CommandVisitor().visit(ctx.command()));

        return whileStmt;
    }

}