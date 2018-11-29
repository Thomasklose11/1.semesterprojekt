package worldofzuul;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import worldofzuul.domain.Game;
import worldofzuul.domain.Highscore;

public class FXMLController implements Initializable {

    @FXML
    private void handleStartButtonAction(ActionEvent event) throws Exception {
        Parent rootNameEnterPrompt = FXMLLoader.load(getClass().getResource("EnterNamePrompt.fxml"));
        Scene sceneNameEnterPrompt = new Scene(rootNameEnterPrompt);
        FXMLBoot.primaryStage.setScene(sceneNameEnterPrompt);

    }
    public static String playerName;
    @FXML
    private TextField TextField;
    @FXML
    private Label LabelName;
    @FXML 
    private TextArea Highscoretable;

    @FXML
    private void handlePlayButtonAction(ActionEvent event) throws Exception {
        if (TextField.getLength() > 0) {
            Parent rootGame = FXMLLoader.load(getClass().getResource("GameUI.fxml"));
            Scene sceneGame = new Scene(rootGame);
            FXMLBoot.primaryStage.setScene(sceneGame);
            Game.init();
            //Game.play();
            playerName = TextField.getText();
            Highscore.scorenm();
        } else {
            LabelName.setText("Please enter a name");
        }

    }

    @FXML
    public void playButtonOnEnter(ActionEvent ae) {
        System.out.println("test");
    }

    @FXML
    private void handleQuitButtonAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void handlePauseButtonAction(ActionEvent event) throws Exception {
        Parent rootPause = FXMLLoader.load(getClass().getResource("PauseMenu.fxml"));
        Scene scenePause = new Scene(rootPause);
        FXMLBoot.primaryStage.setScene(scenePause);

    }

    @FXML
    private void handleQuitBtPauseMenuAction(ActionEvent event) throws Exception {

        Parent rootMain = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Scene sceneMain = new Scene(rootMain);
        FXMLBoot.primaryStage.setScene(sceneMain);

    }
    
    @FXML
    private void handleHighscoreButtonAction(ActionEvent event) throws Exception {

        Parent rootHigh = FXMLLoader.load(getClass().getResource("HighscoreMenu.fxml"));
        Scene sceneHigh = new Scene(rootHigh);
        FXMLBoot.primaryStage.setScene(sceneHigh);

    }
    @FXML
    private void handleBackToMenuButtonAction(ActionEvent event) throws Exception {
        Parent rootMain = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Scene sceneMain = new Scene(rootMain);
        FXMLBoot.primaryStage.setScene(sceneMain);

    }
    

    @FXML
    private void handleResumeButtonAction(ActionEvent event) throws Exception {
        Parent rootGame = FXMLLoader.load(getClass().getResource("GameUI.fxml"));
        Scene sceneGame = new Scene(rootGame);
        FXMLBoot.primaryStage.setScene(sceneGame);
    }

    @FXML
    private void handleHelpButtonAction(ActionEvent event) throws Exception {
        Parent rootHelp = FXMLLoader.load(getClass().getResource("HelpWindow.fxml"));
        Scene sceneHelp = new Scene(rootHelp);
        FXMLBoot.primaryStage.setScene(sceneHelp);

    }

    @FXML
    private void handleBackButtonAction(ActionEvent event) throws Exception {
        Parent rootPause = FXMLLoader.load(getClass().getResource("PauseMenu.fxml"));
        Scene scenePause = new Scene(rootPause);
        FXMLBoot.primaryStage.setScene(scenePause);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
