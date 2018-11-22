package uem.ast.stmt;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.ast.Position;
import uem.ast.expr.Expression;
import uem.ast.llvm.LLVMNode;

import static org.bytedeco.javacpp.LLVM.*;

public class SpecVar
        extends LLVMNode
        implements Statement {

    private final String varName;
    private final Expression value;
    private final Position position;
    private Token symToken;

    public SpecVar(String varName, Expression value, Position position) {
        this.varName = varName;
        this.value = value;
        this.position = position;
        this.setLLVMBlock();

    }

    public SpecVar(String varName) {
        this.varName = varName;
        this.value = null;
        this.position = null;
        this.setLLVMBlock();
    }

    public SpecVar(String varName, Expression value) {
        this.varName = varName;
        this.value = value;
        this.position = null;
        this.setLLVMBlock();
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
    public Position getPosition() {
        return this.position;
    }

    @Override
    protected void setLLVMBlock() {
        if (this.varName == null) return;

        LLVM.LLVMValueRef varAlloc = LLVMBuildAlloca(LLVMEmitter.getInstance().builder,
                LLVMInt32Type(), this.varName);

        //teste
        LLVMBuildStore(LLVMEmitter.getInstance().builder,
                LLVMConstInt(LLVMInt32Type(), 10, 1),
                varAlloc);

        LLVMValueRef load = LLVMBuildLoad(LLVMEmitter.getInstance().builder,
                varAlloc, "temp"
        );

        LLVMValueRef result = LLVMBuildAdd(LLVMEmitter.getInstance().builder,
                load, load, "soma"
        );

        LLVMEmitter.getInstance().CallPrint(result, LLVMEmitter.FORMAT_NUMBER);
    }
}
