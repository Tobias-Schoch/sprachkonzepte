import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Aufgabe4b {
    private Aufgabe4b() {
    }

    public static void main(String[] args) throws Exception {
        soccerLexer lexer = new soccerLexer(CharStreams.fromStream(System.in));
        soccerParser parser = new soccerParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.start();
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.printf("%d error(s) detected%n", parser.getNumberOfSyntaxErrors());
            System.exit(1);
        }

        Matchup ast = new soccerBuilder().build(tree);

        for (int i = ast.contentList.size() - 1; i >= 0; i--) {
            if (i % 4 == 3 && i != ast.contentList.size() - 1) {
                System.out.print("\n");
            } else if (i % 4 == 1) {
                System.out.print(" : ");
            } else if (i != ast.contentList.size() - 1) {
                System.out.print(" ");
            }

            System.out.print(ast.contentList.get(i).toString(ast.contentList.get(i)));
        }
    }
}