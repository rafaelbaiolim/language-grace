package uem.ast.stmt.cmd;

import uem.ast.expr.Expression;
import uem.ast.stmt.Statement;

public interface CmdStatement extends Statement {
    public Expression getExpr();
}
