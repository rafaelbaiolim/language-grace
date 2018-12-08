package uem.ast.stmt.sub;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.ast.Position;
import uem.ast.VarStatement;
import uem.ast.stmt.SpecParam;
import uem.ast.stmt.SpecParamArr;
import uem.ast.stmt.Statement;
import uem.ast.type.Type;
import uem.listners.FrontEnd;

import java.util.LinkedList;
import java.util.List;

import static org.bytedeco.javacpp.LLVM.LLVMPointerType;

public class DeclFunction implements SubStatment {
    private Type returnType;
    private List<Statement> params;
    private List<Statement> body;
    private String varName;
    private Token symbol;

    public DeclFunction(String name) {
        super();
        this.varName = name;
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
    public void setBody(List<Statement> body) {
        this.body = body;
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
        List<LLVM.LLVMTypeRef> args = new LinkedList<>();
        setParamsScopeFn(args, this.params);
        LLVM.LLVMValueRef fun = LLVMPresets.getInstance().buildScopeFn(
                this.getVarName(),
                LLVMEmitter.getInstance().types.i32(),
                args
        );
        //coloca os parametros no escopo da função
        DeclProcedure.paramItera(fun, this.params, this.varName);
        FrontEnd.currentScope.resolve(this.varName).getScope().setLLVMSymRef(this.varName, fun);

        return fun;
    }

    static void setParamsScopeFn(List<LLVM.LLVMTypeRef> args, List<Statement> params) {
        try {
            LLVMEmitter lle = LLVMEmitter.getInstance();
            for (Statement param : params) {
                VarStatement currentParam;
                if (param instanceof SpecParam) {
                    currentParam = (SpecParam) param;
                    args.add(lle.types.getByTypeName(((SpecParam) param).getType().getName()));
                } else {
                    currentParam = (SpecParamArr) param;
                    args.add(LLVMPointerType(lle.types.getByTypeName(
                            ((SpecParamArr) param).getType().getName()), 0));

                }
            }
        } catch (NullPointerException ne) {
            //casos especiais
        }
    }
}
