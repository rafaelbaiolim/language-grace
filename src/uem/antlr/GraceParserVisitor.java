// Generated from GraceParser.g4 by ANTLR 4.5.3
package uem.antlr;

    import org.antlr.symtab.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GraceParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GraceParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GraceParser#graceFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraceFile(GraceParser.GraceFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declVarStatement}
	 * labeled alternative in {@link GraceParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclVarStatement(GraceParser.DeclVarStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decSubStatement}
	 * labeled alternative in {@link GraceParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecSubStatement(GraceParser.DecSubStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmd}
	 * labeled alternative in {@link GraceParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(GraceParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrementOperation}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementOperation(GraceParser.IncrementOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpression(GraceParser.MinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrReference}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrReference(GraceParser.ArrReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code differenceExpression}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifferenceExpression(GraceParser.DifferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryOperation}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryOperation(GraceParser.TernaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalReference}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralReference(GraceParser.LiteralReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareOperation}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOperation(GraceParser.CompareOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(GraceParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperation(GraceParser.BinaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varReference}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarReference(GraceParser.VarReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#declVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclVar(GraceParser.DeclVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#listSpecVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListSpecVars(GraceParser.ListSpecVarsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directSpecVar}
	 * labeled alternative in {@link GraceParser#specVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectSpecVar(GraceParser.DirectSpecVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directSpecVarSimpleIni}
	 * labeled alternative in {@link GraceParser#specVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectSpecVarSimpleIni(GraceParser.DirectSpecVarSimpleIniContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directSpecVarArr}
	 * labeled alternative in {@link GraceParser#specVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectSpecVarArr(GraceParser.DirectSpecVarArrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directSpecVarArrIni}
	 * labeled alternative in {@link GraceParser#specVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectSpecVarArrIni(GraceParser.DirectSpecVarArrIniContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#specVarSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecVarSimple(GraceParser.SpecVarSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#specVarSimpleIni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecVarSimpleIni(GraceParser.SpecVarSimpleIniContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#specVarArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecVarArr(GraceParser.SpecVarArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#specVarArrIni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecVarArrIni(GraceParser.SpecVarArrIniContext ctx);
	/**
	 * Visit a parse tree produced by the {@code procedure}
	 * labeled alternative in {@link GraceParser#decSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(GraceParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link GraceParser#decSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GraceParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#decProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecProc(GraceParser.DecProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#decFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecFunc(GraceParser.DecFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#lstParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLstParam(GraceParser.LstParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#specParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecParam(GraceParser.SpecParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idParam}
	 * labeled alternative in {@link GraceParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdParam(GraceParser.IdParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrParam}
	 * labeled alternative in {@link GraceParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrParam(GraceParser.ArrParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmsimple}
	 * labeled alternative in {@link GraceParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmsimple(GraceParser.CmsimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmblock}
	 * labeled alternative in {@link GraceParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmblock(GraceParser.CmblockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmAtrib}
	 * labeled alternative in {@link GraceParser#cmdSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmAtrib(GraceParser.CmAtribContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmIf}
	 * labeled alternative in {@link GraceParser#cmdSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmIf(GraceParser.CmIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmWhile}
	 * labeled alternative in {@link GraceParser#cmdSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmWhile(GraceParser.CmWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmFor}
	 * labeled alternative in {@link GraceParser#cmdSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmFor(GraceParser.CmForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmStop}
	 * labeled alternative in {@link GraceParser#cmdSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmStop(GraceParser.CmStopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmSkip}
	 * labeled alternative in {@link GraceParser#cmdSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmSkip(GraceParser.CmSkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmReturn}
	 * labeled alternative in {@link GraceParser#cmdSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmReturn(GraceParser.CmReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmProc}
	 * labeled alternative in {@link GraceParser#cmdSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmProc(GraceParser.CmProcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmRead}
	 * labeled alternative in {@link GraceParser#cmdSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmRead(GraceParser.CmReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmWrite}
	 * labeled alternative in {@link GraceParser#cmdSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmWrite(GraceParser.CmWriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribVar}
	 * labeled alternative in {@link GraceParser#cmdAtrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribVar(GraceParser.AtribVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribArr}
	 * labeled alternative in {@link GraceParser#cmdAtrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribArr(GraceParser.AtribArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#arrAtrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrAtrib(GraceParser.ArrAtribContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrib(GraceParser.AtribContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdIf(GraceParser.CmdIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdWhile(GraceParser.CmdWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFor(GraceParser.CmdForContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(GraceParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#forItera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForItera(GraceParser.ForIteraContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdStop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdStop(GraceParser.CmdStopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdSkip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSkip(GraceParser.CmdSkipContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdReturn(GraceParser.CmdReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdCallProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCallProc(GraceParser.CmdCallProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRead(GraceParser.CmdReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdWrite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdWrite(GraceParser.CmdWriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GraceParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(GraceParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#lstOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLstOP(GraceParser.LstOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link GraceParser#lstType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(GraceParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link GraceParser#lstType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(GraceParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link GraceParser#lstType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(GraceParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link GraceParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(GraceParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link GraceParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(GraceParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueLiteral}
	 * labeled alternative in {@link GraceParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteral(GraceParser.TrueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseLiteral}
	 * labeled alternative in {@link GraceParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLiteral(GraceParser.FalseLiteralContext ctx);
}