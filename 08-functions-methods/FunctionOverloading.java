import java.util.Scanner;

public class FunctionOverloading {
    private static int add(int first, int second) { return first + second; }
    private static double add(double first, double second) { return first + second; }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two whole numbers, then two decimal numbers: ");
        if(!input.hasNextInt()){System.out.println("Enter two whole numbers and two finite decimal numbers.");return;}
        int a=input.nextInt(); if(!input.hasNextInt()){System.out.println("Enter two whole numbers and two finite decimal numbers.");return;} int b=input.nextInt();
        if(!input.hasNextDouble()){System.out.println("Enter two whole numbers and two finite decimal numbers.");return;} double x=input.nextDouble(); if(!input.hasNextDouble()){System.out.println("Enter two whole numbers and two finite decimal numbers.");return;} double y=input.nextDouble();
        if(input.hasNext()||!Double.isFinite(x)||!Double.isFinite(y)){System.out.println("Enter exactly four valid numbers.");return;}
        System.out.println("Integer sum: "+add(a,b));System.out.println("Decimal sum: "+add(x,y));
    }
}
