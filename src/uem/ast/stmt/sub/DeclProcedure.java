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

import static org.bytedeco.javacpp.LLVM.*;

public class DeclProcedure implements SubStatment {
    private Type returnType;
    private List<Statement> params;
    private List<Statement> body;
    private String varName;
    private Token symbol;

    public DeclProcedure(String name, List<Statement> body) {
        super();
        this.varName = name;
        this.body = body;
    }

    public DeclProcedure(String name) {
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

    /**
     * TODO:Generalizar para classe abstrata
     *
     * @param fun
     * @param params
     * @param varName
     */
    static void paramItera(LLVM.LLVMValueRef fun, List<Statement> params, String varName) {
        int i = 0;
        for (Statement param : params) {
            VarStatement currentParam;
            if (param instanceof SpecParam) {
                currentParam = (SpecParam) param;
            } else {
                currentParam = (SpecParamArr) param;

            }
            LLVM.LLVMValueRef allocatedParam = currentParam.getLLVMValue();
            LLVM.LLVMValueRef pLLVMVal = LLVMGetParam(fun, i);
            LLVMBuildStore(
                    LLVMEmitter.getInstance().builder,
                    pLLVMVal,
                    allocatedParam);
            i++;
        }
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        List<LLVM.LLVMTypeRef> args = new LinkedList();
        DeclFunction.setParamsScopeFn(args, this.params);
        LLVM.LLVMValueRef fun = LLVMPresets.getInstance().buildScopeFn(
                this.getVarName(),
                LLVMEmitter.getInstance().types.voidType(),
                args
        );
        //coloca os parametros no escopo da função
        paramItera(fun, this.params, this.varName);
        FrontEnd.currentScope.resolve(this.varName).getScope().setLLVMSymRef(this.varName, fun);

        return fun;
    }

}
