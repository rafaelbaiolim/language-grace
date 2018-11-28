package uem.visitors;

import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.Expression;
import uem.ast.stmt.WhileStmt;

import static org.bytedeco.javacpp.LLVM.LLVMBuildBr;
import static org.bytedeco.javacpp.LLVM.LLVMBuildCondBr;
import static org.bytedeco.javacpp.LLVM.LLVMPositionBuilderAtEnd;

public class WhileVisitor extends GraceParserBaseVisitor<WhileStmt> {

    public WhileStmt visitCmdWhile(GraceParser.CmdWhileContext ctx) {
        WhileStmt whileStmt = new WhileStmt();

        LLVMPresets llvmp = LLVMPresets.getInstance();
        LLVMEmitter llve = LLVMEmitter.getInstance();

        LLVM.LLVMBasicBlockRef bCond = llvmp.buildBlock("while.cond");
        LLVM.LLVMBasicBlockRef bBody = llvmp.buildBlock("while.body");
        LLVM.LLVMBasicBlockRef bEnd = llvmp.buildBlock("while.end");


        Expression exprCond = new ExpressionVisitor().visit(ctx.expression());
        LLVMBuildCondBr(
                LLVMEmitter.getInstance().builder,
                exprCond.getLLVMValue(),
                bBody,
                bEnd);
        LLVMPositionBuilderAtEnd(llve.builder, bBody);

        whileStmt.setCond(exprCond);


        String nodeCtxStr = ctx.command().getClass().getSimpleName().toLowerCase();
        if (nodeCtxStr.equals(GraceParser.CmdSimpleContext.class.getSimpleName().toLowerCase())) {
            //Visitor de comando simples
        } else {
            //Visitor de block
            whileStmt.setStatment(new CommandVisitor().visit(ctx.command()));
        }


        return whileStmt;
    }


}
