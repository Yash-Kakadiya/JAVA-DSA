/*97. Write a program to implement Quick Sort using Array.
 * Time Complexity:  Ω(nlog n), θ(nlog n), O(n^2).
 * Space Complexity: Ω(log n), θ(log n), O(n).
 */

public class QuickSort {

    static void sort(int[] arr) {
        int lb = 0;
        int ub = arr.length - 1;
        quickSort(arr, lb, ub);
    }

    static void quickSort(int[] arr, int lb, int ub) {
        boolean flag = true;

        if (lb < ub) {
            int i = lb;
            int j = ub;
            int pivot = arr[lb]; // Choose the pivot element as the first element of the array

            while (flag) {

                // Find element greater than the pivot on the left
                i++;
                while (arr[i] < pivot) {
                    i++;
                }

                // Find element smaller than the pivot on the right
                while (arr[j] > pivot) {
                    j--;
                }

                // Swap arr[i] and arr[j] if i is still less than j
                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else {
                    flag = false;
                }

            }

            // Place the pivot in its correct position
            int temp = arr[lb];
            arr[lb] = arr[j];
            arr[j] = temp;

            // Recursively sort the left and right subarrays
            quickSort(arr, lb, j - 1);
            quickSort(arr, j + 1, ub);
        }
        return;
    }

    static void display(int[] arr) {
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
