// Write a program to get 2 numbers from the user and print the sum of 
// two numbers using command line and Scanner class.

import java.util.Scanner;

public class SumofTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double n1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double n2 = sc.nextDouble();

        double sum = n1 + n2;
        System.out.println("-----------------------------------------");
        System.out.println("Sum of " + n1 + " and " + n2 + " is: " + sum);
    }
}
