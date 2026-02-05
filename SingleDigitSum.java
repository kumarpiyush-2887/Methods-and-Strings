/*
Write a java method to calculate the sum of digits of a given number until the number is a
single digit. The method signature is as follows.
public static int sum_Of_Digits(int n)
Example:
 Let n = 9294
 Sum = 9 + 2 + 9 + 4 = 24
 Sum = 2 + 4 = 6
Sample Run:
Enter a number 9294
Sum of digits of 9294 until the number is a single digit is 6
*/
import java.util.*;
public class SingleDigitSum {
    public static int sum_Of_Digits(int n){
        while(n>9){
            int sum = 0;
            for(int i=n;i!=0;i/=10){
                sum += i%10;
            }
            n = sum;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = gb.nextInt();
        System.out.println("Sum of digits of "+num+" until the number is single digit is "+sum_Of_Digits(num));
        gb.close();
    }
}
