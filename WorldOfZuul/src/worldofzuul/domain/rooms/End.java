package worldofzuul.domain.rooms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import worldofzuul.domain.challenges.Highscore;
import worldofzuul.domain.game.FXMLController;
import worldofzuul.domain.objects.Inventory;
import worldofzuul.domain.objects.Score;

public class End {

    public static boolean endTrue = false;

    public static void end() {
        if (Rooms.getCurrentRoom() == Rooms.getEndRoom() && Rooms.getEndRoom().hasItems == false) {
            endTrue = true;
            if (Inventory.checkInventoryForItem("hat") == true) {
                Score.multiplyScore(2);
            }
            Score.incrementScore(Rooms.getRoomCounter() * 50);
            new Highscore().read();

        }
        //Writes to the file.    
        File file = new File("RoomCounter.txt");
        try {
            Scanner reader = new Scanner(file);
            ArrayList<String> counter = new ArrayList<>();
            while (reader.hasNext()) {
                counter.add(reader.nextLine());
            }
            reader.close();
            if (endTrue == true) {
                counter.add("Antal rum spilleren har været i: " + Rooms.getRoomCounter() + "  Name: " + FXMLController.playerName + "    Score: " + Score.getScore());
            }

            PrintWriter writer = new PrintWriter(file);
            for (String str : counter) {
                writer.println(str);
            }

            writer.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
}
