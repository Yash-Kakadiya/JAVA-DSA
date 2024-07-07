/*
 * 57. Write a menu driven program to implement following operations on the singly linked list.  
     Insert a node at the front of the linked list. 
     Display all nodes. 
     Delete a first node of the linked list. 
     Insert a node at the end of the linked list. 
     Delete a last node of the linked list. 
     Delete a node from specified position.
 */

import java.util.Scanner;

public class LinkedListMenu {

    // Node blueprint
    public class Node {
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

    public void addPos(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0; // starting index: 0 || start index:1

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void addOrder(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data >= data) {
            addFirst(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.data <= data && temp.next.data >= data) {
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
        addLast(data);
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

    public void deleteFirst() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty .!");
            return;
        }
        head = temp.next;
        System.out.println("First node deleted successfully.");
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty .!");
            return;
        }
        Node temp = head, prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        System.out.println("Last node deleted successfully.");
    }

    public void deletePos(int idx) {
        if (head == null) {
            System.out.println("List is empty .!");
            return;
        }
        if (idx == 0) { // starting index: 0 || start index:1
            deleteFirst();
            return;
        }
        Node temp = head, prev = null;
        int i = 0; // starting index: 0 || start index:1
        while (i < idx) {
            prev = temp;
            temp = temp.next;
            i++;
        }
        prev.next = temp.next;
        System.out.println("Node deleted successfully at position " + idx);
    }

    public void deteteValue(int data) {
        if (head == null) {
            System.out.println("List is empty.!");
            return;
        }
        if (head.data == data) {
            deleteFirst();
            return;
        }
        Node temp = head, prev = null;
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Node not found.");
            return;
        }
        prev.next = temp.next;
        System.out.println("Node deleted successfully with value " + data);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedListMenu li = new LinkedListMenu();

        while (true) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Menu options : ");
            System.out.println("1.Insert a node at the front of the linked list.");
            System.out.println("2.Insert a node at the end of the linked list.");
            System.out.println("3.Insert a node in order.");
            System.out.println("4.Insert a node at given index.");
            System.out.println("5.Display all nodes.");
            System.out.println("6.Delete a first node of the linked list.");
            System.out.println("7.Delete a last node of the linked list. ");
            System.out.println("8.Delete a node at given index.");
            System.out.println("9.Delete a node of given value.");
            System.out.println("Enter anything else to exit...");
            System.out.print("Enter option : ");
            int op = sc.nextInt();
            System.out.println("--------------------------------------------------------------");

            switch (op) {
                case 1:
                    System.out.print("Enter value to be inserted at first : ");
                    li.addFirst(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter value to be inserted at last : ");
                    li.addLast(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter value to be inserted in order : ");
                    li.addOrder(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter index at which value is to be inserted : ");
                    int idx = sc.nextInt();
                    System.out.print("Enter value to be inserted : ");
                    int data = sc.nextInt();
                    li.addPos(idx, data);
                    break;
                case 5:
                    System.out.println("Displaying Linked List : ");
                    li.printList();
                    break;
                case 6:
                    li.deleteFirst();
                    break;
                case 7:
                    li.deleteLast();
                    break;
                case 8:
                    System.out.print("Enter index of node to be deleted : ");
                    li.deletePos(sc.nextInt());
                    break;
                case 9:
                    System.out.println("Enter value to be deleted : ");
                    li.deteteValue(sc.nextInt());
                default:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
            }

        }

    }
}
