import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        if (!input.hasNextLine()) {
            System.out.println("Two lines are required.");
            return;
        }
        String first = input.nextLine();
        System.out.print("Enter the second string: ");
        if (!input.hasNextLine()) {
            System.out.println("Two lines are required.");
            return;
        }
        String second = input.nextLine();

        System.out.println("Concatenated string: " + first + second);
    }
}
