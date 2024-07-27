/*
 * 71. Write a menu driven program to implement following operations on the circular linked list. 
     Insert a node at the front of the linked list. 
     Delete a node from specified position. 
     Insert a node at the end of the linked list. 
     Display all nodes.
 */

import java.util.Scanner;

public class CircularLinkedListMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CircularLinkedList cll = new CircularLinkedList();

        while (true) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Menu options : ");
            System.out.println("1.Insert a node at the front of the linked list.");
            System.out.println("2.Insert a node at the end of the linked list.");
            System.out.println("3.Display all nodes.");
            System.out.println("4.Delete a node at given index.");
            System.out.println("5.Delete a node of given value.");
            System.out.println("Enter anything else to exit...");
            System.out.print("Enter option : ");
            int op = sc.nextInt();
            System.out.println("--------------------------------------------------------------");

            switch (op) {
                case 1:
                    System.out.print("Enter value to be inserted at first : ");
                    cll.addFirst(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter value to be inserted at last : ");
                    cll.addLast(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Displaying Linked List : ");
                    cll.display();
                    break;
                case 4:
                    System.out.print("Enter index of node to be deleted : ");
                    cll.deletePos(sc.nextInt());
                    break;
                case 5:
                    System.out.println("Enter value to be deleted : ");
                    cll.deteteValue(sc.nextInt());
                    break;
                default:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
            }

        }
    }
}

class CircularLinkedList {

    Node first;
    Node last;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void addFirst(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = last = newNode;
            return;
        }
        newNode.next = first;
        first = newNode;
        last.next = newNode;
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = last = newNode;
            return;
        }
        last.next = newNode;
        newNode.next = first;
        last = newNode;
    }

    void deletePos(int idx) {
        if (first == null) {
            System.out.println("List is empty .!");
            return;
        }
        if (idx == 0) { // starting index: 0 || start index:1
            first = first.next;
            last.next = first;
            return;
        }
        Node temp = first, prev = null;
        int i = 0; // starting index: 0 || start index:1
        while (i < idx) {
            prev = temp;
            temp = temp.next;
            i++;
        }
        if (temp == last) {
            last = prev;
        }
        prev.next = temp.next;
        System.out.println("Node deleted successfully at position " + idx);
    }

    void deteteValue(int data) {
        if (first == null) {
            System.out.println("List is empty.!");
            return;
        }
        if (first.data == data) {
            first = first.next;
            last = first;
            return;
        }
        Node temp = first, prev = null;
        while (temp.data != data && temp != last) {
            prev = temp;
            temp = temp.next;
        }
        if (temp.data == data) {
            prev.next = temp.next;
            if (temp == last) {
                last = prev;
            }
            System.out.println("Node deleted successfully with value " + data);
            return;
        }
        System.out.println("Node with value " + data + " is not found !");
    }

    public void display() {
        if (first == null) {
            System.out.println("Linkend list is empty .!");
            return;
        }
        if (first == last) {
            System.out.print(first.data + " ");
            return;
        }
        Node temp = first;
        while (temp.next != first) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + " ");
        System.out.println();
    }

}
