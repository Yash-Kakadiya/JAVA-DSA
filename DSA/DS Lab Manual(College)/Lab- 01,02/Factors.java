//7. Write a program to find factors of a given number.

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find it's factors : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.print("\b\b ");
        sc.close();
    }

}
