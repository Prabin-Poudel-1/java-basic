import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortStudentObjects {
    private static class Student {
        private final String name;
        private final double marks;

        private Student(String name, double marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of students (0 to 100): ");
        if (!input.hasNextLine()) {
            System.out.println("A student count is required.");
            return;
        }
        int count;
        try {
            count = Integer.parseInt(input.nextLine().trim());
        } catch (NumberFormatException error) {
            System.out.println("Enter a whole number from 0 to 100.");
            return;
        }
        if (count < 0 || count > 100) {
            System.out.println("Enter a whole number from 0 to 100.");
            return;
        }

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.print("Student " + (i + 1) + " name: ");
            if (!input.hasNextLine()) {
                System.out.println("Student input ended early.");
                return;
            }
            String name = input.nextLine().trim();
            System.out.print("Marks (0 to 100): ");
            if (name.isEmpty() || !input.hasNextLine()) {
                System.out.println("Each student needs a name and marks from 0 to 100.");
                return;
            }
            String marksText = input.nextLine().trim();
            try {
                double marks = Double.parseDouble(marksText);
                if (!Double.isFinite(marks) || marks < 0 || marks > 100) {
                    System.out.println("Marks must be a number from 0 to 100.");
                    return;
                }
                students.add(new Student(name, marks));
            } catch (NumberFormatException error) {
                System.out.println("Marks must be a number from 0 to 100.");
                return;
            }
        }
        if (input.hasNextLine() && !input.nextLine().trim().isEmpty()) {
            System.out.println("Unexpected extra input.");
            return;
        }

        students.sort(Comparator.comparingDouble((Student student) -> student.marks)
                .thenComparing(student -> student.name));
        System.out.println("Students sorted by marks (lowest first):");
        for (Student student : students) {
            System.out.println(student.name + ", marks " + student.marks);
        }
    }
}
