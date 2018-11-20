package uem.IR;
import org.bytedeco.javacpp.LLVM;
import org.bytedeco.javacpp.LLVM.*;

import java.util.*;

public class LLVMEmitter {
    public final LLVMContextRef context;
    public final LLVMModuleRef mod;
    public final LLVMBuilderRef builder;
    public final LLVMType types;

    /**
     * Auxiliar para indicar o inicio ou fim
     * de uma estrutura de repetição ou
     * declarações com label
     */
    public class ControlTransferLocation {
        private LLVMBasicBlockRef block;

        ControlTransferLocation(LLVMBasicBlockRef block) {
            this.block = block;
        }

        public LLVMBasicBlockRef getBlock() {
            return block;
        }

    }

    private class LabeledStmtLocation {
        ControlTransferLocation head, end;

        LabeledStmtLocation(LLVMBasicBlockRef head, LLVMBasicBlockRef end) {
            this.head = new ControlTransferLocation(head);
            this.end = new ControlTransferLocation(end);
        }
    }


    private static class ScopeFn {
        final LLVM.LLVMValueRef scope;
        /**
         * Mapeamento das labels para IR.
         */
        final Map<String, LabeledStmtLocation> labelMap = new HashMap<String, LabeledStmtLocation>();

        ScopeFn(LLVMValueRef scope) {
            this.scope = scope;
        }
    }


    private Deque<ScopeFn> fnCtxts = new ArrayDeque<ScopeFn>();

    /**
     * Empilha um Escopo de função LLVM
     */
    public void pushScope(LLVMValueRef fn) {
        fnCtxts.push(new ScopeFn(fn));
    }

    /**
     * Desempilha Escopo de função LLVM
     */
    public void popScope() {
        fnCtxts.pop();
    }

    public LLVMValueRef currentScope() {
        return fnCtxts.peek().scope;
    }

    /**
     * Associa a syntax Grace a da LLVM
     */
    private Map<Object, Object> translations = new IdentityHashMap<>();

    public void setTranslation(Object n, Object ll) {
        translations.put(n, ll);
    }

    public <T> T getTranslation(Object n) {
        T res = (T) translations.get(n);
        if (res == null)
            throw new Error("Translation em null pointer [ " + n.getClass() + "] : " + n);
        return res;
    }

    public LLVMEmitter(
            LLVMContextRef context,
            LLVMModuleRef mod,
            LLVMBuilderRef builder
    ) {
        this.context = context;
        this.mod = mod;
        this.builder = builder;
        this.types = new LLVMType(this);

    }

}
