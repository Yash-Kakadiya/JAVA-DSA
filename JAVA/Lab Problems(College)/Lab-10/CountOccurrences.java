/*Write an application that reads a file and counts the number of
   occurrences of digit 7. Supply the file name as a command-line argument.*/

import java.io.*;

public class CountOccurrences {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Enter file name as a command-line argument");
            return;
        }

        String filename = args[0];
        System.out.println("Reading file: " + filename);
        int count = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            int c = reader.read();
            while (c != -1) {
                if (c == '7') {
                    count++;
                }
                c = reader.read();
            }
            reader.close();
            System.out.println("Number of occurrences of digit 7: " + count);
        } catch (FileNotFoundException fne) {
            System.out.println("File not found !");
            fne.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
