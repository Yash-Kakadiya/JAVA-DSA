//16. Write a program to find position of the smallest number & the largest number from given n numbers.

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int maxidx = 0;
        int min = arr[0];
        int minidx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxidx = i;
            }
            if (min > arr[i]) {
                min = arr[i];
                minidx = i;
            }
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Maximum number in given array is " + max + " and it's index is " + maxidx);
        System.out.println("Minimum number in given array is " + min + " and it's index is " + minidx);

        sc.close();
    }

}
