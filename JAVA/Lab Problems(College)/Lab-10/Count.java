/* Write a program that counts number of characters, words, and lines in a file.
    Use exceptions to check whether the file that is read exists or not. */

import java.io.*;

public class Count {

    public static void main(String[] args) {

        String filename = "abc.txt";
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;
            String line = bufferedReader.readLine();

            while (line != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
                line = bufferedReader.readLine();
            }

            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);

            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found !" + filename);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
