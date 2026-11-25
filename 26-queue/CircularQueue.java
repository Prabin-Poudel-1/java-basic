import java.util.Scanner;

public class CircularQueue {
    private static final int CAPACITY = 5;

    private static class Queue {
        private final int[] values = new int[CAPACITY];
        private int front = 0;
        private int size = 0;

        private void enqueue(int value) {
            if (size == CAPACITY) {
                System.out.println("Queue is full.");
                return;
            }
            int rear = (front + size) % CAPACITY;
            values[rear] = value;
            size++;
            System.out.println("Enqueued " + value + ".");
        }

        private void dequeue() {
            if (size == 0) {
                System.out.println("Queue is empty.");
                return;
            }
            System.out.println("Dequeued " + values[front] + ".");
            front = (front + 1) % CAPACITY;
            size--;
        }

        private void display() {
            if (size == 0) {
                System.out.println("Queue is empty.");
                return;
            }
            System.out.print("Front to rear: ");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % CAPACITY;
                System.out.print(values[index] + (i == size - 1 ? "" : " "));
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
