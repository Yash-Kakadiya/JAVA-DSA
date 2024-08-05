//Lab-07 -> 42 Alternate : LeetCode : 2390
// Link : https://leetcode.com/problems/removing-stars-from-a-string

import java.util.Stack;

public class LeetCode2390 {

    public static String removeStars(String s) {
        Stack<Character> stk=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                stk.pop();
            }else{
                stk.push(s.charAt(i));
            }
        }
        StringBuffer output=new StringBuffer();
        while(stk.size()>0){
            output.append(stk.pop());
        }
        return output.reverse().toString();
    }

    public static void main(String[] args) {
        String s="Yay*sh*h";

        String ans=removeStars(s);

        System.out.println("Output : "+ans);
    }
}
