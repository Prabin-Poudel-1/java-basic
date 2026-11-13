import java.util.Scanner;

public class MultipleStudentRecords {
    private static class Student {
        String name;
        int rollNumber;
        int age;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students (1-100): ");
        if (!input.hasNextInt()) {
            System.out.println("Student count must be a whole number from 1 to 100.");
            return;
        }

        int count = input.nextInt();
        input.nextLine();
        if (count < 1 || count > 100) {
            System.out.println("Student count must be a whole number from 1 to 100.");
            return;
        }

        Student[] students = new Student[count];
        for (int i = 0; i < count; i++) {
            Student student = new Student();
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
            if (!input.hasNextLine()) {
                System.out.println("Roll number must be a positive whole number.");
                return;
            }
            try {
                student.rollNumber = Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException exception) {
                System.out.println("Roll number must be a positive whole number.");
                return;
            }
            if (student.rollNumber < 1) {
                System.out.println("Roll number must be a positive whole number.");
                return;
            }

            System.out.print("Enter positive age: ");
            if (!input.hasNextLine()) {
                System.out.println("Age must be a positive whole number.");
                return;
            }
            try {
                student.age = Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException exception) {
                System.out.println("Age must be a positive whole number.");
                return;
            }
            if (student.age < 1) {
                System.out.println("Age must be a positive whole number.");
                return;
            }
            students[i] = student;
        }

        System.out.println("Student records:");
        for (Student student : students) {
            System.out.println("Name: " + student.name);
            System.out.println("Roll number: " + student.rollNumber);
            System.out.println("Age: " + student.age);
            System.out.println();
        }
    }
}
