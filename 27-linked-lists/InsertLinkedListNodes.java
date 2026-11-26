import java.util.Scanner;

public class InsertLinkedListNodes {
    private static class Node {
        private final int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Insert at beginning  2. Insert at end  3. Display  0. Exit");
            System.out.print("Choice: ");
            if (!input.hasNextLine()) {
                break;
            }
            String choice = input.nextLine().trim();
            if (choice.equals("0")) {
                break;
            } else if (choice.equals("1") || choice.equals("2")) {
                System.out.print("Integer value: ");
                if (!input.hasNextLine()) {
                    break;
                }
                int value;
                try {
                    value = Integer.parseInt(input.nextLine().trim());
                } catch (NumberFormatException error) {
                    System.out.println("Enter a whole number.");
                    continue;
                }
                Node node = new Node(value);
                if (choice.equals("1") || head == null) {
                    node.next = head;
                    head = node;
                } else {
                    Node tail = head;
                    while (tail.next != null) {
                        tail = tail.next;
                    }
                    tail.next = node;
                }
                System.out.println("Inserted " + value + ".");
            } else if (choice.equals("3")) {
                if (head == null) {
                    System.out.println("List is empty.");
                } else {
                    System.out.print("List: ");
                    for (Node node = head; node != null; node = node.next) {
                        System.out.print(node.value + (node.next == null ? "" : " -> "));
                    }
                    System.out.println(" -> null");
                }
            } else {
                System.out.println("Choose 1, 2, 3, or 0.");
            }
        }
    }
}
