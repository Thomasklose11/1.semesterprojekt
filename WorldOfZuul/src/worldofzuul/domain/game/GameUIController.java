package worldofzuul.domain.game;

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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import worldofzuul.domain.challenges.Puzzles;
import worldofzuul.domain.objects.Item;
import worldofzuul.domain.rooms.Room;
import worldofzuul.domain.rooms.Rooms;
import worldofzuul.domain.objects.Bonus;
import worldofzuul.domain.objects.Score;
import worldofzuul.domain.challenges.SendMail;
import worldofzuul.domain.objects.Inventory;
import worldofzuul.domain.rooms.End;

public class GameUIController implements Initializable {

    @FXML
    private TextFlow TextFlowUI;
    @FXML
    private ImageView RoomDisplayImage;
    @FXML
    public Label HighscoreLabel;
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
        
// This part of initialize is run to make sure that all the functions that need to be called when the GameUI is initialized, by not running them the first time GameUI is initialized.
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

// Button event for movement north
    @FXML
    private void handleGoNorth(ActionEvent event) {
        String direction = "north";
        moveCheck(direction);
    }

// Button event for movement south
    @FXML
    private void handleGoSouth(ActionEvent event) {
        String direction = "south";
        moveCheck(direction);
    }

// Button event for movement west
    @FXML
    private void handleGoWest(ActionEvent event) {
        String direction = "west";
        moveCheck(direction);
    }

// Button event for movement east
    @FXML
    private void handleGoEast(ActionEvent event) {
        String direction = "east";
        moveCheck(direction);
    }

// Initializes the pause menu
    @FXML
    private void handleMenuWindowButton(ActionEvent event) throws Exception {
        Parent rootPause = FXMLLoader.load(getClass().getResource("PauseMenu.fxml"));
        Scene scenePause = new Scene(rootPause);
        scenePause.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(scenePause);
    }

// Performs a large variation of checks on the doors of the current room before allowing movement
    private void moveCheck(String direction) {

        //Runs a for loop to check all doors in the current room
        for (int i = 0; i < Rooms.getCurrentRoom().doors.size(); i++) {
            // Checks if a door is present in the direction the player wants to move
            if (Rooms.getCurrentRoom().doors.get(i).getDirection().equals(direction)) {
                // If a door with the correct direction is found, checks if it is locked
                if (Rooms.getCurrentRoom().doors.get(i).getLocked() == true) {
                    // Checks if the door is colorless, and therefore is not unlockable with a key
                    if (Rooms.findDoorColor(direction).equals("none")) {
                        Text text = new Text("The door is locked");
                        TextFlowUI.getChildren().add(text);
                        TextFlowUI.getChildren().add(new Text(System.lineSeparator()));
                        System.out.println("The door is locked");
                        break;
                    } else {
                        // Checks the inventory for an appropiate key and lets the player move through the locked door if one is found.
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
                    // If the door is not locked the player is allowed to move
                    go(direction);
                    break;
                }
            }
        }
    }
    
// Gets the room the player wishes to move to, and calls methods which update the GUI and the properties of the program.
    
    private void go(String direction) {
        Room nextRoom = Rooms.getCurrentRoom().getExit(direction);

        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        
        // Checks if the next room is of the type darkRoom and if the player has the torch item, and sets the image to display accordingly
        if (nextRoom.getDarkRoom() == true && Inventory.checkInventoryForItem("torch")) {
            nextRoom.setSecondImage();
        }

        // Updates the currentRoom property
        Rooms.setCurrentRoom(nextRoom);

        // Updates the room counter depending on wether the room has been visited before.
        if (Rooms.getCurrentRoom().getVisited() == false) {
            Rooms.incrementRoomCounter();
            System.out.println("Room counter: " + Rooms.getRoomCounter());
        }
        Rooms.getCurrentRoom().setVisited();
        
        // Shows the rooms image in the GUI and the image of the item it contains.
        RoomDisplayImage.setImage(nextRoom.getImage());
        if (Rooms.getCurrentRoom().hasItems == true) {
            itemImage.setImage(Rooms.getCurrentRoom().getItem(0).getIcon());

        } else {
            itemImage.setImage(null);
        }

        //Updates the textflow
        print2TextFlow();
    }

// Checks wether the type of item interacted with is a bonus or an item, and either adds an amount to the players score or the item to the inventory respectively.
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
        
        // Checks if the last item has been picked up and the game has to end
        End.end();
        if (End.endTrue == true) {
            bootEndScreen();
            SendMail.mail();
        }
    }
    
// Initializes the question window
    @FXML
    private void handleGoToQuestion(ActionEvent event) throws Exception {
        if (Rooms.getCurrentRoom().hasQuestion() == true) {
            Parent rootPause = FXMLLoader.load(getClass().getResource("/worldofzuul/domain/challenges/QuestionUI.fxml"));
            Scene scenePause = new Scene(rootPause);
            scenePause.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
            FXMLBoot.primaryStage.setScene(scenePause);
        }
    }

// Updates the inventory sprites to match the inventory arrayList
    private void displayInventory() {
        for (int i = 0; i < Inventory.getInvSize(); i++) {
            if (Inventory.getItem(i) != null) {
                inventorySpots.get(i).setImage(Inventory.getItem(i).getIcon());
            }
        }
    }

// Updates the score label to match the players current score
    public void setScore() {
        HighscoreLabel.setText(String.valueOf(Score.getScore()));
    }
    
// Updates the textflow to show the current rooms description
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

// Initializes the end screen
    public void bootEndScreen() throws IOException {
        Parent rootPause = FXMLLoader.load(getClass().getResource("/worldofzuul/domain/rooms/EndScreen.fxml"));
        Scene scenePause = new Scene(rootPause);
        scenePause.getStylesheets().add(getClass().getResource("CustomFontApp.css").toExternalForm());
        FXMLBoot.primaryStage.setScene(scenePause);

    }

}
