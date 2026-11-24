import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRecordsCollection {
    private static class Student {
        private final String name;
        private final double marks;

        private Student(String name, double marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add student  2. List students  3. Search  4. Delete  0. Exit");
            System.out.print("Choice: ");
            if (!input.hasNextLine()) {
                break;
            }
            String choice = input.nextLine().trim();

            if (choice.equals("0")) {
                break;
            } else if (choice.equals("1")) {
                addStudent(input, students);
            } else if (choice.equals("2")) {
                listStudents(students);
            } else if (choice.equals("3")) {
                searchStudent(input, students);
            } else if (choice.equals("4")) {
                deleteStudent(input, students);
            } else {
                System.out.println("Choose 1, 2, 3, 4, or 0.");
            }
        }
    }

    private static void addStudent(Scanner input, List<Student> students) {
        System.out.print("Student name: ");
        if (!input.hasNextLine()) {
            return;
        }
        String name = input.nextLine().trim();
        if (name.isEmpty() || name.contains(",")) {
            System.out.println("Name must be non-empty and cannot contain a comma.");
            return;
        }

        System.out.print("Marks (0 to 100): ");
        if (!input.hasNextLine()) {
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
            System.out.println("Student added.");
        } catch (NumberFormatException error) {
            System.out.println("Marks must be a number from 0 to 100.");
        }
    }

    private static void listStudents(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students stored.");
            return;
        }
        for (Student student : students) {
            System.out.println(student.name + ", marks " + student.marks);
        }
    }

    private static void searchStudent(Scanner input, List<Student> students) {
        System.out.print("Name to search: ");
        if (!input.hasNextLine()) {
            return;
        }
        String wantedName = input.nextLine().trim();
        for (Student student : students) {
            if (student.name.equals(wantedName)) {
                System.out.println("Found: " + student.name + ", marks " + student.marks);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void deleteStudent(Scanner input, List<Student> students) {
        System.out.print("Name to delete: ");
        if (!input.hasNextLine()) {
            return;
        }
        String wantedName = input.nextLine().trim();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).name.equals(wantedName)) {
                students.remove(i);
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
