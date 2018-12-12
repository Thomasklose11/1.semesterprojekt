package worldofzuul.domain.challenges;

/**
 *
 * @author thomas
 */
public class Question {

    public String prompt;
    public String answerA;
    public String answerB;
    public String answerC;
    public String answerD;
    
    private final String answerCorrect;

    public Question(String prompt,String answerA ,String answerB,String answerC,String answerD, String answerCorrect) {
        this.prompt = prompt;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.answerCorrect = answerCorrect;
    }
    
    public String getCorrectAnswer(){
        return answerCorrect;
    }

    public String getAnswerA() {
        return answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public String getAnswerD() {
        return answerD;
    }
    
    
    public String getPrompt(){
        return prompt;
    }

}
