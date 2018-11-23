package uem.ast.expr;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.ast.Position;
import uem.listners.FrontEnd;

import static org.bytedeco.javacpp.LLVM.LLVMBuildLoad;

public class VarReference implements Expression {

    private final String varName;
    private final Position position;
    private Token symToken;

    public VarReference(String varName, Position position) {
        super();
        this.varName = varName;
        this.position = position;
    }

    public VarReference(String varName) {
        super();
        this.varName = varName;
        this.position = null;
    }

    public String getVarName() {
        return this.varName;
    }

    @Override
    public Position getPosition() {
        return this.position;
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
    public LLVM.LLVMValueRef getLLVMValue() {
        LLVM.LLVMValueRef load = null;
        try {
            LLVM.LLVMValueRef varAllocated = FrontEnd.currentScope.getLLVMSymRef(this.varName);
            load = LLVMBuildLoad(LLVMEmitter.getInstance().builder,
                    varAllocated, "temp"
            );
        } catch (Exception ex) {

        }

        return load;
    }
}
