import java.util.Scanner;

public class ChangeCase {
    private static String toUpperAscii(String text) {
        StringBuilder result = new StringBuilder(text.length());
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (character >= 'a' && character <= 'z') {
                character = (char) (character - ('a' - 'A'));
            }
            result.append(character);
        }
        return result.toString();
    }

    private static String toLowerAscii(String text) {
        StringBuilder result = new StringBuilder(text.length());
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (character >= 'A' && character <= 'Z') {
                character = (char) (character + ('a' - 'A'));
            }
            result.append(character);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        if (!input.hasNextLine()) {
            System.out.println("No line was provided.");
            return;
        }

        String text = input.nextLine();
        System.out.println("Uppercase: " + toUpperAscii(text));
        System.out.println("Lowercase: " + toLowerAscii(text));
    }
}
