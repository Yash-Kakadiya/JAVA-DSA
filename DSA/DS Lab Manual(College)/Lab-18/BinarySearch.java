/*
 * 91. Write a program to implement a Binary Search using Array.
 * Time Complexity:  Ω(1), θ(log n), O(log n).
 * Space Complexity: O(1), O(log n) ( for recursive version).
 */

public class BinarySearch {
    public static int searchItr(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (arr[middle] == key) {
                return middle;
            } else if (key > arr[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static int searchRec(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        return searchRecFn(arr, key, left, right);
    }

    public static int searchRecFn(int[] arr, int key, int left, int right) {
        if (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == key) {
                return middle;
            } else if (key > arr[middle]) {
                return searchRecFn(arr, key, middle + 1, right);
            } else {
                return searchRecFn(arr, key, left, middle - 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int key = 3;

        int idx = searchItr(arr, key);
        int idx2 = searchRec(arr, key);

        if (idx != -1 && idx2 != -1) {
            System.out.println("Key " + key + " found at index " + idx + " using iterative approach.");
            System.out.println("Key " + key + " found at index " + idx + " using recursive approach.");
        } else {
            System.out.println("Key " + key + " not found.");
        }
    }
}
