/* Create a class which ask the user to enter a sentence, and it should 
    display count of each vowel type in the sentence. The program should 
    continue till user enters a word “quit”. Display the total count of 
    each vowel for all sentences. */

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        System.out.println("Enter a sentence (type 'quit' to exit): ");

        while (true) {
            String sentence = sc.nextLine().toLowerCase();

            if (sentence.equals("quit")) {
                break;
            }

            int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;

            for (int j = 0; j < sentence.length(); j++) {
                char ch = sentence.charAt(j);
                if (ch == 'a') {
                    aCount++;
                } else if (ch == 'e') {
                    eCount++;
                } else if (ch == 'i') {
                    iCount++;
                } else if (ch == 'o') {
                    oCount++;
                } else if (ch == 'u') {
                    uCount++;
                }
            }

            a += aCount;
            e += eCount;
            i += iCount;
            o += oCount;
            u += uCount;

            System.out.println("------------------------------------------------");
            System.out.println("Counts for this sentence:");
            System.out.println(
                    "A: " + aCount + ", E: " + eCount + ", I: " + iCount + ", O: " + oCount + ", U: " + uCount);
            System.out.println("------------------------------------------------");
            System.out.println("Enter another sentence (type 'quit' to exit):");
        }

        System.out.println("------------------------------------------------");
        System.out.println("Total counts for all sentences:");
        System.out.println("A: " + a + ", E: " + e + ", I: " + i + ", O: " + o + ", U: " + u);
    }
}
