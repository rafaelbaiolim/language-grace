package uem.ast.stmt;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.ast.Position;
import uem.ast.expr.Expression;

import java.util.List;

import static org.bytedeco.javacpp.LLVM.*;

public class CondicionalStmt implements Statement {

    final String varName = null;
    private List<Statement> ifStmt;
    private List<Statement> elseStmt;
    private final Position position;
    private Expression cond;
    private Token symToken;

    public CondicionalStmt(Expression cond) {
        super();
        this.position = null;
        this.cond = cond;
        this.getLLVMValue();

    }

    public CondicionalStmt(List<Statement> ifStmt, Expression cond) {
        super();
        this.ifStmt = ifStmt;
        this.position = null;
        this.cond = cond;

    }

    public CondicionalStmt(List<Statement> ifStmt, List<Statement> elseStmt, Expression cond) {
        super();
        this.ifStmt = ifStmt;
        this.elseStmt = elseStmt;
        this.position = null;
        this.cond = cond;
        this.getLLVMValue();
    }

    @Override
    public String getVarName() {
        return varName;
    }

    @Override
    public void setSymbol(Token sym) {
        this.symToken = sym;
    }

    @Override
    public Token getSymbol() {
        return this.symToken;
    }


    @Override
    public Position getPosition() {
        return this.position;
    }

    public Expression getCond() {
        return this.cond;
    }

    public void setIfStatment(List<Statement> stmt) {
        this.ifStmt = stmt;
    }

    public void setElseStatment(List<Statement> stmt) {
        this.elseStmt = stmt;
    }

    public List<Statement> getIfStmt() {
        return this.ifStmt;
    }

    public List<Statement> getElseStmt() {
        return this.elseStmt;
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        LLVMPresets llvmp = LLVMPresets.getInstance();
        LLVMEmitter llve = LLVMEmitter.getInstance();

        LLVM.LLVMBasicBlockRef ifTrue = llvmp.buildBlock("iftrue");
        LLVM.LLVMBasicBlockRef ifFalse = llvmp.buildBlock("iffalse");
        LLVM.LLVMBasicBlockRef end = llvmp.buildBlock("ifend");

        LLVMBuildCondBr(
                llve.builder,
                this.cond.getLLVMValue(),
                ifTrue,
                ifFalse);

        LLVMPositionBuilderAtEnd(llve.builder, ifTrue);
        LLVMBuildBr(llve.builder, end);


        LLVMPositionBuilderAtEnd(llve.builder, end);
        return null;
    }

}
