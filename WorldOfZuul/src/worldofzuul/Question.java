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
    
    public static String getAnswer(){
        return answer;
    }
    
    public static String getPrompt(){
        return prompt;
    }

}
