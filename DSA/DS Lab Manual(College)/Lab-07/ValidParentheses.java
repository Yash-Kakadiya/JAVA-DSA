/*
 * 41. Chef has a string which contains only the characters '{', '}', '[', ']', '(' and ')'. Now 
   Chef wants to know if the given string is balanced or not. If is balanced then 
   print 1, otherwise print 0. 
       A balanced parenthesis string is defined as follows: 
      o The empty string is balanced 
      o If P is balanced then (P), {P}, [P] is also balanced 
      o if P and Q are balanced PQ is also balanced 
      o "([])", "({})[()]" are balanced parenthesis strings  
      o "([{]})", "())" are not balanced. 
       Input: The first line of the input contains a single integer T denoting the 
      number of test cases. The description of T test cases follows. The first 
      and only line of each test case contains a single string 
       Output: For each test case, print a single line containing the answer. 
       Example of Input & Output 
      o Input: 
       Enter No of Test Cases: 4 
       () 
       ([)] 
       ([{}()])[{}] 
       [{{}] 
      o Output 
       1 
       0 
       1 
       0
 */

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
   public static boolean isValid(String str) {
      if (str.length() % 2 != 0)
         return false;

      Stack<Character> s = new Stack<Character>();

      for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);

         if (ch == '(' || ch == '{' || ch == '[') {
            s.push(ch);
         } else {
            if (s.isEmpty()) {
               return false;
            }

            char temp = s.pop();

            if ((temp == '[' && ch != ']')
                  || (temp == '{' && ch != '}')
                  || (temp == '(' && ch != ')')) {
               return false;
            }
         }
      }

      if (s.isEmpty()) {
         return true;
      }
      return false;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("How many cases you want to check ? : ");
      int n = sc.nextInt();
      sc.nextLine();

      for (int i = 1; i <= n; i++) {
         System.out.print("Enter string for case " + i + " : ");
         String str = sc.nextLine();

         if (isValid(str)) {
            System.out.println(i + ": Valid");
         } else {
            System.out.println(i + ": Invalid");
         }
      }
      sc.close();
   }
}