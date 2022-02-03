public class Matchup {
    public Club club_left;
    public Club club_right;
    public Score score_left;
    public Score score_right;

    public Matchup(Club club_left, Score score_left, Score score_right, Club club_right) {
        this.club_left = club_left;
        this.club_right = club_right;
        this.score_left = score_left;
        this.score_right = score_right;
    }
}