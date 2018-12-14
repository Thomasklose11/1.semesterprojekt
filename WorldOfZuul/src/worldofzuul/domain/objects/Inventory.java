package worldofzuul.domain.objects;

import java.util.ArrayList;

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
    //Checks the items description are in the inventory, if the don't not exist it returns null 
    public static boolean checkInventoryForKey(String color) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i) instanceof Key) {
                if (((Key) inventory.get(i)).getColor().equals(color)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    //Checks the inventory for a String item, if the descriptions is equals, it return true.
    public static boolean checkInventoryForItem(String item) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getDescription().equals(item)) {
                return true;
            }
        }
        return false;
    }

    public static Item getItem(int i) {
        return inventory.get(i);
    }

    public static int getInvSize() {
        return inventory.size();
    }
}
