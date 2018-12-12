/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul.domain.rooms;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import worldofzuul.domain.objects.Score;

/**
 * FXML Controller class
 *
 * @author morte
 */
public class EndScreenController implements Initializable {

    @FXML
    private Label TYforPlaying;
    @FXML
    private Label YourFinalScore;
    @FXML
    private Label ScoreLabel;
    @FXML
    private Label NumberOfRoom;
    @FXML
    private Label NumberOfRoomLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ScoreLabel.setText("" + Score.getScore());
        NumberOfRoom.setText("" + Rooms.getRoomCounter() + " out of 71 rooms");
    }    
    
}
