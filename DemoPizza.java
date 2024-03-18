import java.util.Scanner;

public class DemoPizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] toppings = new String[10];
        int numToppings = 0;

        System.out.println("Enter pizza toppings (enter QUIT to finish or reach 10 toppings):");
        while (numToppings < 10) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("QUIT")) {
                break;
            }
            toppings[numToppings++] = input;
        }

        System.out.println("Do you want delivery? (yes/no):");
        String deliveryChoice = scanner.nextLine();

        if (deliveryChoice.equalsIgnoreCase("yes")) {
            System.out.println("Enter delivery address:");
            String deliveryAddress = scanner.nextLine();
            DeliveryPizza deliveryPizza = new DeliveryPizza(toppings, deliveryAddress, numToppings);
            System.out.println(deliveryPizza);
        } else {
            Pizza pizza = new Pizza(toppings, numToppings);
            System.out.println(pizza);
        }

        scanner.close();
    }
}
