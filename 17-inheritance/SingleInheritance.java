import java.util.Scanner;
public class SingleInheritance {
 static class Animal {String name;void describe(){System.out.println("Animal: "+name);}}
 static class Dog extends Animal {String breed;void show(){describe();System.out.println("Breed: "+breed);System.out.println("Sound: Woof!");}}
 public static void main(String[]a){Scanner s=new Scanner(System.in);Dog d=new Dog();System.out.print("Animal name: ");d.name=s.nextLine().trim();System.out.print("Breed: ");d.breed=s.nextLine().trim();if(d.name.isEmpty()||d.breed.isEmpty()){System.out.println("Name and breed are required.");return;}d.show();}
}
