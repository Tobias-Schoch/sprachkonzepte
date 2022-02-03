// Generated from C:/Users/tobia/IdeaProjects/sprachkonzepte-aufgabe2/src\Aufgabe2b.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Aufgabe2bParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HOURS=1, MINUTES=2, CHAR=3, COLON=4, SPACE=5;
	public static final int
		RULE_timeFormat = 0, RULE_hours = 1, RULE_minutes = 2, RULE_daytime = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"timeFormat", "hours", "minutes", "daytime"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HOURS", "MINUTES", "CHAR", "COLON", "SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Aufgabe2b.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Aufgabe2bParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TimeFormatContext extends ParserRuleContext {
		public HoursContext hours() {
			return getRuleContext(HoursContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Aufgabe2bParser.COLON, 0); }
		public MinutesContext minutes() {
			return getRuleContext(MinutesContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(Aufgabe2bParser.SPACE, 0); }
		public DaytimeContext daytime() {
			return getRuleContext(DaytimeContext.class,0);
		}
		public TimeFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Aufgabe2bListener ) ((Aufgabe2bListener)listener).enterTimeFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Aufgabe2bListener ) ((Aufgabe2bListener)listener).exitTimeFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aufgabe2bVisitor ) return ((Aufgabe2bVisitor<? extends T>)visitor).visitTimeFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeFormatContext timeFormat() throws RecognitionException {
		TimeFormatContext _localctx = new TimeFormatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_timeFormat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			hours();
			setState(9);
			match(COLON);
			setState(10);
			minutes();
			setState(11);
			match(SPACE);
			setState(12);
			daytime();
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

	public static class HoursContext extends ParserRuleContext {
		public TerminalNode HOURS() { return getToken(Aufgabe2bParser.HOURS, 0); }
		public HoursContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hours; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Aufgabe2bListener ) ((Aufgabe2bListener)listener).enterHours(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Aufgabe2bListener ) ((Aufgabe2bListener)listener).exitHours(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aufgabe2bVisitor ) return ((Aufgabe2bVisitor<? extends T>)visitor).visitHours(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HoursContext hours() throws RecognitionException {
		HoursContext _localctx = new HoursContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hours);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(HOURS);
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

	public static class MinutesContext extends ParserRuleContext {
		public TerminalNode MINUTES() { return getToken(Aufgabe2bParser.MINUTES, 0); }
		public MinutesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minutes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Aufgabe2bListener ) ((Aufgabe2bListener)listener).enterMinutes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Aufgabe2bListener ) ((Aufgabe2bListener)listener).exitMinutes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aufgabe2bVisitor ) return ((Aufgabe2bVisitor<? extends T>)visitor).visitMinutes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinutesContext minutes() throws RecognitionException {
		MinutesContext _localctx = new MinutesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_minutes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(MINUTES);
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

	public static class DaytimeContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(Aufgabe2bParser.CHAR, 0); }
		public DaytimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_daytime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Aufgabe2bListener ) ((Aufgabe2bListener)listener).enterDaytime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Aufgabe2bListener ) ((Aufgabe2bListener)listener).exitDaytime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Aufgabe2bVisitor ) return ((Aufgabe2bVisitor<? extends T>)visitor).visitDaytime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DaytimeContext daytime() throws RecognitionException {
		DaytimeContext _localctx = new DaytimeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_daytime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(CHAR);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\27\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\2\2\6\2\4\6\b\2\2\2\22\2\n\3\2\2\2\4\20\3\2\2\2\6\22\3\2\2\2\b\24\3"+
		"\2\2\2\n\13\5\4\3\2\13\f\7\6\2\2\f\r\5\6\4\2\r\16\7\7\2\2\16\17\5\b\5"+
		"\2\17\3\3\2\2\2\20\21\7\3\2\2\21\5\3\2\2\2\22\23\7\4\2\2\23\7\3\2\2\2"+
		"\24\25\7\5\2\2\25\t\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}