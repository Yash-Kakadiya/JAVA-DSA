import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
     
    System.out.println("Enter Number of Rows :");
    int r=sc.nextInt();
    System.out.println("Enter Number of Coloums :");
    int c=sc.nextInt();

    ladder(r);
    butterfly(r);
    diamond(r);
    hollowRectangle(r,c);
    halfPyramid(r);
    invertHalfPyramidNum(r);
    floydTriangle(r);
    zeroOnePattern(r);
    solidRhombus(r);
    hollowRhombus(r);
    numberPyramid(r);
    palindromic(r);
    }
    public static void ladder(int r){
        System.out.println("-------------------------- ");
        int n=1;
        for(int i=1;i<=r;i++){
            if (i==1||i%2==0) {
               for(int j=1;j<=i;j++){
                    System.out.print(n+" ");
                    n++;
                }        
            }
            else{         
                n=n+i-1;
                for(int j=1;j<=i;j++){
                    System.out.print(n+" ");
                    n--;
                }
                n=n+i+1;
            }
            System.out.println();
        }
        System.out.println("-------------------------- ");
    }
    public static void palindromic(int r){
        System.out.println("-------------------------- ");
        for(int i=1;i<=r;i++){
            for(int k=r;k>=i;k--){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------- ");
    }

    public static void numberPyramid(int r) {
        System.out.println("-------------------------- ");
        for(int i=1;i<=r;i++){
            for(int k=r;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------- ");
    }
    public static void butterfly(int r){
        System.out.println("-------------------------- ");
        //first half
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=(r-i)*2;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //second half 
        for(int i=r;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=(r-i)*2;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------- ");
    }

    public static void diamond(int r){
            System.out.println("-----------------------");
        for(int i=1;i<=r;i++){
            for(int k=r-1;k>=i;k--){
                System.out.print("  ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                System.out.print("* ");
            }
                System.out.println();
        }
        for(int i=r-1;i>=1;i--){
            for(int k=r-1;k>=i;k--){
                System.out.print("  ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                System.out.print("* ");
            }
                System.out.println();
        }
        System.out.println("-----------------------");
    }

    public static void hollowRectangle(int r ,int c){
            System.out.println("-----------------------");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if (i==1||i==r||j==1||j==c) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    System.out.println("-----------------------");
    }
    public static void halfPyramid(int r){
        System.out.println("-----------------------");
        for(int i=1;i<=r;i++){
            for(int k=r-1;k>=i;k--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
                System.out.println();
        }
        System.out.println("-----------------------");
    }

    public static void invertHalfPyramidNum(int r){
         System.out.println("-----------------------");
        for(int i=r;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
                System.out.println();
        }
    System.out.println("-----------------------");
    }
    public static void floydTriangle(int r){
        System.out.println("-----------------------");
        int n=1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n++;
            }
                System.out.println(" ");
    }
    System.out.println("-----------------------");
    }

    public static void zeroOnePattern(int r){
         System.out.println("-----------------------");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                if ((i+j)%2==0) {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
    }
      System.out.println("-----------------------");
    }

    public static void solidRhombus(int r){
            System.out.println("-----------------------");
        for(int i=1;i<=r;i++){
            for(int k=r-1;k>=i;k--){
                System.out.print("  ");
            }
            for(int j=1;j<=r;j++){
                System.out.print("* ");
            }
                System.out.println();
        }
        System.out.println("-----------------------");
    }

    public static void hollowRhombus(int r){
            System.out.println("-----------------------");
        for(int i=1;i<=r;i++){
            for(int k=r-1;k>=i;k--){
                System.out.print("  ");
            }
            for(int j=1;j<=r;j++){
                if (i==1||i==r||j==1||j==r) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
                System.out.println();
    }
    System.out.println("-----------------------");
}

}
