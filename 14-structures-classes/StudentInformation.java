import java.util.Scanner;

public class StudentInformation {
    private static class Student {
        String name;
        int rollNumber;
        int age;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student name: ");
        if (!input.hasNextLine()) {
            System.out.println("A name is required.");
            return;
        }
        student.name = input.nextLine().trim();
        if (student.name.isEmpty()) {
            System.out.println("A name is required.");
            return;
        }

        System.out.print("Enter roll number: ");
        if (!input.hasNextLine()) {
            System.out.println("Roll number and age must be positive whole numbers.");
            return;
        }
        try {
            student.rollNumber = Integer.parseInt(input.nextLine().trim());
            System.out.print("Enter age: ");
            if (!input.hasNextLine()) {
                System.out.println("Roll number and age must be positive whole numbers.");
                return;
            }
            student.age = Integer.parseInt(input.nextLine().trim());
        } catch (NumberFormatException exception) {
            System.out.println("Roll number and age must be positive whole numbers.");
            return;
        }
        if (student.rollNumber < 1 || student.age < 1) {
            System.out.println("Roll number and age must be positive whole numbers.");
            return;
        }

        System.out.println("Student information:");
        System.out.println("Name: " + student.name);
        System.out.println("Roll number: " + student.rollNumber);
        System.out.println("Age: " + student.age);
    }
}
