package uem.ast.stmt;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.ast.Position;
import uem.ast.VarStatement;
import uem.ast.expr.Expression;
import uem.ast.type.Type;
import uem.listners.FrontEnd;

import static org.bytedeco.javacpp.LLVM.*;

public class SpecVar implements VarStatement {

    private final String varName;
    private Expression value;
    private final Position position;
    private Token symToken;
    LLVMValueRef llvmValRef;

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
    }

    public SpecVar(String varName, Expression value) {
        this.varName = varName;
        this.value = value;
        this.position = null;
    }

    @Override
    public Expression getValue() {
        return value;
    }

    @Override
    public Expression setValue(Expression exp) {
        return this.value = exp;
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
        return this.llvmValRef;
    }

    @Override
    public LLVMValueRef getLLVMValue(Type type) {
        if (this.varName == null) return null;

        LLVM.LLVMValueRef varAlloc = LLVMBuildAlloca(
                LLVMEmitter.getInstance().builder,
                LLVMEmitter.getInstance().types.getByTypeName(type.getName()),
                this.varName);
        if (this.value != null) {
            LLVMBuildStore(LLVMEmitter.getInstance().builder,
                    this.value.getLLVMValue(), varAlloc);
        }

        FrontEnd.currentScope.setLLVMSymRef(this.varName, varAlloc);
        return this.llvmValRef = varAlloc;
    }


    @Override
    public Position getPosition() {
        return this.position;
    }

}
