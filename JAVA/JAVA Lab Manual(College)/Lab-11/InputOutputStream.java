/* Refine  the  student  manager  program  to  manipulate  the  student 
    information from files by using the DataInputStream and 
    DataOutputStream. Assume suitable data. */

import java.io.*;

public class InputOutputStream {

    public static void main(String[] args) {
        String filename = "xyz.dat";// extension must be .dat for Data input/output stream
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
            dos.writeUTF("Yash");
            dos.writeInt(19);
            dos.writeUTF("Ronit");
            dos.writeInt(20);
            dos.writeUTF("Mihir");
            dos.writeInt(21);
            System.out.println("Data Written Successfully");
            dos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(filename));
            while (dis.available() > 0) {
                String name = dis.readUTF();
                int age = dis.readInt();
                Student student = new Student(name, age);
                System.out.println(student);
            }
            dis.close();
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