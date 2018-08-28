// Generated from Ilp.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IlpLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T_BOOL", "T_ELSE", "T_FALSE", "T_FOR", "T_IF", "T_INT", "T_READ", "T_RETURN", 
		"T_TSKIP", "T_STOP", "T_STRING", "T_TRUE", "T_VAR", "T_WHILE", "T_WRITE", 
		"T_LEFT_PAREN", "T_RIGHT_PAREN", "T_LEFT_SQUARE", "T_RIGHT_SQUARE", "T_LEFT_CURLY_BRACE", 
		"T_RIGHT_CURLY_BRACE", "T_COMMA", "T_SEMICOLON", "T_PLUS", "T_MINUS", 
		"T_ASTERISK", "T_SLASH", "T_PERCENT", "T_EQUAL", "T_DIFFERENT", "T_GREATER", 
		"T_GREATER_OR_EQUAL", "T_LOWER", "T_ID", "T_WS"
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


	public IlpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ilp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00d7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2S\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3"+
		"\"\3#\7#\u00c5\n#\f#\16#\u00c8\13#\3#\3#\7#\u00cc\n#\f#\16#\u00cf\13#"+
		"\3$\6$\u00d2\n$\r$\16$\u00d3\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\6\3\2aa\3\2"+
		"c|\6\2\62;C\\aac|\4\2\13\13\"\"\u00da\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3R\3\2\2\2\5T\3\2\2\2\7Y\3\2\2"+
		"\2\t_\3\2\2\2\13c\3\2\2\2\rf\3\2\2\2\17j\3\2\2\2\21o\3\2\2\2\23v\3\2\2"+
		"\2\25{\3\2\2\2\27\u0080\3\2\2\2\31\u0087\3\2\2\2\33\u008c\3\2\2\2\35\u0090"+
		"\3\2\2\2\37\u0096\3\2\2\2!\u009c\3\2\2\2#\u009e\3\2\2\2%\u00a0\3\2\2\2"+
		"\'\u00a2\3\2\2\2)\u00a4\3\2\2\2+\u00a6\3\2\2\2-\u00a8\3\2\2\2/\u00aa\3"+
		"\2\2\2\61\u00ac\3\2\2\2\63\u00ae\3\2\2\2\65\u00b0\3\2\2\2\67\u00b2\3\2"+
		"\2\29\u00b4\3\2\2\2;\u00b6\3\2\2\2=\u00b9\3\2\2\2?\u00bc\3\2\2\2A\u00be"+
		"\3\2\2\2C\u00c1\3\2\2\2E\u00c6\3\2\2\2G\u00d1\3\2\2\2IJ\7v\2\2JK\7t\2"+
		"\2KL\7w\2\2LS\7g\2\2MN\7h\2\2NO\7c\2\2OP\7n\2\2PQ\7u\2\2QS\7g\2\2RI\3"+
		"\2\2\2RM\3\2\2\2S\4\3\2\2\2TU\7g\2\2UV\7n\2\2VW\7u\2\2WX\7g\2\2X\6\3\2"+
		"\2\2YZ\7h\2\2Z[\7c\2\2[\\\7n\2\2\\]\7u\2\2]^\7g\2\2^\b\3\2\2\2_`\7h\2"+
		"\2`a\7q\2\2ab\7t\2\2b\n\3\2\2\2cd\7k\2\2de\7h\2\2e\f\3\2\2\2fg\7k\2\2"+
		"gh\7p\2\2hi\7v\2\2i\16\3\2\2\2jk\7t\2\2kl\7g\2\2lm\7c\2\2mn\7f\2\2n\20"+
		"\3\2\2\2op\7t\2\2pq\7g\2\2qr\7v\2\2rs\7w\2\2st\7t\2\2tu\7p\2\2u\22\3\2"+
		"\2\2vw\7u\2\2wx\7m\2\2xy\7k\2\2yz\7r\2\2z\24\3\2\2\2{|\7u\2\2|}\7v\2\2"+
		"}~\7q\2\2~\177\7r\2\2\177\26\3\2\2\2\u0080\u0081\7u\2\2\u0081\u0082\7"+
		"v\2\2\u0082\u0083\7t\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085\u0086"+
		"\7i\2\2\u0086\30\3\2\2\2\u0087\u0088\7v\2\2\u0088\u0089\7t\2\2\u0089\u008a"+
		"\7w\2\2\u008a\u008b\7g\2\2\u008b\32\3\2\2\2\u008c\u008d\7x\2\2\u008d\u008e"+
		"\7c\2\2\u008e\u008f\7t\2\2\u008f\34\3\2\2\2\u0090\u0091\7y\2\2\u0091\u0092"+
		"\7j\2\2\u0092\u0093\7k\2\2\u0093\u0094\7n\2\2\u0094\u0095\7g\2\2\u0095"+
		"\36\3\2\2\2\u0096\u0097\7y\2\2\u0097\u0098\7t\2\2\u0098\u0099\7k\2\2\u0099"+
		"\u009a\7v\2\2\u009a\u009b\7g\2\2\u009b \3\2\2\2\u009c\u009d\7*\2\2\u009d"+
		"\"\3\2\2\2\u009e\u009f\7+\2\2\u009f$\3\2\2\2\u00a0\u00a1\7]\2\2\u00a1"+
		"&\3\2\2\2\u00a2\u00a3\7_\2\2\u00a3(\3\2\2\2\u00a4\u00a5\7}\2\2\u00a5*"+
		"\3\2\2\2\u00a6\u00a7\7\177\2\2\u00a7,\3\2\2\2\u00a8\u00a9\7.\2\2\u00a9"+
		".\3\2\2\2\u00aa\u00ab\7=\2\2\u00ab\60\3\2\2\2\u00ac\u00ad\7-\2\2\u00ad"+
		"\62\3\2\2\2\u00ae\u00af\7/\2\2\u00af\64\3\2\2\2\u00b0\u00b1\7,\2\2\u00b1"+
		"\66\3\2\2\2\u00b2\u00b3\7\61\2\2\u00b38\3\2\2\2\u00b4\u00b5\7\'\2\2\u00b5"+
		":\3\2\2\2\u00b6\u00b7\7?\2\2\u00b7\u00b8\7?\2\2\u00b8<\3\2\2\2\u00b9\u00ba"+
		"\7#\2\2\u00ba\u00bb\7?\2\2\u00bb>\3\2\2\2\u00bc\u00bd\7@\2\2\u00bd@\3"+
		"\2\2\2\u00be\u00bf\7@\2\2\u00bf\u00c0\7?\2\2\u00c0B\3\2\2\2\u00c1\u00c2"+
		"\7>\2\2\u00c2D\3\2\2\2\u00c3\u00c5\t\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00cd\t\3\2\2\u00ca\u00cc\t\4\2\2\u00cb\u00ca\3\2"+
		"\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"F\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\t\5\2\2\u00d1\u00d0\3\2\2\2"+
		"\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d6\b$\2\2\u00d6H\3\2\2\2\7\2R\u00c6\u00cd\u00d3\3\b"+
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