package uem.ast.expr;

import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.listners.FrontEnd;

import static org.bytedeco.javacpp.LLVM.LLVMValueRef;

public class VariableArr extends VarRefExpression {

    public VariableArr(String varName, Expression exprIndex) {
        super(varName, exprIndex);
    }

    @Override
    public LLVMValueRef getLLVMValue() {
        LLVMEmitter lle = LLVMEmitter.getInstance();
        LLVMPresets llp = LLVMPresets.getInstance();
        LLVMValueRef alloc = FrontEnd.currentScope.resolve(this.varName).getScope().getLLVMSymRef(this.varName);
        LLVMValueRef arrIdexRef = lle.getArray(
                llp.parseExprToInt(this.index),
                alloc,2);

        return arrIdexRef;
    }
}
