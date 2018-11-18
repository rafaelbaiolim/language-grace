package uem.ast.stmt.sub;

import uem.ast.stmt.Statement;

import java.util.List;

public interface SubStatment extends Statement {
    public List<Statement> getParams();

    public List<Statement> setParams(List<Statement> params);

    public List<Statement> getBody();
}
