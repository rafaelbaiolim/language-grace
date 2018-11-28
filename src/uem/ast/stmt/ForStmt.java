package uem.ast.stmt;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.antlr.GraceParser;
import uem.ast.Position;
import uem.ast.expr.Expression;
import uem.ast.stmt.cmd.AtribCmd;

import java.util.List;

public class ForStmt implements LoopStatement {

    private AtribCmd init;
    private AtribCmd itera;
    private Expression cond;

    private List<Statement> stmt;
    private final Position position;
    private Token symToken;

    public ForStmt() {
        super();
        this.position = null;
    }

    public String getVarName() {
        return String.valueOf(GraceParser.T_FOR);
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

    @Override
    public List<Statement> getBody() {
        return this.stmt;
    }

    @Override
    public Expression getCond() {
        return this.cond;
    }

    public AtribCmd getInit() {
        return this.init;
    }
    public void setInit(AtribCmd init) {
        this.init = init;
    }

    public void setStmt(List<Statement> stmt) {
        this.stmt = stmt;
    }

    public void setCond(Expression cond) {
        this.cond = cond;
    }

    public AtribCmd getItera() {
        return this.itera;
    }
    public void setItera(AtribCmd itera) {
        this.itera = itera;
    }


}
