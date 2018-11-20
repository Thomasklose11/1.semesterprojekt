/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author mathi
 */
public class FXMLBoot extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        
        Parent rootPause = FXMLLoader.load(getClass().getResource("PauseMenu.fxml"));
        
        Scene scene = new Scene(root);
        Scene scenePause = new Scene(rootPause);
        
        stage.setScene(scene);
        stage.show();
    
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
