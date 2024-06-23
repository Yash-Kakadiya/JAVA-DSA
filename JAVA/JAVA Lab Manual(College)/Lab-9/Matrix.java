/*Write a complete multi-threaded program to meet following requirements: 
    a.  Read matrix [A] m x n 
    b.  Create m number of threads 
    c.  Each thread computes summation of elements of one row, i.e. 
        ith row of the matrix is processed by ith thread. Where 0<=i<m. 
    d.  Print the results.  */

import java.util.Scanner;

public class Matrix extends Thread {

    static int[][] matrix;
    static int[] rowSum;

    int row;

    public Matrix(int row) {
        this.row = row;
    }

    @Override
    public void run() {

        int sum = 0;

        for (int col = 0; col < matrix[row].length; col++) {
            sum += matrix[row][col];
        }

        rowSum[row] = sum;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows (m): ");
        int m = sc.nextInt();
        System.out.println("----------------------------------------");

        System.out.print("Enter the number of columns (n): ");
        int n = sc.nextInt();
        System.out.println("----------------------------------------");

        matrix = new int[m][n];
        rowSum = new int[m];

        System.out.println("Enter the values of the matrix:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter value for Matrix[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("----------------------------------------");

        for (int i = 0; i < m; i++) {
            Matrix thread = new Matrix(i);
            thread.start();

            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of each row:");
        for (int i = 0; i < m; i++) {
            System.out.println("Row " + (i + 1) + ": " + rowSum[i]);
        }
        System.out.println("----------------------------------------");

    }
}
