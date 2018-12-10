/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul.domain.game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.image.Image;


/**
 *
 * @author mathi
 */
public class FXMLBoot extends Application {
    public static Stage primaryStage;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../menus/MainMenu.fxml"));

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        primaryStage = stage;
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/UI/Icon.png")));
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
