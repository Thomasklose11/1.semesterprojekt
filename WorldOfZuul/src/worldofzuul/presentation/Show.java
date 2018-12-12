package worldofzuul.presentation;

import javafx.scene.text.Text;
import worldofzuul.command.CommandWord;
import worldofzuul.domain.objects.Inventory;
import worldofzuul.command.Parser;
import worldofzuul.domain.rooms.Rooms;

/**
 *
 * @author Rene_
 */
public class Show {

    public static void welcome() {

        //System.out.println();
        //System.out.println("Welcome to TempleRaider!");
        //System.out.println("This is an adventure game.");
        //System.out.println("Type '" + CommandWord.HELP + "' if you need help.");
        //System.out.println();
        //System.out.println(Rooms.getCurrentRoom().getLongDescription());
 ;
      }

    public static void help() {
        System.out.println("You are lost. You are alone.");
        System.out.println();
        System.out.println("Your command words are:");
        Parser.showCommands();
    }

    public static void inventory() {
        String output = "";
        for (int i = 0; i < Inventory.getInventory().size(); i++) {
            output += Inventory.getInventory().get(i).getDescription() + " ";
        }
        System.out.println("You are carrying:");
        System.out.println(output);
    }
}
