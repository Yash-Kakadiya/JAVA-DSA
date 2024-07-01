import java.util.*;
public class PrimeFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number : ");
        int n=sc.nextInt();

        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n) {
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
