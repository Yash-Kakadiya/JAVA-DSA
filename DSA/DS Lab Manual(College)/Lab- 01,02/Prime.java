//8. Write a program to check whether a number is prime or not.

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number.");
                sc.close();
                return;
            }
        }

        System.out.println(n + " is a prime number.");

        sc.close();
    }

}
