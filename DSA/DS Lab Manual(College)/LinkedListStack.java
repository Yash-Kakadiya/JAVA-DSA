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

    public char deleteLast() {
        if (head == null) {
            System.out.println("List is empty .!");
            return '\0';
        }
        Node temp = head, prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return temp.data;
    }
 
    public static void main(String[] args) {
        Stack s=new Stack();
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
    LinkedListStack S=new LinkedListStack();
 
    public void push(char x) {
        S.addLast(x);
    }
 
    public char pop() {
        return S.deleteLast();
    }
 
    public void display() {
       S.printList();
    }
 
 }
