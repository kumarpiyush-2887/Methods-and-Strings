/*
Write a Java Program that converts a given string so that the first letter of every word
becomes uppercase, effectively converting the string to title case.
The program should include a method with the following header:
public static String toTitleCase(String str)
The method should take a string as input and return the converted string where the
first letter of each word is capitalized.
Example:
• Input: "welcome to java"
• Output: "Welcome To Java"
The program should prompt the user to enter a string and then display the converted
title-case string.
*/
import java.util.*;
public class TitleCase {
    public static String toTitleCase(String str){
        str = str.trim();
        String newStr = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(i==0 || str.charAt(i-1)==32){
                if(ch>=97 && ch<=122)
                    ch = (char)(ch-32);
            }
            newStr+=ch;
        }
        return newStr;
    }
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = gb.nextLine();
        System.out.println("Input: "+str);
        System.out.println("Output: "+toTitleCase(str));
        gb.close();
    }
}
