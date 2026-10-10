import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

/** Classify a finite number as positive, negative, or zero using if/else. */
public class NumberSign {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.ROOT);
            System.out.print("Enter a number: ");
            double number = input.nextDouble();
            if (!Double.isFinite(number)) {
                System.out.println("Enter a finite number.");
                return;
            }

            if (number > 0) {
                System.out.println("Positive");
            } else if (number < 0) {
                System.out.println("Negative");
            } else {
                // Both 0.0 and -0.0 compare equal to zero.
                System.out.println("Zero");
            }
        } catch (NoSuchElementException exception) {
            System.out.println("Invalid input.");
        }
    }
}
