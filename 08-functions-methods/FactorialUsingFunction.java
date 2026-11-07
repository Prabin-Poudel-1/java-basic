import java.util.Scanner;

public class FactorialUsingFunction {
    private static long factorial(int number) {
        long result = 1;
        for (int factor = 2; factor <= number; factor++) result *= factor;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a whole number from 0 to 20: ");
        if (!input.hasNextInt()) { System.out.println("Enter one whole number from 0 to 20."); return; }
        int number = input.nextInt();
        if (input.hasNext() || number < 0 || number > 20) { System.out.println("Number must be from 0 to 20."); return; }
        System.out.println("Factorial: " + factorial(number));
    }
}
