/*
 * Declare a class named Vehicle with the following properties, 
    • noOfWheels 
    • noOfSeats 
    • noOfEngine 
    • engineCapacity 
    • registrationNumber 
    Also define following methods (just print the direction at which car should 
    move when method is called) 
    • goForward 
    • goReverse 
    • break 
    • goLeft 
    • goRight 
    • printDetails (print all car details here)
    Create  a  no-argument  constructor  with  all  property  value  to  be  0  (zero),  also 
    define a parameterized constructor to initialize all the properties. Now create a class named DemoVehicle to create two Vehicle objects, one with 
    the default constructor and other with parameterized constructor. At the end call different methods of object to demonstrate the encapsulation.
 */

class Vehicle {
    private int noOfWheels;
    private int noOfSeats;
    private int noOfEngine;
    private int engineCapacity;
    private String registrationNumber;

    // No-argument constructor
    public Vehicle() {
        this.noOfWheels = 0;
        this.noOfSeats = 0;
        this.noOfEngine = 0;
        this.engineCapacity = 0;
        this.registrationNumber = "N/A";
    }

    // Parameterized constructor
    public Vehicle(int noOfWheels, int noOfSeats, int noOfEngine, int engineCapacity, String registrationNumber) {
        this.noOfWheels = noOfWheels;
        this.noOfSeats = noOfSeats;
        this.noOfEngine = noOfEngine;
        this.engineCapacity = engineCapacity;
        this.registrationNumber = registrationNumber;
    }

    // Methods
    public void goForward() {
        System.out.println("Moving forward");
    }

    public void goReverse() {
        System.out.println("Moving in reverse");
    }

    public void brake() {
        System.out.println("Applying brakes");
    }

    public void goLeft() {
        System.out.println("Turning left");
    }

    public void goRight() {
        System.out.println("Turning right");
    }

    public void printDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("No of Wheels: " + noOfWheels);
        System.out.println("No of Seats: " + noOfSeats);
        System.out.println("No of Engine: " + noOfEngine);
        System.out.println("Engine Capacity: " + engineCapacity);
        System.out.println("Registration Number: " + registrationNumber);
    }
}

public class DemoVehicle {
    public static void main(String[] args) {
        // Creating a Vehicle object using the default constructor
        Vehicle defaultVehicle = new Vehicle();

        // Creating a Vehicle object using the parameterized constructor
        Vehicle customVehicle = new Vehicle(4, 5, 1, 2000, "ABC123");

        // Demonstrating encapsulation by calling different methods
        defaultVehicle.printDetails();
        defaultVehicle.goForward();
        defaultVehicle.goLeft();

        System.out.println(); // Adding a line break for clarity

        customVehicle.printDetails();
        customVehicle.goReverse();
        customVehicle.goRight();
    }
}
