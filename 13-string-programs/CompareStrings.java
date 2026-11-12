import java.util.Scanner;

public class CompareStrings {
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

        int comparison = first.compareTo(second);
        if (comparison == 0) {
            System.out.println("Strings are equal");
        } else if (comparison < 0) {
            System.out.println("First string comes before the second");
        } else {
            System.out.println("First string comes after the second");
        }
    }
}
