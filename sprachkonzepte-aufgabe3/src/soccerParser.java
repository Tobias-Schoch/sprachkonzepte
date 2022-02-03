import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class soccerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COLON=1, CLUB=2, NUMBER=3, WS=4;
	public static final int
		RULE_game = 0, RULE_club = 1, RULE_score = 2;
	public static final String[] ruleNames = {
		"game", "club", "score"
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

	@Override
	public String getGrammarFileName() { return "aufgabe3/soccerParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public soccerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GameContext extends ParserRuleContext {
		public List<ClubContext> club() {
			return getRuleContexts(ClubContext.class);
		}
		public ClubContext club(int i) {
			return getRuleContext(ClubContext.class,i);
		}
		public List<ScoreContext> score() {
			return getRuleContexts(ScoreContext.class);
		}
		public ScoreContext score(int i) {
			return getRuleContext(ScoreContext.class,i);
		}
		public TerminalNode COLON() { return getToken(soccerParser.COLON, 0); }
		public GameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_game; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof soccerParserListener ) ((soccerParserListener)listener).enterGame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof soccerParserListener ) ((soccerParserListener)listener).exitGame(this);
		}
	}

	public final GameContext game() throws RecognitionException {
		GameContext _localctx = new GameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_game);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			club();
			setState(7);
			score();
			setState(8);
			match(COLON);
			setState(9);
			score();
			setState(10);
			club();
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

	public static class ClubContext extends ParserRuleContext {
		public TerminalNode CLUB() { return getToken(soccerParser.CLUB, 0); }
		public ClubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_club; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof soccerParserListener ) ((soccerParserListener)listener).enterClub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof soccerParserListener ) ((soccerParserListener)listener).exitClub(this);
		}
	}

	public final ClubContext club() throws RecognitionException {
		ClubContext _localctx = new ClubContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_club);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(CLUB);
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

	public static class ScoreContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(soccerParser.NUMBER, 0); }
		public ScoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_score; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof soccerParserListener ) ((soccerParserListener)listener).enterScore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof soccerParserListener ) ((soccerParserListener)listener).exitScore(this);
		}
	}

	public final ScoreContext score() throws RecognitionException {
		ScoreContext _localctx = new ScoreContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_score);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(NUMBER);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\6\23\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\2\2\5\2\4\6\2"+
		"\2\17\2\b\3\2\2\2\4\16\3\2\2\2\6\20\3\2\2\2\b\t\5\4\3\2\t\n\5\6\4\2\n"+
		"\13\7\3\2\2\13\f\5\6\4\2\f\r\5\4\3\2\r\3\3\2\2\2\16\17\7\4\2\2\17\5\3"+
		"\2\2\2\20\21\7\5\2\2\21\7\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}