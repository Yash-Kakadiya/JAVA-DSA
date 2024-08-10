/*
 * 92. Write a program to implement Bubble using Array.
 */
public class BubbleSort {

    public static void sort(int[] arr) {
        int swapCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                }
            }
        }
        if (swapCount == 0) {
            System.out.println("Array is already sorted.");
        }
    }

    public static void display(int[] arr) {
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
