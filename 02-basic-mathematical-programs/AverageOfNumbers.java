import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

/** Calculate the arithmetic mean of a user-specified number of values. */
public class AverageOfNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.ROOT);
            System.out.print("Enter count on its own line: ");
            int count = Integer.parseInt(input.nextLine().trim());
            if (count <= 0) {
                System.out.println("Count must be positive.");
                return;
            }

            System.out.println("Enter " + count + " numbers:");
            double sum = 0;
            for (int i = 0; i < count; i++) {
                double value = input.nextDouble();
                if (!Double.isFinite(value)) {
                    System.out.println("Numbers must be finite.");
                    return;
                }
                sum += value;
                if (!Double.isFinite(sum)) {
                    System.out.println("Sum is too large.");
                    return;
                }
            }

            // Arithmetic mean = sum of all values divided by their count.
            double average = sum / count;
            System.out.printf(Locale.ROOT, "Average: %.2f%n", average);
        } catch (NoSuchElementException | NumberFormatException exception) {
            System.out.println("Invalid input.");
        }
    }
}
