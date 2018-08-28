// Generated from Ilp.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IlpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_BOOL=1, T_ELSE=2, T_FALSE=3, T_FOR=4, T_IF=5, T_INT=6, T_READ=7, T_RETURN=8, 
		T_TSKIP=9, T_STOP=10, T_STRING=11, T_TRUE=12, T_VAR=13, T_WHILE=14, T_WRITE=15, 
		T_LEFT_PAREN=16, T_RIGHT_PAREN=17, T_LEFT_SQUARE=18, T_RIGHT_SQUARE=19, 
		T_LEFT_CURLY_BRACE=20, T_RIGHT_CURLY_BRACE=21, T_COMMA=22, T_SEMICOLON=23, 
		T_PLUS=24, T_MINUS=25, T_ASTERISK=26, T_SLASH=27, T_PERCENT=28, T_EQUAL=29, 
		T_DIFFERENT=30, T_GREATER=31, T_GREATER_OR_EQUAL=32, T_LOWER=33, T_ID=34, 
		T_WS=35;
	public static final int
		RULE_writeExpression = 0;
	public static final String[] ruleNames = {
		"writeExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'else'", "'false'", "'for'", "'if'", "'int'", "'read'", "'return'", 
		"'skip'", "'stop'", "'string'", "'true'", "'var'", "'while'", "'write'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "','", "';'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'=='", "'!='", "'>'", "'>='", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "T_BOOL", "T_ELSE", "T_FALSE", "T_FOR", "T_IF", "T_INT", "T_READ", 
		"T_RETURN", "T_TSKIP", "T_STOP", "T_STRING", "T_TRUE", "T_VAR", "T_WHILE", 
		"T_WRITE", "T_LEFT_PAREN", "T_RIGHT_PAREN", "T_LEFT_SQUARE", "T_RIGHT_SQUARE", 
		"T_LEFT_CURLY_BRACE", "T_RIGHT_CURLY_BRACE", "T_COMMA", "T_SEMICOLON", 
		"T_PLUS", "T_MINUS", "T_ASTERISK", "T_SLASH", "T_PERCENT", "T_EQUAL", 
		"T_DIFFERENT", "T_GREATER", "T_GREATER_OR_EQUAL", "T_LOWER", "T_ID", "T_WS"
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
	public String getGrammarFileName() { return "Ilp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IlpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class WriteExpressionContext extends ParserRuleContext {
		public TerminalNode T_WRITE() { return getToken(IlpParser.T_WRITE, 0); }
		public TerminalNode T_ID() { return getToken(IlpParser.T_ID, 0); }
		public WriteExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpListener ) ((IlpListener)listener).enterWriteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpListener ) ((IlpListener)listener).exitWriteExpression(this);
		}
	}

	public final WriteExpressionContext writeExpression() throws RecognitionException {
		WriteExpressionContext _localctx = new WriteExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_writeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(T_WRITE);
			setState(3);
			match(T_ID);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\b\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\2\2\3\2\2\2\6\2\4\3\2\2\2\4\5\7\21\2\2\5\6\7$\2\2\6\3\3\2\2"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}