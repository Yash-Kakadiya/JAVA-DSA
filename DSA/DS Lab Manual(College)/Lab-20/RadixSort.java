// 95. Write a program to implement Radix Sort using Array.(Element must be positive integer).

public class RadixSort {
    public static void sort(int[] arr) {
        int max = getMax(arr);
        for (int place = 1; max / place > 0; place *= 10) {
            countSort(arr, place);
        }
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void countSort(int[] arr, int place) {
        int output[] = new int[arr.length];
        int count[] = new int[10];

        for (int i = 0; i < output.length; i++) {
            count[(arr[i] / place) % 10]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = 0; i < output.length; i++) {
            output[--count[(arr[i] / place) % 10]] = arr[i];
        }
        for (int i = 0; i < output.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 11, 2, 33, 4, 55 };

        System.out.println("Before");
        display(arr);

        sort(arr);

        System.out.println("After");
        display(arr);
    }
}
