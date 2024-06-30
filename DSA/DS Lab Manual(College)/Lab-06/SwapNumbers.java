//33. Write a program to swap two numbers using user-defines method. 

import java.util.Scanner;

public class SwapNumbers {

    public static void swap(int a, int b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        swap(a, b);

        sc.close();
    }
}
