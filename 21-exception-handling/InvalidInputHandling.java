import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidInputHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter two whole numbers: ");
            if (!input.hasNextInt()) {
                throw new InputMismatchException("Please enter two whole numbers.");
            }
            int first = input.nextInt();
            if (!input.hasNextInt()) {
                throw new InputMismatchException("Please enter two whole numbers.");
            }
            int second = input.nextInt();
            if (input.hasNext()) {
                throw new InputMismatchException("Enter exactly two whole numbers.");
            }
            System.out.println("Sum: " + ((long) first + second));
        } catch (InputMismatchException error) {
            System.out.println(error.getMessage());
        }
    }
}
