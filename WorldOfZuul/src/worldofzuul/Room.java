package worldofzuul;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class Room {

    private String description;
    private HashMap<String, Room> exits;
    ArrayList<Item> items = new ArrayList<Item>();

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
        returnString += "\nItems in the room: \n";
        returnString += getRoomItems();
        if (bonus == 1) {
            returnString += "\nThere is Treasure here!";
        } else if (bonus == 2) {
            returnString += "\nThere is Grand Treasure here!";
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

    }

    /*
     *Set a particular item in the room
     */
    public void setItem(Item newItem) {
        items.add(newItem);
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
}
