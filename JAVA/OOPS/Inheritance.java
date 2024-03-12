package OOPS;

public class Inheritance {

    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();

    }
}

// Base Class(Parant Class)
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("Breaths");
    }
}

// Derived Class (Child Class)
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}

/*
 * Types of Inheritance in JAVA -> (i)Single Level Inheritance (e.g.:
 * Animal->Fish)
 * (ii)Multi Level Inheritance (e.g.: Animal->Mammal->Dog)
 * (iii)Hierarchial Inheritance (e.g.: Animal->Fish,Bird,Mammal)
 * (iv)Hybrid Inheritance (e.g.: Animal->Fish,Mammal->Dog,Cat)
 * (v)Mutiple Inheritance(Can be Inherited Indirectly in Java but not using
 * extends keyword) (e.g.: Milk,Sugar->Tea)
 */

class Bird extends Animal {
    void fly() {
        System.out.println("Flies");
    }
}

class Mammal extends Animal {
    int legs;

    void walks() {
        System.out.println("Walks");
    }
}

class Dog extends Mammal {
    String breed;
}

class Cat extends Mammal {
    String breed;
}