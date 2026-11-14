import java.util.Scanner;

public class ParameterizedConstructor {
    private static class Student {
        String name;
        int rollNumber;

        Student(String name, int rollNumber) {
            this.name = name;
            this.rollNumber = rollNumber;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Roll number: " + rollNumber);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student name: ");
        if (!input.hasNextLine()) {
            System.out.println("Student name cannot be empty.");
            return;
        }
        String name = input.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Student name cannot be empty.");
            return;
        }
        System.out.print("Enter positive roll number: ");
        if (!input.hasNextLine()) {
            System.out.println("Roll number must be a positive whole number.");
            return;
        }
        int rollNumber;
        try {
            rollNumber = Integer.parseInt(input.nextLine().trim());
        } catch (NumberFormatException exception) {
            System.out.println("Roll number must be a positive whole number.");
            return;
        }
        if (rollNumber < 1) {
            System.out.println("Roll number must be a positive whole number.");
            return;
        }

        Student student = new Student(name, rollNumber);
        student.display();
    }
}
