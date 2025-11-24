/*Write the methods with the following headers
// Return the reversal of an integer. Example: reverse (456), returns 654
public static int reverse(int number)
// Return true if number is a palindrome
public static boolean isPalindrome(int number)
Use the reverse method to implement isPalindrome. A number is a palindrome if its
reversal is the same as itself. Write a java program that prompts the user to 
enter an integer and reports whether the integer is a palindrome. */
import java.util.*;
public class Reverse_and_Palindrome {
    public static int reverse(int number){
        int rev = 0;
        while(number!=0){
            int dig = number%10;
            rev = rev*10+dig;
            number/=10;
        }
        return rev;
    }   

    public static boolean isPalindrome(int number){
        int revNo = reverse(number);
        if(number==revNo)
            return true;
        else
            return false;
    } 

    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = gb.nextInt();
        boolean res = isPalindrome(n);
        if(res==true)
            System.out.println(n+" is palindrome.");
        else
            System.out.println(n+" is not palindrome.");
        gb.close();
    }
}
