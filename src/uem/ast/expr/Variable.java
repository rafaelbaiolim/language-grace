package uem.ast.expr;

import uem.listners.FrontEnd;

import static org.bytedeco.javacpp.LLVM.LLVMValueRef;

public class Variable extends VarRefExpression {

    public Variable(String varName) {
        super(varName);
    }

    @Override
    public LLVMValueRef getLLVMValue() {
        return FrontEnd.currentScope.getLLVMSymRef(this.varName);
    }
}
