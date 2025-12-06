/*Two numbers m and n are said to be a friendly pair if the ratio of the sum of their
proper divisors to the number itself is equal.
sumOfDivisors(m) / m = sumOfDivisors(n) / n
Example:
(6, 28) → friendly pair
(30, 140) → friendly pair
(248, 620) → friendly pair
(12, 36) → not a friendly pair
(18, 20) → not a friendly pair
(10, 16) → not a friendly pair
CO6
CO4
CO4
7. 8. Write a method with the header
public static int sumOfDivisors(int n)
It returns the sum of all proper divisors of the number n (excluding the number itself).
Then write another method with the header
public static Boolean isFriendlyPair(int a, int b)
It checks whether the two numbers a and b satisfy the friendly pair condition.
Write a Java program that reads two integers from the user and checks whether they
form a friendly pair or not.
*/
import java.util.*;
public class FriendlyPairs {
    public static int sumOfDivisors(int n){
        int sum = 1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                sum+=i;
        }
        return sum;
    }

    public static boolean isFriendlyPair(int a, int b){
        double ratio1 = a/sumOfDivisors(a);
        double ratio2 = b/sumOfDivisors(b);
        if(ratio1==ratio2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter first number:");
        int x = gb.nextInt();
        System.out.println("Enter second number:");
        int y = gb.nextInt();

        System.out.println("Sum of proper divisors of "+x+" = "+sumOfDivisors(x));
        System.out.println("Sum of proper divisors of "+y+" = "+sumOfDivisors(y));

        boolean res = isFriendlyPair(x, y);
        if(res)
            System.out.println(x+" and "+y+" are a friendly pair.");
        else
            System.out.println(x+" and "+y+" are not a friendly pair.");
        gb.close();
    }
}
