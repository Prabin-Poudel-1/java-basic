import java.util.Scanner;
public class RecursiveGcd {
    private static long gcd(long a,long b){return b==0?a:gcd(b,a%b);}
    public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Enter two 32-bit whole numbers: ");if(!in.hasNextInt()){System.out.println("Enter two 32-bit whole numbers.");return;}long a=in.nextInt();if(!in.hasNextInt()){System.out.println("Enter two 32-bit whole numbers.");return;}long b=in.nextInt();if(in.hasNext()){System.out.println("Enter only two whole numbers.");return;}System.out.println("GCD/HCF: "+gcd(Math.abs(a),Math.abs(b)));}
}
