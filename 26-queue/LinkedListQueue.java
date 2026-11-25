import java.util.Scanner;

public class LinkedListQueue {
    private static class Node {
        private final int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    private static class Queue {
        private Node front;
        private Node rear;

        private void enqueue(int value) {
            Node node = new Node(value);
            if (rear == null) {
                front = node;
            } else {
                rear.next = node;
            }
            rear = node;
            System.out.println("Enqueued " + value + ".");
        }

        private void dequeue() {
            if (front == null) {
                System.out.println("Queue is empty.");
                return;
            }
            System.out.println("Dequeued " + front.value + ".");
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }

        private void display() {
            if (front == null) {
                System.out.println("Queue is empty.");
                return;
            }
            System.out.print("Front to rear: ");
            for (Node current = front; current != null; current = current.next) {
                System.out.print(current.value + (current.next == null ? "" : " "));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Enqueue  2. Dequeue  3. Display  0. Exit");
            System.out.print("Choice: ");
            if (!input.hasNextLine()) {
                break;
            }
            String choice = input.nextLine().trim();
            if (choice.equals("0")) {
                break;
            } else if (choice.equals("1")) {
                System.out.print("Integer to enqueue: ");
                if (!input.hasNextLine()) {
                    break;
                }
                try {
                    queue.enqueue(Integer.parseInt(input.nextLine().trim()));
                } catch (NumberFormatException error) {
                    System.out.println("Enter a whole number.");
                }
            } else if (choice.equals("2")) {
                queue.dequeue();
            } else if (choice.equals("3")) {
                queue.display();
            } else {
                System.out.println("Choose 1, 2, 3, or 0.");
            }
        }
    }
}
