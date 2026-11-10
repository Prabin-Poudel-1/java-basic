import java.util.Scanner;

public class QuickSort {
    private static int partition(int[] values, int low, int high) {
        int pivot = values[high];
        int smallerEnd = low - 1;
        for (int current = low; current < high; current++) {
            if (values[current] <= pivot) {
                smallerEnd++;
                int temporary = values[smallerEnd];
                values[smallerEnd] = values[current];
                values[current] = temporary;
            }
        }
        int temporary = values[smallerEnd + 1];
        values[smallerEnd + 1] = values[high];
        values[high] = temporary;
        return smallerEnd + 1;
    }

    private static void quickSort(int[] values, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(values, low, high);
            quickSort(values, low, pivotIndex - 1);
            quickSort(values, pivotIndex + 1, high);
        }
    }

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

        quickSort(values, 0, size - 1);
        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(values[i] + (i == size - 1 ? "\n" : " "));
        }
    }
}
