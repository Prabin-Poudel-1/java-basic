import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first matrix rows and columns (1-10 each): ");
        if (!input.hasNextInt()) {
            System.out.println("Enter dimensions from 1 to 10.");
            return;
        }
        int firstRows = input.nextInt();
        if (!input.hasNextInt()) {
            System.out.println("Enter dimensions from 1 to 10.");
            return;
        }
        int firstColumns = input.nextInt();
        if (firstRows < 1 || firstRows > 10 || firstColumns < 1 || firstColumns > 10) {
            System.out.println("Dimensions must each be from 1 to 10.");
            return;
        }

        int[][] first = new int[firstRows][firstColumns];
        System.out.println("Enter first matrix values row by row:");
        for (int row = 0; row < firstRows; row++) {
            for (int column = 0; column < firstColumns; column++) {
                if (!input.hasNextInt()) {
                    System.out.println("Enter all matrix values.");
                    return;
                }
                first[row][column] = input.nextInt();
            }
        }

        System.out.print("Enter second matrix rows and columns (1-10 each): ");
        if (!input.hasNextInt()) {
            System.out.println("Enter dimensions from 1 to 10.");
            return;
        }
        int secondRows = input.nextInt();
        if (!input.hasNextInt()) {
            System.out.println("Enter dimensions from 1 to 10.");
            return;
        }
        int secondColumns = input.nextInt();
        if (secondRows < 1 || secondRows > 10 || secondColumns < 1 || secondColumns > 10) {
            System.out.println("Dimensions must each be from 1 to 10.");
            return;
        }
        if (firstColumns != secondRows) {
            System.out.println("The first matrix columns must equal the second matrix rows.");
            return;
        }

        int[][] second = new int[secondRows][secondColumns];
        System.out.println("Enter second matrix values row by row:");
        for (int row = 0; row < secondRows; row++) {
            for (int column = 0; column < secondColumns; column++) {
                if (!input.hasNextInt()) {
                    System.out.println("Enter all matrix values.");
                    return;
                }
                second[row][column] = input.nextInt();
            }
        }
        if (input.hasNext()) {
            System.out.println("Enter only the dimensions and matrix values.");
            return;
        }

        System.out.println("Product matrix:");
        for (int row = 0; row < firstRows; row++) {
            for (int column = 0; column < secondColumns; column++) {
                long sum = 0;
                for (int k = 0; k < firstColumns; k++) {
                    sum += (long) first[row][k] * second[k][column];
                }
                System.out.print(sum + (column == secondColumns - 1 ? "\n" : " "));
            }
        }
    }
}
