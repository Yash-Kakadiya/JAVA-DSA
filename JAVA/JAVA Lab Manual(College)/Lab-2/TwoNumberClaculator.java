/* Write a program to create basic calculator by getting 2 numbers and 1 string
    (operation) from the user and apply the operation given in a string on the given
    numbers. */

import java.util.Scanner;

public class TwoNumberClaculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double n1 = sc.nextDouble();

        System.out.print("Enter the operation (+, -, *, /, %): ");
        String operation = sc.next();

        System.out.print("Enter the second number: ");
        double n2 = sc.nextDouble();

        double result;
        switch (operation) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            case "%":
                result = n1 % n2;
                break;
            default:
                System.out.println("Invalid operation entered!");
                return;
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("Result of " + n1 + " " + operation + " " + n2 + " is: " + result);
    }
}
