import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        if (!input.hasNextLine()) {
            System.out.println("No line was provided.");
            return;
        }

        String text = input.nextLine();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (character >= 'A' && character <= 'Z') {
                character = (char) (character + ('a' - 'A'));
            }
            if (character >= 'a' && character <= 'z') {
                if (character == 'a' || character == 'e' || character == 'i'
                        || character == 'o' || character == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
