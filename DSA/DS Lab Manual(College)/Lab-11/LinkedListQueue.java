/*
 * 61. Write a program to implement queue using singly linked list.(FIFO)
 */

public class LinkedListQueue {
    // Node blueprint
    public class Node {
        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    public void addLast(char data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (head == null) {
            head = newNode;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Linkend list is empty .!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public char deleteFirst() {
        char val = head.data;
        if (head == null) {
            System.out.println("List is empty .!");
            return '\0';
        }
        head = head.next;
        return val;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.push('a');
        q.push('b');
        q.push('c');

        q.display();
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        q.display();

    }
}

class Queue {
    LinkedListQueue Q = new LinkedListQueue();

    public void push(char x) {
        Q.addLast(x);
    }

    public char pop() {
        return Q.deleteFirst();
    }

    public void display() {
        Q.printList();
    }

}
