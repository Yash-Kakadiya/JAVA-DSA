/*
 * 51. Write a menu driven program to implement following operations on a circular queue using an Array 
     Insert 
     Delete 
     Display all elements of the queue
 */

import java.util.Scanner;

public class CircularQueueMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Circular Queue : ");
        CircularQueue q1 = new CircularQueue(sc.nextInt());

        while (true) {
            System.out.println("--------------------------------");
            System.out.println("Queue operations.");
            System.out.println("1. to enQueue.");
            System.out.println("2. to deQueue.");
            System.out.println("3. to display circular queue.");
            System.out.println("enter anything else to exit...");
            System.out.print("Chose one option :");
            int op = sc.nextInt();
            System.out.println("-----------------------------------------");

            switch (op) {
                case 1:
                    System.out.print("Enter value to enQueue : ");
                    q1.enQueue(sc.nextInt());
                    break;
                case 2:
                    System.out.println(q1.deQueue());
                    break;
                case 3:
                    q1.display();
                    break;
                default:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
            }

        }
    }

}

class CircularQueue {
    int front = -1;
    int rear = -1;
    int n;
    int[] Q;

    public CircularQueue(int n) {
        this.n = n;
        Q = new int[n];
    }

    public void enQueue(int x) {
        if ((rear == n - 1 && front == 0) || ((rear + 1) == front)) {
            System.out.println("Queue Overflow .!");
            return;
        }
        rear = (rear + 1) % n;
        Q[rear] = x;
        if (front == -1) {
            front++;
        }
    }

    public int deQueue() {
        if (front == -1) {
            System.out.println("Queue underflow .!");
            return Integer.MIN_VALUE;
        }
        if (front == rear) {
            int y = Q[front];
            front = rear = -1;
            return y;
        }
        int y=Q[front];
        front = (front + 1) % n;
        return y;
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty .!");
            return;
        }
        for (int i = front; i != rear; i = (i + 1) % n) {
            System.out.println(Q[i]);
        }
        System.out.println(Q[rear]);
    }
}
