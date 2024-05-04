import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter up to 20 double values (type 'done' when finished):");

        // Create an array to store the double values
        double[] numbers = new double[20];
        int count = 0;

        // Read input from the user until they type 'done' or reach the limit of 20 values
        while (count < 20) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                // Parse the input into a double and store it in the array
                double number = Double.parseDouble(input);
                numbers[count] = number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid double value or 'done' to finish.");
            }
        }

        // Display the entered numbers
        System.out.println("Entered numbers:");
        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }
    }
}
