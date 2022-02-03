// Generated from C:/Users/tobia/IdeaProjects/untitled3/src/aufgabe4\soccerParser.g4 by ANTLR 4.9.2

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link soccerParser}.
 */
public interface soccerParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link soccerParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(soccerParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link soccerParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(soccerParser.StartContext ctx);
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