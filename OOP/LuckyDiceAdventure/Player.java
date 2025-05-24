package OOP.LuckyDiceAdventure;

public class Player {

    private int score;

    public Player() {
        this.score = 0;
    }

    public void setScore(int score) {
        this.score += score;
    }

    public int getScore() {
        return score;
    }
}
