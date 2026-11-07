import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows (1-20): ");
        if (!input.hasNextInt()) { System.out.println("Enter one whole number from 1 to 20."); return; }
        int rows = input.nextInt();
        if (input.hasNext() || rows < 1 || rows > 20) { System.out.println("Rows must be one whole number from 1 to 20."); return; }
        for (int row = 0; row < rows; row++) {
            long value = 1;
            for (int space = 0; space < rows - row - 1; space++) System.out.print(" ");
            for (int column = 0; column <= row; column++) {
                System.out.print(value + " ");
                value = value * (row - column) / (column + 1);
            }
            System.out.println();
        }
    }
}
