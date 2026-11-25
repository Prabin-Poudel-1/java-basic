import java.util.Scanner;

public class ArrayQueue {
    private static final int CAPACITY = 5;

    public static void main(String[] args) {
        int[] queue = new int[CAPACITY];
        int front = 0;
        int rear = -1;
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
                if (rear == CAPACITY - 1) {
                    System.out.println("Queue is full.");
                    continue;
                }
                System.out.print("Integer to enqueue: ");
                if (!input.hasNextLine()) {
                    break;
                }
                try {
                    int value = Integer.parseInt(input.nextLine().trim());
                    queue[++rear] = value;
                    System.out.println("Enqueued " + value + ".");
                } catch (NumberFormatException error) {
                    System.out.println("Enter a whole number.");
                }
            } else if (choice.equals("2")) {
                if (rear < front) {
                    System.out.println("Queue is empty.");
                } else {
                    System.out.println("Dequeued " + queue[front++] + ".");
                    if (front > rear) {
                        front = 0;
                        rear = -1;
                    }
                }
            } else if (choice.equals("3")) {
                if (rear < front) {
                    System.out.println("Queue is empty.");
                } else {
                    System.out.print("Front to rear: ");
                    for (int i = front; i <= rear; i++) {
                        System.out.print(queue[i] + (i == rear ? "" : " "));
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Choose 1, 2, 3, or 0.");
            }
        }
    }
}
