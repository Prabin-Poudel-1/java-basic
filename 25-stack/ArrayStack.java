import java.util.Scanner;

public class ArrayStack {
    private static final int CAPACITY = 5;

    public static void main(String[] args) {
        int[] stack = new int[CAPACITY];
        int top = -1;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Push  2. Pop  3. Display  0. Exit");
            System.out.print("Choice: ");
            if (!input.hasNextLine()) {
                break;
            }
            String choice = input.nextLine().trim();
            if (choice.equals("0")) {
                break;
            } else if (choice.equals("1")) {
                if (top == CAPACITY - 1) {
                    System.out.println("Stack is full.");
                    continue;
                }
                System.out.print("Integer to push: ");
                if (!input.hasNextLine()) {
                    break;
                }
                try {
                    int value = Integer.parseInt(input.nextLine().trim());
                    stack[++top] = value;
                    System.out.println("Pushed " + value + ".");
                } catch (NumberFormatException error) {
                    System.out.println("Enter a whole number.");
                }
            } else if (choice.equals("2")) {
                if (top == -1) {
                    System.out.println("Stack is empty.");
                } else {
                    System.out.println("Popped " + stack[top--] + ".");
                }
            } else if (choice.equals("3")) {
                if (top == -1) {
                    System.out.println("Stack is empty.");
                } else {
                    System.out.print("Top to bottom: ");
                    for (int i = top; i >= 0; i--) {
                        System.out.print(stack[i] + (i == 0 ? "" : " "));
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Choose 1, 2, 3, or 0.");
            }
        }
    }
}
