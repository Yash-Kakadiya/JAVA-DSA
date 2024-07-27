import java.util.Scanner;

public class PrefixNotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix: ");
        String infix = sc.nextLine();
        StringBuilder revInfix = new StringBuilder(infix);
        revInfix.reverse();
        revInfix.append(")");
        Stack st = new Stack(revInfix.length());
        st.push('(');
        StringBuilder polish = new StringBuilder();
        int i = 0;
        int rank = 0;

        while (i < revInfix.length() && st.top != -1) {
            char next = revInfix.charAt(i);
            i++;

            if (next == ' ') {
                continue;
            }

            if (next >= 'a' && next <= 'z') {
                polish.append(next);
                rank++;
            } else if (next == '(') {
                st.push(next);
            } else if (next == ')') {
                while (st.top != -1 && st.peep(1) != '(') {
                    char temp = st.pop();
                    polish.append(temp);
                    rank += rank(temp);
                }
                st.pop(); // pop the '('
            } else {
                while (st.top != -1 && stackPrecedence(st.peep(1)) >= infixPrecedence(next)) {
                    char temp = st.pop();
                    polish.append(temp);
                    rank += rank(temp);
                }
                st.push(next);
                rank--;
            }
        }

        while (st.top != -1 && st.peep(1) != '(') {
            char temp = st.pop();
            polish.append(temp);
            rank += rank(temp);
        }

        System.out.println(polish.reverse());
    }

    public static int infixPrecedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 3;
            case '^':
                return 6;
            case '(':
                return 9;
            case ')':
                return 0;
            default:
                return 7;
        }
    }

    public static int stackPrecedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 2;
            case '*':
            case '/':
                return 4;
            case '^':
                return 5;
            case '(':
                return 0;
            default:
                return 8;
        }
    }

    public static int rank(char c) {
        String operators = "+-/*^";
        if (operators.indexOf(c) != -1) {
            return -1;
        }
        return 1;
    }
}

class Stack {
    char[] S;
    int top = -1;
    int N;

    public Stack(int size) {
        N = size;
        S = new char[N];
    }

    public void push(char X) {
        if (top >= N - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            S[top] = X;
        }
    }

    public char pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return ' ';
        } else {
            return S[top--];
        }
    }

    public char peep(int index) {
        if (top - index + 1 < 0) {
            System.out.println("Stack Underflow");
            return ' ';
        } else {
            return S[top - index + 1];
        }
    }
}
