//30. Read  two  2x2  matrices  and  perform  addition  of  matrices  into  third  matrix  and print it.

import java.util.Scanner;

public class AddtionOfMatrices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter value of a[" + i + "][" + j + "] : ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("--------------------------------------------------------");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter value of b[" + i + "][" + j + "] : ");
                b[i][j] = sc.nextInt();
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}