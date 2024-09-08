// Q-06: Valid parentheses

import java.util.Stack;

public class Q6 {
    public static boolean isValid(String str) {
        if (str.length() % 2 != 0)
            return false;

        Stack<Character> s = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }

                char temp = s.pop();

                if ((temp == '[' && ch != ']')
                        || (temp == '{' && ch != '}')
                        || (temp == '(' && ch != ')')) {
                    return false;
                }
            }
        }

        if (s.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "[{()}]";

        System.out.println(isValid(str));
    }
}
