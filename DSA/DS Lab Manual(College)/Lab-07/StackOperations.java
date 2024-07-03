/*38. Write a menu driven program to implement following operations on the Stack using an Array 
    PUSH, POP, DISPLAY
    PEEP, CHANGE 
*/

import java.util.Scanner;

class StackOp {
    int top = -1;
    int n;
    int[] S;

    public StackOp(int n) {
        this.n = n;
        S = new int[n];
    }

    public void push(int x) {
        if (top >= n - 1) {
            System.out.println("-----------------------------------------");
            System.out.println("Stack overflow");
            System.out.println("-----------------------------------------");
            return;
        }
        S[++top] = x;
        return;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("-----------------------------------------");
            System.out.println("Stack Underflow");
            System.out.println("-----------------------------------------");
            return Integer.MIN_VALUE;
        }
        return S[top--];
    }

    public int peep(int i) {
        if (top - i + 1 < 0) {
            System.out.println("-----------------------------------------");
            System.out.println("Stack underflow");
            System.out.println("-----------------------------------------");
            return Integer.MIN_VALUE;
        }
        return S[top - i + 1];
    }

    public void change(int i, int x) {
        if (top - i + 1 < 0) {
            System.out.println("-----------------------------------------");
            System.out.println("Stack underflow");
            System.out.println("-----------------------------------------");
            return;
        }
        S[top - i + 1] = x;
        return;
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(S[i]);
        }
    }

}

public class StackOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Stack : ");
        int n = sc.nextInt();
        StackOp s1 = new StackOp(n);

        while (true) {
            System.out.println("--------------------------------");
            System.out.println("Stack operations.");
            System.out.println("1. to push element.");
            System.out.println("2. to pop element.");
            System.out.println("3. to peep ith element.");
            System.out.println("4. to change ith element.");
            System.out.println("5. to display stack.");
            System.out.println("enter anything else to exit...");
            System.out.print("Chose one option :");
            int op = sc.nextInt();
            System.out.println("-----------------------------------------");

            switch (op) {
                case 1:
                    System.out.print("Enter value to push : ");
                    int x = sc.nextInt();
                    s1.push(x);
                    break;
                case 2:
                    System.out.println(s1.pop());
                    break;
                case 3:
                    System.out.print("Enter value of nth element to peep element : ");
                    int i = sc.nextInt();
                    System.out.println(s1.peep(i));
                    break;
                case 4:
                    System.out.print("Enter value to be change : ");
                    int x1 = sc.nextInt();
                    System.out.print("Enter nth element to be change : ");
                    int i1 = sc.nextInt();
                    s1.change(i1, x1);
                    break;
                case 5:
                    System.out.println("Stack : ");
                    s1.display();
                    break;
                default:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
            }

        }
    }
}
