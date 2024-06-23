public class XtoPowerN {

    public static int power(int x, int n) { // long process | O(n) (TC)
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int fastPower(int x, int n) { // short process | log(n) (TC)
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            int halfPower = fastPower(x, n / 2);
            return halfPower * halfPower;
        } else {
            int halfPower = fastPower(x, n / 2);
            return x * halfPower * halfPower;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10; // n => natural numbers
        int ans = power(x, n);
        int ans2 = fastPower(x, n);

        System.out.println(x + "^" + n + " = " + ans);
        System.out.println("(using optimised power function) " + x + "^" + n + " = " + ans2);
    }
}

