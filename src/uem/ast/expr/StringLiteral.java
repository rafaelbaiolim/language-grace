package uem.ast.expr;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.ast.Position;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.bytedeco.javacpp.LLVM.LLVMBuildGlobalStringPtr;

public class StringLiteral implements Expression {

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

    public StringLiteral(Position pos) {
        this.position = pos;
    }

    public StringLiteral(String tex) {
        this.position = null;
        this.value = tex;
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        String val = this.value.replaceAll("^.|.$", "");
        return LLVMBuildGlobalStringPtr(
                LLVMEmitter.getInstance().builder,
                val,
                "const_" + this.value);

    }
}
