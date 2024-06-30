//28.  Suppose  you  are  senior  developer  for  an  Relational  Database  Management  System named  "Array  Database"  where  everything  is  implemented  using  only  array,  today your  task  is  to  implement  aggregate  function  like  sum,  min,  max,  avg.  For  simplicity, assume that your database can only store integers.

import java.util.Scanner;

public class AggregateFunction {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array : ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter value of arr[" + i + "] : ");
			arr[i] = sc.nextInt();
		}

		String op;
		while (true) {

			System.out.println("--------------------------------------------------------");
			System.out.println("Enter 1 for sum.");
			System.out.println("Enter 2 for min.");
			System.out.println("Enter 3 for max.");
			System.out.println("Enter 4 for avg.");
			System.out.println("Enter anything else for exit.");
			op = sc.next();
			System.out.println("--------------------------------------------------------");

			switch (op) {
				case "1":
					Array_Database a = new Array_Database(arr);
					System.out.println("Sum = " + a.sum(arr));
					break;
				case "2":
					Array_Database b = new Array_Database(arr);
					System.out.println("Min = " + b.min(arr));
					break;
				case "3":
					Array_Database c = new Array_Database(arr);
					System.out.println("Max = " + c.max(arr));
					break;
				case "4":
					Array_Database d = new Array_Database(arr);
					System.out.println("Avg = " + d.avg(arr));
					break;
				default:
					System.out.println("Exiting...");
					sc.close();
					return;
			}
		}
	}
}

class Array_Database {
	int[] arr;

	public Array_Database(int[] arr) {
		this.arr = arr;
	}

	public int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public int min(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public int max(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public double avg(int[] arr) {
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			avg += arr[i];
		}
		avg /= arr.length;
		return avg;
	}
}