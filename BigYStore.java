import java.util.Scanner;

public class BigYStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to BigY Store Pizza Ordering System!");

        // Display menu
        System.out.println("\nPizza Menu:");
        System.out.println("1. Small Pizza ($5)");
        System.out.println("2. Medium Pizza ($10)");
        System.out.println("3. Large Pizza ($15)");
        System.out.println("4. Super Pizza ($20)");

        // Prompt user to select pizza size
        System.out.print("\nEnter your choice (1-4): ");
        int choice = scanner.nextInt();

        // Calculate price based on pizza size
        double price = 0;
        switch (choice) {
            case 1:
                price = 5;
                break;
            case 2:
                price = 10;
                break;
            case 3:
                price = 15;
                break;
            case 4:
                price = 20;
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                return;
        }

        // Prompt user to select toppings
        System.out.println("\nToppings Menu:");
        System.out.println("1. Pepperoni ($0.50)");
        System.out.println("2. Mushrooms ($0.50)");
        System.out.println("3. Olives ($0.50)");
        System.out.println("4. Sausage ($0.50)");
        System.out.println("5. Peppers ($0.50)");
        System.out.println("6. Extra Cheese (No additional charge)");

        System.out.print("Enter number of toppings (max 3): ");
        int numToppings = scanner.nextInt();

        // Calculate additional charge for toppings
        double additionalCharge = 0;
        if (numToppings == 1) {
            additionalCharge = 0.50;
        } else if (numToppings == 2) {
            additionalCharge = 1.00;
        } else if (numToppings == 3) {
            additionalCharge = 1.25;
        }

        // Calculate total price
        price += additionalCharge;

        System.out.println("\nYour total price is: $" + price);

        // Thank the customer
        System.out.println("\nThank you for ordering from BigY Store!");
    }
}
