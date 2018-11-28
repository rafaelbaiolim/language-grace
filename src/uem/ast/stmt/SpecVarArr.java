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

public class SpecVarArr implements VarStatement {

    private final String varName;
    private Expression value;
    private String length;
    private final Position position;
    private Token symToken;
    LLVMValueRef llvmValRef;

    public SpecVarArr(String varName, String length, Expression value, Position position) {
        this.varName = varName;
        this.length = length;
        this.value = value;
        this.position = position;
        this.getLLVMValue();

    }

    public SpecVarArr(String varName) {
        this.varName = varName;
        this.value = null;
        this.position = null;
        this.getLLVMValue();
    }

    public SpecVarArr(String varName, String length) {
        this.varName = varName;
        this.length = length;
        this.position = null;
        this.getLLVMValue();
    }

    @Override
    public Expression getValue() {
        return value;
    }

    @Override
    public Expression setValue(Expression exp) {
        return this.value = exp;
    }

    public Integer getLength() {
        return Integer.parseInt(this.length);
    }

    public void setLength(Integer len) {
        this.length = String.valueOf(len);
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

        LLVM.LLVMTypeRef typeArray = LLVMArrayType(
                LLVMEmitter.getInstance().types.i32(),
                Integer.parseInt(this.length)
        );

        LLVM.LLVMValueRef varAlloc = LLVMBuildAlloca(
                LLVMEmitter.getInstance().builder,
                typeArray,
                this.varName);

        FrontEnd.currentScope.resolve(this.varName).getScope().setLLVMSymRef(this.varName, varAlloc);

        this.llvmValRef = varAlloc;
        return varAlloc;

    }

    @Override
    public Position getPosition() {
        return this.position;
    }

}
