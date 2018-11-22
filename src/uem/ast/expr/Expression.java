package uem.ast.expr;

import org.bytedeco.javacpp.LLVM;
import uem.ast.Node;

public interface Expression extends Node {
    public LLVM.LLVMValueRef getLLVMValue();
}
