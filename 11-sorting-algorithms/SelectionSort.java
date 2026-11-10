import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size (1-100): ");
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
        }
        if (input.hasNext()) {
            System.out.println("Enter only the array values.");
            return;
        }

        for (int start = 0; start < size - 1; start++) {
            int smallestIndex = start;
            for (int i = start + 1; i < size; i++) {
                if (values[i] < values[smallestIndex]) {
                    smallestIndex = i;
                }
            }
            int temporary = values[start];
            values[start] = values[smallestIndex];
            values[smallestIndex] = temporary;
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(values[i] + (i == size - 1 ? "\n" : " "));
        }
    }
}
