//5. Write a program to find factorial of a number. (Using Recursion)

import java.util.Scanner;

public class FactorialUsingRecursion {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int f = factorial(n);
        System.out.println("Factorial of " + n + " is " + f);
        sc.close();
    }

}
