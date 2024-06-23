/* Define  class  for  Complex  number  with  real  and  imaginary  as  data 
    members.  Create  its  contructor,  overload  the  constructors.  Also 
    define addition method to add two complex objects. */

public class ComplexNumber {

    double r;
    double i;

    public ComplexNumber() {
        this.r = 0.0;
        this.i = 0.0;
    }

    public ComplexNumber(double r) {
        this.r = r;
        this.i = 0.0;
    }

    public ComplexNumber(double r, double i) {
        this.r = r;
        this.i = i;
    }

    public ComplexNumber add(ComplexNumber c2) {
        double rSum = this.r + c2.r;
        double iSum = this.i + c2.i;
        return new ComplexNumber(rSum, iSum);
    }

    public void display() {
        System.out.println(this.r + " + " + this.i + "i");
    }

    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(1.1, 2.2);
        ComplexNumber c2 = new ComplexNumber(3.3, -4.4);

        System.out.print("Complex Number 1: ");
        c1.display();
        System.out.print("Complex Number 2: ");
        c2.display();
        System.out.println("--------------------------------------------------");

        ComplexNumber sum = c1.add(c2);
        System.out.print("Sum of Complex Numbers: ");
        sum.display();
    }
}
