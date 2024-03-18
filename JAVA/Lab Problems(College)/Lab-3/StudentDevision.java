/* The marks obtained by a student in 5 different subjects are input through the keyboard.  
     The student gets a division as per the following rules: 
     I. Percentage above or equals to 60-first division 
     II. Percentage between 50 to 59-second division 
     III. Percentage between 40 and 49-Third division 
     IV. Percentage less than 40-fail 
     Write a program to calculate the division obtained by the student. */

import java.util.Scanner;

public class StudentDevision {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects:");

        int totalMarks = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            if (marks > 100 || marks < 0) {
                System.out.println("Invalid marks");
                return;
            }
            totalMarks += marks;
        }

        double per = totalMarks / 5;

        String div;
        if (per >= 60) {
            div = "First Division";
        } else if (per >= 50) {
            div = "Second Division";
        } else if (per >= 40) {
            div = "Third Division";
        } else {
            div = "Fail";
        }

        System.out.println("-------------------------------------------");
        System.out.println("Division obtained: " + div + " (" + per + "%)");
    }
}
