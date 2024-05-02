/*Write an application that searches through its command-line 
    argument. If an argument is found that does not begin with and 
    upper case letter, display error message and terminate. */

public class UpperCase {

    public static void main(String[] args) {

        // String str = args[0];
        char ch = args[0].charAt(0);

        System.out.println("-----------------------------------------------------------");
        if (!(ch >= 'A' && ch <= 'Z')) {
            System.err.println("Error: '" + ch + "' does not begin with an uppercase letter.");
            return;
        } else {
            System.out.println("Sucessfully found the upper case letter at begining('" + ch + "') ");
        }
    }
}
