/*
 * 39. How stack can be used to recognize strings aca, bcb, abcba, abbcbba?
 *  Write a program to solve the above problem.
 */

import java.util.Scanner;

class StackReco {
    int top = -1;
    int n;
    char[] S;

    public StackReco(int n) {
        this.n = n;
        S = new char[n];
    }

    public void push(char x) {
        if (top >= n - 1) {
            System.out.println("-----------------------------------------");
            System.out.println("Stack overflow. top = " + top);
            System.out.println("-----------------------------------------");
            return;
        }
        S[++top] = x;
        return;
    }

    public char pop() {
        if (top < 0) {
            System.out.println("-----------------------------------------");
            System.out.println("Stack Underflow");
            System.out.println("-----------------------------------------");
            return '\0';
        }
        return S[top--];
    }

    public char nextChar(String str, int idx) {
        if (idx < str.length()) {
            return str.charAt(idx);
        } else {
            return ' ';
        }
    }

}

public class Recognize {

    public static boolean isPalindrome(String str) {
        StackReco stack = new StackReco(str.length());

        int idx = 0;
        char next = stack.nextChar(str, idx++);

        while (next != 'c') {
            if (next == ' ') {
                return false; // invalid string
            } else {
                stack.push(next);
                next = stack.nextChar(str, idx++);
            }
        }

        while (stack.top != -1) {
            next = stack.nextChar(str, idx++);
            char x = stack.pop();

            if (x != next) {
                return false; // invalid string
            }
        }

        next = stack.nextChar(str, idx++); // to add ' '
        if (next == ' ') {
            return true; // valid string
        } else {
            return false; // invalid string
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.next();

        boolean status = isPalindrome(str);

        if (status) {
            System.out.println("Valid string");
        } else {
            System.out.println("Invalid string");
        }

        sc.close();
    }
}
