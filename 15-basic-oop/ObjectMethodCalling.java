import java.util.Scanner;

public class ObjectMethodCalling {
    private static class Greeter {
        String name;

        void greet() {
            System.out.println("Hello, " + name + "!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Greeter greeter = new Greeter();
        System.out.print("Enter your name: ");
        if (!input.hasNextLine() || (greeter.name = input.nextLine().trim()).isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        // Create an object, set its data, and call its method.
        greeter.greet();
    }
}
