import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first array size (1-100): ");
        if (!input.hasNextInt()) {
            System.out.println("Enter a size from 1 to 100.");
            return;
        }
        int firstSize = input.nextInt();
        if (firstSize < 1 || firstSize > 100) {
            System.out.println("Array size must be from 1 to 100.");
            return;
        }

        int[] merged = new int[200];
        for (int i = 0; i < firstSize; i++) {
            if (!input.hasNextInt()) {
                System.out.println("Enter all values in the first array.");
                return;
            }
            merged[i] = input.nextInt();
        }

        System.out.print("Enter second array size (1-100): ");
        if (!input.hasNextInt()) {
            System.out.println("Enter a size from 1 to 100.");
            return;
        }
        int secondSize = input.nextInt();
        if (secondSize < 1 || secondSize > 100) {
            System.out.println("Array size must be from 1 to 100.");
            return;
        }
        for (int i = 0; i < secondSize; i++) {
            if (!input.hasNextInt()) {
                System.out.println("Enter all values in the second array.");
                return;
            }
            merged[firstSize + i] = input.nextInt();
        }
        if (input.hasNext()) {
            System.out.println("Enter only the two array sizes and their values.");
            return;
        }

        System.out.print("Merged array: ");
        for (int i = 0; i < firstSize + secondSize; i++) {
            System.out.print(merged[i] + (i == firstSize + secondSize - 1 ? "\n" : " "));
        }
    }
}
