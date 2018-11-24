package uem.ast.stmt.sub;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.ast.Position;
import uem.ast.stmt.Statement;
import uem.ast.type.Type;

import java.util.LinkedList;
import java.util.List;

public class DeclFunction implements SubStatment {
    private Type returnType;
    private List<Statement> params;
    private List<Statement> body;
    private String varName;
    private Token symbol;

    public DeclFunction(String name, List<Statement> body) {
        super();
        this.varName = name;
        this.body = body;
        this.getLLVMValue();
    }

    public Type getReturnType() {
        return this.returnType;
    }

    public void setReturnType(Type tp) {
        this.returnType = tp;
    }

    @Override
    public List<Statement> getParams() {
        return this.params;
    }

    @Override
    public List<Statement> setParams(List<Statement> params) {
        return this.params = params;
    }

    @Override
    public List<Statement> getBody() {
        return this.body;
    }

    @Override
    public String getVarName() {
        return this.varName;
    }

    @Override
    public Position getPosition() {
        return null;
    }

    @Override
    public void setSymbol(Token sym) {
        this.symbol = sym;
    }

    @Override
    public Token getSymbol() {
        return this.symbol;
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        List<LLVM.LLVMTypeRef> args = new LinkedList();
        args.add(LLVMEmitter.getInstance().types.i32());
        args.add(LLVMEmitter.getInstance().types.i32());
        return LLVMPresets.getInstance().buildScopeFn(
                this.getVarName(),
                LLVMEmitter.getInstance().types.i32(),
                args
        );

    }
}
