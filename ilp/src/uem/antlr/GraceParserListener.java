// Generated from GraceParser.g4 by ANTLR 4.5.3
package uem.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GraceParser}.
 */
public interface GraceParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GraceParser#graceFile}.
	 * @param ctx the parse tree
	 */
	void enterGraceFile(GraceParser.GraceFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#graceFile}.
	 * @param ctx the parse tree
	 */
	void exitGraceFile(GraceParser.GraceFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(GraceParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(GraceParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declVarStatement}
	 * labeled alternative in {@link GraceParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclVarStatement(GraceParser.DeclVarStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declVarStatement}
	 * labeled alternative in {@link GraceParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclVarStatement(GraceParser.DeclVarStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link GraceParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(GraceParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link GraceParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(GraceParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decSubStatement}
	 * labeled alternative in {@link GraceParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDecSubStatement(GraceParser.DecSubStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decSubStatement}
	 * labeled alternative in {@link GraceParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDecSubStatement(GraceParser.DecSubStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incrementOperation}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIncrementOperation(GraceParser.IncrementOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incrementOperation}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIncrementOperation(GraceParser.IncrementOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(GraceParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(GraceParser.MinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code differenceExpression}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDifferenceExpression(GraceParser.DifferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code differenceExpression}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDifferenceExpression(GraceParser.DifferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryOperation}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryOperation(GraceParser.TernaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryOperation}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryOperation(GraceParser.TernaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalReference}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralReference(GraceParser.LiteralReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalReference}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralReference(GraceParser.LiteralReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareOperation}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompareOperation(GraceParser.CompareOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareOperation}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompareOperation(GraceParser.CompareOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(GraceParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(GraceParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperation(GraceParser.BinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperation(GraceParser.BinaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varReference}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarReference(GraceParser.VarReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varReference}
	 * labeled alternative in {@link GraceParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarReference(GraceParser.VarReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#declVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclVar(GraceParser.DeclVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#declVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclVar(GraceParser.DeclVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#listSpecVars}.
	 * @param ctx the parse tree
	 */
	void enterListSpecVars(GraceParser.ListSpecVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#listSpecVars}.
	 * @param ctx the parse tree
	 */
	void exitListSpecVars(GraceParser.ListSpecVarsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directSpecVar}
	 * labeled alternative in {@link GraceParser#specVar}.
	 * @param ctx the parse tree
	 */
	void enterDirectSpecVar(GraceParser.DirectSpecVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directSpecVar}
	 * labeled alternative in {@link GraceParser#specVar}.
	 * @param ctx the parse tree
	 */
	void exitDirectSpecVar(GraceParser.DirectSpecVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directSpecVarSimpleIni}
	 * labeled alternative in {@link GraceParser#specVar}.
	 * @param ctx the parse tree
	 */
	void enterDirectSpecVarSimpleIni(GraceParser.DirectSpecVarSimpleIniContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directSpecVarSimpleIni}
	 * labeled alternative in {@link GraceParser#specVar}.
	 * @param ctx the parse tree
	 */
	void exitDirectSpecVarSimpleIni(GraceParser.DirectSpecVarSimpleIniContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directSpecVarArr}
	 * labeled alternative in {@link GraceParser#specVar}.
	 * @param ctx the parse tree
	 */
	void enterDirectSpecVarArr(GraceParser.DirectSpecVarArrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directSpecVarArr}
	 * labeled alternative in {@link GraceParser#specVar}.
	 * @param ctx the parse tree
	 */
	void exitDirectSpecVarArr(GraceParser.DirectSpecVarArrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directSpecVarArrIni}
	 * labeled alternative in {@link GraceParser#specVar}.
	 * @param ctx the parse tree
	 */
	void enterDirectSpecVarArrIni(GraceParser.DirectSpecVarArrIniContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directSpecVarArrIni}
	 * labeled alternative in {@link GraceParser#specVar}.
	 * @param ctx the parse tree
	 */
	void exitDirectSpecVarArrIni(GraceParser.DirectSpecVarArrIniContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#specVarSimple}.
	 * @param ctx the parse tree
	 */
	void enterSpecVarSimple(GraceParser.SpecVarSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#specVarSimple}.
	 * @param ctx the parse tree
	 */
	void exitSpecVarSimple(GraceParser.SpecVarSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#specVarSimpleIni}.
	 * @param ctx the parse tree
	 */
	void enterSpecVarSimpleIni(GraceParser.SpecVarSimpleIniContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#specVarSimpleIni}.
	 * @param ctx the parse tree
	 */
	void exitSpecVarSimpleIni(GraceParser.SpecVarSimpleIniContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#specVarArr}.
	 * @param ctx the parse tree
	 */
	void enterSpecVarArr(GraceParser.SpecVarArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#specVarArr}.
	 * @param ctx the parse tree
	 */
	void exitSpecVarArr(GraceParser.SpecVarArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#specVarArrIni}.
	 * @param ctx the parse tree
	 */
	void enterSpecVarArrIni(GraceParser.SpecVarArrIniContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#specVarArrIni}.
	 * @param ctx the parse tree
	 */
	void exitSpecVarArrIni(GraceParser.SpecVarArrIniContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#decSub}.
	 * @param ctx the parse tree
	 */
	void enterDecSub(GraceParser.DecSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#decSub}.
	 * @param ctx the parse tree
	 */
	void exitDecSub(GraceParser.DecSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#decProc}.
	 * @param ctx the parse tree
	 */
	void enterDecProc(GraceParser.DecProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#decProc}.
	 * @param ctx the parse tree
	 */
	void exitDecProc(GraceParser.DecProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#decFunc}.
	 * @param ctx the parse tree
	 */
	void enterDecFunc(GraceParser.DecFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#decFunc}.
	 * @param ctx the parse tree
	 */
	void exitDecFunc(GraceParser.DecFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#lstParam}.
	 * @param ctx the parse tree
	 */
	void enterLstParam(GraceParser.LstParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#lstParam}.
	 * @param ctx the parse tree
	 */
	void exitLstParam(GraceParser.LstParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#specParam}.
	 * @param ctx the parse tree
	 */
	void enterSpecParam(GraceParser.SpecParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#specParam}.
	 * @param ctx the parse tree
	 */
	void exitSpecParam(GraceParser.SpecParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(GraceParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(GraceParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(GraceParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(GraceParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdSimple}.
	 * @param ctx the parse tree
	 */
	void enterCmdSimple(GraceParser.CmdSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdSimple}.
	 * @param ctx the parse tree
	 */
	void exitCmdSimple(GraceParser.CmdSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtrib(GraceParser.CmdAtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtrib(GraceParser.CmdAtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(GraceParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(GraceParser.AtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(GraceParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(GraceParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdWhile(GraceParser.CmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdWhile(GraceParser.CmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdFor}.
	 * @param ctx the parse tree
	 */
	void enterCmdFor(GraceParser.CmdForContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdFor}.
	 * @param ctx the parse tree
	 */
	void exitCmdFor(GraceParser.CmdForContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(GraceParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(GraceParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#forItera}.
	 * @param ctx the parse tree
	 */
	void enterForItera(GraceParser.ForIteraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#forItera}.
	 * @param ctx the parse tree
	 */
	void exitForItera(GraceParser.ForIteraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdStop}.
	 * @param ctx the parse tree
	 */
	void enterCmdStop(GraceParser.CmdStopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdStop}.
	 * @param ctx the parse tree
	 */
	void exitCmdStop(GraceParser.CmdStopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdSkip}.
	 * @param ctx the parse tree
	 */
	void enterCmdSkip(GraceParser.CmdSkipContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdSkip}.
	 * @param ctx the parse tree
	 */
	void exitCmdSkip(GraceParser.CmdSkipContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdReturn}.
	 * @param ctx the parse tree
	 */
	void enterCmdReturn(GraceParser.CmdReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdReturn}.
	 * @param ctx the parse tree
	 */
	void exitCmdReturn(GraceParser.CmdReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdCallProc}.
	 * @param ctx the parse tree
	 */
	void enterCmdCallProc(GraceParser.CmdCallProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdCallProc}.
	 * @param ctx the parse tree
	 */
	void exitCmdCallProc(GraceParser.CmdCallProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void enterCmdRead(GraceParser.CmdReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void exitCmdRead(GraceParser.CmdReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void enterCmdWrite(GraceParser.CmdWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void exitCmdWrite(GraceParser.CmdWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GraceParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GraceParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GraceParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GraceParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#lstOP}.
	 * @param ctx the parse tree
	 */
	void enterLstOP(GraceParser.LstOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#lstOP}.
	 * @param ctx the parse tree
	 */
	void exitLstOP(GraceParser.LstOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link GraceParser#lstType}.
	 * @param ctx the parse tree
	 */
	void enterInteger(GraceParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link GraceParser#lstType}.
	 * @param ctx the parse tree
	 */
	void exitInteger(GraceParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link GraceParser#lstType}.
	 * @param ctx the parse tree
	 */
	void enterString(GraceParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link GraceParser#lstType}.
	 * @param ctx the parse tree
	 */
	void exitString(GraceParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link GraceParser#lstType}.
	 * @param ctx the parse tree
	 */
	void enterBool(GraceParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link GraceParser#lstType}.
	 * @param ctx the parse tree
	 */
	void exitBool(GraceParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link GraceParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(GraceParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link GraceParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(GraceParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link GraceParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(GraceParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link GraceParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(GraceParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueLiteral}
	 * labeled alternative in {@link GraceParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteral(GraceParser.TrueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueLiteral}
	 * labeled alternative in {@link GraceParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteral(GraceParser.TrueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseLiteral}
	 * labeled alternative in {@link GraceParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteral(GraceParser.FalseLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseLiteral}
	 * labeled alternative in {@link GraceParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteral(GraceParser.FalseLiteralContext ctx);
}