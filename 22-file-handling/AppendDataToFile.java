import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class AppendDataToFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line to append: ");
        if (!input.hasNextLine()) {
            System.out.println("No line was provided.");
            return;
        }
        String data = input.nextLine();
        Path file = Paths.get("practice_data.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(file, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            writer.write(data);
            writer.newLine();
            System.out.println("Appended data to: " + file.toAbsolutePath());
        } catch (IOException error) {
            System.out.println("Could not append to the file: " + error.getMessage());
        }
    }
}
