import java.util.Scanner;

public class BubbleSort {
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

        for (int pass = 0; pass < size - 1; pass++) {
            boolean swapped = false;
            for (int i = 0; i < size - 1 - pass; i++) {
                if (values[i] > values[i + 1]) {
                    int temporary = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = temporary;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(values[i] + (i == size - 1 ? "\n" : " "));
        }
    }
}
