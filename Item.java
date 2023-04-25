import java.util.Scanner;

class Item {
    String itemName;
    int itemQuantity;

    public Item(String itemName, int itemQuantity) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
    }
}

class InventoryControlSystem extends Exception{
    static Item[] items;
    static int numOfItems;

    public InventoryControlSystem(int size) {
        items = new Item[size];
        numOfItems = 0;
    }

    public void addItem(String name, int quantity) {
        Item item = new Item(name, quantity);
        items[numOfItems++] = item;
    }

    public boolean checkItemAvailability(String name) {
        for (Item item : items) {
            if (item != null && item.itemName.equals(name) && item.itemQuantity > 0) {
                return true;
            }
        }
        return false;
    }

    public int getItemQuantity(String name) {
        for (Item item : items) {
            if (item != null && item.itemName.equals(name)) {
                return item.itemQuantity;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        InventoryControlSystem inventoryControl = new InventoryControlSystem(10);
        inventoryControl.addItem("Item1", 10);
        inventoryControl.addItem("Item2", 5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Inventory Control System!");
        System.out.println("Please enter your username and password to continue.");
        System.out.print("Username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Password: ");
        String passwordInput = scanner.nextLine();

        try {
            if (usernameInput.equals("admin") && passwordInput.equals("admin123"))   //admin login
                {
                int count=0;
                
                while(count<3)
                {
                System.out.println("Choose 1 for searching the products");
                System.out.println("Choose 2 for adding the products");
                System.out.println("Choose 3 for logging out");
      
                System.out.println("\nEnter your choice: ");
                int n=scanner.nextInt();
                
                if(n==1)
                {
                
                String searchItem = scanner.next();
                
                boolean itemAvailable = inventoryControl.checkItemAvailability(searchItem);
                if (itemAvailable) {
                    int itemQuantity = inventoryControl.getItemQuantity(searchItem);
                    System.out.println(searchItem + " is available with quantity: " + itemQuantity);
               
                }
                
                 else {
                    System.out.println(searchItem + " not found.");
             
                }}
                else if(n==2)
                {
System.out.println("Item to be added is: ");
scanner.nextLine();
                
                String searchItem = scanner.nextLine();

                if(searchItem.matches("Item1"))
                {
                System.out.println("Enter how many items to add: ");
                int n1=scanner.nextInt();
                int itemQuantity1 = inventoryControl.getItemQuantity(searchItem);
                items[0].itemQuantity=itemQuantity1 + n1;
                System.out.println("Item1 quantity is: "+items[0].itemQuantity);

                }
                else if(searchItem.matches("Item2"))
                {
                System.out.println("Enter how many items to add: ");
                int n1=scanner.nextInt();
                int itemQuantity1=inventoryControl.getItemQuantity(searchItem);
                items[1].itemQuantity=itemQuantity1+n1;
                System.out.println("Item2 quantity is: "+items[1].itemQuantity);
                }
                else
                {
                System.out.println("Invalid Input");
                }
}
else if(n==3)
{
System.out.println("You have successfully logged out");
count=count+3;
}
else
{
System.out.println("Invalid Input,try again");
}

            }count++;
                 
                
            } else if (usernameInput.equals("user") && passwordInput.equals("user123")) {{
                int count=0;
                
                while(count<3)
                {
                System.out.println("Choose 1 for searching the products");
                System.out.println("Choose 2 for withdrawing the products");
                System.out.println("Choose 3 for logging out");
      
                System.out.println("Enter your choice: ");
                int n=scanner.nextInt();
                
                if(n==1)
                {
                
                String searchItem = scanner.next();
                
                boolean itemAvailable = inventoryControl.checkItemAvailability(searchItem);
                if (itemAvailable) {
                    int itemQuantity = inventoryControl.getItemQuantity(searchItem);
                    System.out.println(searchItem + " is available with quantity: " + itemQuantity);
               
                }
                
                 else {
                    System.out.println(searchItem + " not found.");
             
                }}
                else if(n==2)
                {
System.out.println("The item to be withdrawn is: ");
scanner.nextLine();
                
                String searchItem = scanner.nextLine();

                if(searchItem.matches("Item1"))
                {
                System.out.println("Enter how many items to withdraw: ");
                int n1=scanner.nextInt();
                int itemQuantity1 = inventoryControl.getItemQuantity(searchItem);
                items[0].itemQuantity=itemQuantity1 - n1;
                System.out.println("Item1 quantity remaining is: "+items[0].itemQuantity);

                }
                else if(searchItem.matches("Item2"))
                {
                System.out.println("Enter how many items to withdraw: ");
                int n1=scanner.nextInt();
                int itemQuantity1=inventoryControl.getItemQuantity(searchItem);
                items[1].itemQuantity=itemQuantity1-n1;
                System.out.println("Item2 quantity remaining is: "+items[1].itemQuantity);
                }
                else
                {
                System.out.println("Invalid Input");
                }
}
else if(n==3)
{
System.out.println("You have successfully logged out");
count=count+3;
}
else
{
System.out.println("Invalid Input,try again");
}

            }count++;
                 
                
            }
            }  else {
                throw new Exception("Invalid username or password.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}