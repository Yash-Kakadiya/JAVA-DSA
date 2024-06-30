//26. Write a program to merge two unsorted arrays.

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array : ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        System.out.println("Enter the elements for first array : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter value for index " + i + " : ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("--------------------------------------------------------");
        System.out.print("Enter size of second array : ");
        int m = sc.nextInt();

        int[] arr2 = new int[m];

        System.out.println("Enter the elements for first array : ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter value for index " + i + " : ");
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[m + n];

        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
                System.out.println(i + "<- i , arr1 " + arr3[i]);
            } else {
                arr3[i] = arr2[i - n];
                System.out.println(i + "<- i , arr2 " + arr3[i]);
            }
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("Merged array : ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        sc.close();
    }

}
