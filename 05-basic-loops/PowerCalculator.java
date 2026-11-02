import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

/** Raise a finite double base to an integer exponent using a loop. */
public class PowerCalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.ROOT);
            System.out.print("Enter base and integer exponent (-1024 to 1024): ");
            double base = input.nextDouble();
            int exponent = input.nextInt();
            if (!Double.isFinite(base)) {
                System.out.println("Base must be finite.");
                return;
            }
            if (exponent < -1024 || exponent > 1024) {
                System.out.println("Exponent must be between -1024 and 1024.");
                return;
            }
            if (base == 0 && exponent < 0) {
                System.out.println("Zero cannot have a negative exponent.");
                return;
            }
            double result = 1;
            int repetitions = Math.abs(exponent);
            for (int i = 0; i < repetitions; i++) {
                result *= base;
            }
            if (exponent < 0) result = 1 / result;
            if (!Double.isFinite(result)) {
                System.out.println("Result is too large.");
                return;
            }
            System.out.printf(Locale.ROOT, "Result: %.10g%n", result);
        } catch (NoSuchElementException exception) {
            System.out.println("Invalid input.");
        }
    }
}
