import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        if (!input.hasNextLine()) {
            System.out.println("No line was provided.");
            return;
        }

        String text = input.nextLine().trim();
        int words = text.isEmpty() ? 0 : text.split("\\s+").length;
        System.out.println("Word count: " + words);
    }
}
