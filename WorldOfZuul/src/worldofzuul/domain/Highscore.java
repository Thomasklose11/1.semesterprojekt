/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul.domain;

import worldofzuul.FXMLController;

/**
 *
 * @author mathi
 */
public class Highscore {

    public static void writeHighscore() throws java.io.IOException {
 
        java.io.File file = new java.io.File("Highscore.txt");
        //if (file.exists()) {
          //  System.out.println("File already exists");
          //  System.exit(1);
        //}
        //create file
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        
        //create file
        output.print(FXMLController.playerName + "     ");
        output.println(Score.getScore());
        
        //close file
        output.close();
        
    }
}
