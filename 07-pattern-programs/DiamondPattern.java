import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter half-height (1-25): ");
        if (!input.hasNextInt()) { System.out.println("Enter one whole number from 1 to 25."); return; }
        int height = input.nextInt();
        if (input.hasNext() || height < 1 || height > 25) { System.out.println("Half-height must be one whole number from 1 to 25."); return; }
        for (int row = 1; row <= height; row++) printRow(height - row, 2 * row - 1);
        for (int row = height - 1; row >= 1; row--) printRow(height - row, 2 * row - 1);
    }
    private static void printRow(int spaces, int stars) {
        for (int i = 0; i < spaces; i++) System.out.print(' ');
        for (int i = 0; i < stars; i++) System.out.print('*');
        System.out.println();
    }
}
