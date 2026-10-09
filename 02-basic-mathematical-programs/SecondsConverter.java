import java.util.NoSuchElementException;
import java.util.Scanner;

/** Split a non-negative number of seconds into hours, minutes, and seconds. */
public class SecondsConverter {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter total seconds (whole number): ");
            long totalSeconds = Long.parseLong(input.nextLine().trim());
            if (totalSeconds < 0) {
                System.out.println("Seconds cannot be negative.");
                return;
            }

            // Division gives whole units; remainder keeps the unconverted part.
            long hours = totalSeconds / 3600;
            long minutes = (totalSeconds % 3600) / 60;
            long seconds = totalSeconds % 60;
            System.out.println("Hours: " + hours);
            System.out.println("Minutes: " + minutes);
            System.out.println("Seconds: " + seconds);
        } catch (NoSuchElementException | NumberFormatException exception) {
            System.out.println("Invalid input. Enter one whole number within the 64-bit signed range.");
        }
    }
}
