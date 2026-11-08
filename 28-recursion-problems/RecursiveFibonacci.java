import java.util.Scanner;
public class RecursiveFibonacci {
    private static long fibonacci(int n,long[] memo){if(n<2)return n;if(memo[n]!=-1)return memo[n];memo[n]=fibonacci(n-1,memo)+fibonacci(n-2,memo);return memo[n];}
    public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Enter number of terms (0-93): ");if(!in.hasNextInt()){System.out.println("Enter one whole number from 0 to 93.");return;}int count=in.nextInt();if(in.hasNext()||count<0||count>93){System.out.println("Terms must be from 0 to 93.");return;}long[] memo=new long[Math.max(2,count)];java.util.Arrays.fill(memo,-1);System.out.print("Fibonacci series: ");for(int i=0;i<count;i++){if(i>0)System.out.print(" ");System.out.print(fibonacci(i,memo));}if(count==0)System.out.print("No terms");System.out.println();}
}
