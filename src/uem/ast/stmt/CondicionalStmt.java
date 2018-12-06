package uem.ast.stmt;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import org.bytedeco.javacpp.PointerPointer;
import uem.IR.LLVMEmitter;
import uem.ast.Position;
import uem.ast.expr.Expression;

import java.util.List;

import static org.bytedeco.javacpp.LLVM.LLVMBuildCall;
import static org.bytedeco.javacpp.LLVM.LLVMGetNamedFunction;

public class CondicionalStmt implements Statement, Expression {
    public static final String TernFunName = "__TernOP";
    final String varName = null;
    private List<Statement> ifStmt;
    private List<Statement> elseStmt;
    private final Position position;
    private Expression cond;
    private Token symToken;
    private Expression eThen;
    private Expression eElse;

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

    public Expression getCond() {
        return this.cond;
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

    public List<Statement> getIfStmt() {
        return this.ifStmt;
    }

    public List<Statement> getElseStmt() {
        return this.elseStmt;
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        if (this.eElse != null && this.eThen != null) {

            LLVM.LLVMValueRef argsProc[] = new LLVM.LLVMValueRef[0];
            LLVM.LLVMValueRef procName = LLVMGetNamedFunction(
                    LLVMEmitter.getInstance().mod,
                    TernFunName);

            return LLVMBuildCall(LLVMEmitter.getInstance().builder,
                    procName,
                    new PointerPointer<>(argsProc),
                    0,
                    CondicionalStmt.TernFunName);
        }
        return null;
    }

    public Expression geteElse() {
        return eElse;
    }

    public void seteElse(Expression eElse) {
        this.eElse = eElse;
    }

    public Expression geteThen() {
        return eThen;
    }

    public void seteThen(Expression eThen) {
        this.eThen = eThen;
    }
}
