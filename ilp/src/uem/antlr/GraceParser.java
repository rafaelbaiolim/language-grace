// Generated from GraceParser.g4 by ANTLR 4.5.3
package uem.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraceParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_DEF=1, T_ELSE=2, T_FALSE=3, T_TRUE=4, T_BOOL=5, T_FOR=6, T_IF=7, T_INT=8, 
		T_READ=9, T_RETURN=10, T_SKIP=11, T_STOP=12, T_STRING=13, T_VAR=14, T_WHILE=15, 
		T_WRITE=16, T_LEFT_PAREN=17, T_RIGHT_PAREN=18, T_LEFT_SQUARE=19, T_RIGHT_SQUARE=20, 
		T_LEFT_CURLY_BRACE=21, T_RIGHT_CURLY_BRACE=22, T_COMMA=23, T_SEMICOLON=24, 
		T_COLON=25, T_PLUS=26, T_MINUS=27, T_ASTERISK=28, T_SLASH=29, T_PERCENT=30, 
		T_COMP=31, T_EQUAL=32, T_DIFFERENT=33, T_GREATER=34, T_GREATER_OR_EQUAL=35, 
		T_INCREMENT=36, T_DECREMENT=37, T_INC_MULT=38, T_INC_DIV=39, T_INC_MOD=40, 
		T_LOWER=41, T_LOWER_OR_EQUAL=42, T_DOT=43, T_TERN=44, NEG_UN=45, OR=46, 
		AND=47, PLUS_INC=48, MINUS_DEC=49, ID=50, COMMENT=51, WS=52, NUMBERLITERAL=53, 
		STRINGLITERAL=54;
	public static final int
		RULE_graceFile = 0, RULE_line = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_declVar = 4, RULE_listSpecVars = 5, RULE_specVar = 6, RULE_specVarSimple = 7, 
		RULE_specVarSimpleIni = 8, RULE_specVarArr = 9, RULE_specVarArrIni = 10, 
		RULE_decSub = 11, RULE_decProc = 12, RULE_decFunc = 13, RULE_lstParam = 14, 
		RULE_specParam = 15, RULE_param = 16, RULE_command = 17, RULE_cmdSimple = 18, 
		RULE_cmdAtrib = 19, RULE_atrib = 20, RULE_cmdIf = 21, RULE_cmdWhile = 22, 
		RULE_cmdFor = 23, RULE_forInit = 24, RULE_forItera = 25, RULE_cmdStop = 26, 
		RULE_cmdSkip = 27, RULE_cmdReturn = 28, RULE_cmdCallProc = 29, RULE_cmdRead = 30, 
		RULE_cmdWrite = 31, RULE_block = 32, RULE_variable = 33, RULE_lstOP = 34, 
		RULE_lstType = 35, RULE_literal = 36;
	public static final String[] ruleNames = {
		"graceFile", "line", "statement", "expression", "declVar", "listSpecVars", 
		"specVar", "specVarSimple", "specVarSimpleIni", "specVarArr", "specVarArrIni", 
		"decSub", "decProc", "decFunc", "lstParam", "specParam", "param", "command", 
		"cmdSimple", "cmdAtrib", "atrib", "cmdIf", "cmdWhile", "cmdFor", "forInit", 
		"forItera", "cmdStop", "cmdSkip", "cmdReturn", "cmdCallProc", "cmdRead", 
		"cmdWrite", "block", "variable", "lstOP", "lstType", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'def'", "'else'", "'false'", "'true'", "'bool'", "'for'", "'if'", 
		"'int'", "'read'", "'return'", "'skip'", "'stop'", "'string'", "'var'", 
		"'while'", "'write'", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", 
		"';'", "':'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'='", "'!='", 
		"'>'", "'>='", "'+='", "'-='", "'*='", "'/='", "'%='", "'<'", "'<='", 
		"'.'", "'?'", "'!'", "'||'", "'&&'", "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "T_DEF", "T_ELSE", "T_FALSE", "T_TRUE", "T_BOOL", "T_FOR", "T_IF", 
		"T_INT", "T_READ", "T_RETURN", "T_SKIP", "T_STOP", "T_STRING", "T_VAR", 
		"T_WHILE", "T_WRITE", "T_LEFT_PAREN", "T_RIGHT_PAREN", "T_LEFT_SQUARE", 
		"T_RIGHT_SQUARE", "T_LEFT_CURLY_BRACE", "T_RIGHT_CURLY_BRACE", "T_COMMA", 
		"T_SEMICOLON", "T_COLON", "T_PLUS", "T_MINUS", "T_ASTERISK", "T_SLASH", 
		"T_PERCENT", "T_COMP", "T_EQUAL", "T_DIFFERENT", "T_GREATER", "T_GREATER_OR_EQUAL", 
		"T_INCREMENT", "T_DECREMENT", "T_INC_MULT", "T_INC_DIV", "T_INC_MOD", 
		"T_LOWER", "T_LOWER_OR_EQUAL", "T_DOT", "T_TERN", "NEG_UN", "OR", "AND", 
		"PLUS_INC", "MINUS_DEC", "ID", "COMMENT", "WS", "NUMBERLITERAL", "STRINGLITERAL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GraceParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GraceParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GraceFileContext extends ParserRuleContext {
		public LineContext lines;
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public GraceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graceFile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitGraceFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraceFileContext graceFile() throws RecognitionException {
		GraceFileContext _localctx = new GraceFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_graceFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				((GraceFileContext)_localctx).lines = line();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_DEF) | (1L << T_VAR) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentStatementContext extends StatementContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecSubStatementContext extends StatementContext {
		public DecSubContext decSub() {
			return getRuleContext(DecSubContext.class,0);
		}
		public DecSubStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitDecSubStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclVarStatementContext extends StatementContext {
		public DeclVarContext declVar() {
			return getRuleContext(DeclVarContext.class,0);
		}
		public DeclVarStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitDeclVarStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(84);
			switch (_input.LA(1)) {
			case T_VAR:
				_localctx = new DeclVarStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				declVar();
				}
				break;
			case ID:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				atrib();
				}
				break;
			case T_DEF:
				_localctx = new DecSubStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				decSub();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IncrementOperationContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IncrementOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitIncrementOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DifferenceExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DifferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitDifferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryOperationContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitTernaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralReferenceContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitLiteralReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareOperationContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompareOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCompareOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryOperationContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitBinaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarReferenceContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public VarReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitVarReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			switch (_input.LA(1)) {
			case T_MINUS:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(87);
				match(T_MINUS);
				setState(88);
				expression(5);
				}
				break;
			case NEG_UN:
				{
				_localctx = new DifferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(NEG_UN);
				setState(90);
				expression(4);
				}
				break;
			case T_LEFT_PAREN:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(T_LEFT_PAREN);
				setState(92);
				expression(0);
				setState(93);
				match(T_RIGHT_PAREN);
				}
				break;
			case ID:
				{
				_localctx = new VarReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(ID);
				}
				break;
			case T_FALSE:
			case T_TRUE:
			case NUMBERLITERAL:
			case STRINGLITERAL:
				{
				_localctx = new LiteralReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new TernaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(99);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(100);
						((TernaryOperationContext)_localctx).operator = match(T_TERN);
						setState(101);
						((TernaryOperationContext)_localctx).right = expression(0);
						setState(102);
						((TernaryOperationContext)_localctx).operator = match(T_COLON);
						setState(103);
						((TernaryOperationContext)_localctx).right = expression(10);
						}
						break;
					case 2:
						{
						_localctx = new CompareOperationContext(new ExpressionContext(_parentctx, _parentState));
						((CompareOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(105);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(106);
						((CompareOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_COMP) | (1L << T_DIFFERENT) | (1L << T_GREATER) | (1L << T_GREATER_OR_EQUAL) | (1L << T_LOWER) | (1L << T_LOWER_OR_EQUAL) | (1L << OR) | (1L << AND))) != 0)) ) {
							((CompareOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(107);
						((CompareOperationContext)_localctx).right = expression(9);
						}
						break;
					case 3:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(108);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(109);
						((BinaryOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_PLUS) | (1L << T_MINUS) | (1L << T_ASTERISK) | (1L << T_SLASH) | (1L << T_PERCENT))) != 0)) ) {
							((BinaryOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(110);
						((BinaryOperationContext)_localctx).right = expression(8);
						}
						break;
					case 4:
						{
						_localctx = new IncrementOperationContext(new ExpressionContext(_parentctx, _parentState));
						((IncrementOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(112);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_PLUS) | (1L << T_MINUS) | (1L << PLUS_INC) | (1L << MINUS_DEC))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclVarContext extends ParserRuleContext {
		public ListSpecVarsContext listSpecVars() {
			return getRuleContext(ListSpecVarsContext.class,0);
		}
		public LstTypeContext lstType() {
			return getRuleContext(LstTypeContext.class,0);
		}
		public DeclVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declVar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitDeclVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclVarContext declVar() throws RecognitionException {
		DeclVarContext _localctx = new DeclVarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T_VAR);
			setState(119);
			listSpecVars();
			setState(120);
			match(T_COLON);
			setState(121);
			lstType();
			setState(122);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListSpecVarsContext extends ParserRuleContext {
		public List<SpecVarContext> specVar() {
			return getRuleContexts(SpecVarContext.class);
		}
		public SpecVarContext specVar(int i) {
			return getRuleContext(SpecVarContext.class,i);
		}
		public ListSpecVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listSpecVars; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitListSpecVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListSpecVarsContext listSpecVars() throws RecognitionException {
		ListSpecVarsContext _localctx = new ListSpecVarsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listSpecVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			specVar();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(125);
				match(T_COMMA);
				setState(126);
				specVar();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecVarContext extends ParserRuleContext {
		public SpecVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specVar; }
	 
		public SpecVarContext() { }
		public void copyFrom(SpecVarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DirectSpecVarArrContext extends SpecVarContext {
		public SpecVarArrContext specVarArr() {
			return getRuleContext(SpecVarArrContext.class,0);
		}
		public DirectSpecVarArrContext(SpecVarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitDirectSpecVarArr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DirectSpecVarSimpleIniContext extends SpecVarContext {
		public SpecVarSimpleIniContext specVarSimpleIni() {
			return getRuleContext(SpecVarSimpleIniContext.class,0);
		}
		public DirectSpecVarSimpleIniContext(SpecVarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitDirectSpecVarSimpleIni(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DirectSpecVarArrIniContext extends SpecVarContext {
		public SpecVarArrIniContext specVarArrIni() {
			return getRuleContext(SpecVarArrIniContext.class,0);
		}
		public DirectSpecVarArrIniContext(SpecVarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitDirectSpecVarArrIni(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DirectSpecVarContext extends SpecVarContext {
		public SpecVarSimpleContext specVarSimple() {
			return getRuleContext(SpecVarSimpleContext.class,0);
		}
		public DirectSpecVarContext(SpecVarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitDirectSpecVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecVarContext specVar() throws RecognitionException {
		SpecVarContext _localctx = new SpecVarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_specVar);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new DirectSpecVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				specVarSimple();
				}
				break;
			case 2:
				_localctx = new DirectSpecVarSimpleIniContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				specVarSimpleIni();
				}
				break;
			case 3:
				_localctx = new DirectSpecVarArrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				specVarArr();
				}
				break;
			case 4:
				_localctx = new DirectSpecVarArrIniContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				specVarArrIni();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecVarSimpleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public SpecVarSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specVarSimple; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitSpecVarSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecVarSimpleContext specVarSimple() throws RecognitionException {
		SpecVarSimpleContext _localctx = new SpecVarSimpleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_specVarSimple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecVarSimpleIniContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SpecVarSimpleIniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specVarSimpleIni; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitSpecVarSimpleIni(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecVarSimpleIniContext specVarSimpleIni() throws RecognitionException {
		SpecVarSimpleIniContext _localctx = new SpecVarSimpleIniContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_specVarSimpleIni);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);
			setState(141);
			match(T_EQUAL);
			setState(142);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecVarArrContext extends ParserRuleContext {
		public SpecVarSimpleContext specVarSimple() {
			return getRuleContext(SpecVarSimpleContext.class,0);
		}
		public List<TerminalNode> NUMBERLITERAL() { return getTokens(GraceParser.NUMBERLITERAL); }
		public TerminalNode NUMBERLITERAL(int i) {
			return getToken(GraceParser.NUMBERLITERAL, i);
		}
		public SpecVarArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specVarArr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitSpecVarArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecVarArrContext specVarArr() throws RecognitionException {
		SpecVarArrContext _localctx = new SpecVarArrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_specVarArr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			specVarSimple();
			setState(145);
			match(T_LEFT_SQUARE);
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				match(NUMBERLITERAL);
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBERLITERAL );
			setState(151);
			match(T_RIGHT_SQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecVarArrIniContext extends ParserRuleContext {
		public SpecVarArrContext specVarArr() {
			return getRuleContext(SpecVarArrContext.class,0);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public SpecVarArrIniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specVarArrIni; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitSpecVarArrIni(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecVarArrIniContext specVarArrIni() throws RecognitionException {
		SpecVarArrIniContext _localctx = new SpecVarArrIniContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_specVarArrIni);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			specVarArr();
			setState(154);
			match(T_EQUAL);
			setState(155);
			match(T_LEFT_CURLY_BRACE);
			setState(156);
			literal();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(157);
				match(T_COMMA);
				setState(158);
				literal();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(T_RIGHT_CURLY_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecSubContext extends ParserRuleContext {
		public DecProcContext decProc() {
			return getRuleContext(DecProcContext.class,0);
		}
		public DecFuncContext decFunc() {
			return getRuleContext(DecFuncContext.class,0);
		}
		public DecSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decSub; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitDecSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecSubContext decSub() throws RecognitionException {
		DecSubContext _localctx = new DecSubContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_decSub);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				decProc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				decFunc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecProcContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public LstParamContext lstParam() {
			return getRuleContext(LstParamContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DecProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decProc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitDecProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecProcContext decProc() throws RecognitionException {
		DecProcContext _localctx = new DecProcContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decProc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T_DEF);
			setState(171);
			match(ID);
			setState(172);
			match(T_LEFT_PAREN);
			setState(173);
			lstParam();
			setState(174);
			match(T_RIGHT_PAREN);
			setState(175);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecFuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public LstParamContext lstParam() {
			return getRuleContext(LstParamContext.class,0);
		}
		public LstTypeContext lstType() {
			return getRuleContext(LstTypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DecFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitDecFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecFuncContext decFunc() throws RecognitionException {
		DecFuncContext _localctx = new DecFuncContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_decFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T_DEF);
			setState(178);
			match(ID);
			setState(179);
			match(T_LEFT_PAREN);
			setState(180);
			lstParam();
			setState(181);
			match(T_RIGHT_PAREN);
			setState(182);
			match(T_COLON);
			setState(183);
			lstType();
			setState(184);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LstParamContext extends ParserRuleContext {
		public List<SpecParamContext> specParam() {
			return getRuleContexts(SpecParamContext.class);
		}
		public SpecParamContext specParam(int i) {
			return getRuleContext(SpecParamContext.class,i);
		}
		public LstParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lstParam; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitLstParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LstParamContext lstParam() throws RecognitionException {
		LstParamContext _localctx = new LstParamContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lstParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			specParam();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(187);
				match(T_COMMA);
				setState(188);
				specParam();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecParamContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public LstTypeContext lstType() {
			return getRuleContext(LstTypeContext.class,0);
		}
		public SpecParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specParam; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitSpecParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecParamContext specParam() throws RecognitionException {
		SpecParamContext _localctx = new SpecParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_specParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			param();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(195);
				match(T_COMMA);
				setState(196);
				param();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(T_COLON);
			setState(203);
			lstType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_param);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(ID);
				setState(207);
				match(T_LEFT_SQUARE);
				setState(208);
				match(T_RIGHT_SQUARE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public CmdSimpleContext cmdSimple() {
			return getRuleContext(CmdSimpleContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_command);
		try {
			setState(213);
			switch (_input.LA(1)) {
			case T_FOR:
			case T_IF:
			case T_READ:
			case T_RETURN:
			case T_SKIP:
			case T_STOP:
			case T_WHILE:
			case T_WRITE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				cmdSimple();
				}
				break;
			case T_LEFT_CURLY_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdSimpleContext extends ParserRuleContext {
		public CmdAtribContext cmdAtrib() {
			return getRuleContext(CmdAtribContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdForContext cmdFor() {
			return getRuleContext(CmdForContext.class,0);
		}
		public CmdStopContext cmdStop() {
			return getRuleContext(CmdStopContext.class,0);
		}
		public CmdSkipContext cmdSkip() {
			return getRuleContext(CmdSkipContext.class,0);
		}
		public CmdReturnContext cmdReturn() {
			return getRuleContext(CmdReturnContext.class,0);
		}
		public CmdCallProcContext cmdCallProc() {
			return getRuleContext(CmdCallProcContext.class,0);
		}
		public CmdReadContext cmdRead() {
			return getRuleContext(CmdReadContext.class,0);
		}
		public CmdWriteContext cmdWrite() {
			return getRuleContext(CmdWriteContext.class,0);
		}
		public CmdSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSimple; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmdSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdSimpleContext cmdSimple() throws RecognitionException {
		CmdSimpleContext _localctx = new CmdSimpleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdSimple);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				cmdAtrib();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				cmdIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				cmdWhile();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				cmdFor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				cmdStop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(220);
				cmdSkip();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(221);
				cmdReturn();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(222);
				cmdCallProc();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(223);
				cmdRead();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(224);
				cmdWrite();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdAtribContext extends ParserRuleContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public CmdAtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtrib; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmdAtrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdAtribContext cmdAtrib() throws RecognitionException {
		CmdAtribContext _localctx = new CmdAtribContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdAtrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			atrib();
			setState(228);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitAtrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			((AtribContext)_localctx).ID = match(ID);
			setState(231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_EQUAL) | (1L << T_INCREMENT) | (1L << T_DECREMENT) | (1L << T_INC_MULT) | (1L << T_INC_DIV) | (1L << T_INC_MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(232);
			expression(0);

			            if( !((BlockContext)getInvokingContext(32)).symbols.contains((((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null)) ){
			                System.err.println( "Undefined var: " + (((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null) );
			            }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdIfContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmdIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdIf);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T_IF);
			setState(236);
			match(T_LEFT_PAREN);
			setState(237);
			expression(0);
			setState(238);
			match(T_RIGHT_PAREN);
			setState(239);
			command();
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(240);
					match(T_ELSE);
					setState(241);
					command();
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdWhileContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmdWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmdWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T_WHILE);
			setState(248);
			match(T_LEFT_PAREN);
			setState(249);
			expression(0);
			setState(250);
			match(T_RIGHT_PAREN);
			setState(251);
			command();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdForContext extends ParserRuleContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForIteraContext forItera() {
			return getRuleContext(ForIteraContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CmdForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmdFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdForContext cmdFor() throws RecognitionException {
		CmdForContext _localctx = new CmdForContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmdFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T_FOR);
			setState(254);
			match(T_LEFT_PAREN);
			setState(255);
			forInit();
			setState(256);
			match(T_SEMICOLON);
			setState(257);
			expression(0);
			setState(258);
			match(T_SEMICOLON);
			setState(259);
			forItera();
			setState(260);
			match(T_RIGHT_PAREN);
			setState(261);
			command();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			atrib();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForIteraContext extends ParserRuleContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public ForIteraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forItera; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitForItera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForIteraContext forItera() throws RecognitionException {
		ForIteraContext _localctx = new ForIteraContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forItera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			atrib();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdStopContext extends ParserRuleContext {
		public CmdStopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdStop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmdStop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdStopContext cmdStop() throws RecognitionException {
		CmdStopContext _localctx = new CmdStopContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmdStop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T_STOP);
			setState(268);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdSkipContext extends ParserRuleContext {
		public CmdSkipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSkip; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmdSkip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdSkipContext cmdSkip() throws RecognitionException {
		CmdSkipContext _localctx = new CmdSkipContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cmdSkip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T_SKIP);
			setState(271);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdReturnContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CmdReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdReturn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmdReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdReturnContext cmdReturn() throws RecognitionException {
		CmdReturnContext _localctx = new CmdReturnContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cmdReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T_RETURN);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_FALSE) | (1L << T_TRUE) | (1L << T_LEFT_PAREN) | (1L << T_MINUS) | (1L << NEG_UN) | (1L << ID) | (1L << NUMBERLITERAL) | (1L << STRINGLITERAL))) != 0)) {
				{
				{
				setState(274);
				expression(0);
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdCallProcContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CmdCallProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCallProc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmdCallProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdCallProcContext cmdCallProc() throws RecognitionException {
		CmdCallProcContext _localctx = new CmdCallProcContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cmdCallProc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(ID);
			setState(283);
			match(T_LEFT_PAREN);
			{
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_FALSE) | (1L << T_TRUE) | (1L << T_LEFT_PAREN) | (1L << T_MINUS) | (1L << NEG_UN) | (1L << ID) | (1L << NUMBERLITERAL) | (1L << STRINGLITERAL))) != 0)) {
				{
				{
				setState(284);
				expression(0);
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(290);
				match(T_COMMA);
				setState(291);
				expression(0);
				}
			}

			}
			setState(294);
			match(T_RIGHT_PAREN);
			setState(295);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdReadContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public CmdReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRead; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmdRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdReadContext cmdRead() throws RecognitionException {
		CmdReadContext _localctx = new CmdReadContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cmdRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T_READ);
			setState(298);
			variable();
			setState(299);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdWriteContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CmdWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWrite; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmdWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdWriteContext cmdWrite() throws RecognitionException {
		CmdWriteContext _localctx = new CmdWriteContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cmdWrite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T_WRITE);
			setState(302);
			expression(0);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(303);
				match(T_COMMA);
				setState(304);
				expression(0);
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<String> symbols =  new ArrayList<>();
		public List<DeclVarContext> declVar() {
			return getRuleContexts(DeclVarContext.class);
		}
		public DeclVarContext declVar(int i) {
			return getRuleContext(DeclVarContext.class,i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(T_LEFT_CURLY_BRACE);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_VAR) {
				{
				{
				setState(313);
				declVar();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_FOR) | (1L << T_IF) | (1L << T_READ) | (1L << T_RETURN) | (1L << T_SKIP) | (1L << T_STOP) | (1L << T_WHILE) | (1L << T_WRITE) | (1L << T_LEFT_CURLY_BRACE) | (1L << ID))) != 0)) {
				{
				{
				setState(319);
				command();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(T_RIGHT_CURLY_BRACE);
			System.out.println("symbols=" + _localctx.symbols);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variable);
		int _la;
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(ID);
				setState(330);
				match(T_LEFT_SQUARE);
				setState(332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(331);
					expression(0);
					}
					}
					setState(334); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_FALSE) | (1L << T_TRUE) | (1L << T_LEFT_PAREN) | (1L << T_MINUS) | (1L << NEG_UN) | (1L << ID) | (1L << NUMBERLITERAL) | (1L << STRINGLITERAL))) != 0) );
				setState(336);
				match(T_RIGHT_SQUARE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LstOPContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(GraceParser.T_EQUAL, 0); }
		public TerminalNode T_PLUS() { return getToken(GraceParser.T_PLUS, 0); }
		public TerminalNode T_MINUS() { return getToken(GraceParser.T_MINUS, 0); }
		public TerminalNode T_ASTERISK() { return getToken(GraceParser.T_ASTERISK, 0); }
		public TerminalNode T_PERCENT() { return getToken(GraceParser.T_PERCENT, 0); }
		public TerminalNode T_SLASH() { return getToken(GraceParser.T_SLASH, 0); }
		public LstOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lstOP; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitLstOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LstOPContext lstOP() throws RecognitionException {
		LstOPContext _localctx = new LstOPContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_lstOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_PLUS) | (1L << T_MINUS) | (1L << T_ASTERISK) | (1L << T_SLASH) | (1L << T_PERCENT) | (1L << T_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LstTypeContext extends ParserRuleContext {
		public LstTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lstType; }
	 
		public LstTypeContext() { }
		public void copyFrom(LstTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringContext extends LstTypeContext {
		public TerminalNode T_STRING() { return getToken(GraceParser.T_STRING, 0); }
		public StringContext(LstTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends LstTypeContext {
		public TerminalNode T_BOOL() { return getToken(GraceParser.T_BOOL, 0); }
		public BoolContext(LstTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerContext extends LstTypeContext {
		public TerminalNode T_INT() { return getToken(GraceParser.T_INT, 0); }
		public IntegerContext(LstTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LstTypeContext lstType() throws RecognitionException {
		LstTypeContext _localctx = new LstTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_lstType);
		try {
			setState(345);
			switch (_input.LA(1)) {
			case T_INT:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(T_INT);
				}
				break;
			case T_STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(T_STRING);
				}
				break;
			case T_BOOL:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(T_BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FalseLiteralContext extends LiteralContext {
		public TerminalNode T_TRUE() { return getToken(GraceParser.T_TRUE, 0); }
		public FalseLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitFalseLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode STRINGLITERAL() { return getToken(GraceParser.STRINGLITERAL, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiteralContext extends LiteralContext {
		public TerminalNode NUMBERLITERAL() { return getToken(GraceParser.NUMBERLITERAL, 0); }
		public IntLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueLiteralContext extends LiteralContext {
		public TerminalNode T_FALSE() { return getToken(GraceParser.T_FALSE, 0); }
		public TrueLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitTrueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_literal);
		try {
			setState(351);
			switch (_input.LA(1)) {
			case NUMBERLITERAL:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(NUMBERLITERAL);
				}
				break;
			case STRINGLITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(STRINGLITERAL);
				}
				break;
			case T_FALSE:
				_localctx = new TrueLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(T_FALSE);
				}
				break;
			case T_TRUE:
				_localctx = new FalseLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				match(T_TRUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u0164\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\6\2N\n\2\r\2\16\2O\3\3\3\3\3\4"+
		"\3\4\3\4\5\4W\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5d\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5t\n\5\f\5"+
		"\16\5w\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u0082\n\7\f\7\16\7"+
		"\u0085\13\7\3\b\3\b\3\b\3\b\5\b\u008b\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\6\13\u0096\n\13\r\13\16\13\u0097\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u00a2\n\f\f\f\16\f\u00a5\13\f\3\f\3\f\3\r\3\r\5\r\u00ab\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\7\20\u00c0\n\20\f\20\16\20\u00c3\13\20\3"+
		"\21\3\21\3\21\7\21\u00c8\n\21\f\21\16\21\u00cb\13\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\5\22\u00d4\n\22\3\23\3\23\5\23\u00d8\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e4\n\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00f5"+
		"\n\27\f\27\16\27\u00f8\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\7\36\u0116\n\36\f\36\16\36\u0119\13\36\3"+
		"\36\3\36\3\37\3\37\3\37\7\37\u0120\n\37\f\37\16\37\u0123\13\37\3\37\3"+
		"\37\5\37\u0127\n\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\7!\u0134\n"+
		"!\f!\16!\u0137\13!\3!\3!\3\"\3\"\7\"\u013d\n\"\f\"\16\"\u0140\13\"\3\""+
		"\7\"\u0143\n\"\f\"\16\"\u0146\13\"\3\"\3\"\3\"\3#\3#\3#\3#\6#\u014f\n"+
		"#\r#\16#\u0150\3#\3#\5#\u0155\n#\3$\3$\3%\3%\3%\5%\u015c\n%\3&\3&\3&\3"+
		"&\5&\u0162\n&\3&\2\3\b\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJ\2\7\6\2!!#%+,\60\61\3\2\34 \4\2\34\35\62\63"+
		"\4\2\"\"&*\4\2\34 \"\"\u016b\2M\3\2\2\2\4Q\3\2\2\2\6V\3\2\2\2\bc\3\2\2"+
		"\2\nx\3\2\2\2\f~\3\2\2\2\16\u008a\3\2\2\2\20\u008c\3\2\2\2\22\u008e\3"+
		"\2\2\2\24\u0092\3\2\2\2\26\u009b\3\2\2\2\30\u00aa\3\2\2\2\32\u00ac\3\2"+
		"\2\2\34\u00b3\3\2\2\2\36\u00bc\3\2\2\2 \u00c4\3\2\2\2\"\u00d3\3\2\2\2"+
		"$\u00d7\3\2\2\2&\u00e3\3\2\2\2(\u00e5\3\2\2\2*\u00e8\3\2\2\2,\u00ed\3"+
		"\2\2\2.\u00f9\3\2\2\2\60\u00ff\3\2\2\2\62\u0109\3\2\2\2\64\u010b\3\2\2"+
		"\2\66\u010d\3\2\2\28\u0110\3\2\2\2:\u0113\3\2\2\2<\u011c\3\2\2\2>\u012b"+
		"\3\2\2\2@\u012f\3\2\2\2B\u013a\3\2\2\2D\u0154\3\2\2\2F\u0156\3\2\2\2H"+
		"\u015b\3\2\2\2J\u0161\3\2\2\2LN\5\4\3\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2"+
		"OP\3\2\2\2P\3\3\2\2\2QR\5\6\4\2R\5\3\2\2\2SW\5\n\6\2TW\5*\26\2UW\5\30"+
		"\r\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\7\3\2\2\2XY\b\5\1\2YZ\7\35\2\2Zd\5"+
		"\b\5\7[\\\7/\2\2\\d\5\b\5\6]^\7\23\2\2^_\5\b\5\2_`\7\24\2\2`d\3\2\2\2"+
		"ad\7\64\2\2bd\5J&\2cX\3\2\2\2c[\3\2\2\2c]\3\2\2\2ca\3\2\2\2cb\3\2\2\2"+
		"du\3\2\2\2ef\f\13\2\2fg\7.\2\2gh\5\b\5\2hi\7\33\2\2ij\5\b\5\fjt\3\2\2"+
		"\2kl\f\n\2\2lm\t\2\2\2mt\5\b\5\13no\f\t\2\2op\t\3\2\2pt\5\b\5\nqr\f\b"+
		"\2\2rt\t\4\2\2se\3\2\2\2sk\3\2\2\2sn\3\2\2\2sq\3\2\2\2tw\3\2\2\2us\3\2"+
		"\2\2uv\3\2\2\2v\t\3\2\2\2wu\3\2\2\2xy\7\20\2\2yz\5\f\7\2z{\7\33\2\2{|"+
		"\5H%\2|}\7\32\2\2}\13\3\2\2\2~\u0083\5\16\b\2\177\u0080\7\31\2\2\u0080"+
		"\u0082\5\16\b\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\r\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008b"+
		"\5\20\t\2\u0087\u008b\5\22\n\2\u0088\u008b\5\24\13\2\u0089\u008b\5\26"+
		"\f\2\u008a\u0086\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\17\3\2\2\2\u008c\u008d\7\64\2\2\u008d\21\3\2\2\2"+
		"\u008e\u008f\7\64\2\2\u008f\u0090\7\"\2\2\u0090\u0091\5\b\5\2\u0091\23"+
		"\3\2\2\2\u0092\u0093\5\20\t\2\u0093\u0095\7\25\2\2\u0094\u0096\7\67\2"+
		"\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\26\2\2\u009a\25\3\2\2\2\u009b"+
		"\u009c\5\24\13\2\u009c\u009d\7\"\2\2\u009d\u009e\7\27\2\2\u009e\u00a3"+
		"\5J&\2\u009f\u00a0\7\31\2\2\u00a0\u00a2\5J&\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\30\2\2\u00a7\27\3\2\2\2\u00a8\u00ab"+
		"\5\32\16\2\u00a9\u00ab\5\34\17\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2"+
		"\2\u00ab\31\3\2\2\2\u00ac\u00ad\7\3\2\2\u00ad\u00ae\7\64\2\2\u00ae\u00af"+
		"\7\23\2\2\u00af\u00b0\5\36\20\2\u00b0\u00b1\7\24\2\2\u00b1\u00b2\5B\""+
		"\2\u00b2\33\3\2\2\2\u00b3\u00b4\7\3\2\2\u00b4\u00b5\7\64\2\2\u00b5\u00b6"+
		"\7\23\2\2\u00b6\u00b7\5\36\20\2\u00b7\u00b8\7\24\2\2\u00b8\u00b9\7\33"+
		"\2\2\u00b9\u00ba\5H%\2\u00ba\u00bb\5B\"\2\u00bb\35\3\2\2\2\u00bc\u00c1"+
		"\5 \21\2\u00bd\u00be\7\31\2\2\u00be\u00c0\5 \21\2\u00bf\u00bd\3\2\2\2"+
		"\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\37"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c9\5\"\22\2\u00c5\u00c6\7\31\2\2"+
		"\u00c6\u00c8\5\"\22\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cd\7\33\2\2\u00cd\u00ce\5H%\2\u00ce!\3\2\2\2\u00cf\u00d4\7\64\2\2"+
		"\u00d0\u00d1\7\64\2\2\u00d1\u00d2\7\25\2\2\u00d2\u00d4\7\26\2\2\u00d3"+
		"\u00cf\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4#\3\2\2\2\u00d5\u00d8\5&\24\2"+
		"\u00d6\u00d8\5B\"\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8%\3\2"+
		"\2\2\u00d9\u00e4\5(\25\2\u00da\u00e4\5,\27\2\u00db\u00e4\5.\30\2\u00dc"+
		"\u00e4\5\60\31\2\u00dd\u00e4\5\66\34\2\u00de\u00e4\58\35\2\u00df\u00e4"+
		"\5:\36\2\u00e0\u00e4\5<\37\2\u00e1\u00e4\5> \2\u00e2\u00e4\5@!\2\u00e3"+
		"\u00d9\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3\u00dc\3\2"+
		"\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3"+
		"\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\'\3\2\2\2"+
		"\u00e5\u00e6\5*\26\2\u00e6\u00e7\7\32\2\2\u00e7)\3\2\2\2\u00e8\u00e9\7"+
		"\64\2\2\u00e9\u00ea\t\5\2\2\u00ea\u00eb\5\b\5\2\u00eb\u00ec\b\26\1\2\u00ec"+
		"+\3\2\2\2\u00ed\u00ee\7\t\2\2\u00ee\u00ef\7\23\2\2\u00ef\u00f0\5\b\5\2"+
		"\u00f0\u00f1\7\24\2\2\u00f1\u00f6\5$\23\2\u00f2\u00f3\7\4\2\2\u00f3\u00f5"+
		"\5$\23\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7-\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\21\2\2"+
		"\u00fa\u00fb\7\23\2\2\u00fb\u00fc\5\b\5\2\u00fc\u00fd\7\24\2\2\u00fd\u00fe"+
		"\5$\23\2\u00fe/\3\2\2\2\u00ff\u0100\7\b\2\2\u0100\u0101\7\23\2\2\u0101"+
		"\u0102\5\62\32\2\u0102\u0103\7\32\2\2\u0103\u0104\5\b\5\2\u0104\u0105"+
		"\7\32\2\2\u0105\u0106\5\64\33\2\u0106\u0107\7\24\2\2\u0107\u0108\5$\23"+
		"\2\u0108\61\3\2\2\2\u0109\u010a\5*\26\2\u010a\63\3\2\2\2\u010b\u010c\5"+
		"*\26\2\u010c\65\3\2\2\2\u010d\u010e\7\16\2\2\u010e\u010f\7\32\2\2\u010f"+
		"\67\3\2\2\2\u0110\u0111\7\r\2\2\u0111\u0112\7\32\2\2\u01129\3\2\2\2\u0113"+
		"\u0117\7\f\2\2\u0114\u0116\5\b\5\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011b\7\32\2\2\u011b;\3\2\2\2\u011c\u011d\7\64\2"+
		"\2\u011d\u0121\7\23\2\2\u011e\u0120\5\b\5\2\u011f\u011e\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0126\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7\31\2\2\u0125\u0127\5\b\5\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7\24"+
		"\2\2\u0129\u012a\7\32\2\2\u012a=\3\2\2\2\u012b\u012c\7\13\2\2\u012c\u012d"+
		"\5D#\2\u012d\u012e\7\32\2\2\u012e?\3\2\2\2\u012f\u0130\7\22\2\2\u0130"+
		"\u0135\5\b\5\2\u0131\u0132\7\31\2\2\u0132\u0134\5\b\5\2\u0133\u0131\3"+
		"\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7\32\2\2\u0139A\3\2\2\2"+
		"\u013a\u013e\7\27\2\2\u013b\u013d\5\n\6\2\u013c\u013b\3\2\2\2\u013d\u0140"+
		"\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0144\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0141\u0143\5$\23\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2"+
		"\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0147\u0148\7\30\2\2\u0148\u0149\b\"\1\2\u0149C\3\2\2\2"+
		"\u014a\u0155\7\64\2\2\u014b\u014c\7\64\2\2\u014c\u014e\7\25\2\2\u014d"+
		"\u014f\5\b\5\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\7\26\2\2\u0153"+
		"\u0155\3\2\2\2\u0154\u014a\3\2\2\2\u0154\u014b\3\2\2\2\u0155E\3\2\2\2"+
		"\u0156\u0157\t\6\2\2\u0157G\3\2\2\2\u0158\u015c\7\n\2\2\u0159\u015c\7"+
		"\17\2\2\u015a\u015c\7\7\2\2\u015b\u0158\3\2\2\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015a\3\2\2\2\u015cI\3\2\2\2\u015d\u0162\7\67\2\2\u015e\u0162\78\2\2"+
		"\u015f\u0162\7\5\2\2\u0160\u0162\7\6\2\2\u0161\u015d\3\2\2\2\u0161\u015e"+
		"\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162K\3\2\2\2\34OVc"+
		"su\u0083\u008a\u0097\u00a3\u00aa\u00c1\u00c9\u00d3\u00d7\u00e3\u00f6\u0117"+
		"\u0121\u0126\u0135\u013e\u0144\u0150\u0154\u015b\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}