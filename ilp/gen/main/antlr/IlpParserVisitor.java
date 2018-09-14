// Generated from /home/rafaellb/Documents/uem/ilp2018/compilador/ilp/src/main/antlr/IlpParser.g4 by ANTLR 4.7
package main.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IlpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IlpParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IlpParser#ilpFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIlpFile(IlpParser.IlpFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(IlpParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#lstOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLstOP(IlpParser.LstOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link IlpParser#lstType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(IlpParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link IlpParser#lstType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(IlpParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link IlpParser#lstType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(IlpParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link IlpParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(IlpParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link IlpParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(IlpParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueLiteral}
	 * labeled alternative in {@link IlpParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteral(IlpParser.TrueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseLiteral}
	 * labeled alternative in {@link IlpParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLiteral(IlpParser.FalseLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(IlpParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declVarStatement}
	 * labeled alternative in {@link IlpParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclVarStatement(IlpParser.DeclVarStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link IlpParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(IlpParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#cmdSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSimple(IlpParser.CmdSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#cmdAtrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtrib(IlpParser.CmdAtribContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrib(IlpParser.AtribContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(IlpParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrementOperation}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementOperation(IlpParser.IncrementOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpression(IlpParser.MinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code differenceExpression}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifferenceExpression(IlpParser.DifferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryOperation}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryOperation(IlpParser.TernaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalReference}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralReference(IlpParser.LiteralReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareOperation}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOperation(IlpParser.CompareOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(IlpParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperation(IlpParser.BinaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varReference}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarReference(IlpParser.VarReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#cmdIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdIf(IlpParser.CmdIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#cmdWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdWhile(IlpParser.CmdWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(IlpParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#forItera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForItera(IlpParser.ForIteraContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#cmdFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFor(IlpParser.CmdForContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#cmdStop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdStop(IlpParser.CmdStopContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#cmdSkip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSkip(IlpParser.CmdSkipContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#cmdReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdReturn(IlpParser.CmdReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#cmdCallProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCallProc(IlpParser.CmdCallProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#cmdRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRead(IlpParser.CmdReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#cmdWrite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdWrite(IlpParser.CmdWriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(IlpParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link IlpParser#specVarSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(IlpParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directAssign}
	 * labeled alternative in {@link IlpParser#specVarSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectAssign(IlpParser.DirectAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#specVarSimpleIni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecVarSimpleIni(IlpParser.SpecVarSimpleIniContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#specVarArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecVarArr(IlpParser.SpecVarArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#lstArrIni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLstArrIni(IlpParser.LstArrIniContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#specVarArrIni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecVarArrIni(IlpParser.SpecVarArrIniContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directSpecVar}
	 * labeled alternative in {@link IlpParser#specVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectSpecVar(IlpParser.DirectSpecVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directSpecVarSimpleIni}
	 * labeled alternative in {@link IlpParser#specVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectSpecVarSimpleIni(IlpParser.DirectSpecVarSimpleIniContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directSpecVarArr}
	 * labeled alternative in {@link IlpParser#specVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectSpecVarArr(IlpParser.DirectSpecVarArrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directSpecVarArrIni}
	 * labeled alternative in {@link IlpParser#specVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectSpecVarArrIni(IlpParser.DirectSpecVarArrIniContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#listSpecVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListSpecVars(IlpParser.ListSpecVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link IlpParser#declVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclVar(IlpParser.DeclVarContext ctx);
}