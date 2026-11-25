import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class EvaluatePostfix {
    private static Double evaluate(String expression) {
        Deque<Double> values = new ArrayDeque<>();
        String trimmed = expression.trim();
        if (trimmed.isEmpty()) {
            return null;
        }
        for (String token : trimmed.split("\\s+")) {
            if (token.length() == 1 && "+-*/".contains(token)) {
                if (values.size() < 2) {
                    return null;
                }
                double right = values.pop();
                double left = values.pop();
                double result;
                switch (token.charAt(0)) {
                    case '+': result = left + right; break;
                    case '-': result = left - right; break;
                    case '*': result = left * right; break;
                    default:
                        if (right == 0) {
                            return null;
                        }
                        result = left / right;
                }
                if (!Double.isFinite(result)) {
                    return null;
                }
                values.push(result);
            } else {
                try {
                    double value = Double.parseDouble(token);
                    if (!Double.isFinite(value)) {
                        return null;
                    }
                    values.push(value);
                } catch (NumberFormatException error) {
                    return null;
                }
            }
        }
        return values.size() == 1 ? values.pop() : null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a space-separated postfix expression: ");
        if (!input.hasNextLine()) {
            System.out.println("An expression is required.");
            return;
        }
        String expression = input.nextLine();
        if (input.hasNextLine() && !input.nextLine().trim().isEmpty()) {
            System.out.println("Enter one expression on a single line.");
            return;
        }
        Double result = evaluate(expression);
        if (result == null) {
            System.out.println("Invalid postfix expression or division by zero.");
        } else {
            System.out.println("Result: " + result);
        }
    }
}
