/*
 * 52. Write a menu driven program to implement following operations on the Doubled Ended Queue using an Array 
     Insert at front end, Insert at rear end 
     Delete from front end, Delete from rear end 
     Display all elements of the queue
 */

import java.util.Scanner;

public class DoubleEndedQueueMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Double ended Queue : ");
        DoubleEndedQueue q1 = new DoubleEndedQueue(sc.nextInt());

        while (true) {
            System.out.println("--------------------------------");
            System.out.println("Queue operations.");
            System.out.println("1. to enQueue to beginning.");
            System.out.println("2. to deQueue from beginning.");
            System.out.println("3. to enQueue to end.");
            System.out.println("4. to deQueue from end.");
            System.out.println("5. to display queue.");
            System.out.println("enter anything else to exit...");
            System.out.print("Chose one option :");
            int op = sc.nextInt();
            System.out.println("-----------------------------------------");

            switch (op) {
                case 1:
                    System.out.print("Enter value to enQueue to beginning: ");
                    q1.enQueueStart(sc.nextInt());
                    break;
                case 2:
                    System.out.println(q1.deQueueStart());
                    break;
                case 3:
                    System.out.print("Enter value to enQueue to end: ");
                    q1.enQueueEnd(sc.nextInt());
                    break;
                case 4:
                    System.out.println(q1.deQueueEnd());
                    break;
                case 5:
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

class DoubleEndedQueue {
    int front = -1;
    int rear = -1;
    int n;
    int[] Q;

    public DoubleEndedQueue(int n) {
        this.n = n;
        Q = new int[n];
    }

    public void enQueueEnd(int x) {
        if (rear == n - 1) {
            System.out.println("Queue Overflow .!");
            return;
        }
        Q[++rear] = x;
        if (front == -1) {
            front++;
        }
    }

    public void enQueueStart(int x) {
        if (front == 0) {
            System.out.println("Queue Overflow .!");
            return;
        }
        if (front == -1) {
            Q[++front] = x;
            rear++;
            return;
        }
        Q[--front] = x;
    }

    public int deQueueStart() {
        if (front == -1) {
            System.out.println("Queue underflow .!");
            return Integer.MIN_VALUE;
        }
        if (front == rear) {
            int y = Q[front];
            front = rear = -1;
            return y;
        }
        return Q[front++];
    }

    public int deQueueEnd() {
        if (rear == -1) {
            System.out.println("Queue underflow .!");
            return Integer.MIN_VALUE;
        }
        if (front == rear) {
            int y = Q[front];
            front = rear = -1;
            return y;
        }
        return Q[rear--];
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty .!");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.println(Q[i]);
        }
    }
}
