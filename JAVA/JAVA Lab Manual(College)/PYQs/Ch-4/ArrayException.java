/*
 * Write a java program to create own exception for arrays index to show array is 
    index of bound. (Assume array size is 5 hence its index ranges from 0 to 4 hence 
    for input >=5 and for <0 number it should throw an exception, take an input from 
    user)
 */

import java.util.Scanner;

class ArrayIndexOutOfBoundsException extends Exception {
    public ArrayIndexOutOfBoundsException(String message) {
        super(message);
    }
}

public class ArrayException {
    static void validateIndex(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= 5) {
            throw new ArrayIndexOutOfBoundsException("Array index is out of bounds!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int userInput = sc.nextInt();

            validateIndex(userInput);
            System.out.println("Input is valid: " + userInput);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
