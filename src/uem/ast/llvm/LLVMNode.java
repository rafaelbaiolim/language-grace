package uem.ast.llvm;

public abstract class LLVMNode {
    public LLVMNode() {
        this.setLLVMBlock();

    }

    protected abstract void setLLVMBlock();
}
