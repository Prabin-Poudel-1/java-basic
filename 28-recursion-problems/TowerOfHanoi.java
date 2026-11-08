import java.util.Scanner;
public class TowerOfHanoi {
    private static void move(int disks,char from,char to,char spare){if(disks==0)return;move(disks-1,from,spare,to);System.out.println("Move disk "+disks+" from "+from+" to "+to);move(disks-1,spare,to,from);}
    public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Enter number of disks (1-10): ");if(!in.hasNextInt()){System.out.println("Enter one whole number from 1 to 10.");return;}int n=in.nextInt();if(in.hasNext()||n<1||n>10){System.out.println("Number of disks must be from 1 to 10.");return;}move(n,'A','C','B');System.out.println("Total moves: "+((1L<<n)-1));}
}
