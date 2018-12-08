package uem.ast.stmt;

import org.antlr.symtab.Type;
import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.ast.Position;
import uem.ast.expr.Expression;

import java.util.List;

public class CondicionalStmt implements Statement, Expression {
    final String varName = null;
    private List<Statement> ifStmt;
    private List<Statement> elseStmt;
    private final Position position;
    private Expression cond;
    private Token symToken;
    private Expression eThen;
    private Expression eElse;
    private org.antlr.symtab.Type type;

    public CondicionalStmt() {
        super();
        this.position = null;
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
    public Position getPosition() {
        return this.position;
    }

    public void setCond(Expression cond) {
        this.cond = cond;
    }

    public void setIfStatment(List<Statement> stmt) {
        this.ifStmt = stmt;
    }

    public void setElseStatment(List<Statement> stmt) {
        this.elseStmt = stmt;
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        if (this.eElse != null && this.eThen != null) {
            LLVMEmitter lle = LLVMEmitter.getInstance();
            return lle.CallTernary(
                    this.cond.getLLVMValue(),
                    this.eThen.getLLVMValue(),
                    this.eElse.getLLVMValue()
            );
        }
        return null;
    }

    public void seteElse(Expression eElse) {
        this.eElse = eElse;
    }

    public void seteThen(Expression eThen) {
        this.eThen = eThen;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public Type getType() {
        return this.type;
    }
}
