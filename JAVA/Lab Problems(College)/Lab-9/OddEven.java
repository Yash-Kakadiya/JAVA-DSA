/* Write a program to create two threads, one thread will print odd 
    numbers and second thread will print even numbers between 1 to 20 
    numbers. */

public class OddEven {

    public static void main(String[] args) {

        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();

        odd.start();
        even.start();
    }
}

class OddThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
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

    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
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
