package uem.ast;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.ast.type.Type;

public interface Node {
    Position getPosition();

    void setSymbol(Token sym);

    Token getSymbol();

    LLVM.LLVMValueRef getLLVMValue();
}