//12. WAP to print Armstrong number from 1 to 1000.

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check whether it is armstrong or not : ");
        int n = sc.nextInt();

        int t = n;
        int t2 = n;
        int l = 0;
        int sum = 0;

        while (t != 0) {
            l++;
            t = t / 10;
        }

        for (int i = 1; i <= l; i++) {
            int r = t2 % 10;
            sum = sum + (int) Math.pow(r, l);
            t2 /= 10;
        }

        if (sum == n) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }

        sc.close();
    }
}
