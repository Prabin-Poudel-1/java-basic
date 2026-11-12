import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        if (!input.hasNextLine()) {
            System.out.println("No line was provided.");
            return;
        }

        String text = input.nextLine();
        if (text.isEmpty()) {
            System.out.println("No characters entered.");
            return;
        }

        Map<Character, Integer> frequencies = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            frequencies.put(character, frequencies.getOrDefault(character, 0) + 1);
        }

        System.out.println("Character frequencies (case-sensitive):");
        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            String label = entry.getKey() == ' ' ? "(space)" : String.valueOf(entry.getKey());
            System.out.println(label + ": " + entry.getValue());
        }
    }
}
