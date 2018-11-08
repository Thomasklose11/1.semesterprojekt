package worldofzuul;

/**
 *
 * @author Rene_
 */
public class Score {
    private static int score = 0;
    
    public static void incrementScore(int score) {
        score += score;
    }   

    public static int getScore() {
        return score;
    }
}
