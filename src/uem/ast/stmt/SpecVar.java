package uem.ast.stmt;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.ast.Position;
import uem.ast.expr.Expression;

import static org.bytedeco.javacpp.LLVM.*;

public class SpecVar implements Statement {

    private final String varName;
    private final Expression value;
    private final Position position;
    private Token symToken;

    public SpecVar(String varName, Expression value, Position position) {
        this.varName = varName;
        this.value = value;
        this.position = position;
        this.getLLVMValue();

    }

    public SpecVar(String varName) {
        this.varName = varName;
        this.value = null;
        this.position = null;
        this.getLLVMValue();
    }

    public SpecVar(String varName, Expression value) {
        this.varName = varName;
        this.value = value;
        this.position = null;
        this.getLLVMValue();
    }

    public Expression getValue() {
        return value;
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
    public LLVMValueRef getLLVMValue() {
        if (this.varName == null) return null;

        LLVM.LLVMValueRef varAlloc = LLVMBuildAlloca(LLVMEmitter.getInstance().builder,
                LLVMInt32Type(), this.varName);

        LLVMBuildStore(LLVMEmitter.getInstance().builder,
                this.value.getLLVMValue(), varAlloc);

        return varAlloc;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

}
