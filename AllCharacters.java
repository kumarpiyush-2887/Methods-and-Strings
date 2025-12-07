/*
Write a Java Program that reads a given string and counts the number of uppercase
letters (A–Z), lowercase letters (a–z), digits (0–9), and special characters 
(any character that is not a letter or digit).
Implement a method with the following header
public static void countCharacters(String str)
It takes a string as input and prints these counts.
*/
import java.util.*;
public class AllCharacters {
   public static void countCharacters(String str){
    int uc=0, lc=0, d=0, sc=0;
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch>='A' && ch<='Z')
            uc++;
        else if(ch>='a' && ch<='z')
            lc++;
        else if(ch>='0' && ch<='9')
            d++;
        else
            sc++;
    }
    System.out.println("Uppercase Letters: "+uc);
    System.out.println("Lowercase Letters: "+lc);
    System.out.println("Digits: "+d);
    System.out.println("Special Characters: "+sc);
   }
   public static void main(String[] args) {
    Scanner gb = new Scanner(System.in);
    System.out.println("Enter a string:");
    String str = gb.nextLine();
    countCharacters(str);
    gb.close();
   }
}
