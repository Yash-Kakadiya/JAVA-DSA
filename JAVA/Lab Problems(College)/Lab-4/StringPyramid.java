/*Write an interactive program to print a string entered in a 
    pyramid form. For instance, the string "stream" has to be 
    displayed as follows: 
 
                         s 
                        s t 
                       s t r 
                      s t r e 
                     s t r e a 
                    s t r e a m 
 */

import java.util.Scanner;

public class StringPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            for (int k = 0; k < str.length() - i - 1; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
