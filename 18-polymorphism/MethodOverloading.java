import java.util.Scanner;
public class MethodOverloading {
 static class AreaCalculator {
  double area(double radius){return Math.PI*radius*radius;}
  double area(double length,double width){return length*width;}
 }
 public static void main(String[]args){Scanner s=new Scanner(System.in);System.out.print("Enter circle radius: ");if(!s.hasNextDouble())return;double r=s.nextDouble();System.out.print("Enter rectangle length and width: ");if(!s.hasNextDouble())return;double l=s.nextDouble();if(!s.hasNextDouble())return;double w=s.nextDouble();if(s.hasNext()||r<0||l<0||w<0||!Double.isFinite(r)||!Double.isFinite(l)||!Double.isFinite(w)){System.out.println("Dimensions must be finite and non-negative.");return;}AreaCalculator c=new AreaCalculator();System.out.printf("Circle area: %.2f%nRectangle area: %.2f%n",c.area(r),c.area(l,w));}
}
