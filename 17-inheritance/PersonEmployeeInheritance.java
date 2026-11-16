import java.util.Scanner;
public class PersonEmployeeInheritance {
 static class Person { String name; int age; void display(){System.out.println("Name: "+name);System.out.println("Age: "+age);} }
 static class Employee extends Person { int id; double salary; void displayEmployee(){display();System.out.println("Employee ID: "+id);System.out.printf("Monthly salary: %.2f%n",salary);} }
 public static void main(String[] a){Scanner s=new Scanner(System.in);Employee e=new Employee();System.out.print("Name: ");e.name=s.nextLine().trim();System.out.print("Age: ");if(!s.hasNextInt()){System.out.println("Invalid age.");return;}e.age=s.nextInt();System.out.print("Employee ID: ");if(!s.hasNextInt()){System.out.println("Invalid ID.");return;}e.id=s.nextInt();System.out.print("Monthly salary: ");if(!s.hasNextDouble()){System.out.println("Invalid salary.");return;}e.salary=s.nextDouble();if(e.name.isEmpty()||e.age<1||e.id<1||!Double.isFinite(e.salary)||e.salary<0){System.out.println("Enter a name, positive age and ID, and non-negative salary.");return;}e.displayEmployee();}
}
