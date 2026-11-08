import java.util.Scanner;
public class RecursiveSum {
    private static long sumDigits(long n){if(n>-10&&n<10)return Math.abs(n);return Math.abs(n%10)+sumDigits(n/10);}
    public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Enter a signed 64-bit whole number: ");if(!in.hasNextLong()){System.out.println("Enter one signed 64-bit whole number.");return;}long n=in.nextLong();if(in.hasNext()){System.out.println("Enter only one whole number.");return;}System.out.println("Sum of digits: "+sumDigits(n));}
}
