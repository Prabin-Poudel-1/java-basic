public class ConstructorExample {
    private static class Student {
        String name;
        int rollNumber;

        Student() {
            name = "New Student";
            rollNumber = 1;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Roll number: " + rollNumber);
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.display();
    }
}
