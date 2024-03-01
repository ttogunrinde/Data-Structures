// UseDinnerParty.java
import java.util.Scanner;

public class UseDinnerParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Party aParty = new Party();

        // Party
        System.out.print("Enter number of guests for the party >> ");
        int numberOfGuestsParty = scanner.nextInt();
        aParty.setNumberOfGuests(numberOfGuestsParty);
        System.out.println("The party has " + aParty.getNumberOfGuests() + " guests");
        aParty.displayInvitation();

        // DinnerParty
        DinnerParty aDinnerParty = new DinnerParty();

        System.out.print("Enter number of guests for the dinner party >> ");
        int numberOfGuestsDinner = scanner.nextInt();
        aDinnerParty.setNumberOfGuests(numberOfGuestsDinner);

        System.out.print("Enter the menu option -- 1 for Steak and Rice or 2 for Tofu and Rice >> ");
        int menuOption = scanner.nextInt();
        aDinnerParty.setDinnerChoice(menuOption);

        System.out.println("The dinner party has " + aDinnerParty.getNumberOfGuests() + " guests");
        System.out.println("Menu option " + aDinnerParty.getDinnerChoice() + " will be served");
        aDinnerParty.displayInvitation();

        scanner.close();
    }
}
