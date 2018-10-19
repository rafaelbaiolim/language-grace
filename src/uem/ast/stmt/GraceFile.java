package uem.ast.stmt;

import org.antlr.v4.runtime.Token;
import uem.ast.Node;
import uem.ast.Position;

import java.util.List;

public class GraceFile implements Node {

    private final List<Statement> lstStmt;
    private Token symToken;

    public GraceFile(List<Statement> lstStmt) {
        super();
        this.lstStmt = lstStmt;
    }

    @Override
    public Position getPosition() {
        return null;
    }
    
    @Override
    public Token setSymbol(Token sym) {
        return this.symToken = sym;
    }

    @Override
    public Token getSymbol() {
        return this.symToken;
    }
}
