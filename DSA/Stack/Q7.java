// Q-07: Duplicate parentheses (Note: Always given valid string).

import java.util.Stack;

public class Q7 {
    public static boolean hasDuplicate(String str) {
        Stack<Character> s = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;
                while (s.pop() != '(') {
                    count++;
                }
                if (count == 0) {
                    return true;
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))"; // true
        String str2 = "(a+b)"; // false

        System.out.println(str + " : " + hasDuplicate(str));
        System.out.println(str2 + " : " + hasDuplicate(str2));
    }
}
