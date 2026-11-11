import java.util.Scanner;

public class MatrixAddition {
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

        int[][] first = new int[rows][columns];
        int[][] second = new int[rows][columns];
        System.out.println("Enter first matrix values row by row:");
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (!input.hasNextInt()) {
                    System.out.println("Enter all values for both matrices.");
                    return;
                }
                first[row][column] = input.nextInt();
            }
        }
        System.out.println("Enter second matrix values row by row:");
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (!input.hasNextInt()) {
                    System.out.println("Enter all values for both matrices.");
                    return;
                }
                second[row][column] = input.nextInt();
            }
        }
        if (input.hasNext()) {
            System.out.println("Enter only the dimensions and matrix values.");
            return;
        }

        System.out.println("Sum matrix:");
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                int sum = first[row][column] + second[row][column];
                System.out.print(sum + (column == columns - 1 ? "\n" : " "));
            }
        }
    }
}
