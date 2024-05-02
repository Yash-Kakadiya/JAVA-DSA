/*
 * Write a program that merges a two files into single file.
 */

import java.io.*;

public class Merge {
    public static void main(String[] args) {
        String inputFile1 = "file1.txt";
        String inputFile2 = "file2.txt";
        String outputFile = "mergedFile.txt";

        mergeFiles(inputFile1, inputFile2, outputFile);

        System.out.println("Files merged successfully!");
    }

    public static void mergeFiles(String inputFile1, String inputFile2, String outputFile) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
                BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
