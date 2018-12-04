package uem.ast.stmt;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.ast.Position;
import uem.ast.expr.Expression;

import java.util.List;

import static org.bytedeco.javacpp.LLVM.LLVMBuildRet;

public class Return implements Statement {

    private List<Expression> exprList;
    private final Position position;
    private Token symToken;

    public Return(List<Expression> exprList) {
        this.exprList = exprList;
        this.position = null;
        getLLVMValue();
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
        LLVM.LLVMValueRef refToReturn = null;
        for (Expression exp : exprList) {
            refToReturn = exp.getLLVMValue(); //retorna a última operação LLVM
        }
        if (refToReturn != null) {
            LLVMBuildRet(LLVMEmitter.getInstance().builder,
                    refToReturn);
        }

        return refToReturn;
    }

    @Override
    public String getVarName() {
        return null;
    }
}
