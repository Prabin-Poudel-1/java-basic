import java.util.Scanner;

public class RemoveDuplicates {
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

        int[] unique = new int[size];
        int uniqueCount = 0;
        for (int value : values) {
            boolean alreadySeen = false;
            for (int i = 0; i < uniqueCount; i++) {
                if (unique[i] == value) {
                    alreadySeen = true;
                    break;
                }
            }
            if (!alreadySeen) {
                unique[uniqueCount++] = value;
            }
        }

        System.out.print("Array without duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + (i == uniqueCount - 1 ? "\n" : " "));
        }
    }
}
