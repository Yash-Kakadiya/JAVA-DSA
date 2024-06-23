public class FiboacciTerm {
    // 0 1 1 2 3 5 8 13 21 34 55 89 144 //fib(term)
    // 0 1 2 3 4 5 6  7  8  9 10 11  12 //term
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fn = fib(n - 1) + fib(n - 2);
        return fn;
    }

    public static void main(String[] args) {


        
        int n = 12;
        int ans = fib(n);
        System.out.println("Fiboacci Term");
    }
}
