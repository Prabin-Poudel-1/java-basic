import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

/** Find the largest of three finite numbers using if/else. */
public class LargestOfThree {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.ROOT);
            System.out.print("Enter three numbers: ");
            double first = input.nextDouble();
            double second = input.nextDouble();
            double third = input.nextDouble();
            if (!Double.isFinite(first) || !Double.isFinite(second) || !Double.isFinite(third)) {
                System.out.println("Enter finite numbers.");
                return;
            }

            // >= handles ties without losing a shared maximum.
            double largest;
            if (first >= second && first >= third) {
                largest = first;
            } else if (second >= first && second >= third) {
                largest = second;
            } else {
                largest = third;
            }
            System.out.println("Largest: " + largest);
        } catch (NoSuchElementException exception) {
            System.out.println("Invalid input.");
        }
    }
}
