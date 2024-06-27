//20. WAP to sort the N names in an alphabetical order.

import java.util.Arrays;

public class SortByName {

    public static void main(String[] args) {

        String[] arr = { "Ronit", "Yash", "Mihir" };

        System.out.println("Before:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("--------------------------------");

        Arrays.sort(arr);
        System.out.println("After:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}