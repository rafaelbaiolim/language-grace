package uem.visitors;

import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.Expression;
import uem.ast.stmt.ForStmt;
import uem.ast.stmt.Statement;
import uem.ast.stmt.cmd.AtribCmd;

import java.util.List;

import static org.bytedeco.javacpp.LLVM.*;

public class ForVisitor extends GraceParserBaseVisitor<ForStmt> {

    public ForStmt visitCmdFor(GraceParser.CmdForContext ctx) {
        ForStmt forStmt = new ForStmt();

        LLVMPresets llvmp = LLVMPresets.getInstance();
        LLVMEmitter llve = LLVMEmitter.getInstance();

        LLVM.LLVMBasicBlockRef bCond = llvmp.buildBlock("for.cond");
        LLVM.LLVMBasicBlockRef bItera = llvmp.buildBlock("for.itera");
        LLVM.LLVMBasicBlockRef bBody = llvmp.buildBlock("for.body");
        LLVM.LLVMBasicBlockRef bEnd = llvmp.buildBlock("for.end");
        AtribCmd forInit = new AtribVisitor().visit(ctx.forInit().atrib());
        forStmt.setInit(forInit);
        forInit.getLLVMValue();

        Expression exprCond = new ExpressionVisitor().visit(ctx.expression());
        forStmt.setCond(exprCond);
        LLVMBuildBr(llve.builder, bCond);

        LLVMPositionBuilderAtEnd(llve.builder, bCond);
        LLVMBuildCondBr(
                LLVMEmitter.getInstance().builder,
                exprCond.getLLVMValue(),
                bBody,
                bEnd);

        LLVMPositionBuilderAtEnd(llve.builder, bBody);
        List<Statement> body = new CommandVisitor().visit(ctx.command());
        forStmt.setStmt(body);

        LLVMBuildBr(llve.builder, bItera);
        LLVMPositionBuilderAtEnd(llve.builder, bItera);

        AtribCmd forItera = new AtribVisitor().visit(ctx.forItera().atrib());
        forStmt.setItera(forItera);
        LLVMPositionBuilderAtEnd(llve.builder, bItera);
        LLVMBuildBr(llve.builder, bCond);
        LLVMPositionBuilderAtEnd(llve.builder, bEnd);

        return forStmt;
    }


}
