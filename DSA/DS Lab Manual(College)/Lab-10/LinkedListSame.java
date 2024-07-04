/*
 * 59. WAP to check whether 2 singly linked lists are same or not.
 */

public class LinkedListSame {

    // Node blueprint
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public Node head;
    public int size = 0;

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

    public int nthElement(int idx) {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public boolean isSame(LinkedListSame li1, LinkedListSame li2) {
        for (int i = 0; i < size; i++) {
            if (li1.nthElement(i) != li2.nthElement(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        LinkedListSame li1 = new LinkedListSame();
        LinkedListSame li2 = new LinkedListSame();

        for (int i = 1; i <= 10; i++) {
            li1.addLast(i);
        }
        for (int i = 1; i <= 10; i++) {
            li2.addLast(i);
        }
        System.out.println("Printing the circularly linked list 1.");
        li1.printList();
        System.out.println("Printing the circularly linked list 2.");
        li2.printList();

        if (li1.isSame(li1, li2)) {
            System.out.println("Both lists are same.");
        } else {
            System.out.println("Both lists are not same.");
        }
    }
}
