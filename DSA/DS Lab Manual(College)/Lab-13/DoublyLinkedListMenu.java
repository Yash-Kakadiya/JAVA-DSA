/*
 * 72. Write a menu driven program to implement following operations on the doubly linked list. 
     Insert a node at the front of the linked list. 
     Delete a node from specified position. 
     Insert a node at the end of the linked list.
     Display all nodes.

   73. WAP to delete alternate nodes of a doubly linked list.
 */

import java.util.Scanner;

public class DoublyLinkedListMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DoublyLinkedList cll = new DoublyLinkedList();

        while (true) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Menu options : ");
            System.out.println("1.Insert a node at the front of the linked list.");
            System.out.println("2.Insert a node at the end of the linked list.");
            System.out.println("3.Display all nodes.");
            System.out.println("4.Delete a node at given index.");
            System.out.println("5.Delete alternate nodes.");
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
                    cll.deleteAtlernate();
                    break;
                default:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
            }

        }
    }
}

class DoublyLinkedList {

    Node first;
    Node last;

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            next = null;
            prev = null;
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
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = last = newNode;
            return;
        }
        newNode.prev = last;
        last.next = newNode;
        last = newNode;
    }

    void deletePos(int idx) {
        if (first == null) {
            System.out.println("List is empty .!");
            return;
        }
        if (idx == 0) { // starting index: 0 || start index:1
            first = first.next;
            first.prev = null;
            return;
        }
        Node temp = first;
        int i = 0; // starting index: 0 || start index:1
        while (i < idx) {
            temp = temp.next;
            i++;
        }
        if (temp == last) {
            last = last.prev;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.prev = null;
        temp.next = null;
        System.out.println("Node deleted successfully at position " + idx);
    }

    void display() {
        if (first == null) {
            System.out.println("Linkend list is empty .!");
            return;
        }
        if (first == last) {
            System.out.print(first.data + " ");
            return;
        }
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void deleteAtAddress(Node temp) {
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.prev = null;
        temp.next = null;
    }

    void deleteAtlernate() {
    }
}