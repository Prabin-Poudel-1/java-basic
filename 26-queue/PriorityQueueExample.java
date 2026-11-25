import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add priority  2. Remove highest  3. Display order  0. Exit");
            System.out.print("Choice: ");
            if (!input.hasNextLine()) {
                break;
            }
            String choice = input.nextLine().trim();
            if (choice.equals("0")) {
                break;
            } else if (choice.equals("1")) {
                System.out.print("Integer priority: ");
                if (!input.hasNextLine()) {
                    break;
                }
                try {
                    int priority = Integer.parseInt(input.nextLine().trim());
                    queue.add(priority);
                    System.out.println("Added priority " + priority + ".");
                } catch (NumberFormatException error) {
                    System.out.println("Enter a whole number.");
                }
            } else if (choice.equals("2")) {
                if (queue.isEmpty()) {
                    System.out.println("Priority queue is empty.");
                } else {
                    System.out.println("Removed priority " + queue.remove() + ".");
                }
            } else if (choice.equals("3")) {
                if (queue.isEmpty()) {
                    System.out.println("Priority queue is empty.");
                } else {
                    PriorityQueue<Integer> ordered = new PriorityQueue<>(queue);
                    System.out.print("Highest to lowest: ");
                    while (!ordered.isEmpty()) {
                        System.out.print(ordered.remove() + (ordered.isEmpty() ? "" : " "));
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Choose 1, 2, 3, or 0.");
            }
        }
    }
}
