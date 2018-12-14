package worldofzuul.domain.rooms;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import worldofzuul.domain.objects.Score;

public class EndScreenController implements Initializable {

    @FXML//Display the users final score
    private Label ScoreLabel;
    @FXML//Display the users room count
    private Label NumberOfRoom;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ScoreLabel.setText("" + Score.getScore());//Prints out the users score
        NumberOfRoom.setText("" + Rooms.getRoomCounter() + " out of 71 rooms");//Prints out the users room count 
    }

}
