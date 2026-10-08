import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

/** Calculate rectangle area and perimeter from non-negative dimensions. */
public class RectangleCalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.ROOT);
            System.out.print("Enter length and width: ");
            double length = input.nextDouble();
            double width = input.nextDouble();
            if (!Double.isFinite(length) || !Double.isFinite(width) || length < 0 || width < 0) {
                System.out.println("Dimensions must be finite and non-negative.");
                return;
            }

            // A rectangle has two pairs of equal sides.
            double area = length * width;
            double perimeter = 2 * (length + width);
            if (!Double.isFinite(area) || !Double.isFinite(perimeter)) {
                System.out.println("Result is too large.");
                return;
            }
            System.out.printf(Locale.ROOT, "Area: %.2f%nPerimeter: %.2f%n", area, perimeter);
        } catch (NoSuchElementException exception) {
            System.out.println("Invalid input.");
        }
    }
}
