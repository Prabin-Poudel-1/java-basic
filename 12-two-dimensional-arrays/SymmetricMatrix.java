import java.util.Scanner;

public class SymmetricMatrix {
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

        int[][] matrix = new int[size][size];
        System.out.println("Enter matrix values row by row:");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (!input.hasNextInt()) {
                    System.out.println("Enter exactly " + (size * size) + " whole numbers.");
                    return;
                }
                matrix[row][column] = input.nextInt();
            }
        }
        if (input.hasNext()) {
            System.out.println("Enter only the matrix size and values.");
            return;
        }

        boolean symmetric = true;
        for (int row = 0; row < size && symmetric; row++) {
            for (int column = row + 1; column < size; column++) {
                if (matrix[row][column] != matrix[column][row]) {
                    symmetric = false;
                    break;
                }
            }
        }
        System.out.println(symmetric ? "Symmetric matrix" : "Not a symmetric matrix");
    }
}
