import java.util.Scanner;

public class FibonacciUsingFunction {
    private static void printSeries(int terms) {
        long first = 0, second = 1;
        for (int index = 0; index < terms; index++) {
            if (index > 0) System.out.print(" ");
            System.out.print(first);
            if (index + 1 < terms) { long next = first + second; first = second; second = next; }
        }
        if (terms == 0) System.out.print("No terms");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms (0-93): ");
        if (!input.hasNextInt()) { System.out.println("Enter one whole number from 0 to 93."); return; }
        int terms=input.nextInt();
        if(input.hasNext()||terms<0||terms>93){System.out.println("Terms must be from 0 to 93.");return;}
        System.out.print("Fibonacci series: "); printSeries(terms);
    }
}
