package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.Expression;
import uem.ast.stmt.SpecVar;
import uem.ast.stmt.SpecVarArr;
import uem.ast.stmt.SpecVarArrIni;
import uem.ast.stmt.Statement;

import java.util.LinkedList;
import java.util.List;

public class SpecVarVisitor extends GraceParserBaseVisitor<Statement> {

    public Statement visitDirectSpecVarSimpleIni(GraceParser.DirectSpecVarSimpleIniContext directSpecVarSimpleIniContext) {
        GraceParser.SpecVarSimpleIniContext specVarSimpleIni = directSpecVarSimpleIniContext.specVarSimpleIni();
        SpecVar spcVar = new SpecVar(
                specVarSimpleIni.ID().getText(),
                new ExpressionVisitor().visit(specVarSimpleIni.expression()));
        spcVar.setSymbol(specVarSimpleIni.ID().getSymbol());
        return spcVar;
    }

    public Statement visitDirectSpecVar(GraceParser.DirectSpecVarContext directSpecVarSimpleIniContext) {
        GraceParser.SpecVarSimpleContext specVarSimpleIni = directSpecVarSimpleIniContext.specVarSimple();
        SpecVar spcVar = new SpecVar(specVarSimpleIni.ID().getText()); //não tem inicialização de valor/ exp
        spcVar.setSymbol(specVarSimpleIni.ID().getSymbol());
        return spcVar;
    }

    public Statement visitSpecVarArr(GraceParser.SpecVarArrContext sVarArrCtx) {
        SpecVarArr spcVarArr = new SpecVarArr(
                sVarArrCtx.ID().getText(),
                sVarArrCtx.NUMBERLITERAL().get(0).getText()
        );
        spcVarArr.setSymbol(sVarArrCtx.ID().getSymbol());
        return spcVarArr;
    }

    public Statement visitSpecVarArrIni(GraceParser.SpecVarArrIniContext sVarArrCtx) {
        LinkedList<Expression> iniList = new LinkedList<>();
        sVarArrCtx.literal().forEach(stmt -> iniList.add(new LiteralVisitor().visit(stmt)));
        SpecVarArrIni spcVarArrIni = new SpecVarArrIni(
                sVarArrCtx.specVarArr().ID().getText(),
                sVarArrCtx.specVarArr().NUMBERLITERAL().get(0).getText() //size
        );
        spcVarArrIni.setInicializacao(iniList);
        return spcVarArrIni;
    }
}