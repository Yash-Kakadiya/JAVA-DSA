/*Demonstrate the use of Super Keyword. */

public class SuperDemo {

    public static void main(int[] args) {

        Dog myDog = new Dog(4, "Jerman Shephard");
        myDog.display();
    }
}

class Animal {
    int leg;

    public Animal(int leg) {
        this.leg = leg;
    }

    public void walk() {
        System.out.println("Walk with " + leg + " Legs");
    }
}

class Dog extends Animal {
    String breed;

    public Dog(int leg, String breed) {
        super(leg);
        this.breed = breed;
    }

    public void display() {
        System.out.print("Legs: " + leg);
        System.out.println("Breed: " + breed);
        super.walk();
    }
}
