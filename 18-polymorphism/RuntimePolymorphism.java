import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private final double length;
    private final double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle radius, rectangle length, and width: ");

        if (!input.hasNextDouble()) {
            System.out.println("Please enter three finite, non-negative numbers.");
            return;
        }
        double radius = input.nextDouble();
        if (!input.hasNextDouble()) {
            System.out.println("Please enter three finite, non-negative numbers.");
            return;
        }
        double length = input.nextDouble();
        if (!input.hasNextDouble()) {
            System.out.println("Please enter three finite, non-negative numbers.");
            return;
        }
        double width = input.nextDouble();

        if (input.hasNext() || !Double.isFinite(radius) || !Double.isFinite(length)
                || !Double.isFinite(width) || radius < 0 || length < 0 || width < 0) {
            System.out.println("Please enter three finite, non-negative numbers.");
            return;
        }

        Shape[] shapes = {new Circle(radius), new Rectangle(length, width)};
        double circleArea = shapes[0].area();
        double rectangleArea = shapes[1].area();
        if (!Double.isFinite(circleArea) || !Double.isFinite(rectangleArea)) {
            System.out.println("The calculated area is too large.");
            return;
        }

        System.out.printf("Circle area: %.2f%nRectangle area: %.2f%n",
                circleArea, rectangleArea);
    }
}
