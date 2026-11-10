import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sorted array size (1-100): ");
        if (!input.hasNextInt()) {
            System.out.println("Enter a size from 1 to 100.");
            return;
        }
        int size = input.nextInt();
        if (size < 1 || size > 100) {
            System.out.println("Array size must be from 1 to 100.");
            return;
        }

        int[] values = new int[size];
        for (int i = 0; i < size; i++) {
            if (!input.hasNextInt()) {
                System.out.println("Enter exactly " + size + " whole numbers.");
                return;
            }
            values[i] = input.nextInt();
            if (i > 0 && values[i] < values[i - 1]) {
                System.out.println("Values must be sorted in ascending order.");
                return;
            }
        }
        if (!input.hasNextInt()) {
            System.out.println("Enter one target whole number.");
            return;
        }
        int target = input.nextInt();
        if (input.hasNext()) {
            System.out.println("Enter only the array values and target.");
            return;
        }

        int low = 0;
        int high = size - 1;
        int found = -1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (values[middle] == target) {
                found = middle;
                break;
            } else if (values[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        if (found == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index " + found);
        }
    }
}
