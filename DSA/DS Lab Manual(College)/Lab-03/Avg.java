//15. Write a program to calculate average of first n numbers.

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number upto which you want to calculate average : ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        double avg = (sum / (double) n);

        System.out.println("Average = " + avg);
        sc.close();
    }
}
