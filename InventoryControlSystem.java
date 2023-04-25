import java.util.Scanner;

public class InventoryControlSystem {
    
    private String[] itemName;
    private int[] itemQuantity;
    private int numOfItems;
    
    public InventoryControlSystem(int size) {
        itemName = new String[size];
        itemQuantity = new int[size];
        numOfItems = 0;
    }
    
    // Add an item to the inventory with the specified quantity
    public void addItem(String name, int quantity) {
        itemName[numOfItems] = name;
        itemQuantity[numOfItems] = quantity;
        numOfItems++;
    }
    
    // Check the availability status of an item
    public boolean checkItemAvailability(String name) {
        for (int i = 0; i < numOfItems; i++) {
            if (itemName[i].equals(name) && itemQuantity[i] > 0) {
                return true;
            }
        }
        return false;
    }
    
    // Get the quantity of an item in the inventory
    public int getItemQuantity(String name) {
        for (int i = 0; i < numOfItems; i++) {
            if (itemName[i].equals(name)) {
                return itemQuantity[i];
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        // Create an instance of the inventory control system with a capacity of 10 items
        InventoryControlSystem inventoryControl = new InventoryControlSystem(10);
        
        // Add some items to the inventory
        inventoryControl.addItem("Item1", 10);
        inventoryControl.addItem("Item2", 5);
        
        // Admin and User login details
        String adminUsername = "admin";
        String adminPassword = "admin123";
        String userUsername = "user";
        String userPassword = "user123";
        
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Login prompt
        System.out.println("Welcome to the Inventory Control System!");
        System.out.println("Please enter your username and password to continue.");
        System.out.print("Username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Password: ");
        String passwordInput = scanner.nextLine();
        
        if (usernameInput.equals(adminUsername) && passwordInput.equals(adminPassword)) {
            // Admin searches for an item in the inventory
            String searchItem = "Item1";
            boolean itemAvailable = inventoryControl.checkItemAvailability(searchItem);
            if (itemAvailable) {
                int itemQuantity = inventoryControl.getItemQuantity(searchItem);
                System.out.println(searchItem + " is available with quantity: " + itemQuantity);
            } else {
                System.out.println(searchItem + " not found.");
            }
        } else if (usernameInput.equals(userUsername) && passwordInput.equals(userPassword)) {
            // User searches for an item in the inventory
            String searchItem = "Item2";
            boolean itemAvailable = inventoryControl.checkItemAvailability(searchItem);
            if (itemAvailable) {
                int itemQuantity = inventoryControl.getItemQuantity(searchItem);
                System.out.println(searchItem + " is available with quantity: " + itemQuantity);
            } else {
                System.out.println(searchItem + " not found.");
            }
        } else {
            System.out.println("Invalid username or password. Access denied.");
        }
    }
}