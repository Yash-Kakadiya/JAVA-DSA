//4. Write a program to find factorial of a number. (Using Loop)

import java.util.Scanner;

public class FactorialUsingLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number :");
        int n = sc.nextInt();

        int f = 1;

        for (int i = n; i >= 1; i--) {
            f *= i;
        }

        System.out.println("Factorial of " + n + " is " + f);
        sc.close();
    }

}
