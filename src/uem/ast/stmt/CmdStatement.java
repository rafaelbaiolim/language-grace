package uem.ast.stmt;

import uem.ast.expr.Expression;

import java.util.List;

public interface CmdStatement extends Statement {
    public Expression getExpr();
}
