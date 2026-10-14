import java.util.NoSuchElementException;
import java.util.Scanner;

/** Map 1 (January) through 12 (December) to a month name using switch. */
public class MonthName {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a month number (1 = January, 12 = December): ");
            int number = Integer.parseInt(input.nextLine().trim());
            String month;
            switch (number) {
                case 1: month = "January"; break;
                case 2: month = "February"; break;
                case 3: month = "March"; break;
                case 4: month = "April"; break;
                case 5: month = "May"; break;
                case 6: month = "June"; break;
                case 7: month = "July"; break;
                case 8: month = "August"; break;
                case 9: month = "September"; break;
                case 10: month = "October"; break;
                case 11: month = "November"; break;
                case 12: month = "December"; break;
                default:
                    System.out.println("Month number must be between 1 and 12.");
                    return;
            }
            System.out.println(month);
        } catch (NoSuchElementException | NumberFormatException exception) {
            System.out.println("Invalid input. Enter one whole-number month.");
        }
    }
}
