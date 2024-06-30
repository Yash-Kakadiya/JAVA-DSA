//35. Create  array  of  object  of  class  Student_Detail  with  attributes  Enrollment_No, Name, Semester, CPI for 5 students, scan their information and print it.

import java.util.Scanner;

class Student_Detail {

    private int Enrollment_No;
    private String Name;
    private int Semester;
    private double CPI;

    public void setStudentDetails(int enrollmentNo, String name, int semester, double cpi) {
        this.Enrollment_No = enrollmentNo;
        this.Name = name;
        this.Semester = semester;
        this.CPI = cpi;
    }

    public void displayStudentDetails() {
        System.out.println("Enrollment No: " + Enrollment_No);
        System.out.println("Name: " + Name);
        System.out.println("Semester: " + Semester);
        System.out.println("CPI: " + CPI);
    }
}

public class Student_DetailDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student_Detail[] students = new Student_Detail[5];

        for (int i = 0; i < 5; i++) {

            students[i] = new Student_Detail();

            System.out.println("Enter details for student " + (i + 1) + ": ");

            System.out.print("Enter Enrollment No: ");
            int enrollmentNo = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Semester: ");
            int semester = sc.nextInt();

            System.out.print("Enter CPI: ");
            double cpi = sc.nextDouble();
            System.out.println("********************************************************");

            students[i].setStudentDetails(enrollmentNo, name, semester, cpi);
        }

        System.out.println("Student Details:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Details of student " + (i + 1) + ":");
            students[i].displayStudentDetails();
            System.out.println("--------------------------------------------------------");
        }

        sc.close();
    }
}
