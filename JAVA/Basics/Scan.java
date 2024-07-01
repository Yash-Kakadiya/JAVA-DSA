import java.util.*;

public class Scan{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
 
     String input= sc.next();
     System.out.println(input);

     System.out.println("------------------------");

     String name = sc.nextLine();
     System.out.println(name);

     int num=sc.nextInt();
     System.out.println(num);

     float price=sc.nextFloat();
     System.out.println(price);

     double d=sc.nextDouble();
     System.out.println(d);

     boolean b=sc.nextBoolean();
     System.out.println(b);

     short s=sc.nextShort();
     System.out.println(s);

     long l=sc.nextLong();
     System.out.println(l);
    }
}