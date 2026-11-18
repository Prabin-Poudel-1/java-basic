import java.util.Scanner;

public class InterfaceBasedInheritance {
    private interface MeasurableShape {
        double area();
    }

    private static class Circle implements MeasurableShape {
        private final double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative circle radius: ");
        if (!input.hasNextDouble()) {
            System.out.println("Radius must be a finite non-negative number.");
            return;
        }
        double radius = input.nextDouble();
        if (input.hasNext() || !Double.isFinite(radius) || radius < 0) {
            System.out.println("Radius must be a finite non-negative number.");
            return;
        }
        MeasurableShape circle = new Circle(radius);
        System.out.printf("Circle area: %.2f%n", circle.area());
    }
}
