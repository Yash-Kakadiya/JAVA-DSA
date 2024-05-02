/*
 * Write a program to add two different Time class’s objects. Time class contains 3 
    fields hours, Minute  and Seconds. (Take input  from user  and assume  user will 
    always enter a valid data, e.g. if Time1 is  02:55:55 and Time2 is 03:07:10 then 
    result is 06:03:05)
 */

class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    void add(Time t) {
        this.second += t.second;
        if (this.second >= 60) {
            this.minute++;
            this.second -= 60;
        }
        this.minute += t.minute;
        if (this.minute >= 60) {
            this.hour++;
            this.minute -= 60;
        }
        this.hour += t.hour;
    }
}

public class TimeDemo {
    public static void main(String[] args) {
        Time t1 = new Time(2, 55, 55);
        Time t2 = new Time(3, 7, 10);

        t1.add(t2);

        System.out.println(t1.hour + ":" + t1.minute + ":" + t1.second);
    }
}