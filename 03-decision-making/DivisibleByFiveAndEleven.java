import java.util.NoSuchElementException;
import java.util.Scanner;

/** Check whether a signed 64-bit integer is divisible by both 5 and 11. */
public class DivisibleByFiveAndEleven {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter one whole number: ");
            long number = Long.parseLong(input.nextLine().trim());
            // Both remainders must be zero; && requires both conditions.
            if (number % 5 == 0 && number % 11 == 0) {
                System.out.println("Divisible by both 5 and 11.");
            } else {
                System.out.println("Not divisible by both 5 and 11.");
            }
        } catch (NoSuchElementException | NumberFormatException exception) {
            System.out.println("Invalid input. Enter one integer within the signed 64-bit range.");
        }
    }
}
