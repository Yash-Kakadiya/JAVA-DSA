/*Write a program that creates and initializes a four integer 
    element array. Calculate and display the average of its values. */

public class AverageOfArray {

    public static void main(String[] args) {

        int[] arr = { 5, 10, 15, 20 };

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = sum / arr.length;

        System.out.println("Average is: " + average);
    }
}
