import java.util.Scanner;

public class PersonStudentInheritance {
    private static class Person {
        String name;
        int age;

        void displayPersonDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    private static class Student extends Person {
        int rollNumber;

        void displayStudentDetails() {
            displayPersonDetails();
            System.out.println("Roll number: " + rollNumber);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter student name: ");
        if (!input.hasNextLine() || (student.name = input.nextLine().trim()).isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }
        System.out.print("Enter positive age: ");
        if (!input.hasNextInt()) {
            System.out.println("Age must be a positive whole number.");
            return;
        }
        student.age = input.nextInt();
        System.out.print("Enter positive roll number: ");
        if (!input.hasNextInt()) {
            System.out.println("Roll number must be a positive whole number.");
            return;
        }
        student.rollNumber = input.nextInt();
        if (student.age < 1 || student.rollNumber < 1 || input.hasNext()) {
            System.out.println("Age and roll number must be positive whole numbers.");
            return;
        }

        System.out.println("Student details:");
        student.displayStudentDetails();
    }
}
