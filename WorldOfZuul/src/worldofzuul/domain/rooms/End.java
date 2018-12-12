package worldofzuul.domain.rooms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import worldofzuul.domain.challenges.Highscore;
import worldofzuul.domain.objects.Score;
import worldofzuul.domain.rooms.Rooms;

public class End {

    public static boolean endTrue = false;

    public static void end() {
        if (Rooms.getCurrentRoom() == Rooms.getEndRoom() && Rooms.getEndRoom().hasItems == false) {
            endTrue = true;
            Score.incrementScore(Rooms.getRoomCounter() * 50);
            new Highscore().read();
        }
        //Writes to the file.    
        File file = new File("assets/RoomCounter/RoomCounter.txt");
        try {
            Scanner reader = new Scanner(file);
            ArrayList<String> counter = new ArrayList<>();
            while (reader.hasNext()) {
                counter.add(reader.nextLine());
            }
            reader.close();
            if (endTrue == true) {
                counter.add("Antal rum spilleren har været i: " + Rooms.getRoomCounter());
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
