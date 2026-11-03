import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms (0-93): ");

        if (!input.hasNextInt()) {
            System.out.println("Please enter one whole number from 0 to 93.");
            return;
        }
        int terms = input.nextInt();
        if (input.hasNext()) {
            System.out.println("Please enter only one whole number.");
            return;
        }
        if (terms < 0 || terms > 93) {
            System.out.println("The number of terms must be from 0 to 93.");
            return;
        }

        long first = 0;
        long second = 1;
        System.out.print("Fibonacci series: ");
        for (int index = 0; index < terms; index++) {
            if (index > 0) {
                System.out.print(" ");
            }
            System.out.print(first);
            if (index + 1 < terms) {
                long next = first + second;
                first = second;
                second = next;
            }
        }
        if (terms == 0) {
            System.out.print("No terms");
        }
        System.out.println();
    }
}
