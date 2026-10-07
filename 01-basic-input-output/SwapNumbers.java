import java.util.Locale;
import java.util.Scanner;

/** Swap two numbers using a temporary variable. */
public class SwapNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.ROOT);
            System.out.print("Enter two numbers: ");
        double first = input.nextDouble();
        double second = input.nextDouble();
        System.out.println("Before swap: " + first + " " + second);
        double temporary = first;
        first = second;
        second = temporary;
        System.out.println("After swap: " + first + " " + second);
        } catch (java.util.NoSuchElementException
                 | NumberFormatException exception) {
            System.out.println("Invalid input.");
        }
    }
}
