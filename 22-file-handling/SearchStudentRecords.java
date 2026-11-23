import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class SearchStudentRecords {
    public static void main(String[] args) {
        Path file = Paths.get("student_records.txt");
        final List<String> records;
        try {
            records = Files.readAllLines(file, StandardCharsets.UTF_8);
        } catch (IOException error) {
            System.out.println("Could not read student_records.txt: " + error.getMessage());
            return;
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter student name to search: ");
        if (!input.hasNextLine()) {
            System.out.println("A student name is required.");
            return;
        }
        String wantedName = input.nextLine().trim();
        if (wantedName.isEmpty()) {
            System.out.println("A student name is required.");
            return;
        }

        boolean found = false;
        for (int i = 0; i < records.size(); i++) {
            String record = records.get(i);
            int separator = record.lastIndexOf(',');
            if (separator < 1 || separator == record.length() - 1) {
                System.out.println("Skipping malformed record on line " + (i + 1) + ".");
                continue;
            }
            String name = record.substring(0, separator);
            String marks = record.substring(separator + 1);
            if (name.equals(wantedName)) {
                System.out.println("Found: " + name + ", marks " + marks);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }
}
