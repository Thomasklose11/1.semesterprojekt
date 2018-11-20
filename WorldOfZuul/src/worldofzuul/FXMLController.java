package worldofzuul;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import worldofzuul.domain.Game;


public class FXMLController implements Initializable {

    @FXML
    private void handleStartButtonAction(ActionEvent event) {
 
        Game.init();
        Game.play();
    }
    
    @FXML
    private void handleQuitButtonAction(ActionEvent event) {
        
        System.exit(0);
    }
    
    @FXML
    private void handlePauseButtonAction(ActionEvent event) {
        System.out.println("Pause");

  
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
