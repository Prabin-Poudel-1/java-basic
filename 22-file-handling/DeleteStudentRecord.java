import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteStudentRecord {
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
        System.out.print("Enter student name to delete: ");
        if (!input.hasNextLine()) {
            System.out.println("A student name is required.");
            return;
        }
        String wantedName = input.nextLine().trim();
        if (wantedName.isEmpty() || input.hasNextLine() && !input.nextLine().trim().isEmpty()) {
            System.out.println("Enter exactly one student name; the file was not changed.");
            return;
        }

        List<String> remainingRecords = new ArrayList<>(records);
        boolean found = false;
        for (int i = 0; i < remainingRecords.size(); i++) {
            String record = remainingRecords.get(i);
            int separator = record.lastIndexOf(',');
            if (separator > 0 && record.substring(0, separator).equals(wantedName)) {
                remainingRecords.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found; the file was not changed.");
            return;
        }

        Path temporaryFile = file.resolveSibling(file.getFileName() + ".tmp");
        try {
            Files.write(temporaryFile, remainingRecords, StandardCharsets.UTF_8);
            try {
                Files.move(temporaryFile, file, java.nio.file.StandardCopyOption.REPLACE_EXISTING,
                        java.nio.file.StandardCopyOption.ATOMIC_MOVE);
            } catch (java.nio.file.AtomicMoveNotSupportedException error) {
                Files.move(temporaryFile, file, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            }
            System.out.println("Deleted record for " + wantedName + ".");
        } catch (IOException error) {
            try {
                Files.deleteIfExists(temporaryFile);
            } catch (IOException ignored) {
                // Keep the original records if temporary-file cleanup is unavailable.
            }
            System.out.println("Could not update the file: " + error.getMessage());
        }
    }
}
