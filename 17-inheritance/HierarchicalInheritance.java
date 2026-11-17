import java.util.Scanner;
public class HierarchicalInheritance {
 static class Person {String name;Person(String n){name=n;}void show(){System.out.println("Name: "+name);}}
 static class Student extends Person {int roll;Student(String n,int r){super(n);roll=r;}void show(){super.show();System.out.println("Roll: "+roll);}}
 static class Teacher extends Person {String subject;Teacher(String n,String s){super(n);subject=s;}void show(){super.show();System.out.println("Subject: "+subject);}}
 public static void main(String[]a){Scanner s=new Scanner(System.in);System.out.print("Student name and roll: ");String n=s.nextLine().trim();if(!s.hasNextInt())return;int r=s.nextInt();s.nextLine();System.out.print("Teacher name and subject: ");String t=s.nextLine().trim();String sub=s.nextLine().trim();if(n.isEmpty()||r<1||t.isEmpty()||sub.isEmpty()){System.out.println("Enter valid non-empty details and positive roll.");return;}System.out.println("Student:");new Student(n,r).show();System.out.println("Teacher:");new Teacher(t,sub).show();}
}
