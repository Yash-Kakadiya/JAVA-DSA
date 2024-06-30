//27. WAP  to  replace  lowercase  characters  by  uppercase  &  vice-versa  in  a  user  specified string.

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String res = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {

                res += (str.charAt(i) + "").toLowerCase();

            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {

                res += (str.charAt(i) + "").toUpperCase();

            } else {

                res += str.charAt(i) + "";

            }
        }

        str = res;
        System.out.println("Toggled string : " + str);
        sc.close();
    }
}
