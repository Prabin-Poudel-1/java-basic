import java.util.NoSuchElementException;
import java.util.Scanner;

/** Check whether a positive year is a leap year using the Gregorian rule. */
public class LeapYearChecker {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a positive year: ");
            long year = Long.parseLong(input.nextLine().trim());
            if (year <= 0) {
                System.out.println("Year must be positive.");
                return;
            }

            // Century years must be divisible by 400; other years by 4.
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
            }
        } catch (NoSuchElementException | NumberFormatException exception) {
            System.out.println("Invalid input. Enter one whole year within the signed 64-bit range.");
        }
    }
}
