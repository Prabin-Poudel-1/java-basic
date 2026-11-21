import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
    public static void main(String[] args) {
        Path file = Paths.get("practice-output.txt");
        try {
            Files.createFile(file);
            System.out.println("Created file: " + file.toAbsolutePath());
        } catch (FileAlreadyExistsException error) {
            System.out.println("File already exists: " + file.toAbsolutePath());
        } catch (IOException error) {
            System.out.println("Could not create the file: " + error.getMessage());
        }
    }
}
