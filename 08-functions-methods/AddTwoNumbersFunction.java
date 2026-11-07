import java.util.Scanner;

public class AddTwoNumbersFunction {
    private static long add(int first, int second) { return (long) first + second; }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two 32-bit whole numbers: ");
        if (!input.hasNextInt()) { System.out.println("Enter two 32-bit whole numbers."); return; }
        int first = input.nextInt();
        if (!input.hasNextInt()) { System.out.println("Enter two 32-bit whole numbers."); return; }
        int second = input.nextInt();
        if (input.hasNext()) { System.out.println("Enter only two whole numbers."); return; }
        System.out.println("Sum: " + add(first, second));
    }
}
