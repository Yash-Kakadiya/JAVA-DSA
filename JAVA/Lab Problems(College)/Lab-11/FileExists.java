/*Write a program to check that whether the name given from command 
    line is file or not? If it is a file then print the size of file 
    and if it is directory then it should display the name of all 
    files in it.  */

import java.io.*;

public class FileExists {

    public static void main(String[] args) {
        String fileName = args[0];
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File or directory not found.");
            return;
        }

        if (file.isFile()) {
            System.out.println("File Size: " + file.length());
        }else{

            File[] files = file.listFiles();

            if (files != null) {
                for (File f : files) {
                    System.out.println(f.getName());
                }
            }

        }
    }
}