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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import worldofzuul.domain.Item;
import worldofzuul.domain.Room;
import worldofzuul.domain.Rooms;
import worldofzuul.domain.Bonus;
import worldofzuul.domain.Score;

/**
 * FXML Controller class
 *
 * @author morte
 */
public class GameUIController implements Initializable {

    @FXML
    private Button NorthButton;
    @FXML
    private Button SouthButton;
    @FXML
    private Button WestButton;
    @FXML
    private Button EastButton;
    @FXML
    private TextField UiTekstField;
    @FXML
    private ImageView RoomDisplayImage;
    @FXML
    public Label HighscoreLabel;
    @FXML
    private Button MenuWindowButton;
    @FXML
    private GridPane Inventory;

    private static int counter = 0;
    @FXML
    private ImageView itemImage;
    @FXML
    private ImageView Inventory1;
    @FXML
    private ImageView Inventory4;
    @FXML
    private ImageView Inventory7;
    @FXML
    private ImageView Inventory2;
    @FXML
    private ImageView Inventory5;
    @FXML
    private ImageView Inventory8;
    @FXML
    private ImageView Inventory3;
    @FXML
    private ImageView Inventory6;
    @FXML
    private ImageView Inventory9;
    @FXML
    private ImageView bonusImage1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void setItem(Item item) {
        ImageView tile = (ImageView) Inventory.getChildren().get(counter);
        tile.setImage(item.getIcon());
        counter++;
    }

    @FXML
    private void handleGoNorth(ActionEvent event) {
        String direction = "north";
        moveUI(direction);

    }

    @FXML
    private void handleGoSouth(ActionEvent event) {
        String direction = "south";
        moveUI(direction);
    }

    @FXML
    private void handleGoWest(ActionEvent event) {
        String direction = "west";
        moveUI(direction);
    }

    @FXML
    private void handleGoEast(ActionEvent event) {
        String direction = "east";
        moveUI(direction);
    }

    @FXML
    private void handleMenuWindowButton(ActionEvent event) throws Exception {
        Parent rootPause = FXMLLoader.load(getClass().getResource("PauseMenu.fxml"));
        Scene scenePause = new Scene(rootPause);
        FXMLBoot.primaryStage.setScene(scenePause);
    }

    private void moveUI(String direction) {
        for (int i = 0; i < Rooms.getCurrentRoom().doors.size(); i++) {
            if (Rooms.getCurrentRoom().doors.get(i).getDirection().equals(direction)) {
                if (Rooms.getCurrentRoom().doors.get(i).getLocked() == true) {
                    System.out.println("The door is locked");
                    break;
                } else {
                    Room nextRoom = Rooms.getCurrentRoom().getExit(direction);

                    if (nextRoom == null) {
                        System.out.println("There is no door!");
                    }
                    Rooms.setCurrentRoom(nextRoom);
                    RoomDisplayImage.setImage(nextRoom.getImage());
                    if (Rooms.getCurrentRoom().hasItems == true) {
                        itemImage.setImage(Rooms.getCurrentRoom().getItem(0).getIcon());

                    } else {
                        itemImage.setImage(null);
                    }
                    System.out.println(Rooms.getCurrentRoom().getLongDescription());
                    break;
                }
            }
        }
    }

    @FXML
    private void handlePickUp(ActionEvent event) {
        if (Rooms.getCurrentRoom().getItem(0) != null) {
            if (Rooms.getCurrentRoom().getItem(0) instanceof Bonus) {
                Bonus currentBonus = (Bonus) Rooms.getCurrentRoom().getItem(0);
                if (currentBonus.getBonus() == 1) {
                    Rooms.getCurrentRoom().removeItem(0);
                    itemImage.setImage(null);
                    Score.incrementScore(1000);
                    setScore();
                } else if (currentBonus.getBonus() == 2) {
                    Rooms.getCurrentRoom().removeItem(0);
                    itemImage.setImage(null);
                    Score.incrementScore(1000);
                    setScore();
                }

            } else {
                Item newItem = Rooms.getCurrentRoom().getItem(0);

                worldofzuul.domain.Inventory.addToInventory(newItem);
                Rooms.getCurrentRoom().removeItem(0);

                itemImage.setImage(null);
                displayInventory();
            }
        } else {
            System.out.println("There is no item in this room");
        }

    }

    private void displayInventory() {
        Inventory1.setImage(worldofzuul.domain.Inventory.getItem(0).getIcon());
        Inventory2.setImage(worldofzuul.domain.Inventory.getItem(1).getIcon());
        Inventory3.setImage(worldofzuul.domain.Inventory.getItem(2).getIcon());
        Inventory4.setImage(worldofzuul.domain.Inventory.getItem(3).getIcon());
        Inventory5.setImage(worldofzuul.domain.Inventory.getItem(4).getIcon());
        Inventory6.setImage(worldofzuul.domain.Inventory.getItem(5).getIcon());
        Inventory7.setImage(worldofzuul.domain.Inventory.getItem(6).getIcon());
        Inventory8.setImage(worldofzuul.domain.Inventory.getItem(7).getIcon());
        Inventory9.setImage(worldofzuul.domain.Inventory.getItem(8).getIcon());

    }

    public void setScore() {
        HighscoreLabel.setText(String.valueOf(Score.getScore()));
    }
}
