// Design anagram game using array.  
// 1 Allow a user to enter N words and store it in an array.  
// 2 Generate a random number between 0 to N-1.  
// 3 Based on the random number generated display the word stored at that 
//   index of an array and allow user to enter its anagram.  
// 4 Check whether the word entered by the user is an anagram of displayed 
//   number or not and display an appropriate message.  
// 5 Given a word A and word B. B is said to be an anagram of A if and 
//only if the characters present in B is same as characters present in A, 
//irrespective of their sequence. For ex: “LISTEN” == “SILENT”.

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total number of words : ");
		int n = sc.nextInt();

		String[] words = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter value of word[" + i + "] : ");
			words[i] = sc.next();
		}

		int idx = (int) (Math.random() * (n));
		System.out.print("Enter anagram of word " + words[idx] + " : ");
		String word = sc.next();
		isAnagram(words[idx], word);

		sc.close();
	}

	public static void isAnagram(String a, String b) {

		if (a.length() == b.length()) {
			char[] c = new char[a.length()];
			char[] d = new char[b.length()];

			for (int i = 0; i < a.length(); i++) {
				c[i] = a.charAt(i);
				d[i] = b.charAt(i);
			}

			Arrays.sort(c);
			Arrays.sort(d);

			if (Arrays.equals(c, d)) {
				System.out.println("Is Anagram");
			} else {
				System.out.println("Not an Anagram");
			}

		} else {
			System.out.println("Not an Anagram");
		}
	}
}