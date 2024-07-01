import java.util.*;
public class Factorial {

    public static int fact(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        return ans;
    }

    public static double biCoeff(int n, int r){
            double ans;
            ans=(fact(n))/(fact(r)*fact(n-r));
            return ans;
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number for Factorial : ");
        int num=sc.nextInt();
        if (num<0) {
            System.out.println("Number Should Not Negative");
        }
        else{
        int ans=fact(num);
        System.out.println(ans);
        }

        System.out.println("---------------------------------------------");
        
        System.out.println("Enter Number n for find nCr : ");
        int n=sc.nextInt();
        System.out.println("Enter Number r : ");
        int r=sc.nextInt();
        if (n<0) {
            System.out.println("Number Should Not Negative");
        }
        else{
        double ans=biCoeff(n, r);
        System.out.println(ans);
        }
    }
}