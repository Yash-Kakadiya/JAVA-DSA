/*Write a program to replace all “word1” by “word2” from a file1, 
    and output is written to file2 file and display the no. of 
    replacement. */

import java.io.*;

public class Replace {

    public static void main(String[] args) {

        String word = "Yash";
        String replace = "Yash Kakadiya";

        int replacements = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("file1.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("file2.txt"));

            String line = reader.readLine();
            while (line != null) {
                int index = line.indexOf(word);
                while (index != -1) {
                    replacements++;
                    index = line.indexOf(word, index + word.length());
                }
                line = line.replace(word, replace);
                writer.write(line + "\n");
                line = reader.readLine();
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException fne) {
            System.out.println("File not found !");
            fne.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of replacements: " + replacements);
    }
}
