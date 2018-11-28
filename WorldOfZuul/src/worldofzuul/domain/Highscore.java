/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul.domain;
import java.io.*;
import worldofzuul.FXMLController;

public class Highscore {

   public static void scorenm () {

      Highscore a = new Highscore();
      a.appendToHighscore();

   } // end main

   public void appendToHighscore () {

      BufferedWriter bw = null;

      try {
         // APPEND MODE SET HERE
         bw = new BufferedWriter(new FileWriter("Highscore.txt", true));
	 bw.write(FXMLController.playerName + "     " + Score.getScore());
	 bw.newLine();
	 bw.flush();
      } catch (IOException ioe) {
	 ioe.printStackTrace();
      } finally {                       // always close the file
	 if (bw != null) try {
	    bw.close();
	 } catch (IOException ioe2) {
	    // just ignore it
	 }
      } // end try/catch/finally

   } // end test()

} // end class