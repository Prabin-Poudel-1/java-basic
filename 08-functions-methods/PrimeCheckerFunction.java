import java.util.Scanner;

public class PrimeCheckerFunction {
    private static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int divisor = 2; divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        if (!input.hasNextInt()) { System.out.println("Enter one 32-bit whole number."); return; }
        int number = input.nextInt();
        if (input.hasNext()) { System.out.println("Enter only one whole number."); return; }
        System.out.println(isPrime(number) ? "Prime number" : "Not a prime number");
    }
}
