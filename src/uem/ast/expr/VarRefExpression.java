package uem.ast.expr;

import org.antlr.symtab.VariableSymbol;
import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.ast.Position;
import org.antlr.symtab.Type;
import uem.listners.FrontEnd;

public abstract class VarRefExpression implements Expression {

    protected final String varName;
    protected final Position position;
    protected Token symToken;
    protected LLVM.LLVMValueRef llvmValueRef;
    protected Expression index;
    private Type type;


    /**
     * Arr Variable
     *
     * @param varName
     * @param idex
     */
    public VarRefExpression(String varName, Expression idex) {
        super();
        this.varName = varName;
        this.index = idex;
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

        VariableSymbol var = (VariableSymbol) FrontEnd.resolveWithScope(varName);
        if (var != null) {
            this.setType(var.getType());
        }

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
        return this.llvmValueRef;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }


    @Override
    public Type getType() {
        return this.type;
    }
}
