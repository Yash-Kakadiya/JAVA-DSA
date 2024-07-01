import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Decimal Number : ");
        int n=sc.nextInt();

        decimal(n);
        
    }    

    public static void decimal(int n){
        int pow=0;
        int bina=0;
        int r;

        while (n!=0) {
            r=n%2;
            bina=bina+(r*(int)Math.pow(10, pow));
            n=n/2;
            pow++; 
        }
        System.out.println("Binary : "+bina);
    }
}
