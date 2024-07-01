import java.util.*;

public class TypePromotionExpression{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
            //Type Promotion Expression
            char x='a';
            char y='b';
            System.out.println(x);
            System.out.println(y);
            System.out.println((int)x);
            System.out.println((int)y);
            System.out.println(y-x);
            System.out.println("--------------");
            
            int a=10;
            float b=20.25f;
            long c=25;
            double d=30;
            double ans=a+b+c+d;
            System.out.println(ans);
            System.out.println("--------------");

            byte u=5;
            System.out.println(u);
            u=(byte)(u*2);
            System.out.println(u);
            System.out.println("--------------");
       
    }
}