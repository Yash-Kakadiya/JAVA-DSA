import java.util.*;

public class IfElse{
    public static void main(String args[]){
        int age=19;
        if(age>=18){
            System.out.println("Adult");
        }

        if(age>13 && age<18){
            System.out.println("Teenager");
        }
        
        else{
            System.out.println("Not Adult");
        }
    }
}