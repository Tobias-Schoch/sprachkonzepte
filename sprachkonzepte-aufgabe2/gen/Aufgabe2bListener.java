// Generated from C:/Users/tobia/IdeaProjects/sprachkonzepte-aufgabe2/src\Aufgabe2b.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Aufgabe2bParser}.
 */
public interface Aufgabe2bListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Aufgabe2bParser#timeFormat}.
	 * @param ctx the parse tree
	 */
	void enterTimeFormat(Aufgabe2bParser.TimeFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aufgabe2bParser#timeFormat}.
	 * @param ctx the parse tree
	 */
	void exitTimeFormat(Aufgabe2bParser.TimeFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aufgabe2bParser#hours}.
	 * @param ctx the parse tree
	 */
	void enterHours(Aufgabe2bParser.HoursContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aufgabe2bParser#hours}.
	 * @param ctx the parse tree
	 */
	void exitHours(Aufgabe2bParser.HoursContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aufgabe2bParser#minutes}.
	 * @param ctx the parse tree
	 */
	void enterMinutes(Aufgabe2bParser.MinutesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aufgabe2bParser#minutes}.
	 * @param ctx the parse tree
	 */
	void exitMinutes(Aufgabe2bParser.MinutesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Aufgabe2bParser#daytime}.
	 * @param ctx the parse tree
	 */
	void enterDaytime(Aufgabe2bParser.DaytimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Aufgabe2bParser#daytime}.
	 * @param ctx the parse tree
	 */
	void exitDaytime(Aufgabe2bParser.DaytimeContext ctx);
}