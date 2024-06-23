/*Write a program that illustrates interface inheritance. Interface 
A is extended by A1 and A2. Interface A12 inherits from both A1 
and A2.Each interface declares one constant and one method. Class 
B implements A12.Instantiate B and invoke each of its methods. 
Each method displays one of the constants */

public class InterfaceDemo {
    public static void main(String[] args) {
        B b = new B();
        b.methodA();
        b.methodA1();
        b.methodA2();
        b.methodA12();
    }
}

interface A {
    int constant_A = 0;

    void methodA();
}

interface A1 extends A {
    int constant_A1 = 1;

    void methodA1();
}

interface A2 extends A {
    int constant_A2 = 2;

    void methodA2();
}

interface A12 extends A1, A2 {
    int constant_A12 = 12;

    void methodA12();
}

class B implements A12 {
    public void methodA() {
        System.out.println("Method A implemented in class B with constant:" + constant_A);
    }

    public void methodA1() {
        System.out.println("Method A1 implemented in class B with constant:" + constant_A1);
    }

    public void methodA2() {
        System.out.println("Method A2 implemented in class B with constant:" + constant_A2);
    }

    public void methodA12() {
        System.out.println("Method A12 implemented in class B with constant:" + constant_A12);
    }
}
