import java.util.Scanner;

public class CircularLinkedList {
    private static class Node {
        private final int value;
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
            try {
                Node node = new Node(Integer.parseInt(input.nextLine().trim()));
                if (head == null) {
                    head = node;
                } else {
                    tail.next = node;
                }
                tail = node;
            } catch (NumberFormatException error) {
                System.out.println("Enter a whole number for every list value.");
                return;
            }
        }

        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        tail.next = head;
        System.out.print("Circular list: ");
        Node current = head;
        for (int i = 0; i < count; i++) {
            System.out.print(current.value + (i == count - 1 ? "" : " -> "));
            current = current.next;
        }
        System.out.println(" -> back to head");
    }
}
