package uem.ast.expr;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.ast.Position;

public abstract class VarRefExpression implements Expression {

    protected final String varName;
    protected final Position position;
    protected Token symToken;
    protected LLVM.LLVMValueRef llvmValueRef;
    protected String idx;

    /**
     * Array Ref
     *
     * @param varName
     * @param idex
     */
    public VarRefExpression(String varName, String idex) {
        super();
        this.varName = varName;
        this.idx = idex;
        this.position = null;
    }

    /**
     * Var Ref
     *
     * @param varName
     */
    public VarRefExpression(String varName) {
        super();
        this.varName = varName;
        this.position = null;
    }

    protected VarRefExpression(String varName, Position position) {
        this.varName = varName;
        this.position = position;
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
        return this.llvmValueRef;
    }
}
