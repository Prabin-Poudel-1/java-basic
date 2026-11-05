import java.util.Scanner;

public class GcdHcf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two 32-bit whole numbers: ");
        if (!input.hasNextInt()) {
            System.out.println("Please enter two 32-bit whole numbers.");
            return;
        }
        long first = input.nextInt();
        if (!input.hasNextInt()) {
            System.out.println("Please enter two 32-bit whole numbers.");
            return;
        }
        long second = input.nextInt();
        if (input.hasNext()) {
            System.out.println("Please enter only two whole numbers.");
            return;
        }

        first = Math.abs(first);
        second = Math.abs(second);
        while (second != 0) {
            long remainder = first % second;
            first = second;
            second = remainder;
        }
        System.out.println("GCD/HCF: " + first);
    }
}
