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

    public Node first;
    public Node last;
    public int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (first == null) {
            first = last = newNode;
            return;
        }

        newNode.next = first;
        first = newNode;
    }

    public void addLast(int data) {
        size++;
        Node newNode = new Node(data);
        if (first == null) {
            first = last = newNode;
            return;
        }
        last.next = newNode;
        last = newNode;
    }

    public void printList() {
        Node temp = first;
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
        Node temp = first;
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
            int val = first.data;
            first = last = null;
            size = 0; // or size--;
            return val;
        }
        int val = first.data;
        first = first.next;
        size--;
        return val;
    }

    public int deleteLast() {
        if (size == 0) {
            System.out.println("Linked list is empty.!");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = last.data; // or first.data
            first = last = null;
            size = 0; // or size--;
            return val;
        }
        Node prev = first;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = last.data; // or prev.next.data;
        prev.next = null;
        last = prev;
        size--;
        return val;
    }

    public int itrSearch(int key) { // iterative search
        Node temp = first;
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

    public int helper(Node first, int key) { // actual recursive function
        if (first == null) {
            return -1; // element not found
        }

        if (first.data == key) {
            return 0;
        }
        int idx = helper(first.next, key);
        if (idx == -1) {
            return -1; // element not found
        }
        return idx + 1;
    }

    public int recSearch(int key) { // recursive search
        return helper(first, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = last = first;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        first = prev;

    }

    public void deleteNthFromEnd(int n) {
        // calculate size (optional)
        int size = 0;
        Node temp = first;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (n == size) {
            first = first.next; // remove first element or first.next=null;
            return;
        }
        int i = 1;
        int iToFind = size - n;
        Node prev = first;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next; // remove nth element
        return;
    }

    public Node findMid(Node first) {
        Node slow = first;
        Node fast = first;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // middle
    }

    public boolean checkPalindrome() {
        if (first == null || first.next == null) {
            return true;
        }
        Node midNode = findMid(first);
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; /// first of right half
        Node left = first;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public boolean isCycle() {
        Node slow = first;
        Node fast = first;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // cycle
            }
        }
        return false;
    }

    public void removeCycle() {
        Node slow = first;
        Node fast = first;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        slow = first;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null; // remove cycle

    }

    private Node getMid(Node first) {
        Node slow = first;
        Node fast = first.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node first1, Node first2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (first1 != null && first2 != null) {
            if (first1.data <= first2.data) {
                temp.next = first1;
                first1 = first1.next;
                temp = temp.next;
            } else {
                temp.next = first2;
                first2 = first2.next;
                temp = temp.next;
            }
        }
        while (first1 != null) {
            temp.next = first1;
            first1 = first1.next;
            temp = temp.next;
        }
        while (first2 != null) {
            temp.next = first2;
            first2 = first2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node first) {
        if (first == null || first.next == null) {
            return first;
        }
        Node mid = getMid(first);
        Node rightfirst = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(first);
        Node newRight = mergeSort(rightfirst);

        return merge(newLeft, newRight);
    }

    public void zigZag() {
        Node slow = first;
        Node fast = first.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = first;
        Node right = prev;
        Node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
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

        // first = new Node(1);
        // Node temp = new Node(2);
        // first.next = temp;
        // first.next.next = new Node(3);
        // first.next.next.next = temp;
        // System.out.println(isCycle());

        // removeCycle();
        // System.out.println(isCycle()); // false

        LinkedList li3 = new LinkedList();
        li3.addFirst(1);
        li3.addFirst(2);
        li3.addFirst(3);
        li3.addFirst(4);

        li3.printList();
        li3.first = li3.mergeSort(li3.first);
        li3.printList();

        LinkedList li4 = new LinkedList();
        li4.addLast(1);
        li4.addLast(2);
        li4.addLast(3);
        li4.addLast(4);
        li4.addLast(5);

        li4.printList();
        li4.zigZag();
        li4.printList();
    }
}