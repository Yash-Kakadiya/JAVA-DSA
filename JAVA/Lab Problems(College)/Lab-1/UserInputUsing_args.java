// Taking user input through Command Line Argument.

public class UserInputUsing_args {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("You entered:");

            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }

        } else {
            System.out.println("Please provide some arguments.");
        }
    }
}