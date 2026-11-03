import java.util.Scanner;

public class PrimeNumbersInRange {
    private static boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }
        for (long divisor = 2; divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the start and end of the range: ");

        if (!input.hasNextInt()) {
            System.out.println("Please enter two 32-bit whole numbers.");
            return;
        }
        int start = input.nextInt();
        if (!input.hasNextInt()) {
            System.out.println("Please enter two 32-bit whole numbers.");
            return;
        }
        int end = input.nextInt();
        if (input.hasNext()) {
            System.out.println("Please enter only two whole numbers.");
            return;
        }
        if (start > end) {
            System.out.println("The start must not be greater than the end.");
            return;
        }

        boolean foundPrime = false;
        System.out.print("Prime numbers: ");
        for (long number = Math.max(2L, start); number <= end; number++) {
            if (isPrime(number)) {
                if (foundPrime) {
                    System.out.print(" ");
                }
                System.out.print(number);
                foundPrime = true;
            }
        }
        if (!foundPrime) {
            System.out.print("None");
        }
        System.out.println();
    }
}
