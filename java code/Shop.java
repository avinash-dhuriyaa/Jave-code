import java.util.Scanner;

public class Shop {
    // The main method is the entry point of the program
    public static void main(String[] args) {
        // Create a new instance of the Scanner class for reading input
        Scanner scanner = new Scanner(System.in);

        // Initialize variables for tracking the inventory
        String[] items = { "apple", "banana", "orange" };
        int[] prices = { 100, 50, 75 };
        int[] quantities = { 5, 5, 5 };

        // Print a welcome message and the list of items for sale
        System.out.println("Welcome to the shop!");
        System.out.println("We have the following items for sale: ");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " for " + prices[i] + " each");
        }

        // Print the total inventory value
        int totalInventoryValue = 0;
        for (int i = 0; i < items.length; i++) {
            totalInventoryValue += prices[i] * quantities[i];
        }
        System.out.println("The total value of the inventory is " + totalInventoryValue);

        // Loop until the user decides to exit
        while (true) {
            // Print the main menu
            System.out.println("What would you like to do?");
            System.out.println("1. Buy an item");
            System.out.println("2. Check inventory");
            System.out.println("3. Exit");

            // Read the user's input
            int choice = scanner.nextInt();

            // Act on the user's choice
            if (choice == 1) {
                // Prompt the user to enter the index of the item they want to buy
                System.out.println("Enter the index of the item you want to buy:");
                int itemIndex = scanner.nextInt();

                // Check if the item is in stock
                if (quantities[itemIndex] > 0) {
                    // Decrement the quantity of the item
                    quantities[itemIndex]--;

                    // Calculate the cost of the purchase
                    int cost = prices[itemIndex];

                    // Print the purchase information
                    System.out.println("You bought 1 " + items[itemIndex] + " for " + cost);
                } else {
                    // Print a message if the item is out of stock
                    System.out.println("Sorry, that item is out of stock");
                }
            } else if (choice == 2) {
                // Print the current quantities of each item
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i] + ": " + quantities[i] + " remaining");
                }
            } else if (choice == 3) {
                // Exit the program
                break;
            } else {
                // Print a message for invalid input
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}