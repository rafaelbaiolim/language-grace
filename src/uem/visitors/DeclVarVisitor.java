package uem.visitors;

import org.antlr.symtab.VariableSymbol;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.DeclVar;
import uem.ast.stmt.SpecVar;
import uem.ast.stmt.Statement;
import uem.ast.type.Type;

import java.util.List;

public class DeclVarVisitor extends GraceParserBaseVisitor<DeclVar> {

    public DeclVar visitDeclVar(GraceParser.DeclVarContext ctx) {

        GraceParser.ListSpecVarsContext listSpecVarsContext = ctx.listSpecVars();
        //lista de vars
        List<Statement> lst = new ListSpecVarVisitor().visit(listSpecVarsContext);

        //tipo
        Type type = new ListTypeVisitor().visit(ctx.lstType());
        lst.forEach(stmt -> {
            SpecVar currentSpec = (SpecVar) stmt;
            VariableSymbol v = new VariableSymbol(stmt.getVarName());
            v.setType(type);
            ctx.scope.define(v);
            currentSpec.getLLVMValue(type);
        });

        DeclVar declVar = new DeclVar(lst, type);

        return declVar;
    }


}
