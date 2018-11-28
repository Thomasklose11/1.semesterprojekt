package worldofzuul.domain;

/**
 *
 * @author thomas
 */
import java.util.ArrayList;
import java.util.Scanner;
import worldofzuul.command.Command;
import static java.util.Arrays.asList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import worldofzuul.FXMLBoot;

public class Puzzles {

    private static String p1 = "Young I am tall, old I am short. I love to glow. Breath is my foe?";//ask the question
    private static String p1A = "Human";
    private static String p1B = "Candle";
    private static String p1C = "Tree";
    private static String p1D = "The Sun";

    private static String p2 = "What can you reach with your right hand, but not with your left hand?";//ask question
    private static String p2A = "Your Sword";
    private static String p2B = "Your Drink";
    private static String p2C = "Your Left Elbow";
    private static String p2D = "Your Dreams";

    private static String p3 = "I am so simple that I only point; yet I guide men all over the world?\n";//ask the question
    private static String p3A = "A Guide";
    private static String p3B = "A Sign";
    private static String p3C = "A Compass";
    private static String p3D = "A Friend";

    private static String p4 = "What have four legs but doesn't go anywhere?";//ask the question
    private static String p4A = "A Horse";
    private static String p4B = "A Table";
    private static String p4C = "A Tree";
    private static String p4D = "A Dog";

    private static String p5 = "I have cities, but no houses. I have mountains, but no trees. I have water, but no fish. What am I?";//ask the question
    private static String p5A = "Paradise";
    private static String p5B = "A Map";
    private static String p5C = "Armageddon";
    private static String p5D = "The World";

    private static String p6 = "I'm sometimes full, but I never overflow, I typically show myself when it dark . What Am I?";//ask the question
    private static String p6A = "The Moon";
    private static String p6B = "A Man";
    private static String p6C = "A Glass";
    private static String p6D = "A Bat";

    private static String p7 = "What devours all, can kill a king, destroy a town and crush a mountain";//ask the question
    private static String p7A = "Faith";
    private static String p7B = "Tsunami";
    private static String p7C = "Meteor";
    private static String p7D = "Time";

    private static String p8 = "What belongs to you but is used more by others than you?";//ask the question
    private static String p8A = "Your House";
    private static String p8B = "Your Helmet";
    private static String p8C = "Your Dog";
    private static String p8D = "Your Name";

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
            
        } else {
            System.out.println("The answer is incorrect. Try again!");
            System.out.println(Rooms.getCurrentRoom().getQuestion().getPrompt());
        }
    }
    
    
}