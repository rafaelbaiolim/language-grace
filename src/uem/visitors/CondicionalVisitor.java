package uem.visitors;

import org.antlr.symtab.LocalScope;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.Expression;
import uem.ast.stmt.CondicionalStmt;
import uem.ast.stmt.Return;
import uem.ast.stmt.Statement;
import uem.ast.stmt.cmd.ReturnCmd;
import uem.listners.FrontEnd;
import uem.symtab.CondScope;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static org.bytedeco.javacpp.LLVM.*;

public class CondicionalVisitor extends GraceParserBaseVisitor<CondicionalStmt> {
    static int hasBuilt = 0;

    public CondicionalStmt visitCmdIf(GraceParser.CmdIfContext ctx) {
        CondicionalVisitor.hasBuilt = 0;
        LocalScope locScope = new CondScope(FrontEnd.currentScope);
        FrontEnd.pushScope(locScope);

        boolean avoidBRIF = false, avoidBRElse = false;

        LLVMEmitter llve = LLVMEmitter.getInstance();
        LLVMPresets llvp = LLVMPresets.getInstance();

        LLVM.LLVMBasicBlockRef ifTrue = llvp.buildBlock("iftrue");
        LLVM.LLVMBasicBlockRef ifFalse = llvp.buildBlock("iffalse");
        LLVM.LLVMBasicBlockRef end = null;

        CondicionalStmt condicionalStmt = new CondicionalStmt();
        Expression exprCond = new ExpressionVisitor().visit(ctx.expression());
        LLVM.LLVMValueRef cond = exprCond.getLLVMValue();

        LLVMBuildCondBr(
                LLVMEmitter.getInstance().builder,
                cond,
                ifTrue,
                ifFalse);

        LLVMPositionBuilderAtEnd(llve.builder, ifTrue);
        condicionalStmt.setCond(exprCond);

        /////verifica se tem ELSE
        AtomicInteger i = new AtomicInteger();
        int totalComands = ctx.command().toArray().length;
        AtomicBoolean temElseStmt = new AtomicBoolean(false);
        if (ctx.getTokens(GraceParser.T_ELSE).toArray().length > 0) {
            temElseStmt.set(true);
        }
        boolean finalTemElseStmt = temElseStmt.get();
        /////

        AtomicReference<List<Statement>> lstElse = new AtomicReference<>();
        AtomicReference<List<Statement>> lstIF = new AtomicReference<>();


        for (GraceParser.CommandContext stmt : ctx.command()) {
            if (finalTemElseStmt && (i.get() == (totalComands - 1))) { //else
                LLVMPositionBuilderAtEnd(llve.builder, ifFalse);
                lstElse.set(new CommandVisitor().visit(stmt));
                if (this.canAppendBR(lstElse.get())) {
                    this.builtEnd(end);
                    LLVMBuildBr(llve.builder, end);
                    avoidBRElse = true;
                }
                LLVMPositionBuilderAtEnd(llve.builder, end);
                continue;
            }
            lstIF.set(new CommandVisitor().visit(stmt));
            i.getAndIncrement();
            if (this.canAppendBR(lstIF.get())) {
                this.builtEnd(end);
                LLVMBuildBr(llve.builder, end);
                avoidBRIF = true;
            }
        }

        if (!finalTemElseStmt) {//não tem else
            this.builtEnd(end);
            LLVMPositionBuilderAtEnd(llve.builder, ifFalse);
            LLVMBuildBr(llve.builder, end);
            LLVMPositionBuilderAtEnd(llve.builder, end);
        }

        condicionalStmt.setElseStatment(lstElse.get());
        condicionalStmt.setIfStatment(lstIF.get());
        if (CondicionalVisitor.hasBuilt > 0) {
            LLVMPositionBuilderAtEnd(llve.builder, end);
        }
        if (avoidBRElse && avoidBRIF) {
            LLVMBuildRetVoid(llve.builder);
        }
        return condicionalStmt;
    }

    private boolean canAppendBR(List<Statement> statements) {
        boolean appendBR = true;
        for (Statement st : statements) {
            if (st instanceof Return) {
                appendBR = false;
            }
        }
        return appendBR;
    }

    private void builtEnd(LLVM.LLVMBasicBlockRef end) {
        if (CondicionalVisitor.hasBuilt == 0) {
            end = LLVMPresets.getInstance().buildBlock("ifend");
            return;
        }
        CondicionalVisitor.hasBuilt++;
    }


}
