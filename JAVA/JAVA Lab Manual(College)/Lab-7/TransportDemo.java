/*The Transport interface declares a deliver () method. The abstract 
class Animal is the super class of the Tiger, Camel, Deer and 
Donkey classes. The Transport interface is implemented by the 
Camel and Donkey classes. Write a test program that initialize an 
array of four Animal objects. If the object implements the 
Transport interface, the deliver () method is invoked. */

public class TransportDemo {
    public static void main(String[] args) {
        Animal a[] = { new Tiger(), new Camel(), new Deer(), new Donkey() };

        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof Transport) {
                ((Transport) a[i]).deliver();
            }
        }
    }
}

interface Transport {
    void deliver();
}

abstract class Animal {
    // Abstract class Animal
}

class Tiger extends Animal {
    // Tiger class
}

class Camel extends Animal implements Transport {

    public void deliver() {
        System.out.println("Camel delivers.");
    }
}

class Deer extends Animal {
    // Deer class
}

class Donkey extends Animal implements Transport {

    public void deliver() {
        System.out.println("Donkey delivers.");
    }
}
