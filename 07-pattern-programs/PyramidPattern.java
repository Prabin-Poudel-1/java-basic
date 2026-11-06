import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter pattern size (1-50): ");
        if (!input.hasNextInt()) { System.out.println("Enter one whole number from 1 to 50."); return; }
        int size = input.nextInt();
        if (input.hasNext()) { System.out.println("Enter only one whole number."); return; }
        if (size < 1 || size > 50) { System.out.println("Size must be from 1 to 50."); return; }
        for (int row = 1; row <= size; row++) {
            for (int space = 0; space < size - row; space++) System.out.print(" ");
            for (int star = 0; star < 2 * row - 1; star++) System.out.print("*");
            System.out.println();
        }
    }
}
