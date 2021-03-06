/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul.domain.game;

import worldofzuul.domain.game.FXMLBoot;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import worldofzuul.domain.challenges.Highscore;
import worldofzuul.domain.challenges.Puzzles;
import worldofzuul.domain.objects.Inventory;
import worldofzuul.domain.objects.Item;
import worldofzuul.domain.rooms.Room;
import worldofzuul.domain.rooms.Rooms;
import worldofzuul.domain.objects.Bonus;
import worldofzuul.domain.objects.Score;
import worldofzuul.domain.challenges.SendMail;
import worldofzuul.domain.objects.Inventory;
import static worldofzuul.domain.rooms.Rooms.getCurrentRoom;
import worldofzuul.domain.rooms.End;

//import worldofzuul.domain.SendMail;
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
    private TextFlow TextFlowUI;
    @FXML
    private ImageView RoomDisplayImage;
    @FXML
    public Label HighscoreLabel;
    @FXML
    private Button MenuWindowButton;
    @FXML
    private GridPane InventoryGrid;

    @FXML
    private ImageView itemImage;

    /**
     * Initializes the controller class.
     */
    public static boolean revisit = false;
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

    ArrayList<ImageView> inventorySpots = new ArrayList<>();

    //ImageView[] inventorySpots = {Inventory1, Inventory2, Inventory3, Inventory4, Inventory5, Inventory6, Inventory7, Inventory8, Inventory9};
    private static int counter = 0;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        inventorySpots.add(Inventory1);
        inventorySpots.add(Inventory2);
        inventorySpots.add(Inventory3);
        inventorySpots.add(Inventory4);
        inventorySpots.add(Inventory5);
        inventorySpots.add(Inventory6);
        inventorySpots.add(Inventory7);
        inventorySpots.add(Inventory8);
        inventorySpots.add(Inventory9);

        print2TextFlow();

        if (revisit != false) {
            RoomDisplayImage.setImage(Rooms.getCurrentRoom().getImage());
            displayInventory();
            setScore();
            if (Puzzles.getAnswerType() == 1) {
                Text text = new Text("The answer is correct. The doors are unlocked.");
                TextFlowUI.getChildren().add(text);
                TextFlowUI.getChildren().add(new Text(System.lineSeparator()));
            } else if (Puzzles.getAnswerType() == 2) {
                Text text = new Text("The answer is incorrect. Try again!");
                TextFlowUI.getChildren().add(text);
                TextFlowUI.getChildren().add(new Text(System.lineSeparator()));
            }
        }
        revisit = true;
    }

    public void setItem(Item item) {
        ImageView tile = (ImageView) InventoryGrid.getChildren().get(counter);
        tile.setImage(item.getIcon());
        counter++;
    }

    @FXML
    private void handleGoNorth(ActionEvent event) {
        String direction = "north";
        moveUI(direction);
        //      new Highscore().read();
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
        Parent rootPause = FXMLLoader.load(getClass().getResource("../menus/PauseMenu.fxml"));
        Scene scenePause = new Scene(rootPause);
        scenePause.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(scenePause);
    }

    private void moveUI(String direction) {

        for (int i = 0; i < Rooms.getCurrentRoom().doors.size(); i++) {
            if (Rooms.getCurrentRoom().doors.get(i).getDirection().equals(direction)) {
                if (Rooms.getCurrentRoom().doors.get(i).getLocked() == true) {
                    if (Rooms.findDoorColor(direction).equals("none")) {
                        Text text = new Text("The door is locked");
                        TextFlowUI.getChildren().add(text);
                        TextFlowUI.getChildren().add(new Text(System.lineSeparator()));
                        System.out.println("The door is locked");
                        break;
                    } else {
                        String checkColor = Rooms.findDoorColor(direction);
                        if (Inventory.checkInventoryForKey(checkColor) == true) {
                            go(direction);
                            break;
                        } else {
                            Text text = new Text("You don't have a " + Rooms.getCurrentRoom().doors.get(i).getColor() + " for this door");
                            TextFlowUI.getChildren().add(text);
                            TextFlowUI.getChildren().add(new Text(System.lineSeparator()));
                            System.out.println("You don't have a " + Rooms.getCurrentRoom().doors.get(i).getColor() + " for this door");
                            break;
                        }
                    }
                } else {
                    go(direction);
                    break;
                }
            }
        }
    }

    @FXML
    private void handlePickUp(ActionEvent event) throws IOException {
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
                    Score.incrementScore(2000);
                    setScore();
                } else if (currentBonus.getBonus() == 3) {
                    Rooms.getCurrentRoom().removeItem(0);
                    itemImage.setImage(null);
                    Score.incrementScore(5000);
                    setScore();
                }

            } else {
                Item newItem = Rooms.getCurrentRoom().getItem(0);

                Inventory.addToInventory(newItem);
                Rooms.getCurrentRoom().removeItem(0);

                itemImage.setImage(null);
                displayInventory();
            }
        } else {
            Text text = new Text("There is no item in this room");
            TextFlowUI.getChildren().add(text);
            TextFlowUI.getChildren().add(new Text(System.lineSeparator()));
            System.out.println("There is no item in this room");
        }
        End.end();
        if (End.endTrue == true) {
            bootEndScreen();

            SendMail.mail();
        }
    }

    @FXML
    private void handleGoToQuestion(ActionEvent event) throws Exception {
        if (Rooms.getCurrentRoom().hasQuestion() == true) {
            Parent rootPause = FXMLLoader.load(getClass().getResource("../challenges/QuestionUI.fxml"));
            Scene scenePause = new Scene(rootPause);
            scenePause.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
            FXMLBoot.primaryStage.setScene(scenePause);
        }
    }

    private void displayInventory() {
        for (int i = 0; i < Inventory.getInvSize(); i++) {
            if (Inventory.getItem(i) != null) {
                inventorySpots.get(i).setImage(Inventory.getItem(i).getIcon());
            }
        }
    }

    public void setScore() {
        HighscoreLabel.setText(String.valueOf(Score.getScore()));
    }

    @FXML
    public void print2TextFlow() {
        //Deletes current TextFlow so it doesn't break through the flowbox when more text is added.
        TextFlowUI.getChildren().clear();
        Text text = new Text(Rooms.getCurrentRoom().getLongDescription());
        //Adds Room current room description to the TextFlow along with 2 line separators.
        TextFlowUI.getChildren().add(text);
        TextFlowUI.getChildren().add(new Text(System.lineSeparator()));
        TextFlowUI.getChildren().add(new Text(System.lineSeparator()));
    }

    private void go(String direction) {
        Room nextRoom = Rooms.getCurrentRoom().getExit(direction);

        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        if (nextRoom.getDarkRoom() == true && Inventory.checkInventoryForItem("torch")) {
            nextRoom.setSecondImage();
        }

        Rooms.setCurrentRoom(nextRoom);

        if (Rooms.getCurrentRoom().getVisited() == false) {
            Rooms.incrementRoomCounter();
            System.out.println("Room counter: " + Rooms.getRoomCounter());
        }
        Rooms.getCurrentRoom().setVisited();
        RoomDisplayImage.setImage(nextRoom.getImage());
        if (Rooms.getCurrentRoom().hasItems == true) {
            itemImage.setImage(Rooms.getCurrentRoom().getItem(0).getIcon());

        } else {
            itemImage.setImage(null);
        }

        print2TextFlow();
    }

    public void bootEndScreen() throws IOException {
        Parent rootPause = FXMLLoader.load(getClass().getResource("../rooms/EndScreen.fxml"));
        Scene scenePause = new Scene(rootPause);
        scenePause.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(scenePause);

    }

}
