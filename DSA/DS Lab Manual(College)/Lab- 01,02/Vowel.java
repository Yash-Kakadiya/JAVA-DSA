//3. Write a program to determine whether the entered character is vowel or not.

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character : ");
        char c = sc.next().charAt(0);

        if ("aeiouAEIOU".indexOf(c) != -1) {
            System.out.println(c + " is Vowel");
        } else {
            System.err.println(c + " is consonant");
        }
        sc.close();
    }

}
