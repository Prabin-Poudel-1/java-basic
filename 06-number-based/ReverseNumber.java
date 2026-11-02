import java.util.NoSuchElementException;
import java.util.Scanner;

/** Reverse the decimal digits of a signed 64-bit integer. */
public class ReverseNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a whole number: ");
            long number = Long.parseLong(input.nextLine().trim());
            long remaining = number;
            long reversed = 0;
            while (remaining != 0) {
                long digit = remaining % 10;
                if (reversed > Long.MAX_VALUE / 10 || (reversed == Long.MAX_VALUE / 10 && digit > 7)
                        || reversed < Long.MIN_VALUE / 10 || (reversed == Long.MIN_VALUE / 10 && digit < -8)) {
                    System.out.println("Reversed number is outside the signed 64-bit range.");
                    return;
                }
                reversed = reversed * 10 + digit;
                remaining /= 10;
            }
            System.out.println("Reversed: " + reversed);
        } catch (NoSuchElementException | NumberFormatException exception) {
            System.out.println("Invalid input. Enter an integer within the signed 64-bit range.");
        }
    }
}
