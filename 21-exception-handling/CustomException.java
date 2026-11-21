import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {
    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 130) {
            throw new InvalidAgeException("Age must be between 0 and 130.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
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
            validateAge(age);
            System.out.println("Valid age: " + age);
        } catch (InvalidAgeException error) {
            System.out.println(error.getMessage());
        }
    }
}
