/*
Write a Java Program that checks whether a given string is a palindrome.
The program should include a method with the following header:
public static boolean isPalindrome(String str)
• The method should take a string as input and return true if the string is a
palindrome, and false otherwise.
• A palindrome is a string that reads the same backward as forward (e.g.,
"madam" or "level").
The program should prompt the user to enter a string and then display whether the
string is a palindrome or not.
Example:
• Input: "madam" → Output: "madam is a palindrome"
• Input: "java" → Output: "java is not a palindrome"
*/
import java.util.*;
public class PalindromeString {
    public static boolean isPalindrome(String str){
        String rev="";
        for(int i=0;i<str.length();i++){
            rev = str.charAt(i)+rev;
        }
        if(str.equals(rev))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a string.");
        String str = gb.nextLine();
        boolean res = isPalindrome(str);
        if(res)
            System.out.println(str+" is a palindrome.");
        else
            System.out.println(str+" is not a palindrome.");
        gb.close();
    }
}
