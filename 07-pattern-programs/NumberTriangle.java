import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter pattern size (1-50): ");
        if (!input.hasNextInt()) { System.out.println("Enter one whole number from 1 to 50."); return; }
        int size = input.nextInt();
        if (input.hasNext()) { System.out.println("Enter only one whole number."); return; }
        if (size < 1 || size > 50) { System.out.println("Size must be from 1 to 50."); return; }
        int value = 1;
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= row; column++) System.out.print(value++ + " ");
            System.out.println();
        }
    }
}
