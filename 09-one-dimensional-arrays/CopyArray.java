import java.util.Scanner;

public class CopyArray {
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

        int[] original = new int[size];
        int[] copy = new int[size];
        for (int i = 0; i < size; i++) {
            if (!input.hasNextInt()) {
                System.out.println("Enter exactly " + size + " whole numbers.");
                return;
            }
            original[i] = input.nextInt();
            copy[i] = original[i];
        }
        if (input.hasNext()) {
            System.out.println("Enter only the array values.");
            return;
        }

        System.out.print("Copied array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(copy[i] + (i == size - 1 ? "\n" : " "));
        }
    }
}
