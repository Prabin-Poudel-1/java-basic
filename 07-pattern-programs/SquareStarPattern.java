import java.util.Scanner;

public class SquareStarPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter pattern size (1-50): ");
        if (!input.hasNextInt()) {
            System.out.println("Enter one whole number from 1 to 50.");
            return;
        }
        int size = input.nextInt();
        if (input.hasNext()) {
            System.out.println("Enter only one whole number.");
            return;
        }
        if (size < 1 || size > 50) {
            System.out.println("Size must be from 1 to 50.");
            return;
        }

        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
