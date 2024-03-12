package OOPS;

public class Super {
    /*
     * Super Keyword-> used to refer immediate parent class object
     * -to access parent's properties
     * -to access parent's functions
     * -to access parent's constructor
     */

    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal Constructor is called");
    }
}

class Horse extends Animal {
    Horse(){
        super();
        super.color="Black";
        System.out.println("Horse Constructor is called");
    }
}