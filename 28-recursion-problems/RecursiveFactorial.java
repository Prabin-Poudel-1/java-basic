import java.util.Scanner;
public class RecursiveFactorial {
    private static long factorial(int n) { return n <= 1 ? 1 : n * factorial(n - 1); }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);System.out.print("Enter a whole number from 0 to 20: ");
        if(!in.hasNextInt()){System.out.println("Enter one whole number from 0 to 20.");return;}int n=in.nextInt();
        if(in.hasNext()||n<0||n>20){System.out.println("Number must be from 0 to 20.");return;}
        System.out.println("Factorial: "+factorial(n));
    }
}
