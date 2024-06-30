//25. Write a program to deinte duplicate numbers from an array.

import java.util.Scanner;

public class DeleteDuplicate {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array : ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter value for index " + i + " : ");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;
			}
		}
		arr[j] = arr[n - 1];
		j++;

		System.out.println("--------------------------------------------------------");
		for (int i = 0; i < j; i++) {
			System.out.println("Value of arr[" + i + "] : " + arr[i]);
		}

		sc.close();
	}
}