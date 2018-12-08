package uem.ast.expr;

import static org.bytedeco.javacpp.LLVM.LLVMBuildGlobalStringPtr;
import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.ast.Position;
import uem.ast.type.StringType;
import org.antlr.symtab.Type;

public class StringLiteral implements Expression {

    private final Position position;
    private String value;
    private Token symToken;
    private Type type = new StringType();

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
        val = val.replace("\\n", "" + ((char) (10)));
        val = val.replace("\\r", "" + ((char) (13)));
        val = val.replace("\\t", "" + ((char) (9)));

        return LLVMBuildGlobalStringPtr(
                LLVMEmitter.getInstance().builder,
                val,
                "const_" + val);
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
