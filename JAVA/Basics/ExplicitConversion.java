import java.util.*;

public class ExplicitConversion{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
   
        //(Type Casting)/(Narrowing Conversion)/(Explicit Conversion)
            float a=25.12f;
            int b=(int)a;
            System.out.println(b);
            System.out.println("---------------------");
            char ch='a';
            int num=ch;
            System.out.println(num);
    }
}