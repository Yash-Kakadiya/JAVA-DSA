//24. Write a program to delete a number from an array that is already sorted in an ascending order.

import java.util.Scanner;

public class DeleteInSorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 4, 5, 6 };

        System.out.println("Old array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array[" + i + "] :  " + arr[i]);
        }
        System.out.println("--------------------------------");

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int newArr[] = new int[arr.length - 1];
        int idx = -1;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                idx = i;
                break;
            } else if (i == arr.length - 1) {
                System.out.println("Given number is not in array !");
                sc.close();
                return;
            }
        }

        for (int i = 0; i < idx; i++) {
            newArr[j] = arr[i];
            j++;
        }

        for (int i = idx + 1; i < arr.length; i++) {
            newArr[j] = arr[i];
            j++;
        }

        System.out.println("-------------------------------");
        System.out.println("New array after deleting " + num + " :");
        for (int i = 0; i < newArr.length; i++) {
            System.out.println("New array[" + i + "] :  " + newArr[i]);
        }

        sc.close();
    }

}
