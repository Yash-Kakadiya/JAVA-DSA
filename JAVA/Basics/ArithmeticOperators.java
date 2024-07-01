import java.util.*;

public class ArithmeticOperators{
    public static void main(String args[]){
 
 // Arithmetic Operators
    //Binary
    int a=10,b=5;

    System.out.println("Add="+(a+b));
    System.out.println("Substraction="+(a-b));
    System.out.println("Multiplication="+(a*b));
    System.out.println("Division="+(a/b));
    System.out.println("Modulo="+(a%b));
    System.out.println("--------------------------------------");
        
    // Unary
    int x=7;
    System.out.println("x="+x);
    System.out.println("--------------------------------------");
    //pre increment
    int y=++x;
    System.out.println("y="+y);
    System.out.println("x="+x);
    System.out.println("--------------------------------------");

    //post increment
    int z=x++;
    System.out.println("z="+z);
    System.out.println("x="+x);
    System.out.println("--------------------------------------");
    }
}