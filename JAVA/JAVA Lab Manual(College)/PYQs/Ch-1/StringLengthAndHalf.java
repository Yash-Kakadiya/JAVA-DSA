//Write a program to find length of string and print first half of the string.

import java.util.Scanner;

public class StringLengthAndHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string :");
        String str = sc.nextLine();

        int length = str.length();
        int halfLength = length / 2;

        System.out.println("Length of string : " + length);
        // System.out.println("First half of string : " + str.substring(0, halfLength));
        //OR
        // for (int i = 0; i < halfLength; i++) {
        //     System.out.print(str.charAt(i));
        // }
        // System.out.println();
    }
}