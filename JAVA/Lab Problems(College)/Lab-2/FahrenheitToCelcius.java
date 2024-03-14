// Write a program to convert temperature from Fahrenheit to Celsius. 
// (Formula : c = f-32*5/9 ); 

import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("------------------------------------------------");
        double c = (f - 32) * 5 / 9;

        System.out.println("Temperature in Celsius: " + c);
    }
}
