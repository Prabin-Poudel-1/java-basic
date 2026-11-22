import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WriteDataToFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line to save: ");
        if (!input.hasNextLine()) {
            System.out.println("No line was provided.");
            return;
        }
        String data = input.nextLine();
        Path file = Paths.get("practice_data.txt");

        try {
            Files.write(file, (data + System.lineSeparator()).getBytes(StandardCharsets.UTF_8));
            System.out.println("Saved data to: " + file.toAbsolutePath());
        } catch (IOException error) {
            System.out.println("Could not write the file: " + error.getMessage());
        }
    }
}
