package uem.ast.type;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.antlr.GraceParser;
import uem.ast.Position;

public class StringType implements Type {

    private final Position position;
    private int size = 256;
    private Token symbol;

    public Position getPosition() {
        return this.position;
    }

    public StringType(Position position) {
        this.position = position;
    }

    public StringType() {
        this.position = null;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getType() {
        return GraceParser.T_STRING;
    }

    @Override
    public String getName() {
        return LLVMEmitter.FORMAT_STRING;
    }

    @Override
    public int getTypeIndex() {
        return 0;
    }

    @Override
    public void setSymbol(Token sym) {
        this.symbol = sym;
    }

    @Override
    public Token getSymbol() {
        return null;
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        return null;
    }

}
