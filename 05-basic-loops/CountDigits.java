import java.util.NoSuchElementException;
import java.util.Scanner;

/** Count the base-10 digits in a signed 64-bit integer. */
public class CountDigits {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a whole number: ");
            long number = Long.parseLong(input.nextLine().trim());
            int count = 0;
            do {
                count++;
                number /= 10;
            } while (number != 0);
            System.out.println("Digit count: " + count);
        } catch (NoSuchElementException | NumberFormatException exception) {
            System.out.println("Invalid input. Enter an integer within the signed 64-bit range.");
        }
    }
}
