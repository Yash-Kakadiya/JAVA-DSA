import java.util.*;

public class Matrices {
    public static boolean  search(int matrix[][],int key){

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Found at index["+i+"]["+j+"]");
                    return true;
                }
            }
        }
        System.out.println("Key Not Found");
        return false;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(" Enter Value for Matrix["+i+"]["+j+"] : ");
                matrix[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int key;
        System.out.println("Enter Value for Search: ");
        key=sc.nextInt();
        search(matrix, key);
    }
}
