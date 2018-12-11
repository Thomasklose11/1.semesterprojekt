/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul.domain.challenges;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import worldofzuul.domain.challenges.Highscore;
import worldofzuul.domain.game.FXMLBoot;

/**
 * FXML Controller class
 *
 * @author Rene_
 */
public class HighscoreController implements Initializable {
    @FXML
    private TextArea List1To5;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        List<String> scoreList = new Highscore().readHighscore();
        String listToString = "";
        int i = 1;
        for (String line : scoreList) {
            Scanner scanner = new Scanner(line);
            scanner.useDelimiter("@");
            listToString += String.format("%-2s. %-20s %20s", i, scanner.next(), scanner.nextInt()) + "\n";
            i++;
        }
        List1To5.setText(listToString);
    }    

    @FXML
    private void handleBackToMenuButtonAction(ActionEvent event) throws IOException {
        Parent rootMain = FXMLLoader.load(getClass().getResource("../menus/MainMenu.fxml"));
        Scene sceneMain = new Scene(rootMain);
        sceneMain.getStylesheets().add(getClass().getResource("../game/CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(sceneMain);
    }
    
}
