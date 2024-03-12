package OOPS;

public class Abstraction {
    /*
     * Hiding all the unnecessary details and showing only the importane parts to
     * the user.(gives idea but not implementation)
     * Abstraction Implementation->
     * (i)Abstract Classes
     * (ii) Interfaces
     */
    public static void main(String[] args) {

        // (i)Abstract Classes

        // Animal a=new Animal();
        Lion l = new Lion();
        l.eat();
        l.walk();
        System.out.println(l.color);

        Human h = new Human();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);
        System.out.println("--------------------------------");

        Barbary bl = new Barbary();
        // Animal->Lion->Barbary

        System.out.println("--------------------------------");
        
        // (ii)Interfaces
        Queen q = new Queen();
        q.moves();
    }
}

/*
 * (i)Abstract Classes-> can be inherited using extends keyword
 * (a)Can't create an instance(object) of abstract class
 * (b)Can have abstarct/non-abstract methods
 * (c)Can have costructor
 */
abstract class Animal {
    String color;

    Animal() {
        color = "brown";
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal Eats");
    }

    abstract void walk();
}

class Lion extends Animal {
    Lion() {
        System.out.println("Lion constructor called");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Barbary extends Lion {
    Barbary() {
        System.out.println("Barbary constructor called");
    }
}

class Human extends Animal {
    void changeColor() {
        color = "light brown";
    }

    void walk() {
        System.out.println("Walks on 2 legs");
    }
}

/*
 * (ii)Interfaces->Its is a blueprint of a class
 * 
 * uses->(a)multiple inheritance (e.g.: Herbivore,Carnivore->Bear)
 * (b)total abstraction
 *
 * properties->(a)can be inherited using implements keyword
 * (b)all methods are public, abstract and without implementation
 * (c)used to achieve abstraction (default)
 * (d)variables in the interface are final, public and static (default)
 */

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal-(in all 4 direction)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal-(in by 1 step)");
    }
}