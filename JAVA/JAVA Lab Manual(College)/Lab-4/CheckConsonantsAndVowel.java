/* Write a program to accept a l and check how many consonants and 
    vowels are there in line. */

import java.util.Scanner;

public class CheckConsonantsAndVowel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String line = sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;
        int ex = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else {
                ex++;
            }
        }

        System.out.println("-----------------------------------------");
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Others: " + ex);
    }
}
