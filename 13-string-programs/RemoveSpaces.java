import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        if (!input.hasNextLine()) {
            System.out.println("No line was provided.");
            return;
        }

        String text = input.nextLine();
        System.out.println("Without spaces: " + text.replace(" ", ""));
    }
}
