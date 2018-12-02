package uem.ast;

import org.bytedeco.javacpp.LLVM;
import uem.ast.expr.Expression;
import uem.ast.stmt.Statement;
import uem.ast.type.Type;

public interface VarStatement extends Statement {
    String getVarName();

    Expression getValue();

    Expression setValue(Expression exp);

    void setType(Type t);

    Type getType();

    LLVM.LLVMValueRef getLLVMValue(Type type);
}
