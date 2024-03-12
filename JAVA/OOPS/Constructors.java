package OOPS;
public class Constructors {
    public static void main(String[] args) {
        Car c1 = new Car();// default constructor
        Car c2 = new Car("BMW");// parameterized constructor
        Car c3 = new Car(270);// parameterized constructor
        // constructor overloading -> polymorphism

        // copy constructor
        Car c4 = new Car();
        c4.name = "Mercedes";
        c4.speed = 300;
        c4.serialNumber = "1";
        c4.price[0] = 1;
        c4.price[1] = 2;
        c4.price[2] = 3;

        Car c5 = new Car(c4);
        c5.serialNumber = "2";
        c4.price[1] = 5;

        for (int i = 0; i < 3; i++) {
            System.out.println(c5.price[i]);
        }
    }
}

class Car {
    String name;
    int speed;
    String serialNumber;
    int price[];

    // Default Contructor
    Car() {
        name = "Audi";
        price = new int[3];
        System.out.println("Deafult(non-parameterized) Contructor called");
    }

    // Parameterized Contructor
    Car(String name) {
        this.name = name;
        price = new int[3];
        System.out.println("Parameterized Contructor called");
    }

    Car(int speed) {
        this.speed = speed;
        price = new int[3];
        System.out.println("Parameterized Contructor called");
    }

    // Copy Contructor

    // copy->(i)shallow copy=only reference will be copy(changes reflect)
    // ->(ii)deep copy=new copy(changes don't reflect)

    // // shallow copy constructor
    // Car(Car c4) {
    // this.name = c4.name;
    // this.speed = c4.speed;
    // this.price = c4.price; // only reference will be copied !
    // }

    // deep copy constructor
    Car(Car c4) {
        price = new int[3];
        this.name = c4.name;
        this.speed = c4.speed;

        for (int i = 0; i < 3; i++) {
            this.price[i] = c4.price[i];
        }
    }

    // Destructors->Garbage Collecttor 
}