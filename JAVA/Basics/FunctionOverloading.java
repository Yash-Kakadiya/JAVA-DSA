import java.util.*;

public class FunctionOverloading {
    
    public static void main(String[] args){
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1.0f,2.0f));
        System.out.println(sum(1.0f,2.0f,3.0f));
    }
    
    //function overloading using parameters
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    //function overloading using data types
    public static float sum(float a, float b){
        return a+b;
    }
    public static float sum(float a,float b,float c){
        return a+b+c;
    }

}
