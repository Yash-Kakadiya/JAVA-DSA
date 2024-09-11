/*
 * 94. Write a program to implement Selection Sort using Array.
 * Time Complexity:  Ω(n^2), θ(n^2), O(n^2).
 * Space Complexity: O(1).
 */
public class SelectionSort {

    public static void sort(int[] arr) {

        // Traverse through all array elements from 0 to length-1
        for (int i = 0; i < arr.length - 1; i++) {
            
            // Find the minimum element in remaining unsorted array
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap the minimum element with the current element at index 'i'
            if (minIdx != i) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
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
