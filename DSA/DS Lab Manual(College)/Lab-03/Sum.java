//14. Write a program to calculate sum of numbers from m to n.

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number to calculate sum : ");
        int n = sc.nextInt();

        System.out.print("Enter last number to calculate sum : ");
        int m = sc.nextInt();

        int sum = 0;

        for (int i = n; i <= m; i++) {
            sum += i;
        }

        System.out.println(n + " + . . . + " + m + " = " + sum);
        sc.close();
    }
}
