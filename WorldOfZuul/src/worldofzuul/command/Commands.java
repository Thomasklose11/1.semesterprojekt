package worldofzuul.command;

import worldofzuul.domain.Item;
import worldofzuul.domain.Inventory;
import worldofzuul.domain.Room;
import worldofzuul.domain.Score;
import worldofzuul.domain.Rooms;
import worldofzuul.domain.Puzzles;
import worldofzuul.presentation.Show;

/**
 *
 * @author Rene_
 */
public class Commands {

    public static boolean processCommand(Command command) {
        boolean wantToQuit = false;

        CommandWord commandWord = command.getCommandWord();

        if (commandWord == CommandWord.UNKNOWN) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        if (commandWord == CommandWord.HELP) {
            Show.help();
        } else if (commandWord == CommandWord.GO) {
            Commands.go(command);
        } else if (commandWord == CommandWord.QUIT) {
            wantToQuit = Commands.quit(command);
        } else if (commandWord == CommandWord.INVENTORY) {
            Show.inventory();
        } else if (commandWord == CommandWord.GETITEM) {
            Commands.getItem(command);
        } else if (commandWord == CommandWord.GETSCORE) {
            System.out.println("Your score is: " + Score.getScore());
        } else if (commandWord == CommandWord.ANSWER) {
            Puzzles.answer(command, Rooms.getCurrentRoom().getQuestion());
        }
        return wantToQuit;
    }

    private static void getItem(Command command) {
        if (!command.hasSecondWord()) {
            System.out.println("Get what?");
            return;
        }
        String temp;
        temp = command.getSecondWord();

        if (temp.equals("treasure")) {
            if (Rooms.getCurrentRoom().getBonus() == 1) {
                Score.incrementScore(1000);
                Rooms.getCurrentRoom().setBonus0();
                System.out.println("1000 points were added to your score. Your score is: " + Score.getScore());
            } else if (Rooms.getCurrentRoom().getBonus() == 2) {
                Score.incrementScore(2000);
                Rooms.getCurrentRoom().setBonus0();
                System.out.println("2000 points were added to your score. Your score is: " + Score.getScore());
            }
        } else {
            String item = command.getSecondWord();

            Item newItem = Rooms.getCurrentRoom().getItem(item);

            if (newItem == null) {
                System.out.println("That item is not here!");
            } else {
                Inventory.addToInventory(newItem);
                Rooms.getCurrentRoom().removeItem(item);
                System.out.println("Picked up: " + item);
            }
        }
    }

    private static void go(Command command) {
        if (!command.hasSecondWord()) {
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();
        if (direction.equals("north") || direction.equals("south") || direction.equals("west") || direction.equals("east")) {

            for (int i = 0; i < Rooms.getCurrentRoom().doors.size(); i++) {
                if (Rooms.getCurrentRoom().doors.get(i).getDirection().equals(direction)) {
                    if (Rooms.getCurrentRoom().doors.get(i).getLocked() == true) {
                        System.out.println("The door is locked");
                        break;
                    } else {
                        move(direction);
                        break;
                    }
                }
            }

        } else {
            System.out.println("Please enter a valid direction.");
        }
    }

//Moves player from currentRoom to nextRoom
    private static void move(String direction) {
        Room nextRoom = Rooms.getCurrentRoom().getExit(direction);

        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        Rooms.setCurrentRoom(nextRoom);
        System.out.println(Rooms.getCurrentRoom().getLongDescription());
    }

    private static boolean quit(Command command) {
        if (command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        } else {
            return true;
        }
    }

}
