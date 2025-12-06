/*
An Armstrong number (also known as a Narcissistic number) is a number that is
equal to the sum of its digits, with each digit raised to the power of the total 
number of digits in the number.
Example:
• 153 is an Armstrong number because: 1³ + 5³ + 3³ = 153
• 9474 is an Armstrong number because: 9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474
Write a Java program that identifies and displays all Armstrong numbers between
100 and 10,000. Also display its count.
Implement and use the following three methods:
public static int countDigits(int n)
returns number of digits
public static int power(int a, int b) –
returns 𝑎𝑏
public static boolean isArmstrong(int n) –
checks if a number is Armstrong
*/
public class Armstrong_using_methods{
    public static int countDigits(int n){
        int c = 0;
        for(int i=n;i!=0;i/=10)
            c++;
        return c;
    }
    public static int power(int a, int b){
        return (int)(Math.pow(a,b));
    }
    public static boolean isArmstrong(int n){
        int nod = countDigits(n);
        int sum = 0;
        for(int i=n;i!=0;i/=10){
            int dig = i%10;
            sum = sum+power(dig,nod);
        }
        if(n==sum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 100 to 10000 are:3");
        int total = 0;
        for(int i=100;i<=10000;i++){
            boolean res = isArmstrong(i);
            if(res){
                System.out.println(i);
                total++;
            }
        }


        System.out.println("Total armstrong number found: "+total);
    }
}