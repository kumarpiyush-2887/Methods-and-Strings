/*Write a method that finds the number of occurrences of a specified character in a string
 using the following header:
public static int count(String str, char a)

For example, count ("Welcome", 'e') returns 2.
Write a java program that prompts the user to enter a string followed by a character and
displays the number of occurrences of the character in the string. */
import java.util.*;
public class CountCharacterInString {
    public static int count(String str, char a){
        int l = str.length();
        int sum = 0;
        for(int i=0;i<l;i++){
            char ch = str.charAt(i);
            if(ch==a)
                sum++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = gb.nextLine();
        System.out.println("Enter a character to search for in string: "+str);
        char ch = gb.next().charAt(0);
        int number = count(str, ch);
        System.out.println("Number of times "+ch+" occurs in "+str+" is: "+number);
        gb.close();
    }
    
}
