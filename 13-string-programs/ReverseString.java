import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        if (!input.hasNextLine()) {
            System.out.println("No line was provided.");
            return;
        }

        String text = input.nextLine();
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }
}
