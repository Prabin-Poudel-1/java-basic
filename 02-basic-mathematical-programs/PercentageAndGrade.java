import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

/** Calculate a percentage and assign a grade using an example practice scale. */
public class PercentageAndGrade {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.ROOT);
            System.out.print("Enter obtained marks and maximum marks: ");
            double obtained = input.nextDouble();
            double maximum = input.nextDouble();
            if (!Double.isFinite(obtained) || !Double.isFinite(maximum)
                    || maximum <= 0 || obtained < 0 || obtained > maximum) {
                System.out.println("Maximum marks must be positive; obtained marks must be between 0 and maximum. Both must be finite.");
                return;
            }

            double percentage = (obtained / maximum) * 100;
            // Practice scale: A >= 90, B >= 80, C >= 70, D >= 60, E >= 50; otherwise F.
            char grade;
            if (percentage >= 90) grade = 'A';
            else if (percentage >= 80) grade = 'B';
            else if (percentage >= 70) grade = 'C';
            else if (percentage >= 60) grade = 'D';
            else if (percentage >= 50) grade = 'E';
            else grade = 'F';

            System.out.printf(Locale.ROOT, "Percentage: %.2f%%%nGrade: %c%n", percentage, grade);
        } catch (NoSuchElementException exception) {
            System.out.println("Invalid input.");
        }
    }
}
