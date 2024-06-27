//10. WAP to convert number of days into year, week & days [e.g. 375 days mean 1 year, 1 week and 3 days].

import java.util.Scanner;

public class ConvertDays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Days:");
        
        int d = sc.nextInt();

        int w = 0, y = 0;

        w = d / 7;
        d %= 7;
        
        y = w / 52;
        w %= 52;

        System.out.println(y+" years, "+w+" weeks, "+d+" days");
        
        sc.close();
    }

}
