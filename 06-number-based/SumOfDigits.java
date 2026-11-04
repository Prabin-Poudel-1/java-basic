import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a signed whole number: ");
        if (!input.hasNextLong()) {
            System.out.println("Please enter one signed 64-bit whole number.");
            return;
        }
        long number = input.nextLong();
        if (input.hasNext()) {
            System.out.println("Please enter only one whole number.");
            return;
        }

        long remaining = number;
        long sum = 0;
        do {
            sum += Math.abs(remaining % 10);
            remaining /= 10;
        } while (remaining != 0);
        System.out.println("Sum of digits: " + sum);
    }
}
