package worldofzuul.domain.game;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FXMLController implements Initializable {

    @FXML
    private void handleStartButtonAction(ActionEvent event) throws Exception {
        System.out.println(getClass().getResource("EnterNamePrompt.fxml"));
        Parent rootNameEnterPrompt = FXMLLoader.load(getClass().getResource("EnterNamePrompt.fxml"));
        Scene sceneNameEnterPrompt = new Scene(rootNameEnterPrompt);
        sceneNameEnterPrompt.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(sceneNameEnterPrompt);

    }
    public static String playerName;
    private TextField TextField;
    private Label LabelName;

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
        scenePause.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(scenePause);

    }

    @FXML
    private void handleQuitBtPauseMenuAction(ActionEvent event) throws Exception {

        Parent rootMain = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Scene sceneMain = new Scene(rootMain);
        sceneMain.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(sceneMain);

    }

    @FXML
    private void handleHighscoreButtonAction(ActionEvent event) throws Exception {

        Parent rootHigh = FXMLLoader.load(getClass().getResource("/worldofzuul/domain/challenges/HighscoreMenu.fxml"));
        Scene sceneHigh = new Scene(rootHigh);
        sceneHigh.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(sceneHigh);
    }

    @FXML
    private void handleBackToMenuButtonAction(ActionEvent event) throws Exception {
        Parent rootMain = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Scene sceneMain = new Scene(rootMain);
        sceneMain.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(sceneMain);

    }

    @FXML
    private void handleResumeButtonAction(ActionEvent event) throws Exception {
        Parent rootGame = FXMLLoader.load(getClass().getResource("GameUI.fxml"));
        Scene sceneGame = new Scene(rootGame);
        sceneGame.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(sceneGame);
    }
    
    @FXML
    private void handleHelpButtonAction(ActionEvent event) throws Exception {
        Parent rootHelp = FXMLLoader.load(getClass().getResource("HelpWindow.fxml"));
        Scene sceneHelp = new Scene(rootHelp);
        sceneHelp.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(sceneHelp);

    }

    @FXML
    private void handleBackButtonAction(ActionEvent event) throws Exception {
        Parent rootPause = FXMLLoader.load(getClass().getResource("PauseMenu.fxml"));
        Scene scenePause = new Scene(rootPause);
        scenePause.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(scenePause);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

}
