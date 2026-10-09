import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

/** Calculate compound interest assuming annual compounding. */
public class CompoundInterest {
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

            // Annual compounding: amount = principal * (1 + rate / 100) ^ years.
            double amount = principal == 0 ? 0 : principal * Math.pow(1 + rate / 100.0, years);
            double interest = amount - principal;
            if (!Double.isFinite(amount) || !Double.isFinite(interest)) {
                System.out.println("Result is too large.");
                return;
            }
            System.out.printf(Locale.ROOT, "Compound interest: %.2f%nTotal amount: %.2f%n", interest, amount);
        } catch (NoSuchElementException exception) {
            System.out.println("Invalid input.");
        }
    }
}
