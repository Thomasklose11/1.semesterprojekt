package worldofzuul;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class Room {

    private String description;
    private HashMap<String, Room> exits;
    ArrayList<Item> items = new ArrayList<>();

    boolean hasItems;

    private boolean question = false;
    private Question roomQuestion;

    ArrayList<Door> doors = new ArrayList<>();

    private int bonus = 0;

    public Room(String description) {
        this.description = description;
        exits = new HashMap<String, Room>();
    }

    public void setExit(String direction, Room neighbor) {
        exits.put(direction, neighbor);
        doors.add(new Door(direction));
    }

    public String getShortDescription() {
        return description;
    }

    public String getLongDescription() {
        return "" + description + ".\n" + getExitString();
    }

    private String getExitString() {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for (String exit : keys) {
            returnString += " " + exit;
        }
        if (hasItems) {
            returnString += "\nItems in the room: ";
            returnString += getRoomItems();
        }

        if (bonus == 1) {
            returnString += "\nThere is a treasure here!";
        } else if (bonus == 2) {
            returnString += "\nThere is a grand treasure here!";
        }

        if (hasQuestion() == true) {
            returnString += "/n";
            returnString += roomQuestion.getPrompt();
        }
        return returnString;
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

    /*
     *Set a particular item in the room
     */
    public void setItem(Item newItem) {
        items.add(newItem);
        hasItems = true;
    }

    /*
     * Get a description of the ithem in a room
     */
    public String getRoomItems() {

        String output = "";
        for (int i = 0; i < items.size(); i++) {
            output += items.get(i).getDescription() + " ";
        }
        return output;

    }

    // Get the type of bonus from this room ( 0 = no bonus, 1 = bonus, 2 = bonus+)
    public int getBonus() {
        return bonus;
    }

    public void setBonus0() {
        bonus = 0;
    }

    public void setBonus1() {
        bonus = 1;
    }

    public void setBonus2() {
        bonus = 2;
    }

    public Door findDoor(String direction) {
        for (int i = 0; i < doors.size(); i++) {
            if (doors.get(i).getDirection().equals(direction)) {
                return doors.get(i);
            }
        }

        return null;
    }

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

    public void unlock() {
        for (int i = 0; i < doors.size(); i++) {
            if (doors.get(i).getLocked() == true) {
                doors.get(i).unlock();
            }
        }
    }
}
