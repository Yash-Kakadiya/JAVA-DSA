/* Write a method for computing xy doing repetitive multiplication. X 
    and y are of type integer and are to be given as command line 
    arguments. Raise and handle exception(s) for invalid values of x 
    and y. */

public class XPowerY {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Use for calculating x^y ");
            return;
        }

        try {
            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);

            double ans = Math.pow(x, y);

            System.out.println(x + "^" + y + " = " + ans);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numerical values for x and y.");
        }
    }
}