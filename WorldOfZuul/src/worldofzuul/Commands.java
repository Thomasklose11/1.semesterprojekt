package worldofzuul;

/**
 *
 * @author Rene_
 */
public class Commands {

    private static boolean passable = true;

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
            Room nextRoom = Rooms.getCurrentRoom().getExit(direction);

            if (nextRoom == null) {
                System.out.println("There is no door!");
            } else {
                for (String string : Rooms.getCurrentRoom().lockedDoors) {
                    if (string.equals(direction)) {
                        System.out.println("The door you attempt to walk out of is locked");
                        passable = false;
                        break;

                    } else {
                        passable = true;
                    }
                }
            }
            if (nextRoom != null && passable == true) {
                Rooms.setCurrentRoom(nextRoom);
                System.out.println(Rooms.getCurrentRoom().getLongDescription());
            }

        } else {
            System.out.println("Please enter a valid direction.");
        }
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