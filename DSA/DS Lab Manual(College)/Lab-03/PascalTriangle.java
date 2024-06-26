//19. WAP to print Pascal triangle. 

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows to print pascal triangle : ");
        int n = sc.nextInt();

        int a = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0) {
                    a = 1;
                } else {
                    a = a * (i - j + 1) / j;
                }
                System.out.print(" " + a);
            }

            System.out.println();
        }
        sc.close();
    }
}
