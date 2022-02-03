import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link soccerParser}.
 */
public interface soccerParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link soccerParser#game}.
	 * @param ctx the parse tree
	 */
	void enterGame(soccerParser.GameContext ctx);
	/**
	 * Exit a parse tree produced by {@link soccerParser#game}.
	 * @param ctx the parse tree
	 */
	void exitGame(soccerParser.GameContext ctx);
	/**
	 * Enter a parse tree produced by {@link soccerParser#club}.
	 * @param ctx the parse tree
	 */
	void enterClub(soccerParser.ClubContext ctx);
	/**
	 * Exit a parse tree produced by {@link soccerParser#club}.
	 * @param ctx the parse tree
	 */
	void exitClub(soccerParser.ClubContext ctx);
	/**
	 * Enter a parse tree produced by {@link soccerParser#score}.
	 * @param ctx the parse tree
	 */
	void enterScore(soccerParser.ScoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link soccerParser#score}.
	 * @param ctx the parse tree
	 */
	void exitScore(soccerParser.ScoreContext ctx);
}