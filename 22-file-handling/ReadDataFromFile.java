import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadDataFromFile {
    public static void main(String[] args) {
        Path file = Paths.get("practice_data.txt");
        try (BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
            String line;
            boolean foundLine = false;
            System.out.println("File contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                foundLine = true;
            }
            if (!foundLine) {
                System.out.println("(File is empty.)");
            }
        } catch (IOException error) {
            System.out.println("Could not read the file: " + error.getMessage());
        }
    }
}
