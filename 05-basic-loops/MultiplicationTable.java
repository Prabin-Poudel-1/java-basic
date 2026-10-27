import java.util.NoSuchElementException;
import java.util.Scanner;

/** Print the first ten multiples of an integer. */
public class MultiplicationTable {
    private static final long MAX_ABS_VALUE = 922_337_203_685_477_580L;

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer from -" + MAX_ABS_VALUE + " to " + MAX_ABS_VALUE + ": ");
            long number = Long.parseLong(input.nextLine().trim());
            if (number < -MAX_ABS_VALUE || number > MAX_ABS_VALUE) {
                System.out.println("Number is outside the safe table range.");
                return;
            }
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.println(number + " x " + multiplier + " = " + number * multiplier);
            }
        } catch (NoSuchElementException | NumberFormatException exception) {
            System.out.println("Invalid input. Enter one whole number.");
        }
    }
}
