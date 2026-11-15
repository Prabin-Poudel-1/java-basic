import java.util.Scanner;

public class StudentMarksValidation {
    private static class Student {
        private final int[] marks = new int[3];

        boolean setMark(int subject, int mark) {
            if (subject < 0 || subject >= marks.length || mark < 0 || mark > 100) {
                return false;
            }
            marks[subject] = mark;
            return true;
        }

        int getMark(int subject) {
            return marks[subject];
        }

        double average() {
            int total = 0;
            for (int mark : marks) {
                total += mark;
            }
            return total / (double) marks.length;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        for (int subject = 0; subject < 3; subject++) {
            System.out.print("Enter marks for subject " + (subject + 1) + " (0-100): ");
            if (!input.hasNextInt()) {
                System.out.println("Marks must be whole numbers from 0 to 100.");
                return;
            }
            int mark = input.nextInt();
            if (!student.setMark(subject, mark)) {
                System.out.println("Marks must be whole numbers from 0 to 100.");
                return;
            }
        }
        if (input.hasNext()) {
            System.out.println("Enter exactly three marks.");
            return;
        }

        System.out.println("Validated marks:");
        for (int subject = 0; subject < 3; subject++) {
            System.out.println("Subject " + (subject + 1) + ": " + student.getMark(subject));
        }
        System.out.printf("Average: %.2f%n", student.average());
    }
}
