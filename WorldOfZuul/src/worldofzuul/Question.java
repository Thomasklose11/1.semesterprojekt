package worldofzuul;

/**
 *
 * @author thomas
 */
public class Question {

    private static String prompt;
    private static String answer;

    public Question(String prompt, String answer) {
        this.prompt = prompt;
        this.answer = answer;
    }
    
    public String getAnswer(){
        return answer;
    }
    
    public String getPrompt(){
        return prompt;
    }

}
