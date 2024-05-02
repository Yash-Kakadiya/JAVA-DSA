/* Declare a class called student having following data
    members:id_no, no_of_subjects_registered, subject_code, 
    subject_credits, grade_obtained and spi. Define constructor and 
    calculate_spi methods.Define main to instantiate an array for 
    objects of class student to process data of n students. */

import java.util.Scanner;

public class StudentDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();

            System.out.print("Enter Id No. of Student " + (i + 1) + ": ");
            s[i].id_No = sc.nextInt();

            System.out.print("Enter No. of Subject Registerd for Student " + (i + 1) + ": ");
            s[i].no_of_subjects_registered = sc.nextInt();

            for (int j = 0; j < s[i].no_of_subjects_registered; j++) {
                System.out.print("Enter Subject Code for subject " + (j + 1) + ": ");
                s[i].subject_code = sc.next();

                System.out.print("Enter Subject Credits for subject " + (j + 1) + ": ");
                s[i].subject_credits = sc.nextInt();

                System.out.print("Enter Grade Obtained for subject " + (j + 1) + ": ");
                s[i].grade_obtained = sc.next().charAt(0);

            }
            s[i].calculate_spi();
            System.out.println("--------------------------------------------------");
        }

        for (int i = 0; i < n; i++) {

            System.out.println("Id No. of Student " + (i + 1) + ": " + s[i].id_No);

            System.out
                    .println("No. of Subject Registerd for Student " + (i + 1) + ": " + s[i].no_of_subjects_registered);

            for (int j = 0; j < s[i].no_of_subjects_registered; j++) {
                System.out.println("Subject Code for subject " + (j + 1) + ": " + s[i].subject_code);

                System.out.println("Subject Credits for subject " + (j + 1) + ": " + s[i].subject_credits);

                System.out.println("Grade Obtained for subject " + (j + 1) + ": " + s[i].grade_obtained);

            }
            System.out.println("SPI of Student " + (i + 1) + ": " + s[i].spi);
            System.out.println("--------------------------------------------------");
        }
    }
}

class Student {
    int id_No;
    int no_of_subjects_registered;
    String subject_code;
    int subject_credits;
    char grade_obtained;
    double spi;

    public Student() {
        this.id_No = 0;
        this.no_of_subjects_registered = 0;
        this.spi = 0.0;
    }

    public void calculate_spi() {
        // SPI Logic
    }

}
