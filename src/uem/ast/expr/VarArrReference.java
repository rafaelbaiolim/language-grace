package uem.ast.expr;

import org.antlr.symtab.ParameterSymbol;
import org.antlr.symtab.Symbol;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.listners.FrontEnd;

import static org.bytedeco.javacpp.LLVM.LLVMBuildLoad;

public class VarArrReference extends VarRefExpression {

    public VarArrReference(String varName, Expression posicao) {
        super(varName, posicao);
    }

    public VarArrReference(String varName) {
        super(varName);
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        LLVM.LLVMValueRef toLoad = null;
        LLVMEmitter lle = LLVMEmitter.getInstance();
        LLVMPresets llp = LLVMPresets.getInstance();
        LLVM.LLVMValueRef arrAllocated = FrontEnd.currentScope.resolve(this.varName)
                .getScope().getLLVMSymRef(this.varName);
        Symbol sym = FrontEnd.currentScope.resolve(this.varName).getScope().getSymbol(this.varName);
        LLVM.LLVMValueRef calcIdx = llp.parseExprToInt(this.index);

        if (sym instanceof ParameterSymbol) {
            LLVM.LLVMValueRef loadArr = LLVMBuildLoad(lle.builder,
                    arrAllocated, "getSavedArr");

            toLoad = lle.getArray(calcIdx, loadArr, 1); //GEP serve para setore e load
        } else {
            toLoad = lle.getArray(calcIdx, arrAllocated, 2); //GEP serve para setore e load
        }
        return LLVMBuildLoad(lle.builder, toLoad, "arr_result");
    }


    public LLVM.LLVMValueRef getLLVMValue(boolean noLoad) {
        LLVMEmitter lle = LLVMEmitter.getInstance();
        LLVMPresets llp = LLVMPresets.getInstance();
        LLVM.LLVMValueRef arrAllocated = FrontEnd.currentScope.resolve(this.varName)
                .getScope().getLLVMSymRef(this.varName);
        LLVM.LLVMValueRef calcIdx = llp.parseExprToInt(this.index);
        return lle.getArray(calcIdx, arrAllocated, 2); //GEP serve para setore e load
    }


}