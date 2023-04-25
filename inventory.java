import java.util.HashMap;

public class InventoryControlSystem {
    
    private HashMap<String, Integer> inventory;
    
    public InventoryControlSystem() {
        inventory = new HashMap<String, Integer>();
    }
    
    // Add an item to the inventory with the specified quantity
    public void addItem(String itemName, int quantity) {
        inventory.put(itemName, quantity);
    }
    
    // Check the availability status of an item
    public boolean checkItemAvailability(String itemName) {
        if (inventory.containsKey(itemName) && inventory.get(itemName) > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    // Get the quantity of an item in the inventory
    public int getItemQuantity(String itemName) {
        if (inventory.containsKey(itemName)) {
            return inventory.get(itemName);
        } else {
            return 0;
        }
    }
    
    public static void main(String[] args) {
        // Create an instance of the inventory control system
        InventoryControlSystem inventoryControl = new InventoryControlSystem();
        
        // Add some items to the inventory
        inventoryControl.addItem("Item1", 10);
        inventoryControl.addItem("Item2", 5);
        
        // Admin searches for an item in the inventory
        String searchItem = "Item1";
        boolean itemAvailable = inventoryControl.checkItemAvailability(searchItem);
        if (itemAvailable) {
            int itemQuantity = inventoryControl.getItemQuantity(searchItem);
            System.out.println(searchItem + " is available with quantity: " + itemQuantity);
        } else {
            System.out.println(searchItem + " not found.");
        }
    }
}