package worldofzuul.domain;

/**
 *
 * @author Rene_
 */
public class Score {
    private static int score = 0;
    
    public static void incrementScore(int score1) {
        score += score1;
    }   

    public static int getScore() {
        return score;
    }
}
