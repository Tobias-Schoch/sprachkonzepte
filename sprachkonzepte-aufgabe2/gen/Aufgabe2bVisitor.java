// Generated from C:/Users/tobia/IdeaProjects/sprachkonzepte-aufgabe2/src\Aufgabe2b.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Aufgabe2bParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Aufgabe2bVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Aufgabe2bParser#timeFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeFormat(Aufgabe2bParser.TimeFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aufgabe2bParser#hours}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHours(Aufgabe2bParser.HoursContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aufgabe2bParser#minutes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinutes(Aufgabe2bParser.MinutesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Aufgabe2bParser#daytime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDaytime(Aufgabe2bParser.DaytimeContext ctx);
}