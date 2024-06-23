/*
 * Write a java program to create own exception for negative value exception if 
    the user enter negative value
 */

import java.util.Scanner;

class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

public class NegativeEception {
    static void validateInput(int value) throws NegativeValueException {
        if (value < 0) {
            throw new NegativeValueException("Negative value entered!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Value:");
            int userInput = sc.nextInt();

            validateInput(userInput);
            System.out.println("Input is valid: " + userInput);
        } catch (NegativeValueException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
