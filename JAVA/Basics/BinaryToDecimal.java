import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Binary Number : ");
        int n=sc.nextInt();

        binary(n);
        
    }    

    public static void binary(int n){
        int pow=0;
        int deci=0;
        int r;

        while (n!=0) {
            r=n%10;
            deci=deci+(r*(int)Math.pow(2, pow));
            n=n/10;
            pow++; 
        }
        System.out.println("Decimal : "+deci);
    }
}
