/*Write a complete program to accept n integer numbers from the 
    command line. Raise and handle exceptions for following cases : 
    a.  when a number is –ve 
    b.  when a number is evenly divisible by 10 
    c.  when a number is greater than 1000 and less than 2000 
    d.  when a number is greater than 7000 
    Skip the number if an exception is raised for it, otherwise add it 
    to find total sum. */

import java.util.Scanner;

public class CustomException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of integers(n) you will enter: ");
        int n = sc.nextInt();
        int sum = 0;

        System.out.println("------------------------------");
        System.out.println("You have to enter " + n + " integers !");
        System.out.println("------------------------------");

        for (int i = 0; i < n; i++) {
            try {
                int num = sc.nextInt();
                System.out.println("------------------------------------------------------------");
                checkExceptions(num);
                sum += num;
            } catch (Exception e) {
                System.out.println("Skipped number due to exception: " + e.getMessage());
                System.out.println("------------------------------------------------------------");
            }
        }
        System.out.println("Total sum of valid numbers: " + sum);
    }

    static void checkExceptions(int num) throws Exception {
        if (num < 0) {
            throw new Exception("Number is negative");
        }
        if (num % 10 == 0) {
            throw new Exception("Number is divisible by 10");
        }
        if (num > 1000 && num < 2000) {
            throw new Exception("Number is between 1000 and 2000");
        }
        if (num > 7000) {
            throw new Exception("Number is greater than 7000");
        }
    }
}
