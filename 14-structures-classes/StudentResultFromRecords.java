import java.util.Scanner;

public class StudentResultFromRecords {
    private static class StudentRecord {
        String name;
        int rollNumber;
        int[] marks = new int[3];
    }

    private static Integer readIntegerLine(Scanner input) {
        if (!input.hasNextLine()) {
            return null;
        }
        try {
            return Integer.parseInt(input.nextLine().trim());
        } catch (NumberFormatException exception) {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students (1-100): ");
        Integer count = readIntegerLine(input);
        if (count == null || count < 1 || count > 100) {
            System.out.println("Student count must be a whole number from 1 to 100.");
            return;
        }

        StudentRecord[] records = new StudentRecord[count];
        for (int i = 0; i < count; i++) {
            StudentRecord student = new StudentRecord();
            System.out.print("Enter name for student " + (i + 1) + ": ");
            if (!input.hasNextLine()) {
                System.out.println("Student name cannot be empty.");
                return;
            }
            student.name = input.nextLine().trim();
            if (student.name.isEmpty()) {
                System.out.println("Student name cannot be empty.");
                return;
            }
            System.out.print("Enter positive roll number: ");
            Integer roll = readIntegerLine(input);
            if (roll == null || roll < 1) {
                System.out.println("Roll number must be a positive whole number.");
                return;
            }
            student.rollNumber = roll;

            for (int subject = 0; subject < student.marks.length; subject++) {
                System.out.print("Enter marks for subject " + (subject + 1) + " (0-100): ");
                Integer mark = readIntegerLine(input);
                if (mark == null || mark < 0 || mark > 100) {
                    System.out.println("Marks must be a whole number from 0 to 100.");
                    return;
                }
                student.marks[subject] = mark;
            }
            records[i] = student;
        }

        System.out.println("Student results:");
        for (StudentRecord student : records) {
            int total = 0;
            boolean passed = true;
            for (int mark : student.marks) {
                total += mark;
                if (mark < 40) {
                    passed = false;
                }
            }
            double average = total / (double) student.marks.length;
            System.out.println("Name: " + student.name);
            System.out.println("Roll number: " + student.rollNumber);
            System.out.println("Total marks: " + total + "/300");
            System.out.printf("Average: %.2f%%%n", average);
            System.out.println("Result: " + (passed ? "Pass" : "Fail"));
            System.out.println();
        }
    }
}
