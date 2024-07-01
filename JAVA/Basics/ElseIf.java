import java.util.*;

public class ElseIf{
    public static void main(String args[]){
        int age=19;
        if(age>=18){
            System.out.println("Adult");
        }

        else if(age>13 && age<18){
            System.out.println("Teenager");
        }
        
        else{
            System.out.println("Not Adult");
        }
    }
}