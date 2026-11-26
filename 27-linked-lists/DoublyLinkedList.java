import java.util.Scanner;

public class DoublyLinkedList {
    private static class Node {
        private final int value;
        private Node previous;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of values (0 to 100): ");
        if (!input.hasNextLine()) {
            System.out.println("A count is required.");
            return;
        }
        int count;
        try {
            count = Integer.parseInt(input.nextLine().trim());
        } catch (NumberFormatException error) {
            System.out.println("Enter a whole number from 0 to 100.");
            return;
        }
        if (count < 0 || count > 100) {
            System.out.println("Enter a whole number from 0 to 100.");
            return;
        }

        Node head = null;
        Node tail = null;
        for (int i = 0; i < count; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            if (!input.hasNextLine()) {
                System.out.println("List input ended early.");
                return;
            }
            int value;
            try {
                value = Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException error) {
                System.out.println("Enter a whole number for every list value.");
                return;
            }
            Node node = new Node(value);
            node.previous = tail;
            if (tail == null) {
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
        }

        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.print("Forward: ");
        for (Node node = head; node != null; node = node.next) {
            System.out.print(node.value + (node.next == null ? "" : " <-> "));
        }
        System.out.println();
        System.out.print("Backward: ");
        for (Node node = tail; node != null; node = node.previous) {
            System.out.print(node.value + (node.previous == null ? "" : " <-> "));
        }
        System.out.println();
    }
}
