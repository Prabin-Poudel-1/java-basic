public class ConstructorOverloading {
    private static class Student {
        String name;
        int rollNumber;

        Student() {
            this("New Student", 1);
        }

        Student(String name, int rollNumber) {
            this.name = name;
            this.rollNumber = rollNumber;
        }

        void display() {
            System.out.println("Name: " + name + ", Roll number: " + rollNumber);
        }
    }

    public static void main(String[] args) {
        Student defaultStudent = new Student();
        Student namedStudent = new Student("Grace Hopper", 102);

        System.out.println("Default constructor:");
        defaultStudent.display();
        System.out.println("Parameterized constructor:");
        namedStudent.display();
    }
}
