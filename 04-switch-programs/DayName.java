import java.util.NoSuchElementException;
import java.util.Scanner;

/** Map 1 (Monday) through 7 (Sunday) to a day name using switch. */
public class DayName {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a day number (1 = Monday, 7 = Sunday): ");
            int number = Integer.parseInt(input.nextLine().trim());
            String day;
            switch (number) {
                case 1: day = "Monday"; break;
                case 2: day = "Tuesday"; break;
                case 3: day = "Wednesday"; break;
                case 4: day = "Thursday"; break;
                case 5: day = "Friday"; break;
                case 6: day = "Saturday"; break;
                case 7: day = "Sunday"; break;
                default:
                    System.out.println("Day number must be between 1 and 7.");
                    return;
            }
            System.out.println(day);
        } catch (NoSuchElementException | NumberFormatException exception) {
            System.out.println("Invalid input. Enter one whole-number day.");
        }
    }
}
