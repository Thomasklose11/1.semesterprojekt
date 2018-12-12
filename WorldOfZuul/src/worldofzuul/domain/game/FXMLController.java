package worldofzuul.domain.game;

import worldofzuul.domain.game.FXMLBoot;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import worldofzuul.domain.rooms.Game;
import worldofzuul.domain.challenges.Highscore;

public class FXMLController implements Initializable {

    @FXML
    private void handleStartButtonAction(ActionEvent event) throws Exception {
        System.out.println(getClass().getResource("../menus/EnterNamePrompt.fxml"));
        Parent rootNameEnterPrompt = FXMLLoader.load(getClass().getResource("../menus/EnterNamePrompt.fxml"));
        Scene sceneNameEnterPrompt = new Scene(rootNameEnterPrompt);
        sceneNameEnterPrompt.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(sceneNameEnterPrompt);

    }
    public static String playerName;
    private TextField TextField;
    private Label LabelName;

    @FXML
    private void handlePlayButtonAction(ActionEvent event) throws Exception {
//        if (TextField.getLength() > 0) {
//            Parent rootGame = FXMLLoader.load(getClass().getResource("GameUI.fxml"));
//            Scene sceneGame = new Scene(rootGame);
//            sceneGame.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
//            FXMLBoot.primaryStage.setScene(sceneGame);
//            Game.init();
//            //Game.play();
//            playerName = TextField.getText();
//        } else {
//            LabelName.setText("Please enter a name");
//        }

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
        Parent rootPause = FXMLLoader.load(getClass().getResource("../menus/PauseMenu.fxml"));
        Scene scenePause = new Scene(rootPause);
        scenePause.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(scenePause);

    }

    @FXML
    private void handleQuitBtPauseMenuAction(ActionEvent event) throws Exception {

        Parent rootMain = FXMLLoader.load(getClass().getResource("../menus/MainMenu.fxml"));
        Scene sceneMain = new Scene(rootMain);
        sceneMain.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        new Highscore().read();
        FXMLBoot.primaryStage.setScene(sceneMain);

    }

    @FXML
    private void handleHighscoreButtonAction(ActionEvent event) throws Exception {

        Parent rootHigh = FXMLLoader.load(getClass().getResource("../menus/HighscoreMenu.fxml"));
        Scene sceneHigh = new Scene(rootHigh);
        sceneHigh.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(sceneHigh);
    }

    @FXML
    private void handleBackToMenuButtonAction(ActionEvent event) throws Exception {
        Parent rootMain = FXMLLoader.load(getClass().getResource("../menus/MainMenu.fxml"));
        Scene sceneMain = new Scene(rootMain);
        sceneMain.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(sceneMain);

    }

    @FXML
    private void handleResumeButtonAction(ActionEvent event) throws Exception {
        Parent rootGame = FXMLLoader.load(getClass().getResource("../game/GameUI.fxml"));
        Scene sceneGame = new Scene(rootGame);
        sceneGame.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(sceneGame);
    }

    @FXML
    private void handleHelpButtonAction(ActionEvent event) throws Exception {
        Parent rootHelp = FXMLLoader.load(getClass().getResource("../menus/HelpWindow.fxml"));
        Scene sceneHelp = new Scene(rootHelp);
        sceneHelp.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(sceneHelp);

    }

    @FXML
    private void handleBackButtonAction(ActionEvent event) throws Exception {
        Parent rootPause = FXMLLoader.load(getClass().getResource("../menus/PauseMenu.fxml"));
        Scene scenePause = new Scene(rootPause);
        scenePause.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(scenePause);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
