/*
Write a method that counts the number of spaces in a given string using the following
method header:
public static int countSpaces(String str)
The method should return the total number of space characters found in the string.
Write a Java program that prompts the user to enter a string and then displays the
number of spaces in the string
*/
import java.util.*;
public class CountSpaces {
    public static int countSpaces(String str){
        int c = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==32)
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a string.");
        String str = gb.nextLine();
        int spaces = countSpaces(str);
        System.out.println("Number of spaces in the string: "+spaces);
        gb.close();
    }
}
