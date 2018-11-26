package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.cmd.ReadCmd;

public class ReadVisitor extends GraceParserBaseVisitor<ReadCmd> {

    public ReadCmd visitCmdRead(GraceParser.CmdReadContext ctx) {
        ReadCmd readCmd = new ReadCmd(new ExpressionVisitor().visit(ctx.variable()));
        return readCmd;
    }

}