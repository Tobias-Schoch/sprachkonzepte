// Generated from C:/Users/tobia/IdeaProjects/sprachkonzepte-aufgabe3/src\soccerParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link soccerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface soccerParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link soccerParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(soccerParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link soccerParser#game}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGame(soccerParser.GameContext ctx);
	/**
	 * Visit a parse tree produced by {@link soccerParser#club}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClub(soccerParser.ClubContext ctx);
	/**
	 * Visit a parse tree produced by {@link soccerParser#score}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScore(soccerParser.ScoreContext ctx);
}