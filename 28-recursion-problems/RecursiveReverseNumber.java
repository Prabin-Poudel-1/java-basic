import java.util.Scanner;
public class RecursiveReverseNumber {
    private static long reverse(long value,long result){if(value==0)return result;return reverse(value/10,result*10+value%10);}
    public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Enter a signed 32-bit whole number: ");if(!in.hasNextInt()){System.out.println("Enter one signed 32-bit whole number.");return;}int number=in.nextInt();if(in.hasNext()){System.out.println("Enter only one whole number.");return;}long magnitude=Math.abs((long)number);long reversed=reverse(magnitude,0);System.out.println("Reversed number: "+(number<0?-reversed:reversed));}
}
