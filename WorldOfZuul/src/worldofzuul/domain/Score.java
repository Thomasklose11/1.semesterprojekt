package worldofzuul.domain;

import worldofzuul.GameUIController;

/**
 *
 * @author Rene_
 */
public class Score {
    private static int score = 0;
    
    public static void incrementScore(int score1) {
        score += score1;
        GameUIController.HighscoreLabel.setText(String.valueOf(Score.getScore()));
    }   

    public static int getScore() {
        return score;
    }
    
    
    @Override
    public String toString(){
        return "score"+ score;
    }
}
