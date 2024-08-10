/*
 * 91. Write a program to implement a Binary Search using Array.
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
            } else if (arr[middle] < key) {
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

        int idx = searchRecFn(arr, key, left, right);
        return idx;
    }

    public static int searchRecFn(int[] arr, int key, int left, int right) {
        if (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == key) {
                return middle;
            } else if (arr[middle] < key) {
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

        if (idx != -1) {
            System.out.println("Key " + key + " found at index " + idx + " using iterative approach.");
        } else {
            System.out.println("Key " + key + " not found  using iterative approach.");
        }
        if (idx2 != -1) {
            System.out.println("Key " + key + " found at index " + idx + " using recursive approach.");
        } else {
            System.out.println("Key " + key + " not found using recursive approach.");
        }
    }
}
