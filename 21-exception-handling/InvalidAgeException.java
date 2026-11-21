import java.util.Scanner;

public class InvalidAgeException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age (0 to 130): ");
        if (!input.hasNextInt()) {
            System.out.println("Age must be a whole number.");
            return;
        }
        int age = input.nextInt();
        if (input.hasNext()) {
            System.out.println("Enter one whole-number age only.");
            return;
        }

        try {
            if (age < 0 || age > 130) {
                throw new IllegalArgumentException("Age must be between 0 and 130.");
            }
            System.out.println("Age accepted: " + age);
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
    }
}
