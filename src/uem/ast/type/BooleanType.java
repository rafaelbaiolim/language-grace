package uem.ast.type;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.antlr.GraceParser;
import uem.ast.Position;

public class BooleanType implements Type {

    private final Position position;
    private Token symbol;

    public Position getPosition() {
        return this.position;
    }

    public BooleanType(Position position) {
        this.position = position;
    }

    public BooleanType() {
        this.position = null;
    }

    @Override
    public int getType() {
        return GraceParser.T_BOOL;
    }

    @Override
    public String getName() {
        return null;
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
