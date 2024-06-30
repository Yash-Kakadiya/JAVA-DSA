// 21. Write a program to insert a number at a given location in an array.

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 4, 5, 6 };

        System.out.println("old array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array[" + i + "] :  " + arr[i]);
        }
        System.out.println("--------------------------------");

        System.out.print("Enter the index to insert number : ");
        int idx = sc.nextInt();

        System.out.println("Enter the number to be inserted : ");
        int num = sc.nextInt();

        int j = 0;

        int newArr[] = new int[arr.length + 1];

        for (int i = 0; i < newArr.length; i++) {
            if (idx == i) {
                newArr[i] = num;
                continue;
            }
            newArr[i] = arr[j];
            j++;
        }

        System.out.println("-------------------------------");
        System.out.println("New array after insertion :");
        for (int i = 0; i < newArr.length; i++) {
            System.out.println("New array[" + i + "] :  " + newArr[i]);
        }

        sc.close();
    }
}