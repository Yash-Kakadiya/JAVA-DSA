package OOPS;
public class Encapsulation {

    /*private and protected access modifiers are not allowed in front of class */

    public static void main(String[] args) {

        Student s1 = new Student(); // created a student object named s1
        s1.name = "Yash";
        s1.age = 19;
        s1.calcPercentage(97, 95, 99);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.percentage);
        System.out.println("---------------------------------------------------------------");

        BankAccount myAcc = new BankAccount();
        myAcc.username = "YashKakadiya";
        myAcc.setPassword("wasd");
        System.out.println(myAcc.username);
        System.out.println("---------------------------------------------------------------");

        Pen p1 = new Pen(); // created a pen object named p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Red");
        System.out.println(p1.getColor());
        System.out.println("---------------------------------------------------------------");

    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}

class BankAccount {
    public String username;
    private String password;

    void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }

    int getTip() {
        return this.tip;
    }
}