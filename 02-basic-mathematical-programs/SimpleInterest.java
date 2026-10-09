import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

/** Calculate simple interest from principal, annual percentage rate, and years. */
public class SimpleInterest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.ROOT);
            System.out.print("Enter principal, annual rate (%), and time (years): ");
            double principal = input.nextDouble();
            double rate = input.nextDouble();
            double years = input.nextDouble();
            if (!Double.isFinite(principal) || !Double.isFinite(rate) || !Double.isFinite(years)
                    || principal < 0 || rate < 0 || years < 0) {
                System.out.println("Inputs must be finite and non-negative.");
                return;
            }

            // Simple interest does not earn additional interest on previous interest.
            double interest = principal * (rate / 100.0) * years;
            double total = principal + interest;
            if (!Double.isFinite(interest) || !Double.isFinite(total)) {
                System.out.println("Result is too large.");
                return;
            }
            System.out.printf(Locale.ROOT, "Simple interest: %.2f%nTotal amount: %.2f%n", interest, total);
        } catch (NoSuchElementException exception) {
            System.out.println("Invalid input.");
        }
    }
}
