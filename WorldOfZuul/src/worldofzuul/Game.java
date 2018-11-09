package worldofzuul;

import java.util.ArrayList;

/**
 * 
 *
 * @author mathi
 */
public class Game {

    public static void main(String[] args) {
        init();
        play();

    }

    public static void init() {
        Rooms.createRooms();
        Puzzles.initQuestions();
        Parser.init();
        Show.welcome();

    }

    public static void play() {

        boolean finished = false;
        while (!finished) {
            Command command = Parser.getCommand();
            finished = Commands.processCommand(command);
            End.end();
        }
        System.out.println("Thank you for playing.  Goodbye.");
    }

    public static void endGame() {
        System.out.println("Your score is: " + Score.getScore());
        System.out.println("Thanks for playing!");
        System.exit(0);

    }

}
