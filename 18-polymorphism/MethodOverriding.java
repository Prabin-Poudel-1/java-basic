// A subclass can replace an inherited method with its own behavior.
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal ordinaryAnimal = new Animal();
        ordinaryAnimal.makeSound();

        // The base-class reference calls the overridden Dog method at runtime.
        Animal pet = new Dog();
        pet.makeSound();
    }
}
