import java.util.NoSuchElementException;
import java.util.Scanner;

/** Determine whether a signed 64-bit integer is even or odd. */
public class EvenOddChecker {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter one whole number: ");
            long number = Long.parseLong(input.nextLine().trim());
            // A remainder of zero means the number is divisible by two.
            if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } catch (NoSuchElementException | NumberFormatException exception) {
            System.out.println("Invalid input. Enter one integer within the signed 64-bit range.");
        }
    }
}
