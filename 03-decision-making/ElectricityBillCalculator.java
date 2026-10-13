import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

/** Practice a progressive electricity bill calculation using fictional rates. */
public class ElectricityBillCalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter units consumed: ");
            double units = Double.parseDouble(input.nextLine().trim());
            if (!Double.isFinite(units) || units < 0) {
                System.out.println("Units must be finite and non-negative.");
                return;
            }

            // Example rates per unit: first 100 at 1.50, next 100 at 2.50, rest at 4.00.
            double bill;
            if (units <= 100) {
                bill = units * 1.50;
            } else if (units <= 200) {
                bill = 100 * 1.50 + (units - 100) * 2.50;
            } else {
                bill = 100 * 1.50 + 100 * 2.50 + (units - 200) * 4.00;
            }
            if (!Double.isFinite(bill)) {
                System.out.println("Bill is too large.");
                return;
            }
            System.out.printf(Locale.ROOT, "Example bill: %.2f currency units%n", bill);
        } catch (NoSuchElementException | NumberFormatException exception) {
            System.out.println("Invalid input.");
        }
    }
}
