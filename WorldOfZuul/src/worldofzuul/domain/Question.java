package worldofzuul.domain;

/**
 *
 * @author thomas
 */
public class Question {

    public String prompt;
    private String answer;

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
