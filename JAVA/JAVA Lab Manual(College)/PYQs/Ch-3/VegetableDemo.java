/*The abstract vegetable class has three subclasses named Potato, 
    Brinjal and Tomato. Write a java program that demonstrates how to
    establish this class hierarchy. Declare one instance variable of 
    type String that indicates the color of a vegetable. Create and 
    display instances of these objects. Override the toString() method 
    of object to return a string with the name of vegetable and its 
color. */

public class VegetableDemo {
    public static void main(String[] args) {

        Potato potato = new Potato("Brown");
        Brinjal brinjal = new Brinjal("Purple");
        Tomato tomato = new Tomato("Red");

        System.out.println(potato);
        System.out.println(brinjal);
        System.out.println(tomato);
    }
}

abstract class Vegetable {
    String color;

    public Vegetable(String color) {
        this.color = color;
    }

    public abstract String toString();
}

class Potato extends Vegetable {
    public Potato(String color) {
        super(color);
    }

    public String toString() {
        return "Potato (Color: " + color + ")";
    }
}

class Brinjal extends Vegetable {
    public Brinjal(String color) {
        super(color);
    }

    public String toString() {
        return "Brinjal (Color: " + color + ")";
    }
}

class Tomato extends Vegetable {
    public Tomato(String color) {
        super(color);
    }

    public String toString() {
        return "Tomato (Color: " + color + ")";
    }
}
