import java.util.LinkedList;
// import java.util.*;

public class LinkedListUsingJCF { // JCF = Java Collections Framework
    public static void main(String[] args) {

        // create - objects only -> Integer, Float, Character
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        // remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
