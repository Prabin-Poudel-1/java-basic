import java.util.Scanner;

public class PalindromeString {
    private static boolean isAsciiLetterOrDigit(char character) {
        return (character >= 'A' && character <= 'Z')
                || (character >= 'a' && character <= 'z')
                || (character >= '0' && character <= '9');
    }

    private static char toLowerAscii(char character) {
        if (character >= 'A' && character <= 'Z') {
            return (char) (character + ('a' - 'A'));
        }
        return character;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        if (!input.hasNextLine()) {
            System.out.println("No line was provided.");
            return;
        }

        String text = input.nextLine();
        int left = 0;
        int right = text.length() - 1;
        boolean palindrome = true;
        while (left < right) {
            while (left < right && !isAsciiLetterOrDigit(text.charAt(left))) {
                left++;
            }
            while (left < right && !isAsciiLetterOrDigit(text.charAt(right))) {
                right--;
            }
            if (toLowerAscii(text.charAt(left)) != toLowerAscii(text.charAt(right))) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(palindrome ? "Palindrome" : "Not a palindrome");
    }
}
