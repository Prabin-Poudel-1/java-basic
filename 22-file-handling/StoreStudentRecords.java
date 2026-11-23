import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreStudentRecords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students (1 to 100): ");
        if (!input.hasNextInt()) {
            System.out.println("Enter a whole-number count from 1 to 100.");
            return;
        }
        int count = input.nextInt();
        input.nextLine(); // Consume the rest of the count line.
        if (count < 1 || count > 100) {
            System.out.println("Enter a whole-number count from 1 to 100.");
            return;
        }

        List<String> records = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            System.out.print("Student " + i + " name: ");
            if (!input.hasNextLine()) {
                System.out.println("A student name is missing.");
                return;
            }
            String name = input.nextLine().trim();
            System.out.print("Student " + i + " marks (0 to 100): ");
            if (!input.hasNextLine()) {
                System.out.println("Student marks are missing.");
                return;
            }
            String marksText = input.nextLine().trim();
            double marks;
            try {
                marks = Double.parseDouble(marksText);
            } catch (NumberFormatException error) {
                System.out.println("Marks must be a number from 0 to 100.");
                return;
            }
            if (name.isEmpty() || name.contains(",") || !Double.isFinite(marks)
                    || marks < 0 || marks > 100) {
                System.out.println("Use a non-empty name without commas and marks from 0 to 100.");
                return;
            }
            records.add(name + "," + marks);
        }

        if (input.hasNextLine() && !input.nextLine().trim().isEmpty()) {
            System.out.println("Unexpected extra input was ignored; records were not saved.");
            return;
        }

        Path file = Paths.get("student_records.txt");
        try {
            Files.write(file, records, StandardCharsets.UTF_8);
            System.out.println("Saved " + count + " student record(s) to " + file.toAbsolutePath());
        } catch (IOException error) {
            System.out.println("Could not save the records: " + error.getMessage());
        }
    }
}
