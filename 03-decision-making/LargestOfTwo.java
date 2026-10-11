import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

/** Find the larger of two finite numbers using if/else. */
public class LargestOfTwo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.ROOT);
            System.out.print("Enter two numbers: ");
            double first = input.nextDouble();
            double second = input.nextDouble();
            if (!Double.isFinite(first) || !Double.isFinite(second)) {
                System.out.println("Enter finite numbers.");
                return;
            }

            if (first > second) {
                System.out.println("Largest: " + first);
            } else if (second > first) {
                System.out.println("Largest: " + second);
            } else {
                System.out.println("Both numbers are equal.");
            }
        } catch (NoSuchElementException exception) {
            System.out.println("Invalid input.");
        }
    }
}
