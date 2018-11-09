package worldofzuul;

/**
 *
 * @author thomas
 */
import java.util.ArrayList;
import java.util.Scanner;
import static java.util.Arrays.asList;

public class Puzzles {
        
        public static Question[] questions = new Question [8];
    private static String p1 = "Young I am tall, old I am short. I love to glow. Breath is my foe?\n"//ask the question
            + "(a)Human,\n(b)Candle,\n(c)Tree,\n(d)The sun";//multiple choice

    private static String p2 = "What can you reach with your right hand, but not with your left hand?\n"//ask question
            + "(a)Your sword\n(b)Your drink\n(c)Your elbow\n(d)Your dreams";//multiple choice

    private static String p3 = " I am so simple that I only point; yet I guide men all over the world?\n"//ask the question
            + "(a)A guide\n(b)A sign\n(c)A compass\n(d)A friend";//multiple choice

    private static String p4 = "What have four legs but doesn't go anywhere?"//ask the question
            + "(a)A horse\n(b)A table\n(c)A tree\n(d)A dog";//multiple choice

    private static String p5 = "I have cities, but no houses. I have mountains, but no trees. I have water, but no fish. What am I?"//ask the question
            + "(a)Paradise\n(b)A map\n(c)Armageddon\n(d)The world";//multiple choice

    private static String p6 = "I'm sometimes full, but I never overflow, I typically show myself when it dark . What Am I?"//ask the question
            + "(a)The moon\n(b)A man\n(c)A glass\n(d)A bat";//multiple choice

    private static String p7 = "What devours all, can kill a king, destroy a town and crush a mountain"//ask the question
            + "(a)\nFaith(b)a Tsunami\n(c)a Meteor\n(d)Time";//multiple choice

    private static String p8 = "What belongs to you but is used more by others than you?"//ask the question
            + "(a)Your house\n(b)Your Helmet\n(c)Your dog\n(d)Your name";//multiple choice

    public static void initQuestions() {
//        Question question1 = new Question(p1,"b");
//        Question question2 = new Question(p2,"c");
//        Question question3 = new Question(p3,"c");
//        Question question4 = new Question(p4,"b");
//        Question question5 = new Question(p5,"b");
//        Question question6 = new Question(p6,"a");
//        Question question7 = new Question(p7,"d");
//        Question question8 = new Question(p8,"d");
        
        
        questions [0] = new Question(p1, "b");
        questions [1] = new Question(p2, "c");
        questions [2] = new Question(p3, "c");
        questions [3] = new Question(p4, "b");
        questions [4] = new Question(p5, "b");
        questions [5] = new Question(p6, "a");
        questions [6] = new Question(p7, "d");
        questions [7] = new Question(p8, "d");
    }

       

    public static void answer(Command command, Question question) {
        if (Rooms.getCurrentRoom().hasQuestion() == true) {
            if (!command.hasSecondWord()) {
                System.out.println("Answer what?");
                return;
            }
            String answer = command.getSecondWord();

            if (answer.equals(question.getAnswer())) {
                System.out.println("The answer is correct");
                Rooms.getCurrentRoom().unlock();
                Rooms.getCurrentRoom().setQuestionFalse();
            } else {
                System.out.println("The answer is incorrect. Try again!");
                System.out.println(Rooms.getCurrentRoom().getQuestion().getPrompt());
            }
        }
    }
}
