/*Write a program to create circle class with area function to find 
    area of circle. */

import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return (Math.PI * radius * radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        Circle circle = new Circle(sc.nextInt());

        System.out.println("----------------------------------------------------------");
        System.out.println("Area of the circle with radius " + circle.radius + " is: " + circle.area());
    }
}
