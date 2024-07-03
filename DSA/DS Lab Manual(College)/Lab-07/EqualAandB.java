/*
 * 40. Write a program to determine if an input character string is of the form a^i b^i where i >= 1 i.e., Number of ‘a’ should be equal to number of ‘b’.
 */

import java.util.Scanner;

class StackEqual {
    int top = -1;
    int n;
    char[] S;

    public StackEqual(int n) {
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

}

public class EqualAandB {

    public static boolean isEqual(String str) {

        StackEqual sA = new StackEqual(str.length());
        StackEqual sB = new StackEqual(str.length());

        int idx = 0;
        char next = nextChar(str, idx++);

        while (next != ' ') {
            if (next == 'a') {
                sA.push(next);
            } else if (next == 'b') {
                sB.push(next);
            }
            next = nextChar(str, idx++);
        }
        if (sA.top == sB.top) {
            return true;
        } else {
            return false;
        }

    }

    public static char nextChar(String str, int idx) {
        if (idx < str.length()) {
            return str.charAt(idx);
        } else {
            return ' ';
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.next();

        boolean status = isEqual(str);

        if (status) {
            System.out.println("Valid string");
        } else {
            System.out.println("Invalid string");
        }

        sc.close();
    }
}
