import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter square matrix size (1-10): ");
        if (!input.hasNextInt()) {
            System.out.println("Enter a size from 1 to 10.");
            return;
        }
        int size = input.nextInt();
        if (size < 1 || size > 10) {
            System.out.println("Matrix size must be from 1 to 10.");
            return;
        }

        long diagonalSum = 0;
        System.out.println("Enter matrix values row by row:");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (!input.hasNextInt()) {
                    System.out.println("Enter exactly " + (size * size) + " whole numbers.");
                    return;
                }
                int value = input.nextInt();
                if (row == column) {
                    diagonalSum += value;
                }
            }
        }
        if (input.hasNext()) {
            System.out.println("Enter only the matrix size and values.");
            return;
        }

        System.out.println("Main diagonal sum: " + diagonalSum);
    }
}
