/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul.domain.challenges;

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
import javafx.scene.image.ImageView;
import worldofzuul.domain.game.FXMLBoot;
import worldofzuul.domain.rooms.Rooms;

/**
 * FXML Controller class
 *
 * @author morte
 */
public class QuestionUIController implements Initializable {

    @FXML
    private ImageView StatueImage;
    @FXML
    private Button AnswerA;
    @FXML
    private Button AnswerC;
    @FXML
    private Button AnswerB;
    @FXML
    private Button AnswerD;
    @FXML
    private Label Question;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadQuestion();
        // TODO
    }

    @FXML
    private void handleAnswerA(ActionEvent event) throws Exception {
        Puzzles.answer("a", Rooms.getCurrentRoom().getQuestion());

        Parent rootPause = FXMLLoader.load(getClass().getResource("../game/GameUI.fxml"));
        Scene scenePause = new Scene(rootPause);
        scenePause.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(scenePause);
    }

    @FXML
    private void handleAnswerB(ActionEvent event) throws Exception {
        Puzzles.answer("b", Rooms.getCurrentRoom().getQuestion());

        Parent rootPause = FXMLLoader.load(getClass().getResource("../game/GameUI.fxml"));
        Scene scenePause = new Scene(rootPause);
        scenePause.getStylesheets().add(getClass().getResource("../game/CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(scenePause);
    }

    @FXML
    private void handleAnswerC(ActionEvent event) throws Exception {
        Puzzles.answer("c", Rooms.getCurrentRoom().getQuestion());

        Parent rootPause = FXMLLoader.load(getClass().getResource("../game/GameUI.fxml"));
        Scene scenePause = new Scene(rootPause);
        scenePause.getStylesheets().add(getClass().getResource("../game/CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(scenePause);
    }

    @FXML
    private void handleAnswerD(ActionEvent event) throws Exception {
        Puzzles.answer("d", Rooms.getCurrentRoom().getQuestion());

        Parent rootPause = FXMLLoader.load(getClass().getResource("../game/GameUI.fxml"));
        Scene scenePause = new Scene(rootPause);
        scenePause.getStylesheets().add(getClass().getResource("/game/CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(scenePause);
    }

    public void loadQuestion() {
        Question.setText("" + Rooms.getCurrentRoom().getQuestion().getPrompt());
        AnswerA.setText("" + Rooms.getCurrentRoom().getQuestion().getAnswerA());
        AnswerB.setText("" + Rooms.getCurrentRoom().getQuestion().getAnswerB());
        AnswerC.setText("" + Rooms.getCurrentRoom().getQuestion().getAnswerC());
        AnswerD.setText("" + Rooms.getCurrentRoom().getQuestion().getAnswerD());
    }

}
