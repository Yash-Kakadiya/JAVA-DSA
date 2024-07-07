/*
 * 58.  Write a program to count the number of nodes in a singly circularly linked list.
 */

public class LinkedListCount {
    // Node blueprint
    public  class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = head; // singly circularly linked list.
            count++;
        }
    }

    public Node head;
    public static int count;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
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
        while (temp.next != head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedListCount li = new LinkedListCount();

        for (int i = 1; i <= 10; i++) {
            li.addLast(i);
        }
        System.out.println("Printing the circularly linked list.");
        li.printList();
        System.out.println("Number of nodes in the circularly linked list: " + count);

    }
}
