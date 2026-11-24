import java.util.Scanner;

public class BalancedParentheses {
    private static boolean isBalanced(String expression) {
        char[] stack = new char[expression.length()];
        int top = -1;
        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                stack[++top] = current;
            } else if (current == ')' || current == ']' || current == '}') {
                if (top == -1) {
                    return false;
                }
                char opening = stack[top--];
                if (current == ')' && opening != '(' || current == ']' && opening != '['
                        || current == '}' && opening != '{') {
                    return false;
                }
            }
        }
        return top == -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        if (!input.hasNextLine()) {
            System.out.println("An expression is required.");
            return;
        }
        String expression = input.nextLine();
        if (input.hasNextLine() && !input.nextLine().trim().isEmpty()) {
            System.out.println("Enter one expression on a single line.");
            return;
        }
        System.out.println(isBalanced(expression) ? "Parentheses are balanced." : "Parentheses are not balanced.");
    }
}
