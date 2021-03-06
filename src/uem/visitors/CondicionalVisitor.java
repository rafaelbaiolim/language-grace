package uem.visitors;

import org.antlr.symtab.FunctionSymbol;
import org.antlr.symtab.LocalScope;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.Expression;
import uem.ast.stmt.CondicionalStmt;
import uem.ast.stmt.Statement;
import uem.ast.stmt.sub.DeclFunction;
import uem.ast.type.IntegerType;
import uem.listners.FrontEnd;
import uem.symtab.CondScope;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static org.bytedeco.javacpp.LLVM.*;

public class CondicionalVisitor extends GraceParserBaseVisitor<CondicionalStmt> {

    public CondicionalStmt visitCmdIf(GraceParser.CmdIfContext ctx) {
        LocalScope locScope = new CondScope(FrontEnd.currentScope);
        FrontEnd.pushScope(locScope);

        LLVMEmitter llve = LLVMEmitter.getInstance();
        LLVMPresets llvp = LLVMPresets.getInstance();

        LLVM.LLVMBasicBlockRef ifTrue = llvp.buildBlock("iftrue");
        LLVM.LLVMBasicBlockRef ifFalse = llvp.buildBlock("iffalse");
        LLVM.LLVMBasicBlockRef end = llvp.buildBlock("ifend");

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
                LLVMBuildBr(llve.builder, end);
                LLVMPositionBuilderAtEnd(llve.builder, end);
                continue;
            }

            lstIF.set(new CommandVisitor().visit(stmt));
            i.getAndIncrement();
            if (llve.canPutTerminatorInst(ifTrue)) {
                LLVMBuildBr(llve.builder, end);
            }

        }

        if (!finalTemElseStmt) {//não tem else
            LLVMPositionBuilderAtEnd(llve.builder, ifFalse);
            LLVMBuildBr(llve.builder, end);
            if (llve.canPutTerminatorInst(ifTrue)) {
                LLVMPositionBuilderAtEnd(llve.builder, end);
            }
        }

        condicionalStmt.setElseStatment(lstElse.get());
        condicionalStmt.setIfStatment(lstIF.get());
        LLVMPositionBuilderAtEnd(llve.builder, end);
        FrontEnd.popScope();
        return condicionalStmt;
    }


    public CondicionalStmt visitTernaryOperation(GraceParser.TernaryOperationContext ctx) {
        LLVMEmitter lle = LLVMEmitter.getInstance();
        Expression exprCond = new ExpressionVisitor().visit(ctx.left); //Condição

        //if label
        Expression eThen = new ExpressionVisitor().visit(ctx.right.left);

        //else label
        Expression eElse = new ExpressionVisitor().visit(ctx.right.right);

        CondicionalStmt condicionalStmt = new CondicionalStmt();

        condicionalStmt.setCond(exprCond);
        condicionalStmt.seteThen(eThen);
        condicionalStmt.seteElse(eElse);

        return condicionalStmt;
    }


}