import java.util.Scanner;

public class ComplexNumberAddition {
    private static final class ComplexNumber {
        private final double real;
        private final double imaginary;

        ComplexNumber(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        ComplexNumber add(ComplexNumber other) {
            return new ComplexNumber(real + other.real, imaginary + other.imaginary);
        }

        void display() {
            System.out.printf("%.2f %s %.2fi%n", real,
                    imaginary < 0 ? "-" : "+", Math.abs(imaginary));
        }

        boolean hasFiniteParts() {
            return Double.isFinite(real) && Double.isFinite(imaginary);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] parts = new double[4];
        System.out.print("Enter real and imaginary parts of both numbers: ");
        for (int i = 0; i < parts.length; i++) {
            if (!input.hasNextDouble()) {
                System.out.println("Please enter four finite numbers.");
                return;
            }
            parts[i] = input.nextDouble();
            if (!Double.isFinite(parts[i])) {
                System.out.println("Please enter four finite numbers.");
                return;
            }
        }
        if (input.hasNext()) {
            System.out.println("Please enter four finite numbers.");
            return;
        }

        ComplexNumber sum = new ComplexNumber(parts[0], parts[1])
                .add(new ComplexNumber(parts[2], parts[3]));
        if (!sum.hasFiniteParts()) {
            System.out.println("The sum is too large to display.");
            return;
        }
        System.out.print("Sum: ");
        sum.display();
    }
}
