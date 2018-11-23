package uem.ast.stmt;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.ast.Position;
import uem.ast.expr.Expression;

import java.util.List;

public class CondicionalStmt implements Statement {

    final String varName = null;
    private List<Statement> ifStmt;
    private List<Statement> elseStmt;
    private final Position position;
    private Expression cond;
    private Token symToken;

    public CondicionalStmt(Expression cond) {
        super();
        this.position = null;
        this.cond = cond;
    }

    public CondicionalStmt(List<Statement> ifStmt, Expression cond) {
        super();
        this.ifStmt = ifStmt;
        this.position = null;
        this.cond = cond;
    }

    public CondicionalStmt(List<Statement> ifStmt, List<Statement> elseStmt, Expression cond) {
        super();
        this.ifStmt = ifStmt;
        this.elseStmt = elseStmt;
        this.position = null;
        this.cond = cond;
    }

    @Override
    public String getVarName() {
        return varName;
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
        return null;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    public Expression getCond() {
        return this.cond;
    }

    public void setIfStatment(List<Statement> stmt) {
        this.ifStmt = stmt;
    }

    public void setElseStatment(List<Statement> stmt) {
        this.elseStmt = stmt;
    }

    public List<Statement> getIfStmt() {
        return this.ifStmt;
    }

    public List<Statement> getElseStmt() {
        return this.elseStmt;
    }


}
