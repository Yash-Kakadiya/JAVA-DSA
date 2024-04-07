/*Write a program of writing binary file using multithreading. 
    Demonstrate use of join() and yield() interrupt(). */

import java.io.FileOutputStream;
import java.io.IOException;

class FileWriterThread extends Thread {
    private FileOutputStream fileOutputStream;
    private byte[] data;

    public FileWriterThread(FileOutputStream fileOutputStream, byte[] data) {
        this.fileOutputStream = fileOutputStream;
        this.data = data;
    }

    @Override
    public void run() {
        try {
            fileOutputStream.write(data);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

public class BinaryFile {

    public static void main(String[] args) {
        String fileName = "binaryfile.bin";
        int fileSize = 10000; // File size in bytes
        int numThreads = 4; // Number of threads to write the file

        byte[] data = generateData(fileSize / numThreads);

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            Thread[] threads = new Thread[numThreads];

            // Create and start threads
            for (int i = 0; i < numThreads; i++) {
                threads[i] = new FileWriterThread(fileOutputStream, data);
                threads[i].start();
            }

            // Demonstrate the use of join() and yield()
            for (Thread thread : threads) {
                thread.join(); // Wait for threads to finish
                thread.yield(); // Give up the CPU to other threads
            }

            System.out.println("Binary file written successfully.");
        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Generates data of specified size
    private static byte[] generateData(int size) {
        byte[] data = new byte[size];
        for (int i = 0; i < size; i++) {
            data[i] = (byte) (Math.random() * 256); // Random byte value between 0 and 255
        }
        return data;
    }
}