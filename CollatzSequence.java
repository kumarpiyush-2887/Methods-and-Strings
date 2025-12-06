/*The Collatz sequence is defined using the following rules for any positive integer n:
• If n is even, replace n with n / 2
• If n is odd, replace n with 3n + 1
• Continue repeating this process until the value of n becomes 1
The number of steps required to reach 1 is called the Collatz length.
Write a Java method with the following header:
public static int collatzLength(int n)
The method should:
• Accept a positive integer n
• Apply the Collatz rules repeatedly
• Count how many steps it takes for n to reach 1
• Return this count 
*/
import java.util.*;
public class CollatzSequence {
    public static int collatzLength(int n){
        int c = 0;
        while(n!=1){
            if(n%2==0)
                n=n/2;
            else
                n = 3*n+1;
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = gb.nextInt();
        System.out.println("Collatz Length: "+collatzLength(num));
        gb.close();
    }
}
