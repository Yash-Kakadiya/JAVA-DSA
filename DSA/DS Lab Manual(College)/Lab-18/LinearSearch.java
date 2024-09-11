/*
 * 90. Write a program to implement a Linear Search using Array.
 * Time Complexity:  Ω(1), θ(n), O(n).
 * Space Complexity: O(1).
 */

//  LEETCODE 42<->2390 , 49<->155, 55<->1700, 81<->110, 100<->75

public class LinearSearch {
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int key = 3;

        int idx = search(arr, key);

        if (idx != -1) {
            System.out.println("Key " + key + " found at index " + idx + ".");
        } else {
            System.out.println("Key " + key + " not found.");
        }
    }
}
