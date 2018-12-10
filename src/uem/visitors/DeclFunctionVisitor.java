package uem.visitors;

import org.antlr.symtab.FunctionSymbol;
import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;
import uem.ast.stmt.sub.DeclFunction;
import uem.ast.type.Type;
import uem.listners.FrontEnd;

import java.util.LinkedList;

public class DeclFunctionVisitor extends GraceParserBaseVisitor<DeclFunction> {

    public DeclFunction visitDecFunc(GraceParser.DecFuncContext ctx) {
        //Declaração da função
        DeclFunction declFunction = new DeclFunction(
                ctx.ID().getText());

        //tipo
        Type type = new ListTypeVisitor().visit(ctx.lstType());
        LinkedList<Statement> params = new ListSpecParamVisitor().visitLstParam(ctx.lstParam());
        ((FunctionSymbol) FrontEnd.currentScope).setType(type);

        //define parametros para o escopo
        DeclProcedureVisitor.defineParam(params);
        declFunction.setParams(params);

        //stmt
        declFunction.getLLVMValue();

        declFunction.setBody(new BlockVisitor().visit(ctx.block()));
        declFunction.setReturnType(type);
        LLVMEmitter.getInstance().popScope();               //sai do escopo da procedure
        LLVMPresets.getInstance().finalizeFunctionScope();  //volta para o bloco anterior
        return declFunction;
    }


}
