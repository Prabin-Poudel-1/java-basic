import java.util.Scanner;

public class PassArgumentsReturnValue {
    private static double rectangleArea(double length, double width) { return length * width; }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rectangle length and width: ");
        if(!input.hasNextDouble()){System.out.println("Enter two finite non-negative dimensions.");return;} double length=input.nextDouble();
        if(!input.hasNextDouble()){System.out.println("Enter two finite non-negative dimensions.");return;} double width=input.nextDouble();
        if(input.hasNext()||!Double.isFinite(length)||!Double.isFinite(width)||length<0||width<0){System.out.println("Dimensions must be finite and non-negative.");return;}
        System.out.printf("Area: %.2f%n",rectangleArea(length,width));
    }
}
