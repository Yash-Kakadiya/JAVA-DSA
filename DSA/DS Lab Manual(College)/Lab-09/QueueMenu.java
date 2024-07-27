/*
 * 50. Write a menu driven program to implement following operations on the Queue using an Array 
     ENQUEUE 
     DEQUEUE 
     DISPLAY
 */

import java.util.Scanner;

public class QueueMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Queue : ");
        Queue q1 = new Queue(sc.nextInt());

        while (true) {
            System.out.println("--------------------------------");
            System.out.println("Queue operations.");
            System.out.println("1. to enQueue.");
            System.out.println("2. to deQueue.");
            System.out.println("3. to display queue.");
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

class Queue {
    int front = -1;
    int rear = -1;
    int n;
    int[] Q;

    public Queue(int n) {
        this.n = n;
        Q = new int[n];
    }

    public void enQueue(int x) {
        if (rear == n - 1) {
            System.out.println("Queue Overflow .!");
            return;
        }
        Q[++rear] = x;
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
        return Q[front++];
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
