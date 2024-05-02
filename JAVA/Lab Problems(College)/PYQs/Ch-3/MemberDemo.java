/*Create a class named 'Member' having the following members: 
        1.  Name 
        2.  Age 
        3.  Phone number 
        4.  Address 
        5.  Salary 
    It also has a method named 'printSalary' which prints the salary 
    of the members.
    Two classes 'Employee' and Manager' inherits the 'Member' class. 
    The 'Employee' and 'Manager' classes have data members 
    'specialization' and 'department' respectively. Now assign name, 
    age, phone number address and salary to an employee and a manager 
    by making an object of both of these classes and print the same 
    along with specialization and department respectively. */

public class MemberDemo {
    public static void main(String[] args) {

        Employee e = new Employee();

        Manager m = new Manager();

        e.name = "Steve Rogers";
        e.age = 90;
        e.phoneNumber = "1234567890";
        e.address = "abc";
        e.specialization = "Defence";
        e.salary = 50000;

        m.name = "Tony Stark";
        m.age = 40;
        m.phoneNumber = "9876543210";
        m.address = "3000";
        m.department = "Stark Industries";
        m.salary = 300000;

        System.out.println("Employee Details:");
        System.out.println("Name: " + e.name);
        System.out.println("Age: " + e.age);
        System.out.println("Phone Number: " + e.phoneNumber);
        System.out.println("Address: " + e.address);
        e.printSalary();
        System.out.println("Specialization: " + e.specialization);

        System.out.println("--------------------------------------------");

        System.out.println("Manager Details:");
        System.out.println("Name: " + m.name);
        System.out.println("Age: " + m.age);
        System.out.println("Phone Number: " + m.phoneNumber);
        System.out.println("Address: " + m.address);
        m.printSalary();
        System.out.println("Department: " + m.department);
    }
}

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}
