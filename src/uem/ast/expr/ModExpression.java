package uem.ast.expr;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.ast.Position;

import static org.bytedeco.javacpp.LLVM.LLVMBuildAdd;
import static org.bytedeco.javacpp.LLVM.LLVMBuildSRem;

public class ModExpression implements BinaryExpression {

    private final Expression left;
    private final Expression right;
    private final Position position;
    private Token symToken;

    @Override
    public Expression getLeft() {
        return this.left;
    }

    @Override
    public Expression getRight() {
        return this.right;
    }

    public ModExpression(Expression left, Expression right, Position position) {
        super();
        this.left = left;
        this.right = right;
        this.position = position;
        this.getLLVMValue();
    }

    public ModExpression(Expression left, Expression right) {
        super();
        this.left = left;
        this.right = right;
        this.position = null;
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
    public LLVM.LLVMValueRef getLLVMValue() {

        LLVM.LLVMValueRef leftExp = this.left.getLLVMValue();
        LLVM.LLVMValueRef rightExp = this.right.getLLVMValue();

        LLVM.LLVMValueRef result = LLVMBuildSRem(LLVMEmitter.getInstance().builder,
                leftExp, rightExp, "rem"
        );
        return result;
    }
}
