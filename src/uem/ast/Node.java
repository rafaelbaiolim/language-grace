package uem.ast;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;

public interface Node {
    Position getPosition();

    void setSymbol(Token sym);

    Token getSymbol();

    public LLVM.LLVMValueRef getLLVMValue();
}