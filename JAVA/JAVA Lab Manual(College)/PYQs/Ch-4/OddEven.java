/* Write a program that uses a two threads one thread prints an even number and 
    another thread prints an odd number (take an input from user).  */

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        OddThread odd = new OddThread(n);
        EvenThread even = new EvenThread(n);

        odd.start();
        even.start();
    }
}

class OddThread extends Thread {
    int n;

    OddThread(int n) {
        n = this.n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i += 2) {
            System.out.println("---------------------");
            System.out.println("Odd Thread: " + i);

            try {
                sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("---------------------");
    }
}

class EvenThread extends Thread {
    int n;

    EvenThread(int n) {
        n = this.n;
    }

    @Override
    public void run() {
        for (int i = 2; i <= n; i += 2) {
            System.out.println("---------------------");
            System.out.println("Even Thread: " + i);

            try {
                sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("---------------------");
    }
}
