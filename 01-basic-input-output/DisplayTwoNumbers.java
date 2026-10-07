import java.util.Locale;
import java.util.Scanner;

/** Input and display two numbers. */
public class DisplayTwoNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.ROOT);
            System.out.print("Enter two numbers: ");
        double first = input.nextDouble();
        double second = input.nextDouble();
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);
        } catch (java.util.NoSuchElementException
                 | NumberFormatException exception) {
            System.out.println("Invalid input.");
        }
    }
}
