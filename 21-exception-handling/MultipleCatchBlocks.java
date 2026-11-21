import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter dividend and divisor: ");
        if (!input.hasNext()) {
            System.out.println("Please enter two numbers.");
            return;
        }
        String dividendText = input.next();
        if (!input.hasNext()) {
            System.out.println("Please enter two numbers.");
            return;
        }
        String divisorText = input.next();
        if (input.hasNext()) {
            System.out.println("Enter exactly two numbers.");
            return;
        }

        final double dividend;
        final double divisor;
        try {
            dividend = Double.parseDouble(dividendText);
            divisor = Double.parseDouble(divisorText);
        } catch (NumberFormatException error) {
            System.out.println("Both values must be numbers.");
            return;
        }
        if (!Double.isFinite(dividend) || !Double.isFinite(divisor)) {
            System.out.println("Both values must be finite numbers.");
            return;
        }

        try {
            if (divisor == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            double result = dividend / divisor;
            if (!Double.isFinite(result)) {
                throw new ArithmeticException("The result is too large to display.");
            }
            System.out.printf("Result: %.2f%n", result);
        } catch (ArithmeticException error) {
            System.out.println(error.getMessage());
        }
    }
}
