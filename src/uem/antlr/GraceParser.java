// Generated from GraceParser.g4 by ANTLR 4.5.3
package uem.antlr;

    import org.antlr.symtab.*;

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
		RULE_graceFile = 0, RULE_statement = 1, RULE_expression = 2, RULE_declVar = 3, 
		RULE_listSpecVars = 4, RULE_specVar = 5, RULE_specVarSimple = 6, RULE_specVarSimpleIni = 7, 
		RULE_specVarArr = 8, RULE_specVarArrIni = 9, RULE_decSub = 10, RULE_decProc = 11, 
		RULE_decFunc = 12, RULE_lstParam = 13, RULE_specParam = 14, RULE_param = 15, 
		RULE_command = 16, RULE_cmdSimple = 17, RULE_cmdAtrib = 18, RULE_arrAtrib = 19, 
		RULE_atrib = 20, RULE_cmdIf = 21, RULE_cmdWhile = 22, RULE_cmdFor = 23, 
		RULE_forInit = 24, RULE_forItera = 25, RULE_cmdStop = 26, RULE_cmdSkip = 27, 
		RULE_cmdReturn = 28, RULE_cmdCallProc = 29, RULE_cmdRead = 30, RULE_cmdWrite = 31, 
		RULE_block = 32, RULE_variable = 33, RULE_lstOP = 34, RULE_lstType = 35, 
		RULE_stringLit = 36, RULE_literal = 37;
	public static final String[] ruleNames = {
		"graceFile", "statement", "expression", "declVar", "listSpecVars", "specVar", 
		"specVarSimple", "specVarSimpleIni", "specVarArr", "specVarArrIni", "decSub", 
		"decProc", "decFunc", "lstParam", "specParam", "param", "command", "cmdSimple", 
		"cmdAtrib", "arrAtrib", "atrib", "cmdIf", "cmdWhile", "cmdFor", "forInit", 
		"forItera", "cmdStop", "cmdSkip", "cmdReturn", "cmdCallProc", "cmdRead", 
		"cmdWrite", "block", "variable", "lstOP", "lstType", "stringLit", "literal"
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
		public Scope scope;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public GraceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterGraceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitGraceFile(this);
		}
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
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				statement();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_DEF) | (1L << T_FOR) | (1L << T_IF) | (1L << T_READ) | (1L << T_RETURN) | (1L << T_SKIP) | (1L << T_STOP) | (1L << T_VAR) | (1L << T_WHILE) | (1L << T_WRITE) | (1L << T_LEFT_CURLY_BRACE) | (1L << ID))) != 0) );
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
	public static class DecSubStatementContext extends StatementContext {
		public DecSubContext decSub() {
			return getRuleContext(DecSubContext.class,0);
		}
		public DecSubStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterDecSubStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitDecSubStatement(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterDeclVarStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitDeclVarStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitDeclVarStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmdContext extends StatementContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CmdContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
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
			case T_DEF:
				_localctx = new DecSubStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				decSub();
				}
				break;
			case T_FOR:
			case T_IF:
			case T_READ:
			case T_RETURN:
			case T_SKIP:
			case T_STOP:
			case T_WHILE:
			case T_WRITE:
			case T_LEFT_CURLY_BRACE:
			case ID:
				_localctx = new CmdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				command();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterIncrementOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitIncrementOperation(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrReferenceContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterArrReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitArrReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitArrReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DifferenceExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DifferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterDifferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitDifferenceExpression(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterTernaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitTernaryOperation(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterLiteralReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitLiteralReference(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCompareOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCompareOperation(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitParenExpression(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterBinaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitBinaryOperation(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterVarReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitVarReference(this);
		}
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(87);
				match(T_MINUS);
				setState(88);
				expression(6);
				}
				break;
			case 2:
				{
				_localctx = new DifferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(NEG_UN);
				setState(90);
				expression(5);
				}
				break;
			case 3:
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
			case 4:
				{
				_localctx = new ArrReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(ID);
				setState(96);
				match(T_LEFT_SQUARE);
				setState(97);
				expression(0);
				setState(98);
				match(T_RIGHT_SQUARE);
				}
				break;
			case 5:
				{
				_localctx = new VarReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new LiteralReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new TernaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(105);
						((TernaryOperationContext)_localctx).operator = match(T_TERN);
						setState(106);
						((TernaryOperationContext)_localctx).right = expression(0);
						setState(107);
						((TernaryOperationContext)_localctx).operator = match(T_COLON);
						setState(108);
						((TernaryOperationContext)_localctx).right = expression(11);
						}
						break;
					case 2:
						{
						_localctx = new CompareOperationContext(new ExpressionContext(_parentctx, _parentState));
						((CompareOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(111);
						((CompareOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_COMP) | (1L << T_DIFFERENT) | (1L << T_GREATER) | (1L << T_GREATER_OR_EQUAL) | (1L << T_LOWER) | (1L << T_LOWER_OR_EQUAL) | (1L << OR) | (1L << AND))) != 0)) ) {
							((CompareOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(112);
						((CompareOperationContext)_localctx).right = expression(10);
						}
						break;
					case 3:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(114);
						((BinaryOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_PLUS) | (1L << T_MINUS) | (1L << T_ASTERISK) | (1L << T_SLASH) | (1L << T_PERCENT))) != 0)) ) {
							((BinaryOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(115);
						((BinaryOperationContext)_localctx).right = expression(9);
						}
						break;
					case 4:
						{
						_localctx = new IncrementOperationContext(new ExpressionContext(_parentctx, _parentState));
						((IncrementOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(117);
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
				setState(122);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterDeclVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitDeclVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitDeclVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclVarContext declVar() throws RecognitionException {
		DeclVarContext _localctx = new DeclVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T_VAR);
			setState(124);
			listSpecVars();
			setState(125);
			match(T_COLON);
			setState(126);
			lstType();
			setState(127);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterListSpecVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitListSpecVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitListSpecVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListSpecVarsContext listSpecVars() throws RecognitionException {
		ListSpecVarsContext _localctx = new ListSpecVarsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listSpecVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			specVar();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(130);
				match(T_COMMA);
				setState(131);
				specVar();
				}
				}
				setState(136);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterDirectSpecVarArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitDirectSpecVarArr(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterDirectSpecVarSimpleIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitDirectSpecVarSimpleIni(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterDirectSpecVarArrIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitDirectSpecVarArrIni(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterDirectSpecVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitDirectSpecVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitDirectSpecVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecVarContext specVar() throws RecognitionException {
		SpecVarContext _localctx = new SpecVarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_specVar);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new DirectSpecVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				specVarSimple();
				}
				break;
			case 2:
				_localctx = new DirectSpecVarSimpleIniContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				specVarSimpleIni();
				}
				break;
			case 3:
				_localctx = new DirectSpecVarArrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				specVarArr();
				}
				break;
			case 4:
				_localctx = new DirectSpecVarArrIniContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterSpecVarSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitSpecVarSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitSpecVarSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecVarSimpleContext specVarSimple() throws RecognitionException {
		SpecVarSimpleContext _localctx = new SpecVarSimpleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_specVarSimple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterSpecVarSimpleIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitSpecVarSimpleIni(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitSpecVarSimpleIni(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecVarSimpleIniContext specVarSimpleIni() throws RecognitionException {
		SpecVarSimpleIniContext _localctx = new SpecVarSimpleIniContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_specVarSimpleIni);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ID);
			setState(146);
			match(T_EQUAL);
			setState(147);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterSpecVarArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitSpecVarArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitSpecVarArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecVarArrContext specVarArr() throws RecognitionException {
		SpecVarArrContext _localctx = new SpecVarArrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_specVarArr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			specVarSimple();
			setState(150);
			match(T_LEFT_SQUARE);
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				match(NUMBERLITERAL);
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBERLITERAL );
			setState(156);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterSpecVarArrIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitSpecVarArrIni(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitSpecVarArrIni(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecVarArrIniContext specVarArrIni() throws RecognitionException {
		SpecVarArrIniContext _localctx = new SpecVarArrIniContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_specVarArrIni);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			specVarArr();
			setState(159);
			match(T_EQUAL);
			setState(160);
			match(T_LEFT_CURLY_BRACE);
			setState(161);
			literal();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(162);
				match(T_COMMA);
				setState(163);
				literal();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
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
		public DecSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decSub; }
	 
		public DecSubContext() { }
		public void copyFrom(DecSubContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionContext extends DecSubContext {
		public DecFuncContext decFunc() {
			return getRuleContext(DecFuncContext.class,0);
		}
		public FunctionContext(DecSubContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProcedureContext extends DecSubContext {
		public DecProcContext decProc() {
			return getRuleContext(DecProcContext.class,0);
		}
		public ProcedureContext(DecSubContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecSubContext decSub() throws RecognitionException {
		DecSubContext _localctx = new DecSubContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_decSub);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ProcedureContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				decProc();
				}
				break;
			case 2:
				_localctx = new FunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
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
		public Scope scope;
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LstParamContext lstParam() {
			return getRuleContext(LstParamContext.class,0);
		}
		public DecProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decProc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterDecProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitDecProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitDecProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecProcContext decProc() throws RecognitionException {
		DecProcContext _localctx = new DecProcContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_decProc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T_DEF);
			setState(176);
			match(ID);
			setState(177);
			match(T_LEFT_PAREN);
			setState(179);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(178);
				lstParam();
				}
			}

			setState(181);
			match(T_RIGHT_PAREN);
			setState(182);
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
		public Scope scope;
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public LstTypeContext lstType() {
			return getRuleContext(LstTypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LstParamContext lstParam() {
			return getRuleContext(LstParamContext.class,0);
		}
		public DecFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterDecFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitDecFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitDecFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecFuncContext decFunc() throws RecognitionException {
		DecFuncContext _localctx = new DecFuncContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T_DEF);
			setState(185);
			match(ID);
			setState(186);
			match(T_LEFT_PAREN);
			setState(188);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(187);
				lstParam();
				}
			}

			setState(190);
			match(T_RIGHT_PAREN);
			setState(191);
			match(T_COLON);
			setState(192);
			lstType();
			setState(193);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterLstParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitLstParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitLstParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LstParamContext lstParam() throws RecognitionException {
		LstParamContext _localctx = new LstParamContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lstParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			specParam();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_SEMICOLON) {
				{
				{
				setState(196);
				match(T_SEMICOLON);
				setState(197);
				specParam();
				}
				}
				setState(202);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterSpecParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitSpecParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitSpecParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecParamContext specParam() throws RecognitionException {
		SpecParamContext _localctx = new SpecParamContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_specParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			param();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_SEMICOLON) {
				{
				{
				setState(204);
				match(T_SEMICOLON);
				setState(205);
				param();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(T_COLON);
			setState(212);
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
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	 
		public ParamContext() { }
		public void copyFrom(ParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdParamContext extends ParamContext {
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public IdParamContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterIdParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitIdParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitIdParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrParamContext extends ParamContext {
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public ArrParamContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterArrParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitArrParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitArrParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_param);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new IdParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ArrParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(ID);
				setState(216);
				match(T_LEFT_SQUARE);
				setState(217);
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
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CmblockContext extends CommandContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CmblockContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmblock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmsimpleContext extends CommandContext {
		public CmdSimpleContext cmdSimple() {
			return getRuleContext(CmdSimpleContext.class,0);
		}
		public CmsimpleContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmsimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmsimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmsimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_command);
		try {
			setState(222);
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
				_localctx = new CmsimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				cmdSimple();
				}
				break;
			case T_LEFT_CURLY_BRACE:
				_localctx = new CmblockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
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
		public CmdSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSimple; }
	 
		public CmdSimpleContext() { }
		public void copyFrom(CmdSimpleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CmWhileContext extends CmdSimpleContext {
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmWhileContext(CmdSimpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmReturnContext extends CmdSimpleContext {
		public CmdReturnContext cmdReturn() {
			return getRuleContext(CmdReturnContext.class,0);
		}
		public CmReturnContext(CmdSimpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmProcContext extends CmdSimpleContext {
		public CmdCallProcContext cmdCallProc() {
			return getRuleContext(CmdCallProcContext.class,0);
		}
		public CmProcContext(CmdSimpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmProc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmReadContext extends CmdSimpleContext {
		public CmdReadContext cmdRead() {
			return getRuleContext(CmdReadContext.class,0);
		}
		public CmReadContext(CmdSimpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmIfContext extends CmdSimpleContext {
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmIfContext(CmdSimpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmForContext extends CmdSimpleContext {
		public CmdForContext cmdFor() {
			return getRuleContext(CmdForContext.class,0);
		}
		public CmForContext(CmdSimpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmStopContext extends CmdSimpleContext {
		public CmdStopContext cmdStop() {
			return getRuleContext(CmdStopContext.class,0);
		}
		public CmStopContext(CmdSimpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmStop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmStop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmStop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmAtribContext extends CmdSimpleContext {
		public CmdAtribContext cmdAtrib() {
			return getRuleContext(CmdAtribContext.class,0);
		}
		public CmAtribContext(CmdSimpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmAtrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmAtrib(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmWriteContext extends CmdSimpleContext {
		public CmdWriteContext cmdWrite() {
			return getRuleContext(CmdWriteContext.class,0);
		}
		public CmWriteContext(CmdSimpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmWrite(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmSkipContext extends CmdSimpleContext {
		public CmdSkipContext cmdSkip() {
			return getRuleContext(CmdSkipContext.class,0);
		}
		public CmSkipContext(CmdSimpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitCmSkip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdSimpleContext cmdSimple() throws RecognitionException {
		CmdSimpleContext _localctx = new CmdSimpleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmdSimple);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new CmAtribContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				cmdAtrib();
				}
				break;
			case 2:
				_localctx = new CmIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				cmdIf();
				}
				break;
			case 3:
				_localctx = new CmWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				cmdWhile();
				}
				break;
			case 4:
				_localctx = new CmForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				cmdFor();
				}
				break;
			case 5:
				_localctx = new CmStopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				cmdStop();
				}
				break;
			case 6:
				_localctx = new CmSkipContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(229);
				cmdSkip();
				}
				break;
			case 7:
				_localctx = new CmReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(230);
				cmdReturn();
				}
				break;
			case 8:
				_localctx = new CmProcContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(231);
				cmdCallProc();
				}
				break;
			case 9:
				_localctx = new CmReadContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(232);
				cmdRead();
				}
				break;
			case 10:
				_localctx = new CmWriteContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(233);
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
		public CmdAtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtrib; }
	 
		public CmdAtribContext() { }
		public void copyFrom(CmdAtribContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtribArrContext extends CmdAtribContext {
		public ArrAtribContext arrAtrib() {
			return getRuleContext(ArrAtribContext.class,0);
		}
		public AtribArrContext(CmdAtribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterAtribArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitAtribArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitAtribArr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtribVarContext extends CmdAtribContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public AtribVarContext(CmdAtribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterAtribVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitAtribVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitAtribVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdAtribContext cmdAtrib() throws RecognitionException {
		CmdAtribContext _localctx = new CmdAtribContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdAtrib);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new AtribVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				atrib();
				setState(237);
				match(T_SEMICOLON);
				}
				break;
			case 2:
				_localctx = new AtribArrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				arrAtrib();
				setState(240);
				match(T_SEMICOLON);
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

	public static class ArrAtribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrAtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrAtrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterArrAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitArrAtrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitArrAtrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrAtribContext arrAtrib() throws RecognitionException {
		ArrAtribContext _localctx = new ArrAtribContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrAtrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(ID);
			setState(245);
			match(T_LEFT_SQUARE);
			setState(246);
			expression(0);
			setState(247);
			match(T_RIGHT_SQUARE);
			setState(248);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_EQUAL) | (1L << T_INCREMENT) | (1L << T_DECREMENT) | (1L << T_INC_MULT) | (1L << T_INC_DIV) | (1L << T_INC_MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(249);
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

	public static class AtribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitAtrib(this);
		}
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
			setState(251);
			match(ID);
			setState(252);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_EQUAL) | (1L << T_INCREMENT) | (1L << T_DECREMENT) | (1L << T_INC_MULT) | (1L << T_INC_DIV) | (1L << T_INC_MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(253);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdIf(this);
		}
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
			setState(255);
			match(T_IF);
			setState(256);
			match(T_LEFT_PAREN);
			setState(257);
			expression(0);
			setState(258);
			match(T_RIGHT_PAREN);
			setState(259);
			command();
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(260);
					match(T_ELSE);
					setState(261);
					command();
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdWhile(this);
		}
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
			setState(267);
			match(T_WHILE);
			setState(268);
			match(T_LEFT_PAREN);
			setState(269);
			expression(0);
			setState(270);
			match(T_RIGHT_PAREN);
			setState(271);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdFor(this);
		}
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
			setState(273);
			match(T_FOR);
			setState(274);
			match(T_LEFT_PAREN);
			setState(275);
			forInit();
			setState(276);
			match(T_SEMICOLON);
			setState(277);
			expression(0);
			setState(278);
			match(T_SEMICOLON);
			setState(279);
			forItera();
			setState(280);
			match(T_RIGHT_PAREN);
			setState(281);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitForInit(this);
		}
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
			setState(283);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterForItera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitForItera(this);
		}
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
			setState(285);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdStop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdStop(this);
		}
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
			setState(287);
			match(T_STOP);
			setState(288);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdSkip(this);
		}
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
			setState(290);
			match(T_SKIP);
			setState(291);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdReturn(this);
		}
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
			setState(293);
			match(T_RETURN);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_FALSE) | (1L << T_TRUE) | (1L << T_LEFT_PAREN) | (1L << T_MINUS) | (1L << NEG_UN) | (1L << ID) | (1L << NUMBERLITERAL) | (1L << STRINGLITERAL))) != 0)) {
				{
				{
				setState(294);
				expression(0);
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdCallProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdCallProc(this);
		}
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
			setState(302);
			match(ID);
			setState(303);
			match(T_LEFT_PAREN);
			{
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_FALSE) | (1L << T_TRUE) | (1L << T_LEFT_PAREN) | (1L << T_MINUS) | (1L << NEG_UN) | (1L << ID) | (1L << NUMBERLITERAL) | (1L << STRINGLITERAL))) != 0)) {
				{
				{
				setState(304);
				expression(0);
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(310);
				match(T_COMMA);
				setState(311);
				expression(0);
				}
			}

			}
			setState(314);
			match(T_RIGHT_PAREN);
			setState(315);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdRead(this);
		}
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
			setState(317);
			match(T_READ);
			setState(318);
			variable();
			setState(319);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdWrite(this);
		}
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
			setState(321);
			match(T_WRITE);
			setState(322);
			expression(0);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(323);
				match(T_COMMA);
				setState(324);
				expression(0);
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330);
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
		public Scope scope;
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitBlock(this);
		}
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
			setState(332);
			match(T_LEFT_CURLY_BRACE);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_VAR) {
				{
				{
				setState(333);
				declVar();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_FOR) | (1L << T_IF) | (1L << T_READ) | (1L << T_RETURN) | (1L << T_SKIP) | (1L << T_STOP) | (1L << T_WHILE) | (1L << T_WRITE) | (1L << T_LEFT_CURLY_BRACE) | (1L << ID))) != 0)) {
				{
				{
				setState(339);
				command();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitVariable(this);
		}
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
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(ID);
				setState(349);
				match(T_LEFT_SQUARE);
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(350);
					expression(0);
					}
					}
					setState(353); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_FALSE) | (1L << T_TRUE) | (1L << T_LEFT_PAREN) | (1L << T_MINUS) | (1L << NEG_UN) | (1L << ID) | (1L << NUMBERLITERAL) | (1L << STRINGLITERAL))) != 0) );
				setState(355);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterLstOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitLstOP(this);
		}
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
			setState(359);
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
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public StringContext(LstTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitString(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitBool(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitInteger(this);
		}
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
			setState(364);
			switch (_input.LA(1)) {
			case T_INT:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(T_INT);
				}
				break;
			case T_STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				stringLit();
				}
				break;
			case T_BOOL:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
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

	public static class StringLitContext extends ParserRuleContext {
		public StringLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLit; }
	 
		public StringLitContext() { }
		public void copyFrom(StringLitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitLitContext extends StringLitContext {
		public InitLitContext(StringLitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterInitLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitInitLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitInitLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitArrAlocContext extends StringLitContext {
		public List<TerminalNode> NUMBERLITERAL() { return getTokens(GraceParser.NUMBERLITERAL); }
		public TerminalNode NUMBERLITERAL(int i) {
			return getToken(GraceParser.NUMBERLITERAL, i);
		}
		public InitArrAlocContext(StringLitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterInitArrAloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitInitArrAloc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitInitArrAloc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLitContext stringLit() throws RecognitionException {
		StringLitContext _localctx = new StringLitContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_stringLit);
		int _la;
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new InitLitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(T_STRING);
				}
				break;
			case 2:
				_localctx = new InitArrAlocContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(T_STRING);
				setState(368);
				match(T_LEFT_SQUARE);
				setState(370); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(369);
					match(NUMBERLITERAL);
					}
					}
					setState(372); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBERLITERAL );
				setState(374);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterFalseLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitFalseLiteral(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitStringLiteral(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitIntLiteral(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterTrueLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitTrueLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceParserVisitor ) return ((GraceParserVisitor<? extends T>)visitor).visitTrueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_literal);
		try {
			setState(381);
			switch (_input.LA(1)) {
			case NUMBERLITERAL:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(NUMBERLITERAL);
				}
				break;
			case STRINGLITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(STRINGLITERAL);
				}
				break;
			case T_FALSE:
				_localctx = new TrueLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				match(T_FALSE);
				}
				break;
			case T_TRUE:
				_localctx = new FalseLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(380);
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
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u0182\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\6\2P\n\2\r\2\16\2Q\3\3"+
		"\3\3\3\3\5\3W\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4i\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4y\n\4\f\4\16\4|\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7"+
		"\6\u0087\n\6\f\6\16\6\u008a\13\6\3\7\3\7\3\7\3\7\5\7\u0090\n\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\6\n\u009b\n\n\r\n\16\n\u009c\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u00a7\n\13\f\13\16\13\u00aa\13\13\3\13"+
		"\3\13\3\f\3\f\5\f\u00b0\n\f\3\r\3\r\3\r\3\r\5\r\u00b6\n\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\5\16\u00bf\n\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\7\17\u00c9\n\17\f\17\16\17\u00cc\13\17\3\20\3\20\3\20\7\20\u00d1"+
		"\n\20\f\20\16\20\u00d4\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00dd"+
		"\n\21\3\22\3\22\5\22\u00e1\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00ed\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f5\n"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\7\27\u0109\n\27\f\27\16\27\u010c\13\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\7\36\u012a"+
		"\n\36\f\36\16\36\u012d\13\36\3\36\3\36\3\37\3\37\3\37\7\37\u0134\n\37"+
		"\f\37\16\37\u0137\13\37\3\37\3\37\5\37\u013b\n\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3!\3!\3!\3!\7!\u0148\n!\f!\16!\u014b\13!\3!\3!\3\"\3\"\7\"\u0151"+
		"\n\"\f\"\16\"\u0154\13\"\3\"\7\"\u0157\n\"\f\"\16\"\u015a\13\"\3\"\3\""+
		"\3#\3#\3#\3#\6#\u0162\n#\r#\16#\u0163\3#\3#\5#\u0168\n#\3$\3$\3%\3%\3"+
		"%\5%\u016f\n%\3&\3&\3&\3&\6&\u0175\n&\r&\16&\u0176\3&\5&\u017a\n&\3\'"+
		"\3\'\3\'\3\'\5\'\u0180\n\'\3\'\2\3\6(\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\7\6\2!!#%+,\60\61\3\2\34 \4\2"+
		"\34\35\62\63\4\2\"\"&*\4\2\34 \"\"\u018e\2O\3\2\2\2\4V\3\2\2\2\6h\3\2"+
		"\2\2\b}\3\2\2\2\n\u0083\3\2\2\2\f\u008f\3\2\2\2\16\u0091\3\2\2\2\20\u0093"+
		"\3\2\2\2\22\u0097\3\2\2\2\24\u00a0\3\2\2\2\26\u00af\3\2\2\2\30\u00b1\3"+
		"\2\2\2\32\u00ba\3\2\2\2\34\u00c5\3\2\2\2\36\u00cd\3\2\2\2 \u00dc\3\2\2"+
		"\2\"\u00e0\3\2\2\2$\u00ec\3\2\2\2&\u00f4\3\2\2\2(\u00f6\3\2\2\2*\u00fd"+
		"\3\2\2\2,\u0101\3\2\2\2.\u010d\3\2\2\2\60\u0113\3\2\2\2\62\u011d\3\2\2"+
		"\2\64\u011f\3\2\2\2\66\u0121\3\2\2\28\u0124\3\2\2\2:\u0127\3\2\2\2<\u0130"+
		"\3\2\2\2>\u013f\3\2\2\2@\u0143\3\2\2\2B\u014e\3\2\2\2D\u0167\3\2\2\2F"+
		"\u0169\3\2\2\2H\u016e\3\2\2\2J\u0179\3\2\2\2L\u017f\3\2\2\2NP\5\4\3\2"+
		"ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\3\3\2\2\2SW\5\b\5\2TW\5\26\f"+
		"\2UW\5\"\22\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\5\3\2\2\2XY\b\4\1\2YZ\7\35"+
		"\2\2Zi\5\6\4\b[\\\7/\2\2\\i\5\6\4\7]^\7\23\2\2^_\5\6\4\2_`\7\24\2\2`i"+
		"\3\2\2\2ab\7\64\2\2bc\7\25\2\2cd\5\6\4\2de\7\26\2\2ei\3\2\2\2fi\7\64\2"+
		"\2gi\5L\'\2hX\3\2\2\2h[\3\2\2\2h]\3\2\2\2ha\3\2\2\2hf\3\2\2\2hg\3\2\2"+
		"\2iz\3\2\2\2jk\f\f\2\2kl\7.\2\2lm\5\6\4\2mn\7\33\2\2no\5\6\4\roy\3\2\2"+
		"\2pq\f\13\2\2qr\t\2\2\2ry\5\6\4\fst\f\n\2\2tu\t\3\2\2uy\5\6\4\13vw\f\t"+
		"\2\2wy\t\4\2\2xj\3\2\2\2xp\3\2\2\2xs\3\2\2\2xv\3\2\2\2y|\3\2\2\2zx\3\2"+
		"\2\2z{\3\2\2\2{\7\3\2\2\2|z\3\2\2\2}~\7\20\2\2~\177\5\n\6\2\177\u0080"+
		"\7\33\2\2\u0080\u0081\5H%\2\u0081\u0082\7\32\2\2\u0082\t\3\2\2\2\u0083"+
		"\u0088\5\f\7\2\u0084\u0085\7\31\2\2\u0085\u0087\5\f\7\2\u0086\u0084\3"+
		"\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\13\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u0090\5\16\b\2\u008c\u0090\5\20"+
		"\t\2\u008d\u0090\5\22\n\2\u008e\u0090\5\24\13\2\u008f\u008b\3\2\2\2\u008f"+
		"\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\r\3\2\2\2"+
		"\u0091\u0092\7\64\2\2\u0092\17\3\2\2\2\u0093\u0094\7\64\2\2\u0094\u0095"+
		"\7\"\2\2\u0095\u0096\5\6\4\2\u0096\21\3\2\2\2\u0097\u0098\5\16\b\2\u0098"+
		"\u009a\7\25\2\2\u0099\u009b\7\67\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\7\26\2\2\u009f\23\3\2\2\2\u00a0\u00a1\5\22\n\2\u00a1\u00a2\7\""+
		"\2\2\u00a2\u00a3\7\27\2\2\u00a3\u00a8\5L\'\2\u00a4\u00a5\7\31\2\2\u00a5"+
		"\u00a7\5L\'\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ac\7\30\2\2\u00ac\25\3\2\2\2\u00ad\u00b0\5\30\r\2\u00ae\u00b0\5\32"+
		"\16\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\27\3\2\2\2\u00b1\u00b2"+
		"\7\3\2\2\u00b2\u00b3\7\64\2\2\u00b3\u00b5\7\23\2\2\u00b4\u00b6\5\34\17"+
		"\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8"+
		"\7\24\2\2\u00b8\u00b9\5B\"\2\u00b9\31\3\2\2\2\u00ba\u00bb\7\3\2\2\u00bb"+
		"\u00bc\7\64\2\2\u00bc\u00be\7\23\2\2\u00bd\u00bf\5\34\17\2\u00be\u00bd"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\24\2\2"+
		"\u00c1\u00c2\7\33\2\2\u00c2\u00c3\5H%\2\u00c3\u00c4\5B\"\2\u00c4\33\3"+
		"\2\2\2\u00c5\u00ca\5\36\20\2\u00c6\u00c7\7\32\2\2\u00c7\u00c9\5\36\20"+
		"\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\35\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d2\5 \21\2\u00ce"+
		"\u00cf\7\32\2\2\u00cf\u00d1\5 \21\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3"+
		"\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d6\7\33\2\2\u00d6\u00d7\5H%\2\u00d7\37\3\2\2\2"+
		"\u00d8\u00dd\7\64\2\2\u00d9\u00da\7\64\2\2\u00da\u00db\7\25\2\2\u00db"+
		"\u00dd\7\26\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dd!\3\2\2\2"+
		"\u00de\u00e1\5$\23\2\u00df\u00e1\5B\"\2\u00e0\u00de\3\2\2\2\u00e0\u00df"+
		"\3\2\2\2\u00e1#\3\2\2\2\u00e2\u00ed\5&\24\2\u00e3\u00ed\5,\27\2\u00e4"+
		"\u00ed\5.\30\2\u00e5\u00ed\5\60\31\2\u00e6\u00ed\5\66\34\2\u00e7\u00ed"+
		"\58\35\2\u00e8\u00ed\5:\36\2\u00e9\u00ed\5<\37\2\u00ea\u00ed\5> \2\u00eb"+
		"\u00ed\5@!\2\u00ec\u00e2\3\2\2\2\u00ec\u00e3\3\2\2\2\u00ec\u00e4\3\2\2"+
		"\2\u00ec\u00e5\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ec\u00e8"+
		"\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"%\3\2\2\2\u00ee\u00ef\5*\26\2\u00ef\u00f0\7\32\2\2\u00f0\u00f5\3\2\2\2"+
		"\u00f1\u00f2\5(\25\2\u00f2\u00f3\7\32\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00ee"+
		"\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5\'\3\2\2\2\u00f6\u00f7\7\64\2\2\u00f7"+
		"\u00f8\7\25\2\2\u00f8\u00f9\5\6\4\2\u00f9\u00fa\7\26\2\2\u00fa\u00fb\t"+
		"\5\2\2\u00fb\u00fc\5\6\4\2\u00fc)\3\2\2\2\u00fd\u00fe\7\64\2\2\u00fe\u00ff"+
		"\t\5\2\2\u00ff\u0100\5\6\4\2\u0100+\3\2\2\2\u0101\u0102\7\t\2\2\u0102"+
		"\u0103\7\23\2\2\u0103\u0104\5\6\4\2\u0104\u0105\7\24\2\2\u0105\u010a\5"+
		"\"\22\2\u0106\u0107\7\4\2\2\u0107\u0109\5\"\22\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b-\3\2\2\2"+
		"\u010c\u010a\3\2\2\2\u010d\u010e\7\21\2\2\u010e\u010f\7\23\2\2\u010f\u0110"+
		"\5\6\4\2\u0110\u0111\7\24\2\2\u0111\u0112\5\"\22\2\u0112/\3\2\2\2\u0113"+
		"\u0114\7\b\2\2\u0114\u0115\7\23\2\2\u0115\u0116\5\62\32\2\u0116\u0117"+
		"\7\32\2\2\u0117\u0118\5\6\4\2\u0118\u0119\7\32\2\2\u0119\u011a\5\64\33"+
		"\2\u011a\u011b\7\24\2\2\u011b\u011c\5\"\22\2\u011c\61\3\2\2\2\u011d\u011e"+
		"\5*\26\2\u011e\63\3\2\2\2\u011f\u0120\5*\26\2\u0120\65\3\2\2\2\u0121\u0122"+
		"\7\16\2\2\u0122\u0123\7\32\2\2\u0123\67\3\2\2\2\u0124\u0125\7\r\2\2\u0125"+
		"\u0126\7\32\2\2\u01269\3\2\2\2\u0127\u012b\7\f\2\2\u0128\u012a\5\6\4\2"+
		"\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7\32\2\2"+
		"\u012f;\3\2\2\2\u0130\u0131\7\64\2\2\u0131\u0135\7\23\2\2\u0132\u0134"+
		"\5\6\4\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u013a\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7\31"+
		"\2\2\u0139\u013b\5\6\4\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013d\7\24\2\2\u013d\u013e\7\32\2\2\u013e=\3\2\2"+
		"\2\u013f\u0140\7\13\2\2\u0140\u0141\5D#\2\u0141\u0142\7\32\2\2\u0142?"+
		"\3\2\2\2\u0143\u0144\7\22\2\2\u0144\u0149\5\6\4\2\u0145\u0146\7\31\2\2"+
		"\u0146\u0148\5\6\4\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014d\7\32\2\2\u014dA\3\2\2\2\u014e\u0152\7\27\2\2\u014f\u0151\5\b\5"+
		"\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0158\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0157\5\"\22\2"+
		"\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7\30\2\2"+
		"\u015cC\3\2\2\2\u015d\u0168\7\64\2\2\u015e\u015f\7\64\2\2\u015f\u0161"+
		"\7\25\2\2\u0160\u0162\5\6\4\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2"+
		"\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166"+
		"\7\26\2\2\u0166\u0168\3\2\2\2\u0167\u015d\3\2\2\2\u0167\u015e\3\2\2\2"+
		"\u0168E\3\2\2\2\u0169\u016a\t\6\2\2\u016aG\3\2\2\2\u016b\u016f\7\n\2\2"+
		"\u016c\u016f\5J&\2\u016d\u016f\7\7\2\2\u016e\u016b\3\2\2\2\u016e\u016c"+
		"\3\2\2\2\u016e\u016d\3\2\2\2\u016fI\3\2\2\2\u0170\u017a\7\17\2\2\u0171"+
		"\u0172\7\17\2\2\u0172\u0174\7\25\2\2\u0173\u0175\7\67\2\2\u0174\u0173"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017a\7\26\2\2\u0179\u0170\3\2\2\2\u0179\u0171\3"+
		"\2\2\2\u017aK\3\2\2\2\u017b\u0180\7\67\2\2\u017c\u0180\78\2\2\u017d\u0180"+
		"\7\5\2\2\u017e\u0180\7\6\2\2\u017f\u017b\3\2\2\2\u017f\u017c\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180M\3\2\2\2!QVhxz\u0088\u008f\u009c"+
		"\u00a8\u00af\u00b5\u00be\u00ca\u00d2\u00dc\u00e0\u00ec\u00f4\u010a\u012b"+
		"\u0135\u013a\u0149\u0152\u0158\u0163\u0167\u016e\u0176\u0179\u017f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}