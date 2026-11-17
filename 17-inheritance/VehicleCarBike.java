import java.util.Scanner;
public class VehicleCarBike {
 static class Vehicle {String brand;int speed;void display(){System.out.println("Brand: "+brand);System.out.println("Speed: "+speed+" km/h");}}
 static class Car extends Vehicle {int seats;void show(){display();System.out.println("Seats: "+seats);}}
 static class Bike extends Vehicle {int gears;void show(){display();System.out.println("Gears: "+gears);}}
 static int positive(Scanner s){return s.hasNextInt()?s.nextInt():-1;}
 public static void main(String[]x){Scanner s=new Scanner(System.in);Car c=new Car();Bike b=new Bike();System.out.print("Car brand speed seats: ");if(!s.hasNext())return;c.brand=s.next();c.speed=positive(s);c.seats=positive(s);System.out.print("Bike brand speed gears: ");if(!s.hasNext())return;b.brand=s.next();b.speed=positive(s);b.gears=positive(s);if(c.speed<1||c.seats<1||b.speed<1||b.gears<1){System.out.println("Speed, seats, and gears must be positive whole numbers.");return;}System.out.println("Car:");c.show();System.out.println("Bike:");b.show();}
}
