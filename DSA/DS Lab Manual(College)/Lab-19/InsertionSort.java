/*
 * 93. Write a program to implement Insertion Sort using Array.
 * Time Complexity:  Ω(n), θ(n^2), O(n^2).
 * Space Complexity: O(1).
 */

public class InsertionSort {

    public static void sort(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            i++;
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 11, 2, 33, 4, -55 };

        System.out.println("Before");
        display(arr);

        sort(arr);

        System.out.println("After");
        display(arr);
    }
}
