package org.antlr.symtab;

import org.bytedeco.javacpp.LLVM;

import java.util.HashMap;

/**
 * A scope object typically associated with {...} code blocks
 */
public class LocalScope extends BaseScope {
    public LocalScope(Scope enclosingScope) {
        super(enclosingScope);
    }

    @Override
    public String getName() {
        return "local";
    }

    private HashMap<String, LLVM.LLVMBasicBlockRef> block = new HashMap<>();

    public LLVM.LLVMBasicBlockRef getBlock(String key) {
        return this.block.get(key);
    }

    public void setBlock(String key, LLVM.LLVMBasicBlockRef block) {
        this.block.put(key, block);
    }
}
