import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Aufgabe3b {
    private Aufgabe3b() { }

    public static void main(String[] args) throws Exception {
        soccerLexer lexer = new soccerLexer(CharStreams.fromStream(System.in));
        soccerParser parser = new soccerParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.game();
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.printf("%d error(s) detected%n", parser.getNumberOfSyntaxErrors());
            System.exit(1);
        }

        Matchup ast = new soccerBuilder().build(tree);
        System.out.printf("Expr.toString() = \"%s\"%n",  ast.club_left.toString(ast.club_left) + " " + ast.score_left.toString(ast.score_left) + " : " + ast.score_right.toString(ast.score_right) + " " + ast.club_right.toString(ast.club_right));
    }
}