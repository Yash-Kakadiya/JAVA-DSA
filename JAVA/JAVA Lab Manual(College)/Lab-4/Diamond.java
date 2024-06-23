/*Write an interactive program to print a diamond shape. For 
    example, if user enters the number 3, the diamond will be as 
    follows: 
                        * 
                       * * 
                      * * * 
                       * * 
                        * 
*/

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {

            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}