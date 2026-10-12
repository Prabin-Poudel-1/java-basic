import java.util.NoSuchElementException;
import java.util.Scanner;

/** Assign a letter grade to a score out of 100 using an example scale. */
public class GradeCalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter one score out of 100: ");
            double score = Double.parseDouble(input.nextLine().trim());
            if (!Double.isFinite(score) || score < 0 || score > 100) {
                System.out.println("Score must be finite and between 0 and 100.");
                return;
            }

            // Descending comparisons select the first matching grade band.
            char grade;
            if (score >= 90) grade = 'A';
            else if (score >= 80) grade = 'B';
            else if (score >= 70) grade = 'C';
            else if (score >= 60) grade = 'D';
            else if (score >= 50) grade = 'E';
            else grade = 'F';
            System.out.println("Grade: " + grade);
        } catch (NoSuchElementException | NumberFormatException exception) {
            System.out.println("Invalid input.");
        }
    }
}
