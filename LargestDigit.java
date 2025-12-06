/*
Write a method that returns the largest digit in a given integer.
Use the following method header:
public static int largestDigit(int n)
The method should:
• Examine each digit of the integer n
CO4
CO4
9. 10. • Use a loop to compare digits
• Return the largest digit in the number
For example:
• largestDigit(4829) → 9
• largestDigit(7031) → 7
• largestDigit(5) → 5
Write a Java Program that prompts the user to enter an integer and then displays the
largest digit in the number.
*/
import java.util.*;
public class LargestDigit {
    public static int largestDigit(int n){
        int ld = 0;
        for(int i=n;i!=0;i/=10){
            int dig = i%10;
            if(dig>ld)
                ld = dig;
        }
        return ld;
    }

    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = gb.nextInt();
        System.out.println("Largest Digit: "+largestDigit(n));
        gb.close();
    }
}
