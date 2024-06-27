//11. WAP to find the sum of 1 + (1+2) + (1+2+3) + (1+2+3+4)+ ...+(1+2+3+4+....+n).

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n to find the sum of 1 + (1+2) + (1+2+3) + (1+2+3+4)+ ...+(1+2+3+4+....+n). :");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print("(");

            for (int j = 1; j <= i; j++) {
                System.out.print(j + "+");
                sum += j;
            }

            System.out.print("\b) + ");

        }

        System.out.println("\b\b= " + sum);

        sc.close();
    }

}
