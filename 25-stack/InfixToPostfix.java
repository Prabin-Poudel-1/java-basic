import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class InfixToPostfix {
    private static int precedence(char operator) {
        if (operator == '^') {
            return 3;
        }
        if (operator == '*' || operator == '/') {
            return 2;
        }
        return 1;
    }

    private static boolean isOperator(char character) {
        return character == '+' || character == '-' || character == '*'
                || character == '/' || character == '^';
    }

    private static String toPostfix(String expression) {
        StringBuilder output = new StringBuilder();
        Deque<Character> operators = new ArrayDeque<>();
        boolean expectingOperand = true;
        int i = 0;

        while (i < expression.length()) {
            char current = expression.charAt(i);
            if (Character.isWhitespace(current)) {
                i++;
            } else if (Character.isLetterOrDigit(current)) {
                if (!expectingOperand) {
                    return null;
                }
                int start = i++;
                while (i < expression.length() && Character.isLetterOrDigit(expression.charAt(i))) {
                    i++;
                }
                output.append(expression, start, i).append(' ');
                expectingOperand = false;
            } else if (current == '(') {
                if (!expectingOperand) {
                    return null;
                }
                operators.push(current);
                expectingOperand = true;
                i++;
            } else if (current == ')') {
                if (expectingOperand) {
                    return null;
                }
                while (!operators.isEmpty() && operators.peek() != '(') {
                    output.append(operators.pop()).append(' ');
                }
                if (operators.isEmpty()) {
                    return null;
                }
                operators.pop();
                expectingOperand = false;
                i++;
            } else if (isOperator(current)) {
                if (expectingOperand) {
                    return null;
                }
                while (!operators.isEmpty() && operators.peek() != '(') {
                    char top = operators.peek();
                    boolean higherPrecedence = precedence(top) > precedence(current);
                    boolean samePrecedenceAndLeftAssociative = precedence(top) == precedence(current)
                            && current != '^';
                    if (!higherPrecedence && !samePrecedenceAndLeftAssociative) {
                        break;
                    }
                    output.append(operators.pop()).append(' ');
                }
                operators.push(current);
                expectingOperand = true;
                i++;
            } else {
                return null;
            }
        }

        if (expectingOperand || output.length() == 0) {
            return null;
        }
        while (!operators.isEmpty()) {
            char operator = operators.pop();
            if (operator == '(') {
                return null;
            }
            output.append(operator).append(' ');
        }
        return output.toString().trim();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an infix expression: ");
        if (!input.hasNextLine()) {
            System.out.println("An expression is required.");
            return;
        }
        String expression = input.nextLine();
        if (input.hasNextLine() && !input.nextLine().trim().isEmpty()) {
            System.out.println("Enter one expression on a single line.");
            return;
        }
        String result = toPostfix(expression);
        if (result == null) {
            System.out.println("Invalid infix expression.");
        } else {
            System.out.println("Postfix: " + result);
        }
    }
}
