public class Factorial {
    public static int getFactorial(int n){
        if(n==0){
            return 1;
        }
        return n*getFactorial(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = getFactorial(n);
        System.out.println("Factorial of " + n + " is " + ans);
    }
}
