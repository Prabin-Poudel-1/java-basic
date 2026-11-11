import java.util.Scanner;

public class MatrixInputDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows and columns (1-10 each): ");
        if (!input.hasNextInt()) {
            System.out.println("Enter row and column counts from 1 to 10.");
            return;
        }
        int rows = input.nextInt();
        if (!input.hasNextInt()) {
            System.out.println("Enter row and column counts from 1 to 10.");
            return;
        }
        int columns = input.nextInt();
        if (rows < 1 || rows > 10 || columns < 1 || columns > 10) {
            System.out.println("Rows and columns must each be from 1 to 10.");
            return;
        }

        int[][] matrix = new int[rows][columns];
        System.out.println("Enter matrix values row by row:");
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (!input.hasNextInt()) {
                    System.out.println("Enter exactly " + (rows * columns) + " whole numbers.");
                    return;
                }
                matrix[row][column] = input.nextInt();
            }
        }
        if (input.hasNext()) {
            System.out.println("Enter only the dimensions and matrix values.");
            return;
        }

        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int column = 0; column < columns; column++) {
                System.out.print(row[column] + (column == columns - 1 ? "\n" : " "));
            }
        }
    }
}
