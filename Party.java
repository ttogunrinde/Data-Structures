
import java.util.Scanner;

public class Party {
    private int numberOfGuests;

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void displayInvitation() {
        System.out.println("Please come to my party!");
    }
}

