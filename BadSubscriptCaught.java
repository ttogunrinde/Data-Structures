import java.util.Scanner;

public class BadSubscriptCaught {
    public static void main(String[] args) {
        String[] firstNames = {"John", "Emma", "Michael", "Sophia", "William", "Olivia", "James", "Amelia", "Benjamin", "Isabella"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position to retrieve the name (0-9): ");
        try {
            int index = scanner.nextInt();
            System.out.println("Name at position " + index + ": " + firstNames[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Out of bounds. Please enter a valid index (0-9).");
        }
    }
}
