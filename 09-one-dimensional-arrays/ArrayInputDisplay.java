import java.util.Scanner;
public class ArrayInputDisplay {
 public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Enter array size (1-100): ");if(!in.hasNextInt()){System.out.println("Enter a whole number from 1 to 100.");return;}int n=in.nextInt();if(n<1||n>100){System.out.println("Array size must be from 1 to 100.");return;}int[] a=new int[n];System.out.print("Enter "+n+" whole numbers: ");for(int i=0;i<n;i++){if(!in.hasNextInt()){System.out.println("Enter exactly "+n+" whole numbers.");return;}a[i]=in.nextInt();}if(in.hasNext()){System.out.println("Enter only the array values.");return;}System.out.print("Array: ");for(int i=0;i<n;i++){if(i>0)System.out.print(" ");System.out.print(a[i]);}System.out.println();}
}
