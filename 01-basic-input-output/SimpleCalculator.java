import java.util.Locale;
import java.util.Scanner;

/** Calculate with +, -, *, /, and %. */
public class SimpleCalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.ROOT);
            System.out.print("Enter an expression (example: 8 + 2): ");
        double first = input.nextDouble();
        String operator = input.next();
        double second = input.nextDouble();
        double result;
        switch (operator) {
            case "+": result = first + second; break;
            case "-": result = first - second; break;
            case "*": result = first * second; break;
            case "/":
            case "%":
                if (second == 0) {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                result = operator.equals("/") ? first / second : first % second;
                break;
            default:
                System.out.println("Unsupported operator.");
                return;
        }
        System.out.println("Result: " + result);
        } catch (java.util.NoSuchElementException
                 | NumberFormatException exception) {
            System.out.println("Invalid input.");
        }
    }
}
