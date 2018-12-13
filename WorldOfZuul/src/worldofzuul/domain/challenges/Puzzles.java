package worldofzuul.domain.challenges;

/**
 *
 * @author thomas
 */
import worldofzuul.domain.rooms.Rooms;

public class Puzzles {
    
    private static int answerType = 0;

    private static final String p1 = "Young I am tall, old I am short. I love to glow. Breath is my foe?";//ask the question
    private static final String p1A = "Human";
    private static final String p1B = "Candle";
    private static final String p1C = "Tree";
    private static final String p1D = "The Sun";

    private static final String p2 = "What can you reach with your right hand, but not with your left hand?";//ask question
    private static final String p2A = "Your Sword";
    private static final String p2B = "Your Drink";
    private static final String p2C = "Your Left Elbow";
    private static final String p2D = "Your Dreams";

    private static final String p3 = "I am so simple that I only point; yet I guide men all over the world?\n";//ask the question
    private static final String p3A = "A Guide";
    private static final String p3B = "A Sign";
    private static final String p3C = "A Compass";
    private static final String p3D = "A Friend";

    private static final String p4 = "What have four legs but doesn't go anywhere?";//ask the question
    private static final String p4A = "A Horse";
    private static final String p4B = "A Table";
    private static final String p4C = "A Tree";
    private static final String p4D = "A Dog";

    private static final String p5 = "I have cities, but no houses. I have mountains, but no trees. I have water, but no fish. What am I?";//ask the question
    private static final String p5A = "Paradise";
    private static final String p5B = "A Map";
    private static final String p5C = "Armageddon";
    private static final String p5D = "The World";

    private static final String p6 = "I'm sometimes full, but I never overflow, I typically show myself when it's dark . What Am I?";//ask the question
    private static final String p6A = "The Moon";
    private static final String p6B = "A Man";
    private static final String p6C = "A Glass";
    private static final String p6D = "A Bat";

    private static final String p7 = "What devours all, can kill a king, destroy a town and crush a mountain";//ask the question
    private static final String p7A = "Faith";
    private static final String p7B = "Tsunami";
    private static final String p7C = "Meteor";
    private static final String p7D = "Time";

    private static final String p8 = "What belongs to you but is used more by others than you?";//ask the question
    private static final String p8A = "Your House";
    private static final String p8B = "Your Helmet";
    private static final String p8C = "Your Dog";
    private static final String p8D = "Your Name";

    public static Question[] questions = {
        new Question(p1, p1A, p1B, p1C, p1D, "b"),
        new Question(p2, p2A, p2B, p2C, p2D, "c"),
        new Question(p3, p3A, p3B, p3C, p3D, "c"),
        new Question(p4, p4A, p4B, p4C, p4D, "b"),
        new Question(p5, p5A, p5B, p5C, p5D, "b"),
        new Question(p6, p6A, p6B, p6C, p6D, "a"),
        new Question(p7, p7A, p7B, p7C, p7D, "d"),
        new Question(p8, p8A, p8B, p8C, p8D, "d")
    };

    public static void answer(String answer, Question question){
        if (answer.equals(question.getCorrectAnswer())) {
            System.out.println("The answer is correct. The doors are unlocked.");
            
            Rooms.getCurrentRoom().unlockAll();
            Rooms.getCurrentRoom().setQuestionFalse();
            answerType = 1;
            
        } else {
            System.out.println("The answer is incorrect. Try again!");
            System.out.println(Rooms.getCurrentRoom().getQuestion().getPrompt());
            answerType = 2;
        }
    }
    
    public static int getAnswerType () {
        return answerType;
    }
    public static void setAnswerType (int type){
        answerType = type;
    }
    
    
}