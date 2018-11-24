package uem.ast.stmt;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.ast.Position;
import uem.ast.type.Type;

import java.util.List;

public class DeclVar implements Statement {

    final String varName = null;
    private final List<Statement> stmt;
    private final Position position;
    private final Type type;
    private Token symToken;

    public DeclVar(List<Statement> stmt, Type type) {
        super();
        this.stmt = stmt;
        this.position = null;
        this.type = type;
        this.getLLVMValue();
    }

    public List<Statement> getListStmt() {
        return this.stmt;
    }

    public Type getType() {
        return this.type;
    }

    @Override
    public String getVarName() {
        return varName;
    }

    @Override
    public void setSymbol(Token sym) {
        this.symToken = sym;
    }

    @Override
    public Token getSymbol() {
        return this.symToken;
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
//        this.getListStmt().forEach(stmt -> {
//            LLVM.LLVMValueRef varAlloc = LLVMBuildAlloca(
//                    LLVMEmitter.getInstance().builder,
//                    LLVMEmitter.getInstance().types.getByTypeName(this.type.getName()),
//                    stmt.getVarName());
//
//            if (stmt instanceof SpecVar) {
//                SpecVar asSpecVar = (SpecVar) stmt;
//                LLVMBuildStore(
//                        LLVMEmitter.getInstance().builder,
//                        asSpecVar.getValue().getLLVMValue(),
//                        varAlloc);
//            }
//            FrontEnd.currentScope.setLLVMSymRef(this.varName, varAlloc);
//        });
        return null;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }
}
