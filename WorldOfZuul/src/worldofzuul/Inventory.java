package worldofzuul;

import java.util.ArrayList;

/**
 *
 * @author Rene_
 */
public class Inventory {
    // Inventory list
    private static ArrayList<Item> inventory = new ArrayList<>();   
    
    // Add a Item to the inventory
    public static void addToInventory(Item item) {
        inventory.add(item);
    }
    
    public static ArrayList<Item> getInventory() {
        return inventory;
    }
}
