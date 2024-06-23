// Write a program to calculate the area of circle. 

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();

        double area = Math.PI * r * r;
        System.out.println("-------------------------------------------------");
        System.out.println("Area of the circle with radius " + r + " is: " + area);

    }
}
