package uem.ast.expr;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.ast.Position;

public class BoolLiteral implements Expression {

    private final Position position;
    private String value;
    private Token symToken;

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

    public BoolLiteral(Position pos) {
        this.position = pos;
    }

    public BoolLiteral(String tex) {
        this.position = null;
        this.value = tex;
    }


    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        return null;
    }
}
