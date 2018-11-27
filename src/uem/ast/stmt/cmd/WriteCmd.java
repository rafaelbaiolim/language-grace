package uem.ast.stmt.cmd;

import org.antlr.symtab.Symbol;
import org.antlr.symtab.VariableSymbol;
import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.ast.Position;
import uem.ast.expr.Expression;
import uem.listners.FrontEnd;

import java.util.List;

public class WriteCmd implements CmdStatement {

    private final Position position = null;
    private Token symToken;
    private List<Expression> expressionList;

    public WriteCmd(List<Expression> exprLst) {
        super();
        this.expressionList = exprLst;
//        this.getLLVMValue();

    }

    @Override
    public Expression getExpr() {
        return null;
    }

    public List<Expression> getExprList() {
        return this.expressionList;
    }

    public String getVarName() {
        return null;
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

        for (Expression expr : this.expressionList) {
            LLVMEmitter.getInstance().CallPrint(
                    expr.getLLVMValue(),
                    LLVMEmitter.FORMAT_NUMBER
            );
        }

        return null;
    }
}
