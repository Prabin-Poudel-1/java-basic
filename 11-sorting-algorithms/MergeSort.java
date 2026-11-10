import java.util.Scanner;

public class MergeSort {
    private static void mergeSort(int[] values, int[] temporary, int left, int right) {
        if (left >= right) {
            return;
        }
        int middle = left + (right - left) / 2;
        mergeSort(values, temporary, left, middle);
        mergeSort(values, temporary, middle + 1, right);

        int first = left;
        int second = middle + 1;
        int next = left;
        while (first <= middle && second <= right) {
            if (values[first] <= values[second]) {
                temporary[next++] = values[first++];
            } else {
                temporary[next++] = values[second++];
            }
        }
        while (first <= middle) {
            temporary[next++] = values[first++];
        }
        while (second <= right) {
            temporary[next++] = values[second++];
        }
        for (int i = left; i <= right; i++) {
            values[i] = temporary[i];
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

        mergeSort(values, new int[size], 0, size - 1);
        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(values[i] + (i == size - 1 ? "\n" : " "));
        }
    }
}
