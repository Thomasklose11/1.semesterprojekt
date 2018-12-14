package worldofzuul.domain.game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;


public class FXMLBoot extends Application {

    public static Stage primaryStage;

//Launches the Main menu fxml
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        primaryStage = stage;
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/worldofzuul/resources/UI/Icon.png")));
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
