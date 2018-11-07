package worldofzuul;

import java.util.ArrayList;

/**
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
        Parser.init();
        Show.welcome();
    }

    public static void play() {

        boolean finished = false;
        while (!finished) {
            Command command = Parser.getCommand();
            finished = Commands.processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

}
