package worldofzuul.domain.rooms;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import worldofzuul.domain.objects.Score;

public class EndScreenController implements Initializable {

    @FXML
    private Label ScoreLabel;
    @FXML
    private Label NumberOfRoom;

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
