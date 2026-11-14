import java.util.Scanner;

public class PrivateVariables {
    private static class Student {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public boolean setName(String name) {
            if (name == null || name.trim().isEmpty()) {
                return false;
            }
            this.name = name.trim();
            return true;
        }

        public int getAge() {
            return age;
        }

        public boolean setAge(int age) {
            if (age < 1) {
                return false;
            }
            this.age = age;
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter student name: ");
        if (!input.hasNextLine() || !student.setName(input.nextLine())) {
            System.out.println("Name cannot be empty.");
            return;
        }
        System.out.print("Enter positive age: ");
        if (!input.hasNextInt() || !student.setAge(input.nextInt()) || input.hasNext()) {
            System.out.println("Age must be a positive whole number.");
            return;
        }

        System.out.println("Student details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
