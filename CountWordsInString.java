/*Write a Java method to count all words in a string.
Example:
Input the string:
The quick brown fox jumps over the lazy dog.
Expected Output:
Number of words in the string: 9 */
import java.util.*;
public class CountWordsInString {
    public static int countWords(String str){
        int c = 0;
        boolean inWord = false;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=32){
                if(!inWord){
                    c++;
                    inWord = true;
                }
            }
            else{
                inWord = false;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Input the string:");
        String str = gb.nextLine();
        int noOfWord = countWords(str);
        System.out.println("Number of words in the string is: "+noOfWord);
        gb.close();
    }
}
