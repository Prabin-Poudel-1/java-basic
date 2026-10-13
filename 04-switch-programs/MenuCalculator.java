import java.util.NoSuchElementException;
import java.util.Scanner;

/** Repeated arithmetic operations selected with a switch menu. */
public class MenuCalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Remainder\n0. Exit");
                System.out.print("Choice: ");
                int choice = Integer.parseInt(input.nextLine().trim());
                if (choice == 0) {
                    System.out.println("Goodbye.");
                    return;
                }
                if (choice < 1 || choice > 5) {
                    System.out.println("Invalid choice.");
                    continue;
                }
                System.out.print("First number: ");
                double first = Double.parseDouble(input.nextLine().trim());
                System.out.print("Second number: ");
                double second = Double.parseDouble(input.nextLine().trim());
                if (!Double.isFinite(first) || !Double.isFinite(second)) {
                    System.out.println("Enter finite numbers.");
                    return;
                }
                if ((choice == 4 || choice == 5) && second == 0) {
                    System.out.println("Cannot divide by zero.");
                    continue;
                }

                double result;
                switch (choice) {
                    case 1: result = first + second; break;
                    case 2: result = first - second; break;
                    case 3: result = first * second; break;
                    case 4: result = first / second; break;
                    case 5: result = first % second; break;
                    default: throw new IllegalStateException("Unexpected choice");
                }
                if (!Double.isFinite(result)) {
                    System.out.println("Result is too large.");
                    continue;
                }
                System.out.println("Result: " + result);
            }
        } catch (NoSuchElementException | NumberFormatException exception) {
            System.out.println("Invalid input.");
        }
    }
}
