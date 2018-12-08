
package uem.ast.expr;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.ast.Position;
import uem.ast.type.BooleanType;
import org.antlr.symtab.Type;

import static org.bytedeco.javacpp.LLVM.LLVMBuildBinOp;
import static org.bytedeco.javacpp.LLVM.LLVMBuildICmp;

public class CompareExpression implements BinaryExpression {

    private final Position position;
    private Expression right;
    private Expression left;
    private Token symToken;
    private String operator;
    private Type type = new BooleanType();

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
        int pred;
        try {
            pred = llp.getLLVMPredicate(this.operator);
        } catch (NullPointerException ex) { // Operação Binária AND | OR
            pred = llp.getLLVMPredicateBin(this.operator);

            return LLVMBuildBinOp(lle.builder,
                    pred,
                    llp.castExprToInt(this.left.getLLVMValue()),
                    llp.castExprToInt(this.right.getLLVMValue()),
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

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public Type getType() {
        return this.type;
    }

}
