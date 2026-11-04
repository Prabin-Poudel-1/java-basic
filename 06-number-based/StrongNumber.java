import java.util.Scanner;

public class StrongNumber {
    private static int factorial(int digit) {
        int result = 1;
        for (int factor = 2; factor <= digit; factor++) {
            result *= factor;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative whole number: ");
        if (!input.hasNextInt()) {
            System.out.println("Please enter one non-negative 32-bit whole number.");
            return;
        }
        int number = input.nextInt();
        if (input.hasNext()) {
            System.out.println("Please enter only one whole number.");
            return;
        }
        if (number < 0) {
            System.out.println("The number must be non-negative.");
            return;
        }

        int remaining = number;
        long factorialSum = 0;
        do {
            factorialSum += factorial(remaining % 10);
            remaining /= 10;
        } while (remaining > 0);

        System.out.println(factorialSum == number
                ? "Strong number" : "Not a strong number");
    }
}
