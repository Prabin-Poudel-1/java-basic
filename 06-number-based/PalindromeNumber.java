import java.util.NoSuchElementException;
import java.util.Scanner;

/** Check whether a non-negative integer reads the same in reverse. */
public class PalindromeNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a non-negative whole number: ");
            long number = Long.parseLong(input.nextLine().trim());
            if (number < 0) {
                System.out.println("Not a palindrome.");
                return;
            }
            if (number != 0 && number % 10 == 0) {
                System.out.println("Not a palindrome.");
                return;
            }
            long remaining = number;
            long reversedHalf = 0;
            while (remaining > reversedHalf) {
                reversedHalf = reversedHalf * 10 + remaining % 10;
                remaining /= 10;
            }
            boolean palindrome = remaining == reversedHalf || remaining == reversedHalf / 10;
            System.out.println(palindrome ? "Palindrome." : "Not a palindrome.");
        } catch (NoSuchElementException | NumberFormatException exception) {
            System.out.println("Invalid input. Enter an integer within the signed 64-bit range.");
        }
    }
}
