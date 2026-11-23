import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdateStudentRecord {
    public static void main(String[] args) {
        Path file = Paths.get("student_records.txt");
        final List<String> originalRecords;
        try {
            originalRecords = Files.readAllLines(file, StandardCharsets.UTF_8);
        } catch (IOException error) {
            System.out.println("Could not read student_records.txt: " + error.getMessage());
            return;
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter student name to update: ");
        if (!input.hasNextLine()) {
            System.out.println("A student name is required.");
            return;
        }
        String wantedName = input.nextLine().trim();
        System.out.print("Enter new marks (0 to 100): ");
        if (wantedName.isEmpty() || !input.hasNextLine()) {
            System.out.println("Enter a name and marks from 0 to 100.");
            return;
        }
        String marksText = input.nextLine().trim();
        if (input.hasNextLine() && !input.nextLine().trim().isEmpty()) {
            System.out.println("Unexpected extra input; the file was not changed.");
            return;
        }

        final double newMarks;
        try {
            newMarks = Double.parseDouble(marksText);
        } catch (NumberFormatException error) {
            System.out.println("Marks must be a number from 0 to 100.");
            return;
        }
        if (!Double.isFinite(newMarks) || newMarks < 0 || newMarks > 100) {
            System.out.println("Marks must be a number from 0 to 100.");
            return;
        }

        List<String> updatedRecords = new ArrayList<>(originalRecords);
        boolean found = false;
        for (int i = 0; i < updatedRecords.size(); i++) {
            String record = updatedRecords.get(i);
            int separator = record.lastIndexOf(',');
            if (separator > 0 && record.substring(0, separator).equals(wantedName)) {
                updatedRecords.set(i, wantedName + "," + newMarks);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found; the file was not changed.");
            return;
        }

        try {
            Files.write(file, updatedRecords, StandardCharsets.UTF_8);
            System.out.println("Updated marks for " + wantedName + ".");
        } catch (IOException error) {
            System.out.println("Could not update the file: " + error.getMessage());
        }
    }
}
