class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("I can walk on land");
    }
}

class Dog extends Mammal {
    @Override
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

public class Manimal {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Calls overridden method in Dog
        myDog.walk();      // Calls method from Mammal
    }
}
