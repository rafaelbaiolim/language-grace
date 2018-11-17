package uem.ast.stmt;

import uem.ast.expr.Expression;

import java.util.List;

public interface LoopStatement extends Statement {
    public Expression getCond();

    public List<Statement> getBody();

}
