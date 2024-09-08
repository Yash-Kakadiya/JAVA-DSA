// Q-05: next greater element in array

import java.util.Stack;

public class Q5 {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            nextGreater[i] = s.isEmpty() ? -1 : arr[s.peek()];
            s.push(i);
        }
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.println(arr[i] + " -> " + nextGreater[i]);
        }
    }
}
