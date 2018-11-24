package uem.ast.stmt;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.ast.Position;
import uem.ast.expr.Expression;

import java.util.List;

import static org.bytedeco.javacpp.LLVM.LLVMBuildBr;
import static org.bytedeco.javacpp.LLVM.LLVMPositionBuilderAtEnd;

public class WhileStmt implements LoopStatement {

    final String varName = null;
    private List<Statement> stmt;
    private final Position position;
    private Expression cond;
    private Token symToken;

    public WhileStmt(List<Statement> stmt, Expression cond) {
        super();
        this.stmt = stmt;
        this.position = null;
        this.cond = cond;
        this.getLLVMValue();
    }

    public void setStatment(List<Statement> stmt) {
        this.stmt = stmt;
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

    @Override
    public Expression getCond() {
        return this.cond;
    }

    @Override
    public List<Statement> getBody() {
        return this.stmt;
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        LLVMPresets llvmp = LLVMPresets.getInstance();
        LLVMEmitter llve = LLVMEmitter.getInstance();

        LLVM.LLVMBasicBlockRef cond = llvmp.buildBlock("while.cond");
        LLVM.LLVMBasicBlockRef body = llvmp.buildBlock("while.body");
        LLVM.LLVMBasicBlockRef end = llvmp.buildBlock("while.end");

        llve.pushLoop(cond, end);

        // Conditional.
        LLVMBuildBr(llve.builder, cond);
        LLVMPositionBuilderAtEnd(llve.builder, cond);

        //FAZER O IF PRIMEIRO
        LLVMPositionBuilderAtEnd(llve.builder, body);

        LLVMPositionBuilderAtEnd(llve.builder, end);
        llve.popScope();

        return null;
    }


}
