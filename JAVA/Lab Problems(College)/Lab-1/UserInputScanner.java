// Taking user input through Scanner class.

import java.util.Scanner;

public class UserInputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("-----------------------");
        System.out.println("Hello, " + name + "!");
    }
}
