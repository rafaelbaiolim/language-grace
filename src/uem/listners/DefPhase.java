package uem.listners;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseListener;
import uem.ast.scope.*;
import uem.ast.stmt.Statement;
import uem.ast.type.Type;
import uem.visitors.ListSpecVarVisitor;
import uem.visitors.ListTypeVisitor;

import java.util.List;

public class DefPhase extends GraceParserBaseListener {
    public ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
    public GlobalScope globals;
    public Scope currentScope; // define symbols in this scope​ ​

    void saveScope(ParserRuleContext ctx, Scope s) {
        scopes.put(ctx, s);
    }


    public void enterGraceFile(GraceParser.GraceFileContext ctx) {
        globals = new GlobalScope(null);
        currentScope = globals;
    }

    public void exitGraceFile(GraceParser.GraceFileContext ctx) {
        System.out.println(globals);
    }

    public void exitDeclVar(GraceParser.DeclVarContext declVarCtx) {
        try {
            GraceParser.ListSpecVarsContext listSpecVarsContext = declVarCtx.listSpecVars();
            GraceParser.LstTypeContext listTypeCtx = declVarCtx.lstType();

            ListSpecVarVisitor listExprVisit = new ListSpecVarVisitor();
            ListTypeVisitor listTypeVisitor = new ListTypeVisitor();

            List<Statement> lst = listExprVisit.visit(listSpecVarsContext);
            Type currentType = listTypeVisitor.visit(listTypeCtx);
            lst.forEach(stmt -> {
                defineVar(currentType, stmt);
            });
        }catch (Exception ex){
            //Erro sintático
        }
    }

    void defineVar(Type typeCtx, Statement stmtCtxt) {
        int typeTokenType = typeCtx.getType();
        Symbol.Type type = CheckSymbols.getType(typeTokenType);
        VariableSymbol var = new VariableSymbol(stmtCtxt.getVarName(), type);
        currentScope.define(var);
    }

}
