/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import worldofzuul.domain.Game;


public class FXMLDocumentController implements Initializable {

    @FXML
    private void handlestartButtonAction(ActionEvent event) {
 
        Game.init();
        Game.play();
    }
    
    @FXML
    private void handlequitButtonAction(ActionEvent event) {
        
        System.exit(0);
  
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
