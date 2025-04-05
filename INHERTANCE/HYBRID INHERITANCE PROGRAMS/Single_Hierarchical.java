
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}


class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}


class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class Single_Hierarchical {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();  
        puppy.bark();
        puppy.weep();
        
        Cat cat = new Cat();
        cat.eat();
        cat.meow(); 
    }
}