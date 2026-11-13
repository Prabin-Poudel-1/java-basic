import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        if (!input.hasNextLine()) {
            System.out.println("No line was provided.");
            return;
        }

        String text = input.nextLine();
        Map<Character, Integer> frequencies = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            frequencies.put(character, frequencies.getOrDefault(character, 0) + 1);
        }

        boolean foundDuplicate = false;
        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            if (entry.getValue() > 1) {
                String label = entry.getKey() == ' ' ? "(space)" : String.valueOf(entry.getKey());
                System.out.println(label + ": " + entry.getValue());
                foundDuplicate = true;
            }
        }
        if (!foundDuplicate) {
            System.out.println("No duplicate characters.");
        }
    }
}
