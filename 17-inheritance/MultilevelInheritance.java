import java.util.Scanner;
public class MultilevelInheritance {
 static class Person {String name;void showPerson(){System.out.println("Name: "+name);}}
 static class Employee extends Person {int id;void showEmployee(){showPerson();System.out.println("Employee ID: "+id);}}
 static class Manager extends Employee {String department;void show(){showEmployee();System.out.println("Department: "+department);}}
 public static void main(String[]a){Scanner s=new Scanner(System.in);Manager m=new Manager();System.out.print("Name: ");m.name=s.nextLine().trim();System.out.print("ID: ");if(!s.hasNextInt())return;m.id=s.nextInt();s.nextLine();System.out.print("Department: ");m.department=s.nextLine().trim();if(m.name.isEmpty()||m.id<1||m.department.isEmpty()){System.out.println("All fields required; ID must be positive.");return;}m.show();}
}
