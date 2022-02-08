import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

public final class soccerBuilder extends soccerParserBaseListener {
    private Matchup matchup;
    private Stack<Content> game = new Stack<Content>();
    private static Content[] gameCheck = new Content[6];
    private LinkedList<Content> test = new LinkedList<>();

    public Matchup build(ParseTree tree) {
        new ParseTreeWalker().walk(this, tree);
        return matchup;
    }

    public static boolean staticSemantic() {
        if (gameCheck[0].toString(gameCheck[0]).equals(gameCheck[4].toString(gameCheck[4]))) {
            return false;
        }
        return true;
    }

    @Override
    public void exitGame(soccerParser.GameContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (!ctx.getChild(i).getText().contains(":")) {
                this.game.push(new Content(ctx.getChild(i).getText()));
                gameCheck[i] = (new Content(ctx.getChild(i).getText()));
            }
        }

        int i = 0;
        while(game.size() > 0) {
            test.add(i++, this.game.pop());
        }
        this.matchup = new Matchup(test);
    }
}
