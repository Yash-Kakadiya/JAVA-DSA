/*
 * 98. Write a program to implement Heap Sort using Array.
 * Time Complexity:  Ω(nlog n), θ(nlog n), O(nlog n).
 * Space Complexity: O(1)(in-place sorting).
 */

public class HeapSort {
    public static void sort(int[] arr) {
        int n = arr.length;

        // Build max heap
        buildMaxHeap(arr, n);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {

            // Move current root (largest) to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void buildMaxHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    // Heapify a subtree rooted with node i, n is the size of heap
    public static void heapify(int[] arr, int n, int i) {
        int maxIdx = i; // Initialize largest as root
        int leftChildIdx = 2 * i + 1; // left child
        int rigthChildIdx = 2 * i + 2; // right child

        // If left child is larger than root
        if (leftChildIdx < n && arr[leftChildIdx] > arr[maxIdx]) {
            maxIdx = leftChildIdx;
        }

        // If right child is largest
        if (rigthChildIdx < n && arr[rigthChildIdx] > arr[maxIdx]) {
            maxIdx = rigthChildIdx;
        }

        // If largest is not root
        if (i != maxIdx) {
            // swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, maxIdx);
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        System.out.println("Before :");
        display(arr);

        sort(arr);

        System.out.println("After :");
        display(arr);
    }
}