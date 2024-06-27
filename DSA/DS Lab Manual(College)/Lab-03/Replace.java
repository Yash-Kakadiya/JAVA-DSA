//18. Read  n  numbers  in  an  array  then  read  two  different  numbers,  replace  1st number with 2nd number in an array and print its index and final array.

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter new value to replace : ");
        int a = sc.nextInt();

        System.out.print("Enter old number to replace : ");
        int b = sc.nextInt();

        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == b) {
                idx = i;
                arr[i] = a;
                break;
            }
        }

        System.out.println("--------------------------------------------------------");

        if (idx != -1) {
            System.out.println("Number " + b + " replaced at index " + idx);
        } else {
            System.out.println("Number " + b + " not found in array.");
        }

        System.out.println("Array after replacement.");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
