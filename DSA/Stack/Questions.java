import java.util.Stack;;

public class Questions {
    // Q-01: Push at bottom of stack
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int temp = s.pop();
        pushAtBottom(s, data);
        s.push(temp);
    }

    // Q-02: Reverse string using stack
    public static String revreString(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb = sb.append(s.pop());
        }
        return sb.toString();
    }

    // Q-03: Reverse a stack
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty())
            return;

        int temp = s.pop();
        reverseStack(s);
        pushAtBottom(s, temp);
    }

    public static void main(String[] args) {

        // // Q-01: Push at bottom of stack
        // Stack<Integer> s = new Stack<>();

        // s.push(1);
        // s.push(2);
        // s.push(3);

        // System.out.println("Before: " + s);

        // pushAtBottom(s, 4);
        // System.out.println("After:" + s);

        // // Q-02: Reverse string using stack
        // String str = "Yash";
        // String reverseStr = revreString(str);
        // System.err.println("String: " + str);
        // System.err.println("Reverse string: " + reverseStr);

        // Q-03: Reverse a stack
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Before: " + s);
        reverseStack(s);
        System.out.println("After: " + s);
    }
}
