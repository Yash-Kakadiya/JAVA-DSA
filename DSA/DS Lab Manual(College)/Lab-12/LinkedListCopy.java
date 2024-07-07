/*
 * 63. Write a program to copy a linked list.
 */

public class LinkedListCopy {

    // Node blueprint
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
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

    public void copyList(LinkedListCopy li1, LinkedListCopy li2) {
        if (li1.head == null) {
            System.out.println("List is empty .!");
            return;
        }
        Node temp = li1.head;
        while (temp != null) {
            li2.addLast(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListCopy li1 = new LinkedListCopy();
        LinkedListCopy li2 = new LinkedListCopy();

        for (int i = 1; i <= 10; i++) {
            li1.addLast(i);
        }

        li2.copyList(li1, li2);

        System.out.println("Linked List 1 :");
        li1.printList();
        System.out.println("Linked List 2 (Copied) :");
        li2.addLast(11); // for check
        li2.printList();

    }
}
