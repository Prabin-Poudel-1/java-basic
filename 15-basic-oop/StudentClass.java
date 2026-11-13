import java.util.Scanner;

public class StudentClass {
    private static class Student {
        String name;
        int rollNumber;
        int age;

        void displayDetails() {
            System.out.println("Student details:");
            System.out.println("Name: " + name);
            System.out.println("Roll number: " + rollNumber);
            System.out.println("Age: " + age);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student name: ");
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

        student.displayDetails();
    }
}
