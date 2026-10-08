import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

/** Calculate circle area and circumference from non-negative dimensions. */
public class CircleCalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.ROOT);
            System.out.print("Enter radius: ");
            double radius = input.nextDouble();
            if (!Double.isFinite(radius) || radius < 0) {
                System.out.println("Radius must be finite and non-negative.");
                return;
            }

            // Area = pi * r squared; circumference = 2 * pi * r.
            double area = Math.PI * radius * radius;
            double circumference = 2 * Math.PI * radius;
            if (!Double.isFinite(area) || !Double.isFinite(circumference)) {
                System.out.println("Result is too large.");
                return;
            }
            System.out.printf(Locale.ROOT, "Area: %.2f%nCircumference: %.2f%n", area, circumference);
        } catch (NoSuchElementException exception) {
            System.out.println("Invalid input.");
        }
    }
}
