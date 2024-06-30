//23. Write  a  program  to  insert  a  number  in  an  arr  that  is  already  sorted  in  an ascending order.

import java.util.Scanner;

public class InsertInSorted {
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

        int newArr[] = new int[arr.length + 1];
        int idx = -1;
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < num && arr[i + 1] > num) {
                idx = i + 1;
            } else if (i == arr.length - 2) {
                idx = arr.length;
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            if (i == idx) {
                newArr[i] = num;
                continue;
            }
            newArr[i] = arr[j];
            j++;

        }

        System.out.println("-------------------------------");
        System.out.println("New array :");
        for (int i = 0; i < newArr.length; i++) {
            System.out.println("New array[" + i + "] :  " + newArr[i]);
        }

        sc.close();
    }

}
