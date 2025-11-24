/*Write a Java method to display the middle character of a string.
Note:
a) If the length of the string is odd there will be one middle characters.
b) If the length of the string is even, then there would be two middle characters, we need
to print the second middle character.
Example:
Input a string: ABC
Expected Output:
The middle character in the string: B
Example:
Input a string: JAVA
Expected Output:
The middle character in the string: V     */
import java.util.*;
public class MiddleTerm {
    public static void showMiddleTerm(String str){
        int l = str.length();
        int mt=l/2 + 1;
        System.out.println("Middle term of "+str+" is: "+str.charAt(mt-1));
        return;
    }
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = gb.nextLine();
        showMiddleTerm(str);
        gb.close();
    }
}
