import java.util.NoSuchElementException;
import java.util.Scanner;

/** Calculate the sum of integers from 1 through n. */
public class SumOneToN {
    private static final long MAX_N = 4_294_967_295L;

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter n (0 to " + MAX_N + "): ");
            long n = Long.parseLong(input.nextLine().trim());
            if (n < 0 || n > MAX_N) {
                System.out.println("n must be between 0 and " + MAX_N + ".");
                return;
            }
            // Divide an even factor first so the multiplication stays in range.
            long first = n;
            long second = n + 1;
            if (first % 2 == 0) first /= 2;
            else second /= 2;
            System.out.println("Sum: " + (first * second));
        } catch (NoSuchElementException | NumberFormatException exception) {
            System.out.println("Invalid input. Enter a whole number.");
        }
    }
}
