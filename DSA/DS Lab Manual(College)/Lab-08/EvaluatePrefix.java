/*
 * 48. Write a program for evaluation of prefix Expression using Stack.
 */

import java.util.*;

public class EvaluatePrefix {
    public static double evalPostfix(String str) {

        if (!(Character.isDigit(str.charAt(str.length() - 1)))) {
            return Double.MIN_VALUE;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = str.length() - 1; i >= 0; i--) {

            char temp = str.charAt(i);

            if (Character.isDigit(temp)) {
                stack.push(Integer.parseInt(temp + ""));
            } else {
                int a = stack.pop();
                int b = stack.pop();

                switch (temp) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                    case '^':
                        stack.push((int) (Math.pow(a, b)));
                        break;
                    default:
                        return Double.MIN_VALUE;
                }

            }
        }
        if (stack.size() != 1) {
            return Double.MIN_VALUE;
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a valid prefix :");
        String str = sc.nextLine();

        double ans = evalPostfix(str);

        if (ans == Double.MIN_VALUE) {
            System.out.println("Invalid String");
        } else {
            System.out.println("Answer : " + ans);
        }
        sc.close();
    }
}
