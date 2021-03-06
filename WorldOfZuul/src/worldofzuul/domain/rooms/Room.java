package worldofzuul.domain.rooms;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;
import javafx.scene.image.Image;
import worldofzuul.domain.game.GameUIController;
import worldofzuul.domain.objects.Item;
import worldofzuul.domain.objects.Key;
import worldofzuul.domain.challenges.Puzzles;
import worldofzuul.domain.challenges.Question;

public class Room {

//    public static Room isVisited(boolean b) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    private final String description;
    private final HashMap<String, Room> exits;
    ArrayList<Item> items = new ArrayList<>();

    public boolean hasItems;

    private boolean question = false;
    private Question roomQuestion;

    private boolean darkRoom = false;

    public ArrayList<Door> doors = new ArrayList<>();

    private Image roomImage;
    private boolean visited = false;

    private String secondRoomImage;

    public Room(String description, HashMap<String, Room> exits) {
        this.description = description;
        this.exits = exits;
    }

    public Room(String description) {
        this.description = description;
        exits = new HashMap<String, Room>();
    }

    public Room(String description, String imageURL) {
        this.description = description;
        exits = new HashMap<String, Room>();
        roomImage = new Image(imageURL, true);
    }

    public Room(String description, String imageURL, String secondImageURL) {
        this.description = description;
        exits = new HashMap<String, Room>();
        roomImage = new Image(imageURL, true);
        secondRoomImage = secondImageURL;
    }

    //Setter exit for et rum
    public void setExit(String direction, Room neighbor) {
        exits.put(direction, neighbor);
        doors.add(new Door(direction));
    }

    //Setter exit for et rum, og giver døren en tilsvarende farve
    public void setExitWithColor(String direction, Room neighbor, String color) {
        exits.put(direction, neighbor);
        doors.add(new Door(direction, color));
    }

    public String getShortDescription() {
        return description;
    }

    public String getLongDescription() {
        return "" + description;
    }

    public Room getExit(String direction) {
        return exits.get(direction);
    }

    /*
     *Get item from the room
     */
    public Item getItem(int index) {
        return items.get(index);
    }

    /*
     *Get item from the room
     */
    public Item getItem(String itemName) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getDescription().equals(itemName)) {
                new GameUIController().setItem(items.get(i));
                return items.get(i);
            }
        }
        return null;
    }

    /*
     Remove items from the room
     */
    public void removeItem(String itemName) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getDescription().equals(itemName)) {
                items.remove(i);
            }
        }
        if (items.isEmpty()) {
            hasItems = false;
        }
    }

    public void removeItem(int index) {

        items.remove(index);

        if (items.isEmpty()) {
            hasItems = false;
        }
    }


    /*
     *Set a particular item in the room
     */
    public void setItem(Item newItem) {
        items.add(newItem);
        hasItems = true;
    }

    public void setKey(Key newKey) {
        items.add(newKey);
        hasItems = true;
    }

    /*
     * Get a description of the item in a room
     */
    public String getRoomItems() {

        String output = "";
        for (int i = 0; i < items.size(); i++) {
            output += items.get(i).getDescription() + " ";
        }
        return output;

    }

    public Door findDoor(String direction) {
        for (int i = 0; i < doors.size(); i++) {
            if (doors.get(i).getDirection().equals(direction)) {
                return doors.get(i);
            }
        }
        return null;
    }
//    
//    public String findDoorColor(String direction){
//        for (int i = 0; i < doors.size(); i++) {
//            if (doors.get(i).getDirection().equals(direction)) {
//                return doors.get(i).getColor();
//            }
//        }
//        return "none";
//    }

    public void setQuestion(int i) {
        roomQuestion = Puzzles.questions[i];
        this.question = true;
    }

    public void setQuestionFalse() {
        question = false;
    }

    public boolean hasQuestion() {
        return question;
    }

    public Question getQuestion() {
        return roomQuestion;
    }

    public void unlockAll() {
        for (int i = 0; i < doors.size(); i++) {
            if (doors.get(i).getLocked() == true) {
                doors.get(i).unlock();
            }
        }
        setSecondImage();

    }

    //checker om en nøgle i spillerens inventory passer til en dør i det nuværende rum
//    public void unlockDoor(String direction) {
//        if (findDoor(direction) != null) {
//            if (findDoor(direction).getColor() != null) {
//                String checkColor = findDoor(direction).getColor();
//                if (Inventory.checkInventoryForKey(checkColor) != null) {
//                    findDoor(direction).unlock();
//                } else {
//                    System.out.println("You don't have a key for this door");
//                }
//            } else {
//                System.out.println("There is no door that needs a key there");
//            }
//        } else {
//            System.out.println("There is no door there");
//        }
//    }
    public Image getImage() {
        return roomImage;
    }

    public void setVisited() {
        visited = true;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setDarkRoom() {
        darkRoom = true;
    }

    public boolean getDarkRoom() {
        return darkRoom;
    }

    public void setSecondImage() {
        roomImage = new Image(secondRoomImage, true);
    }
}
