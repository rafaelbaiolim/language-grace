package uem.IR;
import org.bytedeco.javacpp.LLVM.*;

import static org.bytedeco.javacpp.LLVM.*;

public class LLVMBuild {
    public void execute() {
        LLVMContextRef context = LLVMContextCreate();
        LLVMModuleRef mod = LLVMModuleCreateWithNameInContext("Mainctx", context);
        LLVMBuilderRef builder = LLVMCreateBuilderInContext(context);
        LLVMEmitter emitter = new LLVMEmitter(context, mod, builder);
    }

}
