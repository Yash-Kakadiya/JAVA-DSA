/*Demonstrate the Operator precedence. 
    a.  10 + 20 * 30 
    b.  100 / 10 * 100 
    c.  5 * 4 / 4 % 3 
    d.  100 + 200 / 10 – 3 * 10 */

public class ArithmaticOperatorPrecedence {
    public static void main(String[] args) {

        int A = 10 + 20 * 30;
        System.out.println("Result of a: " + A);

        int B = 100 / 10 * 100;
        System.out.println("Result of b: " + B);

        int C = 5 * 4 / 4 % 3;
        System.out.println("Result of c: " + C);

        int D = 100 + 200 / 10 - 3 * 10;
        System.out.println("Result of d: " + D);
    }
}
