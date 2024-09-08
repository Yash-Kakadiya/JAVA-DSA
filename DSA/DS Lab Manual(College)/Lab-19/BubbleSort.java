/*
 * 92. Write a program to implement Bubble using Array.
 */
public class BubbleSort {

    public static void sort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int last = arr.length - 1;
            int swapCount = 0;
            for (int j = 0; j <= last - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                    // System.out.println(swapCount);
                }
            }
            if (swapCount == 0 && i == 0) {
                System.out.println("Array is already sorted.");
                return;
            }
            last--;

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
