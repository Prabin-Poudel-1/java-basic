import java.util.Scanner;
public class ShapeCircleRectangle {
 abstract static class Shape { abstract double area(); }
 static class Circle extends Shape { double r; Circle(double x){r=x;} double area(){return Math.PI*r*r;} }
 static class Rectangle extends Shape { double l,w; Rectangle(double a,double b){l=a;w=b;} double area(){return l*w;} }
 public static void main(String[] x){Scanner s=new Scanner(System.in);System.out.print("Enter circle radius: ");if(!s.hasNextDouble())return;double r=s.nextDouble();System.out.print("Enter rectangle length and width: ");if(!s.hasNextDouble())return;double l=s.nextDouble();if(!s.hasNextDouble())return;double w=s.nextDouble();if(r<0||l<0||w<0||!Double.isFinite(r)||!Double.isFinite(l)||!Double.isFinite(w)){System.out.println("Dimensions must be finite and non-negative.");return;}Shape c=new Circle(r),q=new Rectangle(l,w);System.out.printf("Circle area: %.2f%nRectangle area: %.2f%n",c.area(),q.area());}
}
