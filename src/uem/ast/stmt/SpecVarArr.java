package uem.ast.stmt;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.ast.Position;
import uem.ast.VarStatement;
import uem.ast.expr.Expression;
import uem.ast.type.Type;
import uem.listners.FrontEnd;

import java.util.List;

import static org.bytedeco.javacpp.LLVM.LLVMArrayType;
import static org.bytedeco.javacpp.LLVM.LLVMValueRef;

public class SpecVarArr implements VarStatement {
    private String varName;
    private Expression value;
    private String length;
    private Position position;
    private Token symToken;
    private Type type;
    LLVMValueRef llvmValRef;

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

    @Override
    public void setType(Type t) {
        this.type = t;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    public Integer getLength() {
        try {
            return Integer.parseInt(this.length);
        } catch (NumberFormatException ex) {
            return 0;
        }
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

        LLVM.LLVMValueRef varAlloc = LLVMEmitter.getInstance().LLVMBuildAllocWithScope(
                typeArray, this.varName
        );

        FrontEnd.currentScope.setLLVMSymRef(this.varName, varAlloc);
        this.llvmValRef = varAlloc;
        return varAlloc;

    }

    @Override
    public Position getPosition() {
        return this.position;
    }

}
