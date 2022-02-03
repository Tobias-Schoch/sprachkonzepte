import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Stack;

public final class soccerBuilder extends soccerParserBaseListener {
    private Matchup matchup;
    private Stack<Matchup> game = new Stack<Matchup>();
    private Stack<Club> club_stack = new Stack<Club>();
    private Stack<Score> score_stack = new Stack<Score>();

    public Matchup build(ParseTree tree) {
        new ParseTreeWalker().walk(this, tree);
        return matchup;
    }

    @Override
    public void exitGame(soccerParser.GameContext ctx) {
        this.club_stack.push(new Club(ctx.getChild(0).getText()));
        this.score_stack.push(new Score(ctx.getChild(1).getText()));
        this.score_stack.push(new Score(ctx.getChild(3).getText()));
        this.club_stack.push(new Club(ctx.getChild(4).getText()));
        Club club_right = this.club_stack.pop();
        Score score_right = this.score_stack.pop();
        Score score_left = this.score_stack.pop();
        Club club_left = this.club_stack.pop();

        this.matchup = new Matchup(club_left, score_left, score_right, club_right);
    }
}
