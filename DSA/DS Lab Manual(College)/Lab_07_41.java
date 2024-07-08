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

public class Lab_07_41 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("How many cases you want to check ? : ");
      int n = sc.nextInt();
      sc.nextLine();

      boolean valid = false;

      for (int i = 0; i < n; i++) {
         System.out.print("Enter string for case " + n + " : ");
         String str = sc.nextLine();

         if (str.length() % 2 != 0) {
            valid=false;
         }else{
            valid = isValid(str);
         }

         if (valid) {
            System.out.println("1 : Valid");
         } else {
            System.out.println("1 : Invalid");
         }
      }
      sc.close();
   }


   public static boolean isValid(String str) {
      Stack s = new Stack(str.length());
      for (int i = 0; i < str.length(); i++) {
         
         if(("[({".indexOf(str.charAt(i)))!=-1){  //[{(
            s.push(str.charAt(i));
         }
         else if (str.charAt(i) == ']' || str.charAt(i) == '}' || str.charAt(i) == ')') {
            if (s.peek() == '[' && str.charAt(i) == ']' || s.peek() == '{' && str.charAt(i) == '}'
                  || s.peek() == '(' && str.charAt(i) == ')') {
               s.pop();
            } else {
               return false;
            }
         }
      }
      return true;
   }
}


class Stack {
   int top = -1;
   int n;
   char[] S;

   public Stack(int n) {
      this.n = n;
      S = new char[n];
   }

   public void push(char x) {
      if (top >= n - 1) {
         System.out.println("-----------------------------------------");
         System.out.println("Stack overflow");
         System.out.println("-----------------------------------------");
         return;
      }
      S[++top] = x;
      return;
   }

   public char pop() {
      if (top < 0) {
         System.out.println("-----------------------------------------");
         System.out.println("Stack Underflow");
         System.out.println("-----------------------------------------");
         return '\0';
      }
      return S[top--];
   }

   public char peek() {
      if (top < 0) {
         System.out.println("-----------------------------------------");
         System.out.println("Stack underflow");
         System.out.println("-----------------------------------------");
         return '\0';
      }
      return S[top];
   }

   public void display() {
      for (int i = top; i >= 0; i--) {
         System.out.println(S[i]);
      }
   }

}
