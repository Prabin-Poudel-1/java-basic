import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter dividend and divisor: ");
        if (!input.hasNextDouble()) {
            System.out.println("Please enter two finite numbers.");
            return;
        }
        double dividend = input.nextDouble();
        if (!input.hasNextDouble()) {
            System.out.println("Please enter two finite numbers.");
            return;
        }
        double divisor = input.nextDouble();
        if (input.hasNext() || !Double.isFinite(dividend) || !Double.isFinite(divisor)) {
            System.out.println("Please enter two finite numbers.");
            return;
        }

        try {
            if (divisor == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            System.out.printf("Result: %.2f%n", dividend / divisor);
        } catch (ArithmeticException error) {
            System.out.println(error.getMessage());
        }
    }
}
