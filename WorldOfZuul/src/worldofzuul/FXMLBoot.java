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
    public static Stage primaryStage;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        
       
        
        Scene scene = new Scene(root);
      
        
        primaryStage = stage;
        primaryStage.setScene(scene);
        primaryStage.show();

        
    
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
