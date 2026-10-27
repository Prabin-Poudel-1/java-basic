import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

/** Calculate rectangle, circle, or triangle area using a switch. */
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.ROOT);
            System.out.println("1. Rectangle\n2. Circle\n3. Triangle");
            System.out.print("Choose a shape: ");
            int choice = Integer.parseInt(input.nextLine().trim());
            double area;
            switch (choice) {
                case 1: {
                    System.out.print("Enter length and width: ");
                    double length = input.nextDouble();
                    double width = input.nextDouble();
                    if (!Double.isFinite(length) || !Double.isFinite(width) || length < 0 || width < 0) {
                        System.out.println("Dimensions must be finite and non-negative.");
                        return;
                    }
                    area = length * width;
                    break;
                }
                case 2: {
                    System.out.print("Enter radius: ");
                    double radius = input.nextDouble();
                    if (!Double.isFinite(radius) || radius < 0) {
                        System.out.println("Radius must be finite and non-negative.");
                        return;
                    }
                    area = Math.PI * radius * radius;
                    break;
                }
                case 3: {
                    System.out.print("Enter base and height: ");
                    double base = input.nextDouble();
                    double height = input.nextDouble();
                    if (!Double.isFinite(base) || !Double.isFinite(height) || base < 0 || height < 0) {
                        System.out.println("Dimensions must be finite and non-negative.");
                        return;
                    }
                    area = 0.5 * base * height;
                    break;
                }
                default:
                    System.out.println("Invalid shape choice.");
                    return;
            }
            if (!Double.isFinite(area)) {
                System.out.println("Area is too large.");
                return;
            }
            System.out.printf(Locale.ROOT, "Area: %.2f%n", area);
        } catch (NoSuchElementException | NumberFormatException exception) {
            System.out.println("Invalid input.");
        }
    }
}
