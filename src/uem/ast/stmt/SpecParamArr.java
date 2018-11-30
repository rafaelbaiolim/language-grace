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

/**
 * GetLLVMValue é chamado apenas ao final da definição do
 * escopo da função, para alocação correta de escopo
 */
public class SpecParamArr implements VarStatement {

    private final String varName;
    private Expression value;
    private final Position position;
    private Token symToken;
    protected Type type;
    LLVMValueRef llvmValRef;
    LLVMTypeRef llvmTypeRef;

    public SpecParamArr(String varName, Expression value, Position position) {
        this.varName = varName;
        this.value = value;
        this.position = position;
    }

    public SpecParamArr(String varName) {
        this.varName = varName;
        this.value = null;
        this.position = null;
    }

    public SpecParamArr(String varName, Expression value) {
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


    public LLVMTypeRef getTypeLLVMRef() {
        return this.llvmTypeRef;
    }

    private void setTypeLLVMRef() {
        this.llvmTypeRef = LLVMEmitter.getInstance().types.getByTypeName(this.type.getName());
    }

    public void setType(Type type) {
        this.type = type;
        this.setTypeLLVMRef();
    }

    private LLVMValueRef getValueByType() {
        if (this.varName == null) return null;
        LLVMValueRef varAlloc = LLVMBuildAlloca(
                LLVMEmitter.getInstance().builder,
                this.llvmTypeRef,
                this.varName);
        FrontEnd.currentScope.resolve(this.varName).getScope().setLLVMSymRef(this.varName, varAlloc);
        return this.llvmValRef = varAlloc;
    }

    @Override
    public LLVMValueRef getLLVMValue() {
        LLVMEmitter lle = LLVMEmitter.getInstance();
        // LLVM.LLVMValueRef arrAllocated = FrontEnd.currentScope.resolve(this.varName).getScope().getLLVMSymRef(this.varName);
        LLVM.LLVMValueRef arrAllocated = FrontEnd.currentScope.getEnclosingScope().resolve(this.varName).getScope().getLLVMSymRef(this.varName);

        LLVMValueRef load = LLVMBuildLoad(LLVMEmitter.getInstance().builder,
                lle.getArray("0", arrAllocated), "temp"
        );

        return load;
    }

    @Override
    public LLVMValueRef getLLVMValue(Type type) {
        this.type = type;
        return this.getValueByType();
    }


    @Override
    public Position getPosition() {
        return this.position;
    }

}
