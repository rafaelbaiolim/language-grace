
package uem.ast.expr;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.ast.Position;

import static org.bytedeco.javacpp.LLVM.LLVMBuildBinOp;
import static org.bytedeco.javacpp.LLVM.LLVMBuildICmp;
import static org.bytedeco.javacpp.LLVM.LLVMBuildSExtOrBitCast;

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
        int pred = 0;
        try {
            pred = llp.getLLVMPredicate(this.operator);
        } catch (NullPointerException ex) { // Operação Binária AND | OR
            pred = llp.getLLVMPredicateBin(this.operator);

            return LLVMBuildBinOp(lle.builder,
                    pred,
                    this.left.getLLVMValue(),
                    this.right.getLLVMValue(),
                    "bin_compare(" + this.operator + ")");
        }

        return LLVMBuildICmp(
                lle.builder,
                pred,
                this.left.getLLVMValue(),
                this.right.getLLVMValue(),
                "compare(" + this.operator + ")"
        );


    }
}
