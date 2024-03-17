// Write a program to find maximum number from given 3 numbers.

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int n3 = sc.nextInt();

        int max = n1;
        if (n2 > max) {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Maximum number among " + n1 + ", " + n2 + ", and " + n3 + " is: " + max);
    }
}
