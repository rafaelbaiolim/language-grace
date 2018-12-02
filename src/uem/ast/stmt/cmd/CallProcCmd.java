package uem.ast.stmt.cmd;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import org.bytedeco.javacpp.PointerPointer;
import uem.IR.LLVMEmitter;
import uem.ast.Position;
import uem.ast.expr.Expression;
import uem.ast.expr.VarArrReference;

import java.util.List;

import static org.bytedeco.javacpp.LLVM.LLVMBuildCall;
import static org.bytedeco.javacpp.LLVM.LLVMGetNamedFunction;

public class CallProcCmd implements CmdStatement {

    private final Position position = null;
    private Token symToken;
    String name;

    public boolean isVoid() {
        return isVoid;
    }

    public void setVoid(boolean aVoid) {
        isVoid = aVoid;
    }

    boolean isVoid;
    private List<Expression> expressionList;

    public CallProcCmd(String name, List<Expression> exprLst) {
        super();
        this.expressionList = exprLst;
        this.name = name;
    }

    @Override
    public Expression getExpr() {
        return null;
    }

    public List<Expression> getExprList() {
        return this.expressionList;
    }

    public String getVarName() {
        return this.name;
    }

    @Override
    public Position getPosition() {
        return this.position;
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
        LLVM.LLVMValueRef argsProc[] = new LLVM.LLVMValueRef[this.expressionList.size()];
        int i = 0;
        for (Expression expr : this.expressionList) {
            if (expr instanceof VarArrReference) {
                argsProc[i] = ((VarArrReference) expr).getLLVMValue(true);
                i++;
                continue;
            }
            argsProc[i] = expr.getLLVMValue();
            i++;
        }
        LLVM.LLVMValueRef procName = LLVMGetNamedFunction(
                LLVMEmitter.getInstance().mod,
                this.name);

        String llvmLabel = (this.isVoid ? "" : this.name);
        return LLVMBuildCall(LLVMEmitter.getInstance().builder,
                procName,
                new PointerPointer<>(argsProc),
                this.expressionList.size(),
                llvmLabel);

    }
}
