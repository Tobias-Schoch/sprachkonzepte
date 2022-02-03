import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class soccerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COLON=1, CLUB=2, NUMBER=3, WS=4;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COLON", "CLUB", "NUMBER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' : '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COLON", "CLUB", "NUMBER", "WS"
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


	public soccerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "aufgabe3/soccerLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\6\u0132\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0125\n\3\3\4\6\4\u0128\n\4\r\4\16"+
		"\4\u0129\3\5\6\5\u012d\n\5\r\5\16\5\u012e\3\5\3\5\2\2\6\3\3\5\4\7\5\t"+
		"\6\3\2\4\3\2\62;\5\2\13\f\17\17\"\"\u0144\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\3\13\3\2\2\2\5\u0124\3\2\2\2\7\u0127\3\2\2\2\t\u012c"+
		"\3\2\2\2\13\f\7\"\2\2\f\r\7<\2\2\r\16\7\"\2\2\16\4\3\2\2\2\17\20\7H\2"+
		"\2\20\21\7E\2\2\21\22\7\"\2\2\22\23\7C\2\2\23\24\7w\2\2\24\25\7i\2\2\25"+
		"\26\7u\2\2\26\27\7d\2\2\27\30\7w\2\2\30\31\7t\2\2\31\u0125\7i\2\2\32\33"+
		"\7\63\2\2\33\34\7\60\2\2\34\35\7\"\2\2\35\36\7H\2\2\36\37\7E\2\2\37 \7"+
		"\"\2\2 !\7W\2\2!\"\7p\2\2\"#\7k\2\2#$\7q\2\2$%\7p\2\2%&\7\"\2\2&\'\7D"+
		"\2\2\'(\7g\2\2()\7t\2\2)*\7n\2\2*+\7k\2\2+\u0125\7p\2\2,-\7J\2\2-.\7g"+
		"\2\2./\7t\2\2/\60\7v\2\2\60\61\7j\2\2\61\62\7c\2\2\62\63\7\"\2\2\63\64"+
		"\7D\2\2\64\65\7U\2\2\65\u0125\7E\2\2\66\67\7C\2\2\678\7t\2\289\7o\2\2"+
		"9:\7k\2\2:;\7p\2\2;<\7k\2\2<=\7c\2\2=>\7\"\2\2>?\7D\2\2?@\7k\2\2@A\7g"+
		"\2\2AB\7n\2\2BC\7g\2\2CD\7h\2\2DE\7g\2\2EF\7n\2\2F\u0125\7f\2\2GH\7X\2"+
		"\2HI\7h\2\2IJ\7N\2\2JK\7\"\2\2KL\7D\2\2LM\7q\2\2MN\7e\2\2NO\7j\2\2OP\7"+
		"w\2\2P\u0125\7o\2\2QR\7D\2\2RS\7q\2\2ST\7t\2\2TU\7w\2\2UV\7u\2\2VW\7u"+
		"\2\2WX\7k\2\2XY\7c\2\2YZ\7\"\2\2Z[\7F\2\2[\\\7q\2\2\\]\7t\2\2]^\7v\2\2"+
		"^_\7o\2\2_`\7w\2\2`a\7p\2\2a\u0125\7f\2\2bc\7G\2\2cd\7k\2\2de\7p\2\2e"+
		"f\7v\2\2fg\7t\2\2gh\7c\2\2hi\7e\2\2ij\7j\2\2jk\7v\2\2kl\7\"\2\2lm\7H\2"+
		"\2mn\7t\2\2no\7c\2\2op\7p\2\2pq\7m\2\2qr\7h\2\2rs\7w\2\2st\7t\2\2t\u0125"+
		"\7v\2\2uv\7U\2\2vw\7E\2\2wx\7\"\2\2xy\7H\2\2yz\7t\2\2z{\7g\2\2{|\7k\2"+
		"\2|}\7d\2\2}~\7w\2\2~\177\7t\2\2\177\u0125\7i\2\2\u0080\u0081\7U\2\2\u0081"+
		"\u0082\7r\2\2\u0082\u0083\7X\2\2\u0083\u0084\7i\2\2\u0084\u0085\7i\2\2"+
		"\u0085\u0086\7\"\2\2\u0086\u0087\7I\2\2\u0087\u0088\7t\2\2\u0088\u0089"+
		"\7g\2\2\u0089\u008a\7w\2\2\u008a\u008b\7v\2\2\u008b\u008c\7j\2\2\u008c"+
		"\u008d\7g\2\2\u008d\u008e\7t\2\2\u008e\u008f\7\"\2\2\u008f\u0090\7H\2"+
		"\2\u0090\u0091\7\u00c5\2\2\u0091\u0092\7\u00be\2\2\u0092\u0093\7t\2\2"+
		"\u0093\u0094\7v\2\2\u0094\u0125\7j\2\2\u0095\u0096\7V\2\2\u0096\u0097"+
		"\7U\2\2\u0097\u0098\7I\2\2\u0098\u0099\7\"\2\2\u0099\u009a\7\63\2\2\u009a"+
		"\u009b\7:\2\2\u009b\u009c\7;\2\2\u009c\u009d\7;\2\2\u009d\u009e\7\"\2"+
		"\2\u009e\u009f\7J\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2"+
		"\7h\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7j\2\2\u00a5"+
		"\u00a6\7g\2\2\u00a6\u00a7\7k\2\2\u00a7\u0125\7o\2\2\u00a8\u00a9\7\63\2"+
		"\2\u00a9\u00aa\7\60\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\7H\2\2\u00ac\u00ad"+
		"\7E\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00af\7M\2\2\u00af\u00b0\7\u00c5\2\2"+
		"\u00b0\u00b1\7\u00b8\2\2\u00b1\u00b2\7n\2\2\u00b2\u0125\7p\2\2\u00b3\u00b4"+
		"\7T\2\2\u00b4\u00b5\7D\2\2\u00b5\u00b6\7\"\2\2\u00b6\u00b7\7N\2\2\u00b7"+
		"\u00b8\7g\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7|\2\2"+
		"\u00bb\u00bc\7k\2\2\u00bc\u0125\7i\2\2\u00bd\u00be\7D\2\2\u00be\u00bf"+
		"\7c\2\2\u00bf\u00c0\7{\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7t\2\2\u00c2"+
		"\u00c3\7\"\2\2\u00c3\u00c4\7\62\2\2\u00c4\u00c5\7\66\2\2\u00c5\u00c6\7"+
		"\"\2\2\u00c6\u00c7\7N\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7x\2\2\u00c9"+
		"\u00ca\7g\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7m\2\2\u00cc\u00cd\7w\2\2"+
		"\u00cd\u00ce\7u\2\2\u00ce\u00cf\7g\2\2\u00cf\u0125\7p\2\2\u00d0\u00d1"+
		"\7\63\2\2\u00d1\u00d2\7\60\2\2\u00d2\u00d3\7\"\2\2\u00d3\u00d4\7H\2\2"+
		"\u00d4\u00d5\7U\2\2\u00d5\u00d6\7X\2\2\u00d6\u00d7\7\"\2\2\u00d7\u00d8"+
		"\7O\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db"+
		"\u00dc\7|\2\2\u00dc\u00dd\7\"\2\2\u00dd\u00de\7\62\2\2\u00de\u0125\7\67"+
		"\2\2\u00df\u00e0\7D\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3"+
		"\7w\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7k\2\2\u00e6"+
		"\u00e7\7c\2\2\u00e7\u00e8\7\"\2\2\u00e8\u00e9\7O\2\2\u00e9\u00ea\7\u00c5"+
		"\2\2\u00ea\u00eb\7\u00b8\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7e\2\2\u00ed"+
		"\u00ee\7j\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7i\2\2"+
		"\u00f1\u00f2\7n\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7f\2\2\u00f4\u00f5"+
		"\7d\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7e\2\2\u00f7\u0125\7j\2\2\u00f8"+
		"\u00f9\7H\2\2\u00f9\u00fa\7E\2\2\u00fa\u00fb\7\"\2\2\u00fb\u00fc\7D\2"+
		"\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7{\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100"+
		"\7t\2\2\u0100\u0101\7p\2\2\u0101\u0102\7\"\2\2\u0102\u0103\7O\2\2\u0103"+
		"\u0104\7\u00c5\2\2\u0104\u0105\7\u00be\2\2\u0105\u0106\7p\2\2\u0106\u0107"+
		"\7e\2\2\u0107\u0108\7j\2\2\u0108\u0109\7g\2\2\u0109\u0125\7p\2\2\u010a"+
		"\u010b\7X\2\2\u010b\u010c\7h\2\2\u010c\u010d\7D\2\2\u010d\u010e\7\"\2"+
		"\2\u010e\u010f\7U\2\2\u010f\u0110\7v\2\2\u0110\u0111\7w\2\2\u0111\u0112"+
		"\7v\2\2\u0112\u0113\7v\2\2\u0113\u0114\7i\2\2\u0114\u0115\7c\2\2\u0115"+
		"\u0116\7t\2\2\u0116\u0125\7v\2\2\u0117\u0118\7X\2\2\u0118\u0119\7h\2\2"+
		"\u0119\u011a\7N\2\2\u011a\u011b\7\"\2\2\u011b\u011c\7Y\2\2\u011c\u011d"+
		"\7q\2\2\u011d\u011e\7n\2\2\u011e\u011f\7h\2\2\u011f\u0120\7u\2\2\u0120"+
		"\u0121\7d\2\2\u0121\u0122\7w\2\2\u0122\u0123\7t\2\2\u0123\u0125\7i\2\2"+
		"\u0124\17\3\2\2\2\u0124\32\3\2\2\2\u0124,\3\2\2\2\u0124\66\3\2\2\2\u0124"+
		"G\3\2\2\2\u0124Q\3\2\2\2\u0124b\3\2\2\2\u0124u\3\2\2\2\u0124\u0080\3\2"+
		"\2\2\u0124\u0095\3\2\2\2\u0124\u00a8\3\2\2\2\u0124\u00b3\3\2\2\2\u0124"+
		"\u00bd\3\2\2\2\u0124\u00d0\3\2\2\2\u0124\u00df\3\2\2\2\u0124\u00f8\3\2"+
		"\2\2\u0124\u010a\3\2\2\2\u0124\u0117\3\2\2\2\u0125\6\3\2\2\2\u0126\u0128"+
		"\t\2\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\b\3\2\2\2\u012b\u012d\t\3\2\2\u012c\u012b\3\2\2\2"+
		"\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0131\b\5\2\2\u0131\n\3\2\2\2\6\2\u0124\u0129\u012e\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}