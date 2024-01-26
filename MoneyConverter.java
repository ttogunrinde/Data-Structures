import java.util.Scanner;

public class MoneyConverter {

    public static void convertToCoins(double amount) {
        int totalCents = (int) (amount * 100);
        int remainingAmount = totalCents;

        int quarters = remainingAmount / 25;
        remainingAmount %= 25;

        int dimes = remainingAmount / 10;
        remainingAmount %= 10;

        int nickels = remainingAmount / 5;
        remainingAmount %= 5;

        int pennies = remainingAmount;

        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the financial amount: $");
        double userAmount = scanner.nextDouble();

        convertToCoins(userAmount);
    }
}
