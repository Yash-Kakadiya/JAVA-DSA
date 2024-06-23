//Recursion is a method of solving computational problems where solution depends on solutions of smaller instances of same problem.

public class RecursionBasics {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);  //base case
            return;
        }
        System.out.println(n);
        printDec(n - 1);
    }
    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(n);  //base case
            return;
        }
        printInc(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
        System.out.println("--------------------------------");
        printInc(n);
    }
}
