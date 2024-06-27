// 1. Write a program to calculate area of a Circle (A = πr^2).

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius :");
        int r = sc.nextInt();

        System.out.println("Area of Circle:" + (Math.PI * r * r));
        sc.close();
    }

}
