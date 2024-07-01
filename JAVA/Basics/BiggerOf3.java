import java.util.*;

public class BiggerOf3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        System.out.print("Largest is : ");

        if(a>b){
            if(a>c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else{
            if(b>c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }

    }
}