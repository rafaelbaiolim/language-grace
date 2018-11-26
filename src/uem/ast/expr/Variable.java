package uem.ast.expr;

import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.listners.FrontEnd;

import static org.bytedeco.javacpp.LLVM.*;

public class Variable extends VarRefExpression {

    public Variable(String varName) {
        super(varName);
    }

    @Override
    public LLVMValueRef getLLVMValue() {
        return FrontEnd.currentScope.getLLVMSymRef(this.varName);
    }
}
