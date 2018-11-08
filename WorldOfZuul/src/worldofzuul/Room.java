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
    ArrayList<String> lockedDoors = new ArrayList<>();

    private int bonus = 0;

    public Room(String description) {
        this.description = description;
        exits = new HashMap<String, Room>();
    }

    public void setExit(String direction, Room neighbor) {
        exits.put(direction, neighbor);
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

    //Add locked rooms
    public void lockNorth() {
        lockedDoors.add("north");
    }

    public void lockSouth() {
        lockedDoors.add("south");
    }

    public void lockEast() {
        lockedDoors.add("east");
    }

    public void lockWest() {
        lockedDoors.add("west");
    }

    //Remove locked rooms    
    public void unlockNorth() {
        lockedDoors.remove("north");
    }

    public void unlockSouth() {
        lockedDoors.remove("south");
    }

    public void unlockEast() {
        lockedDoors.remove("east");
    }

    public void unlockWest() {
        lockedDoors.remove("west");
    }
}
