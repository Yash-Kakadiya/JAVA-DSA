//22. Write a program to delete a number from a given location in an array.

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 4, 5, 6 };

        System.out.println("Old array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array[" + i + "] :  " + arr[i]);
        }
        System.out.println("--------------------------------");

        System.out.print("Enter the index to delete number : ");
        int idx = sc.nextInt();

        int newArr[] = new int[arr.length - 1];
        int j = 0;

        for (int i = 0; i < idx; i++) {
            newArr[j] = arr[i];
            j++;
        }

        for (int i = idx + 1; i < arr.length; i++) {
            newArr[j] = arr[i];
            j++;
        }

        System.out.println("-------------------------------");
        System.out.println("New array after deleting element at index " + idx + " :");
        for (int i = 0; i < newArr.length; i++) {
            System.out.println("New array[" + i + "] :  " + newArr[i]);
        }

        sc.close();
    }
}
