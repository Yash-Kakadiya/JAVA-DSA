//6. Write a program to find power of a number using loop.

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base(x) to find x^y: ");
        int x = sc.nextInt();

        System.out.print("Enter the power(y) to find x^y: ");
        int y = sc.nextInt();

        double ans = 1;

        for (int i = 1; i <= y; i++) {
            ans *= x;
        }

        System.out.println(x + "^" + y + " = " + ans);
        sc.close();
    }

}
