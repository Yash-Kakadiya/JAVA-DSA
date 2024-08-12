/*
 * 96. Write a program to implement Merge Sort using Array.
 */

public class MergeSort {

    static void sort(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        mergeSort(low, high, arr);
    }

    static void mergeSort(int low, int high, int[] arr) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(low, mid, arr);
            mergeSort(mid + 1, high, arr);
            merge(low, mid, high, arr);
        }
    }

    static void merge(int low, int mid, int high, int[] arr) {

        int[] localArr = new int[high + 1];
        int leftIdx = low, rigthIdx = mid + 1, localI = low;

        while (leftIdx <= mid && rigthIdx <= high) {
            if (arr[leftIdx] <= arr[rigthIdx]) {
                localArr[localI] = arr[leftIdx++];
            } else {
                localArr[localI] = arr[rigthIdx++];
            }
            localI++;
        }

        if (leftIdx > mid) {
            for (int k = rigthIdx; k <= high; k++) {
                localArr[localI++] = arr[k];
            }
        } else {
            for (int k = leftIdx; k <= mid; k++) {
                localArr[localI++] = arr[k];
            }
        }

        for (int i = low; i <= high; i++) {
            arr[i] = localArr[i];
        }
    }

    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 11, 2, 33, 4, -55 };

        System.out.println("Before");
        display(arr);
        System.out.println();

        sort(arr);

        System.out.println("After");
        display(arr);
    }
}