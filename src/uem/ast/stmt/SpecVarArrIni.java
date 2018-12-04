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

import static org.bytedeco.javacpp.LLVM.*;

public class SpecVarArrIni implements VarStatement {
    private String varName;
    private Expression value;
    private String length;
    private Position position;
    private Token symToken;
    private Type type;
    LLVMValueRef llvmValRef;
    protected List<Expression> inicializacao;

    public List<Expression> getInicializacao() {
        return inicializacao;
    }

    public void setInicializacao(List<Expression> inicializacao) {
        this.inicializacao = inicializacao;
    }

    public SpecVarArrIni(String varName, String length) {
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

        LLVMEmitter lle = LLVMEmitter.getInstance();

        LLVM.LLVMTypeRef typeArray = LLVMArrayType(
                LLVMEmitter.getInstance().types.i32(),
                Integer.parseInt(String.valueOf(this.getLength()))
        );

        LLVM.LLVMValueRef varAlloc = LLVMEmitter.getInstance().LLVMBuildAllocWithScope(
                typeArray, this.getVarName()
        );
        int i = 0;
        for (Expression exp : this.inicializacao) {
            LLVMBuildStore(
                    lle.builder,
                    exp.getLLVMValue(),
                    lle.getArray(i, varAlloc));
            i++;
        }
        FrontEnd.currentScope.setLLVMSymRef(this.getVarName(), varAlloc);
        this.llvmValRef = varAlloc;

        return varAlloc;

    }

    @Override
    public Position getPosition() {
        return this.position;
    }

}
