//36. Create  methods  to  convert  t  from  Celsius  to  Fahrenhit  and  vice versa.  Take  t  input  from  user  and  call  the  appropriate  conversion method. 

import java.util.Scanner;

public class Temperature {

    public static double CtoF(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double FtoC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature : ");
        double t = sc.nextDouble();

        System.out.print("Convert to (1) Celsius or (2) Fahrenheit ? Enter 1 or 2: ");
        int op = sc.nextInt();

        if (op == 1) {
            double ans = FtoC(t);
            System.out.println("Temperature in Celsius : " + ans);
        } else if (op == 2) {
            double ans = CtoF(t);
            System.out.println("Temperature in Fahrenheit : " + ans);
        } else {
            System.out.println("Invalid option !");
        }

        sc.close();
    }
}
