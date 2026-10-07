import java.util.Locale;
import java.util.Scanner;

/** Convert Celsius and Fahrenheit in both directions. */
public class TemperatureConverter {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.ROOT);
            System.out.print("Enter the source unit (C or F) and temperature: ");
        String unit = input.next().toUpperCase(Locale.ROOT);
        double temperature = input.nextDouble();
        if (unit.equals("C")) {
            double fahrenheit = temperature * 9.0 / 5.0 + 32;
            System.out.printf(Locale.ROOT, "Fahrenheit: %.2f%n", fahrenheit);
        } else if (unit.equals("F")) {
            double celsius = (temperature - 32) * 5.0 / 9.0;
            System.out.printf(Locale.ROOT, "Celsius: %.2f%n", celsius);
        } else {
            System.out.println("Unsupported unit. Use C or F.");
        }
        } catch (java.util.NoSuchElementException
                 | NumberFormatException exception) {
            System.out.println("Invalid input.");
        }
    }
}
