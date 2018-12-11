/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul.domain.game;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static worldofzuul.domain.game.FXMLController.playerName;
import worldofzuul.domain.rooms.Game;

/**
 * FXML Controller class
 *
 * @author Rene_
 */
public class EnterNameController implements Initializable {
    @FXML
    private TextField TextField;
    @FXML
    private Label LabelName;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handlePlayButtonAction(ActionEvent event) throws IOException {
          if (TextField.getLength() > 0) {
            Parent rootGame = FXMLLoader.load(getClass().getResource("GameUI.fxml"));
            Scene sceneGame = new Scene(rootGame);
            sceneGame.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
            FXMLBoot.primaryStage.setScene(sceneGame);
            Game.init();
            //Game.play();
            playerName = TextField.getText();
        } else {
            LabelName.setText("Please enter a name");
        }

    }
    
}
