import java.util.*;

public class SearchInSortedMatrices {
    public static boolean staircaseSearch(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;

        while (row<matrix.length && col>=0) {
            if (matrix[row][col]==key) {
                System.out.println(key +" Found at Index["+row+"]["+col+"] of Matrix");
                return true;
            }
            else if (key<matrix[row][col]) {
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key Not Found");
        return false;
    }

    public static void main(String[] args) {
        //Search any Value in Sorted(both:row wise and column wise) 2D Matrix
        Scanner sc= new Scanner(System.in);

        int[][] matrix= {{10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,48},
                         {32,33,39,50}
                        };
        
        System.out.print("Enter Value for Search : ");
        
        int key=sc.nextInt();
        
        staircaseSearch(matrix,key);
    }
}
