/*
Understand and use the following basic String methods such as: length(), charAt(),
toUpperCase(), toLowerCase(), contains(), startsWith(), endsWith(), trim(), replace(),
substring() for the following questions:
• Display the length of the string.
• Display the first and last character of the string.
• Convert the string to uppercase and display it.
• Convert the string to lowercase and display it.
• Check if the string contains the word "Java" and display the result.
• Check if the string starts with "Hello" and display the result.
• Check if the string ends with "World" and display the result.
• Trim leading and trailing spaces and display the trimmed string.
• Replace all occurrences of 'a' with '@' and display the result.
• Extract a substring starting from the 3rd character to the 7th character
(inclusive) and display it.
*/
import java.util.*;
public class BasicStrings {
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = gb.nextLine();
        int l = str.length();
        System.out.println("Length of the string: "+l);
        System.out.println("First character: "+str.charAt(0));
        System.out.println("Last Character: "+str.charAt(l-1));
        System.out.println("In lower case: "+str.toLowerCase());
        System.out.println("In Upper case: "+str.toUpperCase());
        boolean res1 = str.contains("Java");
        boolean res2 = str.startsWith("Hello");
        boolean res3 = str.endsWith("World");
        System.out.println("Does the string contains \"Java\"? "+res1);
        System.out.println("Does the string starts with \"Hello\"? "+res2);
        System.out.println("Does the string ends with \"World\"? "+res3);
        System.out.println("Trimmed String: "+str.trim());
        String newStr = str.replace('a','@');
        System.out.println("String after replacing 'a' with '@': "+newStr);
        String subStr = str.substring(2,7);
        System.out.println("Substring from 3rd character to 7th character: "+subStr);
        gb.close();
    }
}
