//34. Create class Employee_Detail with attributes Employee_ID, Name, Designation, and Salary. Write a program to read the detail from user and print it.

import java.util.Scanner;

class Employee_Detail {

    private int Employee_ID;
    private String Name;
    private String Designation;
    private double Salary;

    public void setEmployeeDetails(int id, String name, String designation, double salary) {
        this.Employee_ID = id;
        this.Name = name;
        this.Designation = designation;
        this.Salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + Employee_ID);
        System.out.println("Name: " + Name);
        System.out.println("Designation: " + Designation);
        System.out.println("Salary: " + Salary);
    }
}

public class Employee_DetailDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee_Detail em = new Employee_Detail();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Designation: ");
        String designation = sc.next();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.println("--------------------------------------------------------");

        em.setEmployeeDetails(id, name, designation, salary);

        System.out.println("Employee Details:");
        em.displayEmployeeDetails();

        sc.close();
    }
}
