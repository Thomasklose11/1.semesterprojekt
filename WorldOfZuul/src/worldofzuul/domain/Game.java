package worldofzuul.domain;

import worldofzuul.presentation.Show;
import worldofzuul.command.Command;
import worldofzuul.command.Commands;
import worldofzuul.command.Parser;

public class Game {

    public static void init() {
        Rooms.createRooms();
        //Parser.init();
        //Show.welcome();
    }

//    public static void play() {
//
//        boolean finished = false;
//        while (!finished) {
//            Command command = Parser.getCommand();
//            finished = Commands.processCommand(command);
//            End.end();
//        }
//        System.out.println("Thank you for playing. Goodbye.");
//    }

    // end game
//    public static void endGame() {
//        System.out.println("Your score is: " + Score.getScore());
//        System.out.println("Thanks for playing!");
//        System.exit(0);
//
//    }

}
