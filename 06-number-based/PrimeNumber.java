import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a whole number: ");

        if (!input.hasNextInt()) {
            System.out.println("Please enter one 32-bit whole number.");
            return;
        }
        int number = input.nextInt();
        if (input.hasNext()) {
            System.out.println("Please enter only one whole number.");
            return;
        }

        boolean isPrime = number >= 2;
        for (int divisor = 2; isPrime && divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                isPrime = false;
            }
        }

        System.out.println(isPrime ? "Prime number" : "Not a prime number");
    }
}
