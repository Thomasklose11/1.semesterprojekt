/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul.domain.challenges;

import worldofzuul.domain.objects.Score;
import worldofzuul.domain.rooms.Rooms;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import worldofzuul.domain.game.FXMLController;

public class Highscore {

    //  public static void scorenm () {
//
//      Highscore a = new Highscore();
//      a.appendToHighscore();
//
//   } // end main
//
//   public void appendToHighscore () {
//
//      BufferedWriter bw = null;
//
//      try {
//         // APPEND MODE SET HERE
//         bw = new BufferedWriter(new FileWriter("Highscore.txt", true));
//	 bw.write("Player: " + FXMLController.playerName + "  " + "Score: " + Score.getScore() + "  " + "Rooms: " + Rooms.getRoomCounter());
//	 bw.newLine();
//	 bw.flush();
//      } catch (IOException ioe) {
//	 ioe.printStackTrace();
//      } finally {                       // always close the file
//	 if (bw != null) try {
//	    bw.close();
//	 } catch (IOException ioe2) {
//	    // just ignore it
//	 }
//      } // end try/catch/finally
//
//   } // end test()
//
//} // end class
    public void read() {
        List<String> data = new ArrayList<>();
        File file = new File("assets/Highscore/HighScore.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                data.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No file found");

        }
        
        HashMap<String, Integer> scoreList = new HashMap<>(); // The map that combines names and scores
        List<String> names = new ArrayList<>(); //A list of alle names
        List<Integer> scores = new ArrayList<>(); //A list of alle scores

        //This players entry to the list. A combination of the name, delimeter and thier score.
        String currentScoreString = FXMLController.playerName + "@" + Score.getScore();
        
        //Add this players entr to the list from file.
        data.add(currentScoreString);
        
        //Go through all the lines in the file and scan them. For each line the name
        // and the score is seperated(@) into two list (name,score)
        for (String line : data) {
            Scanner scanner = new Scanner(line);
            scanner.useDelimiter("@");
            names.add(scanner.next());
            if (scanner.hasNextInt()) {
                scores.add(scanner.nextInt());
            } else {
                scores.add(0);
            }
            scanner.close();
        }
        
        //Combine the names and scores to one hashMap. Making them a pair
        for (int i = 0; i < data.size(); i++) {
            scoreList.put(names.get(i), scores.get(i));

        }
        
        //Create a list of pairs entries. The entries are taken from hashmap we just created
        List<Map.Entry<String, Integer>> listToSort = new ArrayList<>(scoreList.entrySet());
        
        //Use the inbuild Collenction.sort to sort our list and pairs. This is
        // Implemented ad an anonymous class for convenience.
        Collections.sort(listToSort, new Comparator<Map.Entry<String, Integer>>(){
            //Override the compare method to make sure, the pairs are sorted
            //according to thir induvidual value. 02 is before o1 to make sure
            //that they are sorted in decending order.
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue().compareTo(o1.getValue()));
            }
            
        });
        
        //Create a list to store the sorted pairs in Strings
        List<String> sortedList = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : listToSort){
            sortedList.add(entry.getKey() + "@" + entry.getValue());
        }
        
        //Writes to the file.    
        try {
            PrintWriter writer = new PrintWriter(file);
            for (String line : sortedList) {
                writer.println(line);
                
            }
            writer.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No file was found");
        }
        
    }
    public List<String> readHighscore(){
        List<String> data = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("assets/Highscore/HighScore.txt"));
            while(scanner.hasNext()){
                data.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Highscore.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
        
    }

}
