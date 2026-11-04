import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive whole number: ");
        if (!input.hasNextInt()) {
            System.out.println("Please enter one 32-bit whole number.");
            return;
        }
        int number = input.nextInt();
        if (input.hasNext()) {
            System.out.println("Please enter only one whole number.");
            return;
        }

        long divisorSum = 0;
        if (number > 1) {
            divisorSum = 1;
            for (int divisor = 2; divisor <= number / divisor; divisor++) {
                if (number % divisor == 0) {
                    divisorSum += divisor;
                    int pairedDivisor = number / divisor;
                    if (pairedDivisor != divisor) {
                        divisorSum += pairedDivisor;
                    }
                }
            }
        }
        System.out.println(number > 1 && divisorSum == number
                ? "Perfect number" : "Not a perfect number");
    }
}
