//9. WAP to convert seconds into hours, minutes & seconds and print in HH:MM:SS [e.g. 10000 seconds mean 2:46:40 (2 Hours, 46 Minutes, 40 Seconds)].

import java.util.Scanner;

public class Time {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the seconds : ");
        int s = sc.nextInt();

        int h = 0, m = 0;

        m = s / 60;
        s %= 60;

        h = m / 60;
        m %= 60;

        System.out.println("Converted time : ");
        System.out.printf("%02d:%02d:%02d", h, m, s);

        sc.close();

    }

}
