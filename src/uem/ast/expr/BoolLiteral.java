package uem.ast.expr;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.ast.Position;
import uem.ast.type.BooleanType;
import org.antlr.symtab.Type;

import static org.bytedeco.javacpp.LLVM.LLVMConstInt;
import static org.bytedeco.javacpp.LLVM.LLVMInt32Type;

public class BoolLiteral implements Expression {

    private final Position position;
    private String value;
    private Token symToken;
    private Type type = new BooleanType();

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
        if (this.value.toLowerCase().equals("true")) {
            return LLVMConstInt(LLVMInt32Type(),
                    1, 0);
        }
        if (this.value.toLowerCase().equals("false")) {
            return LLVMConstInt(LLVMInt32Type(),
                    0, 0);
        }
        return null;
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
