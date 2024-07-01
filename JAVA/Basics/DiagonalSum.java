import java.util.*;

public class DiagonalSum {
    public static int diagonalSum(int matrix[][]){
            int sum=0;
        if (matrix.length!=matrix[0].length) {
            System.out.println("Number of Rows and Coloums should be Same!");
            return sum;
        }

        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if (i==j) {
        //             sum=+matrix[i][j];
        //         }
        //         else if (i+j==matrix.length-1) {
        //             sum=+matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0;i<matrix.length;i++){
            //Primary Diagonal
            sum+= matrix[i][i];

            //Secondary Diagonal
            if (i!=matrix.length-1-i) {
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int [][]matrix= {{1,2,3},
                         {4,5,6},
                         {7,8,9},
                        };                
        System.out.println(diagonalSum(matrix));
    }
}
