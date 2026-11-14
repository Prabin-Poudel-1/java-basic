import java.util.Scanner;

public class RectangleClass {
    private static class Rectangle {
        double length;
        double width;

        double area() {
            return length * width;
        }

        double perimeter() {
            return 2 * (length + width);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.print("Enter non-negative length and width: ");
        if (!input.hasNextDouble()) {
            System.out.println("Length and width must be finite, non-negative numbers.");
            return;
        }
        rectangle.length = input.nextDouble();
        if (!input.hasNextDouble()) {
            System.out.println("Length and width must be finite, non-negative numbers.");
            return;
        }
        rectangle.width = input.nextDouble();
        if (input.hasNext() || !Double.isFinite(rectangle.length) || !Double.isFinite(rectangle.width)
                || rectangle.length < 0 || rectangle.width < 0
                || !Double.isFinite(rectangle.area()) || !Double.isFinite(rectangle.perimeter())) {
            System.out.println("Length and width must be finite, non-negative numbers.");
            return;
        }

        System.out.printf("Area: %.2f%n", rectangle.area());
        System.out.printf("Perimeter: %.2f%n", rectangle.perimeter());
    }
}
