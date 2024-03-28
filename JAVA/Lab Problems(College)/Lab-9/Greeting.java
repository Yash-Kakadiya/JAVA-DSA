/*Write an application that executes two threads. One thread 
    displays "Good Morning" every 1000 milliseconds & another thread 
    displays "Good Afternoon" every 3000 milliseconds. Create the 
    threads by implementing the Runnable interface. */

public class Greeting {

    public static void main(String[] args) {

        Thread morning = new Thread(new Morning());
        Thread afternoon = new Thread(new Afternoon());

        morning.start();
        afternoon.start();
    }
}

class Morning implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Good Morning");
                System.out.println("--------------------------------");

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Afternoon implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Good Afternoon");
                System.out.println("--------------------------------");

                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
