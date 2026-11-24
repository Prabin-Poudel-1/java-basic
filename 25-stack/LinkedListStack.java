import java.util.Scanner;

public class LinkedListStack {
    private static class Node {
        private final int value;
        private Node next;

        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private static Node top;

    private static void push(int value) {
        top = new Node(value, top);
        System.out.println("Pushed " + value + ".");
    }

    private static void pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Popped " + top.value + ".");
        top = top.next;
    }

    private static void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Top to bottom: ");
        for (Node current = top; current != null; current = current.next) {
            System.out.print(current.value + (current.next == null ? "" : " "));
        }
        System.out.println();
    }

    public static void main(String[] args) {
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
                System.out.print("Integer to push: ");
                if (!input.hasNextLine()) {
                    break;
                }
                try {
                    push(Integer.parseInt(input.nextLine().trim()));
                } catch (NumberFormatException error) {
                    System.out.println("Enter a whole number.");
                }
            } else if (choice.equals("2")) {
                pop();
            } else if (choice.equals("3")) {
                display();
            } else {
                System.out.println("Choose 1, 2, 3, or 0.");
            }
        }
        while (top != null) {
            top = top.next;
        }
    }
}
