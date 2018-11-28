
package uem.ast.expr;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.ast.Position;

import static org.bytedeco.javacpp.LLVM.LLVMBuildICmp;

public class CompareExpression implements BinaryExpression {

    private final Position position;
    private Expression right;
    private Expression left;
    private Token symToken;
    private String operator;

    public CompareExpression(Expression right, Expression left, String operator) {
        super();
        this.position = null;
        this.right = right;
        this.left = left;
        this.operator = operator;
        this.getLLVMValue();
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
    public Expression getLeft() {
        return this.left;
    }

    @Override
    public Expression getRight() {
        return this.right;
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {

        LLVMPresets llp = LLVMPresets.getInstance();
        LLVMEmitter lle = LLVMEmitter.getInstance();
        int pred = llp.getLLVMPredicate(this.operator);

        return LLVMBuildICmp(
                lle.builder,
                pred,
                this.left.getLLVMValue(),
                this.right.getLLVMValue(),
                "compare(" + this.operator + ")"
        );


    }
}
