package uem.IR;

import org.bytedeco.javacpp.LLVM.LLVMBuilderRef;
import org.bytedeco.javacpp.LLVM.LLVMContextRef;
import org.bytedeco.javacpp.LLVM.LLVMModuleRef;

public class LLVMEmitter {
    public final LLVMContextRef context;
    public final LLVMModuleRef mod;
    public final LLVMBuilderRef builder;

    public LLVMEmitter(
            LLVMContextRef context,
            LLVMModuleRef mod,
            LLVMBuilderRef builder
    ) {
        this.context = context;
        this.mod = mod;
        this.builder = builder;

    }

}
