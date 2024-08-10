public class DoublyLL {

    // Node blueprint
    public static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public Node first;
    public Node last;
    public int size;

    void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (first == null) {
            first = last = newNode;
            return;
        }
        newNode.next = first;
        first = newNode;
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (first == null) {
            first = last = newNode;
            return;
        }
        newNode.prev = last;
        last.next = newNode;
        last = newNode;
    }

    void deleteFirst() {
        if (first == null) {
            System.out.println("List is empty .!");
            return;
        }
        first = first.next;
        first.prev = null;
        size--;
    }

    void deleteLast() {
        if (first == null) {
            System.out.println("List is empty .!");
            return;
        }
        last = last.prev;
        last.next = null;
        size--;
    }

    void deletePos(int idx) {
        if (idx > size - 1) {
            System.out.println("Invalid position. ");
            return;
        }
        if (first == null) {
            System.out.println("List is empty .!");
            return;
        }
        if (idx == 0) { // starting index: 0 || start index:1
            first = first.next;
            first.prev = null;
            size--;
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
        size--;
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

    void reverse() {
        last = first;
        Node curr = first;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        first = prev;

    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();

        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addFirst(0);
        dll.deleteFirst();
        dll.deleteLast();
        dll.deletePos(1);

        dll.display();

        dll.reverse();
        dll.display();

    }
}
