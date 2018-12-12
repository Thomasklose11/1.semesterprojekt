package worldofzuul.domain.objects;

/**
 *
 * @author Rene_
 */
public class Score {
    private static int score = 0;
    
    public static void incrementScore(int score1) {
        score += score1;
        
    }   
    public static void multiplyScore (int multiplier){
        score = score*multiplier;
    }

    public static int getScore() {
        return score;
    }
    
    
    @Override
    public String toString(){
        return "score"+ score;
    }
}
