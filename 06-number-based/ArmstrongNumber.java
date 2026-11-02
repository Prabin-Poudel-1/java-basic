import java.util.NoSuchElementException;
import java.util.Scanner;

/** Check whether a non-negative integer equals the sum of its digit powers. */
public class ArmstrongNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a non-negative whole number: ");
            long number = Long.parseLong(input.nextLine().trim());
            if (number < 0) {
                System.out.println("Number must be non-negative.");
                return;
            }
            int digits = 0;
            long countCopy = number;
            do {
                digits++;
                countCopy /= 10;
            } while (countCopy != 0);

            long sum = 0;
            long remaining = number;
            do {
                int digit = (int) (remaining % 10);
                long power = 1;
                for (int i = 0; i < digits; i++) {
                    if (digit != 0 && power > number / digit) {
                        System.out.println("Not an Armstrong number.");
                        return;
                    }
                    power *= digit;
                }
                if (power > number - sum) {
                    System.out.println("Not an Armstrong number.");
                    return;
                }
                sum += power;
                remaining /= 10;
            } while (remaining != 0);
            System.out.println(sum == number ? "Armstrong number." : "Not an Armstrong number.");
        } catch (NoSuchElementException | NumberFormatException exception) {
            System.out.println("Invalid input. Enter an integer within the signed 64-bit range.");
        }
    }
}
