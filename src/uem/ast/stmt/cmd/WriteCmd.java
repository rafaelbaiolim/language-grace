package uem.ast.stmt.cmd;

import org.antlr.v4.runtime.Token;
import uem.ast.Position;
import uem.ast.expr.Expression;
import uem.ast.expr.VarReference;

import java.util.List;

public class WriteCmd implements CmdStatement {

    private final Position position = null;
    private Token symToken;
    private VarReference varExpr;
    private List<Expression> expressionList;

    public WriteCmd(List<Expression> exprLst) {
        super();
        this.expressionList = exprLst;

    }

    @Override
    public Expression getExpr() {
        return this.varExpr;
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
}
