import java.util.NoSuchElementException;
import java.util.Scanner;

/** Practice an age-only eligibility check with a threshold of 18. */
public class VotingEligibility {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter age in whole years: ");
            long age = Long.parseLong(input.nextLine().trim());
            if (age < 0) {
                System.out.println("Age cannot be negative.");
                return;
            }

            // Example exercise rule: eligible by age when at least 18.
            final int minimumAge = 18;
            if (age >= minimumAge) {
                System.out.println("Eligible by age.");
            } else {
                System.out.println("Not eligible by age.");
            }
        } catch (NoSuchElementException | NumberFormatException exception) {
            System.out.println("Invalid input. Enter one whole age within the signed 64-bit range.");
        }
    }
}
