public class SumUptoN {
    public static int getSumUptoN(int n){
        if(n==1){
            return 1;
        }
        return n+getSumUptoN(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        int ans = getSumUptoN(n);
        System.out.println("Sum from 1 to " + n + " is " + ans);
    }
}
