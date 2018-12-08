package uem.ast.expr;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.ast.Position;
import uem.ast.type.IntegerType;
import org.antlr.symtab.Type;

import static org.bytedeco.javacpp.LLVM.LLVMConstInt;
import static org.bytedeco.javacpp.LLVM.LLVMInt32Type;
import static org.bytedeco.javacpp.LLVM.LLVMIntType;

public class NumberLiteral implements Expression {

    private final Position position;
    private String value;
    private Token symToken;
    private Type type = new IntegerType();

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

    public NumberLiteral(Position pos) {
        this.position = pos;
    }

    public NumberLiteral(String tex) {
        this.position = null;
        this.value = tex;
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        return LLVMConstInt(LLVMInt32Type(),
                Integer.parseInt(this.value), 0);
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
