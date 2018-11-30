package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;

public class StatementVisitor extends GraceParserBaseVisitor<Statement> {
    public Statement visitDeclVarStatement(GraceParser.DeclVarStatementContext ctx) {
        return new DeclVarVisitor().visit(ctx.declVar());
    }

    public Statement visitCmAtrib(GraceParser.CmAtribContext ctx) {
        return new AtribVisitor().visit(ctx);
    }

    public Statement visitCmIf(GraceParser.CmIfContext ctx) {
        return new CondicionalVisitor().visit(ctx);
    }

    public Statement visitCmWhile(GraceParser.CmWhileContext ctx) {
        return new WhileVisitor().visit(ctx);
    }

    public Statement visitCmProc(GraceParser.CmProcContext ctx) {
        return new CallProcVisitor().visit(ctx);
    }

    public Statement visitCmStop(GraceParser.CmStopContext ctx) {
        return new StopVisitor().visit(ctx);
    }

    public Statement visitCmSkip(GraceParser.CmSkipContext ctx) {
        return new SkipVisitor().visit(ctx);
    }

    public Statement visitCmReturn(GraceParser.CmReturnContext ctx) {
        return new ReturnVisitor().visit(ctx);
    }

    public Statement visitCmRead(GraceParser.CmReadContext ctx) {
        return new ReadVisitor().visit(ctx);
    }

    public Statement visitCmWrite(GraceParser.CmWriteContext ctx) {
        return new WriteVisitor().visit(ctx);
    }

    public Statement visitDecSubStatement(GraceParser.DecSubStatementContext ctx) {
        return new SubVisitor().visit(ctx.decSub());
    }

}
