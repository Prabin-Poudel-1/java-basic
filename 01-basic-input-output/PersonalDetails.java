import java.util.Locale;
import java.util.Scanner;

/** Read name, age, and address. */
public class PersonalDetails {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.ROOT);
            System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Age: ");
        int age = Integer.parseInt(input.nextLine().trim());
        if (age < 0) {
            System.out.println("Age cannot be negative.");
            return;
        }
        System.out.print("Address: ");
        String address = input.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        } catch (java.util.NoSuchElementException
                 | NumberFormatException exception) {
            System.out.println("Invalid input.");
        }
    }
}
