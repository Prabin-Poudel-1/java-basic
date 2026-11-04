import java.util.Scanner;
public class ProductOfDigits {
 public static void main(String[] args) {
  Scanner in=new Scanner(System.in); System.out.print("Enter a signed whole number: ");
  if(!in.hasNextLong()){System.out.println("Please enter one signed 64-bit whole number.");return;}
  long n=in.nextLong(); if(in.hasNext()){System.out.println("Please enter only one whole number.");return;}
  long product=1; do { product*=Math.abs(n%10); n/=10; } while(n!=0);
  System.out.println("Product of digits: "+product);
 }
}
