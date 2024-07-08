/*
 * 60. Write a program to implement stack using singly linked list.(LIFO)
 */

public class LinkedListStack {
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

    public void addFirst(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
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
        Stack s = new Stack();
        s.push('a');
        s.push('b');
        s.push('c');

        s.display();
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.display();

    }
}

class Stack {
    LinkedListStack S = new LinkedListStack();

    public void push(char x) {
        S.addFirst(x);
    }

    public char pop() {
        return S.deleteFirst();
    }

    public void display() {
        S.printList();
    }

}
