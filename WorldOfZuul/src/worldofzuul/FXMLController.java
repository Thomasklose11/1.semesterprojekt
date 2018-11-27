package worldofzuul;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import worldofzuul.domain.Game;

public class FXMLController implements Initializable {

    @FXML
    private void handleStartButtonAction(ActionEvent event) throws Exception {
        Parent rootGame = FXMLLoader.load(getClass().getResource("GameUI.fxml"));
        Scene sceneGame = new Scene (rootGame);
        FXMLBoot.primaryStage.setScene(sceneGame);
        Game.init();
        //Game.play();
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
