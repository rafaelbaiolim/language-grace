package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.DeclVar;
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
        DeclVar declVar = new DeclVar(lst, type);


        return declVar;
    }


}
