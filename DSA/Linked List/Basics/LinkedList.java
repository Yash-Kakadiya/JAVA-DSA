public class LinkedList {

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
    public Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int idx, int data) {
        if (idx == 0) { // starting index: 0 || start index:1
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0; // starting index: 0 || start index:1

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int deleteFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty.!");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0; // or size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int deleteLast() {
        if (size == 0) {
            System.out.println("Linked list is empty.!");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = tail.data; // or head.data
            head = tail = null;
            size = 0; // or size--;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = tail.data; // or prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key) { // iterative search
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.data == key) {
                return idx; // element found
            }
            temp = temp.next;
            idx++;
        }
        return -1; // element not found
    }

    public int helper(Node head, int key) { // actual recursive function
        if (head == null) {
            return -1; // element not found
        }

        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1; // element not found
        }
        return idx + 1;
    }

    public int recSearch(int key) { // recursive search
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public void deleteNthFromEnd(int n) {
        // calculate size (optional)
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (n == size) {
            head = head.next; // remove first element or head.next=null;
            return;
        }
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next; // remove nth element
        return;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // middle
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node midNode = findMid(head);
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; /// head of right half
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList li = new LinkedList();

        li.addFirst(2);
        li.addFirst(1);
        li.addLast(3);
        li.addLast(4);
        li.add(1, 5);
        li.printList();
        System.out.println(li.size);

        li.deleteFirst();
        li.printList();
        System.out.println(li.size);

        li.deleteLast();
        li.printList();
        System.out.println(li.size);

        System.out.println(li.itrSearch(3)); // returns index 2
        System.out.println(li.itrSearch(6)); // returns -1

        System.out.println(li.recSearch(3)); // returns index 2
        System.out.println(li.recSearch(6)); // returns -1

        li.reverse();
        li.printList();

        li.deleteNthFromEnd(2);
        li.printList();

        LinkedList li2 = new LinkedList();
        li2.addLast(1);
        li2.addLast(2);
        li2.addLast(2);
        li2.addLast(1);
        li2.printList();
        System.out.println(li2.checkPalindrome()); // true

    }
}