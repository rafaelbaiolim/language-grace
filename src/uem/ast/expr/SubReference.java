package uem.ast.expr;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.ast.Position;
import uem.ast.stmt.cmd.CallProcCmd;

import java.util.List;

public class SubReference implements Expression {

    private List<Expression> exprList;
    private final Position position;
    private Token symToken;
    private String name;

    public SubReference(String name, List<Expression> exprList) {
        this.exprList = exprList;
        this.name = name;
        this.position = null;
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
        return new CallProcCmd(this.name, this.exprList).getLLVMValue();
    }
}
