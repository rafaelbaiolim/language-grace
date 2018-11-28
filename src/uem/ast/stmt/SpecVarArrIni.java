package uem.ast.stmt;

import uem.IR.LLVMEmitter;
import uem.ast.expr.Expression;

import java.util.List;

import static org.bytedeco.javacpp.LLVM.*;

public class SpecVarArrIni extends SpecVarArr {
    protected List<Expression> inicializacao;

    public List<Expression> getInicializacao() {
        return inicializacao;
    }

    public void setInicializacao(List<Expression> inicializacao) {
        this.inicializacao = inicializacao;
    }

    public SpecVarArrIni(String varName, String length) {
        super(varName, length);
        this.getLLVMValue();
    }

    @Override
    public LLVMValueRef getLLVMValue() {
        LLVMEmitter lle = LLVMEmitter.getInstance();
        return null;

    }


}
