// Generated from IlpLex.g4 by ANTLR 4.5.3
package uem.antrl;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IlpLex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_ELSE=1, T_FALSE=2, T_TRUE=3, T_BOOL=4, T_FOR=5, T_IF=6, T_INT=7, T_READ=8, 
		T_RETURN=9, T_SKIP=10, T_STOP=11, T_STRING=12, T_VAR=13, T_WHILE=14, T_WRITE=15, 
		T_LEFT_PAREN=16, T_RIGHT_PAREN=17, T_LEFT_SQUARE=18, T_RIGHT_SQUARE=19, 
		T_LEFT_CURLY_BRACE=20, T_RIGHT_CURLY_BRACE=21, T_COMMA=22, T_SEMICOLON=23, 
		T_COLON=24, T_PLUS=25, T_MINUS=26, T_ASTERISK=27, T_SLASH=28, T_PERCENT=29, 
		T_COMP=30, T_EQUAL=31, T_DIFFERENT=32, T_GREATER=33, T_GREATER_OR_EQUAL=34, 
		T_INCREMENT=35, T_DECREMENT=36, T_INC_MULT=37, T_INC_DIV=38, T_INC_MOD=39, 
		T_LOWER=40, T_DOT=41, ID=42, COMMENT=43, WS=44, NUMBER_LITERAL=45, STRING_LITERAL=46;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T_ELSE", "T_FALSE", "T_TRUE", "T_BOOL", "T_FOR", "T_IF", "T_INT", "T_READ", 
		"T_RETURN", "T_SKIP", "T_STOP", "T_STRING", "T_VAR", "T_WHILE", "T_WRITE", 
		"T_LEFT_PAREN", "T_RIGHT_PAREN", "T_LEFT_SQUARE", "T_RIGHT_SQUARE", "T_LEFT_CURLY_BRACE", 
		"T_RIGHT_CURLY_BRACE", "T_COMMA", "T_SEMICOLON", "T_COLON", "T_PLUS", 
		"T_MINUS", "T_ASTERISK", "T_SLASH", "T_PERCENT", "T_COMP", "T_EQUAL", 
		"T_DIFFERENT", "T_GREATER", "T_GREATER_OR_EQUAL", "T_INCREMENT", "T_DECREMENT", 
		"T_INC_MULT", "T_INC_DIV", "T_INC_MOD", "T_LOWER", "T_DOT", "ID", "COMMENT", 
		"WS", "NUMBER_LITERAL", "STRING_LITERAL", "EncodingPrefix", "SCharSequence", 
		"SChar", "EscapeSequence"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'else'", "'false'", "'true'", "'bool'", "'for'", "'if'", "'int'", 
		"'read'", "'return'", "'skip'", "'stop'", "'string'", "'var'", "'while'", 
		"'write'", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "';'", "':'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'='", "'!='", "'>'", "'>='", 
		"'+='", "'-='", "'*='", "'/='", "'%='", "'<'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "T_ELSE", "T_FALSE", "T_TRUE", "T_BOOL", "T_FOR", "T_IF", "T_INT", 
		"T_READ", "T_RETURN", "T_SKIP", "T_STOP", "T_STRING", "T_VAR", "T_WHILE", 
		"T_WRITE", "T_LEFT_PAREN", "T_RIGHT_PAREN", "T_LEFT_SQUARE", "T_RIGHT_SQUARE", 
		"T_LEFT_CURLY_BRACE", "T_RIGHT_CURLY_BRACE", "T_COMMA", "T_SEMICOLON", 
		"T_COLON", "T_PLUS", "T_MINUS", "T_ASTERISK", "T_SLASH", "T_PERCENT", 
		"T_COMP", "T_EQUAL", "T_DIFFERENT", "T_GREATER", "T_GREATER_OR_EQUAL", 
		"T_INCREMENT", "T_DECREMENT", "T_INC_MULT", "T_INC_DIV", "T_INC_MOD", 
		"T_LOWER", "T_DOT", "ID", "COMMENT", "WS", "NUMBER_LITERAL", "STRING_LITERAL"
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


	public IlpLex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IlpLex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\60\u0133\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!"+
		"\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3"+
		"(\3)\3)\3*\3*\3+\7+\u00f2\n+\f+\16+\u00f5\13+\3+\3+\7+\u00f9\n+\f+\16"+
		"+\u00fc\13+\3,\3,\3,\3,\7,\u0102\n,\f,\16,\u0105\13,\3,\3,\3-\6-\u010a"+
		"\n-\r-\16-\u010b\3-\3-\3.\6.\u0111\n.\r.\16.\u0112\3/\5/\u0116\n/\3/\3"+
		"/\5/\u011a\n/\3/\3/\3\60\3\60\3\60\5\60\u0121\n\60\3\61\6\61\u0124\n\61"+
		"\r\61\16\61\u0125\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u012f\n\62\3"+
		"\63\3\63\3\63\2\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2a\2c\2e\2"+
		"\3\2\13\3\2aa\3\2c|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\3"+
		"\2\62;\5\2NNWWww\6\2\f\f\17\17$$^^\f\2$$))AA^^cdhhppttvvxx\u013a\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3g\3\2\2\2\5l\3\2\2\2"+
		"\7r\3\2\2\2\tw\3\2\2\2\13|\3\2\2\2\r\u0080\3\2\2\2\17\u0083\3\2\2\2\21"+
		"\u0087\3\2\2\2\23\u008c\3\2\2\2\25\u0093\3\2\2\2\27\u0098\3\2\2\2\31\u009d"+
		"\3\2\2\2\33\u00a4\3\2\2\2\35\u00a8\3\2\2\2\37\u00ae\3\2\2\2!\u00b4\3\2"+
		"\2\2#\u00b6\3\2\2\2%\u00b8\3\2\2\2\'\u00ba\3\2\2\2)\u00bc\3\2\2\2+\u00be"+
		"\3\2\2\2-\u00c0\3\2\2\2/\u00c2\3\2\2\2\61\u00c4\3\2\2\2\63\u00c6\3\2\2"+
		"\2\65\u00c8\3\2\2\2\67\u00ca\3\2\2\29\u00cc\3\2\2\2;\u00ce\3\2\2\2=\u00d0"+
		"\3\2\2\2?\u00d3\3\2\2\2A\u00d5\3\2\2\2C\u00d8\3\2\2\2E\u00da\3\2\2\2G"+
		"\u00dd\3\2\2\2I\u00e0\3\2\2\2K\u00e3\3\2\2\2M\u00e6\3\2\2\2O\u00e9\3\2"+
		"\2\2Q\u00ec\3\2\2\2S\u00ee\3\2\2\2U\u00f3\3\2\2\2W\u00fd\3\2\2\2Y\u0109"+
		"\3\2\2\2[\u0110\3\2\2\2]\u0115\3\2\2\2_\u0120\3\2\2\2a\u0123\3\2\2\2c"+
		"\u012e\3\2\2\2e\u0130\3\2\2\2gh\7g\2\2hi\7n\2\2ij\7u\2\2jk\7g\2\2k\4\3"+
		"\2\2\2lm\7h\2\2mn\7c\2\2no\7n\2\2op\7u\2\2pq\7g\2\2q\6\3\2\2\2rs\7v\2"+
		"\2st\7t\2\2tu\7w\2\2uv\7g\2\2v\b\3\2\2\2wx\7d\2\2xy\7q\2\2yz\7q\2\2z{"+
		"\7n\2\2{\n\3\2\2\2|}\7h\2\2}~\7q\2\2~\177\7t\2\2\177\f\3\2\2\2\u0080\u0081"+
		"\7k\2\2\u0081\u0082\7h\2\2\u0082\16\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085"+
		"\7p\2\2\u0085\u0086\7v\2\2\u0086\20\3\2\2\2\u0087\u0088\7t\2\2\u0088\u0089"+
		"\7g\2\2\u0089\u008a\7c\2\2\u008a\u008b\7f\2\2\u008b\22\3\2\2\2\u008c\u008d"+
		"\7t\2\2\u008d\u008e\7g\2\2\u008e\u008f\7v\2\2\u008f\u0090\7w\2\2\u0090"+
		"\u0091\7t\2\2\u0091\u0092\7p\2\2\u0092\24\3\2\2\2\u0093\u0094\7u\2\2\u0094"+
		"\u0095\7m\2\2\u0095\u0096\7k\2\2\u0096\u0097\7r\2\2\u0097\26\3\2\2\2\u0098"+
		"\u0099\7u\2\2\u0099\u009a\7v\2\2\u009a\u009b\7q\2\2\u009b\u009c\7r\2\2"+
		"\u009c\30\3\2\2\2\u009d\u009e\7u\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7"+
		"t\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7i\2\2\u00a3\32"+
		"\3\2\2\2\u00a4\u00a5\7x\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7t\2\2\u00a7"+
		"\34\3\2\2\2\u00a8\u00a9\7y\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7k\2\2\u00ab"+
		"\u00ac\7n\2\2\u00ac\u00ad\7g\2\2\u00ad\36\3\2\2\2\u00ae\u00af\7y\2\2\u00af"+
		"\u00b0\7t\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7g\2\2"+
		"\u00b3 \3\2\2\2\u00b4\u00b5\7*\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\7+\2\2"+
		"\u00b7$\3\2\2\2\u00b8\u00b9\7]\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7_\2\2\u00bb"+
		"(\3\2\2\2\u00bc\u00bd\7}\2\2\u00bd*\3\2\2\2\u00be\u00bf\7\177\2\2\u00bf"+
		",\3\2\2\2\u00c0\u00c1\7.\2\2\u00c1.\3\2\2\2\u00c2\u00c3\7=\2\2\u00c3\60"+
		"\3\2\2\2\u00c4\u00c5\7<\2\2\u00c5\62\3\2\2\2\u00c6\u00c7\7-\2\2\u00c7"+
		"\64\3\2\2\2\u00c8\u00c9\7/\2\2\u00c9\66\3\2\2\2\u00ca\u00cb\7,\2\2\u00cb"+
		"8\3\2\2\2\u00cc\u00cd\7\61\2\2\u00cd:\3\2\2\2\u00ce\u00cf\7\'\2\2\u00cf"+
		"<\3\2\2\2\u00d0\u00d1\7?\2\2\u00d1\u00d2\7?\2\2\u00d2>\3\2\2\2\u00d3\u00d4"+
		"\7?\2\2\u00d4@\3\2\2\2\u00d5\u00d6\7#\2\2\u00d6\u00d7\7?\2\2\u00d7B\3"+
		"\2\2\2\u00d8\u00d9\7@\2\2\u00d9D\3\2\2\2\u00da\u00db\7@\2\2\u00db\u00dc"+
		"\7?\2\2\u00dcF\3\2\2\2\u00dd\u00de\7-\2\2\u00de\u00df\7?\2\2\u00dfH\3"+
		"\2\2\2\u00e0\u00e1\7/\2\2\u00e1\u00e2\7?\2\2\u00e2J\3\2\2\2\u00e3\u00e4"+
		"\7,\2\2\u00e4\u00e5\7?\2\2\u00e5L\3\2\2\2\u00e6\u00e7\7\61\2\2\u00e7\u00e8"+
		"\7?\2\2\u00e8N\3\2\2\2\u00e9\u00ea\7\'\2\2\u00ea\u00eb\7?\2\2\u00ebP\3"+
		"\2\2\2\u00ec\u00ed\7>\2\2\u00edR\3\2\2\2\u00ee\u00ef\7\60\2\2\u00efT\3"+
		"\2\2\2\u00f0\u00f2\t\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f6\u00fa\t\3\2\2\u00f7\u00f9\t\4\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fbV\3\2\2\2"+
		"\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\61\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0103"+
		"\3\2\2\2\u0100\u0102\n\5\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0106\u0107\b,\2\2\u0107X\3\2\2\2\u0108\u010a\t\6\2\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\b-\2\2\u010eZ\3\2\2\2\u010f\u0111\t\7\2\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\\\3\2\2\2\u0114\u0116\5_\60\2\u0115\u0114\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\7$\2\2\u0118\u011a\5a\61\2\u0119"+
		"\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7$"+
		"\2\2\u011c^\3\2\2\2\u011d\u011e\7w\2\2\u011e\u0121\7:\2\2\u011f\u0121"+
		"\t\b\2\2\u0120\u011d\3\2\2\2\u0120\u011f\3\2\2\2\u0121`\3\2\2\2\u0122"+
		"\u0124\5c\62\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126b\3\2\2\2\u0127\u012f\n\t\2\2\u0128\u012f"+
		"\5e\63\2\u0129\u012a\7^\2\2\u012a\u012f\7\f\2\2\u012b\u012c\7^\2\2\u012c"+
		"\u012d\7\17\2\2\u012d\u012f\7\f\2\2\u012e\u0127\3\2\2\2\u012e\u0128\3"+
		"\2\2\2\u012e\u0129\3\2\2\2\u012e\u012b\3\2\2\2\u012fd\3\2\2\2\u0130\u0131"+
		"\7^\2\2\u0131\u0132\t\n\2\2\u0132f\3\2\2\2\r\2\u00f3\u00fa\u0103\u010b"+
		"\u0112\u0115\u0119\u0120\u0125\u012e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}