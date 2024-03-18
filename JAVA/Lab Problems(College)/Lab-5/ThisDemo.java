/*Write a program in Java to demonstrate use of this keyword. Check 
    whether this can access the Static variables of the class or not. */

public class ThisDemo {
    int instanceVariable;
    static int staticVariable;

    public ThisDemo(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    public void printInstanceVariable() {
        System.out.println("Value of instance variable: " + this.instanceVariable);
    }

    public static void main(String[] args) {
        ThisDemo o1 = new ThisDemo(7);
        o1.printInstanceVariable();

        // System.out.println("Value of static variable: " + this.staticVariable);
    }
}
