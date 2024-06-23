/*Define Time class with constructor to initialize hour and minute. 
    Also define addition method to add two time objects. */

public class Time {
    int h;
    int m;
    int s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public Time addTime(Time t2) {
        Time sum = new Time(0, 0, 0);

        sum.s = this.s + t2.s;
        sum.m = this.m + t2.m + sum.s / 60;
        sum.h = this.h + t2.h + sum.m / 60;

        sum.s %= 60;
        sum.m %= 60;

        return sum;
    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", h, m, s);
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Time t1 = new Time(10, 20, 30);
        Time t2 = new Time(40, 50, 60);

        System.out.println("Time 1:");
        t1.displayTime();
        System.out.println("Time 2:");
        t2.displayTime();

        Time sum = t1.addTime(t2);
        System.out.println("Sum of Time 1 and Time 2:");
        sum.displayTime();
    }
}
