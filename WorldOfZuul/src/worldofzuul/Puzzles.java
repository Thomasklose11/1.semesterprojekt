package worldofzuul;

/**
 *
 * @author thomas
 */
import java.util.Scanner;

public class Puzzles {

    public static void question() {

        String p1 = "Young I am tall, old I am short. I love to glow. Breath is my foe?\n"//ask the question
                + "(a)Human,\n(b)Candle,\n(c)Tree,\n(d)The sun";//multiple choice

        String p2 = "What can you reach with your right hand, but not with your left hand?\n"//ask question
                + "(a)Your sword\n(b)Your drink\n(c)Your elbow\n(d)Your dreams";//multiple choice

        Question [] questions = {
            new Question(p1, "b"),//the answer for p1
            new Question(p2, "c")//the answer for p2
        };
        takeQuiz(questions);

    }

    public static void takeQuiz(Question[] questions) {
        int score = 0;//starting score
        Scanner keyboardInput = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = keyboardInput.nextLine();
            if (answer.equals(questions[i].answer)) {//check if answer is correct
                score++;//gives point
            }
        }
        System.out.println("You got " + score + "/" + questions.length);

    }
}
