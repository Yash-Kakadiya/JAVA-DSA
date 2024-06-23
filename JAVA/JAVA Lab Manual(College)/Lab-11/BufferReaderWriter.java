/*Refine the student manager program to manipulate the student 
    information from files by using the BufferedReader and 
    BufferedWriter. */

import java.io.*;

public class BufferReaderWriter {

    public static void main(String[] args) {
        String filename = "abc.txt";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

            bw.write("Yash,19\n");
            bw.write("Ronit,20\n");
            bw.write("Mihir,21\n");
            bw.close();
            System.out.println("Data Written Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                String name_age[] = line.split(",");
                String name = name_age[0];
                int age = Integer.parseInt(name_age[1]);
                Student st = new Student(name, age);
                System.out.println(st);
            }
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name : " + name + " , Age : " + age;
    }
}