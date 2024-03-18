/*Write a program to find length of string and print second half of 
    the string. */

import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int l = str.length();

        String secondHalf = str.substring(l / 2);
        System.out.println("Length of the string: " + l);
        System.out.println("Second half of the string: " + secondHalf);
    }
}
