package worldofzuul.domain;

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

    //Checker om en item med en given description ligger i inventory, returner null hvis item ikke findes.
    public static Item checkInventoryForKey(String color) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i) instanceof Key) {
                if (((Key)inventory.get(i)).getColor().equals(color)) {
                    return inventory.get(i);
                }
            }
        }
        return null;
    }
    public static Item getItem(int i){
        return inventory.get(i);
    }
}
