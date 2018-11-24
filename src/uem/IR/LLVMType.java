package uem.IR;

import org.bytedeco.javacpp.LLVM;

import static org.bytedeco.javacpp.LLVM.*;

public class LLVMType {
    private final LLVMEmitter llve;

    public LLVMType(LLVMEmitter llve) {
        this.llve = llve;
    }

    public LLVM.LLVMTypeRef voidType() {
        return LLVMVoidTypeInContext(llve.context);
    }

    public LLVMTypeRef i8() {
        return LLVMInt8TypeInContext(llve.context);
    }

    public LLVMTypeRef i32() {
        return LLVMInt32TypeInContext(llve.context);
    }

    public LLVMTypeRef i64() {
        return LLVMInt64TypeInContext(llve.context);
    }

    public LLVMTypeRef intType(int numBits) {
        return LLVMIntTypeInContext(llve.context, numBits);
    }

    public LLVMTypeRef jniEnvType() {
        return i8();
    }
}
