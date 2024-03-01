import java.time.LocalDate;
import java.util.Scanner;

public class TestWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for bride's information
        System.out.println("Enter bride's first name:");
        String brideFirstName = scanner.nextLine();
        System.out.println("Enter bride's last name:");
        String brideLastName = scanner.nextLine();

        // Prompt user for groom's information
        System.out.println("Enter groom's first name:");
        String groomFirstName = scanner.nextLine();
        System.out.println("Enter groom's last name:");
        String groomLastName = scanner.nextLine();

        // Create Person objects for bride and groom
        Person bride = new Person(brideFirstName, brideLastName);
        Person groom = new Person(groomFirstName, groomLastName);

        // Create Couple object
        Couple couple = new Couple(bride, groom);

        // Prompt user for wedding details
        System.out.println("Enter wedding date (YYYY-MM-DD):");
        String weddingDateStr = scanner.nextLine();
        LocalDate weddingDate = LocalDate.parse(weddingDateStr);

        System.out.println("Enter wedding location:");
        String location = scanner.nextLine();

        // Create Wedding object
        Wedding wedding = new Wedding(couple, weddingDate, location);

        // Display wedding details
        System.out.println("Wedding details:");
        System.out.println("Bride: " + wedding.getCouple().getBride().getFirstName() + " " + wedding.getCouple().getBride().getLastName());
        System.out.println("Groom: " + wedding.getCouple().getGroom().getFirstName() + " " + wedding.getCouple().getGroom().getLastName());
        System.out.println("Wedding Date: " + wedding.getWeddingDate());
        System.out.println("Location: " + wedding.getLocation());

        scanner.close();
    }
}
