import java.util.*;
public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array : ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter an Elements : ");
        for(int i=0 ; i<n; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        int indexOfa=0;
        int indexOfb=0;
        int check=1;

        for(int i=0; i<array.length; i++){
            if(a==array[i]){
                indexOfa=i;
            }else{
                check=0;
            }
           
        }

        for(int i=0; i<array.length; i++){
            if(b==array[i]){
                indexOfb=i;
            }else{
                check=0;
            }
        }

        if(check==0){
            System.out.println("Error..");
        }else{
            int temp=array[indexOfa];
            array[indexOfa]=array[indexOfb];
            array[indexOfb]=temp;

            for(int i=0; i<n ;i++){
                System.out.print(array[i] + " ");
            }
        }
           
        sc.close();
    }
}
