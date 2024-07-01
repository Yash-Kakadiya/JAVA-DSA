import java.util.*;

public class Strings {
    public static void printLetters(String str){
            for(int i=0;i<str.length();i++){
                System.out.print(str.charAt(i)+" ");
            }
            System.out.println();
        }
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
                int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not Palindrome
                return false;
            }
        }
        return true;
    }
    public static String substring(String str, int si, int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr= substr+ str.charAt(i);
        }
        return substr;
    }
    public static String toUpperCase(String str){
        StringBuilder sb= new StringBuilder("");

        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=0;i<str.length();i++){
            if (str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String compress(String str){
        StringBuilder sb= new StringBuilder("");

        for(int i=0;i<str.length();i++){
            Integer count =1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count>1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        char arr[]={'a','b','c','d'};
        String str ="abcd";
        String str2 = new String("xyz@#1234");

    // // Strings are IMMUTABLE but StringBuilder is MUTABLE

        // Scanner sc = new Scanner(System.in);

        // String name;
        // System.out.println("Enter Name : ");
        // name = sc.nextLine();
        // System.out.println(name);
        // System.out.println("---------------------------------------------");
    // //String Length;
        // String fullName="Tony Stark";
        // System.out.println(fullName.length());

    //Concatenation
        String firstName = "Yash";
        String lastName = "Kakadiya";
        String fullName = firstName +" " + lastName;
        System.out.println(fullName);
        System.out.println("---------------------------------------------");

    //charAt (character at particular index)
        System.out.println(fullName.charAt(2));
        printLetters(fullName);
        System.out.println("---------------------------------------------");

    //Palindeome String
            String str3="noon";
            System.out.println(isPalindrome(str3)); 

            String s1="Tony";
            String s2="Tony";
            String s3= new String("Tony");
            System.out.println("---------------------------------------------");

    //Comparision using ==
        if(s1==s2){
            System.out.println("Strings Are Equal");
        }
        else{
            System.out.println("Strings Are Not Equal");
        }
        if (s1==s3) {
            System.out.println("Strings Are Equal");
        }
        else{
            System.out.println("Strings Are Not Equal");
        }    
        System.out.println("---------------------------------------------");

    //Comparision using equal method
            if (s1.equals(s2)) {
                System.out.println("Strings Are Equal");
            }
            else{
                System.out.println("Strings Are Not Equal");
            }
            if (s1.equals(s3)) {
                System.out.println("Strings Are Equal");
            }
            else{
                System.out.println("Strings Are Not Equal");
        }
        System.out.println("---------------------------------------------");

    //substring
        String s="HelloWorld";
        //using user defined method
        System.out.println(substring(s, 0, 5));

        //using predefined method
        System.out.println(s.substring(0, 5));
        System.out.println("---------------------------------------------");

    //compareTo and compareToIgnoreCase method 
        String fruits[]={"apple","mango","banana"};

        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if (largest.compareTo(fruits[i])<0) {
                largest=fruits[i];
            }
        }
        System.out.println(largest);
        System.out.println("---------------------------------------------");

    //StringBuilder (MUTABLE)
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }//abcdefghijklmnopqrstuvwxyz
        
        System.out.println(sb);
        System.out.println("---------------------------------------------");
    
    //uppercase, lowercase
    System.out.println(s.toUpperCase());
    System.out.println(s.toLowerCase());
    System.out.println("---------------------------------------------");

    // Que: covert first letter of every word to uppercase
        String st = "hi, i am yash";
        System.out.println(toUpperCase(st));
        System.out.println("---------------------------------------------");

    // Que: String Compression  e.g.:"aaabbcccdd" -> "a3b2c3d2"
        String scom="aaabbcccdd";
        System.out.println(compress(scom));
        System.out.println("---------------------------------------------");
    }
}